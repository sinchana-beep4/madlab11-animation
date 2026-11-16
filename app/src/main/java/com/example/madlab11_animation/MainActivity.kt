package com.example.madlab11_animation

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.internal.TextScale

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val zoom_in = findViewById<Button>(R.id.zoom_in)
        val text = findViewById<TextView>(R.id.textView)
        val fade_in = findViewById<Button>(R.id.fade_in)
        val fade_out = findViewById<Button>(R.id.fade_out)
        val zoom_out = findViewById<Button>(R.id.zoom_out)
        val slide_down = findViewById<Button>(R.id.slide_down)
        val slide_up = findViewById<Button>(R.id.slide_up)
        val bounce = findViewById<Button>(R.id.bounce)
        val rotate = findViewById<Button>(R.id.rotate)

        zoom_in.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            text.startAnimation(a)
        }

        fade_in.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.fade_in)
            text.startAnimation(a)
        }

        fade_out.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.fade_out)
            text.startAnimation(a)
        }

        zoom_out.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            text.startAnimation(a)
        }

        slide_down.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.slide_down)
            text.startAnimation(a)
        }

        slide_up.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.slide_up)
            text.startAnimation(a)
        }

        bounce.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.bounce)
            text.startAnimation(a)
        }

        rotate.setOnClickListener {
            val a = AnimationUtils.loadAnimation(this, R.anim.rotate)
            text.startAnimation(a)
        }
    }
}