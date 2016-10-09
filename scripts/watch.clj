(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-utils-cljs.core
   :output-to "out/cljs_utils_cljs.js"
   :output-dir "out"})
