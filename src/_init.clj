(require '[ssgr :refer [register-callback!]])
(require '[ssgr.token :as t])
(require '[clojure.string :as str])

(def title "Roboliga Virtual")

(def menu
  {"Inicio" "index.html"
   "Reglamento" {"Sumo" "reglamentos_sumo.html"
                 "Fútbol" "reglamentos_futbol.html"
                 "Rescate" "reglamentos_rescate.html"}
   "Tutoriales" {"Sumo"    "tutoriales_sumo.html"
                 "Fútbol"  "tutoriales_futbol.html"
                 "Rescate" "tutoriales_rescate.html"}
   "Descargas" "descargas.html"
   "Calendario" "calendario.html"
   "Preguntas" "faq.html"})

(defn navbar-button [file-name [name value]]
  (if (string? value)
    (let [current? (= file-name value)]
      [:li.nav-item.mx-2
       [:a.nav-link
        (cond-> {:href value}
          current? (assoc :aria-current "page"
                          :class "active text-info"))
        name]])
    (let [current? (contains? (set (vals value)) 
                              file-name)]
      [:li.nav-item.dropdown.mx-2
       [:a.nav-link.dropdown-toggle
        (cond-> {:href "#" :role "button" :data-bs-toggle "dropdown"
                 :aria-expanded "false"}
          current? (assoc :aria-current "page"
                          :class "active text-info"))
        name]
       (apply conj [:ul.dropdown-menu]
              (map (fn [[k v]]
                     [:li
                      [:a.dropdown-item {:href v}
                       k]])
                   value))])))

(defn navbar [file-name]
  [:nav.navbar.navbar-expand-lg.sticky-top ;.bg-body-tertiary
   {:style "background-color: rgba(20, 20, 20, 1);"}
   [:div.container-fluid
    [:a.navbar-brand {:href "index.html"} title]
    [:button.navbar-toggler {:type "button"
                             :data-bs-toggle "collapse"
                             :data-bs-target "#navbarNavDropdown"
                             :aria-controls "navbarNavDropdown"
                             :aria-expanded "false"
                             :aria-label "Toggle navigation"}
     [:span.navbar-toggler-icon]]
    [:div#navbarNavDropdown.collapse.navbar-collapse.justify-content-end
     [:ul.navbar-nav
      (map (partial navbar-button file-name)
           menu)]]]])

(def footer
  [:div.container-fluid.border-top.pt-4.my-5
   [:footer.d-flex.flex-wrap.justify-content-between.align-items-center
    [:div.col-md-4.mb-3.mb-md-0.text-body-secondary
     "Copyright ©2021 Roboliga Virtual, All Rights Reserved"]
    [:ul.nav.col-md-4.justify-content-end.list-unstyled.d-flex
     [:li.ms-1
      [:a.text-body-secondary {:target "_blank" :href "http://www.facebook.com/Roboliga"}
       [:i.fa-brands.fa-facebook.fa-2x.fa-fw]]]
     [:li.ms-1
      [:a.text-body-secondary
       {:target "_blank"
        :href "http://www.youtube.com/channel/UC-0P2S8oH9xz2GwEWj160dw"}
       [:i.fa-brands.fa-youtube.fa-2x.fa-fw]]]]]])

(defn apply-layout [document file-name]
  [:html {:lang "en" :data-bs-theme "dark"}
   [:head
    [:title title]
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:link {:rel "stylesheet" :href "https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
            :integrity "sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
            :crossorigin "anonymous"}]
    [:link {:rel "stylesheet" :href "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css"
      :integrity "sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg=="
      :crossorigin "anonymous" :referrerpolicy "no-referrer"}]
    [:link {:rel "stylesheet" :href "style.css"}]]
   [:body
    (navbar file-name)
    (case file-name
      "index.html" document
      [:div.container.fs-5 document])
    footer
    [:script {:src "https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
              :integrity "sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
              :crossorigin "anonymous"}]
    [:script {:src "script.js"}]]])

(defn md->html [file-name]
  (-> file-name
      (str/replace #"^src[/\\]" "")
      (str/replace #".(clj)?md$" ".html")))

(defn add-class [html & classes]
  (update html 0 (fn [tag] (keyword (subs (str/join "." (cons tag classes)) 1)))))

(defn replace-tag [html tag]
  (assoc html 0 tag))

(defn render
  [{:keys [type] :as element} rendered]
  (case type
    :ssgr.doc/emphasis
    (let [char (-> element meta :token t/input-value first)
          tag (if (= \* char)
                :span.text-success
                :span.text-danger)]
      (replace-tag rendered tag))
    
    :ssgr.doc/heading
    (add-class rendered "pt-2" "my-4")

    :ssgr.doc/document
    (let [file-name (md->html (-> element meta :file))]
      (apply-layout rendered file-name))
    rendered))

(register-callback! render)