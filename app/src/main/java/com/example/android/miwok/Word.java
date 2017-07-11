package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok Translation for that word.
 */

public class Word {

    //Default Translation for the word
    private String mDefaultTranslation;

    //Miwok Translation for the word
    private String mMiwokTranslation;
    private int mAudioResourceId;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /*
    create a new Word object

    @param defaultTranslation is the word in the language that the user is already familiar with

    @param miwokTranslation is the word in Miwok language

     */
    public Word(String defaultTranslation, String miwokTranslation, int sound)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = sound;

    }
    /*
    create a new Word object

    @param defaultTranslation is the word in the language that the user is already familiar with

    @param miwokTranslation is the word in Miwok language

    @param image is the drawble resource ID for the image associated with the word
     */
    //Second constructor for phrases activity as it doesn't have any image
    public Word(String defaultTranslation, String miwokTranslation,int image,int sound)
    {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = image;
        mAudioResourceId = sound;
    }

    public String getmDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getmMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getmImageResourceId(){return mImageResourceId;}
    public int getmAudioResourceId(){return mAudioResourceId;}

    /*
    * Returns whether or not there is an image for this word.
    * */
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
