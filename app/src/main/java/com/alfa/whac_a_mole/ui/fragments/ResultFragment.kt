package com.alfa.whac_a_mole.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.databinding.FragmentResultBinding
import com.alfa.whac_a_mole.logic.Data
import com.alfa.whac_a_mole.utilits.APP_ACTIVITY
import com.alfa.whac_a_mole.utilits.getRecord
import com.alfa.whac_a_mole.utilits.putNewRecordValue
import com.alfa.whac_a_mole.utilits.showToast

class ResultFragment : Fragment() {

    private var binding : FragmentResultBinding? = null
    private val mBinding get() = binding!!
    private var score: Int? = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.title = getString(R.string.result)
        APP_ACTIVITY.supportActionBar?.setDisplayHomeAsUpEnabled(false)
        APP_ACTIVITY.supportActionBar?.setDisplayShowHomeEnabled(false)
        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun init(){
        binding?.apply {
            score = arguments?.getInt("arg")
            textResult.text = score.toString()
            if(score!! > getRecord()){
                showToast(getString(R.string.new_record))
                putNewRecordValue(score!!)
                textRecord.text = score.toString()
            }
            else{
                textRecord.text = getRecord().toString()
            }
            btnMenu.setOnClickListener {
                APP_ACTIVITY.mNavController.navigate(R.id.action_resultFragment_to_startFragment)
            }
            btnAgain.setOnClickListener {
                APP_ACTIVITY.mNavController.navigate(R.id.action_resultFragment_to_gameFragment)
            }
        }
    }
}