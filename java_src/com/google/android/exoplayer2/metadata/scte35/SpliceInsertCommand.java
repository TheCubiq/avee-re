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
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C3953a();

    /* renamed from: A */
    public final int f35812A;

    /* renamed from: B */
    public final int f35813B;

    /* renamed from: p */
    public final long f35814p;

    /* renamed from: q */
    public final boolean f35815q;

    /* renamed from: r */
    public final boolean f35816r;

    /* renamed from: s */
    public final boolean f35817s;

    /* renamed from: t */
    public final boolean f35818t;

    /* renamed from: u */
    public final long f35819u;

    /* renamed from: v */
    public final long f35820v;

    /* renamed from: w */
    public final List<C3954b> f35821w;

    /* renamed from: x */
    public final boolean f35822x;

    /* renamed from: y */
    public final long f35823y;

    /* renamed from: z */
    public final int f35824z;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$a */
    /* loaded from: classes.dex */
    public static class C3953a implements Parcelable.Creator<SpliceInsertCommand> {
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

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b */
    /* loaded from: classes.dex */
    public static final class C3954b {

        /* renamed from: a */
        public final int f35825a;

        /* renamed from: b */
        public final long f35826b;

        /* renamed from: c */
        public final long f35827c;

        public C3954b(int i, long j, long j2) {
            this.f35825a = i;
            this.f35826b = j;
            this.f35827c = j2;
        }

        public /* synthetic */ C3954b(int i, long j, long j2, C3953a c3953a) {
            this(i, j, j2);
        }

        /* renamed from: a */
        public static C3954b m1619a(Parcel parcel) {
            return new C3954b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m1618b(Parcel parcel) {
            parcel.writeInt(this.f35825a);
            parcel.writeLong(this.f35826b);
            parcel.writeLong(this.f35827c);
        }
    }

    public SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C3954b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f35814p = j;
        this.f35815q = z;
        this.f35816r = z2;
        this.f35817s = z3;
        this.f35818t = z4;
        this.f35819u = j2;
        this.f35820v = j3;
        this.f35821w = Collections.unmodifiableList(list);
        this.f35822x = z5;
        this.f35823y = j4;
        this.f35824z = i;
        this.f35812A = i2;
        this.f35813B = i3;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.f35814p = parcel.readLong();
        this.f35815q = parcel.readByte() == 1;
        this.f35816r = parcel.readByte() == 1;
        this.f35817s = parcel.readByte() == 1;
        this.f35818t = parcel.readByte() == 1;
        this.f35819u = parcel.readLong();
        this.f35820v = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C3954b.m1619a(parcel));
        }
        this.f35821w = Collections.unmodifiableList(arrayList);
        this.f35822x = parcel.readByte() == 1;
        this.f35823y = parcel.readLong();
        this.f35824z = parcel.readInt();
        this.f35812A = parcel.readInt();
        this.f35813B = parcel.readInt();
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C3953a c3953a) {
        this(parcel);
    }

    /* renamed from: a */
    public static SpliceInsertCommand m1622a(rv0 rv0Var, long j, ol1 ol1Var) {
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
        long m10894z = rv0Var.m10894z();
        boolean z6 = (rv0Var.m10896x() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z6) {
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
            int m10896x = rv0Var.m10896x();
            boolean z7 = (m10896x & 128) != 0;
            boolean z8 = (m10896x & 64) != 0;
            boolean z9 = (m10896x & 32) != 0;
            boolean z10 = (m10896x & 16) != 0;
            long m1601b = (!z8 || z10) ? -9223372036854775807L : TimeSignalCommand.m1601b(rv0Var, j);
            if (!z8) {
                int m10896x2 = rv0Var.m10896x();
                ArrayList arrayList = new ArrayList(m10896x2);
                for (int i4 = 0; i4 < m10896x2; i4++) {
                    int m10896x3 = rv0Var.m10896x();
                    long m1601b2 = !z10 ? TimeSignalCommand.m1601b(rv0Var, j) : -9223372036854775807L;
                    arrayList.add(new C3954b(m10896x3, m1601b2, ol1Var.m14187b(m1601b2), null));
                }
                emptyList = arrayList;
            }
            if (z9) {
                long m10896x4 = rv0Var.m10896x();
                boolean z11 = (128 & m10896x4) != 0;
                j4 = ((((m10896x4 & 1) << 32) | rv0Var.m10894z()) * 1000) / 90;
                z5 = z11;
            } else {
                z5 = false;
                j4 = -9223372036854775807L;
            }
            i = rv0Var.m10927D();
            z4 = z8;
            i2 = rv0Var.m10896x();
            i3 = rv0Var.m10896x();
            list = emptyList;
            long j5 = m1601b;
            z3 = z5;
            j3 = j4;
            z2 = z10;
            z = z7;
            j2 = j5;
        }
        return new SpliceInsertCommand(m10894z, z6, z, z4, z2, j2, ol1Var.m14187b(j2), list, z3, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f35814p);
        parcel.writeByte(this.f35815q ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35816r ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35817s ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f35818t ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f35819u);
        parcel.writeLong(this.f35820v);
        int size = this.f35821w.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f35821w.get(i2).m1618b(parcel);
        }
        parcel.writeByte(this.f35822x ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f35823y);
        parcel.writeInt(this.f35824z);
        parcel.writeInt(this.f35812A);
        parcel.writeInt(this.f35813B);
    }
}
