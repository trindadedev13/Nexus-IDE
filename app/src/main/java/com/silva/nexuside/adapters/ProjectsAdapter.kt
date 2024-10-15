package com.silva.nexuside.adapters

import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.silva.nexuside.databinding.LayoutProjectItemBinding

class ProjectsAdapter(private val arr: List<String>) : RecyclerView.Adapter<ProjectsAdapter.ViewHolder>() {
    
    class ViewHolder(binding: LayoutProjectItemBinding) : RecyclerView.ViewHolder(binding.root)
    
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ViewHolder {
        val binding: LayoutProjectItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }
    
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.title.text = Uri.parse(arr[position]).lastSegmentPath
        holder.binding.summary.text = arr[position]
    }
    
    override fun getItemCount(): Int = return arr.size
    
}