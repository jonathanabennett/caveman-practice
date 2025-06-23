# Show available recipes
help:
  just --list

# Run the project
run:
  clojure -M -m example.main

# Run the repl
nrepl:
  clojure -M:nREPL -m nrepl.cmdline
