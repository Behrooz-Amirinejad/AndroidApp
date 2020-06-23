package com.trainingApp.appA.InjectionClasss

import javax.inject.Inject
import javax.inject.Provider



public class ClassC @Inject constructor(private val finalClass : Provider<FinalClass>){
    fun getValue(): String? {

        return(finalClass.get().getFalgg(""))
    }


}