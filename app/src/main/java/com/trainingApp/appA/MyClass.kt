package com.trainingApp.appA

fun main(args: Array<String>) {
    val ii = arrayListOf<String>("hhg","kdjfkjg","fff")
    val list = ii.filter { r -> r.contentEquals("hhg") }
        .toList();

}

open class TestClass(name : String , Family : String?){

    open fun getPerson(person : String?)
    {

    }
}