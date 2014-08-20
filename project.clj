(defproject mahinshaw "0.1.0-SNAPSHOT"
  :description "mahinshaw source code"
  :url "mahinshaw.github.com"
  :license {:name "BSD 2 Clause"
            :url "http://opensource.org/licenses/BSD-2-Clause"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [stasis "2.2.0"]
                 [ring "1.3.0"]
                 [hiccup "1.0.5"]
                 [me.raynes/cegdown "0.1.1"]
                 [enlive "1.1.5"]
                 [clygments "0.1.1"]
                 [optimus "0.15.0"]]

  :ring {:handler mahinshaw.web/app}
  :aliases {"build-site" ["run" "-m" "mahinshaw.web/export"]}
  :profiles {:dev {:dependencies [[midje "1.6.3"]]
                   :plugins [[lein-ring "0.8.11"]]}
             :test {:dependencies [[midje "1.6.3"]]
                    :plugins [[lein-midje "3.1.3"]]}})

;; to run lein-midje tests use "lein with-profile test midje"
;; to auto test run "lein with-profile test midje :autotest"
