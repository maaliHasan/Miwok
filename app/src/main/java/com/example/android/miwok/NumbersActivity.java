package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "one*",R.drawable.number_one));
        words.add(new Word("two", "two*",R.drawable.number_two));
        words.add(new Word("three", "three*",R.drawable.number_three));
        words.add(new Word("four", "four*",R.drawable.number_four));
        words.add(new Word("five", "five*",R.drawable.number_five));
        words.add(new Word("six", "six*",R.drawable.number_six));
        words.add(new Word("seven", "seven*",R.drawable.number_seven));
        words.add(new Word("eight", "eight*",R.drawable.number_eight));
        words.add(new Word("nine", "nine*",R.drawable.number_nine));
        words.add(new Word("ten", "ten*",R.drawable.number_ten));

        /* the arrayAdapter except list view with one textview  SO we need to create a custom adapter*/

        WordAdapter itemsAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        assert listView != null;
        listView.setAdapter(itemsAdapter);


    }
}
