## **Factory Alpha**

In this example we have a `boat` and an `engine`
boat can contain an engine. We only provide setter and getter interface
in both of these examples. `BoatFactory` and `EngineFactory` interfaces
provide only 1 method - create*Model*(). The purpose of them and the pattern
is to encapsulate concrete Factories and declarations of Objects to the factories.
In current package we have a terrible example because still we have to get a concrete
factory by hand, and we don't have `boat` nor `engine` consumers.