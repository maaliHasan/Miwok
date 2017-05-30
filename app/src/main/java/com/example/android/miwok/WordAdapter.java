package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.util.Config.LOGD;

/**
 * Created by mhasan on 5/28/2017.
 * Custom adapter
 */

class WordAdapter extends android.widget.ArrayAdapter {
    public int mColorResourceId;

    WordAdapter(Activity context, ArrayList<Word> words, int color) {
        super(context, 0, words);
        mColorResourceId = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        final Word currentWord = (Word) getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.deafault_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imgView = (ImageView) listItemView.findViewById(R.id.imgView);
        if (currentWord.hasImageView()) {
            imgView.setImageResource(currentWord.getImgView());
            imgView.setVisibility(View.VISIBLE);
        } else {
            imgView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return listItemView;
    }

}
