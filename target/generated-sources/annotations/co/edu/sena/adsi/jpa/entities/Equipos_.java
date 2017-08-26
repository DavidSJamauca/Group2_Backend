package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Asistencia;
import co.edu.sena.adsi.jpa.entities.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T15:45:21")
@StaticMetamodel(Equipos.class)
public class Equipos_ { 

    public static volatile SingularAttribute<Equipos, String> marca;
    public static volatile SingularAttribute<Equipos, Asistencia> asistenciaId;
    public static volatile SingularAttribute<Equipos, Usuarios> usuariosId;
    public static volatile SingularAttribute<Equipos, Integer> id;
    public static volatile SingularAttribute<Equipos, Integer> cantidad;
    public static volatile SingularAttribute<Equipos, String> nombre;
    public static volatile SingularAttribute<Equipos, String> referencia;

}