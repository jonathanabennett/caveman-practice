(ns user
  (:require [example.system :as system]))

(def system nil)

(defn start-system!
  []
  (if system
    (println "System already started.")
    (alter-var-root #'system (constantly (system/start-system)))))

(defn stop-system!
  []
  (when system
    (system/stop-system system))
  (alter-var-root #'system (constantly nil)))

(defn server
  []
  (::system/server system))

(defn restart-system!
  []
  (stop-system!)
  (start-system!))
