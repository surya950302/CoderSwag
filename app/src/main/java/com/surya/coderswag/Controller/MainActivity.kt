package com.surya.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.surya.coderswag.Adapters.CategoryAdapter
import com.surya.coderswag.Adapters.CategoryRecyclerAdapter
import com.surya.coderswag.Model.Category
import com.surya.coderswag.Model.Product
import com.surya.coderswag.R
import com.surya.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit var adapter : CategoryAdapter

    lateinit var  adapter: CategoryRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //adapter = CategoryAdapter(this, DataService.categories)
        //adapter = CategoryRecyclerAdapter(this,DataService.categories) this is without the  on-click
        adapter = CategoryRecyclerAdapter(this, DataService.categories){ category ->
            //println(category.title)
            val productIntent= Intent(this, ProductsActivity :: class.java)
            startActivity(productIntent)
        }
        categoryListView.adapter = adapter

        /*categoryListView.setOnItemClickListener { parent, view, position, id ->
            val category = DataService.categories[position]
            Toast.makeText(this, "you clicked on the ${category.title} cell", Toast.LENGTH_SHORT).show()
        }

        }*/

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)



    }
}