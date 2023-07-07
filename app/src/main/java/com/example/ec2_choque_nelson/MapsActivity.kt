package com.example.ec2_choque_nelson

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(),OnMapReadyCallback {

    private lateinit var map:GoogleMap
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        val mapFragment = supportFragmentManager.findFragmentById(R.id.maps) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(p0: GoogleMap) {
        map = p0


        val peru = LatLng(-9.189967, -75.015152)
        val argentina = LatLng(-9.189967, -75.015152)
        val chile = LatLng(-33.448890, -70.669265)

        map.addMarker(MarkerOptions().position(peru).title("peru"))
        map.addMarker(MarkerOptions().position(argentina).title("Argentina"))
        map.addMarker(MarkerOptions().position(chile).title("chile"))

        val builder = LatLngBounds.Builder()
        builder.include(peru)
        builder.include(argentina)
        builder.include(chile)
        val bounds = builder.build()

        val padding = 100
        val cameraUpdate = CameraUpdateFactory.newLatLngBounds(bounds, padding)
        map.animateCamera(cameraUpdate)
    }


}