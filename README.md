## Liferay7.2.0 Rest Builder example


### Prerequisites:
* Liferay 7.2.0 ga1
* Gradle 4.10.2 +

### Module creation:
Create two API module names as below.
`headless-api`
`headless-impl`

#### Add Build Script into build.gradle:
* Add below buildscript into impl module build.gradle file.
```
buildscript {
    dependencies {
        classpath group: "com.liferay", name: "com.liferay.gradle.plugins.rest.builder", version: "1.0.21"
    }

    repositories {
        maven {
            url "https://repository-cdn.liferay.com/nexus/content/groups/public"
        }
    }
}

apply plugin: "com.liferay.portal.tools.rest.builder"
```
* Build RESTTask using the below command will create some files.
`./gradlew buildREST`

### Create yaml file:
Create a rest-config.yaml file with apiDir, apiPackagePath, application and author into the impl module parallel to build.gradle file. Below is the sample code.
```
apiDir: "../headless-api/src/main/java"
apiPackagePath: "com.headless.api"
application:
    baseURI: "/restapi"
    className: "HeadlessApplication"
    name: "Liferay.Headless"
author: "Ravi Rupapara"
```

Create a rest-openapi.yaml file with openapi, info into the impl module parallel to build.gradle file. Below is the sample code.
```
openapi: 3.0.1
info:
  license:
        name: "Apache 2.0"
        url: "http://www.apache.org/licenses/LICENSE-2.0.html"
  title: "Headless API"
  version: v1.0
  description: "API for accessing Headless details."
```
Build and Deploy :
Now your API is ready using below curl

```
curl -X GET \
  http://localhost:8080/o/inextureapi/v1.0/openapi.yaml \
  -H 'authorization: Basic dGVzdEBsaWZlcmF5LmNvbTp0ZXN0'
```
#### API URL:
You can check all the generated urls using the below command into gogo shell.
`jaxrs:check`

References:
https://help.liferay.com/hc/en-us/articles/360028708852-Introduction-to-REST-Builder
https://github.com/liferay/liferay-portal/tree/master/modules/apps/headless/headless-delivery

