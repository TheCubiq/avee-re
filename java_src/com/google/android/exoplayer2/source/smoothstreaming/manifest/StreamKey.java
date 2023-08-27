package com.google.android.exoplayer2.source.smoothstreaming.manifest;
/* loaded from: classes.dex */
public final class StreamKey implements Comparable<StreamKey> {
    public final int streamElementIndex;
    public final int trackIndex;

    public StreamKey(int i, int i2) {
        this.streamElementIndex = i;
        this.trackIndex = i2;
    }

    public String toString() {
        return this.streamElementIndex + "." + this.trackIndex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.streamElementIndex == streamKey.streamElementIndex && this.trackIndex == streamKey.trackIndex;
    }

    public int hashCode() {
        return (this.streamElementIndex * 31) + this.trackIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(StreamKey streamKey) {
        int i = this.streamElementIndex - streamKey.streamElementIndex;
        return i == 0 ? this.trackIndex - streamKey.trackIndex : i;
    }
}
