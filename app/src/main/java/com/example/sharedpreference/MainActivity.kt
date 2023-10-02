package com.example.sharedpreference

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sharedpreference.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


//        var show = getSharedPreferences("SAVE",Context.MODE_PRIVATE)
//        binding.email.setText(show.getString("email",null))
//        binding.password.setText(show.getString("password",null))

        binding.saveBtn.setOnClickListener{
           var editor = getSharedPreferences("SAVE",Context.MODE_PRIVATE).edit()

            editor.putString("email", binding.email.text.toString())
            editor.putString("password", binding.password.text.toString())
            editor.apply()
            startActivity(Intent(this, DataActivity::class.java))
        }
    }
}