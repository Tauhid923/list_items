package com.example.tauhid.list_items;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    String countryList[];
    int imgCountry[];
    LayoutInflater inflater;

    public CustomAdapter(Context context, String countryList[],int imgCountry[]){
        this.countryList=countryList;
        this.imgCountry=imgCountry;
        inflater=(LayoutInflater.from(context));

    }
    @Override
    public int getCount() {
        return countryList.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.list_items, viewGroup,false);
        ImageView imageview=view.findViewById(R.id.img_country);
        TextView txtName=view.findViewById(R.id.txt_name);

        imageview.setImageResource(imgCountry[position]);
        txtName.setText(countryList[position]);
        return null;
    }
}
