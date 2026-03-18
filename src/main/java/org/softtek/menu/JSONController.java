package org.softtek.menu;

import org.softtek.model.Empleado;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

import java.util.List;

public class JSONController {

    public void guardarDirectorio(ObjectMapper mapper, List<Empleado> empleados) {

        for (Empleado e : empleados) {

            if (e.nombre() != null && e.apellido() != null
                    && !e.telefonoContacto().isEmpty()
                    && e.fechaAlta() != null
                    && e.supervisor() != null){
                mapper.writeValue(new File("directorio.json"), e);
            }
            else{
                System.out.println(e);
            }
        }

    }

}
