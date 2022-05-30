package com.example.kostku.menu

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kostku.R
import com.example.kostku.adapter.BannerAdapter
import com.example.kostku.adapter.ListKostAdapter
import com.example.kostku.model.Banner
import com.example.kostku.model.ListKost
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    //for Banner
    lateinit var bannerAdapter: BannerAdapter
    val lmBanner = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false) //untuk LM horizontal
    val addBannerList: MutableList<Banner> = ArrayList()

    //for List Kost
    lateinit var listKostAdapter: ListKostAdapter
    val addListKost: MutableList<ListKost> = ArrayList()
    val lmListKost = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
//    val lmListKost = object : LinearLayoutManager(activity) {
//        override fun canScrollVertically(): Boolean {
//            return false //disable scroll inside RV
//        }
//    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    @SuppressLint("UseRequireInsteadOfGet")
    fun initView() {
        //RecyclerView for Banner
        rv_banner.layoutManager = lmBanner
        bannerAdapter = BannerAdapter(activity!!)
        rv_banner.adapter = bannerAdapter

        addBannerList.add(Banner("Putra", "Kost Rumah Kaca", "700.000/bln", (R.drawable.bg1)))
        addBannerList.add(Banner("Putri", "Kost Anggrek", "450.000/bln", (R.drawable.bg2)))
        addBannerList.add(Banner("Putra", "Kost Maven", "950.000/bln", (R.drawable.bg1)))

        bannerAdapter.setBanner(addBannerList)

        //RecyclerView for List Kost
        rv_listKost.layoutManager = lmListKost
        listKostAdapter = ListKostAdapter(activity!!)
        rv_listKost.adapter = listKostAdapter

        addListKost.add(ListKost("Kost Putri","Kost Anggrek Mawar","800.000/bln",(R.drawable.kost1)))
        addListKost.add(ListKost("Kost Putra","Kost Sigura-Gura","320.000/bln",(R.drawable.kost2)))
        addListKost.add(ListKost("Kost Putra","Kost Alam Hijau","520.000/bln",(R.drawable.kost3)))
        addListKost.add(ListKost("Kost Putri","Kost Bu Aminah","750.000/bln",(R.drawable.kost4)))
        addListKost.add(ListKost("Kost Putri","Kost Permata Alam","1.2000.000/bln",(R.drawable.kost5)))

        listKostAdapter.setListKost(addListKost)
    }
}