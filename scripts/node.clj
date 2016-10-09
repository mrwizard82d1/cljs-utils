(require 'cljs.build.api)

(println "Building for node...")

(cljs.build.api/build "src"
                      {:main 'cljs-utils.core
                       :output-to "out/cljs_utils.js"
                       :output-dir "out"
                       :target :nodejs
                       :verbose true})
