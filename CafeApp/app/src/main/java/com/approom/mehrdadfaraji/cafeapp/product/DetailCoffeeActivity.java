package com.approom.mehrdadfaraji.cafeapp.product;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.approom.mehrdadfaraji.cafeapp.R;

import java.io.IOException;
import java.io.InputStream;

public class DetailCoffeeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_coffee);

        String title = getIntent().getStringExtra(ProductListActivity.COFFEE_NAME);
        String desId = getIntent().getStringExtra(ProductListActivity.DES_RESOURCE_ID);
        int imgId = getIntent().getIntExtra(ProductListActivity.IMG_RESOURCE_ID, 0);

        getSupportActionBar().setTitle(title);
        ImageView productImageView = (ImageView) findViewById(R.id.imageview_product);
        TextView desTextView = (TextView) findViewById(R.id.textview_des_coffee);

        productImageView.setImageResource(imgId);
        try {
            InputStream textInput = getResources().getAssets().open(desId);
            int size = textInput.available();
            byte[] buffer = new byte[size];
            textInput.read(buffer);
            textInput.close();
            String text = new String(buffer);
            desTextView.setText(text);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
