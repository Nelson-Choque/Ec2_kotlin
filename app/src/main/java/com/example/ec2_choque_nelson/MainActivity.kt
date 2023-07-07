package com.example.ec2_choque_nelson

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ec2_choque_nelson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.navigationBar.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_camara -> {

                    val intent = Intent(this, CamaraActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_maps -> {

                    val intent = Intent(this, MapsActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.action_info -> {

                    val intent = Intent(this, InfoActivity::class.java)
                    startActivity(intent)
                    true
                }
                else -> false
            }}

    }
}