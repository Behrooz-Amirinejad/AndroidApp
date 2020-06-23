package com.trainingApp.appA

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.trainingApp.appA.InjectionClasss.ClassA
import com.trainingApp.appA.InjectionClasss.IClassA
import dagger.Binds

import dagger.Component
import dagger.Module
import kotlinx.android.synthetic.main.activity_main.*

@Module
interface ClassAModule
{
    @Binds
    fun bindClassB(classA : ClassA) : IClassA
}

@Component(modules = [ClassAModule::class])
interface ProvideFactory
{
    fun provider():ClassA
}


class MainActivity : MasterActivity() {

    private val classA = DaggerProvideFactory.create().provider()

    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null)
            Log.e("saved instance is >>","Null");
        var i : Int = 10
        i = 12
        val mm :String = "10"
        val gi : Int? = mm.toIntOrNull()
        val myName : String = jhelloTxt.text.toString() ?: "May the Force be with you"
        Log.e("Checking is" , myName)

        var coll = hashMapOf<String,String>()
        coll.set("all" , "behrooz")
        var txt : String?
        jhelloTxt.apply {
            text = "hh"
            txt  = text.toString() + "10"
            text = txt
        }
        jhelloTxt.text = classA.getValue()



    }


    override fun onPause() {
        super.onPause()
    }
}
