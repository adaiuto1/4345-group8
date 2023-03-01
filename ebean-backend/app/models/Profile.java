package models;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Profile extends Model {
    private static final long serialVersionUID = 1L;

    @Id
    public Long id;

    public String email;

    @Constraints.Required
    public String firstname;
    public static Find<Long, Profile> find = new Find<Long, Profile>(){};

    public String lastname;

    public String phone;

    public String address;

    public String city;
    public String state;
    public String country;

    public String zip;

    public String status;

    public String title;

    public String fax;
    public String comments;
    public String position;
    public String affiliation;
    public String degree;
    public String startingSemester;
    public String gradSemester;
    public String courses;

    public static Profile findByEmail(String email) {
        return Profile.find
                .where()
                .eq("email", email)
                .findUnique();
    }


}
