package com.zqx.ankodemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangQixiang on 2018/5/31.
 */
public class MockData {
    public static List<Sku> getSkuList() {
        List<Sku> skuList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Sku sku = new Sku();
            putDataForEach(sku, i);
            skuList.add(sku);
        }
        return skuList;
    }

    private static void putDataForEach(Sku sku, int i) {
        sku.id = "1000" + i;
        sku.name = "伊利牛奶,整箱包装,物超所值,赶快来买,买一送一" + i;
        sku.price = 18.8 + i;
        sku.image = "https://img11.360buyimg.com/mobilecms/s280x280_jfs/t16195/118/2017178397/168226/1ed073bf/5a790d53N4374e98d.jpg";
    }
}
