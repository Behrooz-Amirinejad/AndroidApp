package com.trainingapp.business

import android.os.AsyncTask

public class ClassA {

    public fun gg(){
        val myTask = DoAsync()
        myTask.execute()

        val myThread = MyThread()
        myThread.start()
    }

    class DoAsync(): AsyncTask<Void, Int, Int>() {
        override fun doInBackground(vararg params: Void?): Int {
            return(10)
        }



    }

    class  MyThread():Thread(){
        public override fun run() {
            super.run()
        }
    }
}