package models;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;
import java.util.Set;

@Entity
public class Application extends Model{
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;
    @Constraints.Required
    public String recipientUsername;

    public static Model.Find<String, Application> find = new Model.Find<String, Application>(){};

    @Constraints.Required
    public String applicantUsername;

    public String className;

    @Constraints.Required
    public String message;

    @Constraints.Required
    public String classID;
    public Application(){}
    public Application(Long id, String recipientUsername){
        this.id = id;
        this.recipientUsername = recipientUsername;
    }

    public static Set<Application> findByRecipient(String recipientUsername){
        return Application.find
                .where()
                .eq("recipient_username", recipientUsername)
                .findSet();
    }

    public static Application findApplicationById(int id){
        return Application.find
                .where()
                .eq("id", id)
                .findUnique();
    }public static Set<Application> findApplicationByApplicant(String applicantUsername){
        return Application.find
                .where()
                .eq("applicant_username", applicantUsername)
                .findSet();
    }
}
