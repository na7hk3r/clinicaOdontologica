package BackEndC3.ClinicaOdontologica.service;

import BackEndC3.ClinicaOdontologica.dao.PacienteDAOH2;
import BackEndC3.ClinicaOdontologica.dao.iDao;
import BackEndC3.ClinicaOdontologica.model.Odontologo;
import BackEndC3.ClinicaOdontologica.model.Paciente;

import java.util.List;

public class PacienteService {
private iDao<Paciente> pacienteiDao;

    public PacienteService() {
        pacienteiDao= new PacienteDAOH2();
    }
    //metodos manuales
    public Paciente guardarPaciente(Paciente paciente){
        return pacienteiDao.guardar(paciente);
    }
    public Paciente buscarPorID(Integer id){
        return pacienteiDao.buscarPorId(id);
    }
    public Paciente buscarPorEmail(String email){
        return pacienteiDao.buscarPorString(email);
    }
<<<<<<< HEAD
    public void actualizarPaciente(Paciente paciente) {pacienteiDao.actualizar(paciente); }
=======
    public void actualizarPaciente(Paciente paciente){
        pacienteiDao.actualizar(paciente);
    }

    public List<Paciente> buscarTodos(){
        return pacienteiDao.buscarTodos();
    }
>>>>>>> 68f719ac0ad83308b92b10f60809a4dc53434eac
}
