package com.daaw.avee.comp.GlobalSearch;

import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.ISearchEntry;
/* loaded from: classes.dex */
public class SearchEntry extends SearchEntryOptions implements ISearchEntry {
    private final int index;
    String query = "";

    /* JADX INFO: Access modifiers changed from: package-private */
    public SearchEntry(int i) {
        this.index = i;
    }

    @Override // com.daaw.avee.comp.Common.ISearchEntry
    public int getIndex() {
        return this.index;
    }

    @Override // com.daaw.avee.comp.Common.ISearchEntry
    public String getQuery() {
        return this.query;
    }

    @Override // com.daaw.avee.comp.Common.ISearchEntry
    public boolean isEnabled() {
        return this.enabled;
    }

    @Override // com.daaw.avee.comp.Common.ISearchEntry
    public String getHint() {
        return this.hint;
    }

    @Override // com.daaw.avee.comp.Common.ISearchEntry
    public IGeneralItemContainerIdentifier getContainerIdentifier() {
        return this.containerIdentifier;
    }
}
