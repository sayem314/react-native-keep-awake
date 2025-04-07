#import "ReactNativeKCKeepAwake.h"
#import "UIKit/UIKit.h"


#if RCT_NEW_ARCH_ENABLED
#import "ReactNativeKCKeepAwakeSpec.h"
#endif


@implementation ReactNativeKCKeepAwake

RCT_EXPORT_MODULE();

RCT_EXPORT_METHOD(activate)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        [[UIApplication sharedApplication] setIdleTimerDisabled:YES];
    });
}

RCT_EXPORT_METHOD(deactivate)
{
    dispatch_async(dispatch_get_main_queue(), ^{
        [[UIApplication sharedApplication] setIdleTimerDisabled:NO];
    });
}

# pragma mark - New Architecture
#if RCT_NEW_ARCH_ENABLED
- (std::shared_ptr<facebook::react::TurboModule>)getTurboModule:
    (const facebook::react::ObjCTurboModule::InitParams &)params
{
    return std::make_shared<facebook::react::NativeKCKeepAwakeSpecJSI>(params);
}
#endif

@end

