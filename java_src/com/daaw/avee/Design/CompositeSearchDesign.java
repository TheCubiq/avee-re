package com.daaw.avee.Design;

import android.os.AsyncTask;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.Common.ISearchEntry;
import com.daaw.avee.comp.GlobalSearch.GlobalSearchCore;
import com.daaw.avee.comp.GlobalSearch.SearchEntry;
import com.daaw.avee.comp.GlobalSearch.SearchEntryOptions;
import com.daaw.avee.comp.GlobalSearch.SearchTaskManager;
import com.daaw.avee.comp.LibraryQueueUI.Fragment0;
import com.daaw.avee.comp.LibraryQueueUI.Fragment1;
import com.daaw.avee.comp.LibraryQueueUI.LibraryQueueFragmentBase;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class CompositeSearchDesign {
    private static SearchTaskManager searchTaskManager = new SearchTaskManager();
    private List<Object> listenerRefHolder = new LinkedList();

    public CompositeSearchDesign() {
        GlobalSearchCore.ICompositeSearch_onCurrentSearchEntryChanged.subscribeWeak(new WeakEvent4.Handler<Integer, Integer, ISearchEntry, Boolean>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Integer num, Integer num2, ISearchEntry iSearchEntry, Boolean bool) {
                Fragment1 fragment1Instance;
                if (iSearchEntry == null || iSearchEntry.getQuery() == null || iSearchEntry.getQuery().isEmpty()) {
                    CompositeSearchDesign.searchTaskManager.clearTaskIfMatch(num2.intValue());
                }
                MainActivity mainActivity = MainActivity.getInstance();
                if (mainActivity == null) {
                    return;
                }
                if (num.equals(num2)) {
                    mainActivity.updateSearchView(iSearchEntry, false);
                }
                if (!bool.booleanValue() || iSearchEntry == null) {
                    return;
                }
                if (num2.intValue() == 0) {
                    Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                    if (fragment0Instance != null) {
                        fragment0Instance.updateSearchQuery(mainActivity, iSearchEntry.getQuery());
                    }
                } else if (num2.intValue() != 1 || (fragment1Instance = MainActivity.getFragment1Instance()) == null) {
                } else {
                    fragment1Instance.updateSearchQuery(mainActivity, iSearchEntry.getQuery());
                }
            }
        }, this.listenerRefHolder);
        MainActivity.onUISearchQueryTextChange.subscribeWeak(new WeakEvent2.Handler<Integer, String>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, String str) {
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return;
                }
                globalSearchCore.onSearchQueryTextChange(str);
            }
        }, this.listenerRefHolder);
        SearchTaskManager.onUISearchQueryTextChangeWithIndex.subscribeWeak(new WeakEvent2.Handler<Integer, String>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent2.Handler
            public void invoke(Integer num, String str) {
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return;
                }
                globalSearchCore.onSearchQueryTextChange(num.intValue(), str);
            }
        }, this.listenerRefHolder);
        MainActivity.onUISearchQueryStateChange.subscribeWeak(new WeakEvent1.Handler<Boolean>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Boolean bool) {
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return;
                }
                globalSearchCore.onSearchQueryTextChange(null);
            }
        }, this.listenerRefHolder);
        MainActivity.onSetCurrentSearchIndex.subscribeWeak(new WeakEvent1.Handler<Integer>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(Integer num) {
                Fragment1 fragment1Instance;
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return;
                }
                SearchEntryOptions searchEntryOptions = SearchEntryOptions.refuse;
                if (num.intValue() == 0) {
                    Fragment0 fragment0Instance = MainActivity.getFragment0Instance();
                    if (fragment0Instance != null) {
                        searchEntryOptions = fragment0Instance.getSearchEntryOptions();
                    }
                } else if (num.intValue() == 1 && (fragment1Instance = MainActivity.getFragment1Instance()) != null) {
                    searchEntryOptions = fragment1Instance.getSearchEntryOptions();
                }
                if (searchEntryOptions != SearchEntryOptions.refuse) {
                    if (searchEntryOptions != null) {
                        globalSearchCore.onUpdateSearchOptions(num.intValue(), searchEntryOptions.enabled, searchEntryOptions.hint, searchEntryOptions.containerIdentifier);
                    } else {
                        globalSearchCore.onUpdateSearchOptions(num.intValue(), false, "", null);
                    }
                }
                globalSearchCore.onSetCurrentSearchIndex(num.intValue());
            }
        }, this.listenerRefHolder);
        MainActivity.onRequestCurrentSearchEntry.subscribeWeak(new WeakEventR.Handler<ISearchEntry>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.6
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.daaw.avee.Common.Events.WeakEventR.Handler
            public ISearchEntry invoke() {
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return null;
                }
                return globalSearchCore.getCurrentSearchEntry();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onRequestSearchQuery.subscribeWeak(new WeakEventR2.Handler<Integer, IGeneralItemContainerIdentifier, String>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public String invoke(Integer num, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
                SearchEntry searchEntry;
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null || (searchEntry = globalSearchCore.getSearchEntry(num.intValue())) == null || !Utils.compareNullEqual(searchEntry.getContainerIdentifier(), iGeneralItemContainerIdentifier)) {
                    return null;
                }
                return searchEntry.getQuery();
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onUpdateSearchOptions.subscribeWeak(new WeakEvent4.Handler<Integer, Boolean, String, IGeneralItemContainerIdentifier>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(Integer num, Boolean bool, String str, IGeneralItemContainerIdentifier iGeneralItemContainerIdentifier) {
                GlobalSearchCore globalSearchCore = GlobalSearchCore.getInstance();
                if (globalSearchCore == null) {
                    return;
                }
                globalSearchCore.onUpdateSearchOptions(num.intValue(), bool.booleanValue(), str, iGeneralItemContainerIdentifier);
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onCompareSearchTask.subscribeWeak(new WeakEventR2.Handler<AsyncTask, Integer, Boolean>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEventR2.Handler
            public Boolean invoke(AsyncTask asyncTask, Integer num) {
                return Boolean.valueOf(CompositeSearchDesign.searchTaskManager.compareTask(asyncTask, num.intValue()));
            }
        }, this.listenerRefHolder);
        LibraryQueueFragmentBase.onStartingSearchTask.subscribeWeak(new WeakEvent3.Handler<AsyncTask, Integer, Object>() { // from class: com.daaw.avee.Design.CompositeSearchDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(AsyncTask asyncTask, Integer num, Object obj) {
                CompositeSearchDesign.searchTaskManager.setTask(asyncTask, num.intValue());
            }
        }, this.listenerRefHolder);
    }
}
