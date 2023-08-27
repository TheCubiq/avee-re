package christophedelory.atom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class Source extends Common {
    private final List<Person> _authors = new ArrayList();
    private final List<Category> _categories = new ArrayList();
    private final List<Person> _contributors = new ArrayList();
    private Generator _generator = null;
    private URIContainer _icon = null;
    private URIContainer _id = null;
    private final List<Link> _links = new ArrayList();
    private URIContainer _logo = null;
    private TextContainer _rights = null;
    private TextContainer _subtitle = null;
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

    public List<Person> getContributors() {
        return this._contributors;
    }

    public void addContributor(Person person) {
        if (person == null) {
            throw new NullPointerException("no contributor");
        }
        this._contributors.add(person);
    }

    public Generator getGenerator() {
        return this._generator;
    }

    public void setGenerator(Generator generator) {
        this._generator = generator;
    }

    public URIContainer getIcon() {
        return this._icon;
    }

    public void setIcon(URIContainer uRIContainer) {
        this._icon = uRIContainer;
    }

    public URIContainer getId() {
        return this._id;
    }

    public void setId(URIContainer uRIContainer) {
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

    public URIContainer getLogo() {
        return this._logo;
    }

    public void setLogo(URIContainer uRIContainer) {
        this._logo = uRIContainer;
    }

    public TextContainer getRights() {
        return this._rights;
    }

    public void setRights(TextContainer textContainer) {
        this._rights = textContainer;
    }

    public TextContainer getSubtitle() {
        return this._subtitle;
    }

    public void setSubtitle(TextContainer textContainer) {
        this._subtitle = textContainer;
    }

    public TextContainer getTitle() {
        return this._title;
    }

    public void setTitle(TextContainer textContainer) {
        this._title = textContainer;
    }

    public Date getUpdated() {
        return this._updated;
    }

    public void setUpdated(Date date) {
        this._updated = date;
    }
}
