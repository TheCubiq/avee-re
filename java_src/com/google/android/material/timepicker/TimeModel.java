package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.vn0;
import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C4163a();

    /* renamed from: p */
    public final vn0 f37852p;

    /* renamed from: q */
    public final vn0 f37853q;

    /* renamed from: r */
    public final int f37854r;

    /* renamed from: s */
    public int f37855s;

    /* renamed from: t */
    public int f37856t;

    /* renamed from: u */
    public int f37857u;

    /* renamed from: v */
    public int f37858v;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    /* loaded from: classes2.dex */
    public static class C4163a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f37855s = i;
        this.f37856t = i2;
        this.f37857u = i3;
        this.f37854r = i4;
        this.f37858v = m143c(i);
        this.f37852p = new vn0(59);
        this.f37853q = new vn0(i4 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    /* renamed from: a */
    public static String m145a(Resources resources, CharSequence charSequence) {
        return m144b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m144b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }

    /* renamed from: c */
    public static int m143c(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimeModel) {
            TimeModel timeModel = (TimeModel) obj;
            return this.f37855s == timeModel.f37855s && this.f37856t == timeModel.f37856t && this.f37854r == timeModel.f37854r && this.f37857u == timeModel.f37857u;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37854r), Integer.valueOf(this.f37855s), Integer.valueOf(this.f37856t), Integer.valueOf(this.f37857u)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37855s);
        parcel.writeInt(this.f37856t);
        parcel.writeInt(this.f37857u);
        parcel.writeInt(this.f37854r);
    }
}
