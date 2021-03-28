package com.example.trackfit.ui.settings

import androidx.navigation.NavDirections
import com.example.trackfit.MyNavDirections

public class SettingsFragmentDirections private constructor() {
  public companion object {
    public fun actionGlobalTrackingFragment(): NavDirections =
        MyNavDirections.actionGlobalTrackingFragment()
  }
}
