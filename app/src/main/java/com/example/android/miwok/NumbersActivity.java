package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.io.LineNumberReader;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        int listSize = words.size()-1;
//        for (int i = 0; i < listSize; i++) {
//            TextView word = new TextView(this);
//            word.setText(words.get(i));
//            rootView.addView(word);
//
//        }
        int index=0;
        while(index<=listSize){
            TextView word = new TextView(this);
            word.setText(words.get(index));
            rootView.addView(word);
            index++;


        }


    }
}
