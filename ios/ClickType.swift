import Foundation
import UIKit
import React

@objc(ClickType)
class ClickType: NSObject {
  @objc func getClickType(_ event: UIEvent, resolver: @escaping RCTPromiseResolveBlock, rejecter: @escaping RCTPromiseRejectBlock) {
      if let touches = event.allTouches {
          if let touch = touches.first {
              if touch.type == .indirect {
                  resolver("mouse")
                  return
              }
          }
      }
      resolver("touch")
  }

  @objc static func requiresMainQueueSetup() -> Bool {
      return true
  }
}
