package com.meet.letsmeet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.places.GeoDataApi;
import com.google.android.gms.location.places.Places;
import com.google.android.gms.maps.GoogleMap;

public class ViewPreferenceResults extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_map_locations);
    }


}


