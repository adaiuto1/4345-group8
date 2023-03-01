package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Constraint;
import java.util.List;

@Entity
public class User extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    @Constraints.Required
    public String username;

    @Constraints.Required
    public String password;

    public static Find<Long, User> find = new Find<Long, User>(){};


    @Constraints.Required
    public String email;

    @Constraints.Required
    public String question1;

    @Constraints.Required
    public String answer1;

    @Constraints.Required
    public String question2;

    @Constraints.Required
    public String answer2;

    public static User findByName(String name) {
        return User.find
                .where()
                .eq("username", name)
                .findUnique();
    }
    public static User findByID(long id) {
        return User.find
                .where()
                .eq("id", id)
                .findUnique();
    }

}
