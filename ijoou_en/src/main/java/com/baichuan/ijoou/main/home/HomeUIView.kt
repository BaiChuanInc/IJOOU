package com.baichuan.ijoou.main.home

import com.angcyo.uiview.recycler.adapter.RExBaseAdapter
import com.baichuan.ijoou.R
import com.baichuan.ijoou.base.BaseRecyclerUIView
import com.baichuan.ijoou.main.home.bean.HomeDataBean
import com.baichuan.ijoou.main.home.bean.HomeTopBean

/**
 * Copyright (C) 2016,深圳市红鸟网络科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：Tab 首页
 * 创建人员：Robi
 * 创建时间：2018/06/29 19:31
 * 修改人员：Robi
 * 修改时间：2018/06/29 19:31
 * 修改备注：
 * Version: 1.0.0
 */
class HomeUIView : BaseRecyclerUIView<HomeTopBean, HomeDataBean, String>() {

    override fun createAdapter(): RExBaseAdapter<HomeTopBean, HomeDataBean, String> {
        return object : RExBaseAdapter<HomeTopBean, HomeDataBean, String>(mActivity) {

            override fun getItemType(position: Int): Int {
                if (isInHeader(position)) {
                    if (position == 0) {
                        return TYPE_HEADER
                    } else if (position == 1) {
                        return TYPE_HEADER + 1
                    }
                }
                return super.getItemType(position)
            }

            override fun getItemLayoutId(viewType: Int): Int {
                if (viewType == TYPE_HEADER) {
                    return R.layout.item_home_top_layout
                } else if (viewType == TYPE_HEADER + 1) {
                    return R.layout.item_home_data_tip
                }
                return R.layout.item_home_data_layout
            }
        }
    }

    override fun onUILoadData(page: Int, extend: String?) {
        super.onUILoadData(page, extend)

        val headerDatas = mutableListOf<HomeTopBean>()
        val datas = mutableListOf<HomeDataBean>()

        headerDatas.add(HomeTopBean())
        headerDatas.add(HomeTopBean())

        for (i in 0..10) {
            datas.add(HomeDataBean())
        }

        post {
            resetUI()
            showContentLayout()
            if (page == 1) {
                mExBaseAdapter.resetHeaderData(headerDatas)
                mExBaseAdapter.resetAllData(datas)

                if (datas.size > 5) {
                    mExBaseAdapter.isEnableLoadMore = true
                }
            } else {
                mExBaseAdapter.appendAllData(datas)
            }

        }
    }

}