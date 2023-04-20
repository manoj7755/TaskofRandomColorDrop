package com.example.mytask

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.graphics.blue
import androidx.core.graphics.drawable.toDrawable
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random

class ArrayAdapter(private val context: Context, private val ArrayData:ArrayList<Mode>):RecyclerView.Adapter<ArrayAdapter.ViewHolder>() {
    private lateinit var preView: View
    private var flag = 0
    var set = HashSet<Int>()
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
  return ViewHolder(LayoutInflater.from(context).inflate(R.layout.row_item,parent,false))
    }

    override fun getItemCount(): Int {
  return ArrayData.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if (ArrayData[position].isBlue == 2){
           holder.itemView.setBackgroundColor(Color.BLUE)
            ArrayData[position].isBlue = 1
        }else{
            holder.itemView.setBackgroundColor(Color.WHITE)
            ArrayData[position].isBlue =2
        }
      holder.itemView.setOnClickListener {
          if (ArrayData[position].isBlue ==1){
              holder.itemView.setBackgroundColor(Color.RED)
              ArrayData[position].isBlue = 0
              val ran = Random.nextInt(10)
              if (ran !=0){
                  ArrayData[ran].isBlue = 1
              }


          }
      }

    }

}