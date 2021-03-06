package com.lzh.compiler.parcelerdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;


import com.lzh.compiler.parceler.annotation.Arg;
import com.lzh.compiler.parcelerdemo.base.BaseActivity;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {
    @Arg
    String password = "112113114";

    /**
     * 用户名
     */
    @NonNull
    @Arg
    String username = "147258369";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @OnClick(R.id.toLogin)
    void onLoginClick () {
        new LoginActivityDispatcher(password).setUsername(username).start(this);
    }

}

