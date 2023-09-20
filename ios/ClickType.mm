#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(ClickType, NSObject)

RCT_EXTERN_METHOD(
  getClickType:(NSDictionary *)options
  resolver:(RCTPromiseResolveBlock)resolve
  rejecter:(RCTPromiseRejectBlock)reject
)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
