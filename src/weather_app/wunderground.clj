(ns weather-app.wunderground
  (:require [clj-http.lite.client :as client]
            [environ.core :refer [env]]))


(comment

  (let [api-key (:wunderground-api-key env)
        date "20150526"
        city "Finland/Tampere"
        uri (format "http://api.wunderground.com/api/%s/history_%s/q/%s.xml"
                    api-key date city)]
    (client/get
      uri))

  )
