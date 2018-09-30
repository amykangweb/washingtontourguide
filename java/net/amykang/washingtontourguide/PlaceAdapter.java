package net.amykang.washingtontourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(@NonNull Context context, ArrayList<Place> placeList) {
        super(context, 0, placeList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.name);

        nameTextView.setText(currentPlace.getName());

        TextView addressTextView = listItemView.findViewById(R.id.address);

        addressTextView.setText(currentPlace.getAddress());

        ImageView imageView = listItemView.findViewById(R.id.list_item_image);

        if(currentPlace.hasImage()) {

            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);

        } else {

            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}