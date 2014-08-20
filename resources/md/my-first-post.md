#My first post ever!

After years of wanting to blog for no good reason, I am finally on my way.

```clj
(defproject mahinshaw "0.1.0-SNAPSHOT"
  :description "mahinshaw source code"
  :url "mahinshaw.github.com"
  :license {:name "BSD 2 Clause"
            :url "http://opensource.org/licenses/BSD-2-Clause"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [stasis "2.2.0"]
                 [ring "1.3.0"]
                 [hiccup "1.0.5"]
                 [me.raynes/cegdown "0.1.1"]]

  :ring {:handler mahinshaw.web/app}

  :plugins [[lein-ring "0.8.11"]])
```
