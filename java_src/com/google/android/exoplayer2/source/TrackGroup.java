package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.s6;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new a();
    public final int p;
    public final Format[] q;
    public int r;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<TrackGroup> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TrackGroup createFromParcel(Parcel parcel) {
            return new TrackGroup(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TrackGroup[] newArray(int i) {
            return new TrackGroup[i];
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.p = readInt;
        this.q = new Format[readInt];
        for (int i = 0; i < this.p; i++) {
            this.q[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        s6.f(formatArr.length > 0);
        this.q = formatArr;
        this.p = formatArr.length;
    }

    public Format a(int i) {
        return this.q[i];
    }

    public int b(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.q;
            if (i >= formatArr.length) {
                return -1;
            }
            if (format == formatArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        return this.p == trackGroup.p && Arrays.equals(this.q, trackGroup.q);
    }

    public int hashCode() {
        if (this.r == 0) {
            this.r = 527 + Arrays.hashCode(this.q);
        }
        return this.r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p);
        for (int i2 = 0; i2 < this.p; i2++) {
            parcel.writeParcelable(this.q[i2], 0);
        }
    }
}
