package com.example.githubuser.ui.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.githubuser.R
import com.example.githubuser.databinding.FragmentTabBinding

class FollowingFragment: Fragment(R.layout.fragment_tab) {

    private var _binding : FragmentTabBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentTabBinding.bind(view)
    }
}


