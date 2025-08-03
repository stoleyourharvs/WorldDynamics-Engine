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

> [!WARNING]  
> This README is for version **1.0-ARGON** which is currently unreleased. Versions pre 1.0 are unstable and there will be NO SUPPORT for them. Do not bother opening issues for them, just wait for 1.0!
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
> Watch this space for new releases!

---

## Installation
1. Download the latest **WorldDynamicsEngine** jar from the [releases page](https://github.com/stoleyourharvs/worlddynamic-sengine/releases).  
2. Drop it into the `/plugins` folder of a Paper/Spigot 1.21.x server.  
3. Start the server once to generate default configs.  
4. Edit `plugins/WorldDynamics/config.yml` as needed.  
5. `/wde reload` to apply changes.

---

## Configuration

Everything lives in `plugins/WorldDynamics/config.yml`.  
Below is a **cheat-sheet** of the keys you’ll touch most often.  
WDE currently piggy-backs on **[Towny](https://www.spigotmc.org/resources/towny-advanced.72694/) for land** and **[Vault](https://www.spigotmc.org/resources/vault.34315/) for economy**, keep those hooks enabled unless you know what you’re doing.

| Section / Key                         | Default  | Purpose / Notes |
|---------------------------------------|----------|-----------------|
| `general.language`                    | `en`     | Locale for all messages. |
| `general.autosave-interval`           | `600`    | Ticks between automatic DB flushes (30 s). |
| `integration.towny-hook`              | `true`   | **Required** until WDE has its own claiming; `false` = plugin aborts. |
| `integration.vault-hook`              | `true`   | Enables Vault API for currency balance & formatting. |
| `integration.towny-events-cache`      | `100`    | Recent Towny events held in RAM for quick look-ups. |
| `legislature.vote-duration`           | `180`    | Seconds players have to vote on a bill. |
| `economy.currency-item`               | `EMERALD`| Physical item backing WDE’s internal currency. Ignored if `vault-hook` is `true`. |
| `debug.log-level`                     | `INFO`   | `INFO`, `DEBUG`, or `TRACE` for extra console detail. |

After editing, run `/wde reload` or restart the server to apply changes.

---

## Commands & Permissions

Full command & node reference will live in the wiki; below is just the “starter kit.”
All commands use `/wde` as the root alias.

| Command (short form)                      | Permission              | What it does                              |
|-------------------------------------------|-------------------------|-------------------------------------------|
| `/wde` (no args)                          | `wde.use`               | Shows help / version banner.              |
| `/wde reload`                             | `wde.admin.reload`      | Reloads config files without restart.     |
| `/wde nation create <name>`               | `wde.nation.create`     | Founds a new nation (Towny-backed).       |
| `/wde nation disband`                     | `wde.nation.disband`    | Disbands the player’s nation.             |
| `/wde bill propose "<title>"`             | `wde.legislature.propose` | Starts a vote.                         |
| `/wde treasury deposit <amount>`          | `wde.economy.treasury`  | Deposit to nation treasury.               |
| `/wde debug perf`                         | `wde.debug`             | Shows per-module TPS impact.              |

Wildcard nodes  
- `wde.*` – everything  
- `wde.admin.*` – reload, migrate, debug  
- `wde.nation.*` – create, manage, disband  
- `wde.legislature.*` – propose, vote, cancel  
- `wde.economy.*` – treasury, tax, trade  

Towny interaction  
- Land claiming remains **Towny commands / nodes** (`/town claim`, etc.).  
- WDE only checks Towny’s ownership data; no extra perms needed there.

> [!TIP]
> Give staff `wde.admin.*` + the usual Towny admin nodes, and fine-tune later.

---

## Roadmap
> [!NOTE]
> Moved to the [Projects](https://github.com/stoleyourharvs/WorldDynamics-Engine/projects) tab.

---

## Contributing

1. Fork the repo and create a feature branch (`feature/my-cool-thing`).  
2. Make sure `mvn clean package` passes with no warnings.  
3. Follow Google Java style; run IntelliJ’s auto-formatter before committing.  
4. Submit a PR and fill out the template—screenshots/logs help reviews.  
5. Docs PRs are welcome too (typos, examples, new pages).

> [!TIP]
> Open a Draft PR early if you want feedback while you code.

---

## Support

| Need help with… | Where to go |
|-----------------|-------------|
| Bugs / crashes  | Open a GitHub **Issue** with full stack-trace & steps. |
| Feature ideas   | Issue tracker or start a **Discussion** thread. |
| Quick questions | Search existing issues first, then start a discussion! |

Please avoid private DMs; public threads keep info searchable for everyone.

---

## License

WorldDynamics Engine is released under the **GNU General Public License v3.0**.  
See [`LICENSE`](LICENSE) for the legalese.

TL;DR: free to use, modify, and redistribute, just keep the source open and credit the project.
