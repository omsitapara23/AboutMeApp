package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.button2.setOnClickListener {
            Toast.makeText(this, binding.editName.text.toString(), Toast.LENGTH_SHORT).show()
            binding.apply {
                invalidateAll()
                editName.visibility = View.GONE
                button2.visibility = View.GONE
            }
        }
    }
}
