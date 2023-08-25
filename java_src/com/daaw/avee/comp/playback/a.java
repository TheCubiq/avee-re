package com.daaw.avee.comp.playback;

import com.daaw.ke0;
import com.daaw.q6;
/* loaded from: classes.dex */
public class a {
    public int b;
    public short d;
    public short e;
    public int f;
    public int h;
    public int i;
    public int j;
    public int l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public long s;
    public boolean k = false;
    public boolean t = true;
    public boolean a = false;
    public short[] c = new short[2];
    public float g = 0.0f;

    /* renamed from: com.daaw.avee.comp.playback.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0041a implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;

        public C0041a(int i, short[] sArr) {
            this.a = i;
            this.b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.b[i];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;
        public final /* synthetic */ int c;

        public b(int i, short[] sArr, int i2) {
            this.a = i;
            this.b = sArr;
            this.c = i2;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            short[] sArr = this.b;
            int i2 = this.c;
            return (short) ((sArr[i * i2] + sArr[(i * i2) + 1]) / 2);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class c implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;

        public c(int i, short[] sArr) {
            this.a = i;
            this.b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.b[i / 2];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a * 2;
        }
    }

    /* loaded from: classes.dex */
    public class d implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;

        public d(int i, short[] sArr) {
            this.a = i;
            this.b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.b[i];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a * 2;
        }
    }

    /* loaded from: classes.dex */
    public class e implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;

        public e(int i, short[] sArr) {
            this.a = i;
            this.b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            short[] sArr = this.b;
            int i2 = i * 2;
            return (short) ((sArr[i2] + sArr[i2 + 1]) / 2);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public class f implements ke0 {
        public final /* synthetic */ int a;
        public final /* synthetic */ short[] b;
        public final /* synthetic */ int c;

        public f(int i, short[] sArr, int i2) {
            this.a = i;
            this.b = sArr;
            this.c = i2;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            int i2 = i * 2;
            short[] sArr = this.b;
            int i3 = this.c;
            return (short) ((((sArr[i2 * i3] + sArr[(i2 * i3) + 1]) + sArr[(i2 * i3) + 2]) + sArr[(i2 * i3) + 3]) / 4);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.a;
        }
    }

    /* loaded from: classes.dex */
    public static class g extends h {
        public boolean e;
        public boolean f;
        public long g;
        public boolean h = false;
    }

    /* loaded from: classes.dex */
    public static class h {
        public int a;
        public int b;
        public long c;
        public int d;
    }

    public a() {
        d(44100, 1, 2, 0);
    }

    public static ke0 h(int i, int i2, int i3, short[] sArr) {
        return i == 1 ? i(i2, i3, sArr) : m(i2, i3, sArr);
    }

    public static ke0 i(int i, int i2, short[] sArr) {
        return i2 == 1 ? new C0041a(Math.min(i, sArr.length), sArr) : new b(i, sArr, i2);
    }

    public static ke0 j(int i, int i2, short[] sArr) {
        return i2 == 1 ? new e(Math.max(0, Math.min(i, sArr.length)) / 2, sArr) : new f(Math.max(0, i) / 2, sArr, i2);
    }

    public static ke0 m(int i, int i2, short[] sArr) {
        return i2 == 1 ? new c(i, sArr) : new d(i, sArr);
    }

    public boolean a() {
        return this.t;
    }

    public int b() {
        return this.h;
    }

    public int c() {
        return this.j;
    }

    public void d(int i, int i2, int i3, int i4) {
        e(i, i2, i3, i4, true);
    }

    public void e(int i, int i2, int i3, int i4, boolean z) {
        q6.i(i2 > 0);
        int max = Math.max(1, i2);
        this.t = z;
        this.r = false;
        this.f = i;
        this.b = max;
        this.i = i3;
        this.j = i4;
        int max2 = Math.max(i3, i4);
        this.h = max2;
        int i5 = max2 * max;
        if (this.c.length != i5) {
            this.c = new short[i5];
        }
        this.d = Short.MAX_VALUE;
        this.e = (short) 0;
    }

    public void f(long j) {
        this.r = true;
        this.s = j;
    }

    public ke0 g(int i, int i2) {
        return h(i, i2, this.b, this.c);
    }

    public ke0 k() {
        return i(this.i, this.b, this.c);
    }

    public ke0 l() {
        return j(this.i, this.b, this.c);
    }
}
