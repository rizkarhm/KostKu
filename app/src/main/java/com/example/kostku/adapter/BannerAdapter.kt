package com.example.kostku.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kostku.R
import com.example.kostku.model.Banner

class BannerAdapter(val context:Context): RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    private val banners: MutableList<Banner> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(LayoutInflater.from(context).inflate(R.layout.item_banner, parent, false))
    }
    override fun getItemCount(): Int {
        return banners.size
    }

    override fun onBindViewHolder(holder: BannerAdapter.BannerViewHolder, position: Int) {
        holder.bindModel(banners[position])
    }

    fun setBanner(data: List<Banner>){
        banners.clear()
        banners.addAll(data)
        notifyDataSetChanged()
    }

    inner class BannerViewHolder(item: View): RecyclerView.ViewHolder(item) {
        val txtJenis: TextView = item.findViewById(R.id.txt_jenisKost)
        val txtNama: TextView = item.findViewById(R.id.txt_namaKost)
        val txtHarga: TextView = item.findViewById(R.id.txt_hargaKost)
        val img: ImageView = item.findViewById(R.id.bg_banner)

        fun bindModel(b: Banner){
            txtJenis.text = b.getJenis()
            txtNama.text = b.getNama()
            txtHarga.text = b.getHarga()
            img.setImageResource(b.getImg())
        }
    }


}