package com.clicktype

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.Callback
import android.view.MotionEvent

class ClickTypeModule(reactContext: ReactApplicationContext) :
  ReactContextBaseJavaModule(reactContext) {

  override fun getName(): String {
    return NAME
  }

  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  fun getClickType(event: MotionEvent, callback: Callback) {
      if (event.toolType == MotionEvent.TOOL_TYPE_MOUSE) {
          callback.invoke("mouse")
      } else if (event.toolType == MotionEvent.TOOL_TYPE_FINGER) {
          callback.invoke("touch")
      } else {
          callback.invoke("unknown")
      }
  }

  companion object {
    const val NAME = "ClickType"
  }
}
