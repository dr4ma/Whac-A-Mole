package com.alfa.whac_a_mole.ui.fragments

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.databinding.FragmentGameBinding
import com.alfa.whac_a_mole.logic.Data
import com.alfa.whac_a_mole.utilits.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_game.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class GameFragment : Fragment() {

    private var binding: FragmentGameBinding? = null
    private val mBinding get() = binding!!
    private val data = Data()
    private val bundle = Bundle()
    private var points: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onStart() {
        super.onStart()

        points = 0
        init()
        APP_ACTIVITY.title_toolbar.text = getString(R.string.game)
        APP_ACTIVITY.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        APP_ACTIVITY.supportActionBar?.setDisplayShowHomeEnabled(true)
            CoroutineScope(Dispatchers.Main).launch {
                data.startCountDownTimer(30000, timer, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9){
                    onSuccess()
                }
            }
    }

    override fun onStop() {
        super.onStop()
        data.cancelCountDownTimer()
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun onSuccess(){
        bundle.putInt("arg", points)
        APP_ACTIVITY.mNavController.navigate(R.id.action_gameFragment_to_resultFragment, bundle)
        bundle.clear()
    }

    private fun init() {
        binding?.apply {
            textCount.text = points.toString()
            textRecord.text = getRecord().toString()
            btn1.setOnClickListener {
                val str = btn1.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn1.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn2.setOnClickListener {
                val str = btn2.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn2.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn3.setOnClickListener {
                val str = btn3.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn3.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn4.setOnClickListener {
                val str = btn4.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn4.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn5.setOnClickListener {
                val str = btn5.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn5.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()

                }
            }
            btn9.setOnClickListener {
                val str = btn9.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn9.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn6.setOnClickListener {
                val str = btn6.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn6.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn7.setOnClickListener {
                val str = btn7.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn7.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }
            btn8.setOnClickListener {
                val str = btn8.text.toString()
                if (str.toInt() == data.numberHole) {
                    points++
                    btn8.setBackgroundResource(R.drawable.hole)
                    textCount.text = points.toString()
                }
            }

        }
    }
}