(require '[clojure.string :as str])

(defn add-class [html & classes]
  (update html 0 (fn [tag] (keyword (subs (str/join "." (cons tag classes)) 1)))))

(defn carousel-slide [& elements]
  [:div.carousel-item
   elements])

(defn carousel [& slides]
  (let [id (str "#carousel" (rand-int 1000))]
    [(keyword (str "div" id ".carousel.slide.pb-2"))
     {:data-bs-ride "carousel"}
     (apply conj [:div.carousel-indicators]
            (map (fn [idx]
                   [(if (= idx 0)
                      :button.active
                      :button)
                    {:type "button"
                     :data-bs-target id
                     :data-bs-slide-to (str idx)
                     :aria-current (= idx 0)
                     :aria-label (str "Slide " (inc idx))}])
                 (range (count slides))))
     (apply conj [:div.carousel-inner]
            (cons (add-class (first slides) "active")
                  (rest slides)))
     [:button.carousel-control-prev {:type "button"
                                     :data-bs-target id
                                     :data-bs-slide "prev"}
      [:span.carousel-control-prev-icon {:aria-hidden "true"}]
      [:span.visually-hidden "Previous"]]
     [:button.carousel-control-next {:type "button"
                                     :data-bs-target id
                                     :data-bs-slide "next"}
      [:span.carousel-control-next-icon {:aria-hidden "true"}]
      [:span.visually-hidden "Next"]]]))