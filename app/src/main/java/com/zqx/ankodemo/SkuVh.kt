package com.zqx.ankodemo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.find
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
@Suppress("JoinDeclarationAndAssignment")
class SkuVh private constructor(view: View) : RecyclerView.ViewHolder(view) {

    private val mTvSkuName: TextView
    private val mTvPrice: TextView
    private val mIvImage: ImageView
    private lateinit var mSku: Sku

    init {
        mTvSkuName = view.find(R.id.tv_sku_name)
        mTvPrice = view.find(R.id.tv_sku_price)
        mIvImage = view.find(R.id.iv_sku_image)
        view.find<View>(R.id.btn_buy).onClick {
            showToast("skuid:" + mSku.id)
        }
    }

    fun bind(sku: Sku) {

        sku.apply {
            mSku =this
            mTvSkuName.text = name
            mTvPrice.text = "¥" + price
            Glide.with(mIvImage).load(image).into(mIvImage)
        }

    }

    companion object {

        fun create(parent: ViewGroup): SkuVh {
            val akctx = AnkoContext.create(parent.context, false)
            val view = SkuItemView.createView(akctx)
            return SkuVh(view)
        }


    }


}

