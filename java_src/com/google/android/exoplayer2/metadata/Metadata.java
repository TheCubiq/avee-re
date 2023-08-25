package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new a();
    public final Entry[] p;

    /* loaded from: classes.dex */
    public interface Entry extends Parcelable {
    }

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<Metadata> {
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
        this.p = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.p;
            if (i >= entryArr.length) {
                return;
            }
            entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
            i++;
        }
    }

    public Metadata(List<? extends Entry> list) {
        if (list == null) {
            this.p = new Entry[0];
            return;
        }
        Entry[] entryArr = new Entry[list.size()];
        this.p = entryArr;
        list.toArray(entryArr);
    }

    public Metadata(Entry... entryArr) {
        this.p = entryArr == null ? new Entry[0] : entryArr;
    }

    public Entry a(int i) {
        return this.p[i];
    }

    public int b() {
        return this.p.length;
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
        return Arrays.equals(this.p, ((Metadata) obj).p);
    }

    public int hashCode() {
        return Arrays.hashCode(this.p);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.p.length);
        for (Entry entry : this.p) {
            parcel.writeParcelable(entry, 0);
        }
    }
}
