package com.meet.letsmeet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.location.places.GeoDataClient;
import com.google.android.gms.location.places.PlaceDetectionClient;
import com.google.android.gms.location.places.Places;

public class ViewPreferenceResults extends AppCompatActivity{

    protected GeoDataClient geoDataClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_map_locations);

        geoDataClient = Places.getGeoDataClient(this, null);
        PlaceDetectionClient placeDetectionClient = Places.getPlaceDetectionClient(this, null);


    }


}


