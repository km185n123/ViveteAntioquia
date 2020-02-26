package com.example.vivetelaantioquia.main.view

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.onNavDestinationSelected
import com.example.vivetelaantioquia.R
import com.example.vivetelaantioquia.databinding.MainActivityBinding
import kotlinx.android.synthetic.main.main_activity.*


class MainActivity : AppCompatActivity() {

    lateinit var binding:MainActivityBinding
    lateinit var navController:NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.main_activity)
        setSupportActionBar(toolbar)
        toolbar.setTitle(R.string.app_name)

        setupNavigation()

    }

    private fun setupNavigation() {
        navController = Navigation.findNavController(this,R.id.nav_host_fragment)
        NavigationUI.setupWithNavController(binding.bottomNavigation,navController)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(navController)
                || super.onOptionsItemSelected(item)
    }

}
