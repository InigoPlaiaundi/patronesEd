package patron.state;

public class HabitacionEnMantenimiento implements HabitacionEstado {

	@Override
	public HabitacionEstado ocupar() {
		// TODO Auto-generated method stub
		System.out.println("habitacion en mantenimiento");
		return this;
	}

	@Override
	public HabitacionEstado liberar() {
		// TODO Auto-generated method stub
		System.out.println("habitacion liberada");
		return new HabitacionLimpieza();
	}

	@Override
	public HabitacionEstado limpiar() {
		// TODO Auto-generated method stub
		System.out.println("habitacion limpiada");
		return this;
	}

	@Override
	public HabitacionEstado salir() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
