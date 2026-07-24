This React Native package allows you to prevent the screen from going to sleep while your app is active. It's useful for things like navigation or video playback, where the user expects the app to remain visible over long periods without touch interaction.

## Requirements

Version 2.0.0 is a breaking release for current React Native versions.

- React Native 0.82.0 or newer is required.
- Only the React Native New Architecture is supported.
- Android requires minSdkVersion 24 or newer.
- For React Native 0.60 through 0.81, use `@sayem314/react-native-keep-awake@1`.

## Installation

As the first step, install this module:

`yarn add @sayem314/react-native-keep-awake`

## Usage

#### example: hooks

```js
import { useKeepAwake } from '@sayem314/react-native-keep-awake';
import React from 'react';
import { Text, View } from 'react-native';

export default function KeepAwakeExample {
  useKeepAwake();

  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <Text>This screen will never sleep!</Text>
    </View>
  );
}
```

#### example: components

```js
import KeepAwake from '@sayem314/react-native-keep-awake';
import React from 'react';
import { Text, View } from 'react-native';

export default function KeepAwakeExample {
  return (
    <View style={{ flex: 1, alignItems: 'center', justifyContent: 'center' }}>
      <KeepAwake />
      <Text>This screen will never sleep!</Text>
    </View>
  );
}
```

#### example: functions

```js
import { activateKeepAwake, deactivateKeepAwake} from "@sayem314/react-native-keep-awake";
import React from "react";
import { Button, View } from "react-native";

export default class KeepAwakeExample extends React.Component {
  render() {
    return (
      <View style={{ flex: 1, alignItems: "center", justifyContent: "center" }}>
        <Button onPress={this._activate}>Activate</Button>
        <Button onPress={this._deactivate}>Deactivate</Button>
      </View>
    );
  }

  _activate = () => {
    activateKeepAwake();
  };

  _deactivate = () => {
    deactivateKeepAwake();
  };
}
```
