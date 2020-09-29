package com.example.kotlinmulticamp.data

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.example.kotlinmulticamp.R
import com.example.kotlinmulticamp.data.model.Array
import kotlinx.android.synthetic.main.fragment_community.*
import kotlinx.coroutines.launch


class CommunityFragment : Fragment(R.layout.fragment_community) {
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        lifecycleScope.launch {
            val response = RetrofitProvider.multicampApi.getCommunities()

            recyler_view.adapter =
                ArrayAdapter(response.toMutableList()){
                    val direction = CommunityFragmentDirections.actionCommunityFragmentToArrayFragment(it)
                    findNavController().navigate(direction)
                }

                }
        }

    }
