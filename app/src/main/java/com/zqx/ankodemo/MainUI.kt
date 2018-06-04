package com.zqx.ankodemo

import android.content.Context
import android.graphics.Color
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.View
import android.widget.TextView
import org.jetbrains.anko.*
import org.jetbrains.anko.recyclerview.v7._RecyclerView
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.sdk25.coroutines.onClick

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
class MainUI : AnkoComponent<Context> {

    private lateinit var rcv: RecyclerView
    private lateinit var btn: TextView

    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            frameLayout {
                backgroundColor = 0xff_f1f1f1.toInt()
                rcv = recyclerView {
                    adapter = SkuListAdapter()
                    layoutManager = LinearLayoutManager(ctx)

                    addRcvScrollListener()
                }.lparams {
                    width = matchParent
                    height = matchParent
                }

                btn = textView("悬浮\n按钮") {
                    gravity = Gravity.CENTER
                    textSize = 14f
                    textColor = Color.WHITE
                    backgroundColor = 0xff_4466aa.toInt()
                    onClick {
                        showToast("点我做什么?")
                    }
                }.lparams {
                    width = dip(60)
                    height = dip(60)
                    gravity = Gravity.BOTTOM or Gravity.END
                    rightMargin = dip(15)
                    bottomMargin = dip(25)
                }

            }
        }

    }

    private fun @AnkoViewDslMarker _RecyclerView.addRcvScrollListener() {
        addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (dy > 0 && btn.visibility != View.GONE) {
                    btn.visibility = View.GONE
                }

                if (dy < 0 && btn.visibility != View.VISIBLE) {
                    btn.visibility = View.VISIBLE
                }
            }
        })

    }

    fun setSkuList(skuList: List<Sku>) {
        (rcv.adapter as SkuListAdapter).setData(skuList)

    }

}

