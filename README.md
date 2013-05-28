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
5. `gradle war`
6. copy `build/libs/resteasy-hey-world.war` to tomcat webapps directory (could be `/usr/lib/Cellar/tomcat/7.0.37/libexec/webapps` or `/usr/local/Cellar/tomcat/7.0.39/libexec/webapps/`)
7. `catalina start`
8. go to `http://localhost:8080/resteasy-hey-world/locomotives`
9. tinker, expand, enjoy

License
=======
Apache 2
