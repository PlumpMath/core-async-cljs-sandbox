(defproject core-async-cljs-sandbox "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2030"]
                 [org.clojure/core.async "0.1.256.0-1bf8cf-alpha"]
                 [ring "1.1.8"]
                 [prismatic/dommy "0.1.1"]]
  :plugins [[lein-cljsbuild "1.0.0"]
            [lein-ring "0.8.3"]]
  :hooks [leiningen.cljsbuild]
  :source-paths ["src/clj"]
  :cljsbuild { 
    :builds {
      :main {
        :source-paths ["src/cljs"]
        :compiler {:output-to "resources/public/js/target/cljs.js"
                   :output-dir "resources/public/js/target"
                   :optimizations :none
                   :pretty-print true
                   :source-map true}
        :jar true}}}
  :main core-async-cljs-sandbox.server
  :ring {:handler core-async-cljs-sandbox.server/app})
