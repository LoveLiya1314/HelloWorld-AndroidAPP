/**************************************************************************************************
 * VIDI VINI VIKI                                                                                 *
 * Copyright ©  1:25 2020 -12 -31  Lambert All rights reserved.                                   *
 *    Licensed under the Apache License, Version 2.0 (the "License");                             *
 *    you may not use this file except in compliance with the License.                            *
 *    You may obtain a copy of the License at                                                     *
 *                                                                                                *
 *      http://www.apache.org/licenses/LICENSE-2.0                                                *
 *                                                                                                *
 *    Unless required by applicable law or agreed to in writing, software                         *
 *    distributed under the License is distributed on an "AS IS" BASIS,                           *
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.                    *
 *    See the License for the specific language governing permissions and                         *
 *    limitations under the License.                                                              *
 *                                                                                                *
 * Love Liya Forever!                                                                             *
 *                                                                                                *
 **************************************************************************************************/


package com.example.helloworld

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }
}