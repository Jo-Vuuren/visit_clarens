package com.example.android.visitclarens;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.features_list, container, false);

        //Create an array of words.
        final ArrayList<Feature> feature = new ArrayList<>();

        feature.add(new Feature(getString(R.string.roter_hahn), getString(R.string.roter_hahn_description),
                R.drawable.restaurants_roter_hahn));
        feature.add(new Feature(getString(R.string.artist_cafe), getString(R.string.cafe_description),
                R.drawable.restaurants_artists_cafe));

        // Create an {@link FeatureAdapter}, whose data source is a list of {@link Feature}s. The
        // adapter knows how to create list items for each item in the list.
        FeatureAdapter adapter = new FeatureAdapter(getActivity(), feature, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // features_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link FeatureAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Feature} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }


}


