package com.example.android.miwok;

/**
 * Created by mhasan on 5/24/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImgResourceId =NO_IMAGE_PROVIDED;
    private  int mAudioResourceId;
    public static final int NO_IMAGE_PROVIDED=-1;

    Word(String defaultTranslation, String miwokTranslation, int ImgView ,int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImgResourceId = ImgView;
        mAudioResourceId= audioId;

    }

    Word(String defaultTranslation, String miwokTranslation,int audioId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId=audioId;
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

    /*
    * return the resource image Id of the word
     */
    public int getImgView() {
        return mImgResourceId;
    }
    /*
    * return whether or not there is an image for this word
     */
    public boolean hasImageView(){
        return mImgResourceId !=NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImgResourceId=" + mImgResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
