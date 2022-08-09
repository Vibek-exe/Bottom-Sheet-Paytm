package com.example.bottomsheet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheet.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        BottomSheetBehavior.from(binding.sheet).apply {
            peekHeight = 1000
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }
    }
}