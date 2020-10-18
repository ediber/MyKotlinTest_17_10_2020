package com.e.mykotlintest_17_10_2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonObject = findViewById<View>(R.id.button)

     /*   buttonObject.setOnClickListener(View.OnClickListener {
            doSomething()
        })*/

        button.setOnClickListener(View.OnClickListener {
            doSomething()
        })

        var lambda = {str: String -> Log.d("TAG", str) }


        val adapter = MyAdapter(lambda)
        //val lst = listOf<String>()
        val lst = listOf("Fowler", "Beck", "Evans")

        adapter.data = lst
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(application)

    }

    private fun doSomething() {
        val car0 = Car()
        Log.d("TAG", car0.company)

        // not compile, company has a private set
        // car0.company = "mazda"
    }


}