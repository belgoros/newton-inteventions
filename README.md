# Newton Interventions API

### Used frameworks

- java 8
- Maven
- Jetty
- [Javalite](http://javalite.io/)
- [ActiveWeb](http://javalite.io/activeweb)
- [Active JDBC](http://javalite.io/activejdbc)
- [JSpec](http://javalite.io/jspec)
- [DB Migrator](http://javalite.io/database_migrations)

### Instrumentation plugins and running tests

ActiveJDBC requires **instrumentation** of class files after they are compiled.
This is accomplished with an Instrumentation tool provided by the project. There are three ways to use it: with a Maven plugin, Ant, and as a standalone Java class (no Ant or Maven).
To be able to run tests, you should configure your IDE to use it (see [Instrumentation Doc](http://javalite.io/instrumentation) for more details.
The project uses Maven plugin. See `pom.xml` related section.

### Setup

Actually the app uses Postgresql database but you are free to use another one. Currently the following databases are supported:
* SQLServer
* MySQL
* Oracle
* PostgreSQL
* H2
* SQLite3
* DB2

Adding a new dialect is relatively easy. Just look at commits on this branch: [h2integration](https://github.com/javalite/activejdbc/tree/h2integration).

Create a database manually. You will need to update `database.properties` file.

### To start a web application

Run `mvn jetty:run` either from your Terminal or from your preferred IDE to start Jetty server. The app is available at `localhost:8080`
