package com.alfa.whac_a_mole.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.databinding.FragmentGameBinding
import com.alfa.whac_a_mole.logic.Data
import com.alfa.whac_a_mole.utilits.APP_ACTIVITY
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.coroutines.CoroutineScope

class GameFragment : Fragment() {

    private var binding : FragmentGameBinding? = null
    private val mBinding get() = binding!!
    private val data = Data()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()
        APP_ACTIVITY.title = getString(R.string.game)

        binding?.let {  data.startCountDownTimer(30000, timer, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9) }
    }

    override fun onResume() {
        super.onResume()
        init()
    }

    override fun onDestroy() {
        super.onDestroy()
        data.cancelCountDownTimer()
        binding = null
    }

    private fun init(){
        binding?.apply {
            btn1.setOnClickListener {
                val str = btn1.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn1.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn2.setOnClickListener {
                val str = btn2.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn2.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn3.setOnClickListener {
                val str = btn3.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn3.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn4.setOnClickListener {
                val str = btn4.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn4.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn5.setOnClickListener {
                val str = btn5.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn5.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()

                }
            }
            btn9.setOnClickListener {
                val str = btn9.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn9.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn6.setOnClickListener {
                val str = btn6.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn6.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn7.setOnClickListener {
                val str = btn7.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn7.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }
            btn8.setOnClickListener {
                val str = btn8.text.toString()
                if(str.toInt() == data.numberHole){
                    data.poits++
                    btn8.setBackgroundResource(R.drawable.hole)
                    textCount.text = data.poits.toString()
                }
            }

        }
    }
}