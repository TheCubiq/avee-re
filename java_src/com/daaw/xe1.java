package com.daaw;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
/* loaded from: classes.dex */
public class xe1 implements o10<xe1, pg1> {

    /* renamed from: a */
    public final int f32606a;

    /* renamed from: b */
    public final int f32607b;

    /* renamed from: c */
    public final int f32608c;

    /* renamed from: d */
    public final boolean f32609d;

    /* renamed from: e */
    public final C3534a f32610e;

    /* renamed from: f */
    public final C3535b[] f32611f;

    /* renamed from: g */
    public final long f32612g;

    /* renamed from: h */
    public final long f32613h;

    /* renamed from: com.daaw.xe1$a */
    /* loaded from: classes.dex */
    public static class C3534a {

        /* renamed from: a */
        public final UUID f32614a;

        /* renamed from: b */
        public final byte[] f32615b;

        public C3534a(UUID uuid, byte[] bArr) {
            this.f32614a = uuid;
            this.f32615b = bArr;
        }
    }

    /* renamed from: com.daaw.xe1$b */
    /* loaded from: classes.dex */
    public static class C3535b {

        /* renamed from: a */
        public final int f32616a;

        /* renamed from: b */
        public final String f32617b;

        /* renamed from: c */
        public final long f32618c;

        /* renamed from: d */
        public final String f32619d;

        /* renamed from: e */
        public final int f32620e;

        /* renamed from: f */
        public final int f32621f;

        /* renamed from: g */
        public final int f32622g;

        /* renamed from: h */
        public final int f32623h;

        /* renamed from: i */
        public final String f32624i;

        /* renamed from: j */
        public final Format[] f32625j;

        /* renamed from: k */
        public final int f32626k;

        /* renamed from: l */
        public final String f32627l;

        /* renamed from: m */
        public final String f32628m;

        /* renamed from: n */
        public final List<Long> f32629n;

        /* renamed from: o */
        public final long[] f32630o;

        /* renamed from: p */
        public final long f32631p;

        public C3535b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long j2) {
            this(str, str2, i, str3, j, str4, i2, i3, i4, i5, str5, formatArr, list, sq1.m10024U(list, 1000000L, j), sq1.m10025T(j2, 1000000L, j));
        }

        public C3535b(String str, String str2, int i, String str3, long j, String str4, int i2, int i3, int i4, int i5, String str5, Format[] formatArr, List<Long> list, long[] jArr, long j2) {
            this.f32627l = str;
            this.f32628m = str2;
            this.f32616a = i;
            this.f32617b = str3;
            this.f32618c = j;
            this.f32619d = str4;
            this.f32620e = i2;
            this.f32621f = i3;
            this.f32622g = i4;
            this.f32623h = i5;
            this.f32624i = str5;
            this.f32625j = formatArr;
            this.f32629n = list;
            this.f32630o = jArr;
            this.f32631p = j2;
            this.f32626k = list.size();
        }

        /* renamed from: a */
        public Uri m5187a(int i, int i2) {
            C2914s6.m10685f(this.f32625j != null);
            C2914s6.m10685f(this.f32629n != null);
            C2914s6.m10685f(i2 < this.f32629n.size());
            String num = Integer.toString(this.f32625j[i].f35717q);
            String l = this.f32629n.get(i2).toString();
            return iq1.m19491d(this.f32627l, this.f32628m.replace("{bitrate}", num).replace("{Bitrate}", num).replace("{start time}", l).replace("{start_time}", l));
        }

        /* renamed from: b */
        public C3535b m5186b(Format[] formatArr) {
            return new C3535b(this.f32627l, this.f32628m, this.f32616a, this.f32617b, this.f32618c, this.f32619d, this.f32620e, this.f32621f, this.f32622g, this.f32623h, this.f32624i, formatArr, this.f32629n, this.f32630o, this.f32631p);
        }

        /* renamed from: c */
        public long m5185c(int i) {
            if (i == this.f32626k - 1) {
                return this.f32631p;
            }
            long[] jArr = this.f32630o;
            return jArr[i + 1] - jArr[i];
        }

        /* renamed from: d */
        public int m5184d(long j) {
            return sq1.m10011e(this.f32630o, j, true, true);
        }

        /* renamed from: e */
        public long m5183e(int i) {
            return this.f32630o[i];
        }
    }

    public xe1(int i, int i2, long j, long j2, int i3, boolean z, C3534a c3534a, C3535b[] c3535bArr) {
        this.f32606a = i;
        this.f32607b = i2;
        this.f32612g = j;
        this.f32613h = j2;
        this.f32608c = i3;
        this.f32609d = z;
        this.f32610e = c3534a;
        this.f32611f = c3535bArr;
    }

    public xe1(int i, int i2, long j, long j2, long j3, int i3, boolean z, C3534a c3534a, C3535b[] c3535bArr) {
        this(i, i2, j2 == 0 ? -9223372036854775807L : sq1.m10025T(j2, 1000000L, j), j3 != 0 ? sq1.m10025T(j3, 1000000L, j) : -9223372036854775807L, i3, z, c3534a, c3535bArr);
    }

    @Override // com.daaw.o10
    /* renamed from: b */
    public final xe1 mo5189a(List<pg1> list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C3535b c3535b = null;
        int i = 0;
        while (i < arrayList.size()) {
            pg1 pg1Var = (pg1) arrayList.get(i);
            C3535b c3535b2 = this.f32611f[pg1Var.f22906p];
            if (c3535b2 != c3535b && c3535b != null) {
                arrayList2.add(c3535b.m5186b((Format[]) arrayList3.toArray(new Format[0])));
                arrayList3.clear();
            }
            arrayList3.add(c3535b2.f32625j[pg1Var.f22907q]);
            i++;
            c3535b = c3535b2;
        }
        if (c3535b != null) {
            arrayList2.add(c3535b.m5186b((Format[]) arrayList3.toArray(new Format[0])));
        }
        return new xe1(this.f32606a, this.f32607b, this.f32612g, this.f32613h, this.f32608c, this.f32609d, this.f32610e, (C3535b[]) arrayList2.toArray(new C3535b[0]));
    }
}
