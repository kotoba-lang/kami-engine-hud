# kotoba-lang/kami-engine-hud (shim → archived)

> **Merged into [`kami-engine-app-sdk`](https://github.com/kotoba-lang/kami-engine-app-sdk)
> (ADR-2607102200 addendum 2, 2026-07-10).** Namespace `kotoba.ui` (hiccup HUD
> overlay) now lives there alongside motion/sound/effect/rtc/widgets.
>
> New code must depend on **`kami-engine-app-sdk`**, not this repo.
> This package is a thin deps-only shim so old `:local/root "../kami-engine-hud"`
> paths still resolve `kotoba.ui` via the app-sdk dependency. The GitHub repo
> is archived.

```clojure
;; preferred
io.github.kotoba-lang/kami-engine-app-sdk {:local/root "../kami-engine-app-sdk"}
(require '[kotoba.ui :as ui])  ; still the same ns
```
