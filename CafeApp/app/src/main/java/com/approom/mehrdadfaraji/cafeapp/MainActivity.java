package com.approom.mehrdadfaraji.cafeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView studentListView = (ListView) findViewById(R.id.student_listview);

        StudentAdapter adapter = new StudentAdapter(getApplicationContext());



        studentListView.setAdapter(adapter);





    }
}
