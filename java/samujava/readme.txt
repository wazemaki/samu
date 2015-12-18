Samu Java
készítette: Mátó zoltán

Futtatás: javac (fordítás) majd java (futtatás).
A link grammar-t be kell állítanod előtte.

a link-grammar mappájában:
sudo ln -sv "$(pwd)/link-grammar/.libs/liblink-grammar.so.5" /usr/lib/
majd
sudo ln -sv "$(pwd)/bindings/java-jni/.libs/liblink-grammar-java.so" /usr/lib/

A következő a fordítás

javac -cp /[link-grammar-utvonal]/link-grammar-5.2.5/bindings/java/linkgrammar-5.2.5.jar samujava/*.java

Majd a futtatás: 

java -cp /[link-grammar-utvonal]/link-grammar-5.2.5/bindings/java/linkgrammar-5.2.5.jar:`pwd` samujava.samu_java
