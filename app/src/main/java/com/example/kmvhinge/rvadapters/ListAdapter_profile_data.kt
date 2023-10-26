package com.example.kmvhinge.rvadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bumptech.glide.Glide
import com.example.kmvhinge.databinding.Subtype01HomeBinding
import com.example.kmvhinge.models.ProfileData_

class ListAdapter_profile_data(private val data: List<ProfileData_>) : BaseAdapter() {

        override fun getCount(): Int {
            return data.size
        }

        override fun getItem(position: Int): Any {
            return data[position]
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
            val item = data[position]

            val binding = Subtype01HomeBinding.inflate(LayoutInflater.from(parent!!.context),parent,false)
            binding.tvDataItem.text = item.text1
            Glide.with(binding.root.context).load(item.image1).into(binding.ivDataItem)

//
//            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
//            val view = convertView ?: inflater.inflate(R.layout.list_item_layout, null)
//
//            val textView = view.findViewById<TextView>(R.id.text_view)
//            textView.text = item.text

            return binding.root
        }

    }