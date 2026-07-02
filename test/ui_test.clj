(ns ui-test
  (:require [clojure.test :refer [deftest is]]
            [kotoba.ui :as ui]))

(deftest browser-ui-is-explicitly-platform-bound
  (is (thrown-with-msg? clojure.lang.ExceptionInfo
                        #"browser ClojureScript executor"
                        (ui/mount! nil)))
  (is (thrown-with-msg? clojure.lang.ExceptionInfo
                        #"browser ClojureScript executor"
                        (ui/render! nil [[:panel {:at :top-left}]]))))
