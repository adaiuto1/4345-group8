package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.Listing;
import models.Profile;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class ListingController extends Controller {
    public Result getAllListings(){
        Set<Listing> listingList = Listing.findAllListings();
        return ok(Json.toJson(listingList.toArray()));
    }
    public Result deleteListing(String id){
        Listing target = Listing.find
                .where()
                .eq("classID", id)
                .findUnique();
        if(target != null){
            target.delete();
            return ok();
        }
        else{
            return badRequest("class does not exist");
        }
    }
    public Result createNewListing(){
        System.out.println("creating new listing");
        JsonNode req = request().body().asJson();
        Listing newListing = new Listing();
        newListing.message = req.get("message").asText();
        newListing.classID = req.get("classID").asText();
        newListing.teacherEmail = req.get("teacherEmail").asText();
        newListing.prereqs = req.get("prereqs").asText();
        newListing.save();
        return ok();
    }
    public Result filterQualified(String applicantEmail){
        Profile applicant = Profile.findByEmail(applicantEmail);
        List<String> courses =  Arrays.asList(applicant.courses.split(","));
        Set<Listing> allListings = Listing.findAllListings();
        Listing[] b = new Listing[allListings.size()];
        System.arraycopy(allListings.toArray(), 0, b, 0,allListings.size());
        for(Listing l : b){
            System.out.println(l.classID);
            List<String> currPrereqs = Arrays.asList(l.prereqs.split(","));
            for(String p : currPrereqs){
                if(!(courses.contains(p))){
                    allListings.remove(l);
                }
            }
        }

        return ok(Json.toJson(allListings.toArray()));

    }
}
