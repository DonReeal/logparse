(ns logparse.Application
  (:require [logparse.core :as logparse])
  (:gen-class))

(defn -main []
  (logparse/log "Running Clojure via java works!"))