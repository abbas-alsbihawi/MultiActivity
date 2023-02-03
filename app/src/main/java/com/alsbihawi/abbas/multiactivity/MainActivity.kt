package com.alsbihawi.abbas.multiactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.alsbihawi.abbas.multiactivity.databinding.ActivityMainBinding
import com.alsbihawi.abbas.multiactivity.model.User

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(LOG_TAG,"onCreate")
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallBacks()

    }

    private fun addCallBacks() {
        binding.buttonGoToSecond.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://google.com")
            startActivity(intent)
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
        const val LOG_TAG="MAIN_ACTIVITY"
    }
}