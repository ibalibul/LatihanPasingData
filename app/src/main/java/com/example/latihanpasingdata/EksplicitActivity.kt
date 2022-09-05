package com.example.latihanpasingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_eksplicit.*

class EksplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eksplicit)

        ambilData()

    }

    fun ambilData(){
        var umursaya = intent.getIntExtra("umuranda",0)
        var tinggisaya = intent.getDoubleExtra("tinggiBadan",0.0)
        var beratsaya = intent.getIntExtra("beratBadan",0)
        var kategori = intent.getStringExtra("kategori")
        var BMIsaya = intent.getDoubleExtra("BMIsaya",0.0)
        tv_umurHasil.text = umursaya.toString()
        tv_TinggiHasil.text = tinggisaya.toString()
        tv_BBHasil.text = beratsaya.toString()
        tv_BMiHasil.text = BMIsaya.toString()
        tv_KategoriHasil.text = kategori

    }
}