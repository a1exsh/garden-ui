(ns user
  (:require [nextjournal.clerk :as clerk]))

(clerk/serve! {:port 7890})

#_(clerk/clear-cache!)