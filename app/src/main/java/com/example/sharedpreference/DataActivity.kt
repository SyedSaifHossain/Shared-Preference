package com.example.sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.databinding.ActivityDataBinding

class DataActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDataBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var show = getSharedPreferences("SAVE", Context.MODE_PRIVATE)

        binding.emailId.text = (show.getString("email",null))
        binding.passId.text = (show.getString("password",null))

    }

}