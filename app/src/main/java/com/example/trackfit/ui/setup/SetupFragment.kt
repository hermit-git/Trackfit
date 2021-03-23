package com.example.trackfit.ui.setup

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.trackfit.R
import com.example.trackfit.databinding.FragmentSetupBinding


class SetupFragment : Fragment(R.layout.fragment_setup) {

    private lateinit var binding:FragmentSetupBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSetupBinding.bind(view)

        binding.tvContinue.setOnClickListener {
            findNavController().navigate(R.id.action_setupFragment_to_runFragment)
        }

    }
}