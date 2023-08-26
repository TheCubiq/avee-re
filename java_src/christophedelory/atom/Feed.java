package christophedelory.atom;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/* loaded from: classes.dex */
public class Feed extends Source {
    private final List<Entry> _entries = new ArrayList();

    @Override // christophedelory.atom.Source
    public void setId(URIContainer uRIContainer) {
        if (uRIContainer == null) {
            throw new NullPointerException("no id");
        }
        super.setId(uRIContainer);
    }

    @Override // christophedelory.atom.Source
    public void setTitle(TextContainer textContainer) {
        if (textContainer == null) {
            throw new NullPointerException("no title");
        }
        super.setTitle(textContainer);
    }

    @Override // christophedelory.atom.Source
    public void setUpdated(Date date) {
        if (date == null) {
            throw new NullPointerException("no updated date");
        }
        super.setUpdated(date);
    }

    public List<Entry> getEntries() {
        return this._entries;
    }

    public void addEntry(Entry entry) {
        if (entry == null) {
            throw new NullPointerException("no entry");
        }
        this._entries.add(entry);
    }
}
