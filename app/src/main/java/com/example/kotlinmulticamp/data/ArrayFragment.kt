    package com.example.kotlinmulticamp.data

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import com.example.kotlinmulticamp.R
import kotlinx.android.synthetic.main.fragment_array.*


    class ArrayFragment : Fragment(R.layout.fragment_array) {
        private val args by navArgs<ArrayFragmentArgs>()
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            textViewCommunityName.text = args.Array.name
            imageViewBanner.load(args.Array.banner)
            textViewDescription.text = args.Array.description
            textViewLeaderName.text = args.Array.leader.name
            imageViewLeader.load(args.Array.leader.photo)

            youtube.setOnClickListener {
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse(args.Array.links.youtube)
                startActivity(openURL)

            }

            twitter.setOnClickListener {
                val openURL1 = Intent(android.content.Intent.ACTION_VIEW)
                openURL1.data = Uri.parse(args.Array.links.twitter)
                startActivity(openURL1)

            }

            instagram.setOnClickListener {
                val openURL2 = Intent(android.content.Intent.ACTION_VIEW)
                openURL2.data = Uri.parse(args.Array.links.instagram)
                startActivity(openURL2)

            }

            meetup.setOnClickListener {
                val openURL3 = Intent(android.content.Intent.ACTION_VIEW)
                openURL3.data = Uri.parse(args.Array.links.participation)
                startActivity(openURL3)

            }

        }
    }