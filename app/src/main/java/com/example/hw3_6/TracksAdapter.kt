package com.example.hw3_6

import android.media.AudioAttributes
import android.media.MediaPlayer
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.hw3_6.databinding.ItemTrackBinding

class TracksAdapter(
    val list: ArrayList<TrackModel>,
    private val onItemClickListener: OnItemClickListener
) :
    Adapter<TracksAdapter.ViewHolder>() {
    inner class ViewHolder(private val binding: ItemTrackBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() = with(binding) {
            val track = list[adapterPosition]
            track.apply {
                tvNumberTrack.text = (adapterPosition + 1).toString()
                tvNameTrack.text = nameTrack
                tvExecutor.text = executor
                tvDuration.text = duration
                itemView.setOnClickListener {
                    onItemClickListener.onItemClick(this)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemTrackBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount() = list.size
}