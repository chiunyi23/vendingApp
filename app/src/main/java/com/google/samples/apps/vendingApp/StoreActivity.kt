package com.google.samples.apps.vendingApp

import ItemAdapter
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_store.*
import kotlin.random.Random

class StoreActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        val itemList = generateDummyList(30)

        recycler_view.adapter = ItemAdapter(itemList)
        recycler_view.layoutManager = GridLayoutManager(this,2)
        recycler_view.setHasFixedSize(true)
    }

    override onCreateViewHolder(ViewGroup, )

    private fun generateDummyList(size: Int) : List<StoreItem> {

        val list = ArrayList<StoreItem>()

        for (i in 0 until size) {
            val item = StoreItem(R.drawable.ic_local_drink, "商品編號: $i", "價格: ${Random.nextInt(70, 300)}", "商品敘述")
            list += item
        }

        return list
    }


}
