package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2914s6;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator<TrackGroup> CREATOR = new C3960a();

    /* renamed from: p */
    public final int f35844p;

    /* renamed from: q */
    public final Format[] f35845q;

    /* renamed from: r */
    public int f35846r;

    /* renamed from: com.google.android.exoplayer2.source.TrackGroup$a */
    /* loaded from: classes.dex */
    public static class C3960a implements Parcelable.Creator<TrackGroup> {
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
        this.f35844p = readInt;
        this.f35845q = new Format[readInt];
        for (int i = 0; i < this.f35844p; i++) {
            this.f35845q[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        C2914s6.m10685f(formatArr.length > 0);
        this.f35845q = formatArr;
        this.f35844p = formatArr.length;
    }

    /* renamed from: a */
    public Format m1598a(int i) {
        return this.f35845q[i];
    }

    /* renamed from: b */
    public int m1597b(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f35845q;
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
        return this.f35844p == trackGroup.f35844p && Arrays.equals(this.f35845q, trackGroup.f35845q);
    }

    public int hashCode() {
        if (this.f35846r == 0) {
            this.f35846r = 527 + Arrays.hashCode(this.f35845q);
        }
        return this.f35846r;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35844p);
        for (int i2 = 0; i2 < this.f35844p; i2++) {
            parcel.writeParcelable(this.f35845q[i2], 0);
        }
    }
}
