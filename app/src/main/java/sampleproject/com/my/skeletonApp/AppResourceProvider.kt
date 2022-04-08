package sampleproject.com.my.skeletonApp

import android.content.Context
import javax.inject.Inject


class AppResourceProvider() {
    lateinit var context: Context

    @Inject
    constructor(context: Context) : this() {
        this.context = context
    }
    fun getString(resId: Int): String{
        return context.getString(resId)
    }
}