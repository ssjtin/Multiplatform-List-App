package com.example.listapp.androidApp

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.listapp.shared.Greeting
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var textField: TextView
    lateinit var addButton: Button
    lateinit var itemFragment: ItemFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textField = findViewById(R.id.textField)
        textField.visibility = View.INVISIBLE
        addButton = findViewById(R.id.addButon)

        addButton.setOnClickListener {
            addButtonClicked()
        }
    }

    fun addButtonClicked() {
        if (textField.text.isEmpty()) {
            textField.visibility = View.VISIBLE
        } else {

        }
    }
}
