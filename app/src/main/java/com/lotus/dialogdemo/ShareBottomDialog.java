package com.lotus.dialogdemo;

import android.view.View;

import com.lotus.customdialog.BaseBottomDialog;

/**
 * Created by thl on 2017/11/3.
 */

public class ShareBottomDialog extends BaseBottomDialog {

    @Override
    public int getLayoutRes() {
        return R.layout.dialog_layout;
    }

    @Override
    public void bindView(View v) {
        // do any thing you want
    }
}
