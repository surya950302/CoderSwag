package com.surya.coderswag.Controller

import android.content.res.Configuration
import android.media.VolumeShaper
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.surya.coderswag.Adapters.ProductAdapter
import com.surya.coderswag.R
import com.surya.coderswag.Services.DataService
import com.surya.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var categoryType : String
    lateinit var adapter : ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        //Toast.makeText(this, "you clicked on $categoryType as category type", Toast.LENGTH_SHORT).show()

        adapter = ProductAdapter(this,DataService.getProducts(categoryType))
        productListView.adapter = adapter

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if(orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }
        else{
            spanCount = 2
        }
        val screenSize = resources.configuration.screenWidthDp
        if(screenSize > 720){
            spanCount = 3
        }else if(screenSize > 720 && orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 4
        }
        val layoutManager = GridLayoutManager(this,spanCount)
        productListView.layoutManager = layoutManager

    }
}