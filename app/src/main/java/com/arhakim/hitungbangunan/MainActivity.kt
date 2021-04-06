package com.arhakim.hitungbangunan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), LuasView {
    private lateinit var presenter: com.arhakim.hitungbangunan.LuasPresenter
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var tvHasilLuasPersegiPanjang: TextView
    private lateinit var btnHitungLuasPersegiPanjang: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     presenter = com.arhakim.hitungbangunan.LuasPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        tvHasilLuasPersegiPanjang = findViewById(R.id.tv_hasil_luas_persegi_panjang)

        btnHitungLuasPersegiPanjang = findViewById(R.id.btn_hitung_luas_persegi_panjang)
        btnHitungLuasPersegiPanjang.setOnClickListener {
            val panjang = etPanjang.text.toString().trim().toFloat()
            val lebar = etLebar.text.toString().trim().toFloat()
            presenter.hitungLuasPersegi(panjang, lebar)
        }

    }

    override fun hasilLuasPersegiPanjang(luas: Float, keliling: Float) {
        tvHasilLuasPersegiPanjang.text = keliling.toString()
        tvHasilLuasPersegiPanjang.text = luas.toString()
    }

}