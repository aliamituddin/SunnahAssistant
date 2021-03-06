package com.thesunnahrevival.sunnahassistant.data.model

import android.net.Uri
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "app_settings")
class AppSettings {
    @PrimaryKey(autoGenerate = true)
    var id = 0
    var formattedAddress: String? = ""
    var latitude = 0F
    var longitude = 0F
    var method = 0
    var asrCalculationMethod = 0
    var isAutomatic = false
    var month = 12
    var hijriOffSet = 0
    var isLightMode = true
    var isFirstLaunch = true
    var showNextReminderNotification = true
    var showOnBoardingTutorial = true
    var isDisplayHijriDate = true
    var savedSpinnerPosition = 0
    var isExpandedLayout = true
    var notificationToneUri: Uri? = null
    var isVibrate = false
    var priority = 3
    var latitudeAdjustmentMethod = 2
    var isShowHijriDateWidget = true
    var isShowNextReminderWidget = true
    var isAfterUpdate = false
    var categories: TreeSet<String>? = null
    var language: String = "en"
    var doNotDisturbMinutes: Int = 0
    var useReliableAlarms: Boolean = true
    var numberOfLaunches: Int = 0
}