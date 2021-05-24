package com.vaibhavmojidra.viewmodelfactorykotlin

import androidx.lifecycle.ViewModel

class ViewModelMainActivity(startingValue:Int):ViewModel() {
    private var count=0;
    init {
        count=startingValue
    }
    fun getCurrentCount():Int{
        return count
    }
    fun getUpdatedCount():Int{
        return ++count
    }
}