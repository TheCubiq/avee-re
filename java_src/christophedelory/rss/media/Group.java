package christophedelory.rss.media;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class Group extends BaseMedia {
    private final List<Content> _mediaContents = new ArrayList();

    public void addMediaContent(Content content) {
        if (content == null) {
            throw new NullPointerException("no media content");
        }
        this._mediaContents.add(content);
    }

    public List<Content> getMediaContents() {
        return this._mediaContents;
    }
}
