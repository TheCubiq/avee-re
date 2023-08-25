package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C3956a();

    /* renamed from: p */
    public final List<C3958c> f35828p;

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$a */
    /* loaded from: classes.dex */
    public static class C3956a implements Parcelable.Creator<SpliceScheduleCommand> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b */
    /* loaded from: classes.dex */
    public static final class C3957b {

        /* renamed from: a */
        public final int f35829a;

        /* renamed from: b */
        public final long f35830b;

        public C3957b(int i, long j) {
            this.f35829a = i;
            this.f35830b = j;
        }

        public /* synthetic */ C3957b(int i, long j, C3956a c3956a) {
            this(i, j);
        }

        /* renamed from: c */
        public static C3957b m1610c(Parcel parcel) {
            return new C3957b(parcel.readInt(), parcel.readLong());
        }

        /* renamed from: d */
        public final void m1609d(Parcel parcel) {
            parcel.writeInt(this.f35829a);
            parcel.writeLong(this.f35830b);
        }
    }

    /* renamed from: com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c */
    /* loaded from: classes.dex */
    public static final class C3958c {

        /* renamed from: a */
        public final long f35831a;

        /* renamed from: b */
        public final boolean f35832b;

        /* renamed from: c */
        public final boolean f35833c;

        /* renamed from: d */
        public final boolean f35834d;

        /* renamed from: e */
        public final long f35835e;

        /* renamed from: f */
        public final List<C3957b> f35836f;

        /* renamed from: g */
        public final boolean f35837g;

        /* renamed from: h */
        public final long f35838h;

        /* renamed from: i */
        public final int f35839i;

        /* renamed from: j */
        public final int f35840j;

        /* renamed from: k */
        public final int f35841k;

        public C3958c(long j, boolean z, boolean z2, boolean z3, List<C3957b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f35831a = j;
            this.f35832b = z;
            this.f35833c = z2;
            this.f35834d = z3;
            this.f35836f = Collections.unmodifiableList(list);
            this.f35835e = j2;
            this.f35837g = z4;
            this.f35838h = j3;
            this.f35839i = i;
            this.f35840j = i2;
            this.f35841k = i3;
        }

        public C3958c(Parcel parcel) {
            this.f35831a = parcel.readLong();
            this.f35832b = parcel.readByte() == 1;
            this.f35833c = parcel.readByte() == 1;
            this.f35834d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C3957b.m1610c(parcel));
            }
            this.f35836f = Collections.unmodifiableList(arrayList);
            this.f35835e = parcel.readLong();
            this.f35837g = parcel.readByte() == 1;
            this.f35838h = parcel.readLong();
            this.f35839i = parcel.readInt();
            this.f35840j = parcel.readInt();
            this.f35841k = parcel.readInt();
        }

        /* renamed from: d */
        public static C3958c m1605d(Parcel parcel) {
            return new C3958c(parcel);
        }

        /* renamed from: e */
        public static C3958c m1604e(rv0 rv0Var) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            boolean z4;
            long j3;
            long m10894z = rv0Var.m10894z();
            boolean z5 = (rv0Var.m10896x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                int m10896x = rv0Var.m10896x();
                boolean z6 = (m10896x & 128) != 0;
                boolean z7 = (m10896x & 64) != 0;
                boolean z8 = (m10896x & 32) != 0;
                long m10894z2 = z7 ? rv0Var.m10894z() : -9223372036854775807L;
                if (!z7) {
                    int m10896x2 = rv0Var.m10896x();
                    ArrayList arrayList3 = new ArrayList(m10896x2);
                    for (int i4 = 0; i4 < m10896x2; i4++) {
                        arrayList3.add(new C3957b(rv0Var.m10896x(), rv0Var.m10894z(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long m10896x3 = rv0Var.m10896x();
                    boolean z9 = (128 & m10896x3) != 0;
                    j3 = ((((m10896x3 & 1) << 32) | rv0Var.m10894z()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int m10927D = rv0Var.m10927D();
                int m10896x4 = rv0Var.m10896x();
                z3 = z7;
                i3 = rv0Var.m10896x();
                j2 = j3;
                arrayList = arrayList2;
                long j4 = m10894z2;
                i = m10927D;
                i2 = m10896x4;
                j = j4;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new C3958c(m10894z, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        /* renamed from: f */
        public final void m1603f(Parcel parcel) {
            parcel.writeLong(this.f35831a);
            parcel.writeByte(this.f35832b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f35833c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f35834d ? (byte) 1 : (byte) 0);
            int size = this.f35836f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f35836f.get(i).m1609d(parcel);
            }
            parcel.writeLong(this.f35835e);
            parcel.writeByte(this.f35837g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f35838h);
            parcel.writeInt(this.f35839i);
            parcel.writeInt(this.f35840j);
            parcel.writeInt(this.f35841k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C3958c.m1605d(parcel));
        }
        this.f35828p = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C3956a c3956a) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C3958c> list) {
        this.f35828p = Collections.unmodifiableList(list);
    }

    /* renamed from: a */
    public static SpliceScheduleCommand m1615a(rv0 rv0Var) {
        int m10896x = rv0Var.m10896x();
        ArrayList arrayList = new ArrayList(m10896x);
        for (int i = 0; i < m10896x; i++) {
            arrayList.add(C3958c.m1604e(rv0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f35828p.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.f35828p.get(i2).m1603f(parcel);
        }
    }
}
