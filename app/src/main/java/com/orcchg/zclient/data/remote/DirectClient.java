package com.orcchg.zclient.data.remote;

import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orcchg.zclient.data.model.Customer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;
import timber.log.Timber;

public class DirectClient {

    static final String IP_ADDRESS = "194.190.63.108";
    static final int PORT = 9000;

    private static final String HEADER_CONTENT_LENGTH = "Content-Length";

    private Socket mSocket;

    public DirectClient() {
    }

    public Observable<List<Customer>> getCustomers() throws IOException {
        mSocket = new Socket(IP_ADDRESS, PORT);

        InputStream input = mSocket.getInputStream();
        OutputStream output = mSocket.getOutputStream();

        sendRequest(output, "GET", "/customers/?limit=20&offset=5");
        BufferedReader br = new BufferedReader(new InputStreamReader(input));

        Timber.v("Start response");
        Map<String, String> headers = new HashMap<>();
        String header = null;
        do {
            header = br.readLine();
            String[] tokens = header.split(": ");
            if (tokens.length > 1) {
                Timber.v("%s: %s", tokens[0], tokens[1]);
                headers.put(tokens[0], tokens[1]);
            }
        } while (!TextUtils.isEmpty(header));
        Timber.v("End response");

        List<Customer> customers = new ArrayList<>();
        if (headers.containsKey(HEADER_CONTENT_LENGTH)) {
            int length = Integer.parseInt(headers.get(HEADER_CONTENT_LENGTH));
            String line = null;
            StringBuilder body = new StringBuilder();
            do {
                line = br.readLine();
                body.append(line);
                length -= line.length();
            } while (length > 0 && !TextUtils.isEmpty(line));

            Timber.d("Body: %s", body.toString());

            Gson gson = new Gson();
            Type listType = new TypeToken<ArrayList<Customer>>() {}.getType();
            customers = gson.fromJson(body.toString(), listType);
        }

        input.close();
        output.close();
        mSocket.close();

        return Observable.just(customers);
    }

    private void sendRequest(OutputStream output, String method, String query) throws IOException{
        output.write((method + " " + query + " HTTP/1.1\r\n").getBytes());
        output.write(("Host: " + IP_ADDRESS + ":" + PORT + "\r\n\r\n").getBytes());
    }
}
