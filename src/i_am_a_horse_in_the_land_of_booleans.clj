(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean [x]
  (if x true false)
  )

(defn abs [x]
  (if (< x 0)
  (* x -1)
  x
  ))

(defn divides? [divisor n]
  (if (== (mod n divisor) 0)
    true
    false
    ))

(defn fizzbuzz [n]
  (cond
    (== (mod n 15) 0) "gotcha!"
    (== (mod n 3) 0) "fizz"
    (== (mod n 5) 0) "buzz"
    :else             ""

))

(defn teen? [age]
  (if (<= 13 age 19)
    true
    false
    ))

(defn not-teen? [age]
  (not (teen? age))
   )

(defn generic-doublificate [x]
  (cond
  (number? x)   (* x 2)
  (empty? x)    nil
  (list? x)     (* 2 (count x))
  (vector? x)   (* 2 (count x))
  :else         true
  ))

(defn leap-year? [year]
  (cond
   (not (== (mod year 4) 0)) false
   (not (== (mod year 100) 0)) true
   (not (== (mod year 400) 0)) false
   :else true
  ))

; '_______'

(leap-year? 100) ;=> false
(leap-year? 200) ;=> false
(leap-year? 400) ;=> true
(leap-year? 12)  ;=> true
(leap-year? 20)  ;=> true
(leap-year? 15)  ;=> false
