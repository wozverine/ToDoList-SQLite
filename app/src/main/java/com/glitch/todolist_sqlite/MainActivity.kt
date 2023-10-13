package com.glitch.todolist_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.AppBarConfiguration
import com.glitch.todolist_sqlite.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}