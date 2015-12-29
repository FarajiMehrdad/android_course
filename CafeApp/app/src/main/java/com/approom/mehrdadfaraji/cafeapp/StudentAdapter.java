package com.approom.mehrdadfaraji.cafeapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by MehrdadFaraji on 12/15/15.
 */
public class StudentAdapter extends BaseAdapter {


    Context context;

    public StudentAdapter(Context context){

        this.context = context;


    }


    String[] studentNameArray = {"faraji","faghihi","mirzaei","salmani",
            "tehrani" ,"mozafari","sharifi","shafiei"};


    @Override
    public int getCount() {
        return studentNameArray.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

            View studentView = LayoutInflater.from(context).
                    inflate(R.layout.item_student_name, viewGroup, false);

            TextView studentNameTextView = (TextView) studentView.
                    findViewById(R.id.student_name_textview);

            studentNameTextView.setText(studentNameArray[position]);


            return studentView;


    }
}
