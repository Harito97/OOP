package patterns.iterator.pseudocode;

public class Facebook implements SocialNetwork{
    //Attributes

    //Iterator creation code
    public FacebookIterator createFriendsIterator(String profileId){
        return new FacebookIterator(this, profileId, "friends");
    }

    public FacebookIterator createCoworkersIterator(String profileId){
        return new FacebookIterator(this, profileId, "coworkers");
    }
}
