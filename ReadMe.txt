
Autor: Miguel Sanchez
1.¿Qué pasaría si la aplicación no requiere o no permite el uso de tomcat como
  servidor?

    R: Si la aplicación encuentra al servidor tomcat como un conflicto en su operación puede ser excluido de la
     siguiente manera:

     1. Se ubica el Pom.xml y se agrega en la dependencia del "boot-starter" de Spring la siguiente exclusion:
     <exclusions>
             <exclusion>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-starter-tomcat</artifactId>
             </exclusion>
         </exclusions>

     con esto, se le indica a Spring que debe hacer exclusión del uso del servidor de tomcat

2. ¿Qué implica usar @RestController en lugar de @Controller?

    R: El RestController permite que el cliente reciba la respuesta a una peticion en formato JSON, es una combinacion
     del @Controller y el @ResponseBody, por esto el formato serializado, por otra parte el @Controller específica un
      enrutamiento como un String, que Spring interpreta como un path al cual redirigir la respuesta al recibir formatos
     "Map" o "String " mencionado anterirormente