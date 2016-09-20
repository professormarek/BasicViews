package com.example.marek.basicviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private AdapterView.OnItemClickListener mMessageClickedHandler = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id)
        {
            String data = parent.getItemAtPosition(position).toString();
            Toast.makeText(v.getContext(),data, Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        String[] data = new String[] {"Chicken", "Pizza", "Hambrger"};
        ArrayList<String> list = new ArrayList<String>();
        for(String d : data){
            list.add(d);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list_item, data);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(mMessageClickedHandler);





    }
}
