package com.zqx.ankodemo

import android.content.Context
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import org.jetbrains.anko.*

/**
 * Created by ZhangQixiang on 2018/6/1.
 */
object SkuItemView : AnkoComponent<Context> {
    override fun createView(ui: AnkoContext<Context>): View {
        return with(ui) {
            relativeLayout {
                lparams {
                    width = matchParent
                    verticalMargin = dip(5)
                }
                padding = dip(10)
                gravity = Gravity.CENTER_VERTICAL
                backgroundColor = Color.WHITE

                imageView {
                    id = R.id.iv_sku_image
                    scaleType = ImageView.ScaleType.CENTER_CROP
                }.lparams {
                    width = dip(120)
                    height = dip(120)
                }

                textView {
                    id = R.id.tv_sku_name
                    textSize = 16f
                    textColor = Color.parseColor("#212121")
                    typeface = Typeface.DEFAULT_BOLD
                }.lparams {
                    width = matchParent
                    height = wrapContent
                    leftMargin = dip(10)
                    rightOf(R.id.iv_sku_image)
                }

                textView {
                    id = R.id.tv_sku_price
                    textSize = 12f
                }.lparams {
                    sameLeft(R.id.tv_sku_name)
                    sameBottom(R.id.iv_sku_image)
                }

                textView("去购买") {
                    id = R.id.btn_buy
                    horizontalPadding = dip(12)
                    verticalPadding = dip(5)
                    textColor = Color.BLUE
                    textSize = 14f
                    backgroundResource = R.drawable.bg_go_buy
                }.lparams {
                    alignParentRight()
                    sameBottom(R.id.tv_sku_price)
                }

            }


        }
    }
}