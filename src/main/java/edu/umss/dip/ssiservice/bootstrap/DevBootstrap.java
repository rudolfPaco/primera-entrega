package edu.umss.dip.ssiservice.bootstrap;

import edu.umss.dip.ssiservice.model.*;
import edu.umss.dip.ssiservice.repositories.*;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AccidenteRepository accidenteRepository;
    private AsignacionInsumosEERepository asignacionInsumos;
    private CapacitacionRepository capacitacionRepository;
    private EmpleadoRepository empleadoRepository;
    private InsumoRepository insumoRepository;

    public DevBootstrap(AccidenteRepository accidenteRepository, AsignacionInsumosEERepository asignacionInsumos, CapacitacionRepository capacitacionRepository, EmpleadoRepository empleadoRepository, InsumoRepository insumoRepository) {
        this.accidenteRepository = accidenteRepository;
        this.asignacionInsumos = asignacionInsumos;
        this.capacitacionRepository = capacitacionRepository;
        this.empleadoRepository = empleadoRepository;
        this.insumoRepository = insumoRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Empleado empleado1 = new Empleado();
        empleado1.setcI("4512896");
        empleado1.setNombres("jorge ariel");
        empleado1.setApellidos("Beltran Gonzales");
        empleado1.setEmail("jorgebeltran@gmail.com");
        empleado1.setFechaContratacion(new Date());
        empleado1.setAntiguedad(2);

        empleadoRepository.save(empleado1);

        Empleado empleado2 = new Empleado();
        empleado2.setcI("1022548");
        empleado2.setNombres("marisol");
        empleado2.setApellidos("fuentes peña");
        empleado2.setEmail("marisolfuentes@gmail.com");
        empleado2.setFechaContratacion(new Date());
        empleado2.setAntiguedad(3);

        empleadoRepository.save(empleado2);

        Accidente accidente1 = new Accidente();
        accidente1.setTipo("leve");
        accidente1.setFecha(new Date());
        accidente1.setLugar("chonchocoro");

        accidente1.getListaEmpleados().add(empleado1);
        empleado1.getAccidentes().add(accidente1);

        accidenteRepository.save(accidente1);

        Insumo insumo1 = new Insumo();
        insumo1.setNombreInsumo("casco");
        insumo1.setCantidad(23);
        insumo1.setEstado("buen estado");

        Insumo insumo2 = new Insumo();
        insumo2.setNombreInsumo("guantes");
        insumo2.setCantidad(12);
        insumo2.setEstado("buen estado");

        Insumo insumo3 = new Insumo();
        insumo3.setNombreInsumo("taladro");
        insumo3.setCantidad(7);
        insumo3.setEstado("buen estado");

        Insumo insumo4 = new Insumo();
        insumo4.setNombreInsumo("paleta");
        insumo4.setCantidad(8);
        insumo4.setEstado("buen estado");

        insumoRepository.save(insumo1);
        insumoRepository.save(insumo2);
        insumoRepository.save(insumo3);
        insumoRepository.save(insumo4);

        AsignacionInsumosEE asignacionInsumosEE = new AsignacionInsumosEE();
        asignacionInsumosEE.setEmpleadoAsignado(empleado1);
        asignacionInsumosEE.setInsumoAsignado(insumo1);
        asignacionInsumos.save(asignacionInsumosEE);

        AsignacionInsumosEE asignacionInsumosEE2 = new AsignacionInsumosEE();
        asignacionInsumosEE2.setEmpleadoAsignado(empleado1);
        asignacionInsumosEE2.setInsumoAsignado(insumo2);
        asignacionInsumos.save(asignacionInsumosEE2);

        AsignacionInsumosEE asignacionInsumosEE1 = new AsignacionInsumosEE();
        asignacionInsumosEE1.setEmpleadoAsignado(empleado2);
        asignacionInsumosEE1.setInsumoAsignado(insumo1);
        asignacionInsumos.save(asignacionInsumosEE1);

        Capacitacion capacitacion1 = new Capacitacion();
        capacitacion1.setTitulo("medio ambiente");
        capacitacion1.setTema("cuidados del medio ambiente");
        capacitacion1.setDescripcion("invita a todos los malvivientes que no saben cuidar el medio ambiente.");
        capacitacion1.setLugar("chonchocoro");
        capacitacion1.setFecha(new Date());

        capacitacion1.getListaCapacitados().add(empleado1);
        empleado1.getCapacitaciones().add(capacitacion1);

        capacitacion1.getListaCapacitados().add(empleado2);
        empleado2.getCapacitaciones().add(capacitacion1);

        capacitacionRepository.save(capacitacion1);

    }
}
