package com.mobcom.counterapp

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {
    private var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tv_counter = findViewById<TextView>(R.id.tv_counter)
        val add_button = findViewById<ImageButton>(R.id.add)
        val subs_button = findViewById<ImageButton>(R.id.subs)

        tv_counter.setText("" + counter)

        add_button.setOnClickListener() {
            counter += 1
            tv_counter.setText("" + counter)
        }

        subs_button.setOnClickListener() {
            counter -= 1
            tv_counter.setText("" + counter)
        }
    }
}