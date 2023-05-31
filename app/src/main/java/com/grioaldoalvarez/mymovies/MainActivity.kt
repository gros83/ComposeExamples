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
        binding.recycler.adapter = MoviesAdapter(
            listOf(
                Movie("Title 1","https://loremflickr.com/320/240?lock=1"),
                Movie("Title 2","https://loremflickr.com/320/240?lock=2"),
                Movie("Title 3","https://loremflickr.com/320/240?lock=3"),
                Movie("Title 4","https://loremflickr.com/320/240?lock=4"),
                Movie("Title 5","https://loremflickr.com/320/240?lock=5"),
                Movie("Title 6","https://loremflickr.com/320/240?lock=6")
            )
        ) { movie ->
            Toast
                .makeText(this@MainActivity, movie.title, Toast.LENGTH_SHORT)
                .show()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy")
    }
}