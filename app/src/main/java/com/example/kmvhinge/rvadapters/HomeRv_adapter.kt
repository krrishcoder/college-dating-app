package com.example.kmvhinge.rvadapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kmvhinge.databinding.Type01HomeBinding
import com.example.kmvhinge.databinding.Type02HomeBinding
import com.example.kmvhinge.databinding.Type03HomeBinding
import com.example.kmvhinge.databinding.Type04HomeBinding
import com.example.kmvhinge.ui.rv_home_ViewHolder
import com.example.kmvhinge.ui.rv_home_items

class HomeRv_adapter : RecyclerView.Adapter<rv_home_ViewHolder>() {
    val ITEM1 = 1
    val ITEM2 = 2
    val ITEM3 = 3
    val ITEM4 = 4
    val ITEM5 = 5

var items = listOf<rv_home_items>()

    set(value){
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): rv_home_ViewHolder {
        return when(viewType){
            ITEM1 ->{
                    rv_home_ViewHolder.ProfileMainViewHolder(Type01HomeBinding.inflate(
                        LayoutInflater.from(parent.context),parent,false))
            }
            ITEM2 ->{
                rv_home_ViewHolder.ProfileImageViewHolder(Type01HomeBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false))

            }
            ITEM3 ->{
                rv_home_ViewHolder.Profile_Text_ViewHolder(
                    Type03HomeBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false))

            }
            ITEM4 ->{
                rv_home_ViewHolder.ProfileImage_NoTitle_ViewHolder(
                    Type02HomeBinding.inflate(LayoutInflater.from(parent.context),parent,false))

            }

            ITEM5 ->{
                rv_home_ViewHolder.Profile_data_ViewHolder(
                    Type04HomeBinding.inflate(
                    LayoutInflater.from(parent.context),parent,false))

            }
            else -> throw  IllegalArgumentException("Invalid viewType Provided")
        }
    }

    override fun getItemCount(): Int {
       return  items.size
    }

    override fun onBindViewHolder(holder: rv_home_ViewHolder, position: Int) {
       when(holder){
           is rv_home_ViewHolder.ProfileImageViewHolder -> holder.bind(items[position] as rv_home_items.ProfileImage)
           is rv_home_ViewHolder.ProfileImage_NoTitle_ViewHolder -> holder.bind(items[position] as rv_home_items.ProfileImage_no_title )
           is rv_home_ViewHolder.ProfileMainViewHolder -> holder.bind(items[position] as rv_home_items.ProfileMain)
           is rv_home_ViewHolder.Profile_Text_ViewHolder -> holder.bind(items[position]  as rv_home_items.ProfileTexts)
           is rv_home_ViewHolder.Profile_data_ViewHolder -> holder.bind(items[position] as rv_home_items.ProfileData)
       }
    }

    override fun getItemViewType(position: Int): Int {
        return when(items[position]){
            is rv_home_items.ProfileData -> ITEM5
            is rv_home_items.ProfileImage -> ITEM2
            is rv_home_items.ProfileImage_no_title -> ITEM4
            is rv_home_items.ProfileMain -> ITEM1
            is rv_home_items.ProfileTexts -> ITEM3
        }
    }
}