package com.approom.mehrdadfaraji.cafeapp.product;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.approom.mehrdadfaraji.cafeapp.R;

import java.util.ArrayList;

public class ProductListActivity extends AppCompatActivity {


    ArrayList<Coffee> coffeeList;
    public static final String COFFEE_NAME = "COFFEE_NAME";
    public static final String IMG_RESOURCE_ID = "IMG_RESOURCE_ID";
    public static final String DES_RESOURCE_ID = "DES_RESOURCE_ID";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);
        ListView prodcutListView = (ListView) findViewById(R.id.listview_product);
        coffeeList = new ArrayList<>();
        coffeeList.add(new Coffee("قهوه 23", R.drawable.productno23, "qahve.txt", R.drawable.productno23));
        coffeeList.add(new Coffee("قهوه باریستا", R.drawable.productbarista, "barista.txt", R.drawable.productbarista));
        coffeeList.add(new Coffee("قهوه نیرا", R.drawable.productnira, "nira.txt", R.drawable.productnira));
        coffeeList.add(new Coffee("قهوه ترک", R.drawable.producttork, "tork.txt", R.drawable.producttork));
        coffeeList.add(new Coffee("قهوه ترک با هل", R.drawable.producttorkohel, "tork_with_hel.txt", R.drawable.producttorkohel));
        coffeeList.add(new Coffee("هات چاکلت", R.drawable.producthotchocolate, "hot_choc.txt", R.drawable.producthotchocolate));

        PrductAdapter adapter = new PrductAdapter(getApplicationContext(),
                R.layout.product_item, coffeeList);

        prodcutListView.setAdapter(adapter);


        prodcutListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Log.d("ProductActivity", "item clicked");
                Intent intent = new Intent(getApplicationContext(), DetailCoffeeActivity.class);
                intent.putExtra(COFFEE_NAME ,coffeeList.get(position).name);
                intent.putExtra(IMG_RESOURCE_ID, coffeeList.get(position).imageProduct);
                intent.putExtra(DES_RESOURCE_ID, coffeeList.get(position).desId);
                startActivity(intent);
            }
        });

    }


}
