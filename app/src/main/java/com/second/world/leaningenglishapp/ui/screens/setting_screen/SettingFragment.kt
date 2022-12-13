package com.second.world.leaningenglishapp.ui.screens.setting_screen

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.second.world.leaningenglishapp.core.bases.BaseFragment
import com.second.world.leaningenglishapp.databinding.FragmentSettingBinding

class SettingFragment : BaseFragment<FragmentSettingBinding, SettingViewModel>(FragmentSettingBinding::inflate) {
    override val viewModel: SettingViewModel by viewModels()

    override fun initView() = with(binding) {
    }

    override fun initObservers() {
    }


}