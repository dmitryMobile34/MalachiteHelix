package com.habby.punbal

import android.animation.Animator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_gpmh.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class GPmh : AppCompatActivity() {

    var score: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gpmh)
        startBtn2.setOnClickListener {
            scoreTXT.text = score.toString()
            mainAnim.playAnimation()
            startBtn2.isClickable = false
            mainAnim.addAnimatorListener(object: Animator.AnimatorListener{
                override fun onAnimationStart(p0: Animator?) {}

                override fun onAnimationEnd(p0: Animator?) {}

                override fun onAnimationCancel(p0: Animator?) {}

                override fun onAnimationRepeat(p0: Animator?) {
                    if (score < 10) {
                        score++
                        scoreTXT.text = score.toString()
                        mainAnim.playAnimation()
                    } else {
                        mainAnim.pauseAnimation()
                        scoreTXT.text = "Jobs done."
                        startBtn2.text = "End"
                        startBtn2.isClickable = true

                        startBtn2.setOnClickListener {
                            Intent(applicationContext, Final::class.java).also { startActivity(it) }
                            finish() }

                        }
                    }

            })
        }
    }
}