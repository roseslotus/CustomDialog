package com.lotus.dialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        findViewById(R.id.share_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShareBottomDialog dialog = new ShareBottomDialog();
                dialog.show(getSupportFragmentManager(),"");
            }
        });
        findViewById(R.id.listview_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomListDialog dialog = new BottomListDialog();
                dialog.show(getSupportFragmentManager(),"");
            }
        });
        findViewById(R.id.input_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditTextDialog dialog = new EditTextDialog();
                dialog.show(getSupportFragmentManager(),"");
            }
        });
        findViewById(R.id.center_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestDialog dialog=TestDialog.newInstance();
                dialog.show(getSupportFragmentManager(),"TestDialog");
            }
        });
    }


//    private void showDialog() {
//        BottomDialog.create(getSupportFragmentManager())
//                .setViewListener(new BottomDialog.ViewListener() {
//                    @Override
//                    public void bindView(View v) {
//                        initView(v);
//                    }
//                })
//                .setLayoutRes(R.layout.dialog_layout)
//                .setDimAmount(0.9f)
//                .setTag("BottomDialog")
//                .show();
//    }

}
