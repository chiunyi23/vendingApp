package com.google.samples.apps.vendingApp.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.samples.apps.vendingApp.R
import com.google.samples.apps.vendingApp.TransItem
import com.google.samples.apps.vendingApp.TransItemAdapter
import kotlinx.android.synthetic.main.activity_store.*
import kotlin.random.Random

class DashboardFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.fragment_trans, container, false)

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
                adapter = TransItemAdapter(itemList)
            }
        }

        private fun generateDummyList(size: Int) : List<TransItem> {

        val list = ArrayList<TransItem>()

            val stringList = listOf("啤酒", "梅酒", "加拿大冰酒", "琴酒")
        for (i in 0 until size) {
            val item = TransItem(R.drawable.ic_local_drink, "Item ${stringList[i%4]}", "時間: ${Random.nextInt(0, 24)}:${Random.nextInt(0, 59)}")
            list += item
        }

        return list
    }
}
