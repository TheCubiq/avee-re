package com.daaw.avee.comp.Shoutcast;

import android.content.Context;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable;
/* loaded from: classes.dex */
public class SearchFilterStation implements FilterComparable<ShoutcastStationEntry> {
    private Context context;

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public void preProcessItem(ShoutcastStationEntry shoutcastStationEntry) {
    }

    public SearchFilterStation(Context context) {
        this.context = context;
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public String preProcessQuery(String str) {
        return str.toLowerCase();
    }

    @Override // com.daaw.avee.comp.LibraryQueueUI.Containers.Base.FilterComparable
    public boolean compare(String str, ShoutcastStationEntry shoutcastStationEntry) {
        if (shoutcastStationEntry != null) {
            return shoutcastStationEntry.name.toLowerCase().contains(str) || shoutcastStationEntry.artistName().toLowerCase().contains(str);
        }
        return false;
    }
}
