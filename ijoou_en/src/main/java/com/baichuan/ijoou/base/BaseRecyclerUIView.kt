package com.baichuan.ijoou.base

import com.angcyo.uiview.base.UIRecyclerUIView
import com.angcyo.uiview.model.TitleBarPattern

/**
 * Copyright (C) 2016,百川科技股份有限公司 All rights reserved.
 * 项目名称：
 * 类的描述：
 * 创建人员：Robi
 * 创建时间：2018/06/28 20:42
 * 修改人员：Robi
 * 修改时间：2018/06/28 20:42
 * 修改备注：
 * Version: 1.0.0
 */
abstract class BaseRecyclerUIView<H, T, F> : UIRecyclerUIView<H, T, F>() {
    override fun getTitleBar(): TitleBarPattern {
        return super.getTitleBar()
    }

    override fun getDefaultBackgroundColor(): Int {
        return super.getDefaultBackgroundColor()
    }

    override fun getRecyclerRootLayoutId(): Int {
        return super.getRecyclerRootLayoutId()
    }

    override fun getDefaultLayoutState(): LayoutState {
        return super.getDefaultLayoutState()
    }
}