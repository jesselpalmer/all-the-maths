(ns all-the-maths.core)

(def PI 3.14159265359)
(def EULERS_NUMBER 2.71828182845)
(def GOLDEN_RATIO 1.61803398875)

(defn square 
  [n]
  (* n n))

(defn cube
  [n]
  (* n n n))

(defn absolute
  [n]
  (if (< n 0)
    (- n)
    n))

(defn rectangle-area
  [l w]
  (* l w))

(defn square-area
  [n]
  (square n))

(defn triangle-area
  [b h]
  (/ (* b h) 2))
