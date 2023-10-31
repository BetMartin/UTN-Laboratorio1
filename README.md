# UTN-Laboratorio1
MUTANTES
Magneto quiere reclutar la mayor cantidad de mutantes para poder lucharcontra los XMens.
Te ha contratado a ti para que desarrolles un proyecto que detecte si un humano es
mutante basándose en su secuencia de ADN.
Para eso te ha pedido crear un programa JAVA con un método o función con la siguiente
firma:
boolean isMutant(String[] dna);
En donde recibirás como parámetro un array de Strings que representan cada fila de
una tabla de (6x6) con la secuencia del ADN. Las letras de los Strings solo pueden ser:
(A,T,C,G), las cuales representa cada base nitrogenada del ADN.
Sabrás si un humano es mutante, si encuentras MAS DE UNA SECUNCIA de cuatro
letras iguales, de forma oblicua, horizontal o vertical.
Ejemplo (Caso mutante):
String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
Para la primera Matriz de la derecha!!!
En este caso el llamado a la función isMutant(dna) devuelve “true”.
Desarrolla el algoritmo de la manera más eficiente posible.
Ingrese por teclado las filas de la matriz, cargando las mismas.
(Teniendo en cuenta casos para que sea mutante y casos para que no lo sea-,
Una vez cargada correctamente la misma, aplique una función que verifique si hay
presencia en la matriz de mutantes o no y que la misma le devuelva el resultado al
usuario.
Subir el proyecto con los casos de pruebas a git hub y enviar el vínculo.
