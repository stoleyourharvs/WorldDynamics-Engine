<!-- ==================================================================== -->
<!--  WorldDynamics Engine – README                                      -->
<!--  Fill in the TODO blocks as you complete the rewrite (Argon v1.x).   -->
<!-- ==================================================================== -->

<p align="center">
  <img src="https://i.imgur.com/nYPYvn3.png" alt="WorldDynamics Engine Banner" width="1200">
</p>

<p align="center">
  <b>Govern • Trade • Thrive</b><br>
  <i>A next-gen civilization & geopolitics layer for Minecraft</i>
</p>

<p align="center">
  <!-- Shields.io badge examples; swap versions as you publish -->
  <a href="https://github.com/stoleyourharvs/worlddynamicsengine/releases">
    <img src="https://img.shields.io/github/v/release/stoleyourharvs/worlddynamics-engine?label=release" alt="Latest Release">
  </a>
  <img src="https://img.shields.io/badge/Minecraft-1.21.x-blue" alt="MC">
  <img src="https://img.shields.io/badge/Java-17%2B-orange" alt="Java">
  <img src="https://img.shields.io/badge/License-GPLv3-blue.svg" alt="License">
</p>

---

## Table of Contents
- [Features](#features)
- [Installation](#installation)
- [Configuration](#configuration)
- [Commands & Permissions](#commands--permissions)
- [Roadmap](#roadmap)
- [Contributing](#contributing)
- [Support](#support)
- [License](#license)

---

## Features
- Nation & province system built on chunk claims  
- Legislative workflow: propose → debate → vote → enact  
- Dynamic economy with item-backed currency and inflation controls  
- Diplomacy: treaties, embargoes, alliances, wars  
- Eco-simulation (pollution, resource depletion, climate events)  
- EventBus & API for addon modules  

> **Status:** Rewrite in progress (`v1.x` / codename **Argon**).  
> Core claiming & legislature modules are functional; other systems WIP.

---

## Installation
1. Download the latest **WorldDynamicsEngine** jar from the [releases page](https://github.com/stoleyourharvs/worlddynamic-sengine/releases).  
2. Drop it into the `/plugins` folder of a Paper/Spigot 1.21.x server.  
3. Start the server once to generate default configs.  
4. Edit `plugins/WorldDynamics/config.yml` as needed.  
5. `/wde reload` to apply changes.
