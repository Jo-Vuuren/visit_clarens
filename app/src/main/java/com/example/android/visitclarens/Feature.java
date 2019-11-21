package com.example.android.visitclarens;

/**
 * {@link Feature} represents a feature that the user can view.
 * It contains a title, a brief description, and an image for that feature.
 */
public class Feature {

    /** The title of the feature. */
    private String mFeatureTitle;

    /** The description of the feature. */
    private String mFeatureDescription;

    /** Image resource ID for the feature. */
    private int mImageResourceId;

    /**
     *  Create a new feature object.
     *
     * @param featureTitle is the title of the feature.
     * @param featureDescription is a brief description of the feature.
     * @param imageResourceId is the resource ID for the image associated with this feature.
     */
    public Feature(String featureTitle, String featureDescription, int imageResourceId) {
        mFeatureTitle = featureTitle;
        mFeatureDescription = featureDescription;
        mImageResourceId = imageResourceId;
    }

    /** Get the title of the feature. */
    public String getFeatureTtile() {
        return mFeatureTitle;
    }

    /** Get the description of the feature. */
    public String getFeatureDescription() {
        return mFeatureDescription;
    }

    /**Get the image resource ID of the feature. */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
