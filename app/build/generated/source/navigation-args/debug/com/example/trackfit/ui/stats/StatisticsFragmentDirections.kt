package com.example.trackfit.ui.stats

import androidx.navigation.NavDirections
import com.example.trackfit.MyNavDirections

public class StatisticsFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalTrackingFragment(): NavDirections =
        MyNavDirections.actionGlobalTrackingFragment()
  }
}
