(ns all-the-maths.core-test
  (:require [clojure.test :refer :all]
            [all-the-maths.core :refer :all]))

(testing "core"
  (testing "square"
    (is (= (square 5) 25))
    (is (= (square 0.3) 0.09))
    (is (= (square -43) 1849))
    (is (= (square -0.53) 0.28090000000000004)))
  (testing "cube"
    (is (= (cube 3) 27))
    (is (= (cube 0.13) 0.002197))
    (is (= (cube -93) -804357))
    (is (= (cube -0.74) -0.405224)))
  (testing "absolute"
    (is (= (absolute 10) 10))
    (is (= (absolute 6.59) 6.59))
    (is (= (absolute -88) 88))
    (is (= (absolute -0.2414) 0.2414)))
  (testing "square-area"
    (is (= (square-area 5) 25))
    (is (= (square-area 10) 100))
    (is (= (square-area 44.232) 1956.469824)))
  (testing "rectangle-area"
    (is (= (rectangle-area 4 2) 8))
    (is (= (rectangle-area 3 121) 363)))
  (testing "triangle-area"
    (is (= (triangle-area 3 2) 3))
    (is (= (triangle-area 12 24) 144)))
  (testing "circle-area"
    (is (= (circle-area 5) 78.53981633975))
    (is (= (circle-area 17) 907.92027688751)))
  (testing "trapezoid-area"
    (is (= (trapezoid-area 10 6 8) 64))
    (is (= (trapezoid-area 7.5 4.9 3.3) 20.46))))
