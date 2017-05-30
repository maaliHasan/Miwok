package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {
    public  MediaPlayer mMediaPlayer;
    MediaPlayer.OnCompletionListener mCompletionListener= new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create an array of words
        final ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "one*",R.drawable.number_one,R.raw.number_one));
        words.add(new Word("two", "two*",R.drawable.number_two,R.raw.number_two));
        words.add(new Word("three", "three*",R.drawable.number_three,R.raw.number_three));
        words.add(new Word("four", "four*",R.drawable.number_four,R.raw.number_four));
        words.add(new Word("five", "five*",R.drawable.number_five,R.raw.number_five));
        words.add(new Word("six", "six*",R.drawable.number_six,R.raw.number_six));
        words.add(new Word("seven", "seven*",R.drawable.number_seven,R.raw.number_seven));
        words.add(new Word("eight", "eight*",R.drawable.number_eight,R.raw.number_eight));
        words.add(new Word("nine", "nine*",R.drawable.number_nine,R.raw.number_nine));
        words.add(new Word("ten", "ten*",R.drawable.number_ten,R.raw.number_ten));

        /* the arrayAdapter except list view with one textview  SO we need to create a custom adapter*/

        WordAdapter itemsAdapter = new WordAdapter(this, words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        assert listView != null;
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                releaseMediaPlayer();
                Word currentWord = words.get(position);
                mMediaPlayer= MediaPlayer.create(NumbersActivity.this,currentWord.getmAudioResourceId());
                mMediaPlayer.start();

            }
        });




    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}
