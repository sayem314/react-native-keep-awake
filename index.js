import React, { useEffect } from "react";
import { NativeModules } from "react-native";

export function activateKeepAwake() {
  NativeModules.KCKeepAwake.activate();
}

export function deactivateKeepAwake() {
  NativeModules.KCKeepAwake.deactivate();
}

export function useKeepAwake() {
  useEffect(() => {
    activateKeepAwake();
    return () => deactivateKeepAwake();
  }, []);
}

export default function KeepAwake() {
  useEffect(() => {
    activateKeepAwake();
    return () => deactivateKeepAwake();
  }, []);

  return null;
}