package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.ol1;
import com.daaw.rv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new a();
    public final int A;
    public final int B;
    public final long p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final long u;
    public final long v;
    public final List<b> w;
    public final boolean x;
    public final long y;
    public final int z;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<SpliceInsertCommand> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;
        public final long c;

        public b(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }

        public /* synthetic */ b(int i, long j, long j2, a aVar) {
            this(i, j, j2);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.p = j;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = z4;
        this.u = j2;
        this.v = j3;
        this.w = Collections.unmodifiableList(list);
        this.x = z5;
        this.y = j4;
        this.z = i;
        this.A = i2;
        this.B = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.p = parcel.readLong();
        this.q = parcel.readByte() == 1;
        this.r = parcel.readByte() == 1;
        this.s = parcel.readByte() == 1;
        this.t = parcel.readByte() == 1;
        this.u = parcel.readLong();
        this.v = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.w = Collections.unmodifiableList(arrayList);
        this.x = parcel.readByte() == 1;
        this.y = parcel.readLong();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public static SpliceInsertCommand a(rv0 rv0Var, long j, ol1 ol1Var) {
        List list;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        long j4;
        long z6 = rv0Var.z();
        boolean z7 = (rv0Var.x() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z7) {
            list = emptyList;
            z = false;
            z2 = false;
            j2 = -9223372036854775807L;
            z3 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z4 = false;
        } else {
            int x = rv0Var.x();
            boolean z8 = (x & 128) != 0;
            boolean z9 = (x & 64) != 0;
            boolean z10 = (x & 32) != 0;
            boolean z11 = (x & 16) != 0;
            long b2 = (!z9 || z11) ? -9223372036854775807L : TimeSignalCommand.b(rv0Var, j);
            if (!z9) {
                int x2 = rv0Var.x();
                ArrayList arrayList = new ArrayList(x2);
                for (int i4 = 0; i4 < x2; i4++) {
                    int x3 = rv0Var.x();
                    long b3 = !z11 ? TimeSignalCommand.b(rv0Var, j) : -9223372036854775807L;
                    arrayList.add(new b(x3, b3, ol1Var.b(b3), null));
                }
                emptyList = arrayList;
            }
            if (z10) {
                long x4 = rv0Var.x();
                boolean z12 = (128 & x4) != 0;
                j4 = ((((x4 & 1) << 32) | rv0Var.z()) * 1000) / 90;
                z5 = z12;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i = rv0Var.D();
            z4 = z9;
            i2 = rv0Var.x();
            i3 = rv0Var.x();
            list = emptyList;
            long j5 = b2;
            z3 = z5;
            j3 = j4;
            z2 = z11;
            z = z8;
            j2 = j5;
        }
        return new SpliceInsertCommand(z6, z7, z, z4, z2, j2, ol1Var.b(j2), list, z3, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.u);
        parcel.writeLong(this.v);
        int size = this.w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.w.get(i2).b(parcel);
        }
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.B);
    }
}
