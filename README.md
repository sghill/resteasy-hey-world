Assumptions
===========

* java is installed
* gradle is installed (mac: brew install gradle)
* tomcat is installed (mac: brew install tomcat)
* intellij is the IDE of choice

Getting Started
===============
1. `git clone`
2. cd resteasy-hey-world
3. `gradle idea`
4. `open resteasy-hey-world.ipr`
5. `gradle tomcatRunWar`
6. go to `http://localhost:8080/resteasy-hey-world/api/locomotives` to see the json
7. go to `http://localhost:8080/resteasy-hey-world/static/index.html` to see static files
8. go to `http://10.25.3.31:8082` to see the h2 web console
9. tinker, expand, enjoy

License
=======
Apache 2
