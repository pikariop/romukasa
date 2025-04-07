(ns unmocked-integrations-test
  (:require [clojure.test :refer [deftest is testing]]
            [ring.util.http-predicates :as http-p :refer [ok?]]
            [unmocked-integrations :as u-i]))

(deftest call-flaky-api-test-1
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-2
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-3
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-4
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-5
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-6
  (testing "with a chance of one `500` in 5 `200`s"
    (is (ok? (u-i/call-flaky-api 5)))))

(deftest call-flaky-api-test-7
  (testing "with a chance of one `500` in 10 `200`s"
    (is (ok? (u-i/call-flaky-api 10)))))

(deftest call-flaky-api-test-8
  (testing "with a chance of one `500` in 10 `200`s"
    (is (ok? (u-i/call-flaky-api 10)))))

(deftest call-flaky-api-test-9
  (testing "with a chance of one `500` in 15 `200`s"
    (is (ok? (u-i/call-flaky-api 15)))))

(deftest call-flaky-api-test-10
  (testing "with a chance of one `500` in 20 `200`s"
    (is (ok? (u-i/call-flaky-api 20)))))

(deftest call-api-bad-acl-test
  (testing "with bad acl, fails consistently"
    (is (ok? (u-i/call-api-bad-acl)))))
