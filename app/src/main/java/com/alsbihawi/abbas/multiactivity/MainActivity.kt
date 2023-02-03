package com.alsbihawi.abbas.multiactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alsbihawi.abbas.multiactivity.databinding.ActivityMainBinding
import com.alsbihawi.abbas.multiactivity.model.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
        binding.buttonGoToSecond.setOnClickListener {

            val intent=Intent(this,SecondActivity::class.java)
            val name=binding.textUsername.text.toString()
            intent.putExtra(Constants.extraName,name)
           val user= User(name,name)
            intent.putExtra(Constants.user, user)
            startActivity(intent)
        }
    }

    companion object{
        const val LOG_TAG="MAIN_ACTIVITY"
    }
}