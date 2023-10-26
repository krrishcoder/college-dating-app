package com.example.kmvhinge.rvadapters

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmvhinge.databinding.Type01HomeBinding

class rv_home : RecyclerView.Adapter<rv_home.view_model>() {

    inner class view_model(val binding : Type01HomeBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): view_model {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: view_model, position: Int) {
        TODO("Not yet implemented")
    }
}