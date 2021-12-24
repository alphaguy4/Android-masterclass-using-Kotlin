package com.example.buttoncounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var totalButtonClicks: Int = 0
    private val ACTIVITY_LABEL: String = "MainActivity"
    private val KEY: String = "key"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(ACTIVITY_LABEL, "onCreate called")

        // With kotlin-android-ext plugin we can avoid
        // below code and use the ids directly as variable in code
        val userInput: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)
        textView = findViewById(R.id.textView)

        textView?.text = "Let's do some button clicks :-)\n"
        userInput.setText("")

        textView?.movementMethod = ScrollingMovementMethod()


        button.setOnClickListener {
            textView?.append(userInput.text)
            textView?.append("\n")
//            userInput.text.clear()
            userInput.setText("")
        }


//        button?.setOnClickListener(object: View.OnClickListener {
//            override fun onClick(p0: View?) {
//                totalButtonClicks += 1
//                textView?.append("\nTotal taps: $totalButtonClicks")
//            }
//        })

//        button?.setOnClickListener(View.OnClickListener { view ->
//        })
    }

    override fun onStart() {
        Log.i(ACTIVITY_LABEL, "OnStart called")
        super.onStart()
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        Log.i(ACTIVITY_LABEL, "onRestoreInstanceState called")
        val string = savedInstanceState.getString(KEY, "")
        textView?.text = string
        super.onRestoreInstanceState(savedInstanceState)
    }

    override fun onResume() {
        Log.i(ACTIVITY_LABEL, "onResume called")
        super.onResume()
    }

    override fun onPause() {
        Log.i(ACTIVITY_LABEL, "onPause called")
        super.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i(ACTIVITY_LABEL, "onSaveInstanceState called")
        super.onSaveInstanceState(outState)
        outState.putString(KEY, textView?.text.toString())
    }

    override fun onStop() {
        Log.i(ACTIVITY_LABEL, "onStop called")
        // recommend to save the data here
        super.onStop()

    }

    override fun onDestroy() {
        Log.i(ACTIVITY_LABEL, "onDestroy called")
        super.onDestroy()
    }

}