package com.baichuan.ijoou

import android.content.Intent
import com.angcyo.uiview.base.UILayoutActivity
import com.angcyo.uiview.container.UIParam

class MainActivity : UILayoutActivity() {
    override fun onLoadView(intent: Intent?) {
        startIView(MainUIView(), UIParam.get().setAnim(false).setAsync(false))
    }
}
