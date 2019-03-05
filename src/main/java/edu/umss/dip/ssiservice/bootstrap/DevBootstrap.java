package edu.umss.dip.ssiservice.bootstrap;

import edu.umss.dip.ssiservice.model.AsignacionInsumosEE;
import edu.umss.dip.ssiservice.model.Empleado;
import edu.umss.dip.ssiservice.model.Insumo;
import edu.umss.dip.ssiservice.repositories.AsignacionInsumosEERepository;
import edu.umss.dip.ssiservice.repositories.EmpleadoRepository;
import edu.umss.dip.ssiservice.repositories.InsumoRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private EmpleadoRepository empleadoRepository;
    private AsignacionInsumosEERepository asignacionRepository;
    private InsumoRepository insumoRepository;

    public DevBootstrap(EmpleadoRepository empleadoRepository, AsignacionInsumosEERepository asignacionRepository, InsumoRepository insumoRepository) {
        this.empleadoRepository = empleadoRepository;
        this.asignacionRepository = asignacionRepository;
        this.insumoRepository = insumoRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Empleado empleado = new Empleado();
        empleado.setcI("5466456");
        empleado.setNombres("Juan Gerson");
        empleado.setApellidos("Tirado Rico");
        empleado.setEmail("juantiradorico@gmail.com");
        empleado.setFechaContratacion("02-04-2015");
        empleado.setAntiguedad(3);

        Empleado empleado1 = new Empleado();
        empleado1.setcI("1244776");
        empleado1.setNombres("Abran");
        empleado1.setApellidos("Pequerson Fatmagul");
        empleado1.setEmail("abranperquersonfatmagul@gmail.com");
        empleado1.setFechaContratacion("02-01-2014");
        empleado1.setAntiguedad(3);

        empleadoRepository.save(empleado);
        empleadoRepository.save(empleado1);

        Insumo insumo1 = new Insumo();
        insumo1.setNombreInsumo("casco protector");
        insumo1.setCantidad(10);
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
        insumo4.setNombreInsumo("soplete");
        insumo4.setCantidad(2);
        insumo4.setEstado("buen estado");

        insumoRepository.save(insumo1);
        insumoRepository.save(insumo2);
        insumoRepository.save(insumo3);
        insumoRepository.save(insumo4);

        AsignacionInsumosEE asignacion1 = new AsignacionInsumosEE();
        asignacion1.setFechaAsignacion("20-10-2018");
        asignacion1.setEmpleadoAsignacion(empleado);
        asignacion1.setInsumoAsignacion(insumo1);
        asignacionRepository.save(asignacion1);

        AsignacionInsumosEE asignacion2 = new AsignacionInsumosEE();
        asignacion2.setFechaAsignacion("20-10-2018");
        asignacion2.setEmpleadoAsignacion(empleado);
        asignacion2.setInsumoAsignacion(insumo2);
        asignacionRepository.save(asignacion2);
    }
}