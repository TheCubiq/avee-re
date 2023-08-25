package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new C3941a();

    /* renamed from: p */
    public final Entry[] f35771p;

    /* loaded from: classes.dex */
    public interface Entry extends Parcelable {
    }

    /* renamed from: com.google.android.exoplayer2.metadata.Metadata$a */
    /* loaded from: classes.dex */
    public static class C3941a implements Parcelable.Creator<Metadata> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Metadata[] newArray(int i) {
            return new Metadata[0];
        }
    }

    public Metadata(Parcel parcel) {
        this.f35771p = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.f35771p;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list == null) {
            this.f35771p = new Entry[0];
            return;
        }
        Entry[] entryArr = new Entry[list.size()];
        this.f35771p = entryArr;
        list.toArray(entryArr);
    }

    public Metadata(Entry... entryArr) {
        this.f35771p = entryArr == null ? new Entry[0] : entryArr;
    }

    /* renamed from: a */
    public Entry m1649a(int i) {
        return this.f35771p[i];
    }

    /* renamed from: b */
    public int m1648b() {
        return this.f35771p.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Metadata.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f35771p, ((Metadata) obj).f35771p);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f35771p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f35771p.length);
        for (Entry entry : this.f35771p) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
