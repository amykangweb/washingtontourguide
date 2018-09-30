package net.amykang.washingtontourguide;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class MuseumsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList();

        places.add(new Place(getString(R.string.mopop_fullname), getString(R.string.mopop_address), R.drawable.mopop));
        places.add(new Place(getString(R.string.lemay_fullname), getString(R.string.lemay_address), R.drawable.lemay));
        places.add(new Place(getString(R.string.mohai_fullname), getString(R.string.mohai_address), R.drawable.mohai));
        places.add(new Place(getString(R.string.living_fullname), getString(R.string.living_address), R.drawable.livingcomputer));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
