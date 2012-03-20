#Sebastian Velez Posada

para probarlo tiene que seguir estos pasos
entran a la carpeta src desde la consola

    1. javac *.java

    2. rmic ChatClientImpl

    3. rmic ChatSalaImpl

    4. start rmiregistry

    5. start java ChatServer

luego esto lo pueden hacer las veces que quieran dependiendo de cuantos usuarios quieran en la sala 
6 start java ChatGUI localhost "nombre de usuario"
