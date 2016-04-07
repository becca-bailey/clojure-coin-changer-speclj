(ns coin-changer-speclj.core)

(def coins [25 10 5 1])

(defn find-max-coin [cents]
  (loop [possible-coins coins]
    (if (>= cents (first possible-coins))
      (first possible-coins)
      (recur (rest possible-coins)))))

(defn make-change [cents]
  (loop [cents  cents
         change []]
    (if (= cents 0)
      change
      (let [coin (find-max-coin cents)]
        (recur (- cents coin) (conj change coin))))))
