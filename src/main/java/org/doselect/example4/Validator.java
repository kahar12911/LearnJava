package org.doselect.example4;

public class Validator {
    String canConsideredForTheAward(Rating rating) throws Exception{
        if(rating.imdbRating < 7) throw  new MovieRatingException("Movie not eligible for Flimfare Award");
        if(rating.nominee < 4) throw new MovieRatingException("Minimum 4 nominee required");
        return "Considered for the award";
    }

    String sendInvite(Rating rating) throws Exception{
        try{
            String s = canConsideredForTheAward(rating);
        }catch (MovieRatingException e){
            return "Not Invited";
        }catch (Exception e){
            return "other exception";
        }
        return "Actors and Dorectors invited";
    }

}
