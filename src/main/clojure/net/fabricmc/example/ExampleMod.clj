(ns net.fabricmc.example.ExampleMod
  (:require (clojure.core))
  (:import
    (org.apache.logging.log4j Level LogManager Logger))
  (:gen-class
    :prefix "exampleMod-"
    :implements [net.fabricmc.api.ModInitializer]
    :methods [^{:static true} [log [org.apache.logging.log4j.Level String] void]]))

(def LOGGER (LogManager/getLogger))
(def MOD_NAME "Example Mod")
(def MOD_ID "modid")

(defn exampleMod-log [level, message] (.log LOGGER level (str "[" MOD_NAME "] " message)))
(defn exampleMod-onInitialize [this] (exampleMod-log Level/INFO "Initializing"))
