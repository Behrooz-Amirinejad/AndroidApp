package com.trainingApp.appA.InjectionClasss

import javax.inject.Inject

public class ClassB  {
    @Inject constructor()

    var classC : ClassC? = null
        @Inject set

    fun getvalue():String?{
        return(classC?.getValue())
    }
}