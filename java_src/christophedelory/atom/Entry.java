package christophedelory.atom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class Entry extends Common {
    private final List<Person> _authors = new ArrayList();
    private final List<Category> _categories = new ArrayList();
    private final List<Content> _contents = new ArrayList();
    private final List<Person> _contributors = new ArrayList();
    private URIContainer _id = null;
    private final List<Link> _links = new ArrayList();
    private Date _published = null;
    private TextContainer _rights = null;
    private Source _source = null;
    private TextContainer _summary = null;
    private TextContainer _title = null;
    private Date _updated = null;

    public List<Person> getAuthors() {
        return this._authors;
    }

    public void addAuthor(Person person) {
        if (person == null) {
            throw new NullPointerException("no author");
        }
        this._authors.add(person);
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

    public List<Content> getContents() {
        return this._contents;
    }

    public void addContent(Content content) {
        if (content == null) {
            throw new NullPointerException("no content");
        }
        this._contents.add(content);
    }

    public List<Person> getContributors() {
        return this._contributors;
    }

    public void addContributor(Person person) {
        if (person == null) {
            throw new NullPointerException("no contributor");
        }
        this._contributors.add(person);
    }

    public URIContainer getId() {
        return this._id;
    }

    public void setId(URIContainer uRIContainer) {
        if (uRIContainer == null) {
            throw new NullPointerException("no id");
        }
        this._id = uRIContainer;
    }

    public List<Link> getLinks() {
        return this._links;
    }

    public void addLink(Link link) {
        if (link == null) {
            throw new NullPointerException("no link");
        }
        this._links.add(link);
    }

    public Date getPublished() {
        return this._published;
    }

    public void setPublished(Date date) {
        this._published = date;
    }

    public TextContainer getRights() {
        return this._rights;
    }

    public void setRights(TextContainer textContainer) {
        this._rights = textContainer;
    }

    public Source getSource() {
        return this._source;
    }

    public void setSource(Source source) {
        this._source = source;
    }

    public TextContainer getSummary() {
        return this._summary;
    }

    public void setSummary(TextContainer textContainer) {
        this._summary = textContainer;
    }

    public TextContainer getTitle() {
        return this._title;
    }

    public void setTitle(TextContainer textContainer) {
        if (textContainer == null) {
            throw new NullPointerException("no title");
        }
        this._title = textContainer;
    }

    public Date getUpdated() {
        return this._updated;
    }

    public void setUpdated(Date date) {
        if (date == null) {
            throw new NullPointerException("no updated date");
        }
        this._updated = date;
    }
}
