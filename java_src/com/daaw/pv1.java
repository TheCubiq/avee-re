package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.TypedValue;
import android.view.SurfaceHolder;
import android.widget.TextView;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.SettingsActivity;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import com.daaw.ir1;
import com.daaw.pw1;
import com.daaw.qw1;
import com.daaw.rw1;
import com.daaw.sw1;
import com.daaw.tw1;
import com.daaw.tx0;
import com.daaw.uw1;
import com.daaw.vw1;
import com.daaw.ww1;
import com.daaw.xw1;
import com.daaw.zw1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class pv1 {
    public static ow1<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> u = new ow1<>();
    public boolean j;
    public volatile WeakReference<SurfaceHolder> a = new WeakReference<>(null);
    public WeakReference<VisualizerViewCore> b = new WeakReference<>(null);
    public volatile float c = 1.0f;
    public boolean d = true;
    public List<Object> e = new LinkedList();
    public Handler f = new Handler();
    public WeakReference<TextView> g = new WeakReference<>(null);
    public List<String> h = null;
    public String i = null;
    public final Random k = new Random();
    public Handler l = new Handler();
    public bs1 m = new bs1(0.0f, 0.0f);
    public bs1 n = new bs1(0.0f, 0.0f);
    public float o = 0.0f;
    public int p = -1;
    public final p80 q = new p80(p80.f);
    public final p80 r = new p80(p80.g);
    public HashMap<Integer, Bitmap> s = new HashMap<>();
    public z31 t = new z31();

    /* loaded from: classes.dex */
    public class a implements zw1.a<String, bs1, bs1, bq0, de0, bs1> {
        public a() {
        }

        @Override // com.daaw.zw1.a
        /* renamed from: b */
        public bs1 a(String str, bs1 bs1Var, bs1 bs1Var2, bq0 bq0Var, de0 de0Var) {
            float d = de0Var.d();
            float g = de0Var.g();
            if (str != null && str.length() >= 1) {
                float f = 0.0f;
                bs1 bs1Var3 = bs1Var2 == null ? new bs1(0.0f, 0.0f) : bs1Var2;
                if ("Nothing".equals(str)) {
                    return new bs1(0.0f, 0.0f);
                }
                if ("Constant".equals(str)) {
                    return new bs1(bs1Var.a, bs1Var.b);
                }
                if ("IsPlaying".equals(str)) {
                    return pv1.this.S() ? new bs1(1.0f, 1.0f) : new bs1(0.0f, 0.0f);
                } else if (str.equals("Beat")) {
                    float f2 = bq0Var.a;
                    return new bs1(bs1Var.a * f2, f2 * bs1Var.b);
                } else {
                    float f3 = 0.5f;
                    if (str.equals("BeatCamShakeMore")) {
                        float max = Math.max(Math.min(pv1.this.S() ? bq0Var.a * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f4 = max * max;
                        bs1 a = pv1.this.r.a((((g * 0.5f) * max) * bs1Var.b) % 1.0f);
                        a.a = (a.a - 0.5f) * bs1Var.a * f4 * 0.06f;
                        a.b = (a.b - 0.5f) * bs1Var.a * f4 * 0.06f;
                        tg0.b(a, bs1Var3, a, 0.800000011920929d);
                        return a;
                    } else if (str.equals("BeatCamShakeLess")) {
                        float max2 = Math.max(Math.min(pv1.this.S() ? bq0Var.a * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f5 = max2 * max2;
                        bs1 a2 = pv1.this.q.a((((g * 0.5f) * max2) * bs1Var.b) % 1.0f);
                        a2.a = (a2.a - 0.5f) * bs1Var.a * f5 * 0.06f;
                        a2.b = (a2.b - 0.5f) * bs1Var.a * f5 * 0.06f;
                        tg0.b(a2, bs1Var3, a2, 0.800000011920929d);
                        return a2;
                    } else if (str.equals("TotalTime")) {
                        return new bs1((bs1Var.a * g) % 1.0f, (g * bs1Var.b) % 1.0f);
                    } else {
                        if (str.equals("TotalTimeBackward")) {
                            return new bs1(1.0f - ((bs1Var.a * g) % 1.0f), 1.0f - ((g * bs1Var.b) % 1.0f));
                        }
                        if (str.equals("TotalTimeWhenPlaying")) {
                            return new bs1((pv1.this.o * bs1Var.a) % 1.0f, (pv1.this.o * bs1Var.b) % 1.0f);
                        }
                        if (str.equals("ConstantShakeMore")) {
                            bs1 a3 = pv1.this.r.a(((g * 0.5f) * bs1Var.b) % 1.0f);
                            a3.a = (a3.a - 0.5f) * bs1Var.a * 0.06f;
                            a3.b = (a3.b - 0.5f) * bs1Var.a * 0.06f;
                            tg0.b(a3, bs1Var3, a3, 0.10000000149011612d);
                            return a3;
                        } else if (str.equals("ConstantShake")) {
                            bs1 a4 = pv1.this.q.a(((g * 0.5f) * bs1Var.b) % 1.0f);
                            a4.a = (a4.a - 0.5f) * bs1Var.a * 0.06f;
                            a4.b = (a4.b - 0.5f) * bs1Var.a * 0.06f;
                            tg0.b(a4, bs1Var3, a4, 0.10000000149011612d);
                            return a4;
                        } else if (str.equals("BeatRandomShake")) {
                            float max3 = Math.max(Math.min(pv1.this.S() ? bq0Var.a * 2.5f : 0.0f, 1.0f), 0.0f);
                            float f6 = max3 * max3 * max3;
                            return new bs1(pv1.this.n.a * f6 * bs1Var.a * 0.025f, pv1.this.n.b * f6 * bs1Var.a * 0.025f);
                        } else if (str.equals("TrackPosition")) {
                            float max4 = Math.max(Math.min(((float) b5.d()) / ((float) b5.c()), 1.0f), 0.0f);
                            return new bs1(bs1Var.a * max4, max4 * bs1Var.b);
                        } else if (str.equals("TotalTimeAndBeat")) {
                            float f7 = bs1Var3.a;
                            if (pv1.this.S()) {
                                f7 = f7 + (d * bs1Var.a * 1.0f) + (bq0Var.a * bs1Var.b * 0.1f);
                            }
                            return new bs1(f7, f7);
                        } else if (str.equals("ConstantShakeRotMore")) {
                            double b = pv1.this.r.b(((g * 0.5f) * bs1Var.b) % 1.0f);
                            Double.isNaN(b);
                            float a5 = tg0.a(bs1Var3.a, ((float) (b / 6.283185307179586d)) * bs1Var.a * 0.5f, 0.10000000149011612d);
                            return new bs1(a5, a5);
                        } else if (str.equals("ConstantShakeRotLess")) {
                            double b2 = pv1.this.q.b(((g * 0.5f) * bs1Var.b) % 1.0f);
                            Double.isNaN(b2);
                            float a6 = tg0.a(bs1Var3.a, ((float) (b2 / 6.283185307179586d)) * bs1Var.a * 0.5f, 0.10000000149011612d);
                            return new bs1(a6, a6);
                        } else if (str.equals("BeatCamShakeRotMore")) {
                            float max5 = Math.max(Math.min(pv1.this.S() ? bq0Var.a * 2.5f : 0.0f, 1.0f), 0.0f);
                            double b3 = pv1.this.r.b(((g * 0.5f) * bs1Var.b) % 1.0f);
                            Double.isNaN(b3);
                            float a7 = tg0.a(bs1Var3.a, ((float) (b3 / 6.283185307179586d)) * bs1Var.a * 0.5f * max5 * max5, 0.800000011920929d);
                            return new bs1(a7, a7);
                        } else if (str.equals("BeatCamShakeRotLess")) {
                            float max6 = Math.max(Math.min(pv1.this.S() ? bq0Var.a * 2.5f : 0.0f, 1.0f), 0.0f);
                            double b4 = pv1.this.q.b(((g * 0.5f) * bs1Var.b) % 1.0f);
                            Double.isNaN(b4);
                            float a8 = tg0.a(bs1Var3.a, ((float) (b4 / 6.283185307179586d)) * bs1Var.a * 0.5f * max6 * max6, 0.800000011920929d);
                            return new bs1(a8, a8);
                        } else if (str.equals("PeakBarIndex")) {
                            float a9 = tg0.a(bq0Var.b, bs1Var3.a, bs1Var.b);
                            float f8 = bs1Var.a;
                            return new bs1(a9 * f8, a9 * f8);
                        } else if (str.equals("BeatTriggerAnim")) {
                            if (pv1.this.S() && bq0Var.a > bs1Var.a && bs1Var3.b >= 1.9999999f) {
                                bs1Var3.a = 0.0f;
                                bs1Var3.b = 0.0f;
                            }
                            float f9 = bs1Var3.a;
                            float f10 = bs1Var.b;
                            float f11 = f9 + (d * f10);
                            if (f11 >= 0.4999999f) {
                                f = bs1Var3.b + (d * f10);
                            } else {
                                f3 = f11;
                            }
                            return new bs1(f3, f);
                        } else {
                            return bs1Var3;
                        }
                    }
                }
            }
            return new bs1(bs1Var.a, bs1Var.b);
        }
    }

    /* loaded from: classes.dex */
    public class a0 implements rw1.a<Integer, Activity> {
        public a0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Activity activity) {
            boolean z;
            boolean h;
            o30 q0;
            if (num.intValue() == 2) {
                z = true;
                pv1.this.d = true;
                h = j5.e().h(j5.o);
                q0 = MainActivity.q0();
                if (q0 == null) {
                    return;
                }
            } else {
                z = false;
                pv1.this.d = false;
                h = j5.e().h(j5.o);
                q0 = MainActivity.q0();
                if (q0 == null) {
                    return;
                }
            }
            q0.m(z, h);
        }
    }

    /* loaded from: classes.dex */
    public class b implements vw1.a<i2> {
        public b() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public i2 a() {
            tx0.b bVar = ww0.d;
            if (bVar == tx0.h) {
                return null;
            }
            return new i2(bVar.a, bVar.d(), bVar.b());
        }
    }

    /* loaded from: classes.dex */
    public class b0 implements qw1.a<Boolean> {
        public b0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            pv1.this.d = bool.booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class c implements rw1.a<af0, h2> {

        /* loaded from: classes.dex */
        public class a implements af0 {
            public Object a;
            public final /* synthetic */ af0 b;

            /* renamed from: com.daaw.pv1$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0083a implements Runnable {
                public final /* synthetic */ df0 p;
                public final /* synthetic */ String q;
                public final /* synthetic */ String r;

                public RunnableC0083a(df0 df0Var, String str, String str2) {
                    this.p = df0Var;
                    this.q = str;
                    this.r = str2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.b.b(this.p, this.q, this.r);
                }
            }

            public a(af0 af0Var) {
                this.b = af0Var;
            }

            @Override // com.daaw.af0
            public void a(Object obj) {
                this.a = obj;
            }

            @Override // com.daaw.af0
            public void b(df0 df0Var, String str, String str2) {
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.queueEvent(new RunnableC0083a(df0Var, str, str2));
                }
            }
        }

        public c() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(af0 af0Var, h2 h2Var) {
            a aVar = new a(af0Var);
            af0Var.a(aVar);
            new g2().v(false, h2Var.a, h2Var.b, h2Var.c, aVar, h2Var.d, h2Var.e, h2Var.h, h2Var.i, false, h2Var.k, Integer.valueOf(j5.e().k(j5.I)));
        }
    }

    /* loaded from: classes.dex */
    public class c0 implements vw1.a<Boolean> {
        public c0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(pv1.this.d);
        }
    }

    /* loaded from: classes.dex */
    public class d implements ww1.a<Integer, Integer> {
        public d() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Integer num) {
            return Integer.valueOf((int) TypedValue.applyDimension(1, Integer.valueOf(num.intValue() / 2).intValue(), dx0.e().getResources().getDisplayMetrics()));
        }
    }

    /* loaded from: classes.dex */
    public class d0 implements pw1.a {
        public d0() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            int i;
            MainActivity r0 = MainActivity.r0();
            if (r0 == null || (i = r0.N) != 2) {
                return;
            }
            r0.P0(i);
        }
    }

    /* loaded from: classes.dex */
    public class e implements ww1.a<List<sv1>, lo1<Integer, List<Integer>>> {
        public e() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public lo1<Integer, List<Integer>> b(List<sv1> list) {
            List<lo1<sv1, Object>> f = tv1.i().f();
            ArrayList arrayList = new ArrayList(f.size());
            for (lo1<sv1, Object> lo1Var : f) {
                arrayList.add(Integer.valueOf(lo1Var.a.a));
            }
            List<Integer> o = j5.e().o();
            ArrayList<Integer> arrayList2 = new ArrayList(f.size() + o.size());
            for (lo1<sv1, Object> lo1Var2 : f) {
                arrayList2.add(Integer.valueOf(lo1Var2.a.a));
            }
            for (Integer num : o) {
                if (!arrayList.contains(num)) {
                    arrayList2.add(num);
                }
            }
            for (Integer num2 : arrayList2) {
                list.add(new sv1(num2.intValue(), tv1.i().g(num2.intValue())));
            }
            return new lo1<>(Integer.valueOf(j5.e().k(j5.I)), arrayList2);
        }
    }

    /* loaded from: classes.dex */
    public class e0 implements qw1.a<al> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ VisualizerViewCore p;
            public final /* synthetic */ gt q;
            public final /* synthetic */ al r;

            /* renamed from: com.daaw.pv1$e0$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class RunnableC0084a implements Runnable {
                public final /* synthetic */ int p;
                public final /* synthetic */ vn q;

                public RunnableC0084a(int i, vn vnVar) {
                    this.p = i;
                    this.q = vnVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FragmentManager c;
                    a aVar = a.this;
                    pv1.this.e(this.p, aVar.q.b());
                    Activity a = a.this.r.a();
                    if (a == null || a.isFinishing() || (c = a.this.r.c()) == null || ho.o(c)) {
                        return;
                    }
                    ho.j(a.this.r, Integer.valueOf(this.p), this.q, xv.b);
                }
            }

            public a(VisualizerViewCore visualizerViewCore, gt gtVar, al alVar) {
                this.p = visualizerViewCore;
                this.q = gtVar;
                this.r = alVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                int k = j5.e().k(j5.I);
                vn d = vn.d();
                this.p.i(d, this.q);
                this.p.post(new RunnableC0084a(k, d));
            }
        }

        public e0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            gt gtVar = new gt();
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.queueEvent(new a(visualizerViewCore, gtVar, alVar));
            }
        }
    }

    /* loaded from: classes.dex */
    public class f implements ww1.a<List<sv1>, ir1<List<Bitmap>>> {

        /* loaded from: classes.dex */
        public class a implements ir1.c<List<Bitmap>> {
            public final /* synthetic */ List a;

            public a(List list) {
                this.a = list;
            }

            @Override // com.daaw.ir1.c
            /* renamed from: b */
            public List<Bitmap> a(ir1<List<Bitmap>> ir1Var) {
                ArrayList arrayList = new ArrayList(this.a.size());
                int[] iArr = new int[1];
                HashMap<Integer, Bitmap> hashMap = new HashMap<>(this.a.size());
                f61 e = tv1.i().e(0, false, "");
                for (int i = 0; i < this.a.size(); i++) {
                    int i2 = ((sv1) this.a.get(i)).a;
                    vn O = pv1.O(i2, iArr);
                    Bitmap bitmap = pv1.this.s.get(Integer.valueOf(iArr[0]));
                    if (bitmap == null || iArr[0] == 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
                        pv1.this.Y(null, e, i2, true, O);
                        if (e != null) {
                            pv1.this.t.m();
                            pv1.this.t.n(createBitmap);
                            for (int i3 = 0; i3 < 1; i3++) {
                                e.y(pv1.this.t, null, null);
                            }
                            e.G(pv1.this.t, null);
                        }
                        bitmap = createBitmap;
                    }
                    hashMap.put(Integer.valueOf(iArr[0]), bitmap);
                    arrayList.add(bitmap);
                }
                pv1.this.s = hashMap;
                return arrayList;
            }
        }

        public f() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public ir1<List<Bitmap>> b(List<sv1> list) {
            return new ir1<>(new a(list));
        }
    }

    /* loaded from: classes.dex */
    public class f0 implements pw1.a {
        public f0() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            int i;
            MainActivity r0 = MainActivity.r0();
            if (r0 == null || (i = r0.N) != 2) {
                return;
            }
            r0.N0(false, i);
        }
    }

    /* loaded from: classes.dex */
    public class g implements qw1.a<sv1> {
        public g() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(sv1 sv1Var) {
            pv1.Z(sv1Var.a);
        }
    }

    /* loaded from: classes.dex */
    public class g0 implements vw1.a<Integer> {
        public g0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(pv1.this.N());
        }
    }

    /* loaded from: classes.dex */
    public class h implements qw1.a<sv1> {
        public h() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(sv1 sv1Var) {
            if (sv1Var == null) {
                return;
            }
            vy.a.a(dx0.b().getResources().getString(R.string.hold_to_remove_vis));
        }
    }

    /* loaded from: classes.dex */
    public class h0 implements pw1.a {
        public h0() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            int i;
            MainActivity r0 = MainActivity.r0();
            if (r0 != null && (i = r0.N) == 2) {
                r0.N0(true, i);
            }
            pv1.this.a0(-1, false);
        }
    }

    /* loaded from: classes.dex */
    public class i implements qw1.a<sv1> {
        public i() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(sv1 sv1Var) {
            if (sv1Var == null) {
                return;
            }
            j5 e = j5.e();
            List<Integer> o = e.o();
            o.remove(Integer.valueOf(sv1Var.a));
            e.k(j5.I);
            e.f0(o);
        }
    }

    /* loaded from: classes.dex */
    public class i0 implements sw1.a<Integer, Integer, Boolean> {
        public i0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Boolean bool) {
            pv1.this.a0(num2, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class j implements rw1.a<sv1, List<Integer>> {
        public j() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(sv1 sv1Var, List<Integer> list) {
            if (sv1Var == null) {
                return;
            }
            pv1.J(pv1.O(sv1Var.a, null), list, sv1Var.a);
        }
    }

    /* loaded from: classes.dex */
    public class j0 implements sw1.a<al, Integer, vn> {
        public j0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(al alVar, Integer num, vn vnVar) {
            tv1 i;
            int h;
            if (tv1.i().g(num.intValue())) {
                i = tv1.i();
                h = num.intValue();
            } else {
                i = tv1.i();
                h = vnVar.h();
            }
            vn b = i.b(h);
            if (b == null) {
                lz1.c("Can't reset visualizer basedOnTemplate not valid");
            } else {
                j5.e().W(num.intValue(), b, true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class k implements qw1.a<Boolean> {
        public k() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            pv1.this.j = bool.booleanValue();
        }
    }

    /* loaded from: classes.dex */
    public class k0 implements tw1.a<Integer, vn, Integer, rw1<Integer, vn>> {

        /* loaded from: classes.dex */
        public class a implements com.daaw.e0<VisualizerViewCore> {
            public final /* synthetic */ rw1 a;

            public a(rw1 rw1Var) {
                this.a = rw1Var;
            }

            @Override // com.daaw.e0
            /* renamed from: b */
            public void a(VisualizerViewCore visualizerViewCore) {
                if (this.a != null) {
                    pv1.b0(visualizerViewCore, false, -1);
                }
            }
        }

        public k0() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Integer num, vn vnVar, Integer num2, rw1<Integer, vn> rw1Var) {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.o(vnVar, new a(rw1Var));
            }
        }
    }

    /* loaded from: classes.dex */
    public class l implements sw1.a<Integer, String, Boolean> {
        public l() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, String str, Boolean bool) {
            VisualizerViewCore visualizerViewCore;
            if (num.equals(Integer.valueOf(j5.u0))) {
                iv1 e = iv1.e();
                if (e != null) {
                    e.g();
                }
            } else if (num.intValue() < j5.s0 || num.intValue() > j5.t0 || j5.j0(j5.e().k(j5.I)) != num.intValue() || (visualizerViewCore = (VisualizerViewCore) pv1.this.b.get()) == null) {
            } else {
                visualizerViewCore.l();
            }
        }
    }

    /* loaded from: classes.dex */
    public class l0 implements sw1.a<Integer, vn, Integer> {
        public l0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, vn vnVar, Integer num2) {
            j5.e().W(num.intValue(), vnVar, false);
        }
    }

    /* loaded from: classes.dex */
    public class m implements vw1.a<vn> {
        public m() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public vn a() {
            return pv1.O(j5.e().k(j5.I), null);
        }
    }

    /* loaded from: classes.dex */
    public class m0 implements uw1.a<Fragment, TextView, List<String>, String, String> {
        public m0() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Fragment fragment, TextView textView, List<String> list, String str, String str2) {
            if (fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
                return;
            }
            pv1.this.g = new WeakReference(textView);
            pv1.this.h = list;
            pv1.this.i = str;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.setFlags(1);
            fragment.startActivityForResult(intent, 44);
        }
    }

    /* loaded from: classes.dex */
    public class n implements pw1.a {
        public n() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.b.get();
            if (visualizerViewCore != null) {
                pv1.b0(visualizerViewCore, false, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class n0 implements sw1.a<ho, Integer, Intent> {
        public n0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(ho hoVar, Integer num, Intent intent) {
            String str;
            if (hoVar == null) {
                return;
            }
            if (num.intValue() == 43 || num.intValue() == 44) {
                int i = hoVar.z;
                if (intent == null) {
                    str = "Data is null";
                } else {
                    Uri data = intent.getData();
                    if (data != null) {
                        File a = j5.a(i);
                        InputStream inputStream = null;
                        try {
                            inputStream = hoVar.getActivity().getContentResolver().openInputStream(data);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        File b = j5.b(a, inputStream, cr1.h(data.getPath(), ':'));
                        if (b == null) {
                            lz1.c("Copy to local folder failed");
                            return;
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        pv1 pv1Var = pv1.this;
                        int intValue = num.intValue();
                        pv1Var.g(hoVar, i, intValue, null, "local:" + b.getName(), 0);
                        return;
                    }
                    str = "originalUri is null";
                }
                lz1.c(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public class o implements ww1.a<Context, om1> {
        public o() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public om1 b(Context context) {
            om1 om1Var = new om1();
            om1Var.a = (float) b5.d();
            float c = (float) b5.c();
            om1Var.b = c;
            float min = Math.min(om1Var.a / c, 1.0f);
            om1Var.c = min;
            om1Var.c = Math.max(min, 0.0f);
            return om1Var;
        }
    }

    /* loaded from: classes.dex */
    public class o0 implements sw1.a<Integer, Integer, Boolean> {
        public o0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == j5.I && bool.booleanValue()) {
                int intValue = num2.intValue();
                pv1 pv1Var = pv1.this;
                pv1Var.X((VisualizerViewCore) pv1Var.b.get(), intValue, false, null);
            } else if (num.intValue() != j5.L) {
                num.intValue();
                int i = j5.W;
            } else {
                com.daaw.avee.comp.playback.c.k.a(Integer.valueOf(pv1.this.N()));
                o30 q0 = MainActivity.q0();
                if (q0 != null) {
                    pv1 pv1Var2 = pv1.this;
                    q0.k(pv1Var2.Q(pv1Var2.c));
                    q0.n(num2.intValue());
                }
                ko0 q = ko0.q();
                if (q != null) {
                    q.J(num2.intValue());
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class p implements ww1.a<Context, Integer> {
        public p() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            return Integer.valueOf(j5.e().K(context, "pref_alwaysQualityEdges", false) ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class p0 implements rw1.a<Integer, Boolean> {
        public p0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Boolean bool) {
            o30 q0;
            if (num.intValue() != j5.o || (q0 = MainActivity.q0()) == null) {
                return;
            }
            q0.j(bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class q implements ww1.a<Context, Integer> {
        public q() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            return Integer.valueOf(j5.e().K(context, "pref_enableNewestFeatures", true) ? 1 : 0);
        }
    }

    /* loaded from: classes.dex */
    public class q0 implements vw1.a<SurfaceHolder> {
        public q0() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public SurfaceHolder a() {
            return (SurfaceHolder) pv1.this.a.get();
        }
    }

    /* loaded from: classes.dex */
    public class r implements vw1.a<Boolean> {
        public r() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(j5.e().h(j5.o));
        }
    }

    /* loaded from: classes.dex */
    public class r0 implements sw1.a<Integer, Integer, Float> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o30 q0 = MainActivity.q0();
                if (q0 != null) {
                    pv1 pv1Var = pv1.this;
                    q0.l(pv1Var.Q(pv1Var.c));
                }
            }
        }

        public r0() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Integer num, Integer num2, Float f) {
            pv1.this.c = f.floatValue();
            pv1.this.f.post(new a());
        }
    }

    /* loaded from: classes.dex */
    public class s implements pw1.a {
        public s() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            Resources resources;
            int i;
            int k = j5.e().k(j5.L);
            int i2 = k == 1 ? 2 : k == 2 ? 3 : 1;
            j5.e().c0(j5.L, i2);
            Context b = dx0.b();
            if (b != null) {
                if (i2 == 1) {
                    resources = b.getResources();
                    i = R.string.video_scaling_fit;
                } else if (i2 == 2) {
                    resources = b.getResources();
                    i = R.string.video_scaling_crop;
                } else {
                    resources = b.getResources();
                    i = R.string.video_scaling_stretch;
                }
                vy.a.a(resources.getString(i));
            }
        }
    }

    /* loaded from: classes.dex */
    public class s0 implements qw1.a<VisualizerViewCore> {
        public s0() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(VisualizerViewCore visualizerViewCore) {
            pv1.this.b = new WeakReference(visualizerViewCore);
        }
    }

    /* loaded from: classes.dex */
    public class t implements vw1.a<Integer> {
        public t() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(j5.e().k(j5.L));
        }
    }

    /* loaded from: classes.dex */
    public class t0 implements xw1.a<com.daaw.avee.comp.playback.a, Integer, com.daaw.avee.comp.playback.a> {
        public t0() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a c(com.daaw.avee.comp.playback.a aVar, Integer num) {
            return pv1.this.P(num.intValue(), aVar);
        }
    }

    /* loaded from: classes.dex */
    public class u implements vw1.a<Integer> {
        public u() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(j5.e().k(j5.L));
        }
    }

    /* loaded from: classes.dex */
    public class u0 implements rw1.a<Float, Float> {
        public u0() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Float f, Float f2) {
            if (pv1.this.S()) {
                pv1.H(pv1.this, f.floatValue());
            }
            if (pv1.this.n.f(pv1.this.m) < 0.1f) {
                pv1.this.m.a = (pv1.this.k.nextFloat() * 2.0f) - 1.0f;
                pv1.this.m.b = (pv1.this.k.nextFloat() * 2.0f) - 1.0f;
                pv1.this.m.o();
            }
            tg0.b(pv1.this.n, pv1.this.n, pv1.this.m, 0.8999999761581421d);
        }
    }

    /* loaded from: classes.dex */
    public class v implements tw1.a<tx0, vd0, tx0.b, hx0> {
        public v() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(tx0 tx0Var, vd0 vd0Var, tx0.b bVar, hx0 hx0Var) {
        }
    }

    /* loaded from: classes.dex */
    public class v0 implements xw1.a<String, VisualizerViewCore, String> {
        public v0() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public String c(String str, VisualizerViewCore visualizerViewCore) {
            return str == null ? "" : pv1.this.L(str, visualizerViewCore);
        }
    }

    /* loaded from: classes.dex */
    public class w implements vw1.a<Float> {
        public w() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Float a() {
            pv1 pv1Var = pv1.this;
            return Float.valueOf(pv1Var.Q(pv1Var.c));
        }
    }

    /* loaded from: classes.dex */
    public class x implements pw1.a {
        public x() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            j5.e().d0(j5.I, j5.e().k(j5.I), true);
            j5.e().k0(j5.o);
            Context b = dx0.b();
            if (b != null) {
                vy.a.a(b.getResources().getString(j5.e().h(j5.o) ? R.string.switched_to_video : R.string.switched_to_visualizer));
            }
        }
    }

    /* loaded from: classes.dex */
    public class y implements qw1.a<SurfaceHolder> {
        public y() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(SurfaceHolder surfaceHolder) {
            pv1.this.a = new WeakReference(surfaceHolder);
            com.daaw.avee.comp.playback.c.l.a(surfaceHolder);
        }
    }

    /* loaded from: classes.dex */
    public class z implements pw1.a {
        public z() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            pv1.this.a = new WeakReference(null);
        }
    }

    public pv1() {
        boolean z2 = true;
        this.j = false;
        Context e2 = dx0.e();
        this.j = (e2 == null || !j5.e().K(e2, "pref_highQualityBlur", false)) ? false : false;
        SettingsActivity.s.b(new k(), this.e);
        MediaPlaybackService.h0.b(new v(), this.e);
        MediaPlaybackService.v0.b(new g0(), this.e);
        MediaPlaybackService.u0.b(new q0(), this.e);
        MediaPlaybackService.t0.b(new r0(), this.e);
        o30.w.b(new s0(), this.e);
        b5.d.b(new t0(), this.e);
        VisualizerViewCore.A.b(new u0(), this.e);
        VisualizerViewCore.u.b(new v0(), this.e);
        VisualizerViewCore.v.b(new a(), this.e);
        VisualizerViewCore.w.b(new b(), this.e);
        VisualizerViewCore.x.b(new c(), this.e);
        VisualizerViewCore.G.b(new d(), this.e);
        iv1.y.b(new e(), this.e);
        iv1.F.b(new f(), this.e);
        iv1.z.b(new g(), this.e);
        iv1.A.b(new h(), this.e);
        iv1.B.b(new i(), this.e);
        iv1.C.b(new j(), this.e);
        j5.i.b(new l(), this.e);
        VisualizerViewCore.y.b(new m(), this.e);
        VisualizerViewCore.z.b(new n(), this.e);
        VisualizerViewCore.J.b(new o(), this.e);
        b5.f.b(new p(), this.e);
        b5.h.b(new q(), this.e);
        o30.x.b(new r(), this.e);
        ko0.j0.b(new s(), this.e);
        o30.y.b(new t(), this.e);
        ko0.i0.b(new u(), this.e);
        o30.z.b(new w(), this.e);
        ko0.k0.b(new x(), this.e);
        o30.C.b(new y(), this.e);
        o30.D.b(new z(), this.e);
        MainActivity.p0.b(new a0(), this.e);
        o30.G.b(new b0(), this.e);
        o30.E.b(new c0(), this.e);
        o30.F.b(new d0(), this.e);
        o30.H.b(new e0(), this.e);
        ho.L.b(new f0(), this.e);
        ho.M.b(new h0(), this.e);
        ho.I.b(new i0(), this.e);
        ho.E.b(new j0(), this.e);
        ho.G.b(new k0(), this.e);
        ho.H.b(new l0(), this.e);
        ho.J.b(new m0(), this.e);
        ho.K.b(new n0(), this.e);
        j5.g.b(new o0(), this.e);
        j5.h.b(new p0(), this.e);
        MainActivity.L0.b(new xw1.a() { // from class: com.daaw.mv1
            @Override // com.daaw.xw1.a
            public final Object c(Object obj, Object obj2) {
                Boolean T;
                T = pv1.T((al) obj, (Integer) obj2);
                return T;
            }
        }, this.e);
    }

    public static /* synthetic */ float H(pv1 pv1Var, float f2) {
        float f3 = pv1Var.o + f2;
        pv1Var.o = f3;
        return f3;
    }

    public static int J(vn vnVar, List<Integer> list, int i2) {
        j5 e2 = j5.e();
        if (vnVar == null) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            if (!tv1.i().g(i3) && !list.contains(Integer.valueOf(i3))) {
                break;
            }
            i3++;
        }
        if (j5.j0(i3) < 0) {
            Context e3 = dx0.e();
            if (e3 != null) {
                vy.a.a(e3.getResources().getString(R.string.vis_error_duplicating));
            }
            return -1;
        }
        list.add(Integer.valueOf(i3));
        if (vnVar.h() < 0 && i2 > 0) {
            vnVar.q(i2);
        }
        e2.W(i3, vnVar, false);
        e2.f0(list);
        return i3;
    }

    public static void K(VisualizerViewCore visualizerViewCore, f61 f61Var, int i2, String str, vn vnVar, boolean z2) {
        if (vnVar == null) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh((vn) null);
                return;
            }
            return;
        }
        if (str.equals(vnVar.l())) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(vnVar);
            }
            if (f61Var == null) {
                return;
            }
        } else {
            lz1.c("visualizer customization, version mismatch");
            if (z2) {
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(vnVar);
                }
                if (f61Var == null) {
                    return;
                }
            } else {
                vnVar.t(str);
                j5.e().W(i2, vnVar, false);
                Context c2 = dx0.c();
                if (c2 != null) {
                    new AlertDialog.Builder(c2).setMessage(R.string.vis_customization_dialog_ver_mismatch).show();
                }
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(vnVar);
                }
                if (f61Var == null) {
                    return;
                }
            }
        }
        f61Var.t0(vnVar);
    }

    public static vn O(int i2, int[] iArr) {
        vn n2 = j5.e().n(i2, iArr);
        if (n2 == null) {
            n2 = tv1.i().b(i2);
            if (n2 == null) {
                return null;
            }
            if (iArr != null) {
                iArr[0] = j5.g(n2.o());
            }
        }
        return n2;
    }

    public static /* synthetic */ Boolean T(al alVar, Integer num) {
        qw1<al> qw1Var;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                qw1Var = o30.H;
            } else if (intValue != 3) {
                return Boolean.TRUE;
            } else {
                qw1Var = o30.B;
            }
            qw1Var.a(alVar);
        } else {
            iv1.d(alVar.a());
        }
        return Boolean.TRUE;
    }

    public static /* synthetic */ void V(VisualizerViewCore visualizerViewCore, final ho hoVar, final vn vnVar, final boolean z2, final int i2, VisualizerViewCore visualizerViewCore2) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.nv1
            @Override // java.lang.Runnable
            public final void run() {
                ho.this.x(vnVar, z2, i2);
            }
        });
    }

    public static /* synthetic */ void W(final VisualizerViewCore visualizerViewCore, final boolean z2, final int i2) {
        final ho k2 = ho.k();
        if (k2 != null) {
            final vn d2 = vn.d();
            visualizerViewCore.j(d2, new ht(), new com.daaw.e0() { // from class: com.daaw.lv1
                @Override // com.daaw.e0
                public final void a(Object obj) {
                    pv1.V(VisualizerViewCore.this, k2, d2, z2, i2, (VisualizerViewCore) obj);
                }
            });
        }
    }

    public static void Z(int i2) {
        j5.e().d0(j5.I, i2, true);
        j5.e().a0(j5.o, false);
    }

    public static void b0(final VisualizerViewCore visualizerViewCore, final boolean z2, final int i2) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.ov1
            @Override // java.lang.Runnable
            public final void run() {
                pv1.W(VisualizerViewCore.this, z2, i2);
            }
        });
    }

    public final String L(String str, VisualizerViewCore visualizerViewCore) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(32);
        StringBuilder sb2 = null;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '{') {
                if (sb2 != null) {
                    sb2 = null;
                } else {
                    sb2 = new StringBuilder(16);
                    sb2.append(charAt);
                }
            } else if (charAt == '}' && sb2 != null) {
                sb2.append(charAt);
                sb.append(M(sb2.toString(), visualizerViewCore));
                sb2 = null;
            }
            if (sb2 == null) {
                sb.append(charAt);
            }
            sb2.append(charAt);
        }
        return sb.toString();
    }

    public final String M(String str, VisualizerViewCore visualizerViewCore) {
        if ("{TimeCurrent}".equals(str)) {
            return br1.o((int) (b5.d() / 1000));
        }
        if ("{TimeRemaining}".equals(str)) {
            return br1.o((int) (Math.max(0L, b5.c() - b5.d()) / 1000));
        } else if ("{TimeLength}".equals(str)) {
            return br1.o((int) (b5.c() / 1000));
        } else {
            if ("{Artist}".equals(str)) {
                tx0.b bVar = ww0.d;
                return bVar.h() ? bVar.h : "";
            } else if ("{ArtistOrTitle}".equals(str)) {
                tx0.b bVar2 = ww0.d;
                return bVar2.h() ? bVar2.h : ww0.d.e;
            } else if ("{ArtistAndTitle}".equals(str)) {
                tx0.b bVar3 = ww0.d;
                if (!bVar3.h()) {
                    return "\n" + bVar3.e;
                }
                return bVar3.h + "\n" + bVar3.e;
            } else if ("{MarkedArtistAndTitle}".equals(str)) {
                tx0.b bVar4 = ww0.d;
                if (!bVar4.h()) {
                    return "Avee Player\n" + bVar4.e;
                }
                return "Avee Player\n" + bVar4.h + " - " + bVar4.e;
            } else if ("{Title}".equals(str)) {
                return ww0.d.e;
            } else {
                if ("{Album}".equals(str)) {
                    return ww0.d.f;
                }
                if ("{Fps}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().a();
                } else if ("{FrameTime}".equals(str)) {
                    return "" + visualizerViewCore.getFrameTimeMs();
                } else if ("{StatFlush}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().c();
                } else if ("{WaitResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().b();
                } else if ("{ResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().f();
                } else if ("{GradualResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().d();
                } else if ("{RTSwitch}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().e();
                } else {
                    return str;
                }
            }
        }
    }

    public final int N() {
        int k2 = j5.e().k(j5.L);
        return (k2 != 1 && k2 == 2) ? 2 : 1;
    }

    public final com.daaw.avee.comp.playback.a P(int i2, com.daaw.avee.comp.playback.a aVar) {
        j5 e2 = j5.e();
        a.g gVar = new a.g();
        gVar.e = e2.h(j5.A);
        gVar.g = -1L;
        gVar.a = 1;
        gVar.b = e2.k(j5.W);
        gVar.c = 0L;
        gVar.d = i2;
        return u.a(aVar, gVar, null);
    }

    public final float Q(float f2) {
        int k2 = j5.e().k(j5.L);
        if (k2 == 1) {
            return f2;
        }
        if (k2 == 2 || k2 == 3) {
            return 0.0f;
        }
        return f2;
    }

    public boolean R() {
        return this.j;
    }

    public boolean S() {
        return qv1.b0() || xw0.d;
    }

    public final void X(VisualizerViewCore visualizerViewCore, int i2, boolean z2, int[] iArr) {
        Y(visualizerViewCore, null, i2, z2, O(i2, iArr));
    }

    public final void Y(VisualizerViewCore visualizerViewCore, f61 f61Var, int i2, boolean z2, vn vnVar) {
        K(visualizerViewCore, f61Var, i2, tv1.c, vnVar, z2);
    }

    public final void a0(Integer num, boolean z2) {
        if (z2 || this.p != num.intValue()) {
            this.p = num.intValue();
            VisualizerViewCore visualizerViewCore = this.b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.q(3, num.intValue());
            }
        }
    }

    public final void e(int i2, List<String> list) {
        File[] listFiles = j5.a(i2).listFiles();
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < listFiles.length; i5++) {
            File file = listFiles[i5];
            if (".json".equals(cr1.k(file.getName()))) {
                i4 = i5;
            }
            if ("scene.json".equals(file.getName())) {
                i3 = i5;
            }
        }
        if (i3 == -1) {
            i3 = i4;
        }
        if (i3 >= 0) {
            listFiles[i3] = null;
        }
        for (int i6 = 0; i6 < listFiles.length; i6++) {
            File file2 = listFiles[i6];
            if (file2 != null) {
                for (String str : list) {
                    if (f(file2.getName(), str)) {
                        listFiles[i6] = null;
                    }
                }
            }
        }
        for (File file3 : listFiles) {
            if (file3 != null) {
                file3.delete();
            }
        }
    }

    public boolean f(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str.equals(cr1.h(str2, ':'));
    }

    public final void g(ho hoVar, int i2, int i3, Uri uri, String str, int i4) {
        String str2;
        if (i3 == 43) {
            if (this.h != null && this.i != null) {
                hoVar.t(this.g.get(), this.h, this.i, str);
                return;
            }
            str2 = "PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data";
        } else if (i3 != 44) {
            return;
        } else {
            if (this.h != null && this.i != null) {
                if ((i4 & 64) != 0 && uri != null) {
                    lz1.c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                    try {
                        hoVar.getActivity().getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Exception e2) {
                        qw1<String> qw1Var = vy.a;
                        qw1Var.a("Error TakePersistableUriPermission " + e2.getMessage());
                    }
                }
                try {
                    hoVar.t(this.g.get(), this.h, this.i, str);
                    return;
                } catch (Exception e3) {
                    qw1<String> qw1Var2 = vy.a;
                    qw1Var2.a("Error OnImagePropertyValuePicked " + e3.getMessage());
                    return;
                }
            }
            str2 = "PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data";
        }
        lz1.c(str2);
    }
}
