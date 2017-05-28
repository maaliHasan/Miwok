package com.example.android.miwok;

/**
 * Created by mhasan on 5/24/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgResourceId;

    Word(String defaultTranslation, String miwokTranslation,int ImgView) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImgResourceId=ImgView;
    }
    Word(String defaultTranslation, String miwokTranslation) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }
    /*
    * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    /*
    * Get the Miwok translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImgView() {
        return mImgResourceId;
    }
}
