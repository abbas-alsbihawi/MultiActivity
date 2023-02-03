package com.alsbihawi.abbas.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alsbihawi.abbas.multiactivity.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
        val name=intent.getStringExtra(Constants.extraName)
        binding.textView.text=name
        binding.buttonBackHome.setOnClickListener {
            finish()
        }
    }
}