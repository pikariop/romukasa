(ns unmocked-integrations
  (:require [ring.util.http-response :as http-response]))

(defn call-flaky-api [n]
  (->> (repeat n (http-response/ok))
       (cons (http-response/internal-server-error))
       (rand-nth)))

(defn call-api-bad-acl []
  (http-response/internal-server-error {:description "Resource not found / access denied / other (did=1234)"
                                        :code "2001"}))