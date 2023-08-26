package com.daaw.avee.comp.LibraryQueueUI.Containers;

import android.content.Context;
import com.daaw.avee.comp.IceCast.GenreDesc;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
/* loaded from: classes.dex */
public class SearchFilterGenreDesc implements FilterComparable<GenreDesc> {
    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public void preProcessItem(GenreDesc genreDesc) {
    }

    public SearchFilterGenreDesc(Context context) {
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public String preProcessQuery(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public boolean compare(String str, GenreDesc genreDesc) {
        return genreDesc.name.toLowerCase().contains(str);
    }
}
