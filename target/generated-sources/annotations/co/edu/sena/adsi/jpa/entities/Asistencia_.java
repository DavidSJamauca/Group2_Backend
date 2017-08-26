package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Equipos;
import co.edu.sena.adsi.jpa.entities.Eventos;
import co.edu.sena.adsi.jpa.entities.Usuarios;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T15:45:21")
@StaticMetamodel(Asistencia.class)
public class Asistencia_ { 

    public static volatile SingularAttribute<Asistencia, Date> fecha;
    public static volatile SingularAttribute<Asistencia, Eventos> eventosId;
    public static volatile ListAttribute<Asistencia, Equipos> equiposList;
    public static volatile SingularAttribute<Asistencia, Usuarios> usuariosId;
    public static volatile SingularAttribute<Asistencia, Integer> id;
    public static volatile SingularAttribute<Asistencia, Boolean> activo;
    public static volatile SingularAttribute<Asistencia, String> asistenciacol;

}