package com.example.recyclerwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerview : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview = findViewById(R.id.recyclerView)

        val images = ArrayList<Gallery>()

        images.add(Gallery("https://media3.s-nbcnews.com/j/newscms/2019_41/3047866/191010-japan-stalker-mc-1121_06b4c20bbf96a51dc8663f334404a899.fit-760w.JPG"))
        images.add(Gallery("https://www.adobe.com/content/dam/cc/us/en/products/creativecloud/stock/stock-riverflow1-720x522.jpg.img.jpg"))
        images.add(Gallery("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885__340.jpg"))
        images.add(Gallery("https://www.freedigitalphotos.net/images/img/homepage/394230.jpg"))
        images.add(Gallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRyGbucfOi9Z-rL7sHg01xxV388OEDYilylwQ&usqp=CAU"))
        images.add(Gallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRzxJKgfLm4Y5NYx9UXw1XIPSq61RzRJqPe-w&usqp=CAU"))
        images.add(Gallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4lU9t-6UsdhjQuogqtzZRbBwVrxk_8AgHFA&usqp=CAU"))
        images.add(Gallery("https://ichef.bbci.co.uk/news/976/cpsprodpb/1572B/production/_88615878_976x1024n0037151.jpg"))
        images.add(Gallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSNbjmnlzLycPBzci1ZnnWb_nivt8HLtto5DA&usqp=CAU"))
        images.add(Gallery("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT9iiIWLAopY_KbJ_fjUynalEd_BBY6dnZjIA&usqp=CAU"))


        val adapter = GalleryAdapter(images,this)
        recyclerview.adapter = adapter

        recyclerview.layoutManager = GridLayoutManager(this,2)


    }
}