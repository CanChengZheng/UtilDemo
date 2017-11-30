package com.zcc.android.utildemo.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.zcc.android.utildemo.R;
import com.zcc.android.utildemo.util.NetUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void initParms(Bundle parms) {

    }

    @Override
    public int bindLayout() {
        return 0;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void doBusiness(Context mContext) {

    }

    @OnClick({R.id.btn_add_1, R.id.btn_add_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_add_1:
                NetUtils.popDialog2Setting(this);
                break;
            case R.id.btn_add_2:
                break;
        }
    }
}
