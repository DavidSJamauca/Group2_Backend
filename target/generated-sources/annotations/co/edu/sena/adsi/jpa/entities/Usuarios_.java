package co.edu.sena.adsi.jpa.entities;

import co.edu.sena.adsi.jpa.entities.Asistencia;
import co.edu.sena.adsi.jpa.entities.Equipos;
import co.edu.sena.adsi.jpa.entities.Roles;
import co.edu.sena.adsi.jpa.entities.TipoDocumento;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-26T17:17:51")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> apellidos;
    public static volatile SingularAttribute<Usuarios, Integer> numDocumento;
    public static volatile SingularAttribute<Usuarios, TipoDocumento> tipoDocumentoId;
    public static volatile SingularAttribute<Usuarios, String> password;
    public static volatile ListAttribute<Usuarios, Roles> rolesList;
    public static volatile ListAttribute<Usuarios, Equipos> equiposList;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> sexo;
    public static volatile SingularAttribute<Usuarios, String> email;
    public static volatile SingularAttribute<Usuarios, String> nombres;
    public static volatile ListAttribute<Usuarios, Asistencia> asistenciaList;

}