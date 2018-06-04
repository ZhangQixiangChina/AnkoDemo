package com.zqx.ankodemo

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
class SkuListAdapter : RecyclerView.Adapter<SkuVh>() {

    private var mSkuList: List<Sku>? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SkuVh {

        return SkuVh.create(parent)
    }

    override fun onBindViewHolder(holder: SkuVh, position: Int) {
        val sku = mSkuList!![position]
        holder.bind(sku)
    }

    override fun getItemCount(): Int {
        return if (mSkuList == null) 0 else mSkuList!!.size
    }

    fun setData(skuList: List<Sku>) {
        mSkuList = skuList
        notifyDataSetChanged()
    }
}
