package com.daaw.avee.comp.PlaybackQueue;

import com.daaw.avee.comp.Common.IItemIdentifier;
/* loaded from: classes.dex */
public class QueueItemIdentifier implements IItemIdentifier {
    private int queueIndex;
    private int queueSlot;

    public QueueItemIdentifier() {
        this.queueIndex = -1;
        this.queueSlot = 0;
    }

    public QueueItemIdentifier(int i) {
        this.queueIndex = -1;
        this.queueSlot = i;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.daaw.avee.comp.Common.IItemIdentifier
    public int getQueueIndex() {
        return this.queueIndex;
    }

    @Override // com.daaw.avee.comp.Common.IItemIdentifier
    public int getQueueSlot() {
        return this.queueSlot;
    }

    public void setQueueIndex(int i) {
        this.queueIndex = i;
    }

    @Override // com.daaw.avee.comp.Common.IItemIdentifier
    public void setQueueSlot(int i) {
        this.queueSlot = i;
    }
}
