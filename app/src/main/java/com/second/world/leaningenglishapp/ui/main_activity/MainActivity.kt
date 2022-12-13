package com.second.world.leaningenglishapp.ui.main_activity

import android.os.Bundle
import com.second.world.leaningenglishapp.core.bases.BaseActivity
import com.second.world.leaningenglishapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}