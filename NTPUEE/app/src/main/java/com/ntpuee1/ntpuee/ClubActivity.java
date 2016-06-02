package com.ntpuee1.ntpuee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class ClubActivity extends AppCompatActivity {

    private ArrayList<String> data = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_club);
    }

    public void AddButton(View view) {


         ListView item_list = (ListView)findViewById(R.id.listView) ;
         EditText editText = (EditText)findViewById(R.id.editText) ;

         ArrayAdapter<String> adapter;

        // Add new data

        data.add(editText.getText().toString());

        int layoutId = android.R.layout.simple_list_item_1;
        adapter = new ArrayAdapter<String>(this, layoutId, data);
        item_list.setAdapter(adapter);
        item_list.setSelection(data.size() - 1);

    }

    public void DelButton(View view) {

        if(data.size() == 0)
            return;

        ListView item_list = (ListView)findViewById(R.id.listView) ;
        EditText editText = (EditText)findViewById(R.id.editText) ;

        ArrayAdapter<String> adapter;
        data.remove(data.size() - 1);

        int layoutId = android.R.layout.simple_list_item_1;
        adapter = new ArrayAdapter<String>(this, layoutId, data);
        item_list.setAdapter(adapter);
        item_list.setSelection(data.size() - 1);
    }
}
