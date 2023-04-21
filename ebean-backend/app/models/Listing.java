package models;

import com.avaje.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;
@Entity
public class Listing extends Model {
    @Id
    public int listingID;
    @Constraints.Required
    public String teacherEmail;
    @Constraints.Required
    public String classID;
    public String message;
    public String prereqs;
    public static Model.Find<String, Listing> find = new Model.Find<String, Listing>(){};
    public Listing(){
        this.classID = null;
        this.teacherEmail = null;
        this.message = null;
        this.prereqs = null;
    }
    public Listing(String classID, String teacherEmail, String message, String prereqs){
        this.classID = classID;
        this.teacherEmail = teacherEmail;
        this.message = message;
        this.prereqs = prereqs;
    }


    public static Set<Listing> findAllListings(){
        return Listing.find
                .findSet();
    }

}
