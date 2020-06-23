package com.trainingApp.appA

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;

import kotlinx.android.synthetic.main.scond_layout.*
import javax.inject.Inject

class ScondActivity @Inject constructor(): MasterActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.scond_layout)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            textView33.text.toString().toInt();
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}
