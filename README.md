# bazel-java-starter

## Install Bazel
https://bazel.build/install/bazelisk 
and fix the `"bazel.executable": "/home/dhaval/go/bin/bazelisk"` in `.vscode/settings.json` 

## Setup VS Code
- Install Java Extension Pack
- Install Bazel Extension by Google 

## Run the Build
```bash
bazel build //java/com/example:my_app
bazel run //java/com/example:my_app
```