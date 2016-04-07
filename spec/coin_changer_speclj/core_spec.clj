(ns coin-changer-speclj.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer-speclj.core :refer :all]))

(describe "coin changer"
  (it "returns an empty collection if 0 cents are given"
    (should= (make-change 0) []))

  (it "returns a penny if 1 cents are given"
    (should= (make-change 1) [1]))

  (it "returns two pennies if 2 cents are given"
    (should= (make-change 2) [1 1]))

  (it "returns a nickel if 5 cents are given"
    (should= (make-change 5) [5]))

  (it "returns a nickel and a penny if 6 cents are given"
    (should= (make-change 6) [5 1]))

  (it "returns a dime if 10 cents are given"
    (should= (make-change 10) [10]))

  (it "returns a dime and a penny if 11 cents are given"
    (should= (make-change 11) [10 1]))

  (it "returns a dime and a nickel if 15 cents are given"
    (should= (make-change 15) [10 5]))

  (it "returns a dime, a nickel, and a penny if 16 cents are given"
    (should= (make-change 16) [10 5 1]))

  (it "returns a quarter if 25 cents are given"
    (should= (make-change 25) [25]))

  (it "returns three quarters, 2 dimes, and 4 pennies if 99 cents is given"
    (should= (make-change 99) [25 25 25 10 10 1 1 1 1]))

  )
