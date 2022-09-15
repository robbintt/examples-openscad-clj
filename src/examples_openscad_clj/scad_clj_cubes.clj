;; this example could go a lot of different directions
;; you could bind the difference between the min cube size and max cube size to an interval and extrude N objects over the distance between 0 and PI.
;; lots of other cool parametric things are possible before the code gets translated.

;; bring primitives into namespace or whatever
(ns examples_openscad_clj.scad_clj_cubes
  (:use [scad-clj.scad])
  (:use [scad-clj.model]))

;; make primitives
(def primitives
  (cube 30 30 30)
)

(spit "example.scad" (write-scad primitives))
