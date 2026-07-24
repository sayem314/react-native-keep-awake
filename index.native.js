import React, { useEffect, useId } from "react";

import ReactNativeKCKeepAwake from "./NativeKCKeepAwake";

let tags = [];

export const activateKeepAwake = (tagId) => {
  if (tags.length <= 0) {
    ReactNativeKCKeepAwake.activate();
  }
  tags.push(tagId);
};

export const deactivateKeepAwake = (tagId) => {
  tags = tags.filter((id) => id !== tagId);
  if (tags.length <= 0) {
    ReactNativeKCKeepAwake.deactivate();
  }
};

export const useKeepAwake = () => {
  const tagId = useId();
  useEffect(() => {
    activateKeepAwake(tagId);
    return () => deactivateKeepAwake(tagId);
  }, []);
};

export default () => {
  const tagId = useId();
  useEffect(() => {
    activateKeepAwake(tagId);
    return () => deactivateKeepAwake(tagId);
  }, []);

  return null;
};
