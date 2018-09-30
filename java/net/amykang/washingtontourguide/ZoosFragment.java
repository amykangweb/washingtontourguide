package net.amykang.washingtontourguide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ZoosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList();

        places.add(new Place("Woodland Park Zoo", "5500 Phinney Ave N, Seattle, WA 98103"));
        places.add(new Place("Seattle Aquarium", "1483 Alaskan Way, Seattle, WA 98101"));
        places.add(new Place("Point Defiance Zoo & Aquarium", "5400 N Pearl St, Tacoma, WA 98407"));
        places.add(new Place("Northwest Trek Wildlife Park", "11610 Trek Dr E, Eatonville, WA 98328"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
