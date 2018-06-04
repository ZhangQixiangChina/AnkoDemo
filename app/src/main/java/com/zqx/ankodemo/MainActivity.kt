package com.zqx.ankodemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.setContentView

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mainUI = MainUI()
        mainUI.setContentView(this)
        val skuList = MockData.getSkuList()
        mainUI.setSkuList(skuList)

    }
}
