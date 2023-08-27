package christophedelory.rss.media;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BaseMedia {
    private Title _mediaTitle = null;
    private Description _mediaDescription = null;
    private Player _mediaPlayer = null;
    private final List<Thumbnail> _mediaThumbnails = new ArrayList();
    private Boolean _mediaAdult = null;
    private final List<Category> _mediaCategories = new ArrayList();
    private final List<Rating> _mediaRatings = new ArrayList();
    private String _mediaKeywords = null;
    private final List<Hash> _mediaHashes = new ArrayList();
    private final List<Credit> _mediaCredits = new ArrayList();
    private Copyright _mediaCopyright = null;
    private final List<Text> _mediaTexts = new ArrayList();
    private final List<Restriction> _mediaRestrictions = new ArrayList();

    public void setMediaPlayer(Player player) {
        this._mediaPlayer = player;
    }

    public Player getMediaPlayer() {
        return this._mediaPlayer;
    }

    public void addMediaThumbnail(Thumbnail thumbnail) {
        if (thumbnail == null) {
            throw new NullPointerException("no media thumbnail");
        }
        this._mediaThumbnails.add(thumbnail);
    }

    public List<Thumbnail> getMediaThumbnails() {
        return this._mediaThumbnails;
    }

    public void setMediaTitle(Title title) {
        this._mediaTitle = title;
    }

    public Title getMediaTitle() {
        return this._mediaTitle;
    }

    public Description getMediaDescription() {
        return this._mediaDescription;
    }

    public void setMediaDescription(Description description) {
        this._mediaDescription = description;
    }

    public boolean isMediaAdult() {
        Boolean bool = this._mediaAdult;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public void setMediaAdult(boolean z) {
        this._mediaAdult = Boolean.valueOf(z);
    }

    public Boolean getMediaAdult() {
        return this._mediaAdult;
    }

    public void setMediaAdult(Boolean bool) {
        this._mediaAdult = bool;
    }

    public List<Category> getMediaCategories() {
        return this._mediaCategories;
    }

    public void addMediaCategory(Category category) {
        if (category == null) {
            throw new NullPointerException("no media category");
        }
        this._mediaCategories.add(category);
    }

    public List<Rating> getMediaRatings() {
        return this._mediaRatings;
    }

    public void addMediaRating(Rating rating) {
        if (rating == null) {
            throw new NullPointerException("no media rating");
        }
        this._mediaRatings.add(rating);
    }

    public String getMediaKeywords() {
        return this._mediaKeywords;
    }

    public void setMediaKeywords(String str) {
        this._mediaKeywords = str;
    }

    public List<Hash> getMediaHashes() {
        return this._mediaHashes;
    }

    public void addMediaHash(Hash hash) {
        if (hash == null) {
            throw new NullPointerException("no media hash");
        }
        this._mediaHashes.add(hash);
    }

    public List<Credit> getMediaCredits() {
        return this._mediaCredits;
    }

    public void addMediaCredit(Credit credit) {
        if (credit == null) {
            throw new NullPointerException("no media credit");
        }
        this._mediaCredits.add(credit);
    }

    public Copyright getMediaCopyright() {
        return this._mediaCopyright;
    }

    public void setMediaCopyright(Copyright copyright) {
        this._mediaCopyright = copyright;
    }

    public List<Text> getMediaTexts() {
        return this._mediaTexts;
    }

    public void addMediaText(Text text) {
        if (text == null) {
            throw new NullPointerException("no media text");
        }
        this._mediaTexts.add(text);
    }

    public List<Restriction> getMediaRestrictions() {
        return this._mediaRestrictions;
    }

    public void addMediaRestriction(Restriction restriction) {
        if (restriction == null) {
            throw new NullPointerException("no media restriction");
        }
        this._mediaRestrictions.add(restriction);
    }
}
