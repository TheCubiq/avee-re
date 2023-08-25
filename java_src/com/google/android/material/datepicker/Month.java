package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3106tp;
import com.daaw.oq1;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C4058a();

    /* renamed from: p */
    public final Calendar f37436p;

    /* renamed from: q */
    public final int f37437q;

    /* renamed from: r */
    public final int f37438r;

    /* renamed from: s */
    public final int f37439s;

    /* renamed from: t */
    public final int f37440t;

    /* renamed from: u */
    public final long f37441u;

    /* renamed from: v */
    public String f37442v;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    /* loaded from: classes2.dex */
    public static class C4058a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m587b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m14083d = oq1.m14083d(calendar);
        this.f37436p = m14083d;
        this.f37437q = m14083d.get(2);
        this.f37438r = m14083d.get(1);
        this.f37439s = m14083d.getMaximum(7);
        this.f37440t = m14083d.getActualMaximum(5);
        this.f37441u = m14083d.getTimeInMillis();
    }

    /* renamed from: b */
    public static Month m587b(int i, int i2) {
        Calendar m14076k = oq1.m14076k();
        m14076k.set(1, i);
        m14076k.set(2, i2);
        return new Month(m14076k);
    }

    /* renamed from: c */
    public static Month m586c(long j) {
        Calendar m14076k = oq1.m14076k();
        m14076k.setTimeInMillis(j);
        return new Month(m14076k);
    }

    /* renamed from: g */
    public static Month m585g() {
        return new Month(oq1.m14078i());
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(Month month) {
        return this.f37436p.compareTo(month.f37436p);
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
            return this.f37437q == month.f37437q && this.f37438r == month.f37438r;
        }
        return false;
    }

    /* renamed from: h */
    public int m584h() {
        int firstDayOfWeek = this.f37436p.get(7) - this.f37436p.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f37439s : firstDayOfWeek;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f37437q), Integer.valueOf(this.f37438r)});
    }

    /* renamed from: i */
    public long m583i(int i) {
        Calendar m14083d = oq1.m14083d(this.f37436p);
        m14083d.set(5, i);
        return m14083d.getTimeInMillis();
    }

    /* renamed from: l */
    public int m582l(long j) {
        Calendar m14083d = oq1.m14083d(this.f37436p);
        m14083d.setTimeInMillis(j);
        return m14083d.get(5);
    }

    /* renamed from: q */
    public String m581q(Context context) {
        if (this.f37442v == null) {
            this.f37442v = C3106tp.m8892c(context, this.f37436p.getTimeInMillis());
        }
        return this.f37442v;
    }

    /* renamed from: s */
    public long m580s() {
        return this.f37436p.getTimeInMillis();
    }

    /* renamed from: t */
    public Month m579t(int i) {
        Calendar m14083d = oq1.m14083d(this.f37436p);
        m14083d.add(2, i);
        return new Month(m14083d);
    }

    /* renamed from: u */
    public int m578u(Month month) {
        if (this.f37436p instanceof GregorianCalendar) {
            return ((month.f37438r - this.f37438r) * 12) + (month.f37437q - this.f37437q);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f37438r);
        parcel.writeInt(this.f37437q);
    }
}
