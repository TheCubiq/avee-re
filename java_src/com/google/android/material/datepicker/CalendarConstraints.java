package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.oq1;
import com.daaw.pt0;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();
    public final Month p;
    public final Month q;
    public final DateValidator r;
    public Month s;
    public final int t;
    public final int u;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        boolean k(long j);
    }

    /* loaded from: classes2.dex */
    public static class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public static final long e = oq1.a(Month.b(1900, 0).u);
        public static final long f = oq1.a(Month.b(2100, 11).u);
        public long a;
        public long b;
        public Long c;
        public DateValidator d;

        public b(CalendarConstraints calendarConstraints) {
            this.a = e;
            this.b = f;
            this.d = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.a = calendarConstraints.p.u;
            this.b = calendarConstraints.q.u;
            this.c = Long.valueOf(calendarConstraints.s.u);
            this.d = calendarConstraints.r;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
            Month c = Month.c(this.a);
            Month c2 = Month.c(this.b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.c;
            return new CalendarConstraints(c, c2, dateValidator, l == null ? null : Month.c(l.longValue()), null);
        }

        public b b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.p = month;
        this.q = month2;
        this.s = month3;
        this.r = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.u = month.u(month2) + 1;
        this.t = (month2.r - month.r) + 1;
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, a aVar) {
        this(month, month2, dateValidator, month3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarConstraints) {
            CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
            return this.p.equals(calendarConstraints.p) && this.q.equals(calendarConstraints.q) && pt0.a(this.s, calendarConstraints.s) && this.r.equals(calendarConstraints.r);
        }
        return false;
    }

    public Month h(Month month) {
        return month.compareTo(this.p) < 0 ? this.p : month.compareTo(this.q) > 0 ? this.q : month;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.p, this.q, this.s, this.r});
    }

    public DateValidator i() {
        return this.r;
    }

    public Month l() {
        return this.q;
    }

    public int q() {
        return this.u;
    }

    public Month s() {
        return this.s;
    }

    public Month t() {
        return this.p;
    }

    public int u() {
        return this.t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.p, 0);
        parcel.writeParcelable(this.q, 0);
        parcel.writeParcelable(this.s, 0);
        parcel.writeParcelable(this.r, 0);
    }
}
