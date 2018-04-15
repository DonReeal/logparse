# logparse

## running event-frequencies against example.csv

1. launch repl (currently only possible via repl as java cli work in progress)
    ```bash
    $ mvn clojure:repl
    ```
2. run basic example from withing repl using default regex for matching events: message={event} and summarizing all events found (unfiltered):
    ```clojure
    user=> (require '[logparse.core :as logparse])
    nil
    user=> (logparse/event-frequencies "example.csv")
    {"APP-ID-USER-LOGGED-IN" 36736, "APP-ID-USER-LOG-BEFORE-POST" 18368}
    ```
