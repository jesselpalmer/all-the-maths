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

(define (triangle-area b w)
  (/ (* b w) 2))

;cube tests
(check-expect (cube 3) 27)
(check-expect (cube 0.13) 0.002197)
(check-expect (cube -93) -804357)

;square tests
(check-expect (square 5) 25)
(check-expect (square .3) 0.09)
(check-expect (square -43) 1849)

;absolute tests
(check-expect (absolute -10) 10)
(check-expect (absolute 50) 50)

;rectangle-area tests
(check-expect (rectangle-area 4 2) 8)
(check-expect (rectangle-area 3 121) 363)

;square-area tests
(check-expect (square-area 32) 1024)