package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import static com.example.android.miwok.R.id.imgView;

/**
 * Created by mhasan on 5/28/2017.
 *
 */

public class WordAdapter extends android.widget.ArrayAdapter {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = (Word) getItem(position);
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.deafault_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        TextView miwokTextView=(TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getMiwokTranslation());

        ImageView imgView=(ImageView)listItemView.findViewById(R.id.imgView);
        if(currentWord.hasImageView()){
            imgView.setImageResource(currentWord.getImgView());
            imgView.setVisibility(View.VISIBLE);
        }
        else{
            imgView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
