package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Asistencia;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T17:17:51")
@StaticMetamodel(Eventos.class)
public class Eventos_ { 

    public static volatile SingularAttribute<Eventos, String> tipo;
    public static volatile SingularAttribute<Eventos, Date> fechaInicio;
    public static volatile SingularAttribute<Eventos, String> direccion;
    public static volatile SingularAttribute<Eventos, Integer> id;
    public static volatile SingularAttribute<Eventos, String> nombre;
    public static volatile SingularAttribute<Eventos, String> fechaFin;
    public static volatile ListAttribute<Eventos, Asistencia> asistenciaList;

}