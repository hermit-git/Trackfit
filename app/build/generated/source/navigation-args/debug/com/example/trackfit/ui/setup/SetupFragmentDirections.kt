package com.example.trackfit.ui.setup

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.trackfit.MyNavDirections
import com.example.trackfit.R

public class SetupFragmentDirections private constructor() {
  public companion object {
    public fun actionSetupFragmentToRunFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_setupFragment_to_runFragment)

    public fun actionGlobalTrackingFragment(): NavDirections =
        MyNavDirections.actionGlobalTrackingFragment()
  }
}
