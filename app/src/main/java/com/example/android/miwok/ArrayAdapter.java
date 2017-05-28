package com.example.android.miwok;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by mhasan on 5/28/2017.
 *
 */

public class ArrayAdapter extends android.widget.ArrayAdapter {

    public ArrayAdapter(Activity context, ArrayList<Word> words) {
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
        imgView.setImageResource(currentWord.getImgView());
        return listItemView;
    }
}
