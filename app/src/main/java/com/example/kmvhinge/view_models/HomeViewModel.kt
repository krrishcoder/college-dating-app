package com.example.kmvhinge.view_models

import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.bumptech.glide.load.engine.Resource
import com.example.kmvhinge.ui.rv_home_items
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel(){

    private val _homeListItemsLiveData = MutableLiveData<Resource<List<rv_home_items>>>()

    val homeListItemsData :LiveData<Resource<List<rv_home_items>>>
        get() = _homeListItemsLiveData

    init{

    }

    private fun getHomeListItems(){
        val homeItemsData = mutableListOf<rv_home_items>()
        homeItemsData.add(rv_home_items.ProfileMain(
            "0",
            "Surbhi",
            "female",
            "https://images.unsplash.com/photo-1623091411395-09e79fdbfcf3?auto=format&fit=crop&q=80&w=1000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8aW5kaWFuJTIwZ2lybHxlbnwwfHwwfHx8MA%3D%3D"
                ,"image"
            ,"Guess how many takes this took"
        ))

        homeItemsData.add(rv_home_items.ProfileTexts(
            "0",
            "I go crazy for",
            "delicious underrated food combos"
        ))

       // homeItemsData.add(rv_home_items.)

    }



}