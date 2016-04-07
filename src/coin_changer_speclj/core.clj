(ns coin-changer-speclj.core)

(defn make-change [cents]
  (loop [cents  cents
         change []]
    (if (= cents 0)
      change
      (recur (dec cents) (conj change 1)))))
