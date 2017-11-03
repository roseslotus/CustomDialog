package com.lotus.dialogdemo;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lotus.customdialog.BaseBottomDialog;

import java.util.List;

/**
 * Created by thl on 2017/11/3.
 */

public class BottomListDialog extends BaseBottomDialog {

    private ListView listView;
    @Override
    public int getLayoutRes() {
        return R.layout.bottom_layout;
    }

    @Override
    public void bindView(View v) {
        listView=(ListView)v.findViewById(R.id.listview);
        String[] array=new String[]{"item-1","item-2","item-3","item-4","item-5","item-6"};
        ArrayAdapter adapter=new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,array);
        listView.setAdapter(adapter);

    }
}
