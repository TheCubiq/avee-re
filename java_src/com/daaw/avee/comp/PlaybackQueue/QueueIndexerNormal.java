package com.daaw.avee.comp.PlaybackQueue;

import com.daaw.avee.comp.PlaybackQueue.IQueueIndexer;
import java.util.List;
/* loaded from: classes.dex */
public class QueueIndexerNormal implements IQueueIndexer {
    private IQueueIndexer.QueueIndexesChangedListener indexesListener = null;
    private int currentQueueIndex = 0;

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getQueueIndexCount(int i) {
        return i;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getSongIndexByQueueIndex(int i, int i2) {
        return i;
    }

    public void init(int i, IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener) {
        this.indexesListener = queueIndexesChangedListener;
        this.currentQueueIndex = 0;
        setQueuePosBySongIndex(i);
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, false, true);
        }
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public boolean onQueueChanged(int i, int i2, int i3, boolean z, int i4) {
        boolean z2;
        int fixQueueIndex_ = QueueCore.fixQueueIndex_(this.currentQueueIndex, i, i2, i3, z);
        this.currentQueueIndex = fixQueueIndex_;
        if (fixQueueIndex_ < 0) {
            this.currentQueueIndex = i - 1;
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.currentQueueIndex < 0) {
            this.currentQueueIndex = 0;
            z2 = true;
        }
        if (this.currentQueueIndex >= i4) {
            this.currentQueueIndex = i4 - 1;
            z2 = true;
        }
        IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener = this.indexesListener;
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public boolean onQueueChanged(List<Integer> list, int i, int i2, boolean z, int i3) {
        boolean z2;
        int fixQueueIndex = QueueCore.fixQueueIndex(this.currentQueueIndex, list, i, i2, z);
        this.currentQueueIndex = fixQueueIndex;
        if (fixQueueIndex < 0) {
            this.currentQueueIndex = QueueCore.fixRemovedQueueIndex(fixQueueIndex, list, i2);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.currentQueueIndex < 0) {
            this.currentQueueIndex = 0;
            z2 = true;
        }
        if (this.currentQueueIndex >= i3) {
            this.currentQueueIndex = i3 - 1;
            z2 = true;
        }
        IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener = this.indexesListener;
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getPrevSongIndex(boolean z) {
        return this.currentQueueIndex - 1;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getCurrentSongIndex(boolean z) {
        return this.currentQueueIndex;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getNextSongIndex(boolean z) {
        return this.currentQueueIndex + 1;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void goTo(int i) {
        this.currentQueueIndex = i;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void goToStart() {
        this.currentQueueIndex = 0;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public boolean goToNext(int i) {
        int nextSongIndex = getNextSongIndex(false);
        this.currentQueueIndex = nextSongIndex;
        if (nextSongIndex >= i) {
            this.currentQueueIndex = i - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void goToPrev() {
        int prevSongIndex = getPrevSongIndex(false);
        this.currentQueueIndex = prevSongIndex;
        if (prevSongIndex < 0) {
            this.currentQueueIndex = 0;
        }
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getQueueIndex() {
        return this.currentQueueIndex;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void setQueuePosBySongIndex(int i) {
        this.currentQueueIndex = i;
    }
}
