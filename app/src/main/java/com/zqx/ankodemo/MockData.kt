package com.zqx.ankodemo

import java.util.*

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
object MockData {
    val skuList: List<Sku>
        get() {
            val skuList = ArrayList<Sku>()
            for (i in 0..11) {
                skuList.add(Sku().putData(i))
            }
            return skuList
        }

    private fun Sku.putData(i: Int): Sku {

        id = "1000$i"
        name = "伊利牛奶,整箱包装,物超所值,赶快来买,买一送一$i"
        price = 18.8 + i
        image = "https://img11.360buyimg.com/mobilecms/s280x280_jfs/t16195/118/2017178397/168226/1ed073bf/5a790d53N4374e98d.jpg"

        return this
    }

}
