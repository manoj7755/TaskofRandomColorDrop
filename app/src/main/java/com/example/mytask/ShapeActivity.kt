package com.example.mytask
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlin.random.Random


class ShapeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shape)
        val numBoxes = intent.getIntExtra("input_num", 10)
       val recycleview = findViewById<RecyclerView>(R.id.box_container)

        var ArrayData =  ArrayList<Mode>()
        for (i in 1..numBoxes) {
            ArrayData.add(Mode(1))
        }
        ArrayData.set(Random.nextInt(numBoxes),Mode(2))

        recycleview.layoutManager = GridLayoutManager(this,4,GridLayoutManager.VERTICAL,false)
        recycleview.adapter = ArrayAdapter(this,ArrayData)


    }
}