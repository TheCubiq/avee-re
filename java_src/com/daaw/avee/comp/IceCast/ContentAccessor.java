package com.daaw.avee.comp.IceCast;

import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakEventR2;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.VAsyncTask;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.Design.SortDesign;
import com.daaw.avee.comp.Common.IGeneralItemContainerIdentifier;
import com.daaw.avee.comp.IceCast.XiphYpXmlParser;
import com.daaw.avee.comp.LibraryQueueUI.Containers.Base.ContainerBase;
import com.daaw.avee.comp.LibraryQueueUI.StationSortingUtils;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import com.google.android.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ContentAccessorOld.java */
/* loaded from: classes.dex */
public class ContentAccessor implements Func1<ContainerBase, List<PlaylistSong>> {
    public static WeakEventR2<Integer, IGeneralItemContainerIdentifier, SortDesign.SortDesc> onRequestCurrentSortDesc = new WeakEventR2<>();
    ContainerBase container;
    VAsyncTask<MultiList<PlaylistSong, StationEntry>> entriesTask;
    IceCastDirectory<Tuple2<PlaylistSong, StationEntry>, MultiList<PlaylistSong, StationEntry>> iceCastDirectory;
    MultiList<PlaylistSong, StationEntry> content = null;
    boolean initialized = false;

    @Override // com.daaw.avee.Common.Func.Func1
    public List<PlaylistSong> onInvoke(final ContainerBase containerBase) {
        this.container = containerBase;
        if (!this.initialized) {
            this.iceCastDirectory = new IceCastDirectory<>("http://dir.xiph.org/yp.xml", "xiph_org_yp", new XiphYpXmlParser.EntryFactory<Tuple2<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.IceCast.ContentAccessor.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.daaw.avee.comp.IceCast.XiphYpXmlParser.EntryFactory
                public Tuple2<PlaylistSong, StationEntry> createEntry(String str, String str2, int i, String str3) {
                    return new Tuple2<>(new PlaylistSong(-1L, str2, str, null), new StationEntry(str, str2, i, str3));
                }
            }, new MultiList.Factory());
            containerBase.updateStatusInfo(null);
            refreshEntries();
            this.iceCastDirectory.Refresh(new Action1<String>() { // from class: com.daaw.avee.comp.IceCast.ContentAccessor.2
                @Override // com.daaw.avee.Common.Action1
                public void onInvoke(String str) {
                    if (str != null) {
                        str.length();
                    }
                    containerBase.updateStatusInfo(str);
                    ContentAccessor.this.refreshEntries();
                }
            }, ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            this.initialized = true;
        }
        if (this.content == null) {
            containerBase.setLoadingActive(true);
            return null;
        }
        containerBase.setLoadingActive(false);
        sortContent(containerBase, this.content);
        return this.content.unmodifiableList1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void refreshEntries() {
        VAsyncTask.CancelTaskSafe(this.entriesTask);
        this.entriesTask = null;
        VAsyncTask<MultiList<PlaylistSong, StationEntry>> cachedEntries = this.iceCastDirectory.getCachedEntries();
        this.entriesTask = cachedEntries;
        cachedEntries.Run(new VAsyncTask.ResultListener<MultiList<PlaylistSong, StationEntry>>() { // from class: com.daaw.avee.comp.IceCast.ContentAccessor.3
            @Override // com.daaw.avee.Common.VAsyncTask.ResultListener
            public void onResult(MultiList<PlaylistSong, StationEntry> multiList, boolean z) {
                if (multiList == null) {
                    multiList = new MultiList<>();
                }
                ContentAccessor.this.content = multiList;
                ContentAccessor.this.container.RefreshContent();
            }
        });
    }

    void sortContent(ContainerBase containerBase, MultiList<PlaylistSong, StationEntry> multiList) {
        Comparator<Tuple2<PlaylistSong, StationEntry>> sortComparator = StationSortingUtils.getSortComparator(onRequestCurrentSortDesc.invoke(Integer.valueOf(containerBase.getPageIndex()), containerBase.getSelectionContainerIdentifier(), null), 10);
        if (sortComparator != null) {
            try {
                Collections.sort(multiList, sortComparator);
            } catch (Exception e) {
                tlog.w("Comparator<Tuple2<PlaylistSong, StationEntry>> exception");
                e.printStackTrace();
            }
        }
    }
}
