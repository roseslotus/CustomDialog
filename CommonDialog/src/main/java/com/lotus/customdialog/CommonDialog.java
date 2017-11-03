package com.lotus.customdialog;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by thl on 2017/10/27.
 */

public abstract class CommonDialog extends CustomDialog implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.style_common_dialog);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = getView();
        initView(root);
        bindData();
        return root;
    }

    @Override
    public void onClick(View v) {
        onClickImpl(v);
    }

    public View getViewByLayoutId(int layoutId){
        View view = LayoutInflater.from(getActivity()).inflate(layoutId, null, false);
        return view;
    }




    public void show(FragmentManager manager) {
        show(manager,"CommonDialog");
    }

    public void onClickImpl(View v){}

    public  abstract View getView();
    public  abstract void initView(View view);
    public  abstract void bindData();

}
