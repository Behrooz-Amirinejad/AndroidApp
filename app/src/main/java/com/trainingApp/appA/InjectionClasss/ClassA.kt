package com.trainingApp.appA.InjectionClasss

import javax.inject.Inject
import dagger.Lazy
interface IClassA
{

    fun getValue():String?
}

public class ClassA @Inject constructor(private val classB: Lazy<ClassB>) : IClassA {
   override  public fun getValue():String?{
        return (classB.get().getvalue());

    }
}