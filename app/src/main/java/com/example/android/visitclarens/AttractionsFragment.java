package com.example.android.visitclarens;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of attractions.
 */
public class AttractionsFragment extends Fragment {


    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.features_list, container, false);

        //Create an array of words.
        final ArrayList<Feature> feature = new ArrayList<>();

        feature.add(new Feature(getString(R.string.basotho_cultural_village),
                getString(R.string.village_description),
                R.drawable.attractions_basotho_cultural_village));
        feature.add(new Feature(getString(R.string.golden_gate_park),
                getString(R.string.golden_gate_description),
                R.drawable.attractions_golden_gate));
        feature.add(new Feature(getString(R.string.monument),
                getString(R.string.monument_description),
                R.drawable.attractions_kruger_monument));
        feature.add(new Feature(getString(R.string.art_galleries),
                getString(R.string.galleries_description),
                R.drawable.attractions_art_galleries));


        // Create an {@link FeatureAdapter}, whose data source is a list of {@link Feature}s. The
        // adapter knows how to create list items for each item in the list.
        FeatureAdapter adapter = new FeatureAdapter(getActivity(), feature, R.color.category_attractions);

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


