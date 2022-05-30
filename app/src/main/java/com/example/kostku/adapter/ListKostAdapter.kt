package com.example.kostku.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kostku.R
import com.example.kostku.model.ListKost

class ListKostAdapter (val context: Context): RecyclerView.Adapter<ListKostAdapter.ListKostViewHolder>() {
    private val listKosts: MutableList<ListKost> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListKostViewHolder {
        return ListKostViewHolder(LayoutInflater.from(context).inflate(R.layout.item_kost, parent, false))
    }

    override fun getItemCount(): Int {
        return listKosts.size
    }

    override fun onBindViewHolder(holder: ListKostAdapter.ListKostViewHolder, position: Int) {
        holder.bindModel(listKosts[position])
    }

    fun setListKost(data: List<ListKost>){
        listKosts.clear()
        listKosts.addAll(data)
        notifyDataSetChanged()
    }

    inner class ListKostViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val listJenis: TextView = item.findViewById(R.id.list_jenisKost)
        val listNama: TextView = item.findViewById(R.id.list_namaKost)
        val listHarga: TextView = item.findViewById(R.id.list_hargaKost)
        val listImg: ImageView = item.findViewById(R.id.list_imgKost)

        fun bindModel(lk: ListKost){
            listJenis.text = lk.getListJenis()
            listNama.text = lk.getListNama()
            listHarga.text = lk.getListHarga()
            listImg.setImageResource(lk.getListImg())
        }
    }


}