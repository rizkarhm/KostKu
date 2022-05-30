package com.example.kostku.menu

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kostku.R
import com.example.kostku.adapter.ListKostAdapter
import com.example.kostku.model.ListKost
import kotlinx.android.synthetic.main.fragment_home.*

class SearchFragment : Fragment() {

    lateinit var listKostAdapter: ListKostAdapter
    val addListKost: MutableList<ListKost> = ArrayList()
    val lmListKost = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initView()
    }

    @SuppressLint("UseRequireInsteadOfGet")
    fun initView() {
        //RecyclerView for List Kost
        rv_listKost.layoutManager = lmListKost
        listKostAdapter = ListKostAdapter(activity!!)
        rv_listKost.adapter = listKostAdapter

        addListKost.add(ListKost("Kost Putri","Kost Anggrek Mawar","800.000/bln",(R.drawable.kost1)))
        addListKost.add(ListKost("Kost Putra","Kost Sigura-Gura","320.000/bln",(R.drawable.kost2)))
        addListKost.add(ListKost("Kost Putra","Kost Alam Hijau","520.000/bln",(R.drawable.kost3)))
        addListKost.add(ListKost("Kost Putri","Kost Bu Aminah","750.000/bln",(R.drawable.kost4)))
        addListKost.add(ListKost("Kost Putri","Kost Permata Alam","1.2000.000/bln",(R.drawable.kost5)))
        addListKost.add(ListKost("Kost Putri","Kost Anggrek Mawar","800.000/bln",(R.drawable.kost1)))
        addListKost.add(ListKost("Kost Putra","Kost Sigura-Gura","320.000/bln",(R.drawable.kost2)))
        addListKost.add(ListKost("Kost Putra","Kost Alam Hijau","520.000/bln",(R.drawable.kost3)))
        addListKost.add(ListKost("Kost Putri","Kost Bu Aminah","750.000/bln",(R.drawable.kost4)))
        addListKost.add(ListKost("Kost Putri","Kost Permata Alam","1.2000.000/bln",(R.drawable.kost5)))

        listKostAdapter.setListKost(addListKost)
    }

}