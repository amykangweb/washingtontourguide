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

public class ParksFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> places = new ArrayList();

        places.add(new Place("Discovery Park", "3801 Discovery Park Blvd, Seattle, WA 98199"));
        places.add(new Place("Carkeek Park", "950 NW Carkeek Park Rd, Seattle, WA 98177"));
        places.add(new Place("Golden Gardens Park", "8498 Seaview Pl NW, Seattle, WA 98117"));
        places.add(new Place("Olympic National Park", "3002 Mt Angeles Rd, Port Angeles, WA 98362"));

        PlaceAdapter adapter =
                new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
