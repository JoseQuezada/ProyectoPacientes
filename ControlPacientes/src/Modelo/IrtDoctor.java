package Modelo;

public interface IrtDoctor {
    public void AgregarMedico(Medico nuevoMedico);
    public void BuscarMedico(String Apellidos);
    public void EditarMedico(String Apellidos);
    public void EliminarMedico(String Apellidos);
        
}
