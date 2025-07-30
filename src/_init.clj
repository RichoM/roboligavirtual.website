(require '[ssgr :refer [register-callback!]])

(def title "Roboliga Virtual")

(defn navbar []
  [:nav.navbar.navbar-expand-lg.bg-body-tertiary
   [:div.container-fluid
    [:a.navbar-brand {:href "#"} title]
    [:button.navbar-toggler {:type "button"
                             :data-bs-toggle "collapse"
                             :data-bs-target "#navbarNavDropdown"
                             :aria-controls "navbarNavDropdown"
                             :aria-expanded "false"
                             :aria-label "Toggle navigation"}
     [:span.navbar-toggler-icon]]
    [:div#navbarNavDropdown.collapse.navbar-collapse.justify-content-end
     [:ul.navbar-nav
      [:li.nav-item
       [:a.nav-link.active {:aria-current "page" :href "#"}
        "Inicio"]]
      [:li.nav-item.dropdown
       [:a.nav-link.dropdown-toggle
        {:href "#" :role "button" :data-bs-toggle "dropdown" :aria-expanded "false"}
        "Reglamento"]
       [:ul.dropdown-menu
        [:li
         [:a.dropdown-item {:href "reglamentos_sumo"}
          "Sumo"]]
        [:li
         [:a.dropdown-item {:href "reglamentos_futbol"}
          "Fútbol"]]
        [:li
         [:a.dropdown-item {:href "reglamentos_rescate"}
          "Rescate"]]]]
      [:li.nav-item.dropdown
       [:a.nav-link.dropdown-toggle
        {:href "#" :role "button" :data-bs-toggle "dropdown" :aria-expanded "false"}
        "Tutoriales"]
       [:ul.dropdown-menu
        [:li
         [:a.dropdown-item {:href "tutoriales_sumo"}
          "Sumo"]]
        [:li
         [:a.dropdown-item {:href "tutoriales_futbol"}
          "Fútbol"]]
        [:li
         [:a.dropdown-item {:href "tutoriales_rescate"}
          "Rescate"]]]]
      [:li.nav-item
       [:a.nav-link {:href "descargas"}
        "Descargas"]]
      [:li.nav-item
       [:a.nav-link {:href "calendario"}
        "CALENDARIO Y RESULTADOS"]]
      [:li.nav-item
       [:a.nav-link {:href "faq"}
        "Preguntas"]]]]]])

(defn apply-layout [document]
  [:html {:lang "en"}
   [:head
    [:title title]
    [:meta {:charset "utf-8"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:link {:rel "stylesheet" :href "https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
            :integrity "sha384-LN+7fdVzj6u52u30Kp6M/trliBMCMKTyK833zpbD+pXdCLuTusPj697FH4R/5mcr"
            :crossorigin "anonymous"}]
    [:link {:rel "stylesheet" :href "https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"}]
    [:link {:rel "stylesheet" :href "style.css"}]]
   [:body
    (navbar)
    document
    [:script {:src "https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"
              :integrity "sha384-ndDqU0Gzau9qJ1lfW4pNLlhNTkCfHzAVBReH9diLvGRem5+R9g2FzA8ZGN954O5Q"
              :crossorigin "anonymous"}]]])

(defn render
  [{:keys [type] :as element} rendered]
  (case type
    :ssgr.doc/document (apply-layout rendered)
    rendered))

(register-callback! render)