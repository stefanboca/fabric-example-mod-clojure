(ns net.fabricmc.example.impl.ExampleMixinImpl
  (:require [net.fabricmc.example.ExampleMod :refer [exampleMod-log]])
  (:import (org.spongepowered.asm.mixin.injection.callback CallbackInfo)
           (org.apache.logging.log4j Level)))

(defn exampleMixin-onInit
  [this, ^CallbackInfo callbackInfo]
  (exampleMod-log Level/INFO "This line is printed by an example mixin written in Clojure!"))
