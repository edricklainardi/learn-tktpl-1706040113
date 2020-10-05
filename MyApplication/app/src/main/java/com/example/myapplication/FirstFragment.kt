package com.example.myapplication

import android.app.Activity
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    var number:Int = 0
    var handler:Handler = Handler()
    var runnable:Runnable = Runnable{}

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_start).setOnClickListener {
            number = 0
            runnable=object:Runnable{
                override fun run() {
                    textview.text = number.toString()
                    number++
                    textview.text = number.toString()
                    handler.postDelayed(this,1000)
                }
            }
            handler.post(runnable)
        }
    }

    fun pressStart(view:View){
        number = 0
        runnable=object:Runnable{
            override fun run() {
                textview.text = number.toString()
                number++
                textview.text = number.toString()
                handler.postDelayed(this,1000)
            }
        }
        handler.post(runnable)
    }
}