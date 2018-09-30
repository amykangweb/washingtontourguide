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

public class FoodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList();

        places.add(new Place("Little Tin", "5335 Ballard Ave NW, Seattle, WA 98107"));
        places.add(new Place("El Gaucho", "2505 1st Ave, Seattle, WA 98121"));
        places.add(new Place("Gorgeous George's", "7719 Greenwood Ave N, Seattle, WA 98103"));
        places.add(new Place("Queen Mary Tea Room", "2912 NE 55th St, Seattle, WA 98105"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
