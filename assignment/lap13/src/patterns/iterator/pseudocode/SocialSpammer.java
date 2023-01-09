package patterns.iterator.pseudocode;

public class SocialSpammer {
    public void send(ProfileIterator iterator, String message){
        while (iterator.hasMore()){
            Profile profile = iterator.getNext();
            //System.sendEmail(profile.getEmail(), message);
        }
    }
}
