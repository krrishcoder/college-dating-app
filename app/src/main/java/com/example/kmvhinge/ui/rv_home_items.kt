package com.example.kmvhinge.ui

import com.example.kmvhinge.models.ProfileData_
import com.example.kmvhinge.rvadapters.ListAdapter_profile_data

sealed class rv_home_items {

    class ProfileMain(
        val id:String,
        val name:String,
        val gender: String,
        val img : String,
        val imgtype : String,
        val title : String
    ) : rv_home_items()

    class ProfileImage(
        val id:String,
        val imgtype : String,
        val img: String,
        val title: String
    ) : rv_home_items()

    class ProfileImage_no_title(
        val id:String,
        val imgtype : String,
        val img: String
    ) : rv_home_items()

    class ProfileTexts(
        val id:String,
        val text1 : String,
        val text2 : String
    ) : rv_home_items()

    class ProfileData(
        val id: String,
        val data_h : List<ProfileData_>
    ) : rv_home_items()


}