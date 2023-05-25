package com.grioaldoalvarez.mymovies

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.grioaldoalvarez.mymovies.databinding.ActivityMainBinding
import com.grioaldoalvarez.mymovies.ui.theme.MyMoviesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding  = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.showButton.setOnClickListener {
            val message = binding.message.text
            Toast.makeText( this, message, Toast.LENGTH_LONG).show()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}