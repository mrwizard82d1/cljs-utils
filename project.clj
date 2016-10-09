(defproject cljs-utils "0.1.0-SNAPSHOT"
  :description "Useful utility functions."
  :url "http://example.com/FIXME"
  :license {:name "Apache 2.0 License"
            :url "https://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.8.0"]i
                 [org.clojure/clojurescript "1.8.51" :classifier "aot"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.2"]]
  :npm {:dependencies [[source-map-support "0.4.2"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
