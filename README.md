## How to Run

```
$ git clone https://github.com/napolev/springfox-default-value-issue
$ cd springfox-default-value-issue
$ gradle bootRun
```

## File Structure

```
$ INIT_COMMIT=$(git rev-list HEAD | tail -n 1); git diff $INIT_COMMIT HEAD --name-only

.gitignore
.vscode/launch.json
.vscode/settings.json
README.md
build.gradle
gradle/wrapper/gradle-wrapper.jar
gradle/wrapper/gradle-wrapper.properties
gradlew
gradlew.bat
settings.gradle
src/main/java/com/example/backend/DemoApplication.java
src/main/java/com/example/backend/config/Swagger2Config.java
src/main/java/com/example/backend/controller/UserController.java
src/main/java/com/example/backend/model/User.java
src/main/resources/application.yml
```

