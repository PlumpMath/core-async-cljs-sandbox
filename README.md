Core async and clojurescript sandbox project (cljs-kickoff used as lein template)

Run server with:

    lein ring server

In another shell, setup auto cljs build:

    lein cljsbuild auto

Currently using (python) livereload from aura, rather than a clojure version:

    aura -A livereload
    livereload resources
