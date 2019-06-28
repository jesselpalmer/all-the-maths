(ns all-the-maths.core-test
  (:require [clojure.test :refer :all]
            [all-the-maths.core :refer :all]))

(testing "core"
  (testing "square"
    (is (= (square 5) 25))
    (is (= (square 0.3) 0.09))
    (is (= (square -43) 1849)))
  (testing "cube"
    (is (= (cube 3) 27))
    (is (= (cube 0.13) 0.002197))
    (is (= (cube -93) -804357)))
  (testing "absolute"
    (is (= (absolute 10) 10))
    (is (= (absolute -0.2313) 0.2313))
    (is (= (absolute -93) 93)))
  (testing "square-area"
    (is (= (square-area 5) 25))
    (is (= (square-area 10) 100)))
  (testing "rectangle-area"
    (is (= (rectangle-area 4 2) 8))
    (is (= (rectangle-area 3 121) 363)))
  (testing "triangle-area"
    (is (= (triangle-area 3 2) 3))
    (is (= (triangle-area 12 24) 144)))
  (testing "circle-area"
    (is (= (circle-area 5) 78.53981633975))
    (is (= (circle-area 17) 907.92027688751))))
