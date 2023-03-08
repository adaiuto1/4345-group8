package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import java.util.Set;
@Entity
public class TAResponse extends Model {
    @Constraints.Required
    public String applicantEmail;
    @Constraints.Required
    public String classID;
    @Constraints.Required
    public String teacherEmail;
    public static Find<String, TAResponse> find = new Model.Find<String, TAResponse>(){};
    public String coursework;
    @Constraints.Required
    public String applicantMessage;

    public Set<TAResponse> findTAResponseByApplicantEmail(String applicantEmail){
        return TAResponse.find
                .where()
                .eq("applicantEmail", applicantEmail)
                .findSet();
    }

    public Set<TAResponse> findTAResponseByTeacherEmail(String teacherEmail){
        return TAResponse.find
                .where()
                .eq("teacherEmail", teacherEmail)
                .findSet();
    }

    public Set<TAResponse> findTAResponseByClassId(String classID){
        return TAResponse.find
                .where()
                .eq("classID", classID)
                .findSet();
    }

}
