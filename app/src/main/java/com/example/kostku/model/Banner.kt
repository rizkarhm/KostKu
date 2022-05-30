package com.example.kostku.model

class Banner {
    private var jenis: String = ""
    private var nama: String = ""
    private var harga: String = ""
    private var img: Int = 0

    constructor(jenis: String, nama: String, harga: String, img: Int){
        this.jenis = jenis
        this.nama = nama
        this.harga = harga
        this.img = img
    }

    fun getJenis(): String{
        return jenis
    }

    fun setJenis(jenis:String){
        this.jenis = jenis
    }

    fun getNama(): String{
        return nama
    }

    fun setNama(nama:String){
        this.nama = nama
    }

    fun getHarga(): String{
        return harga
    }

    fun setHarga(harga:String){
        this.harga = harga
    }

    fun getImg(): Int{
        return img
    }

    fun setImg(img:Int){
        this.img = img
    }
}