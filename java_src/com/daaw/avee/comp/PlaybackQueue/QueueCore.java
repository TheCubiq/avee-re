package com.daaw.avee.comp.PlaybackQueue;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.MultiList;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsMusic;
import com.daaw.avee.Common.tlog;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.AppPreferences.AppPreferences;
import com.daaw.avee.comp.Common.IItemIdentifier;
import com.daaw.avee.comp.PlaybackQueue.IQueueIndexer;
import com.daaw.avee.comp.playback.MediaPlaybackServiceDefs;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class QueueCore implements MediaPlaybackServiceDefs, IQueueIndexer.QueueIndexesChangedListener {
    public static WeakEventR<Boolean> onRequestShouldReloadInitalSongs = new WeakEventR<>();
    public static WeakEvent5<Tuple2<PlaylistSong, IItemIdentifier>, Integer, Boolean, Boolean, Object> onQueuePosChanged = new WeakEvent5<>();
    public static WeakEvent2<MultiList<PlaylistSong, IItemIdentifier>, IPlaylistSongContainerIdentifier> onQueueStateChanged = new WeakEvent2<>();
    public static WeakEvent1<Integer> onShuffleModeChanged = new WeakEvent1<>();
    private static final Object createInstanceLock = new Object();
    private static volatile QueueCore instance = null;
    private IPlaylistSongContainerIdentifier songContainerIdentifier = null;
    private MultiList<PlaylistSong, IItemIdentifier> playList = new MultiList<>();
    private IQueueIndexer queueIndexer = new QueueIndexerNormal();
    private int shuffleMode = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fixQueueIndexSingle(int i, int i2, int i3) {
        if (i < i2) {
            return i;
        }
        int i4 = i + i3;
        if (i4 <= i2) {
            return -1;
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fixQueueIndex_(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            return i == i3 ? i2 : i == i2 ? i3 : i;
        } else if (i < i2) {
            return i;
        } else {
            int i5 = i + (i4 * ((i3 - i2) + 1));
            if (i5 <= i2) {
                return -1;
            }
            return i5;
        }
    }

    private QueueCore() {
        setShuffleMode(0, false);
        reloadQueue();
    }

    public static QueueCore createOrGetInstance() {
        QueueCore queueCore;
        QueueCore queueCore2 = instance;
        if (queueCore2 != null) {
            return queueCore2;
        }
        synchronized (createInstanceLock) {
            queueCore = instance;
            if (queueCore == null) {
                queueCore = new QueueCore();
                instance = queueCore;
            }
        }
        return queueCore;
    }

    private Resources getResources() {
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return null;
        }
        return appContext.getResources();
    }

    private void notifyMessage(String str) {
        EventsGlobalTextNotifier.onTextMsg.invoke(str);
    }

    private void notifyQueueChange() {
        onQueueStateChanged.invoke(getQueue(), this.songContainerIdentifier);
    }

    public void setShuffleMode(int i, boolean z) {
        setShuffleMode(i, z, false);
    }

    public void setShuffleMode(int i, boolean z, boolean z2) {
        Context appContext;
        if (z2 || this.shuffleMode != i) {
            this.shuffleMode = i;
            IQueueIndexer iQueueIndexer = this.queueIndexer;
            int currentSongIndex = iQueueIndexer == null ? 0 : iQueueIndexer.getCurrentSongIndex(true);
            int i2 = this.shuffleMode;
            if (i2 == 0) {
                QueueIndexerNormal queueIndexerNormal = new QueueIndexerNormal();
                this.queueIndexer = queueIndexerNormal;
                queueIndexerNormal.init(currentSongIndex, this);
                if (z && (appContext = PlayerCore.s().getAppContext()) != null) {
                    notifyMessage(appContext.getString(R.string.playback_shuffle_off));
                }
            } else if (i2 == 1) {
                ArrayList arrayList = new ArrayList(this.playList.size());
                ArrayList arrayList2 = new ArrayList();
                int i3 = currentSongIndex < 0 ? 0 : currentSongIndex;
                if (i3 > this.playList.size()) {
                    i3 = this.playList.size() - 1;
                }
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(Integer.valueOf(i4));
                }
                arrayList.add(Integer.valueOf(i3));
                for (int i5 = i3 + 1; i5 < this.playList.size(); i5++) {
                    arrayList2.add(Integer.valueOf(i5));
                }
                Collections.shuffle(arrayList2);
                for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                    arrayList.add(arrayList2.get(i6));
                }
                if (arrayList.size() > 0) {
                    QueueIndexerShuffle queueIndexerShuffle = new QueueIndexerShuffle();
                    this.queueIndexer = queueIndexerShuffle;
                    queueIndexerShuffle.init(currentSongIndex, arrayList, this);
                    if (z && getResources() != null) {
                        int size = arrayList2.size();
                        notifyMessage(getResources().getQuantityString(R.plurals.x_items_shuffled, size, Integer.valueOf(size)));
                    }
                }
            }
            notifyQueueChange();
            onShuffleModeChanged.invoke(Integer.valueOf(this.shuffleMode));
        }
    }

    public int getShuffleMode() {
        return this.shuffleMode;
    }

    public void previewOpen(List<PlaylistSong> list, int i, Object obj) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        onQueuePosChangedPreview(list.get(i), false, true, obj);
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer.QueueIndexesChangedListener
    public void onQueueIndexesChanged(IQueueIndexer iQueueIndexer, boolean z, boolean z2) {
        int size = this.playList.size();
        for (int i = 0; i < size; i++) {
            ((QueueItemIdentifier) this.playList.get2(i)).setQueueIndex(-1);
        }
        int queueIndexCount = iQueueIndexer.getQueueIndexCount(this.playList.size());
        for (int i2 = 0; i2 < queueIndexCount; i2++) {
            int songIndexByQueueIndex = iQueueIndexer.getSongIndexByQueueIndex(i2, this.playList.size());
            if (songIndexByQueueIndex < this.playList.size()) {
                ((QueueItemIdentifier) this.playList.get2(songIndexByQueueIndex)).setQueueIndex(i2);
            }
        }
        notifyQueueChange();
        if (z2) {
            onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), false, false, null);
        }
    }

    private int addToPlayList(Collection<PlaylistSong> collection, int i, boolean z, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, int i2, boolean z2) {
        if (z) {
            this.playList.clear();
            i = 0;
        }
        if (i > this.playList.size()) {
            i = this.playList.size();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (int i3 = 0; i3 < collection.size(); i3++) {
            arrayList.add(i3, new QueueItemIdentifier(i2));
        }
        this.playList.addAll(i, collection, arrayList);
        if (z) {
            onQueueChanged2(i, i + collection.size(), 0, false, iPlaylistSongContainerIdentifier, true, z2);
        } else {
            onQueueChanged2(i, (collection.size() + i) - 1, 1, false, null, false, z2);
        }
        return i;
    }

    public void enqueue(Collection<PlaylistSong> collection, int i, int i2) {
        open(collection, -1, i, null, null, i2, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r13 == 3) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void open(Collection<PlaylistSong> collection, int i, int i2, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, Object obj, int i3, boolean z) {
        int i4 = -1;
        if (i2 != -1) {
            if (i2 == 0) {
                i4 = 0;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i4 = this.queueIndexer.getCurrentSongIndex(true) + 1;
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
        }
        int addToPlayList = addToPlayList(collection, i4, i4 < 0, iPlaylistSongContainerIdentifier, i3, z);
        if (i >= 0) {
            this.queueIndexer.goTo(addToPlayList + i);
            onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), false, true, obj);
        }
    }

    public void removeQueueItems(int i) {
        ArrayList arrayList = new ArrayList(4);
        MultiList.ListIterator<PlaylistSong, IItemIdentifier> multiListIterator = this.playList.multiListIterator();
        while (multiListIterator.hasNext()) {
            int nextIndex = multiListIterator.nextIndex();
            if (i == multiListIterator.next().obj2.getQueueSlot()) {
                arrayList.add(Integer.valueOf(nextIndex));
                multiListIterator.remove();
            }
        }
        onQueueChanged22(arrayList, -1, 0, false, null);
    }

    public void removeQueueItems(List<IItemIdentifier> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (IItemIdentifier iItemIdentifier : list) {
            MultiList.ListIterator<PlaylistSong, IItemIdentifier> multiListIterator = this.playList.multiListIterator();
            while (multiListIterator.hasNext()) {
                int nextIndex = multiListIterator.nextIndex();
                if (iItemIdentifier.equals(multiListIterator.next().obj2)) {
                    arrayList.add(Integer.valueOf(nextIndex));
                    multiListIterator.remove();
                }
            }
        }
        onQueueChanged22(arrayList, -1, 0, false, null);
    }

    public int removeTracks(int i, int i2) {
        if (i2 < i) {
            return 0;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.playList.size()) {
            i2 = this.playList.size() - 1;
        }
        this.playList.subList(i, i2 + 1).clear();
        onQueueChanged2(i, i2, -1, false, null);
        return (i2 - i) + 1;
    }

    public int removeTrack(PlaylistSong playlistSong) {
        MultiList.ListIterator<PlaylistSong, IItemIdentifier> multiListIterator = this.playList.multiListIterator();
        int i = 0;
        while (multiListIterator.hasNext()) {
            int nextIndex = multiListIterator.nextIndex();
            if (multiListIterator.next1().compare(playlistSong)) {
                multiListIterator.remove();
                i++;
                onQueueChanged2(nextIndex, nextIndex, -1, false, null);
            }
        }
        return i;
    }

    public void swapQueueItem(int i, int i2) {
        if (i >= this.playList.size()) {
            i = this.playList.size() - 1;
        }
        int i3 = i;
        if (i2 >= this.playList.size()) {
            i2 = this.playList.size() - 1;
        }
        int i4 = i2;
        this.playList.swap(i3, i4);
        onQueueChanged2(i3, i4, 0, true, null);
    }

    public void moveQueueItems(int i, int i2, List<Integer> list, int i3) {
        Tuple2<PlaylistSong, IItemIdentifier>[] tuple2Arr = new Tuple2[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue = list.get(i4).intValue() + i;
            tuple2Arr[i4] = new Tuple2<>(this.playList.get1(intValue), this.playList.get2(intValue));
            tuple2Arr[i4].obj2.setQueueSlot(i3);
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            this.playList.remove(list.get(size).intValue() + i);
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            this.playList.add(Math.max(0, Math.min(this.playList.size(), list.get(size2).intValue() + i2)), tuple2Arr[size2]);
        }
        onQueueChanged22(list, i2, i, false, null);
    }

    public void setQueueItemSlot(IItemIdentifier iItemIdentifier, int i) {
        if (iItemIdentifier == null || iItemIdentifier.getQueueSlot() == i) {
            return;
        }
        iItemIdentifier.setQueueSlot(i);
        notifyQueueChange();
    }

    public List<PlaylistSong> getQueue1() {
        return this.playList.unmodifiableList1();
    }

    public MultiList<PlaylistSong, IItemIdentifier> getQueue() {
        return this.playList.unmodifiableList();
    }

    void onQueueChanged2(int i, int i2, int i3, boolean z, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
        onQueueChanged2(i, i2, i3, z, iPlaylistSongContainerIdentifier, false, true);
    }

    void onQueueChanged2(int i, int i2, int i3, boolean z, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier, boolean z2, boolean z3) {
        this.songContainerIdentifier = iPlaylistSongContainerIdentifier;
        if (i > i2) {
            return;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 >= this.playList.size()) {
            i2 = this.playList.size() - 1;
        }
        if (z2) {
            setShuffleMode(0, true);
        }
        this.queueIndexer.onQueueChanged(i, i2, i3, z, this.playList.size());
        if (z || !z3) {
            return;
        }
        int i4 = (i2 - i) + 1;
        if (getResources() != null) {
            if (i3 == 1) {
                EventsGlobalTextNotifier.onTextMsg.invoke(getResources().getQuantityString(R.plurals.x_items_added_to_queue, i4, Integer.valueOf(i4)));
            } else if (i3 == -1) {
                EventsGlobalTextNotifier.onTextMsg.invoke(getResources().getQuantityString(R.plurals.x_items_removed_from_queue, i4, Integer.valueOf(i4)));
            } else if (i3 == 0 && z2) {
                EventsGlobalTextNotifier.onTextMsg.invoke(getResources().getQuantityString(R.plurals.x_items_opened_in_queue, i4, Integer.valueOf(i4)));
            }
        }
    }

    void onQueueChanged22(List<Integer> list, int i, int i2, boolean z, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
        this.songContainerIdentifier = iPlaylistSongContainerIdentifier;
        this.queueIndexer.onQueueChanged(list, i, i2, z, this.playList.size());
    }

    public Tuple2<PlaylistSong, IItemIdentifier> getCurrentQueueEntry() {
        IQueueIndexer iQueueIndexer = this.queueIndexer;
        int currentSongIndex = iQueueIndexer == null ? 0 : iQueueIndexer.getCurrentSongIndex(true);
        if (currentSongIndex < 0 || currentSongIndex >= this.playList.size()) {
            return null;
        }
        return this.playList.get(currentSongIndex);
    }

    public IPlaylistSongContainerIdentifier getSongContainerIdentifier() {
        return this.songContainerIdentifier;
    }

    public int getQueuePosition() {
        return this.queueIndexer.getCurrentSongIndex(true);
    }

    public void setQueuePosition(int i) {
        setQueuePosition(i, null);
    }

    public void setQueuePosition(int i, Object obj) {
        this.queueIndexer.setQueuePosBySongIndex(i);
        onQueuePosChanged(i, false, true, obj);
    }

    public void setQueueItem(IItemIdentifier iItemIdentifier, Object obj) {
        if (iItemIdentifier == null) {
            return;
        }
        setQueuePosition(findPlaylistEntryByItemIdent(iItemIdentifier, iItemIdentifier.getQueueIndex()), obj);
    }

    private int findPlaylistEntryByItemIdent(IItemIdentifier iItemIdentifier, int i) {
        if (iItemIdentifier == null) {
            return -1;
        }
        if (i >= 0 && i < this.playList.size()) {
            Tuple2<PlaylistSong, IItemIdentifier> tuple2 = this.playList.get(i);
            if (tuple2.obj2 != null && tuple2.obj2.equals(iItemIdentifier)) {
                return i;
            }
        }
        MultiList.ListIterator<PlaylistSong, IItemIdentifier> multiListIterator = this.playList.multiListIterator();
        while (multiListIterator.hasNext()) {
            int nextIndex = multiListIterator.nextIndex();
            Tuple2<PlaylistSong, IItemIdentifier> next = multiListIterator.next();
            if (next.obj2 != null && next.obj2.equals(iItemIdentifier)) {
                return nextIndex;
            }
        }
        return -1;
    }

    public void onDataSaveTime(Context context) {
        saveQueue(context);
    }

    private void saveQueue(Context context) {
        SharedPreferences.Editor edit = AppPreferences.createOrGetInstance().getPreferences(context).edit();
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        int size = this.playList.size();
        for (int i = 0; i < size; i++) {
            String construcPath = this.playList.get1(i).getConstrucPath();
            if (construcPath != null) {
                sb.append(construcPath);
                sb2.append(construcPath.length());
                sb2.append(',');
            }
        }
        edit.putString("queue", sb.toString());
        edit.putString("queueSizes", sb2.toString());
        edit.putInt("curpos", this.queueIndexer.getQueueIndex());
        edit.putInt("shufflemode", this.shuffleMode);
        edit.apply();
    }

    public void reloadQueue() {
        tlog.d("reloadQueue");
        Context appContext = PlayerCore.s().getAppContext();
        if (appContext == null) {
            return;
        }
        SharedPreferences preferences = AppPreferences.createOrGetInstance().getPreferences(appContext);
        String preferencesGetStringSafe = AppPreferences.preferencesGetStringSafe(preferences, "queue", "");
        String preferencesGetStringSafe2 = AppPreferences.preferencesGetStringSafe(preferences, "queueSizes", "");
        int length = preferencesGetStringSafe != null ? preferencesGetStringSafe.length() : 0;
        int length2 = preferencesGetStringSafe2 != null ? preferencesGetStringSafe2.length() : 0;
        this.playList.clear();
        if (length > 1 && length2 > 0) {
            String[] split = preferencesGetStringSafe2.split(",");
            int length3 = split.length;
            int i = 0;
            int i2 = 0;
            while (i < length3) {
                int strToIntSafe = Utils.strToIntSafe(split[i]) + i2;
                this.playList.add((MultiList<PlaylistSong, IItemIdentifier>) new PlaylistSong(preferencesGetStringSafe.substring(i2, strToIntSafe)), (PlaylistSong) new QueueItemIdentifier());
                i++;
                i2 = strToIntSafe;
            }
        }
        if (this.playList.size() == 0 && onRequestShouldReloadInitalSongs.invoke(false).booleanValue()) {
            List<PlaylistSong> mostRecentTrackListByCount = UtilsMusic.getMostRecentTrackListByCount(appContext, 30);
            tlog.d("getMostRecentTrackListByCount: " + mostRecentTrackListByCount.size());
            for (PlaylistSong playlistSong : mostRecentTrackListByCount) {
                this.playList.add((MultiList<PlaylistSong, IItemIdentifier>) playlistSong, (PlaylistSong) new QueueItemIdentifier());
            }
        }
        this.queueIndexer.goTo(AppPreferences.preferencesGetIntSafe(preferences, "curpos", 0));
        int preferencesGetIntSafe = AppPreferences.preferencesGetIntSafe(preferences, "shufflemode", 0);
        if (preferencesGetIntSafe != 1) {
            preferencesGetIntSafe = 0;
        }
        setShuffleMode(preferencesGetIntSafe, false, true);
        onQueueChanged2(0, this.playList.size(), 0, false, null);
    }

    public boolean isNextPlaylistEnd() {
        int nextSongIndex = this.queueIndexer.getNextSongIndex(false);
        return nextSongIndex == -1 || nextSongIndex >= this.playList.size();
    }

    public void playFirst(Object obj) {
        this.queueIndexer.goToStart();
        onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), false, true, obj);
    }

    public void playCurrent(Object obj) {
        onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), false, true, obj);
    }

    public void prev(Object obj) {
        this.queueIndexer.goToPrev();
        onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), false, true, obj);
    }

    public void next(Object obj) {
        onQueuePosChanged(this.queueIndexer.getCurrentSongIndex(true), this.queueIndexer.goToNext(this.playList.size()), true, obj);
    }

    public void nextOrFirst(Object obj) {
        if (isNextPlaylistEnd()) {
            playFirst(obj);
        } else {
            next(obj);
        }
    }

    public void open(List<PlaylistSong> list, int i, int i2, IPlaylistSongContainerIdentifier iPlaylistSongContainerIdentifier) {
        open(list, i, i2, iPlaylistSongContainerIdentifier, null, 0, true);
    }

    public void setQueueItem(IItemIdentifier iItemIdentifier) {
        setQueueItem(iItemIdentifier, null);
    }

    public void playFirst() {
        playFirst(null);
    }

    public void playCurrent() {
        playCurrent(null);
    }

    public void prev() {
        prev(null);
    }

    public void next() {
        next(null);
    }

    public void nextOrFirst() {
        nextOrFirst(null);
    }

    void onQueuePosChanged(int i, boolean z, boolean z2, Object obj) {
        onQueuePosChanged.invoke((i < 0 || i >= this.playList.size()) ? null : this.playList.get(i), Integer.valueOf(i), Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    void onQueuePosChangedPreview(PlaylistSong playlistSong, boolean z, boolean z2, Object obj) {
        onQueuePosChanged.invoke(new Tuple2<>(playlistSong, new QueueItemIdentifier(-1)), -1, Boolean.valueOf(z), Boolean.valueOf(z2), obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fixRemovedQueueIndexSingle(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        return fixRemovedQueueIndex(i, arrayList, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fixRemovedQueueIndex(int i, List<Integer> list, int i2) {
        for (int size = list.size() - 1; size >= 0; size--) {
            if (size + i2 == i) {
                i--;
            }
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int fixQueueIndex(int i, List<Integer> list, int i2, int i3, boolean z) {
        int i4;
        if (z) {
            for (Integer num : list) {
                if (num.intValue() + i2 == i) {
                    return num.intValue() + i3;
                }
                if (num.intValue() + i3 == i) {
                    return num.intValue() + i2;
                }
            }
            return i;
        }
        if (i3 >= 0) {
            i4 = i;
            for (Integer num2 : list) {
                if (num2.intValue() + i3 < i) {
                    i4--;
                }
                if (num2.intValue() + i3 == i) {
                    if (i2 >= 0) {
                        return num2.intValue() + i2;
                    }
                    return -1;
                }
            }
        } else {
            i4 = i;
        }
        if (i2 >= 0) {
            for (Integer num3 : list) {
                if (num3.intValue() + i2 <= i) {
                    i4++;
                }
            }
        }
        return i4;
    }
}
