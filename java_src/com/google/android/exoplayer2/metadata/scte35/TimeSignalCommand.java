package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ol1;
import com.daaw.rv0;
/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C3959a();

    /* renamed from: p */
    public final long f35842p;

    /* renamed from: q */
    public final long f35843q;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand$a */
    /* loaded from: classes.dex */
    public static class C3959a implements Parcelable.Creator<TimeSignalCommand> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    public TimeSignalCommand(long j, long j2) {
        this.f35842p = j;
        this.f35843q = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C3959a c3959a) {
        this(j, j2);
    }

    /* renamed from: a */
    public static TimeSignalCommand m1602a(rv0 rv0Var, long j, ol1 ol1Var) {
        long m1601b = m1601b(rv0Var, j);
        return new TimeSignalCommand(m1601b, ol1Var.m14187b(m1601b));
    }

    /* renamed from: b */
    public static long m1601b(rv0 rv0Var, long j) {
        long m10896x = rv0Var.m10896x();
        if ((128 & m10896x) != 0) {
            return 8589934591L & ((((m10896x & 1) << 32) | rv0Var.m10894z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35842p);
        parcel.writeLong(this.f35843q);
    }
}
