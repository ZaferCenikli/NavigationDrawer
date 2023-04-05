package com.first.navigation_drawer

import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.baslik.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navhostfragment=supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(navigationView,navhostfragment.navController)
        val baslik=navigationView.inflateHeaderView(R.layout.baslik)
        baslik.textView3.text="Baslik2"


        toolbar.title="Baslik"
        val toggle =ActionBarDrawerToggle(this,Drawer,toolbar,0,0)
        Drawer.addDrawerListener(toggle)
        toggle.syncState()
    }

    override fun onBackPressed() {
        if(Drawer.isDrawerOpen(GravityCompat.START)){
            Drawer.closeDrawer(GravityCompat.START)
        }else{


        super.onBackPressed()}
    }
}