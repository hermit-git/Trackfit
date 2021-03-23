package com.example.trackfit.ui.run

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.trackfit.R

public class RunFragmentDirections private constructor() {
  public companion object {
    public fun actionRunFragmentToTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_runFragment_to_trackingFragment)
  }
}
