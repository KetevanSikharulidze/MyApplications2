package com.example.mobilapplications2

open class Group(protected val groupName: String,
                 private val studentsAmount: Int) : Any(){

}

class Student(groupName: String, studentsAmount: Int, val name: String, val id: String):
    Group(groupName, studentsAmount){

//    fun printDetail(){
//        println("group name is $groupName" + "students amounts is $studentsAmount")
//    }

}

fun main(){

}