package com.tallium.compositionexperiment.ui.login

import android.view.ViewGroup
import androidx.core.view.children
import androidx.core.view.isVisible
import com.tallium.compositionexperiment.R

class SecondScreen : BaseScreen() {

    override fun initViews(views: ViewGroup) {
        views.children.find { it.id == R.id.field2 }?.isVisible = true
    }

}