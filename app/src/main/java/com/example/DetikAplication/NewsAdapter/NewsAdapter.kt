package com.example.DetikAplication.NewsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.DetikAplication.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter (val context: Context,val listnews:List<news>):
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>(){
    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var currentNews: news?= null
        var curentPosition: Int =0

        fun setdata(currenews: news, pos: Int) {
            itemView.tvw_title.text = currenews!!.title
            itemView.tvw_Desc.text = currenews!!.desc
            itemView.img_news.setImageResource(currenews!!.photo)

            this.currentNews
            this.curentPosition
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita,parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listnews.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datanews = listnews[position]
        holder.setdata(datanews, position)


    }
    //region 1. Event Click
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback{
        fun onItemClick(data: news)
    }

}