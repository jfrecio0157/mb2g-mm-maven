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

## Modulos generados
1. jpa-entities
2. from-intellij
3. web-api -> creacion de la entidad UserCommand desde una xml (src->main->resources->jaxb.xsd)
4. web-app -> en su pom se pone que depende de jpa-entities y de web-api. Es necesario hacer el install de ambos antes de compilar el web-app para
   que existan los objetos y se puedan resolver las dependencias (y los imports de la clase UserControllers)
5. converts -> tiene un mapstruct. web-app llama a converts. 
   Se elimina del pom.xml de web-app las dependencias de jpa-entities y web-api, poniendo solo la dependencia de converts
   Se incluye en el pom.xml de converts las dependencias de jpa-entities y web-api
