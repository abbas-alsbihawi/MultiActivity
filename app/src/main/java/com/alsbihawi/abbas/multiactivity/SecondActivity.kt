package com.alsbihawi.abbas.multiactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alsbihawi.abbas.multiactivity.databinding.ActivitySecondBinding
import com.alsbihawi.abbas.multiactivity.model.User

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(LOG_TAG,"onCreate")
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()
    }

    private fun addCallBacks() {
//        val name=intent.getStringExtra(Constants.extraName)
        val user: User? = intent.getParcelableExtra<User>(Constants.user)
        binding.textView.text=user?.fullname
        binding.buttonBackHome.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(LOG_TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(LOG_TAG,"onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i(LOG_TAG,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(LOG_TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(LOG_TAG,"onDestroy")
    }

    companion object{
        const val LOG_TAG="SECOND_ACTIVITY"
    }
}