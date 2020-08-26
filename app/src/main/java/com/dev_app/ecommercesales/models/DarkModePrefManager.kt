package com.dev_app.ecommercesales.models

import android.content.SharedPreferences

/*class DarkModePrefManager(context: Context) {
    var pref: SharedPreferences
    var editor: SharedPreferences.Editor
    var _context: Context

    // shared pref mode
    var PRIVATE_MODE = 0
    fun setDarkMode(isFirstTime: Boolean) {
        editor.putBoolean(DarkModePrefManager.Companion.IS_NIGHT_MODE, isFirstTime)
        editor.commit()
    }

    val isNightMode: Boolean
        get() = pref.getBoolean(DarkModePrefManager.Companion.IS_NIGHT_MODE, true)

    companion object {
        // Shared preferences file name
        private const val PREF_NAME = "education-dark-mode"
        private const val IS_NIGHT_MODE = "IsNightMode"
    }

    init {
        _context = context
        pref = _context.getSharedPreferences(DarkModePrefManager.Companion.PREF_NAME, PRIVATE_MODE)
        editor = pref.edit()
    }
}

 */