package com.example.myfamily

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myfamily.HomeFragment.Companion.newInstance
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val v=findViewById<BottomNavigationView>(R.id.bottom_bar)
          v.setOnItemSelectedListener{
              if(it.itemId==R.id.nav_guard) {
                  inflatement(GuardFragment.newInstance())
              }
              else if(it.itemId==R.id.nav_home){
                  inflatement(HomeFragment.newInstance())
              }


              true
          }

    }

    private fun inflatement(newInstance: Fragment) {
          val tran = supportFragmentManager.beginTransaction()
            tran.replace(R.id.container,newInstance)
            tran.commit()
    }


}