# Pruebas automatizadas reto sophos
Librerías utilizadas:

- serenity-screenplay  
- serenity-cucumber     
- serenity-screenplay-rest

- ojdbc6  
- jt400  
- maven
-gradle


Se realizan pruebas automatizados de la pagina web Metro y servicios Api Rest

## solucion
pagina metro(automatizacion realizada com screenplay y gradle)

1. se  toman todos los elementos a utilizar en la automatizacion
2. se crea el feature, stepdefinitions, runner, tast,interations,quiestions(las carpetas necesarias para ejecutar la automatizacion)
3. se configura cada una de las clases para dichas carpetas 
4. se ejecuta la automatizacion


servicio Rest(automatizacion realizada con maven y pom)
1. se ingresa a la pagina web se toma la url de user
2. se crea un token de portador HTTP, para poder ejecutar la respuesta (la cual solo lo dan por 60 minutos maximos)
3. se crea las clases pasos y feature, la cual contiene el codigo para llamar el servio
4. se ejecuta automatizacion.



