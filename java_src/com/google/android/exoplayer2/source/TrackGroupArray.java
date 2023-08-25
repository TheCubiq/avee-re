package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class TrackGroupArray implements Parcelable {

    /* renamed from: p */
    public final int f35848p;

    /* renamed from: q */
    public final TrackGroup[] f35849q;

    /* renamed from: r */
    public int f35850r;

    /* renamed from: s */
    public static final TrackGroupArray f35847s = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new C3961a();

    /* renamed from: com.google.android.exoplayer2.source.TrackGroupArray$a */
    /* loaded from: classes.dex */
    public static class C3961a implements Parcelable.Creator<TrackGroupArray> {
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
        this.f35848p = readInt;
        this.f35849q = new TrackGroup[readInt];
        for (int i = 0; i < this.f35848p; i++) {
            this.f35849q[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f35849q = trackGroupArr;
        this.f35848p = trackGroupArr.length;
    }

    /* renamed from: a */
    public TrackGroup m1594a(int i) {
        return this.f35849q[i];
    }

    /* renamed from: b */
    public int m1593b(TrackGroup trackGroup) {
        for (int i = 0; i < this.f35848p; i++) {
            if (this.f35849q[i] == trackGroup) {
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
        return this.f35848p == trackGroupArray.f35848p && Arrays.equals(this.f35849q, trackGroupArray.f35849q);
    }

    public int hashCode() {
        if (this.f35850r == 0) {
            this.f35850r = Arrays.hashCode(this.f35849q);
        }
        return this.f35850r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35848p);
        for (int i2 = 0; i2 < this.f35848p; i2++) {
            parcel.writeParcelable(this.f35849q[i2], 0);
        }
    }
}
