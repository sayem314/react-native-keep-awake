#pragma once

#include "JSValue.h"
#include "NativeModules.h"
#include "winrt/Windows.System.Display.h"

using namespace winrt::Microsoft::ReactNative;
using namespace winrt::Windows::System::Display;

namespace winrt::Sayem314ReactNativeKeepAwake
{

REACT_MODULE(ReactNativeModule, L"Sayem314ReactNativeKeepAwake")
struct ReactNativeModule
{

    REACT_INIT(Initialize)
    void Initialize(ReactContext const &reactContext) noexcept
    {
        m_reactContext = reactContext;
    }
    
    REACT_METHOD(Activate, L"activate")
        void Activate() noexcept
    {
        m_reactContext.UIDispatcher().Post([=]()
            {
                DisplayRequest().RequestActive();
            });
    }

    REACT_METHOD(Deactivate, L"deactivate")
        void Deactivate() noexcept
    {
        m_reactContext.UIDispatcher().Post([=]()
            {
                DisplayRequest().RequestRelease();
            });
    }

    private:
        ReactContext m_reactContext{nullptr};
};

} // namespace winrt::Sayem314ReactNativeKeepAwake
