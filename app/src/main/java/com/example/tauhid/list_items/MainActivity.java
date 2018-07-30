package com.example.tauhid.list_items;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    String countryName[]={"Bangladesh","India","America","Australia","China","New Zealand","Portugle"};
    int imgCountry[]={R.drawable.bd,R.drawable.india,R.drawable.america,R.drawable.australia,R.drawable.china,R.drawable.new_zealand,R.drawable.australia,R.drawable.portugle};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customList=findViewById(R.id.listview);
        CustomAdapter adapter=new CustomAdapter(MainActivity.this,countryName,imgCountry);
        customList.setAdapter(adapter);

    }
}
