package com.trainingApp.appA

import androidx.appcompat.app.AppCompatActivity
import javax.inject.Inject

open class MasterActivity @Inject constructor():  AppCompatActivity(){

     open fun  getNumber() : Int {return 10;}
 }