package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;
import scala.collection.Seq;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Set;

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
    public String ta1;
    public String ta2;
    public String ta3;
    public String ta4;
    public String ta5;
    public static Set<Classroom> getAllClassrooms(){
        System.out.println("getting all");
        return Classroom.find
                .findSet();
    }
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
