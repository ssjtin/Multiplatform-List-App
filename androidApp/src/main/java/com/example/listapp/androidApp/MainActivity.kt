package com.example.listapp.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listapp.shared.Greeting
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
