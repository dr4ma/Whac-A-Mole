package com.alfa.whac_a_mole.logic

import android.os.Bundle
import android.os.CountDownTimer
import android.widget.TextView
import androidx.core.os.bundleOf
import com.alfa.whac_a_mole.R
import com.alfa.whac_a_mole.utilits.APP_ACTIVITY
import com.alfa.whac_a_mole.utilits.showToast
import java.util.Random

class Data {

    private var timer: CountDownTimer? = null
    private var seconds: Long = 0
    var numberHole: Int = 0

    // Инициализация таймера
    suspend fun startCountDownTimer(
        timeMillis: Long,
        view: TextView,
        btn1: TextView,
        btn2: TextView,
        btn3: TextView,
        btn4: TextView,
        btn5: TextView,
        btn6: TextView,
        btn7: TextView,
        btn8: TextView,
        btn9: TextView,
        onSuccess: () -> Unit
    ) {
        numberHole = 0
        timer?.cancel()
        timer = object : CountDownTimer(timeMillis, 600) {
            override fun onTick(time: Long) {

                seconds = time / 1000
                view.text = seconds.toString()
                numberHole = (0..9).random()

                btn1.setBackgroundResource(R.drawable.hole)
                btn2.setBackgroundResource(R.drawable.hole)
                btn3.setBackgroundResource(R.drawable.hole)
                btn4.setBackgroundResource(R.drawable.hole)
                btn5.setBackgroundResource(R.drawable.hole)
                btn6.setBackgroundResource(R.drawable.hole)
                btn7.setBackgroundResource(R.drawable.hole)
                btn8.setBackgroundResource(R.drawable.hole)
                btn9.setBackgroundResource(R.drawable.hole)

                when (numberHole) {
                    1 -> btn1.setBackgroundResource(R.drawable.mole)
                    2 -> btn2.setBackgroundResource(R.drawable.mole)
                    3 -> btn3.setBackgroundResource(R.drawable.mole)
                    4 -> btn4.setBackgroundResource(R.drawable.mole)
                    5 -> btn5.setBackgroundResource(R.drawable.mole)
                    6 -> btn6.setBackgroundResource(R.drawable.mole)
                    7 -> btn7.setBackgroundResource(R.drawable.mole)
                    8 -> btn8.setBackgroundResource(R.drawable.mole)
                    9 -> btn9.setBackgroundResource(R.drawable.mole)
                }
            }
            override fun onFinish() {
                // Лямбда для обработки события окончания таймера (занесение очков в bundle и переход в другой фрагмент)
                onSuccess()
            }
        }.start()
    }

    fun cancelCountDownTimer() {
        timer?.cancel()
    }

}