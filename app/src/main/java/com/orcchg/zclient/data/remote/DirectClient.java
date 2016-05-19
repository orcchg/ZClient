package com.orcchg.zclient.data.remote;

import android.text.TextUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import timber.log.Timber;

public class DirectClient {

    static final String IP_ADDRESS = "194.190.63.108";
    static final int PORT = 9000;

    private Socket mSocket;

    public DirectClient() {
    }

    public void connect() throws IOException {
        mSocket = new Socket(IP_ADDRESS, PORT);
        BufferedReader br = new BufferedReader(new InputStreamReader(mSocket.getInputStream()));

        String line = null;
        do {
            line = br.readLine();
            Timber.v("Line: %s", line);
        } while (!TextUtils.isEmpty(line));
    }

    public void close() throws IOException {
        mSocket.close();
    }
}
