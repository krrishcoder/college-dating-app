package com.example.kmvhinge.ui

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.bumptech.glide.Glide
import com.example.kmvhinge.databinding.Type01HomeBinding
import com.example.kmvhinge.databinding.Type02HomeBinding
import com.example.kmvhinge.databinding.Type03HomeBinding
import com.example.kmvhinge.databinding.Type04HomeBinding
import com.example.kmvhinge.impclass.myConstants
import com.example.kmvhinge.rvadapters.ListAdapter_profile_data


sealed class rv_home_ViewHolder(binding: ViewBinding) : RecyclerView.ViewHolder(binding.root){

    class ProfileMainViewHolder(private  val binding : Type01HomeBinding): rv_home_ViewHolder(binding){
        fun bind(title: rv_home_items.ProfileMain){
            binding.tvOne.text = title.title
            if(title.imgtype == myConstants.IMAGE_TYPE){
                Glide.with(binding.root.context).load(title.img).into(binding.ivOne)
            }

        }
    }

    class ProfileImageViewHolder(private val binding : Type01HomeBinding) : rv_home_ViewHolder(binding){
        fun bind(profileimage : rv_home_items.ProfileImage){
            binding.tvOne.text = profileimage.title
            if(profileimage.imgtype == myConstants.IMAGE_TYPE){
                Glide.with(binding.root.context).load(profileimage.img).into(binding.ivOne)
            }

        }
    }

    class ProfileImage_NoTitle_ViewHolder(private val binding: Type02HomeBinding): rv_home_ViewHolder(binding){

        fun bind(profileimage_noText : rv_home_items.ProfileImage_no_title){
            if(profileimage_noText.imgtype == myConstants.IMAGE_TYPE){
                Glide.with(binding.root.context).load(profileimage_noText.img).into(binding.ivTwo)
            }
        }
    }

    class  Profile_Text_ViewHolder(private val binding:Type03HomeBinding) : rv_home_ViewHolder(binding){

        fun bind(profile_Text : rv_home_items.ProfileTexts){
            binding.tvTextOne.text = profile_Text.text1
            binding.tvTextTwo.text = profile_Text.text2
        }

    }

    class Profile_data_ViewHolder(private val binding:  Type04HomeBinding) : rv_home_ViewHolder(binding){

        fun bind(profile_data : rv_home_items.ProfileData){
            val adap = ListAdapter_profile_data(profile_data.data_h)
            binding.lvProfiledata.adapter = adap
        }
    }


}