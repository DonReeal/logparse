(ns cli-it
  (:require [clojure.java.shell :as shell]
            [clojure.string :as s]
            [clojure.test :as t]))

(t/deftest exec-no-args
  (t/testing "Invoking the app without any arguments ..."
    (let [{:keys [exit err out]} (shell/sh "java" "-jar" "logparse.jar" :dir "target")]
      (t/is (= exit -1)
            "should terminate the process with code 0")
      (t/is (s/includes? (s/lower-case err) "usage:")
            "should print usage to err"))))
