package com.daaw;

import android.os.Handler;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.b;
import com.daaw.lv;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.vw1;
import com.daaw.ww1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class j7 {
    public List<Object> a = new LinkedList();
    public Handler b = new Handler();
    public lv[] c;
    public lv d;
    public lv e;

    /* loaded from: classes.dex */
    public class a implements rw1.a<Integer, al> {
        public a() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, al alVar) {
            if (num.intValue() == 3) {
                qx.q(alVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements qw1.a<al> {
        public b() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            qx.q(alVar);
        }
    }

    /* loaded from: classes.dex */
    public class c implements vw1.a<Boolean> {
        public c() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.B));
        }
    }

    /* loaded from: classes.dex */
    public class d implements vw1.a<rx> {
        public d() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public rx a() {
            b.C0042b a = com.daaw.avee.comp.playback.c.x.a(null);
            if (a == null) {
                return null;
            }
            return j7.this.e(a);
        }
    }

    /* loaded from: classes.dex */
    public class e implements rw1.a<Integer, Boolean> {
        public e() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Boolean bool) {
            ko0 q;
            if (num.intValue() != j5.B || (q = ko0.q()) == null) {
                return;
            }
            q.w(bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class f implements rw1.a<sx, rx> {
        public f() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(sx sxVar, rx rxVar) {
            j5.e().a0(j5.B, sxVar.a);
            j5.e().c0(j5.Q, sxVar.b);
            j5.e().g0(j5.m0, lv.e(sxVar.c));
            j5.e().c0(j5.R, (int) (sxVar.d * 1000.0f));
            j5.e().c0(j5.S, (int) (sxVar.e * 1000.0f));
            j5.e().c0(j5.T, (int) (sxVar.g * 1000.0f));
            b.c cVar = new b.c();
            lv.a[] aVarArr = sxVar.f.b;
            float[] fArr = new float[aVarArr.length];
            float[] fArr2 = new float[aVarArr.length];
            int i = 0;
            while (true) {
                lv lvVar = sxVar.f;
                lv.a[] aVarArr2 = lvVar.b;
                if (i >= aVarArr2.length) {
                    px.b(lvVar, j7.this.d, j7.this.e, sxVar.d, sxVar.e, fArr, fArr2);
                    cVar.a = sxVar.a;
                    cVar.b = false;
                    cVar.c = -1;
                    cVar.d = fArr;
                    cVar.e = sxVar.g;
                    com.daaw.avee.comp.playback.c.y.a(cVar);
                    return;
                }
                fArr2[i] = aVarArr2[i].a;
                i++;
            }
        }
    }

    /* loaded from: classes.dex */
    public class g implements ww1.a<String, b.c> {
        public g() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public b.c b(String str) {
            b.c cVar = new b.c();
            lv b = lv.b(j5.e().t(j5.m0));
            float k = j5.e().k(j5.R) * 0.001f;
            float k2 = j5.e().k(j5.S) * 0.001f;
            lv.a[] aVarArr = b.b;
            float[] fArr = new float[aVarArr.length];
            float[] fArr2 = new float[aVarArr.length];
            int i = 0;
            while (true) {
                lv.a[] aVarArr2 = b.b;
                if (i >= aVarArr2.length) {
                    px.b(b, j7.this.d, j7.this.e, k, k2, fArr, fArr2);
                    cVar.a = j5.e().h(j5.B);
                    cVar.b = false;
                    cVar.c = -1;
                    cVar.d = fArr;
                    cVar.e = j5.e().k(j5.T) * 0.001f;
                    return cVar;
                }
                fArr2[i] = aVarArr2[i].a;
                i++;
            }
        }
    }

    /* loaded from: classes.dex */
    public class h implements ww1.a<String, Boolean> {
        public h() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Boolean b(String str) {
            return Boolean.valueOf(j5.e().h(j5.B));
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<b.C0042b> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ b.C0042b p;

            public a(b.C0042b c0042b) {
                this.p = c0042b;
            }

            @Override // java.lang.Runnable
            public void run() {
                qx.K.a(j7.this.e(this.p));
            }
        }

        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(b.C0042b c0042b) {
            j7.this.b.post(new a(c0042b));
        }
    }

    public j7() {
        lv lvVar = new lv("Bass Boost", 2);
        this.d = lvVar;
        lvVar.b[0] = new lv.a(100.0f, 1.0f);
        this.d.b[1] = new lv.a(500.0f, 0.0f);
        lv lvVar2 = new lv("Treble Boost", 2);
        this.e = lvVar2;
        lvVar2.b[0] = new lv.a(1000.0f, 0.0f);
        this.e.b[1] = new lv.a(20000.0f, 1.0f);
        this.e.b[1] = new lv.a(20000.0f, 1.0f);
        f();
        MainActivity.r0.b(new a(), this.a);
        ko0.Z.b(new b(), this.a);
        ko0.a0.b(new c(), this.a);
        qx.M.b(new d(), this.a);
        j5.h.b(new e(), this.a);
        qx.L.b(new f(), this.a);
        MediaPlaybackService.w0.b(new g(), this.a);
        MediaPlaybackService.x0.b(new h(), this.a);
        MediaPlaybackService.y0.b(new i(), this.a);
    }

    public final rx e(b.C0042b c0042b) {
        if (c0042b == null) {
            c0042b = b.C0042b.g;
        }
        rx rxVar = new rx();
        rxVar.a = c0042b.a;
        lv b2 = lv.b(j5.e().t(j5.m0));
        if (b2.b.length != c0042b.f.length) {
            b2 = new lv("", c0042b.f.length);
            for (int i2 = 0; i2 < c0042b.f.length; i2++) {
                b2.b[i2] = new lv.a(0.0f, 0.0f);
            }
        }
        for (int i3 = 0; i3 < c0042b.f.length; i3++) {
            b2.b[i3].a = c0042b.e[i3] * 0.001f;
        }
        rxVar.b = b2;
        rxVar.c = j5.e().h(j5.B);
        rxVar.d = j5.e().k(j5.Q);
        rxVar.f = j5.e().k(j5.R) * 0.001f;
        rxVar.h = j5.e().k(j5.S) * 0.001f;
        rxVar.g = this.d;
        rxVar.i = this.e;
        rxVar.e = this.c;
        rxVar.j = j5.e().k(j5.T) * 0.001f;
        return rxVar;
    }

    public final void f() {
        this.c = new lv[15];
        lv lvVar = new lv("Default", 2);
        lvVar.b[0] = new lv.a(20.0f, 0.0f);
        lvVar.b[1] = new lv.a(20000.0f, 0.0f);
        this.c[0] = lvVar;
        lv lvVar2 = new lv("Classical", 18);
        lvVar2.b[0] = new lv.a(55.0f, 3.0f);
        lvVar2.b[1] = new lv.a(77.0f, 2.0f);
        lvVar2.b[2] = new lv.a(110.0f, 1.0f);
        lvVar2.b[3] = new lv.a(156.0f, 0.0f);
        lvVar2.b[4] = new lv.a(220.0f, 2.0f);
        lvVar2.b[5] = new lv.a(311.0f, 1.0f);
        lvVar2.b[6] = new lv.a(440.0f, 2.0f);
        lvVar2.b[7] = new lv.a(622.0f, 1.0f);
        lvVar2.b[8] = new lv.a(880.0f, 2.0f);
        lvVar2.b[9] = new lv.a(1200.0f, 3.0f);
        lvVar2.b[10] = new lv.a(1800.0f, 1.0f);
        lvVar2.b[11] = new lv.a(2500.0f, 1.0f);
        lvVar2.b[12] = new lv.a(3500.0f, 1.0f);
        lvVar2.b[13] = new lv.a(5000.0f, 2.0f);
        lvVar2.b[14] = new lv.a(7000.0f, 4.0f);
        lvVar2.b[15] = new lv.a(10000.0f, 3.0f);
        lvVar2.b[16] = new lv.a(14000.0f, 2.0f);
        lvVar2.b[17] = new lv.a(20000.0f, 1.0f);
        lvVar2.c(10.0f);
        this.c[1] = lvVar2;
        lv lvVar3 = new lv("Club", 18);
        lvVar3.b[0] = new lv.a(55.0f, 0.0f);
        lvVar3.b[1] = new lv.a(77.0f, 0.0f);
        lvVar3.b[2] = new lv.a(110.0f, 0.0f);
        lvVar3.b[3] = new lv.a(156.0f, 2.0f);
        lvVar3.b[4] = new lv.a(220.0f, 2.0f);
        lvVar3.b[5] = new lv.a(311.0f, 5.0f);
        lvVar3.b[6] = new lv.a(440.0f, 5.0f);
        lvVar3.b[7] = new lv.a(622.0f, 8.0f);
        lvVar3.b[8] = new lv.a(880.0f, 8.0f);
        lvVar3.b[9] = new lv.a(1200.0f, 8.0f);
        lvVar3.b[10] = new lv.a(1800.0f, 8.0f);
        lvVar3.b[11] = new lv.a(2500.0f, 8.0f);
        lvVar3.b[12] = new lv.a(3500.0f, 8.0f);
        lvVar3.b[13] = new lv.a(5000.0f, 5.0f);
        lvVar3.b[14] = new lv.a(7000.0f, 5.0f);
        lvVar3.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar3.b[16] = new lv.a(14000.0f, 0.0f);
        lvVar3.b[17] = new lv.a(20000.0f, 0.0f);
        lvVar3.c(10.0f);
        this.c[2] = lvVar3;
        lv lvVar4 = new lv("Dance", 18);
        lvVar4.b[0] = new lv.a(55.0f, 11.0f);
        lvVar4.b[1] = new lv.a(77.0f, 11.0f);
        lvVar4.b[2] = new lv.a(110.0f, 8.0f);
        lvVar4.b[3] = new lv.a(156.0f, 8.0f);
        lvVar4.b[4] = new lv.a(220.0f, 8.0f);
        lvVar4.b[5] = new lv.a(311.0f, 5.0f);
        lvVar4.b[6] = new lv.a(440.0f, 5.0f);
        lvVar4.b[7] = new lv.a(622.0f, 0.0f);
        lvVar4.b[8] = new lv.a(880.0f, 0.0f);
        lvVar4.b[9] = new lv.a(1200.0f, 0.0f);
        lvVar4.b[10] = new lv.a(1800.0f, 0.0f);
        lvVar4.b[11] = new lv.a(2500.0f, -5.0f);
        lvVar4.b[12] = new lv.a(3500.0f, -5.0f);
        lvVar4.b[13] = new lv.a(5000.0f, -5.0f);
        lvVar4.b[14] = new lv.a(7000.0f, -8.0f);
        lvVar4.b[15] = new lv.a(10000.0f, -8.0f);
        lvVar4.b[16] = new lv.a(14000.0f, 0.0f);
        lvVar4.b[17] = new lv.a(20000.0f, 0.0f);
        lvVar4.c(13.0f);
        this.c[3] = lvVar4;
        lv lvVar5 = new lv("Disco", 18);
        lvVar5.b[0] = new lv.a(55.0f, 3.0f);
        lvVar5.b[1] = new lv.a(77.0f, 3.0f);
        lvVar5.b[2] = new lv.a(110.0f, 1.0f);
        lvVar5.b[3] = new lv.a(156.0f, 1.0f);
        lvVar5.b[4] = new lv.a(220.0f, 3.0f);
        lvVar5.b[5] = new lv.a(311.0f, 1.0f);
        lvVar5.b[6] = new lv.a(440.0f, 1.0f);
        lvVar5.b[7] = new lv.a(622.0f, 1.0f);
        lvVar5.b[8] = new lv.a(880.0f, 2.0f);
        lvVar5.b[9] = new lv.a(1200.0f, 6.0f);
        lvVar5.b[10] = new lv.a(1800.0f, 5.0f);
        lvVar5.b[11] = new lv.a(2500.0f, 4.0f);
        lvVar5.b[12] = new lv.a(3500.0f, 3.0f);
        lvVar5.b[13] = new lv.a(5000.0f, 2.0f);
        lvVar5.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar5.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar5.b[16] = new lv.a(14000.0f, 2.0f);
        lvVar5.b[17] = new lv.a(20000.0f, 1.0f);
        lvVar5.c(10.0f);
        this.c[4] = lvVar5;
        lv lvVar6 = new lv("Drum & Bass", 18);
        lvVar6.b[0] = new lv.a(55.0f, 3.0f);
        lvVar6.b[1] = new lv.a(77.0f, 4.0f);
        lvVar6.b[2] = new lv.a(110.0f, 3.0f);
        lvVar6.b[3] = new lv.a(156.0f, 2.0f);
        lvVar6.b[4] = new lv.a(220.0f, 2.0f);
        lvVar6.b[5] = new lv.a(311.0f, 1.0f);
        lvVar6.b[6] = new lv.a(440.0f, 0.0f);
        lvVar6.b[7] = new lv.a(622.0f, 0.0f);
        lvVar6.b[8] = new lv.a(880.0f, 1.0f);
        lvVar6.b[9] = new lv.a(1200.0f, 3.0f);
        lvVar6.b[10] = new lv.a(1800.0f, 5.0f);
        lvVar6.b[11] = new lv.a(2500.0f, 3.0f);
        lvVar6.b[12] = new lv.a(3500.0f, 2.0f);
        lvVar6.b[13] = new lv.a(5000.0f, 1.0f);
        lvVar6.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar6.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar6.b[16] = new lv.a(14000.0f, 1.0f);
        lvVar6.b[17] = new lv.a(20000.0f, 2.0f);
        lvVar6.c(10.0f);
        this.c[5] = lvVar6;
        lv lvVar7 = new lv("Heavy Metal", 18);
        lvVar7.b[0] = new lv.a(55.0f, 4.0f);
        lvVar7.b[1] = new lv.a(77.0f, 3.0f);
        lvVar7.b[2] = new lv.a(110.0f, 2.0f);
        lvVar7.b[3] = new lv.a(156.0f, 3.0f);
        lvVar7.b[4] = new lv.a(220.0f, 6.0f);
        lvVar7.b[5] = new lv.a(311.0f, 6.0f);
        lvVar7.b[6] = new lv.a(440.0f, 6.0f);
        lvVar7.b[7] = new lv.a(622.0f, 6.0f);
        lvVar7.b[8] = new lv.a(880.0f, 6.0f);
        lvVar7.b[9] = new lv.a(1200.0f, 5.0f);
        lvVar7.b[10] = new lv.a(1800.0f, 4.0f);
        lvVar7.b[11] = new lv.a(2500.0f, 3.0f);
        lvVar7.b[12] = new lv.a(3500.0f, 3.0f);
        lvVar7.b[13] = new lv.a(5000.0f, 3.0f);
        lvVar7.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar7.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar7.b[16] = new lv.a(14000.0f, 2.0f);
        lvVar7.b[17] = new lv.a(20000.0f, 1.0f);
        lvVar7.c(10.0f);
        this.c[6] = lvVar7;
        lv lvVar8 = new lv("Jazz", 18);
        lvVar8.b[0] = new lv.a(55.0f, 0.0f);
        lvVar8.b[1] = new lv.a(77.0f, 1.0f);
        lvVar8.b[2] = new lv.a(110.0f, 2.0f);
        lvVar8.b[3] = new lv.a(156.0f, 2.0f);
        lvVar8.b[4] = new lv.a(220.0f, 3.0f);
        lvVar8.b[5] = new lv.a(311.0f, 1.0f);
        lvVar8.b[6] = new lv.a(440.0f, 2.0f);
        lvVar8.b[7] = new lv.a(622.0f, 0.0f);
        lvVar8.b[8] = new lv.a(880.0f, 0.0f);
        lvVar8.b[9] = new lv.a(1200.0f, 2.0f);
        lvVar8.b[10] = new lv.a(1800.0f, 1.0f);
        lvVar8.b[11] = new lv.a(2500.0f, 2.0f);
        lvVar8.b[12] = new lv.a(3500.0f, 4.0f);
        lvVar8.b[13] = new lv.a(5000.0f, 3.0f);
        lvVar8.b[14] = new lv.a(7000.0f, 3.0f);
        lvVar8.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar8.b[16] = new lv.a(14000.0f, 1.0f);
        lvVar8.b[17] = new lv.a(20000.0f, 0.0f);
        lvVar8.c(10.0f);
        this.c[7] = lvVar8;
        lv lvVar9 = new lv("Latin", 18);
        lvVar9.b[0] = new lv.a(55.0f, 0.0f);
        lvVar9.b[1] = new lv.a(77.0f, -2.0f);
        lvVar9.b[2] = new lv.a(110.0f, -1.0f);
        lvVar9.b[3] = new lv.a(156.0f, 0.0f);
        lvVar9.b[4] = new lv.a(220.0f, 1.0f);
        lvVar9.b[5] = new lv.a(311.0f, 1.0f);
        lvVar9.b[6] = new lv.a(440.0f, 2.0f);
        lvVar9.b[7] = new lv.a(622.0f, 2.0f);
        lvVar9.b[8] = new lv.a(880.0f, 3.0f);
        lvVar9.b[9] = new lv.a(1200.0f, 4.0f);
        lvVar9.b[10] = new lv.a(1800.0f, 1.0f);
        lvVar9.b[11] = new lv.a(2500.0f, 2.0f);
        lvVar9.b[12] = new lv.a(3500.0f, 2.0f);
        lvVar9.b[13] = new lv.a(5000.0f, 2.0f);
        lvVar9.b[14] = new lv.a(7000.0f, 3.0f);
        lvVar9.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar9.b[16] = new lv.a(14000.0f, 1.0f);
        lvVar9.b[17] = new lv.a(20000.0f, 1.0f);
        lvVar9.c(10.0f);
        this.c[8] = lvVar9;
        lv lvVar10 = new lv("New Age", 18);
        lvVar10.b[0] = new lv.a(55.0f, 3.0f);
        lvVar10.b[1] = new lv.a(77.0f, 1.0f);
        lvVar10.b[2] = new lv.a(110.0f, 3.0f);
        lvVar10.b[3] = new lv.a(156.0f, 2.0f);
        lvVar10.b[4] = new lv.a(220.0f, 2.0f);
        lvVar10.b[5] = new lv.a(311.0f, 2.0f);
        lvVar10.b[6] = new lv.a(440.0f, 3.0f);
        lvVar10.b[7] = new lv.a(622.0f, 2.0f);
        lvVar10.b[8] = new lv.a(880.0f, 0.0f);
        lvVar10.b[9] = new lv.a(1200.0f, 2.0f);
        lvVar10.b[10] = new lv.a(1800.0f, 4.0f);
        lvVar10.b[11] = new lv.a(2500.0f, 1.0f);
        lvVar10.b[12] = new lv.a(3500.0f, 3.0f);
        lvVar10.b[13] = new lv.a(5000.0f, 2.0f);
        lvVar10.b[14] = new lv.a(7000.0f, 4.0f);
        lvVar10.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar10.b[16] = new lv.a(14000.0f, 1.0f);
        lvVar10.b[17] = new lv.a(20000.0f, 1.0f);
        lvVar10.c(10.0f);
        this.c[9] = lvVar10;
        lv lvVar11 = new lv("Party", 18);
        lvVar11.b[0] = new lv.a(55.0f, 7.0f);
        lvVar11.b[1] = new lv.a(77.0f, 6.0f);
        lvVar11.b[2] = new lv.a(110.0f, 5.0f);
        lvVar11.b[3] = new lv.a(156.0f, 3.0f);
        lvVar11.b[4] = new lv.a(220.0f, 2.0f);
        lvVar11.b[5] = new lv.a(311.0f, 1.0f);
        lvVar11.b[6] = new lv.a(440.0f, 0.0f);
        lvVar11.b[7] = new lv.a(622.0f, 0.0f);
        lvVar11.b[8] = new lv.a(880.0f, 0.0f);
        lvVar11.b[9] = new lv.a(1200.0f, 0.0f);
        lvVar11.b[10] = new lv.a(1800.0f, 0.0f);
        lvVar11.b[11] = new lv.a(2500.0f, 0.0f);
        lvVar11.b[12] = new lv.a(3500.0f, 0.0f);
        lvVar11.b[13] = new lv.a(5000.0f, 1.0f);
        lvVar11.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar11.b[15] = new lv.a(10000.0f, 4.0f);
        lvVar11.b[16] = new lv.a(14000.0f, 5.0f);
        lvVar11.b[17] = new lv.a(20000.0f, 5.0f);
        lvVar11.c(10.0f);
        this.c[10] = lvVar11;
        lv lvVar12 = new lv("Pop", 18);
        lvVar12.b[0] = new lv.a(55.0f, 1.0f);
        lvVar12.b[1] = new lv.a(77.0f, -1.0f);
        lvVar12.b[2] = new lv.a(110.0f, -3.0f);
        lvVar12.b[3] = new lv.a(156.0f, 0.0f);
        lvVar12.b[4] = new lv.a(220.0f, 1.0f);
        lvVar12.b[5] = new lv.a(311.0f, 2.0f);
        lvVar12.b[6] = new lv.a(440.0f, 3.0f);
        lvVar12.b[7] = new lv.a(622.0f, 1.0f);
        lvVar12.b[8] = new lv.a(880.0f, 1.0f);
        lvVar12.b[9] = new lv.a(1200.0f, 2.0f);
        lvVar12.b[10] = new lv.a(1800.0f, 0.0f);
        lvVar12.b[11] = new lv.a(2500.0f, -1.0f);
        lvVar12.b[12] = new lv.a(3500.0f, -2.0f);
        lvVar12.b[13] = new lv.a(5000.0f, 0.0f);
        lvVar12.b[14] = new lv.a(7000.0f, 1.0f);
        lvVar12.b[15] = new lv.a(10000.0f, 2.0f);
        lvVar12.b[16] = new lv.a(14000.0f, 2.0f);
        lvVar12.b[17] = new lv.a(20000.0f, 2.0f);
        lvVar12.c(10.0f);
        this.c[11] = lvVar12;
        lv lvVar13 = new lv("Rock", 18);
        lvVar13.b[0] = new lv.a(55.0f, 3.0f);
        lvVar13.b[1] = new lv.a(77.0f, -3.0f);
        lvVar13.b[2] = new lv.a(110.0f, -2.0f);
        lvVar13.b[3] = new lv.a(156.0f, -2.0f);
        lvVar13.b[4] = new lv.a(220.0f, -2.0f);
        lvVar13.b[5] = new lv.a(311.0f, -2.0f);
        lvVar13.b[6] = new lv.a(440.0f, -2.0f);
        lvVar13.b[7] = new lv.a(622.0f, -2.0f);
        lvVar13.b[8] = new lv.a(880.0f, -1.0f);
        lvVar13.b[9] = new lv.a(1200.0f, -1.0f);
        lvVar13.b[10] = new lv.a(1800.0f, -1.0f);
        lvVar13.b[11] = new lv.a(2500.0f, -1.0f);
        lvVar13.b[12] = new lv.a(3500.0f, 0.0f);
        lvVar13.b[13] = new lv.a(5000.0f, 1.0f);
        lvVar13.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar13.b[15] = new lv.a(10000.0f, 3.0f);
        lvVar13.b[16] = new lv.a(14000.0f, 4.0f);
        lvVar13.b[17] = new lv.a(20000.0f, 5.0f);
        lvVar13.c(10.0f);
        this.c[12] = lvVar13;
        lv lvVar14 = new lv("Techno", 18);
        lvVar14.b[0] = new lv.a(55.0f, 3.0f);
        lvVar14.b[1] = new lv.a(77.0f, 5.0f);
        lvVar14.b[2] = new lv.a(110.0f, 3.0f);
        lvVar14.b[3] = new lv.a(156.0f, 1.0f);
        lvVar14.b[4] = new lv.a(220.0f, -1.0f);
        lvVar14.b[5] = new lv.a(311.0f, 0.0f);
        lvVar14.b[6] = new lv.a(440.0f, 1.0f);
        lvVar14.b[7] = new lv.a(622.0f, 1.0f);
        lvVar14.b[8] = new lv.a(880.0f, 2.0f);
        lvVar14.b[9] = new lv.a(1200.0f, 5.0f);
        lvVar14.b[10] = new lv.a(1800.0f, 3.0f);
        lvVar14.b[11] = new lv.a(2500.0f, 2.0f);
        lvVar14.b[12] = new lv.a(3500.0f, 5.0f);
        lvVar14.b[13] = new lv.a(5000.0f, 1.0f);
        lvVar14.b[14] = new lv.a(7000.0f, 2.0f);
        lvVar14.b[15] = new lv.a(10000.0f, 3.0f);
        lvVar14.b[16] = new lv.a(14000.0f, 4.0f);
        lvVar14.b[17] = new lv.a(20000.0f, 4.0f);
        lvVar14.c(10.0f);
        this.c[13] = lvVar14;
        lv lvVar15 = new lv("Vocal", 18);
        lvVar15.b[0] = new lv.a(55.0f, 2.0f);
        lvVar15.b[1] = new lv.a(77.0f, -1.0f);
        lvVar15.b[2] = new lv.a(110.0f, -1.0f);
        lvVar15.b[3] = new lv.a(156.0f, -1.0f);
        lvVar15.b[4] = new lv.a(220.0f, 2.0f);
        lvVar15.b[5] = new lv.a(311.0f, 2.0f);
        lvVar15.b[6] = new lv.a(440.0f, 4.0f);
        lvVar15.b[7] = new lv.a(622.0f, 3.0f);
        lvVar15.b[8] = new lv.a(880.0f, 4.0f);
        lvVar15.b[9] = new lv.a(1200.0f, 4.0f);
        lvVar15.b[10] = new lv.a(1800.0f, 3.0f);
        lvVar15.b[11] = new lv.a(2500.0f, 2.0f);
        lvVar15.b[12] = new lv.a(3500.0f, 0.0f);
        lvVar15.b[13] = new lv.a(5000.0f, 0.0f);
        lvVar15.b[14] = new lv.a(7000.0f, 0.0f);
        lvVar15.b[15] = new lv.a(10000.0f, 0.0f);
        lvVar15.b[16] = new lv.a(14000.0f, -1.0f);
        lvVar15.b[17] = new lv.a(20000.0f, -1.0f);
        lvVar15.c(10.0f);
        this.c[14] = lvVar15;
    }
}
