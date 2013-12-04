(ns core-async-cljs-sandbox.server
  (:require [ring.adapter.jetty :as jetty]
            [ring.middleware.resource :as resources]
            [ring.util.response :as response])
  (:gen-class))

(defn wrap-dir-index [handler]
  (fn [req] 
    (handler (update-in req [:uri] #(if (= "/" %) "/index.html" %)))))

(defn handler [request]
  (prn request)
  (response/not-found "Not found"))

(def app 
  (-> handler
      (resources/wrap-resource "public")
      (wrap-dir-index)))

(defn -main [& args]
  (jetty/run-jetty app {:port 3000}))
