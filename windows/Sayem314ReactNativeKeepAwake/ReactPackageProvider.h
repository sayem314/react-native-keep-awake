#pragma once
#include "ReactPackageProvider.g.h"

using namespace winrt::Microsoft::ReactNative;

namespace winrt::ReactNativeKcKeepAwake::implementation
{
    struct ReactPackageProvider : ReactPackageProviderT<ReactPackageProvider>
    {
        ReactPackageProvider() = default;

        void CreatePackage(IReactPackageBuilder const &packageBuilder) noexcept;
    };
} // namespace winrt::ReactNativeKcKeepAwake::implementation

namespace winrt::ReactNativeKcKeepAwake::factory_implementation
{

struct ReactPackageProvider : ReactPackageProviderT<ReactPackageProvider, implementation::ReactPackageProvider> {};

} // namespace winrt::ReactNativeKcKeepAwake::factory_implementation
