package com.trainingApp.appA.InjectionClasss

import javax.inject.Inject

public class FinalClass @Inject constructor(){
    fun getFalgg( msg : String?):String?{

        return("Class Injected");
    }
}