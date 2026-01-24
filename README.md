# AzHeal

Heal yourself or heal another player instantly! ❤️

## 🔧 Features

* Heal yourself with a simple command
* Heal other players easily
* Optional **health refill** and **hunger refill**
* **Auto-heal on join** (optional)
* **Sound effect** when using `/heal` (optional + configurable)
* **Customizable messages** (with prefix support)
* **Permissions support**
* **Update checker** (optional)
* Lightweight and easy to use

## 📥 Installation

1. Download the latest `.jar` file from the [Releases](https://github.com/AzenChire/AzHeal/releases) page
2. Drop the file into your server's `/plugins` folder
3. Start or reload your server
4. Use `/heal` to heal yourself or another player!

## ⚙️ Configuration

Here is the default `config.yml`:

```yaml
heal:
  health: true
  hunger: true
  on-join: true
  sound:
    enabled: true
    name: ENTITY_PLAYER_LEVELUP
    volume: 1.0
    pitch: 1.0

update-check:
  enabled: true

messages:
  prefix: "&d[AzHeal]&r "
  no-permission: "&cYou don't have permission."
  reloaded: "&aConfig reloaded."
  player-only: "&cOnly players can use this command."
  healed-self: "&aYou have been healed!"
  heal-error: "&cAn error occurred."
  heal-on-join: "&aYou have been healed on join!"
````

✅ [Click here for a list of Minecraft sounds](https://minecraft.fandom.com/wiki/Sounds.json)
✅ [Click here for Minecraft color codes](https://minecraft.fandom.com/wiki/Formatting_codes)

## 💬 Commands

| Command | Description                |
| ------- | -------------------------- |
| `/heal` | Heals yourself or a player |

## 🔐 Permissions

| Permission      | Description                                |
| --------------- | ------------------------------------------ |
| `azheal.use`    | Allows using `/heal`                       |
| `azheal.reload` | Allows using `/azheal reload`              |
| `azheal.onjoin` | Allows auto-heal on join                   |

> If you don’t use a permissions plugin, OP players can still use the commands by default.

## 🌍 Language Support

* ✅ English (default)
* 🌐 More languages coming soon!

## ❓ Need Help?

Join the support Discord to report bugs, suggest features, or get help:
🔗 **[https://discord.gg/4nzzkS8beg](https://discord.gg/4nzzkS8beg)**

---

Enjoy using AzHeal! ✨
