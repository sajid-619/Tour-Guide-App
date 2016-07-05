package com.example.android.tourguideapp;


public class Locations {

    //Name of Location
    private String mName;

    //Description of Location
    private int mDescription;

    /** Image resource ID for the location */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Location object.
     *
     * @param name is the location title
     * @param description is the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     */
    public Locations(String name, int description, int imageResourceId) {
        mName = name;
        mDescription = description;
        mImageResourceId = imageResourceId;
    }

    public Locations(String name, int description) {
        mName = name;
        mDescription = description;
    }

    /**
     * Get the name of the location
     */
    public String getName() {
        return mName;
    }

    /**
     * Gets the string value in the TextView.
     */
    public int getDescription() { return mDescription; }

    /**
     * Get the resource image ID
     */
    public int getImageResourceId() { return mImageResourceId; }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
