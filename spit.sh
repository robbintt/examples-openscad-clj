#!/bin/bash

# this doesn't work you have to actually paste the command into the repl
# gotta learn a little lein to get the project to compile i guess
# search for more prior art on github, don't tinker on lein
lein repl < echo '(load-file "src/examples_openscad_clj/scad_clj_cubes.clj")'
