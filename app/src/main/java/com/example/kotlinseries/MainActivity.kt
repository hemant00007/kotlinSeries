package com.example.kotlinseries

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.layoutManager= LinearLayoutManager(this)
        val data = ArrayList<ItemViewModel>()
        for (i in 1..20){
            data.add(ItemViewModel(R.drawable.ic_launcher_background,"Item"+i))
        }
        val  adapter = MyAdapter(data)
        recyclerview.adapter= adapter
    }
}