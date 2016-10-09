(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-utils.core
   :output-to "out/cljs_utils.js"
   :output-dir "out"})
