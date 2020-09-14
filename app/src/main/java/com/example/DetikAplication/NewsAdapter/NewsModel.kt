package com.example.DetikAplication.NewsAdapter

import com.example.DetikAplication.R

data class news(var title:String,var desc: String,var photo:Int)
object NewsModel {
    val newslist = listOf<news>(
        news(
            "Potret Masamba Luwu Utara yang Masih Tertutup Lumpur Pasca Banjir Bandang",
            "detikNews|12 menit yang lalu",
            R.drawable.img_news1
        ),

        news(
            "Aneka Coretan di Tembok Sekitar Gedung DPR Dibersihkan",
            "detikNews|10 menit yang lalu",
            R.drawable.img_news2
        ),

        news(
            "Omas Meninggal Dunia, Anak Mengira Ibunya Tertidur",
            "detikcom|2 jam yang lalu",
            R.drawable.img_news3
        ),

        news(
            "Buku Kontroversi soal Donald Trump Ludes 1 Juta Eksemplar dalam 7 Hari",
            "ditikcom|3 jam yang lalu",
            R.drawable.img_news4
        ),

        news(
            "Fenomena Ondel-ondel Jadi Alat Ngamen Jalanan dan Bisa Disewa Rp 150 Ribu",
            "detikcom|4 jam yang lalu",
            R.drawable.img_news5
        ),

        news(
            "Kisah Manusia Silver Berani Malu Demi Hidup Mandiri",
            "detikcom|5 jam yang lalu",
            R.drawable.img_news6
        ),

        news(
            "PSBB Pra-AKB Kab Bogor Mulai Berlaku, Warga Tak Bermasker Didenda Rp 50 Ribu ",
            "detikcom|6 jam yang lalu",
            R.drawable.img_news7
        ),

        news(
            "Diduga Korsleting, Pondok Pesantren di Megamendung Bogor Terbakar",
            "detikcom | 2 Jam yang lalu",
            R.drawable.img_news8
        ),

        news(
            "Antrean Calon Penumpang KRL di Stasiun Bojonggede Mengular Hingga ke Jalan",
            "detikcom | 1 Menit yang lalu",
            R.drawable.img_news9
        )
    )
}