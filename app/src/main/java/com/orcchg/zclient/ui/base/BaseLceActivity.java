package com.orcchg.zclient.ui.base;

import android.view.View;
import android.widget.Button;

import com.orcchg.zclient.R;

import butterknife.Bind;

public abstract class BaseLceActivity<P extends Presenter> extends BaseActivity<P> {

    @Bind(R.id.loading_view) protected View mLoadingView;
    @Bind(R.id.content_view) protected View mContentView;
    @Bind(R.id.error_view) protected View mErrorView;
    @Bind(R.id.btn_retry) protected Button mErrorButton;

    public void showLoading() {
        mLoadingView.setVisibility(View.VISIBLE);
        mContentView.setVisibility(View.GONE);
        mErrorView.setVisibility(View.GONE);
    }

    public void showContent() {
        mLoadingView.setVisibility(View.GONE);
        mContentView.setVisibility(View.VISIBLE);
        mErrorView.setVisibility(View.GONE);
    }

    public void showError() {
        mLoadingView.setVisibility(View.GONE);
        mContentView.setVisibility(View.GONE);
        mErrorView.setVisibility(View.VISIBLE);
    }
}
