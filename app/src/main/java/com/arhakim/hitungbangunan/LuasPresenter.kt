package com.arhakim.hitungbangunan

class LuasPresenter (
    private val luasView: LuasView
){
    fun hitungLuasPersegi(panjang: Float, lebar: Float){
        val hasil = panjang * lebar;
        luasView.hasilLuasPersegiPanjang(hasil)
    }

}