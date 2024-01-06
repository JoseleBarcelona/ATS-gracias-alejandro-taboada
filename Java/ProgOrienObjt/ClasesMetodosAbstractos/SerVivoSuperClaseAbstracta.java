package ProgOrienObjt.ClasesMetodosAbstractos;
/*
CLASES Y MÉTODOS ABSTRACTOS
- Se utilizan sólo como superclases (Clases padre).
- No se pueden instanciar objetos de esa clase.
- Sirven para proporcionar una superclase (Clases hijas) apropiada o plantilla a partir de la cual
  heredan otras clases.
- Sus subclases pueden a la vez ser también clases abstractas.

EJEMPLO:
                Clase Abstracta SerVivo (Clase padre)
                alimentarse():void
                          |
                          |
    Clase Planta__________|____________Clase Abstracta Animal (Subclase padre)
    alimentarse():void                 alimentarse():void                           |
                                                |
                 Clase AnimalCarnívoro__________|____________Clase AnimalHervivoro
                 alimentarse():void                          alimentarse():void
 */
public abstract class SerVivoSuperClaseAbstracta {

    public abstract void alimentarse();  //los métodos abstractos no se instancian {}, se declaran con el ;
}
