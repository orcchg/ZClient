package com.orcchg.zclient.ui.customer;

import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.orcchg.zclient.R;

import java.util.List;

import butterknife.Bind;

public class CustomerListAdapter extends RecyclerView.Adapter<CustomerListAdapter.ViewHolder> {

    private final List<CustomerVO> mCustomers;

    public CustomerListAdapter(List<CustomerVO> customers) {
        mCustomers = customers;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.tv_customer_title) TextView mTitleView;
        @Bind(R.id.tv_customer_description) TextView mDescriptionView;

        public ViewHolder(View view) {
            super(view);
        }
    }

    @Override
    public CustomerListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item_customer, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CustomerListAdapter.ViewHolder holder, int position) {
        CustomerVO item = mCustomers.get(position);
        holder.mTitleView.setText(item.getFirstName() + " " + item.getLastName());
        holder.mDescriptionView.setText(item.getEmail());
    }

    @Override
    public int getItemCount() {
        return mCustomers.size();
    }
}
