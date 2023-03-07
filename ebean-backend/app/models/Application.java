package models;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;
import scala.App;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

@Entity
public class Application extends Model{
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;
    @Constraints.Required
    public String studentEmail;
    public static Model.Find<String, Application> find = new Model.Find<String, Application>(){};
    @Constraints.Required
    public String firstChoice;

    public String secondChoice;
    public String thirdChoice;

    public String avoid;

    @Constraints.Required
    public boolean isAvailable = true;

    public Set<Application> getApplicationsBySender(String studentEmail){
        return Application.find
                .where()
                .eq("studentEmail", studentEmail)
                .findSet();
    }

}
