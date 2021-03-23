package com.example.trackfit.ui.track

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.trackfit.R

public class TrackingFragmentDirections private constructor() {
  public companion object {
    public fun actionTrackingFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_trackingFragment_to_runFragment)
  }
}
