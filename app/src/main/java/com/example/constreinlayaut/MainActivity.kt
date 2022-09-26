package com.example.constreinlayaut

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onCreate")
    }

    override fun onStart() {
        super.onStart()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onStart")


    }
    override fun onResume() {
        super.onResume()
        // Imprimimos en la ventana del "Logcat"
        Log.d("Estado","onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("estado","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("estado","onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("estado","onPause")

    }

}