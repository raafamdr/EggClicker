package com.rafael.eggclickerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import com.rafael.eggclickerapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.textCount.text = getString(R.string.egg_count, count)

        binding.imgEgg.setOnClickListener {
            it.animation = AnimationUtils.loadAnimation(this, R.anim.shake_animation)
            count++
            binding.textCount.text = getString(R.string.egg_count, count)
            binding.textClick.visibility = View.GONE
        }
    }
}