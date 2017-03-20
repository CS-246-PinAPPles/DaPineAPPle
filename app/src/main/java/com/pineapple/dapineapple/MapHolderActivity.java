package com.pineapple.dapineapple;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;

public class MapHolderActivity extends AppCompatActivity implements OnMapReadyCallback{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_holder);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

    }
}
