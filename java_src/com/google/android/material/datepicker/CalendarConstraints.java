package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.oq1;
import com.daaw.pt0;
import java.util.Arrays;
/* loaded from: classes2.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C4054a();

    /* renamed from: p */
    public final Month f37420p;

    /* renamed from: q */
    public final Month f37421q;

    /* renamed from: r */
    public final DateValidator f37422r;

    /* renamed from: s */
    public Month f37423s;

    /* renamed from: t */
    public final int f37424t;

    /* renamed from: u */
    public final int f37425u;

    /* loaded from: classes2.dex */
    public interface DateValidator extends Parcelable {
        /* renamed from: k */
        boolean mo595k(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    /* loaded from: classes2.dex */
    public static class C4054a implements Parcelable.Creator<CalendarConstraints> {
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

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    /* loaded from: classes2.dex */
    public static final class C4055b {

        /* renamed from: e */
        public static final long f37426e = oq1.m14086a(Month.m587b(1900, 0).f37441u);

        /* renamed from: f */
        public static final long f37427f = oq1.m14086a(Month.m587b(2100, 11).f37441u);

        /* renamed from: a */
        public long f37428a;

        /* renamed from: b */
        public long f37429b;

        /* renamed from: c */
        public Long f37430c;

        /* renamed from: d */
        public DateValidator f37431d;

        public C4055b(CalendarConstraints calendarConstraints) {
            this.f37428a = f37426e;
            this.f37429b = f37427f;
            this.f37431d = DateValidatorPointForward.m596a(Long.MIN_VALUE);
            this.f37428a = calendarConstraints.f37420p.f37441u;
            this.f37429b = calendarConstraints.f37421q.f37441u;
            this.f37430c = Long.valueOf(calendarConstraints.f37423s.f37441u);
            this.f37431d = calendarConstraints.f37422r;
        }

        /* renamed from: a */
        public CalendarConstraints m606a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f37431d);
            Month m586c = Month.m586c(this.f37428a);
            Month m586c2 = Month.m586c(this.f37429b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.f37430c;
            return new CalendarConstraints(m586c, m586c2, dateValidator, l == null ? null : Month.m586c(l.longValue()), null);
        }

        /* renamed from: b */
        public C4055b m605b(long j) {
            this.f37430c = Long.valueOf(j);
            return this;
        }
    }

    public CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f37420p = month;
        this.f37421q = month2;
        this.f37423s = month3;
        this.f37422r = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.f37425u = month.m578u(month2) + 1;
        this.f37424t = (month2.f37438r - month.f37438r) + 1;
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C4054a c4054a) {
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
            return this.f37420p.equals(calendarConstraints.f37420p) && this.f37421q.equals(calendarConstraints.f37421q) && pt0.m13160a(this.f37423s, calendarConstraints.f37423s) && this.f37422r.equals(calendarConstraints.f37422r);
        }
        return false;
    }

    /* renamed from: h */
    public Month m615h(Month month) {
        return month.compareTo(this.f37420p) < 0 ? this.f37420p : month.compareTo(this.f37421q) > 0 ? this.f37421q : month;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f37420p, this.f37421q, this.f37423s, this.f37422r});
    }

    /* renamed from: i */
    public DateValidator m614i() {
        return this.f37422r;
    }

    /* renamed from: l */
    public Month m613l() {
        return this.f37421q;
    }

    /* renamed from: q */
    public int m612q() {
        return this.f37425u;
    }

    /* renamed from: s */
    public Month m611s() {
        return this.f37423s;
    }

    /* renamed from: t */
    public Month m610t() {
        return this.f37420p;
    }

    /* renamed from: u */
    public int m609u() {
        return this.f37424t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f37420p, 0);
        parcel.writeParcelable(this.f37421q, 0);
        parcel.writeParcelable(this.f37423s, 0);
        parcel.writeParcelable(this.f37422r, 0);
    }
}
