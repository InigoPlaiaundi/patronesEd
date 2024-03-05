package patron.state;

public class OcupadaDisponibleSucia implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		// TODO Auto-generated method stub
		System.out.println("habitacion en mantenimiento");
		return null;
	}

	@Override
	public HabitacionEstado liberar() {
		// TODO Auto-generated method stub
		System.out.println("habitacion libre");
		return new HabitacionOcupadaVacia();
	}

	@Override
	public HabitacionEstado limpiar() {
		// TODO Auto-generated method stub
		return new HabitacionLimpieza();
	}

	@Override
	public HabitacionEstado salir() {
		// TODO Auto-generated method stub
		return null;
	}

}
