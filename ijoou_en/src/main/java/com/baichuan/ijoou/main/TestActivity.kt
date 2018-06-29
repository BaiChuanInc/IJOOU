package com.baichuan.ijoou.main

import com.angcyo.library.utils.L
import com.angcyo.uiview.base.Item
import com.angcyo.uiview.base.SingleItem
import com.angcyo.uiview.recycler.RBaseViewHolder
import com.baichuan.ijoou.R
import com.baichuan.ijoou.base.BaseItemUIView

/**
 * Copyright (C) 2016,深圳市红鸟网络科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：
 * 创建人员：Robi
 * 创建时间：2018/06/29 12:19
 * 修改人员：Robi
 * 修改时间：2018/06/29 12:19
 * 修改备注：
 * Version: 1.0.0
 */
class TestActivity : BaseItemUIView() {
    override fun createItems(items: MutableList<SingleItem>) {
        items.add(object : SingleItem() {
            override fun onBindView(holder: RBaseViewHolder, posInData: Int, itemDataBean: Item?) {
                holder.click(R.id.testaaaa) {
                    L.i("dcb", "==========================>")
                    holder.textView(R.id.testaaaa).setText("aaaaaaaaaaaa");
                }
            }

            override fun getItemLayoutId(): Int {
                return R.layout.activity_test3
            }
        })

        items.add(object : SingleItem() {
            override fun onBindView(holder: RBaseViewHolder, posInData: Int, itemDataBean: Item?) {
                holder.click(R.id.btn_aa) {
                    L.i("dcb", "==========================>")
                    holder.textView(R.id.testaaaa).setText("点击了测试1");
                }
            }

            override fun getItemLayoutId(): Int {
                return R.layout.activity_test3

            }
        })

        items.add(object : SingleItem() {
            override fun onBindView(holder: RBaseViewHolder, posInData: Int, itemDataBean: Item?) {
                holder.click(R.id.btn_bb) {
                    L.i("dcb", "==========================>")
                    holder.textView(R.id.testaaaa).setText("点击了测试2");
                }
            }

            override fun getItemLayoutId(): Int {
                return R.layout.activity_test4
            }
        })
    }
}
