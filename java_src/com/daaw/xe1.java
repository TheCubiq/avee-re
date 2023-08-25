package com.daaw;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public class xe1 implements o10<xe1, pg1> {
    public final int a;
    public final int b;
    public final int c;
    public final boolean d;
    public final a e;
    public final b[] f;
    public final long g;
    public final long h;

    /* loaded from: classes.dex */
    public static class a {
        public final UUID a;
        public final byte[] b;

        public a(UUID uuid, byte[] bArr) {
            this.a = uuid;
            this.b = bArr;
        }
    }

    /* loaded from: classes.dex */
    public static class b {
        public final int a;
        public final String b;
        public final long c;
        public final String d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final String i;
        public final Format[] j;
        public final int k;
        public final String l;
        public final String m;
        public final List<Long> n;
        public final long[] o;
        public final long p;

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, sq1.U(list, 1000000L, j), sq1.T(j2, 1000000L, j));
        }

        public b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.l = str;
            this.m = str2;
            this.a = i;
            this.b = str3;
            this.c = j;
            this.d = str4;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            this.i = str5;
            this.j = formatArr;
            this.n = list;
            this.o = jArr;
            this.p = j2;
            this.k = list.size();
        }

        public Uri a(int i, int i2) {
            s6.f(this.j != null);
            s6.f(this.n != null);
            s6.f(i2 < this.n.size());
            String num = Integer.toString(this.j[i].q);
            String l = this.n.get(i2).toString();
            return iq1.d(this.l, this.m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        public b b(Format[] formatArr) {
            return new b(this.l, this.m, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, formatArr, this.n, this.o, this.p);
        }

        public long c(int i) {
            if (i == this.k - 1) {
                return this.p;
            }
            long[] jArr = this.o;
            return jArr[i + 1] - jArr[i];
        }

        public int d(long j) {
            return sq1.e(this.o, j, true, true);
        }

        public long e(int i) {
            return this.o[i];
        }
    }

    public xe1(int i, int i2, long j, long j2, int i3, boolean z, a aVar, b[] bVarArr) {
        this.a = i;
        this.b = i2;
        this.g = j;
        this.h = j2;
        this.c = i3;
        this.d = z;
        this.e = aVar;
        this.f = bVarArr;
    }

    public xe1(int i, int i2, long j, long j2, long j3, int i3, boolean z, a aVar, b[] bVarArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : sq1.T(j2, 1000000L, j), j3 != 0 ? sq1.T(j3, 1000000L, j) : -9223372036854775807L, i3, z, aVar, bVarArr);
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public final xe1 a(List<pg1> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b bVar = null;
        int i = 0;
        while (i < arrayList.size()) {
            pg1 pg1Var = (pg1) arrayList.get(i);
            b bVar2 = this.f[pg1Var.p];
            if (bVar2 != bVar && bVar != null) {
                arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(bVar2.j[pg1Var.q]);
            i++;
            bVar = bVar2;
        }
        if (bVar != null) {
            arrayList2.add(bVar.b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new xe1(this.a, this.b, this.g, this.h, this.c, this.d, this.e, (b[]) arrayList2.toArray(new b[0]));
    }
}
