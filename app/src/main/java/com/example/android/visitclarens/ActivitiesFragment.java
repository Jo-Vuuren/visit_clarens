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
public class ActivitiesFragment extends Fragment {


    public ActivitiesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.features_list, container, false);

        //Create an array of words.
        final ArrayList<Feature> feature = new ArrayList<>();

        feature.add(new Feature(getString(R.string.ballooning), getString(R.string.ballooning_description),
                R.drawable.activities_baloon));
        feature.add(new Feature(getString(R.string.rafting), getString(R.string.rafting_description),
                R.drawable.activities_river_rafting));
        feature.add(new Feature(getString(R.string.hiking), getString(R.string.hiking_description),
                R.drawable.activities_hiking));

        // Create an {@link FeatureAdapter}, whose data source is a list of {@link Feature}s. The
        // adapter knows how to create list items for each item in the list.
        FeatureAdapter adapter = new FeatureAdapter(getActivity(), feature, R.color.category_activities);

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


