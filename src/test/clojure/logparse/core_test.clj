(ns logparse.core-test
  (:require [clojure.test :as t]
            [logparse.core :as logparse]))

(t/deftest test-log
  (t/is
    (= nil  (logparse/log "ignored"))))