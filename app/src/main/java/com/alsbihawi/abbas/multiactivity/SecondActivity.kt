package com.alsbihawi.abbas.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alsbihawi.abbas.multiactivity.databinding.ActivitySecondBinding
import com.alsbihawi.abbas.multiactivity.model.User

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
//        val name=intent.getStringExtra(Constants.extraName)
        val user:User=intent.getSerializableExtra(Constants.user) as User
        binding.textView.text=user.fullname
        binding.buttonBackHome.setOnClickListener {
            finish()
        }
    }
}