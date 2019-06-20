;; The first three lines of this file were inserted by DrRacket. They record metadata
;; about the language level of this file in a form that our tools can easily process.
#reader(lib "htdp-advanced-reader.ss" "lang")((modname scheme-math) (read-case-sensitive #t) (teachpacks ()) (htdp-settings #(#t constructor repeating-decimal #t #t none #f () #f)))
(define PI 3.14159265359)
(define EULERS_NUMBER 2.71828182845)
(define GOLDEN_RATIO 1.61803398875)

(define (square n) 
  (* n n))

(define (absolute n)
  (if (< n 0)
    (- n)
    n))

(define (cube n)
  (* n n n))

(define (rectangle-area l w)
  (* l w))

(define (square-area w)
  (square w))
