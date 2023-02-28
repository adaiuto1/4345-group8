package models;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;
import java.util.Set;

@Entity
public class Application {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;
    @Constraints.Required
    public String recipientEmail;

    public static Model.Find<String, Application> find = new Model.Find<String, Application>(){};

    @Constraints.Required
    public User applicantID;

    @Constraints.Required
    public String message;

    public Application(Long id, String recipientEmail){
        this.id = id;
        this.recipientEmail = recipientEmail;
    }

    public static Set<Application> findByRecipient(String recipientEmail){
        return Application.find
                .where()
                .eq("recipient_email", recipientEmail)
                .findSet();
    }
}
