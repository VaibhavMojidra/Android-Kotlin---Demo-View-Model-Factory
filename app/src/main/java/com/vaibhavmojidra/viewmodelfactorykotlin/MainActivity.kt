package com.vaibhavmojidra.viewmodelfactorykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.vaibhavmojidra.viewmodelfactorykotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var viewModelMainActivity: ViewModelMainActivity
    private lateinit var viewModalFactoryMainActivity: ViewModalFactoryMainActivity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModalFactoryMainActivity= ViewModalFactoryMainActivity(12)
        viewModelMainActivity=ViewModelProvider(this,viewModalFactoryMainActivity).get(ViewModelMainActivity::class.java)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.apply {
            textView.text=viewModelMainActivity.getCurrentCount().toString()
            increment.setOnClickListener {
                textView.text = viewModelMainActivity.getUpdatedCount().toString()
            }
        }
    }
}