package com.baichuan.ijoou

import com.angcyo.uiview.base.UIBaseTabView
import com.angcyo.uiview.view.IView
import com.angcyo.uiview.viewgroup.RTabLayout
import com.baichuan.ijoou.main.SingleUIView
import com.baichuan.ijoou.main.home.HomeUIView

/**
 * Copyright (C) 2016,百川科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：
 * 创建人员：Robi
 * 创建时间：2018/06/28 20:47
 * 修改人员：Robi
 * 修改时间：2018/06/28 20:47
 * 修改备注：
 * Version: 1.0.0
 */
class MainUIView : UIBaseTabView() {
    override fun getBaseLayoutId(): Int {
        return R.layout.view_main_layout
    }

    override fun initTabLayout(tabLayout: RTabLayout, iViews: MutableList<IView>) {

//        iViews.add(TestActivity())
        iViews.add(HomeUIView())
        iViews.add(SingleUIView())
        iViews.add(SingleUIView())


        super.initTabLayout(tabLayout, iViews)
    }
}