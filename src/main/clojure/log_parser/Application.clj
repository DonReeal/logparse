(ns log-parser.Application
  (:require [log-parser.core :as lp.core])
  (:gen-class))

(defn -main []
  (lp.core/log "Running Clojure via java works!"))