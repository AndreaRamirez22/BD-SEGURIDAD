package seguridad.Registraduria.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import seguridad.Registraduria.seguridad.Modelos.Rol;


public interface RepositorioRol extends MongoRepository<Rol,String> {
}