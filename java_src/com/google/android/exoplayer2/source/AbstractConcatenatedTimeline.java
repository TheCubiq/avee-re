package com.google.android.exoplayer2.source;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
/* loaded from: classes.dex */
abstract class AbstractConcatenatedTimeline extends Timeline {
    private final int childCount;
    private final boolean isAtomic;
    private final ShuffleOrder shuffleOrder;

    protected abstract int getChildIndexByChildUid(Object obj);

    protected abstract int getChildIndexByPeriodIndex(int i);

    protected abstract int getChildIndexByWindowIndex(int i);

    protected abstract Object getChildUidByChildIndex(int i);

    protected abstract int getFirstPeriodIndexByChildIndex(int i);

    protected abstract int getFirstWindowIndexByChildIndex(int i);

    protected abstract Timeline getTimelineByChildIndex(int i);

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder) {
        this.isAtomic = z;
        this.shuffleOrder = shuffleOrder;
        this.childCount = shuffleOrder.getLength();
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (this.isAtomic) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int nextWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getNextWindowIndex(i - firstWindowIndexByChildIndex, i2 != 2 ? i2 : 0, z);
        if (nextWindowIndex != -1) {
            return firstWindowIndexByChildIndex + nextWindowIndex;
        }
        int nextChildIndex = getNextChildIndex(childIndexByWindowIndex, z);
        while (nextChildIndex != -1 && getTimelineByChildIndex(nextChildIndex).isEmpty()) {
            nextChildIndex = getNextChildIndex(nextChildIndex, z);
        }
        if (nextChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(nextChildIndex) + getTimelineByChildIndex(nextChildIndex).getFirstWindowIndex(z);
        }
        if (i2 == 2) {
            return getFirstWindowIndex(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (this.isAtomic) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int previousWindowIndex = getTimelineByChildIndex(childIndexByWindowIndex).getPreviousWindowIndex(i - firstWindowIndexByChildIndex, i2 != 2 ? i2 : 0, z);
        if (previousWindowIndex != -1) {
            return firstWindowIndexByChildIndex + previousWindowIndex;
        }
        int previousChildIndex = getPreviousChildIndex(childIndexByWindowIndex, z);
        while (previousChildIndex != -1 && getTimelineByChildIndex(previousChildIndex).isEmpty()) {
            previousChildIndex = getPreviousChildIndex(previousChildIndex, z);
        }
        if (previousChildIndex != -1) {
            return getFirstWindowIndexByChildIndex(previousChildIndex) + getTimelineByChildIndex(previousChildIndex).getLastWindowIndex(z);
        }
        if (i2 == 2) {
            return getLastWindowIndex(z);
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z = false;
        }
        int lastIndex = z ? this.shuffleOrder.getLastIndex() : this.childCount - 1;
        while (getTimelineByChildIndex(lastIndex).isEmpty()) {
            lastIndex = getPreviousChildIndex(lastIndex, z);
            if (lastIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(lastIndex) + getTimelineByChildIndex(lastIndex).getLastWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z) {
        if (this.childCount == 0) {
            return -1;
        }
        if (this.isAtomic) {
            z = false;
        }
        int firstIndex = z ? this.shuffleOrder.getFirstIndex() : 0;
        while (getTimelineByChildIndex(firstIndex).isEmpty()) {
            firstIndex = getNextChildIndex(firstIndex, z);
            if (firstIndex == -1) {
                return -1;
            }
        }
        return getFirstWindowIndexByChildIndex(firstIndex) + getTimelineByChildIndex(firstIndex).getFirstWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, boolean z, long j) {
        int childIndexByWindowIndex = getChildIndexByWindowIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByWindowIndex);
        int firstPeriodIndexByChildIndex = getFirstPeriodIndexByChildIndex(childIndexByWindowIndex);
        getTimelineByChildIndex(childIndexByWindowIndex).getWindow(i - firstWindowIndexByChildIndex, window, z, j);
        window.firstPeriodIndex += firstPeriodIndexByChildIndex;
        window.lastPeriodIndex += firstPeriodIndexByChildIndex;
        return window;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i);
        int firstWindowIndexByChildIndex = getFirstWindowIndexByChildIndex(childIndexByPeriodIndex);
        getTimelineByChildIndex(childIndexByPeriodIndex).getPeriod(i - getFirstPeriodIndexByChildIndex(childIndexByPeriodIndex), period, z);
        period.windowIndex += firstWindowIndexByChildIndex;
        if (z) {
            period.uid = Pair.create(getChildUidByChildIndex(childIndexByPeriodIndex), period.uid);
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (obj instanceof Pair) {
            Pair pair = (Pair) obj;
            Object obj2 = pair.first;
            Object obj3 = pair.second;
            int childIndexByChildUid = getChildIndexByChildUid(obj2);
            if (childIndexByChildUid == -1 || (indexOfPeriod = getTimelineByChildIndex(childIndexByChildUid).getIndexOfPeriod(obj3)) == -1) {
                return -1;
            }
            return getFirstPeriodIndexByChildIndex(childIndexByChildUid) + indexOfPeriod;
        }
        return -1;
    }

    private int getNextChildIndex(int i, boolean z) {
        if (z) {
            return this.shuffleOrder.getNextIndex(i);
        }
        if (i < this.childCount - 1) {
            return i + 1;
        }
        return -1;
    }

    private int getPreviousChildIndex(int i, boolean z) {
        if (z) {
            return this.shuffleOrder.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }
}
