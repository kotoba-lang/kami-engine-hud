# kotoba-lang/kami-engine-hud

Kotoba runtime package for `kotoba.ui`: kami-engine's DOM-overlay HUD
(`:panel`/`:bar`/`:minimap`/`:text` widgets rendered over the WebGPU game
canvas). Renamed from `kotoba-lang/ui` to avoid collision with the
`kotoba-ui`/`appkit`/`uikit` app design-system family, which is an unrelated
stack (see `90-docs/adr/2607051200-kotoba-lang-ui-family-rename.md` in
`com-junkawasaki/root`).

## Test

```sh
clojure -M:test
```
