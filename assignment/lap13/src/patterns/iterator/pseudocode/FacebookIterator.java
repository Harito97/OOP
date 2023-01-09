package patterns.iterator.pseudocode;

public class FacebookIterator implements ProfileIterator{
    private Facebook facebook;
    private String profileId, type;

    private int currentPosition = 0;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type){
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    private void lazyInit(){
        if (cache == null){
            //cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    public Profile getNext(){
        if (hasMore()){
            currentPosition++;
        }
        return cache[currentPosition];
    }

    public boolean hasMore(){
        lazyInit();
        return currentPosition < cache.length;
    }
}
