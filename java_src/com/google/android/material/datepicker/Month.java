package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.oq1;
import com.daaw.tp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    public final Calendar p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final long u;
    public String v;

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = oq1.d(calendar);
        this.p = d;
        this.q = d.get(2);
        this.r = d.get(1);
        this.s = d.getMaximum(7);
        this.t = d.getActualMaximum(5);
        this.u = d.getTimeInMillis();
    }

    public static Month b(int i, int i2) {
        Calendar k = oq1.k();
        k.set(1, i);
        k.set(2, i2);
        return new Month(k);
    }

    public static Month c(long j) {
        Calendar k = oq1.k();
        k.setTimeInMillis(j);
        return new Month(k);
    }

    public static Month g() {
        return new Month(oq1.i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Month month) {
        return this.p.compareTo(month.p);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Month) {
            Month month = (Month) obj;
            return this.q == month.q && this.r == month.r;
        }
        return false;
    }

    public int h() {
        int firstDayOfWeek = this.p.get(7) - this.p.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.s : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.q), Integer.valueOf(this.r)});
    }

    public long i(int i) {
        Calendar d = oq1.d(this.p);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    public int l(long j) {
        Calendar d = oq1.d(this.p);
        d.setTimeInMillis(j);
        return d.get(5);
    }

    public String q(Context context) {
        if (this.v == null) {
            this.v = tp.c(context, this.p.getTimeInMillis());
        }
        return this.v;
    }

    public long s() {
        return this.p.getTimeInMillis();
    }

    public Month t(int i) {
        Calendar d = oq1.d(this.p);
        d.add(2, i);
        return new Month(d);
    }

    public int u(Month month) {
        if (this.p instanceof GregorianCalendar) {
            return ((month.r - this.r) * 12) + (month.q - this.q);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.r);
        parcel.writeInt(this.q);
    }
}
