package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {
    public final int p;
    public final TrackGroup[] q;
    public int r;
    public static final TrackGroupArray s = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new a();

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<TrackGroupArray> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TrackGroupArray[] newArray(int i) {
            return new TrackGroupArray[i];
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.p = readInt;
        this.q = new TrackGroup[readInt];
        for (int i = 0; i < this.p; i++) {
            this.q[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.q = trackGroupArr;
        this.p = trackGroupArr.length;
    }

    public TrackGroup a(int i) {
        return this.q[i];
    }

    public int b(TrackGroup trackGroup) {
        for (int i = 0; i < this.p; i++) {
            if (this.q[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        return this.p == trackGroupArray.p && Arrays.equals(this.q, trackGroupArray.q);
    }

    public int hashCode() {
        if (this.r == 0) {
            this.r = Arrays.hashCode(this.q);
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
