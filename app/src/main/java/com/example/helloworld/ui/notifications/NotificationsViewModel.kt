/**************************************************************************************************
 * VIDI VINI VIKI                                                                                 *
 * Copyright ©  22:11 2021 -1 -9  Lambert All rights reserved.                                    *
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

package com.example.helloworld.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment,yes There are no \"Hello,World!\"that you want."
    }
    val text: LiveData<String> = _text
}