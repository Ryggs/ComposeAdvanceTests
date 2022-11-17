/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.composeadvanced.data

import androidx.lifecycle.viewmodel.CreationExtras

/**
 * Simple Watch repository for fake watch models.
 */
class WatchRepository(
    private val watchLocalDataSource: WatchLocalDataSource
) {
    val watches: List<WatchModel> = watchLocalDataSource.watches

    fun getWatch(id: Int): WatchModel? {
        return watchLocalDataSource.watches.firstOrNull {
            it.modelId == id
        }
    }

    companion object {
        val WATCH_REPOSITORY_KEY = object : CreationExtras.Key<WatchRepository> {}
    }
}
