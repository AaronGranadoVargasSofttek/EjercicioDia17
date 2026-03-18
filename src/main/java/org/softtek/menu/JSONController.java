package org.softtek.menu;

import org.softtek.model.Empleado;
import tools.jackson.databind.ObjectMapper;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

public class JSONController {

    public static void guardarDirectorio(ObjectMapper mapper, List<Empleado> empleados) {

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


    public static void leerDirectorio(){

        try{
            ObjectMapper mapper = new ObjectMapper();
            List<Empleado> empleados = mapper.readValue(new File("directorio.json"), mapper.getTypeFactory().constructCollectionType(List.class, Empleado.class));
            for (Empleado e : empleados) {
                System.out.println(e);
            }

        }catch (Exception e){
            System.out.println("Error al leer el directorio");
        }
    }

}
