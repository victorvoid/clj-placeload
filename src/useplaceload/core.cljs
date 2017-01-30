(ns useplaceload.core
  (:require ))

(enable-console-print!)

(def user (js/Placeload. ".user-placeload"))
(def myconfigDraw (js-obj "width" "180px" "height" "180px" "center" "true"))

(.draw user myconfigDraw)
(.log js/console  myconfigDraw)

(defn on-js-reload [])
