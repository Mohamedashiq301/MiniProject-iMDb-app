package com.example.imdb

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import  androidx.recyclerview.widget.RecyclerView
import com.android.volley.RequestQueue
import com.example.imdb.VolleySingleton.mInstance

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var requestQueue: RequestQueue

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.moviesRecyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager


        requestQueue = VolleySingleton.mInstance(this).requestQueue

        fetchMovies()

    }

    private fun fetchMovies() {
        String url = ""
    }
}