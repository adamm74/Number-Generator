package com.vortex.numbergenerator.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.vortex.numbergenerator.R
import com.vortex.numbergenerator.databinding.FragmentMenuBinding
import com.vortex.numbergenerator.viewModel.MenuViewModel


class MainMenuFragment : Fragment() {

    lateinit var mBinding : FragmentMenuBinding

    companion object {
        @JvmStatic
        fun newInstance(): MainMenuFragment {
            return MainMenuFragment()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        mBinding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_menu, container, false)
        mBinding.viewModel = MenuViewModel()

        return mBinding.root
    }
}