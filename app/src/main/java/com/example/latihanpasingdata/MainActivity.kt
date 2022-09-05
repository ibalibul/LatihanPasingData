package com.example.latihanpasingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_eksplicit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        Intent ke EksplicitIntent.Kt bawa data

        btn_hitung.setOnClickListener{
            var umuranda = ed_umur.text.toString().toInt()
            var tinggiBadan = ed_tbadan.text.toString().toDouble()/100.0
            var beratBadan = ed_Bbadan.text.toString().toInt()
            var BMI = (beratBadan / tinggiBadan * tinggiBadan).toDouble()

            val Kategori : String
            if (BMI in 0.0..16.0){
                Kategori = "Terlalu Kurus"
            }else if (BMI in 16.0..17.0) {
                Kategori = "Cukup Kurus"
            }else if (BMI in 17.0..18.5) {
                Kategori = "sedikit kurus"
            }else if (BMI in 18.5..25.0) {
                Kategori = "Normal"
            }else if (BMI in 25.0..30.0){
                Kategori = "Gemuk"
            }else if (BMI in 30.0..35.0){
                Kategori = "Obesitas Kelas 1"
            }else if (BMI in 35.0..40.0) {
                Kategori = "Obesitas kelas 2"
            }else if (BMI > 40 ) {
                Kategori = "Obesitas Kelas 3"
            }else Kategori = "Tidak falid "

            //            key - Value

            var pindahData = Intent(this,EksplicitActivity::class.java)
            pindahData.putExtra("umuranda",umuranda)
            pindahData.putExtra("tinggiBadan",tinggiBadan)
            pindahData.putExtra("beratBadan",beratBadan)
            pindahData.putExtra("kategori",Kategori)
            pindahData.putExtra("BMIsaya",BMI)
            startActivity(pindahData)
        }

        }
}