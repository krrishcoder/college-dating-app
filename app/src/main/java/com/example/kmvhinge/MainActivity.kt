package com.example.kmvhinge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kmvhinge.databinding.ActivityMainBinding
import com.example.kmvhinge.rvadapters.HomeRv_adapter
import com.example.kmvhinge.rvadapters.rv01

class MainActivity : AppCompatActivity() , rv01.OnCategoryTouchListener {

    lateinit var binding: ActivityMainBinding
    lateinit var rvCategory : rv01
    private val home_rv_adapter = HomeRv_adapter()

    var flag_selected =1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvCategory = rv01(get_data_for_category(),this)
        binding.rvCategories.adapter = rvCategory
        binding.rvCategories.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.HORIZONTAL ,false)

        binding.rvHome.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = home_rv_adapter
        }


    }




//---------------------------------------------------------for category on above of 1st view-------------------------------------------------------------------------
    fun get_data_for_category(): ArrayList<String>{
        val stringArray = resources.getStringArray(R.array.categories)
        val cat_arr = ArrayList<String>()
        for(i in stringArray){
            cat_arr.add(i)
        }
        return cat_arr
    }

    override fun onTouchEvent(view: View, motionEvent: MotionEvent, position:Int): Boolean {
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    // This is when the user first touches the view
                    // Handle the touch down event here
                    println("action first")
                }
                MotionEvent.ACTION_MOVE -> {
                    // This is when the user moves their finger on the view
                    // Handle the touch move event here

                    if(position!=flag_selected){
                        view.startAnimation( AnimationUtils.loadAnimation(view.context,  android.R.anim.fade_in))
                    }

                    println("action move on")
                }
                MotionEvent.ACTION_UP -> {
                    // This is when the user releases their finger from the view
                    // Handle the touch up event here
                    println("action move touch up")
                }
            }
          return  true // Return true to consume the event, false to pass it to other listeners
    }

 //--------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}