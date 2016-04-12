package com.orcchg.zclient.ui.customer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.orcchg.zclient.R;
import com.orcchg.zclient.ui.base.BaseLceActivity;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CustomerListActivity extends BaseLceActivity<CustomerListPresenter> implements CustomerListMvpView {

    @Bind(R.id.toolbar) Toolbar mToolbar;
    @Bind(R.id.rl_toolbar_dropshadow) View mDropshadowView;
    @Bind(R.id.rv_customers_list) RecyclerView mCustomersList;
    @Bind(R.id.empty_view) View mEmptyView;
    @Bind(R.id.fab) FloatingActionButton mFab;

    @Override
    protected CustomerListPresenter createPresenter() {
        return new CustomerListPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
        initToolbar();
    }

    @Override
    public void showCustomers(boolean isEmpty) {
        showContent();
        if (isEmpty) {
            mEmptyView.setVisibility(View.VISIBLE);
        } else {
            mCustomersList.setVisibility(View.VISIBLE);
        }
    }

    /* Init view */
    // --------------------------------------------------------------------------------------------
    private void initView() {
        setContentView(R.layout.activity_customer_list);
        ButterKnife.bind(this);

        mCustomersList.setLayoutManager(new LinearLayoutManager(this));
        mCustomersList.setAdapter(mPresenter.getAdapter());
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mPresenter.onFabClick();
            }
        });
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
    }

    /* View events */
    // --------------------------------------------------------------------------------------------
    @Override
    public void showLoading() {
        super.showLoading();
        mEmptyView.setVisibility(View.GONE);
        mDropshadowView.setVisibility(View.INVISIBLE);  // don't overlap with progress bar
    }

    @Override
    public void showContent() {
        super.showContent();
        mDropshadowView.setVisibility(View.VISIBLE);
    }

    @Override
    public void showError() {
        super.showError();
        mEmptyView.setVisibility(View.GONE);
        mDropshadowView.setVisibility(View.VISIBLE);
    }
}
