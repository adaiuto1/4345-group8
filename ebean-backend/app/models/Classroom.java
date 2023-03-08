package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Classroom extends Model {

    @Id
    public String classID;
    public static Model.Find<String, Classroom> find = new Model.Find<String, Classroom>(){};

    @Constraints.Required
    public String classTitle;
    @Constraints.Required

    public String teacherEmail;
    public String location;

    public int numOpenings;

    public static Classroom findClassroomById(String classID){
        return Classroom.find
                .where()
                .eq("classID", classID)
                .findUnique();
    }
    public static Classroom findClassroomByEmail(String email){
        return Classroom.find
                .where()
                .eq("teacherEmail", email)
                .findUnique();
    }
}
