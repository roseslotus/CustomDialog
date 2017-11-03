package com.lotus.dialogdemo;

import android.view.View;

import com.lotus.customdialog.CommonDialog;

/**
 * Created by thl on 2017/11/3.
 */

public class TestDialog extends CommonDialog {


    public static TestDialog newInstance(){
        TestDialog dialog=new TestDialog();
        return dialog;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.test_dailog;
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void bindData() {

    }
}
