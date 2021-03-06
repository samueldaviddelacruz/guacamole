package com.zeilmo.guacamolelibrary.models

import android.graphics.drawable.Drawable
import com.zeilmo.guacamolelibrary.R

abstract class BasicPreference(val key: String) {

    var icon: Drawable? = null
    var title: String? = null
    var subTitle: String? = null

    abstract fun getLayoutId(): Int

}

class TitlePreference(key: String): AlertPreference(key)  {

    override fun getLayoutId(): Int = R.layout.cardview_preference_title
}

