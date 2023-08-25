package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.rv0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new a();
    public final List<c> p;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator<SpliceScheduleCommand> {
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

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;
        public final long b;

        public b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public /* synthetic */ b(int i, long j, a aVar) {
            this(i, j);
        }

        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        public final void d(Parcel parcel) {
            parcel.writeInt(this.a);
            parcel.writeLong(this.b);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        public final long a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final long e;
        public final List<b> f;
        public final boolean g;
        public final long h;
        public final int i;
        public final int j;
        public final int k;

        public c(long j, boolean z, boolean z2, boolean z3, List<b> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.a = j;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.f = Collections.unmodifiableList(list);
            this.e = j2;
            this.g = z4;
            this.h = j3;
            this.i = i;
            this.j = i2;
            this.k = i3;
        }

        public c(Parcel parcel) {
            this.a = parcel.readLong();
            this.b = parcel.readByte() == 1;
            this.c = parcel.readByte() == 1;
            this.d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(b.c(parcel));
            }
            this.f = Collections.unmodifiableList(arrayList);
            this.e = parcel.readLong();
            this.g = parcel.readByte() == 1;
            this.h = parcel.readLong();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
        }

        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        public static c e(rv0 rv0Var) {
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
            long z5 = rv0Var.z();
            boolean z6 = (rv0Var.x() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z6) {
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
                int x = rv0Var.x();
                boolean z7 = (x & 128) != 0;
                boolean z8 = (x & 64) != 0;
                boolean z9 = (x & 32) != 0;
                long z10 = z8 ? rv0Var.z() : -9223372036854775807L;
                if (!z8) {
                    int x2 = rv0Var.x();
                    ArrayList arrayList3 = new ArrayList(x2);
                    for (int i4 = 0; i4 < x2; i4++) {
                        arrayList3.add(new b(rv0Var.x(), rv0Var.z(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z9) {
                    long x3 = rv0Var.x();
                    boolean z11 = (128 & x3) != 0;
                    j3 = ((((x3 & 1) << 32) | rv0Var.z()) * 1000) / 90;
                    z4 = z11;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int D = rv0Var.D();
                int x4 = rv0Var.x();
                z3 = z8;
                i3 = rv0Var.x();
                j2 = j3;
                arrayList = arrayList2;
                long j4 = z10;
                i = D;
                i2 = x4;
                j = j4;
                boolean z12 = z7;
                z2 = z4;
                z = z12;
            }
            return new c(z5, z6, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        public final void f(Parcel parcel) {
            parcel.writeLong(this.a);
            parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
            int size = this.f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                this.f.get(i).d(parcel);
            }
            parcel.writeLong(this.e);
            parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
        }
    }

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(c.d(parcel));
        }
        this.p = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, a aVar) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<c> list) {
        this.p = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand a(rv0 rv0Var) {
        int x = rv0Var.x();
        ArrayList arrayList = new ArrayList(x);
        for (int i = 0; i < x; i++) {
            arrayList.add(c.e(rv0Var));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.p.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.p.get(i2).f(parcel);
        }
    }
}
