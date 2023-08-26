package com.google.android.exoplayer2.source.dash.manifest;
/* loaded from: classes.dex */
public final class RepresentationKey implements Comparable<RepresentationKey> {
    public final int adaptationSetIndex;
    public final int periodIndex;
    public final int representationIndex;

    public RepresentationKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.adaptationSetIndex = i2;
        this.representationIndex = i3;
    }

    public String toString() {
        return this.periodIndex + "." + this.adaptationSetIndex + "." + this.representationIndex;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepresentationKey representationKey = (RepresentationKey) obj;
        return this.periodIndex == representationKey.periodIndex && this.adaptationSetIndex == representationKey.adaptationSetIndex && this.representationIndex == representationKey.representationIndex;
    }

    public int hashCode() {
        return (((this.periodIndex * 31) + this.adaptationSetIndex) * 31) + this.representationIndex;
    }

    @Override // java.lang.Comparable
    public int compareTo(RepresentationKey representationKey) {
        int i = this.periodIndex - representationKey.periodIndex;
        if (i == 0) {
            int i2 = this.adaptationSetIndex - representationKey.adaptationSetIndex;
            return i2 == 0 ? this.representationIndex - representationKey.representationIndex : i2;
        }
        return i;
    }
}
