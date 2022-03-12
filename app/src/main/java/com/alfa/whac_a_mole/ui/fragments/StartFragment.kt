package com.alfa.whac_a_mole.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.databinding.FragmentStartBinding
import com.alfa.whac_a_mole.utilits.APP_ACTIVITY
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_start.*

class StartFragment : Fragment() {

    private var binding : FragmentStartBinding? = null
    private val mBinding get() = binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.title_toolbar.text = getString(R.string.menu)
        APP_ACTIVITY.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        APP_ACTIVITY.supportActionBar?.setDisplayShowHomeEnabled(false)
        mBinding.btnPlay.setOnClickListener {
            APP_ACTIVITY.mNavController.navigate(R.id.action_startFragment_to_gameFragment)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}