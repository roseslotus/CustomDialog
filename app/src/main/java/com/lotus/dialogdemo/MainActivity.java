package com.lotus.dialogdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTestDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTestDialog = (TextView) findViewById(R.id.test_dialog);

        mTestDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TestDialog dialog=TestDialog.newInstance();
                dialog.show(getSupportFragmentManager(),"TestDialog");
            }
        });
    }
}
