package com.vaibhavmojidra.viewmodelfactorykotlin

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class ViewModalFactoryMainActivity(private val startingValue:Int):ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom( ViewModelMainActivity::class.java)){
            return  ViewModelMainActivity(startingValue) as T
        }
        throw IllegalArgumentException("Unkown ViewModal Class")
    }
}