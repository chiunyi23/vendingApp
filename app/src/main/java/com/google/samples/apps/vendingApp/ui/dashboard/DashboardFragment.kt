package com.google.samples.apps.vendingApp.ui.dashboard

import android.content.ClipData
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.samples.apps.vendingApp.ItemAdapter
import com.google.samples.apps.vendingApp.R
import com.google.samples.apps.vendingApp.StoreItem
import kotlinx.android.synthetic.main.activity_store.*
import kotlin.random.Random

class DashboardFragment : Fragment() {

//    private lateinit var dashboardViewModel: DashboardViewModel
//
//    override fun onCreateView(
//            inflater: LayoutInflater,
//            container: ViewGroup?,
//            savedInstanceState: Bundle?
//    ): View? {
//        dashboardViewModel =
//                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
//        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        dashboardViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })
//
//        val itemList = generateDummyList(20)
//
//        recycler_view.adapter = ItemAdapter(itemList)
//        recycler_view.layoutManager = LinearLayoutManager(context)
//        recycler_view.setHasFixedSize(true)
//
//        return root
//    }
//
//

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_dashboard, container, false)

        // populate the views now that the layout has been inflated
        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            // RecyclerView node initialized here

            val itemList = generateDummyList(20)
            recycler_view.apply {
                // set a LinearLayoutManager to handle Android
                // RecyclerView behavior
                layoutManager = LinearLayoutManager(activity)
                // set the custom adapter to the RecyclerView
                adapter = ItemAdapter(itemList)
            }
        }

        private fun generateDummyList(size: Int) : List<StoreItem> {

        val list = ArrayList<StoreItem>()

            val stringList = listOf("啤酒", "梅酒", "加拿大冰酒", "琴酒")
        for (i in 0 until size) {
            val item = StoreItem(R.drawable.ic_local_drink, "Item ${stringList[i%4]}", "時間: ${Random.nextInt(0, 24)}:${Random.nextInt(0, 59)}")
            list += item
        }

        return list
    }
}
