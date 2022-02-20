package com.tallium.compositionexperiment.ui.login

import android.view.View
import androidx.core.view.isVisible
import com.tallium.compositionexperiment.R

class SecondScreen : BaseScreen() {

    override fun initViews(views: Sequence<View>) {
        views.find { it.id == R.id.field2 }?.isVisible = true
    }

}