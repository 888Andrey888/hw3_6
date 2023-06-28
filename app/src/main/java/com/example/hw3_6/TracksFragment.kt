package com.example.hw3_6

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw3_6.databinding.FragmentTracksBinding


class TracksFragment(private val fragmentsBidge: FragmentsBidge) : Fragment(), OnItemClickListener {
    private lateinit var binding: FragmentTracksBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTracksBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val adapter = TracksAdapter(Model.getList(), this)
        binding.rvTracks.adapter = adapter
    }


    override fun onItemClick(track: TrackModel) {
        fragmentsBidge.changeData(track)
    }
}