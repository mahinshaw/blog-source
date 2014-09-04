(ns mahinshaw.layout
  (:require [clojure.string :as str]
            [hiccup.page :refer [html5]]
            [optimus.link :as link]))

;; Hiccup template for page layout
(defn layout-page [request page]
  (html5
    [:head
     [:meta {:charset "utf-8"}]
     [:meta {:name "viewport"
             :content "width=device-width, initial-scale=1.0"}]
     [:title "Lost in the sauce"]
     [:link {:rel "stylesheet" :href (link/file-path request "/styles/main.css")}]
     [:link {:rel "script" :href (link/file-path request "js/jquery-2.1.1.min.js")}]
     [:link {:rel "script" :href (link/file-path request "js/app.js")}]]
    [:body
     [:header.centered-navigation
      [:div.centered-navigation-wrapper
       []]]
     [:div.logo "mahinshaw"]
     [:div.body page]]))


