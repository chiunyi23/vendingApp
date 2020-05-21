package com.google.samples.apps.vendingApp

import ItemAdapter2
import android.app.Activity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_store.*
import kotlin.random.Random

class StoreActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        val itemList = generateDummyList(30)

        recycler_view.adapter = ItemAdapter2(itemList)
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.setHasFixedSize(true)
    }

    private fun generateDummyList(size: Int) : List<StoreItem2> {

        val list = ArrayList<StoreItem2>()

        for (i in 0 until size) {
            val item = StoreItem2(R.drawable.ic_local_drink, "商品 $i", "價格: ${Random.nextInt(70, 300)}", "商品敘述")
            list += item
        }

        return list
    }


}
