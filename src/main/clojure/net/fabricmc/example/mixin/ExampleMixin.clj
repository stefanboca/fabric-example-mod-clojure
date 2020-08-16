(ns net.fabricmc.example.mixin.ExampleMixin
  (:import
    (org.spongepowered.asm.mixin.injection.callback CallbackInfo)
    (org.spongepowered.asm.mixin Mixin)
    (net.minecraft.client.gui.screen TitleScreen)
    (org.spongepowered.asm.mixin.injection Inject At)
    (org.apache.logging.log4j Level)))

(gen-class
  :name ^{Mixin [TitleScreen]} net.fabricmc.example.mixin.ExampleMixin
  :prefix "exampleMixin-"
  ; Mixin methods must be defined in another namespace/package otherwise they cannot be referenced directly by spongepowered and an error is thrown
  :impl-ns net.fabricmc.example.impl.ExampleMixinImpl
  :methods [[^{Inject {:at (At "HEAD") :method "init()V"}} init [org.spongepowered.asm.mixin.injection.callback.CallbackInfo] void]]
  :main false)

