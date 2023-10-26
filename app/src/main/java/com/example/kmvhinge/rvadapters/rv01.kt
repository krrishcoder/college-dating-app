package com.example.kmvhinge.rvadapters

import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout.LayoutParams

import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.kmvhinge.R
import com.example.kmvhinge.databinding.RvItem01Binding

class rv01(private val dataSet: ArrayList<String> , private val categoryTouchObj : OnCategoryTouchListener) : RecyclerView.Adapter<rv01.viewHolder>() {

    var flagSelected = 1
    inner class viewHolder(val binding: RvItem01Binding?) : RecyclerView.ViewHolder(binding!!.root.rootView) , View.OnTouchListener {

init{
    binding!!.rvitem01bg.setOnTouchListener(this)

}
        override fun onTouch(v: View?, event: MotionEvent?): Boolean {


            if (event != null) {
                v?.let { categoryTouchObj.onTouchEvent(it,event,adapterPosition) }
            }
            return true
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {

        return viewHolder(RvItem01Binding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.binding!!.tvSortingCategory.text = dataSet.get(position).toString()
        if(position==0){  holder.binding!!.rvitem01bg.setBackground(ContextCompat.getDrawable(holder.itemView.context,R.drawable.ripple_effect01))
            holder.binding!!.tvSortingCategory.visibility = View.GONE
            holder.binding.imageView.visibility = View.VISIBLE
            return
        }

        if(flagSelected!=position){
            holder.binding!!.tvSortingCategory.visibility = View.VISIBLE
            holder.binding!!.rvitem01bg.setBackground(ContextCompat.getDrawable(holder.itemView.context,R.drawable.riple_effect_gray))
            holder.binding!!.tvSortingCategory.setTextColor(ContextCompat.getColor(holder.itemView.context, R.color.textgray))
        }

    }


    interface OnCategoryTouchListener{
        fun onTouchEvent(view : View, motionEvent : MotionEvent,position: Int) : Boolean
    }



}