package com.example.android.visitclarens;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class FeatureAdapter extends ArrayAdapter<Feature> {

    /** Resource ID for the background color for this list of features. */
    public int mColorResourceId;

    /** Create an new {@link FeatureAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param features is the list of {@link Feature}s to be displayed.
     */
    public FeatureAdapter(Activity context, ArrayList<Feature> features, int colorResourceId) {
        super(context, 0, features);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Feature} object located at this position in the list
        Feature currentFeature = getItem(position);

        //Find the ImageView in the list_item.xml layout with the ID image_view.
        ImageView imageView = listItemView.findViewById(R.id.image_view);
        //Get the image for the feature from the current Feature object and
        //set this image on the ImageView.
        imageView.setImageResource(currentFeature.getImageResourceId());

        // Find the TextView in the list_item.xml layout with the ID title_text_view
        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        // Get the title from the current Feature object and
        // set this text on the title TextView
        titleTextView.setText(currentFeature.getFeatureTtile());

        // Find the TextView in the list_item.xml layout with the ID description_text_view
        TextView descriptionTextView = listItemView.findViewById(R.id.description_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        descriptionTextView.setText(currentFeature.getFeatureDescription());

        //Set the theme color for the list item.
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps to.
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container View.
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
