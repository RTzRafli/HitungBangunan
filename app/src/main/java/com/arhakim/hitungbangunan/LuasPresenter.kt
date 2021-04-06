package com.arhakim.hitungbangunan

class LuasPresenter (
    private var luasView: LuasView
){
    fun hitungLuasPersegi(panjang: Float, lebar: Float){
        val hasil = panjang * lebar;
        val keliling = 2 * panjang * lebar;
        luasView.hasilLuasPersegiPanjang(hasil, keliling)
    }

}