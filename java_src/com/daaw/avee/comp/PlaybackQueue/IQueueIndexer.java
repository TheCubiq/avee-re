package com.daaw.avee.comp.PlaybackQueue;

import java.util.List;
/* loaded from: classes.dex */
public interface IQueueIndexer {

    /* loaded from: classes.dex */
    public interface QueueIndexesChangedListener {
        void onQueueIndexesChanged(IQueueIndexer iQueueIndexer, boolean z, boolean z2);
    }

    int getCurrentSongIndex(boolean z);

    int getNextSongIndex(boolean z);

    int getPrevSongIndex(boolean z);

    int getQueueIndex();

    int getQueueIndexCount(int i);

    int getSongIndexByQueueIndex(int i, int i2);

    void goTo(int i);

    boolean goToNext(int i);

    void goToPrev();

    void goToStart();

    boolean onQueueChanged(int i, int i2, int i3, boolean z, int i4);

    boolean onQueueChanged(List<Integer> list, int i, int i2, boolean z, int i3);

    void setQueuePosBySongIndex(int i);
}
