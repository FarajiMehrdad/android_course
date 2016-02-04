package com.approom.mehrdadfaraji.cafeapp.product;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.approom.mehrdadfaraji.cafeapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MehrdadFaraji on 2/2/16.
 */
public class PrductAdapter extends ArrayAdapter {


    ArrayList<Coffee> coffeeList;
    Context context;
    int resoureId;


    public PrductAdapter(Context context, int resource, List objects) {
        super(context, resource, objects);
        this.coffeeList = (ArrayList<Coffee>) objects;
        this.context = context;
        this.resoureId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View rootView = LayoutInflater.from(context).inflate(resoureId, parent, false);

        TextView nameCoffee = (TextView) rootView.findViewById(R.id.textview_product_name);
        ImageView imageCoffe = (ImageView) rootView.findViewById(R.id.imageview_product);

        Coffee coffee = coffeeList.get(position);
        nameCoffee.setText(coffee.name);
        imageCoffe.setImageResource(coffee.imageThumb);

        return rootView;

    }

    @Override
    public int getCount() {
        return coffeeList.size();
    }

}
