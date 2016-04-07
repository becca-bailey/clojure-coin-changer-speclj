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

  )
