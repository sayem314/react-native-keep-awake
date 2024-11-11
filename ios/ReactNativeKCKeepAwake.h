#if __has_include(<React/RCTBridgeModule.h>)
#import <React/RCTBridgeModule.h>
#elif __has_include("RCTBridgeModule.h")
#import "RCTBridgeModule.h"
#else
#import "React/RCTBridgeModule.h"
#endif

#if RCT_NEW_ARCH_ENABLED
#import <ReactCodegen/ReactNativeKCKeepAwakeSpec/ReactNativeKCKeepAwakeSpec.h>
#endif

@interface ReactNativeKCKeepAwake : NSObject <RCTBridgeModule>
@end

#if RCT_NEW_ARCH_ENABLED
@interface ReactNativeKCKeepAwake () <NativeKCKeepAwakeSpec>
@end
#endif
