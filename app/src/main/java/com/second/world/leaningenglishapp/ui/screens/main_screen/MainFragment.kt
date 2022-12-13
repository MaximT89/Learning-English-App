package com.second.world.leaningenglishapp.ui.screens.main_screen

import androidx.fragment.app.viewModels
import com.second.world.leaningenglishapp.core.bases.BaseFragment
import com.second.world.leaningenglishapp.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding, MainViewModel>(FragmentMainBinding::inflate) {
    override val viewModel: MainViewModel by viewModels()

    override fun initView() = with(binding){


    }

    override fun initObservers() {
    }
}