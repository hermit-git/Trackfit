package com.example.trackfit

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections

public class MyNavDirections private constructor() {
  public companion object {
    public fun actionGlobalTrackingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.actionGlobalTrackingFragment)
  }
}
