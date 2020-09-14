package com.example.DetikAplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.DetikAplication.NewsAdapter.NewsAdapter
import com.example.DetikAplication.NewsAdapter.NewsModel
import com.example.DetikAplication.NewsAdapter.news
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var newsAdapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //region headline

        var headlinenews: news?
        if (NewsModel.newslist.size>0){
            headlinenews = NewsModel.newslist[NewsModel.newslist.size-1]
            tvw_TitleHeadLine.setText(headlinenews.title)
            tvw_DescHeadLine.setText(headlinenews.desc)
            img_news0.setImageResource(headlinenews.photo)

            cdv_newsheadline.setOnClickListener(){
                val intent_detail = Intent(this,DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, headlinenews.title)
                        putExtra(DetailActivity.cont_PhotoNews, headlinenews.photo.toString())
                    }
                startActivity(intent_detail)
                finish()

            }
        }

        //enderegion

        //region daftar berita

        val layManager = LinearLayoutManager(this)
        layManager.orientation = LinearLayoutManager.VERTICAL
        rcv_daftarberita.layoutManager = layManager

        newsAdapter = NewsAdapter(this, NewsModel.newslist)
        rcv_daftarberita.adapter= newsAdapter

        newsAdapter.setOnClickCallback(object : NewsAdapter.OnItemClickCallback{
            override fun onItemClick(data: news) {
                val intent = Intent(this@MainActivity,DetailActivity::class.java)
                    .apply {
                        putExtra(DetailActivity.cont_TitleNews, data.title.toString())
                        putExtra(DetailActivity.cont_PhotoNews,  data.photo.toString())
                    }
                startActivity(intent)
                finish()
            }
        })


        //enderegion


    }
}