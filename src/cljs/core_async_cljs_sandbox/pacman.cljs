(ns core-async-cljs-sandbox.pacman
  (:require-macros [cljs.core.async.macros :refer [go]]
                   [dommy.macros :refer [node sel sel1]])
  (:require [dommy.utils :as utils]
            [dommy.core :as d]
            [cljs.core.async :refer [put! chan <!]])
  (:import [goog.net Jsonp]
           [goog Uri]))

(def canvas (sel1 [:#pacman :canvas]))
(def context (.getContext canvas "2d"))

(.fillRect context 50 25 150 100)
