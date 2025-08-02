(require '[clojure.string :as str])
(require 'ssgr)

(defn add-class [html & classes]
  (update html 0 (fn [tag] (keyword (subs (str/join "." (cons tag classes)) 1)))))

(defn carousel-slide [& {:keys [title subtitle img alt-text]}]
  [:div.carousel-item.bg-black
   [:img {:src img :alt alt-text
          :style "width: 100%; height: auto; min-height: 500px; object-fit: cover;"}]
   [:div.carousel-caption.text-light.p-4.text-end
    {:style "filter:drop-shadow(5px 5px 10px #000000);"}
    [:h1.display-4.fw-bold (ssgr/markdown title)]
    [:p.fs-3 (ssgr/markdown subtitle)]]])

(defn carousel [& slides]
  (let [id (str "#carousel" (rand-int 1000))]
    [(keyword (str "div" id ".carousel.slide.carousel-fade.pb-2"))
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

(defn featurette
  [& {:keys [title subtitle content img]}]
  [:div.container
   [:div.row.featurette
    [:div.col-md-6
     (when title
       [:h2.featurette-heading.fw-normal.lh-1 (ssgr/markdown title)])
     (when subtitle
       [:h2.text-body-secondary (ssgr/markdown subtitle)])
     (when content
       [:p.lead (ssgr/markdown content)])]
    [:div.col-md-6
     [:img.w-100.rounded-3.shadow {:src img}]]]])

(defn columns [& column-data]
  [:div.container.text-center.py-5
   [:div.row.justify-content-center
    (map (fn [{:keys [icon title content]}]
           [:div {:class (str "col-lg-" (int (/ 12 (count column-data))))}
            icon
            [:h2.mt-2.fw-normal (ssgr/markdown title)]
            [:p (ssgr/markdown (str/join "\n\n" content))]])
         column-data)]])

(defn youtube-video [embed-url]
  [:p.video-container
   [:iframe.w-100.h-100
    {:src embed-url
     :frameborder "0"
     :allow
     "accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share"
     :referrerpolicy "strict-origin-when-cross-origin"
     :allowfullscreen true}]])