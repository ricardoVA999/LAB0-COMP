# LAB0-COMP
# Laboratorio 0 Compiladores

Para correr este programa se necesita java y el paquete de ANTLR (el cual es un .jar)

Generar archivos de la gramatica:
```
-> java -jar (directorio donde este el paquete)/antlr-4.10.1-complete.jar YAPL.g4
```

Compilar archivos generados de la gramatica:
```
-> javac Expr*.java
```

Compilar y correr el archivo del lab como tal:
```
-> javac -cp "(directorio donde este el paquete)/antlr-4.10.1-complete.jar;" Lab0Main.java
-> java Lab0Main
```
