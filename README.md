# Toggle Tab Placement

A small [Rider](https://www.jetbrains.com/rider/) / IntelliJ Platform plugin that adds an action to
toggle the editor tab placement between **Top** and **Left**.

This started life as a [LivePlugin](https://plugins.jetbrains.com/plugin/7282-liveplugin) script and
was migrated to a standalone Gradle-based plugin so it can be built, versioned, and installed like any
other IDE plugin.

## What it does

Registers an action, **Toggle Tab Placement (Top/Left)**, that flips
`UISettings.editorTabPlacement` between `SwingConstants.TOP` and `SwingConstants.LEFT` and fires a
UI settings change so the editor tabs move immediately.

## Requirements

- Rider 2026.2 or later (see `pluginSinceBuild` in `gradle.properties`)
- JDK 17 to build (auto-provisioned via the Gradle [Foojay toolchain resolver](https://github.com/gradle/foojay-toolchains) if not already installed)

## Building

```powershell
.\gradlew.bat buildPlugin
```

The plugin distribution zip is produced at `build\distributions\toggle-tab-placement-<version>.zip`.

## Installing

In Rider: **Settings → Plugins → gear icon → Install Plugin from Disk...**, then select the generated zip.

## Running / debugging

```powershell
.\gradlew.bat runIde
```

This launches a sandboxed instance of Rider with the plugin already installed.

## Project structure

| Path | Description |
|------|-------------|
| `src/main/kotlin/com/keir/toggletabplacement/ToggleTabPlacementAction.kt` | The `AnAction` implementation |
| `src/main/resources/META-INF/plugin.xml` | Plugin manifest and action registration |
| `build.gradle.kts` | Gradle build configuration (IntelliJ Platform Gradle Plugin) |
