package com.daaw.avee.comp.PlaybackQueue;

import com.daaw.avee.comp.PlaybackQueue.IQueueIndexer;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
/* loaded from: classes.dex */
public class QueueIndexerShuffle implements IQueueIndexer {
    private int currentQueueIndex = 0;
    private List<Integer> shuffleIndices = new ArrayList();
    private IQueueIndexer.QueueIndexesChangedListener indexesListener = null;

    public void init(int i, List<Integer> list, IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener) {
        this.indexesListener = queueIndexesChangedListener;
        this.shuffleIndices = list;
        this.currentQueueIndex = 0;
        setQueuePosBySongIndex(i);
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, false, true);
        }
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public boolean onQueueChanged(int i, int i2, int i3, boolean z, int i4) {
        ListIterator<Integer> listIterator = this.shuffleIndices.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int fixQueueIndex_ = QueueCore.fixQueueIndex_(listIterator.next().intValue(), i, i2, i3, z);
            if (fixQueueIndex_ < 0) {
                listIterator.remove();
                if (QueueCore.fixQueueIndexSingle(this.currentQueueIndex, nextIndex, -1) < 0) {
                    this.currentQueueIndex = nextIndex;
                    if (nextIndex < 0) {
                        this.currentQueueIndex = 0;
                    }
                    if (this.currentQueueIndex >= this.shuffleIndices.size()) {
                        this.currentQueueIndex = this.shuffleIndices.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(fixQueueIndex_));
            }
        }
        IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener = this.indexesListener;
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public boolean onQueueChanged(List<Integer> list, int i, int i2, boolean z, int i3) {
        ListIterator<Integer> listIterator = this.shuffleIndices.listIterator();
        boolean z2 = false;
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            int fixQueueIndex = QueueCore.fixQueueIndex(listIterator.next().intValue(), list, i, i2, z);
            if (fixQueueIndex < 0) {
                listIterator.remove();
                if (QueueCore.fixRemovedQueueIndexSingle(this.currentQueueIndex, nextIndex) < 0) {
                    this.currentQueueIndex = nextIndex;
                    if (nextIndex < 0) {
                        this.currentQueueIndex = 0;
                    }
                    if (this.currentQueueIndex >= this.shuffleIndices.size()) {
                        this.currentQueueIndex = this.shuffleIndices.size() - 1;
                    }
                    z2 = true;
                }
            } else {
                listIterator.set(Integer.valueOf(fixQueueIndex));
            }
        }
        IQueueIndexer.QueueIndexesChangedListener queueIndexesChangedListener = this.indexesListener;
        if (queueIndexesChangedListener != null) {
            queueIndexesChangedListener.onQueueIndexesChanged(this, true, z2);
        }
        return z2;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getPrevSongIndex(boolean z) {
        int i = this.currentQueueIndex - 1;
        if (i < 0 || i >= this.shuffleIndices.size()) {
            return -1;
        }
        return this.shuffleIndices.get(i).intValue();
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getCurrentSongIndex(boolean z) {
        int i = this.currentQueueIndex;
        if (i < 0 || i >= this.shuffleIndices.size()) {
            return -1;
        }
        return this.shuffleIndices.get(this.currentQueueIndex).intValue();
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getNextSongIndex(boolean z) {
        int i = this.currentQueueIndex + 1;
        if (i < 0 || i >= this.shuffleIndices.size()) {
            return -1;
        }
        return this.shuffleIndices.get(i).intValue();
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
        int i2 = this.currentQueueIndex + 1;
        this.currentQueueIndex = i2;
        if (i2 >= this.shuffleIndices.size()) {
            this.currentQueueIndex = this.shuffleIndices.size() - 1;
            return true;
        }
        return false;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void goToPrev() {
        int i = this.currentQueueIndex - 1;
        this.currentQueueIndex = i;
        if (i < 0) {
            this.currentQueueIndex = 0;
        }
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getQueueIndex() {
        return this.currentQueueIndex;
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public void setQueuePosBySongIndex(int i) {
        ListIterator<Integer> listIterator = this.shuffleIndices.listIterator();
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            if (listIterator.next().intValue() == i) {
                this.currentQueueIndex = nextIndex;
                return;
            }
        }
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getQueueIndexCount(int i) {
        return Math.min(this.shuffleIndices.size(), i);
    }

    @Override // com.daaw.avee.comp.PlaybackQueue.IQueueIndexer
    public int getSongIndexByQueueIndex(int i, int i2) {
        if (i < 0 || i >= this.shuffleIndices.size()) {
            return -1;
        }
        return this.shuffleIndices.get(i).intValue();
    }
}
