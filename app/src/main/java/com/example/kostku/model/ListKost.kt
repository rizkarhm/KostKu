package com.example.kostku.model

class ListKost {
    private var listJenis: String = ""
    private var listNama: String = ""
    private var listHarga: String = ""
    private var listImg: Int = 0

    constructor(listJenis: String, listNama: String, listHarga: String, listImg: Int){
        this.listJenis = listJenis
        this.listNama = listNama
        this.listHarga = listHarga
        this.listImg= listImg
    }

    fun getListJenis(): String{
        return listJenis
    }

    fun setListJenis(listJenis:String){
        this.listJenis = listJenis
    }

    fun getListNama(): String{
        return listNama
    }

    fun setListNama(listNama: String){
        this.listNama = listNama
    }

    fun getListHarga(): String{
        return listHarga
    }

    fun setListHarga(listHarga: String){
        this.listHarga = listHarga
    }

    fun getListImg(): Int{
        return listImg
    }

    fun setListImg(listImg:Int){
        this.listImg = listImg
    }
}