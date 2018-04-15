(ns logparse.Application
  (:require [clojure.test :as t]
            [clojure.tools.cli :as cli]
            [logparse.core :as logparse])
  (:gen-class))

(defn -main [& args]
  (if-not args (do  (.println *err* "Usage: !") (System/exit -1))
    (logparse/log "TODO: implement argsparse")))

