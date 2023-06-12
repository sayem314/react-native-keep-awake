import React, { useEffect } from "react";

import ReactNativeKCKeepAwake from "./NativeKCKeepAwake";

export const activateKeepAwake = () => {
  ReactNativeKCKeepAwake.activate();
};

export const deactivateKeepAwake = () => {
  ReactNativeKCKeepAwake.deactivate();
};

export const useKeepAwake = () => {
  useEffect(() => {
    activateKeepAwake();
    return deactivateKeepAwake;
  }, []);
};

export default () => {
  useEffect(() => {
    activateKeepAwake();
    return deactivateKeepAwake;
  }, []);

  return null;
};
