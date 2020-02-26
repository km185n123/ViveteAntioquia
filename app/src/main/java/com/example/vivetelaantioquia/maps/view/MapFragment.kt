package com.example.vivetelaantioquia.maps.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.vivetelaantioquia.R
import com.example.vivetelaantioquia.main.viewmodel.MainViewModel
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.SupportMapFragment


class MapFragment : Fragment() , OnMapReadyCallback {
    companion object {

        fun newInstance() = MapFragment()
    }
    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.map_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel =  ViewModelProvider(this).get(MainViewModel::class.java)

        val mapFragment: SupportMapFragment? = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap?) {
        val sydney = LatLng(6.1577827,-75.6169076)
        if (googleMap != null) {
            googleMap.addMarker(
                MarkerOptions().position(sydney)
                    .title("Marker in Sydney")
            )
            googleMap.moveCamera(CameraUpdateFactory.newLatLng(sydney))
            googleMap.setMinZoomPreference(15.0f)
            googleMap.setMaxZoomPreference(14.0f)
        }



    }

}
