package com.example.trackfit.ui.track

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.setContentView
import com.example.trackfit.R
import com.example.trackfit.databinding.FragmentTrackingBinding
import com.google.android.gms.maps.GoogleMap


class TrackingFragment : Fragment(R.layout.fragment_tracking) {

    private lateinit var binding:FragmentTrackingBinding
    private var map:GoogleMap? = null



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTrackingBinding.bind(view)

        binding.mapView.onCreate(savedInstanceState)

        binding.mapView.getMapAsync {
            map = it
        }



    }

    override fun onPause() {
        super.onPause()
//        binding.mapView?.onPause()
        binding?.let { binding.mapView.onPause() }
    }

    override fun onLowMemory() {
        super.onLowMemory()
        binding?.let { binding.mapView.onLowMemory() }
    }

    override fun onStart() {
        super.onStart()
        binding?.let { binding.mapView.onStart() }
    }

    override fun onStop() {
        super.onStop()
        binding?.let { binding.mapView.onStop() }
    }

    override fun onResume() {
        super.onResume()
        binding?.let { binding.mapView.onResume() }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        binding?.let { binding.mapView.onSaveInstanceState(outState) }
    }
}