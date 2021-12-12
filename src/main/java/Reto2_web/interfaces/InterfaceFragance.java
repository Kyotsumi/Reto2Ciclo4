
package Reto2_web.interfaces;

import Reto2_web.modelo.Fragance;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fabio Ortiz
 */
public interface InterfaceFragance extends MongoRepository<Fragance, String>{
    
}
