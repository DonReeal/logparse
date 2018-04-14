(ns logparse.core
  (:require [clojure.data.csv :as csv]
            [clojure.java.io :as io]))

(defn log [what] (println what))

(defn- pattern-matching [property-key k-v-separator]
  (format "(^%1$s%2$s|\\|%1$s%2$s)([^|^ ]*)([ |]|$)"
          property-key 
          (or k-v-separator "=")))          
          
(defn event-frequencies 
  ([csv-file] (event-frequencies csv-file "message" some?))
  ([csv-file event-property] (event-frequencies csv-file event-property some?))
  ([csv-file event-property value-filter-fn]
     (with-open [reader (io/reader csv-file)]
       (->> (csv/read-csv reader)
            (rest)
            (map #(nth % 2 ""))
            (filter some?)
            (map #(re-find (re-pattern (pattern-matching event-property "=")) %))
            (map #(nth % 2))
            (filter value-filter-fn)
            (frequencies)))))

