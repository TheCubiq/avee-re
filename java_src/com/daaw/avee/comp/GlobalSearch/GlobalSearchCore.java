package com.daaw.avee.comp.GlobalSearch;

import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.ISearchEntry;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class GlobalSearchCore {
    public static WeakEvent4<Integer, Integer, ISearchEntry, Boolean> ICompositeSearch_onCurrentSearchEntryChanged = new WeakEvent4<>();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<GlobalSearchCore> instanceWeak = new WeakReference<>(null);
    private int currentIndex = -1;
    private SearchEntry[] entrys = new SearchEntry[2];

    public GlobalSearchCore() {
        int i = 0;
        while (true) {
            SearchEntry[] searchEntryArr = this.entrys;
            if (i < searchEntryArr.length) {
                searchEntryArr[i] = new SearchEntry(i);
                i++;
            } else {
                notifyEntry(this.currentIndex, true);
                return;
            }
        }
    }

    public static GlobalSearchCore createInstance() {
        GlobalSearchCore globalSearchCore;
        GlobalSearchCore globalSearchCore2 = instanceWeak.get();
        if (globalSearchCore2 != null) {
            return globalSearchCore2;
        }
        synchronized (createInstanceLock) {
            globalSearchCore = instanceWeak.get();
            if (globalSearchCore == null) {
                globalSearchCore = new GlobalSearchCore();
                instanceWeak = new WeakReference<>(globalSearchCore);
            }
        }
        return globalSearchCore;
    }

    public static GlobalSearchCore getInstance() {
        return instanceWeak.get();
    }

    public SearchEntry getSearchEntry(int i) {
        if (i >= 0) {
            SearchEntry[] searchEntryArr = this.entrys;
            if (i >= searchEntryArr.length) {
                return null;
            }
            return searchEntryArr[i];
        }
        return null;
    }

    public ISearchEntry getCurrentSearchEntry() {
        return getSearchEntry(this.currentIndex);
    }

    public void onUpdateSearchOptions(int i, boolean z, String str, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
        if (i >= 0) {
            SearchEntry[] searchEntryArr = this.entrys;
            if (i >= searchEntryArr.length) {
                return;
            }
            SearchEntry searchEntry = searchEntryArr[i];
            if (searchEntry.containerIdentifier == null || !searchEntry.containerIdentifier.equals(iGeneralItemContainerIdentifier)) {
                this.entrys[i].query = "";
            }
            this.entrys[i].enabled = z;
            this.entrys[i].hint = str;
            this.entrys[i].containerIdentifier = iGeneralItemContainerIdentifier;
            notifyEntry(i, true);
        }
    }

    public void onSearchQueryTextChange(String str) {
        onSearchQueryTextChange(this.currentIndex, str);
    }

    public void onSearchQueryTextChange(int i, String str) {
        if (i >= 0) {
            SearchEntry[] searchEntryArr = this.entrys;
            if (i < searchEntryArr.length && !searchEntryArr[i].query.equals(str)) {
                this.entrys[i].query = str == null ? "" : new String(str);
                notifyEntry(i, true);
            }
        }
    }

    public void onSetCurrentSearchIndex(int i) {
        if (i < 0 || i >= this.entrys.length) {
            this.currentIndex = -1;
        } else {
            this.currentIndex = i;
        }
        notifyEntry(this.currentIndex, false);
    }

    void notifyEntry(int i, boolean z) {
        i = (i < 0 || i >= this.entrys.length) ? -1 : -1;
        ICompositeSearch_onCurrentSearchEntryChanged.invoke(Integer.valueOf(this.currentIndex), Integer.valueOf(i), i >= 0 ? this.entrys[i] : null, Boolean.valueOf(z));
    }
}
