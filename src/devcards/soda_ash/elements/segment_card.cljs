(ns soda-ash.elements.segment-card
  (:require-macros
   [devcards.core :refer [defcard-doc
                          defcard-rg
                          mkdn-pprint-source]])
  (:require
   [devcards.core]
   [reagent.core]
   [soda-ash.element :as se]
   [soda-ash.helpers :as h]
   [soda-ash.elements.segment :as segment]))


(def list-keys
  (h/list-keys segment/variations))

(defcard-doc
  (h/devcard-docs segment/opts))


(defcard-doc
  "Require the following:
   ```
  [soda-ash.element :as se]
  ```")



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Types

(defcard-doc
  "
---
# Types"
  (h/list-types segment/opts))


(defcard-doc
  "**Segment**"
  "A segment of content")

(defn type-default []
  [se/segment
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-default))

(defcard-rg default
  [type-default])



(defcard-doc
  "**Raised**"
  "A segment may be formatted to raise above the page")

(defn type-raised []
  [se/segment-raised
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-raised))

(defcard-rg raised
  [type-raised])



(defcard-doc
  "**Stacked**"
  "A segment can be formatted to show it contains multiple pages")

(defn type-stacked []
  [se/segment-stacked
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-stacked))

(defcard-rg stacked
  [type-stacked])


(defn type-tall-stacked []
  [se/segment-tall-stacked
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."
   ])

(defcard-doc
  (mkdn-pprint-source type-tall-stacked))

(defcard-rg tall-stacked
  [type-tall-stacked])



(defcard-doc
  "**Piled**"
  "A segment can be formatted to look like a pile of pages."
  "*Piled segments use negative z-index to format the additional pages
  below the segment. In order for them to appear correctly, your
  segment's offset container must have a z-index declared.*")

(defn type-piled []
  [se/segment-piled
   {:style {:z-index 1}} ;; Need a z-index
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source type-piled))

(defcard-rg piled
  [type-piled])



(defcard-doc
  "**Vertical Segment**"
  "A vertical segment formats content to be aligned as part of a
  vertical group")

(defn type-vertical []
  [:div
   [se/segment-vertical
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]
   [se/segment-vertical
    "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."]])

(defcard-doc
  (mkdn-pprint-source type-vertical))

(defcard-rg vertical
  [type-vertical])



;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; States

(defcard-doc
  "
---
# States"
  (list-keys "states"))


(defcard-doc
  "**Disabled**"
  "A segment may show its content is disabled")

(defn state-disabled []
  [se/segment {:data-soda :disabled}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source state-disabled))

(defcard-rg disabled
  [state-disabled])



(defcard-doc
  "**Loading**"
  "A segment may show its content is being loaded")

(defn state-loading []
  [se/segment {:data-soda :loading}
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source state-loading))

(defcard-rg loading
  [state-loading])




;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Variations

(defcard-doc
  "
---
# Variations")

(defcard-doc
  "**Attached**"
  "A segment can be attached to other content on a page. Attached
  segments are designed to be used with other attached variations like
  attached header or attached messages."
  (list-keys "attached"))

(defn variation-attached []
  [:div
   [se/segment {:data-ash [:top-attached]}
    "This segment is on top"]
   [se/segment {:data-ash [:attached]}
    "This segment is attached on both sides"]
   [se/segment {:data-ash [:bottom-attached]}
    "This segment is on bottom"]])

(defcard-doc
  (mkdn-pprint-source variation-attached))

(defcard-rg attached
  [variation-attached])



(defcard-doc
  "**Padded**"
  "A segment can increase its padding"
  (list-keys "padded"))

(defn variation-padded []
  [se/segment {:data-ash [:padded]}
   [se/header-h3 "padded"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-padded))

(defcard-rg padded
  [variation-padded])


(defn variation-very-padded []
  [se/segment {:data-ash [:very-padded]}
   [se/header-h3 "very-padded"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-very-padded))

(defcard-rg very-padded
  [variation-very-padded])



(defcard-doc
  "**Compact**"
  "A segment may take up only as much space as is necessary"
  (list-keys "compact"))

(defn variation-compact []
  [se/segment {:data-ash [:compact]}
   [se/header-h3 "compact"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-compact))

(defcard-rg compact
  [variation-compact])



(defcard-doc
  "**Colored**"
  "A segment can be colored"
  (list-keys "colored"))

(defn variation-colored []
  [se/segment {:data-ash [:red]}
   [se/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-colored))

(defcard-rg colored
  [:div
   [variation-colored]
   [se/segment {:data-ash [:orange]}
    [se/header-h3 "orange"]]
   [se/segment {:data-ash [:yellow]}
    [se/header-h3 "yellow"]]
   [se/segment {:data-ash [:olive]}
    [se/header-h3 "olive"]]
   [se/segment {:data-ash [:green]}
    [se/header-h3 "green"]]
   [se/segment {:data-ash [:teal]}
    [se/header-h3 "teal"]]
   [se/segment {:data-ash [:blue]}
    [se/header-h3 "blue"]]
   [se/segment {:data-ash [:violet]}
    [se/header-h3 "violet"]]
   [se/segment {:data-ash [:purple]}
    [se/header-h3 "purple"]]
   [se/segment {:data-ash [:pink]}
    [se/header-h3 "pink"]]
   [se/segment {:data-ash [:brown]}
    [se/header-h3 "brown"]]
   [se/segment {:data-ash [:grey]}
    [se/header-h3 "grey"]]
   [se/segment {:data-ash [:black]}
    [se/header-h3 "black"]]
   ])



(defcard-doc
  "**Inverted**"
  "These colors can be inverted"
  (list-keys "inverted"))

(defn variation-inverted []
  [se/segment {:data-ash [:red
                          :inverted]}
   [se/header-h3 "red"]])

(defcard-doc
  (mkdn-pprint-source variation-inverted))

(defcard-rg inverted
  [:div
   [variation-inverted]
   [se/segment {:data-ash [:orange
                           :inverted]}
    [se/header-h3 "orange"]]
   [se/segment {:data-ash [:yellow
                           :inverted]}
    [se/header-h3 "yellow"]]
   [se/segment {:data-ash [:olive
                           :inverted]}
    [se/header-h3 "olive"]]
   [se/segment {:data-ash [:green
                           :inverted]}
    [se/header-h3 "green"]]
   [se/segment {:data-ash [:teal
                           :inverted]}
    [se/header-h3 "teal"]]
   [se/segment {:data-ash [:blue
                           :inverted]}
    [se/header-h3 "blue"]]
   [se/segment {:data-ash [:violet
                           :inverted]}
    [se/header-h3 "violet"]]
   [se/segment {:data-ash [:purple
                           :inverted]}
    [se/header-h3 "purple"]]
   [se/segment {:data-ash [:pink
                           :inverted]}
    [se/header-h3 "pink"]]
   [se/segment {:data-ash [:brown
                           :inverted]}
    [se/header-h3 "brown"]]
   [se/segment {:data-ash [:grey
                           :inverted]}
    [se/header-h3 "grey"]]
   [se/segment {:data-ash [:black
                           :inverted]}
    [se/header-h3 "black"]]
   ])



(defcard-doc
  "**Emphasis**"
  "A segment can be formatted to appear more or less noticeable"
  (list-keys "emphasis"))

(defn variation-secondary []
  [se/segment {:data-ash [:secondary]}
   "secondary"])

(defcard-doc
  (mkdn-pprint-source variation-secondary))

(defcard-rg secondary
  [variation-secondary])


(defn variation-tertiary []
  [se/segment {:data-ash [:tertiary]}
   "tertiary"])

(defcard-doc
  (mkdn-pprint-source variation-tertiary))

(defcard-rg tertiary
  [variation-tertiary])



(defcard-doc
  "**Emphasis Inverted**"
  "Inverted colors may also be more or less noticeable"
  (list-keys "emphasis"))

(defn variation-inverted-secondary []
  [se/segment {:data-ash [:inverted :secondary]}
   "inverted secondary"])

(defcard-doc
  (mkdn-pprint-source variation-inverted-secondary))

(defcard-rg inverted-secondary
  [variation-inverted-secondary])


(defn variation-inverted-tertiary []
  [se/segment {:data-ash [:inverted :tertiary]}
   "inverted tertiary"])

(defcard-doc
  (mkdn-pprint-source variation-inverted-tertiary))

(defcard-rg inverted-tertiary
  [variation-inverted-tertiary])



(defcard-doc
  "**Circular**"
  "A segment can be circular"
  (list-keys "circular"))

(defn variation-circular []
  [se/segment {:data-ash [:circular]}
   [se/header-h3 "circular"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-circular))

(defcard-rg circular
  [variation-circular])



(defcard-doc
  "**Clearing**"
  "A segment can clear floated content"
  (list-keys "clearing"))

(defn variation-clearing []
  [se/segment {:data-ash [:clearing]}
   [se/header-h3 "clearing"]
   [se/header-h3 {:data-ash [:right-floated]}
    "this is right floated"]
   "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do
   eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim
   ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut
   aliquip ex ea commodo consequat. Duis aute irure dolor in
   reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
   pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
   culpa qui officia deserunt mollit anim id est laborum."])

(defcard-doc
  (mkdn-pprint-source variation-clearing))

(defcard-rg clearing
  [variation-clearing])



(defcard-doc
  "**Floated**"
  "A segment can appear to the left or right of other content"
  (list-keys "floated"))

(defn variation-floated []
  [:div
   [se/segment {:data-ash [:left-floated]}
    "left-floated"]
   [se/segment {:data-ash [:right-floated]}
    "right-floated"]])

(defcard-doc
  (mkdn-pprint-source variation-floated))

(defcard-rg floated
  [variation-floated])



(defcard-doc
  "
<br>
**Text Alignment**"
  "A segment can have its text aligned to a side"
  (list-keys "text alignment"))

(defn variation-text-alignment []
  [:div
   [se/segment {:data-ash [:left-aligned]}
    "left algined"]

   [se/segment {:data-ash [:center-aligned]}
    "center algined"]

   [se/segment {:data-ash [:right-aligned]}
    "right algined"]
   ])

(defcard-doc
  (mkdn-pprint-source variation-text-alignment))

(defcard-rg text-alignment
  [variation-text-alignment])



(defcard-doc
  "**Basic**"
  "A basic segment has no special formatting"
  (list-keys "basic"))

(defn variation-basic []
  [se/segment {:data-ash [:basic]}
   "A basic segment has no special formatting"])

(defcard-doc
  (mkdn-pprint-source variation-basic))

(defcard-rg basic
  [variation-basic])
