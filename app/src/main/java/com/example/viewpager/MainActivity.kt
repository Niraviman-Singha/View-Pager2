package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager : ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = ViewPagerAdapter()
        viewPager.adapter = pagerAdapter
    }
}

class ViewPagerAdapter:RecyclerView.Adapter<ViewHolder>(){
    private val itemList = listOf("Niraviman Singha Roy","Jotirmoy Singha Roy","Sanjoy Kumar Roy","Mithun Roy")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.page_layout,parent, false)
        return com.example.viewpager.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val item = itemList[position]
        //holder.bind(item)
    }

}

class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    private val pagerTV:TextView =   itemView.findViewById(R.id.pagerTV)
    fun bind(item:String){
        pagerTV.text = item
    }
}



