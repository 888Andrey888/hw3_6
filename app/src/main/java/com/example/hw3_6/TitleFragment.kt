package com.example.hw3_6

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hw3_6.databinding.FragmentTitleBinding


class TitleFragment : Fragment(), FragmentsBidge {
    private lateinit var binding: FragmentTitleBinding
    private var mediaPlayer = MediaPlayer()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTitleBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        requireActivity().supportFragmentManager.beginTransaction()
            .add(R.id.fl_traсks, TracksFragment(this)).commit()
        init()
        initListener()
    }

    private fun initListener() = with(binding) {
        btnStop.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.stop()
                btnPlayPausa.setImageResource(R.drawable.ic_play)
            }
        }

        btnPlayPausa.setOnClickListener {
            if (mediaPlayer.isPlaying) {
                mediaPlayer.pause()
                btnPlayPausa.setImageResource(R.drawable.ic_play)
            } else {
                mediaPlayer.start()
                btnPlayPausa.setImageResource(R.drawable.ic_pause)
            }
        }
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
        track.trackUrl?.let { playTrack(it) }
    }

    private fun playTrack(url: String) {
        if (mediaPlayer.isPlaying) {
            mediaPlayer.stop()
        }
        mediaPlayer = MediaPlayer().apply {
            setAudioAttributes(
                AudioAttributes.Builder()
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .build()
            )
            setDataSource(url)
            prepare()
            start()
        }
        binding.btnPlayPausa.setImageResource(R.drawable.ic_pause)
    }
}