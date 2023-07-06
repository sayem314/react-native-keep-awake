import { TurboModule } from "react-native";

export interface Spec extends TurboModule {
  activate: () => void;
  deactivate: () => void;
}

declare const ReactNativeKCKeepAwake: Spec;

export default ReactNativeKCKeepAwake;
