package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ol1;
import com.daaw.rv0;
/* loaded from: classes.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new a();
    public final long p;
    public final long q;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<TimeSignalCommand> {
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
        this.p = j;
        this.q = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, a aVar) {
        this(j, j2);
    }

    public static TimeSignalCommand a(rv0 rv0Var, long j, ol1 ol1Var) {
        long b = b(rv0Var, j);
        return new TimeSignalCommand(b, ol1Var.b(b));
    }

    public static long b(rv0 rv0Var, long j) {
        long x = rv0Var.x();
        if ((128 & x) != 0) {
            return 8589934591L & ((((x & 1) << 32) | rv0Var.z()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
    }
}
