(ns all-the-maths.core
  (:require [all-the-maths.constants :refer :all]))

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

(defn circle-area
  [r]
  (* PI (square r)))

(defn trapezoid-area
  [a b h]
  (* (/ (+ a b) 2) h))
