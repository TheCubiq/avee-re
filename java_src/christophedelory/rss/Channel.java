package christophedelory.rss;

import christophedelory.rss.media.BaseMedia;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class Channel extends BaseMedia {
    private String _title = null;
    private URI _link = null;
    private String _description = null;
    private String _language = null;
    private String _copyright = null;
    private String _managingEditor = null;
    private String _webMaster = null;
    private Date _pubDate = null;
    private Date _lastBuildDate = null;
    private final List<Category> _categories = new ArrayList();
    private String _generator = null;
    private String _docs = "http://blogs.law.harvard.edu/tech/rss";
    private Cloud _cloud = null;
    private Integer _ttl = null;
    private Image _image = null;
    private String _rating = null;
    private TextInput _textInput = null;
    private final List<Integer> _skipHours = new ArrayList();
    private final List<String> _skipDays = new ArrayList();
    private final List<Item> _items = new ArrayList();
    private transient RSS _rss = null;

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String str) {
        this._title = str.trim();
    }

    public void setLinkString(String str) throws URISyntaxException {
        this._link = new URI(str);
    }

    public String getLinkString() {
        return this._link.toString();
    }

    public void setLink(URI uri) {
        if (uri == null) {
            throw new NullPointerException("No link");
        }
        this._link = uri;
    }

    public URI getLink() {
        return this._link;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String str) {
        this._description = str.trim();
    }

    public String getLanguage() {
        return this._language;
    }

    public void setLanguage(String str) {
        this._language = str;
    }

    public String getCopyright() {
        return this._copyright;
    }

    public void setCopyright(String str) {
        this._copyright = str;
    }

    public String getManagingEditor() {
        return this._managingEditor;
    }

    public void setManagingEditor(String str) {
        this._managingEditor = str;
    }

    public String getWebMaster() {
        return this._webMaster;
    }

    public void setWebMaster(String str) {
        this._webMaster = str;
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

    public void setPubDate(Date date) {
        this._pubDate = date;
    }

    public Date getPubDate() {
        return this._pubDate;
    }

    public void setLastBuildDateString(String str) {
        this._lastBuildDate = RFC822.valueOf(str);
    }

    public String getLastBuildDateString() {
        Date date = this._lastBuildDate;
        if (date != null) {
            return RFC822.toString(date);
        }
        return null;
    }

    public void setLastBuildDate(Date date) {
        this._lastBuildDate = date;
    }

    public Date getLastBuildDate() {
        return this._lastBuildDate;
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

    public void setGenerator(String str) {
        this._generator = str;
    }

    public String getGenerator() {
        return this._generator;
    }

    public void setDocs(String str) {
        this._docs = str;
    }

    public String getDocs() {
        return this._docs;
    }

    public void setCloud(Cloud cloud) {
        this._cloud = cloud;
    }

    public Cloud getCloud() {
        return this._cloud;
    }

    public void setTTL(Integer num) {
        this._ttl = num;
    }

    public Integer getTTL() {
        return this._ttl;
    }

    public void setImage(Image image) {
        this._image = image;
    }

    public Image getImage() {
        return this._image;
    }

    public void setRating(String str) {
        this._rating = str;
    }

    public String getRating() {
        return this._rating;
    }

    public void setTextInput(TextInput textInput) {
        this._textInput = textInput;
    }

    public TextInput getTextInput() {
        return this._textInput;
    }

    public List<Integer> getSkipHours() {
        return this._skipHours;
    }

    public void addSkipHour(Integer num) {
        if (num == null) {
            throw new NullPointerException("no skipHour");
        }
        this._skipHours.add(num);
    }

    public List<String> getSkipDays() {
        return this._skipDays;
    }

    public void addSkipDay(String str) {
        if (str == null) {
            throw new NullPointerException("no skipDay");
        }
        this._skipDays.add(str);
    }

    public List<Item> getItems() {
        return this._items;
    }

    public void addItem(Item item) {
        item.setChannel(this);
        this._items.add(item);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRSS(RSS rss) {
        this._rss = rss;
    }

    public RSS getRSS() {
        return this._rss;
    }
}
