package com.example.hw3_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw3_6.databinding.FragmentTitleBinding


class TitleFragment : Fragment(), FragmentsBidge {
    private lateinit var binding: FragmentTitleBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTitleBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().supportFragmentManager.beginTransaction().add(R.id.fl_traсks, TracksFragment(this)).commit()
        init()
    }

    private fun init() = with(binding) {
        imgBack.loadImage(getString(R.string.unknown_image_url))
        tvTrack.text = getString(R.string.unknown_track)
        tvExecutor.text = getString(R.string.unknown_executor)
    }

    override fun changeData(track: TrackModel) {
        track.apply {
            img?.let { binding.imgBack.loadImage(it) }
            binding.tvTrack.text = nameTrack
            binding.tvExecutor.text = executor
        }
    }
}