# mb2g-mm-maven
Generacion proyecto Multi-Modulo

## Elementos importantes
- pom.xml de mb2g-mm-maven
- pom.xml de jpa-entities
- pom.xml de from-intellij
- pom.xml de web-api
- pom.xml de web-app
- pom.xml de converts
- Se añade en el pom.xml del root (mb2g-mm-maven) el plugin flatten-maven-plugin para aplanar los pom.xml
- Se añade en el pom.xml del root (mb2g-mm-maven) el pluggn maven-enforcer-plugin para asegurar que la version
  del java es 19 o superior, y la de maven es 3.8.6 o superior
- Se añade en el pom.xml del root (mb2g-mm-maven) el dependencyManagement para declarar el groupId, artifactId y version
  de todas las dependencias extenas de los hijos. En el pom.xlm de los hijos no se pone la version
  De esta forma el mantenimiento de estas versiones se hace en un solo sitio.

## Modulos generados
1. jpa-entities
2. from-intellij
3. web-api -> creacion de la entidad UserCommand desde una xml (src->main->resources->jaxb.xsd)
4. web-app -> en su pom se pone que depende de jpa-entities y de web-api. Es necesario hacer el install de ambos antes de compilar el web-app para
   que existan los objetos y se puedan resolver las dependencias (y los imports de la clase UserControllers)
5. converts -> tiene un mapstruct. web-app llama a converts. 
   Se elimina del pom.xml de web-app las dependencias de jpa-entities y web-api, poniendo solo la dependencia de converts
   Se incluye en el pom.xml de converts las dependencias de jpa-entities y web-api
