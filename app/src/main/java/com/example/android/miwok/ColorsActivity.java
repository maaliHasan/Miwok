package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        ArrayList<Word> words;
        words = new ArrayList<>();
        words.add(new Word("red", "weṭeṭṭi",R.drawable.color_red));
        words.add(new Word("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow));
        words.add(new Word("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow));
        words.add(new Word("green", "chokokki",R.drawable.color_green));
        words.add(new Word("brown", "ṭakaakki",R.drawable.color_brown));
        words.add(new Word("gray", "ṭopoppi",R.drawable.color_gray));
        words.add(new Word("black", "kululli",R.drawable.color_black));
        words.add(new Word("white", "kelelli",R.drawable.color_white));
        /* the arrayAdapter except list view with one textview  SO we need to create a custom adapter*/

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);

        assert listView != null;
        listView.setAdapter(itemsAdapter);
    }
}
