package com.daaw.avee.comp.playback;

import com.daaw.C2691q6;
import com.daaw.ke0;
/* renamed from: com.daaw.avee.comp.playback.a */
/* loaded from: classes.dex */
public class C0729a {

    /* renamed from: b */
    public int f3943b;

    /* renamed from: d */
    public short f3945d;

    /* renamed from: e */
    public short f3946e;

    /* renamed from: f */
    public int f3947f;

    /* renamed from: h */
    public int f3949h;

    /* renamed from: i */
    public int f3950i;

    /* renamed from: j */
    public int f3951j;

    /* renamed from: l */
    public int f3953l;

    /* renamed from: m */
    public long f3954m;

    /* renamed from: n */
    public long f3955n;

    /* renamed from: o */
    public long f3956o;

    /* renamed from: p */
    public long f3957p;

    /* renamed from: q */
    public long f3958q;

    /* renamed from: r */
    public boolean f3959r;

    /* renamed from: s */
    public long f3960s;

    /* renamed from: k */
    public boolean f3952k = false;

    /* renamed from: t */
    public boolean f3961t = true;

    /* renamed from: a */
    public boolean f3942a = false;

    /* renamed from: c */
    public short[] f3944c = new short[2];

    /* renamed from: g */
    public float f3948g = 0.0f;

    /* renamed from: com.daaw.avee.comp.playback.a$a */
    /* loaded from: classes.dex */
    public class C0730a implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3962a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3963b;

        public C0730a(int i, short[] sArr) {
            this.f3962a = i;
            this.f3963b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.f3963b[i];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3962a;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$b */
    /* loaded from: classes.dex */
    public class C0731b implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3964a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3965b;

        /* renamed from: c */
        public final /* synthetic */ int f3966c;

        public C0731b(int i, short[] sArr, int i2) {
            this.f3964a = i;
            this.f3965b = sArr;
            this.f3966c = i2;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            short[] sArr = this.f3965b;
            int i2 = this.f3966c;
            return (short) ((sArr[i * i2] + sArr[(i * i2) + 1]) / 2);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3964a;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$c */
    /* loaded from: classes.dex */
    public class C0732c implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3967a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3968b;

        public C0732c(int i, short[] sArr) {
            this.f3967a = i;
            this.f3968b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.f3968b[i / 2];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3967a * 2;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$d */
    /* loaded from: classes.dex */
    public class C0733d implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3969a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3970b;

        public C0733d(int i, short[] sArr) {
            this.f3969a = i;
            this.f3970b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            return this.f3970b[i];
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3969a * 2;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$e */
    /* loaded from: classes.dex */
    public class C0734e implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3971a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3972b;

        public C0734e(int i, short[] sArr) {
            this.f3971a = i;
            this.f3972b = sArr;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            short[] sArr = this.f3972b;
            int i2 = i * 2;
            return (short) ((sArr[i2] + sArr[i2 + 1]) / 2);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3971a;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$f */
    /* loaded from: classes.dex */
    public class C0735f implements ke0 {

        /* renamed from: a */
        public final /* synthetic */ int f3973a;

        /* renamed from: b */
        public final /* synthetic */ short[] f3974b;

        /* renamed from: c */
        public final /* synthetic */ int f3975c;

        public C0735f(int i, short[] sArr, int i2) {
            this.f3973a = i;
            this.f3974b = sArr;
            this.f3975c = i2;
        }

        @Override // com.daaw.ke0
        public short get(int i) {
            int i2 = i * 2;
            short[] sArr = this.f3974b;
            int i3 = this.f3975c;
            return (short) ((((sArr[i2 * i3] + sArr[(i2 * i3) + 1]) + sArr[(i2 * i3) + 2]) + sArr[(i2 * i3) + 3]) / 4);
        }

        @Override // com.daaw.ke0
        public int size() {
            return this.f3973a;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.a$g */
    /* loaded from: classes.dex */
    public static class C0736g extends C0737h {

        /* renamed from: e */
        public boolean f3976e;

        /* renamed from: f */
        public boolean f3977f;

        /* renamed from: g */
        public long f3978g;

        /* renamed from: h */
        public boolean f3979h = false;
    }

    /* renamed from: com.daaw.avee.comp.playback.a$h */
    /* loaded from: classes.dex */
    public static class C0737h {

        /* renamed from: a */
        public int f3980a;

        /* renamed from: b */
        public int f3981b;

        /* renamed from: c */
        public long f3982c;

        /* renamed from: d */
        public int f3983d;
    }

    public C0729a() {
        m26739d(44100, 1, 2, 0);
    }

    /* renamed from: h */
    public static ke0 m26735h(int i, int i2, int i3, short[] sArr) {
        return i == 1 ? m26734i(i2, i3, sArr) : m26730m(i2, i3, sArr);
    }

    /* renamed from: i */
    public static ke0 m26734i(int i, int i2, short[] sArr) {
        return i2 == 1 ? new C0730a(Math.min(i, sArr.length), sArr) : new C0731b(i, sArr, i2);
    }

    /* renamed from: j */
    public static ke0 m26733j(int i, int i2, short[] sArr) {
        return i2 == 1 ? new C0734e(Math.max(0, Math.min(i, sArr.length)) / 2, sArr) : new C0735f(Math.max(0, i) / 2, sArr, i2);
    }

    /* renamed from: m */
    public static ke0 m26730m(int i, int i2, short[] sArr) {
        return i2 == 1 ? new C0732c(i, sArr) : new C0733d(i, sArr);
    }

    /* renamed from: a */
    public boolean m26742a() {
        return this.f3961t;
    }

    /* renamed from: b */
    public int m26741b() {
        return this.f3949h;
    }

    /* renamed from: c */
    public int m26740c() {
        return this.f3951j;
    }

    /* renamed from: d */
    public void m26739d(int i, int i2, int i3, int i4) {
        m26738e(i, i2, i3, i4, true);
    }

    /* renamed from: e */
    public void m26738e(int i, int i2, int i3, int i4, boolean z) {
        C2691q6.m12749i(i2 > 0);
        int max = Math.max(1, i2);
        this.f3961t = z;
        this.f3959r = false;
        this.f3947f = i;
        this.f3943b = max;
        this.f3950i = i3;
        this.f3951j = i4;
        int max2 = Math.max(i3, i4);
        this.f3949h = max2;
        int i5 = max2 * max;
        if (this.f3944c.length != i5) {
            this.f3944c = new short[i5];
        }
        this.f3945d = Short.MAX_VALUE;
        this.f3946e = (short) 0;
    }

    /* renamed from: f */
    public void m26737f(long j) {
        this.f3959r = true;
        this.f3960s = j;
    }

    /* renamed from: g */
    public ke0 m26736g(int i, int i2) {
        return m26735h(i, i2, this.f3943b, this.f3944c);
    }

    /* renamed from: k */
    public ke0 m26732k() {
        return m26734i(this.f3950i, this.f3943b, this.f3944c);
    }

    /* renamed from: l */
    public ke0 m26731l() {
        return m26733j(this.f3950i, this.f3943b, this.f3944c);
    }
}
