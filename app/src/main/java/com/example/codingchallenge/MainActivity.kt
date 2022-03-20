package com.example.codingchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var ChallengeAdapter: ChallengeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.hide();

        initRecyclerView()
        addDataSource()
    }

    private fun addDataSource() {
        val dataSource = DataSource.createDataSet()
        this.ChallengeAdapter.setDataSet(dataSource)


    }

    private fun initRecyclerView() {

        this.ChallengeAdapter = ChallengeAdapter()

        recyclerview.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerview.adapter = this.ChallengeAdapter

    }

}