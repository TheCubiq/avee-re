package christophedelory.rss;

import christophedelory.rss.media.BaseMedia;
import christophedelory.rss.media.Content;
import christophedelory.rss.media.Group;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class Item extends BaseMedia {
    private String _title = null;
    private URI _link = null;
    private String _description = null;
    private String _author = null;
    private final List<Category> _categories = new ArrayList();
    private String _comments = null;
    private Enclosure _enclosure = null;
    private GUID _guid = null;
    private Date _pubDate = null;
    private Source _source = null;
    private final List<Content> _mediaContents = new ArrayList();
    private final List<Group> _mediaGroups = new ArrayList();
    private transient Channel _channel = null;

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String str) {
        this._title = str;
    }

    public void setLinkString(String str) throws URISyntaxException {
        this._link = new URI(str);
    }

    public String getLinkString() {
        URI uri = this._link;
        if (uri != null) {
            return uri.toString();
        }
        return null;
    }

    public void setLink(URI uri) {
        this._link = uri;
    }

    public URI getLink() {
        return this._link;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String str) {
        this._description = str;
    }

    public String getAuthor() {
        return this._author;
    }

    public void setAuthor(String str) {
        this._author = str;
    }

    public List<Category> getCategories() {
        return this._categories;
    }

    public void addCategory(Category category) {
        if (category == null) {
            throw new NullPointerException("no category");
        }
        this._categories.add(category);
    }

    public String getComments() {
        return this._comments;
    }

    public void setComments(String str) {
        this._comments = str;
    }

    public Enclosure getEnclosure() {
        return this._enclosure;
    }

    public void setEnclosure(Enclosure enclosure) {
        this._enclosure = enclosure;
    }

    public GUID getGuid() {
        return this._guid;
    }

    public void setGuid(GUID guid) {
        this._guid = guid;
    }

    public void setPubDateString(String str) {
        this._pubDate = RFC822.valueOf(str);
    }

    public String getPubDateString() {
        Date date = this._pubDate;
        if (date != null) {
            return RFC822.toString(date);
        }
        return null;
    }

    public Date getPubDate() {
        return this._pubDate;
    }

    public void setPubDate(Date date) {
        this._pubDate = date;
    }

    public Source getSource() {
        return this._source;
    }

    public void setSource(Source source) {
        this._source = source;
    }

    public void addMediaContent(Content content) {
        if (content == null) {
            throw new NullPointerException("no media content");
        }
        this._mediaContents.add(content);
    }

    public List<Content> getMediaContents() {
        return this._mediaContents;
    }

    public List<Group> getMediaGroups() {
        return this._mediaGroups;
    }

    public void addMediaGroup(Group group) {
        if (group == null) {
            throw new NullPointerException("no media group");
        }
        this._mediaGroups.add(group);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setChannel(Channel channel) {
        this._channel = channel;
    }

    public Channel getChannel() {
        return this._channel;
    }
}
