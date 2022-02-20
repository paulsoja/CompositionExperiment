package com.tallium.compositionexperiment.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import com.tallium.compositionexperiment.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val first = FirstScreen()
        val second = SecondScreen()
        val third = ThirdScreen()

        listOf(first, second, third).forEach {
            it.initViews(binding.root.children)
        }
    }
}