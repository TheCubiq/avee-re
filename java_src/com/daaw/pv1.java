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
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
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

    /* renamed from: u */
    public static ow1<C0729a, C0729a.C0736g, C0729a> f23313u = new ow1<>();

    /* renamed from: j */
    public boolean f23323j;

    /* renamed from: a */
    public volatile WeakReference<SurfaceHolder> f23314a = new WeakReference<>(null);

    /* renamed from: b */
    public WeakReference<VisualizerViewCore> f23315b = new WeakReference<>(null);

    /* renamed from: c */
    public volatile float f23316c = 1.0f;

    /* renamed from: d */
    public boolean f23317d = true;

    /* renamed from: e */
    public List<Object> f23318e = new LinkedList();

    /* renamed from: f */
    public Handler f23319f = new Handler();

    /* renamed from: g */
    public WeakReference<TextView> f23320g = new WeakReference<>(null);

    /* renamed from: h */
    public List<String> f23321h = null;

    /* renamed from: i */
    public String f23322i = null;

    /* renamed from: k */
    public final Random f23324k = new Random();

    /* renamed from: l */
    public Handler f23325l = new Handler();

    /* renamed from: m */
    public bs1 f23326m = new bs1(0.0f, 0.0f);

    /* renamed from: n */
    public bs1 f23327n = new bs1(0.0f, 0.0f);

    /* renamed from: o */
    public float f23328o = 0.0f;

    /* renamed from: p */
    public int f23329p = -1;

    /* renamed from: q */
    public final p80 f23330q = new p80(p80.f22684f);

    /* renamed from: r */
    public final p80 f23331r = new p80(p80.f22685g);

    /* renamed from: s */
    public HashMap<Integer, Bitmap> f23332s = new HashMap<>();

    /* renamed from: t */
    public z31 f23333t = new z31();

    /* renamed from: com.daaw.pv1$a */
    /* loaded from: classes.dex */
    public class C2592a implements zw1.InterfaceC3912a<String, bs1, bs1, bq0, de0, bs1> {
        public C2592a() {
        }

        @Override // com.daaw.zw1.InterfaceC3912a
        /* renamed from: b */
        public bs1 mo1823a(String str, bs1 bs1Var, bs1 bs1Var2, bq0 bq0Var, de0 de0Var) {
            float mo2887d = de0Var.mo2887d();
            float mo2884g = de0Var.mo2884g();
            if (str != null && str.length() >= 1) {
                float f = 0.0f;
                bs1 bs1Var3 = bs1Var2 == null ? new bs1(0.0f, 0.0f) : bs1Var2;
                if ("Nothing".equals(str)) {
                    return new bs1(0.0f, 0.0f);
                }
                if ("Constant".equals(str)) {
                    return new bs1(bs1Var.f5090a, bs1Var.f5091b);
                }
                if ("IsPlaying".equals(str)) {
                    return pv1.this.m13098S() ? new bs1(1.0f, 1.0f) : new bs1(0.0f, 0.0f);
                } else if (str.equals("Beat")) {
                    float f2 = bq0Var.f5036a;
                    return new bs1(bs1Var.f5090a * f2, f2 * bs1Var.f5091b);
                } else {
                    float f3 = 0.5f;
                    if (str.equals("BeatCamShakeMore")) {
                        float max = Math.max(Math.min(pv1.this.m13098S() ? bq0Var.f5036a * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f4 = max * max;
                        bs1 m13598a = pv1.this.f23331r.m13598a((((mo2884g * 0.5f) * max) * bs1Var.f5091b) % 1.0f);
                        m13598a.f5090a = (m13598a.f5090a - 0.5f) * bs1Var.f5090a * f4 * 0.06f;
                        m13598a.f5091b = (m13598a.f5091b - 0.5f) * bs1Var.f5090a * f4 * 0.06f;
                        tg0.m9184b(m13598a, bs1Var3, m13598a, 0.800000011920929d);
                        return m13598a;
                    } else if (str.equals("BeatCamShakeLess")) {
                        float max2 = Math.max(Math.min(pv1.this.m13098S() ? bq0Var.f5036a * 2.5f : 0.0f, 1.0f), 0.0f);
                        float f5 = max2 * max2;
                        bs1 m13598a2 = pv1.this.f23330q.m13598a((((mo2884g * 0.5f) * max2) * bs1Var.f5091b) % 1.0f);
                        m13598a2.f5090a = (m13598a2.f5090a - 0.5f) * bs1Var.f5090a * f5 * 0.06f;
                        m13598a2.f5091b = (m13598a2.f5091b - 0.5f) * bs1Var.f5090a * f5 * 0.06f;
                        tg0.m9184b(m13598a2, bs1Var3, m13598a2, 0.800000011920929d);
                        return m13598a2;
                    } else if (str.equals("TotalTime")) {
                        return new bs1((bs1Var.f5090a * mo2884g) % 1.0f, (mo2884g * bs1Var.f5091b) % 1.0f);
                    } else {
                        if (str.equals("TotalTimeBackward")) {
                            return new bs1(1.0f - ((bs1Var.f5090a * mo2884g) % 1.0f), 1.0f - ((mo2884g * bs1Var.f5091b) % 1.0f));
                        }
                        if (str.equals("TotalTimeWhenPlaying")) {
                            return new bs1((pv1.this.f23328o * bs1Var.f5090a) % 1.0f, (pv1.this.f23328o * bs1Var.f5091b) % 1.0f);
                        }
                        if (str.equals("ConstantShakeMore")) {
                            bs1 m13598a3 = pv1.this.f23331r.m13598a(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            m13598a3.f5090a = (m13598a3.f5090a - 0.5f) * bs1Var.f5090a * 0.06f;
                            m13598a3.f5091b = (m13598a3.f5091b - 0.5f) * bs1Var.f5090a * 0.06f;
                            tg0.m9184b(m13598a3, bs1Var3, m13598a3, 0.10000000149011612d);
                            return m13598a3;
                        } else if (str.equals("ConstantShake")) {
                            bs1 m13598a4 = pv1.this.f23330q.m13598a(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            m13598a4.f5090a = (m13598a4.f5090a - 0.5f) * bs1Var.f5090a * 0.06f;
                            m13598a4.f5091b = (m13598a4.f5091b - 0.5f) * bs1Var.f5090a * 0.06f;
                            tg0.m9184b(m13598a4, bs1Var3, m13598a4, 0.10000000149011612d);
                            return m13598a4;
                        } else if (str.equals("BeatRandomShake")) {
                            float max3 = Math.max(Math.min(pv1.this.m13098S() ? bq0Var.f5036a * 2.5f : 0.0f, 1.0f), 0.0f);
                            float f6 = max3 * max3 * max3;
                            return new bs1(pv1.this.f23327n.f5090a * f6 * bs1Var.f5090a * 0.025f, pv1.this.f23327n.f5091b * f6 * bs1Var.f5090a * 0.025f);
                        } else if (str.equals("TrackPosition")) {
                            float max4 = Math.max(Math.min(((float) C0812b5.m26490d()) / ((float) C0812b5.m26491c()), 1.0f), 0.0f);
                            return new bs1(bs1Var.f5090a * max4, max4 * bs1Var.f5091b);
                        } else if (str.equals("TotalTimeAndBeat")) {
                            float f7 = bs1Var3.f5090a;
                            if (pv1.this.m13098S()) {
                                f7 = f7 + (mo2887d * bs1Var.f5090a * 1.0f) + (bq0Var.f5036a * bs1Var.f5091b * 0.1f);
                            }
                            return new bs1(f7, f7);
                        } else if (str.equals("ConstantShakeRotMore")) {
                            double m13597b = pv1.this.f23331r.m13597b(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            Double.isNaN(m13597b);
                            float m9185a = tg0.m9185a(bs1Var3.f5090a, ((float) (m13597b / 6.283185307179586d)) * bs1Var.f5090a * 0.5f, 0.10000000149011612d);
                            return new bs1(m9185a, m9185a);
                        } else if (str.equals("ConstantShakeRotLess")) {
                            double m13597b2 = pv1.this.f23330q.m13597b(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            Double.isNaN(m13597b2);
                            float m9185a2 = tg0.m9185a(bs1Var3.f5090a, ((float) (m13597b2 / 6.283185307179586d)) * bs1Var.f5090a * 0.5f, 0.10000000149011612d);
                            return new bs1(m9185a2, m9185a2);
                        } else if (str.equals("BeatCamShakeRotMore")) {
                            float max5 = Math.max(Math.min(pv1.this.m13098S() ? bq0Var.f5036a * 2.5f : 0.0f, 1.0f), 0.0f);
                            double m13597b3 = pv1.this.f23331r.m13597b(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            Double.isNaN(m13597b3);
                            float m9185a3 = tg0.m9185a(bs1Var3.f5090a, ((float) (m13597b3 / 6.283185307179586d)) * bs1Var.f5090a * 0.5f * max5 * max5, 0.800000011920929d);
                            return new bs1(m9185a3, m9185a3);
                        } else if (str.equals("BeatCamShakeRotLess")) {
                            float max6 = Math.max(Math.min(pv1.this.m13098S() ? bq0Var.f5036a * 2.5f : 0.0f, 1.0f), 0.0f);
                            double m13597b4 = pv1.this.f23330q.m13597b(((mo2884g * 0.5f) * bs1Var.f5091b) % 1.0f);
                            Double.isNaN(m13597b4);
                            float m9185a4 = tg0.m9185a(bs1Var3.f5090a, ((float) (m13597b4 / 6.283185307179586d)) * bs1Var.f5090a * 0.5f * max6 * max6, 0.800000011920929d);
                            return new bs1(m9185a4, m9185a4);
                        } else if (str.equals("PeakBarIndex")) {
                            float m9185a5 = tg0.m9185a(bq0Var.f5037b, bs1Var3.f5090a, bs1Var.f5091b);
                            float f8 = bs1Var.f5090a;
                            return new bs1(m9185a5 * f8, m9185a5 * f8);
                        } else if (str.equals("BeatTriggerAnim")) {
                            if (pv1.this.m13098S() && bq0Var.f5036a > bs1Var.f5090a && bs1Var3.f5091b >= 1.9999999f) {
                                bs1Var3.f5090a = 0.0f;
                                bs1Var3.f5091b = 0.0f;
                            }
                            float f9 = bs1Var3.f5090a;
                            float f10 = bs1Var.f5091b;
                            float f11 = f9 + (mo2887d * f10);
                            if (f11 >= 0.4999999f) {
                                f = bs1Var3.f5091b + (mo2887d * f10);
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
            return new bs1(bs1Var.f5090a, bs1Var.f5091b);
        }
    }

    /* renamed from: com.daaw.pv1$a0 */
    /* loaded from: classes.dex */
    public class C2593a0 implements rw1.InterfaceC2894a<Integer, Activity> {
        public C2593a0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Activity activity) {
            boolean z;
            boolean m18922h;
            o30 m26904q0;
            if (num.intValue() == 2) {
                z = true;
                pv1.this.f23317d = true;
                m18922h = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o);
                m26904q0 = MainActivity.m26904q0();
                if (m26904q0 == null) {
                    return;
                }
            } else {
                z = false;
                pv1.this.f23317d = false;
                m18922h = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o);
                m26904q0 = MainActivity.m26904q0();
                if (m26904q0 == null) {
                    return;
                }
            }
            m26904q0.m14586m(z, m18922h);
        }
    }

    /* renamed from: com.daaw.pv1$b */
    /* loaded from: classes.dex */
    public class C2594b implements vw1.InterfaceC3381a<C1652i2> {
        public C2594b() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public C1652i2 mo3126a() {
            tx0.C3143b c3143b = ww0.f31597d;
            if (c3143b == tx0.f28188h) {
                return null;
            }
            return new C1652i2(c3143b.f28203a, c3143b.m8729d(), c3143b.m8731b());
        }
    }

    /* renamed from: com.daaw.pv1$b0 */
    /* loaded from: classes.dex */
    public class C2595b0 implements qw1.InterfaceC2788a<Boolean> {
        public C2595b0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            pv1.this.f23317d = bool.booleanValue();
        }
    }

    /* renamed from: com.daaw.pv1$c */
    /* loaded from: classes.dex */
    public class C2596c implements rw1.InterfaceC2894a<af0, C1496h2> {

        /* renamed from: com.daaw.pv1$c$a */
        /* loaded from: classes.dex */
        public class C2597a implements af0 {

            /* renamed from: a */
            public Object f23339a;

            /* renamed from: b */
            public final /* synthetic */ af0 f23340b;

            /* renamed from: com.daaw.pv1$c$a$a */
            /* loaded from: classes.dex */
            public class RunnableC2598a implements Runnable {

                /* renamed from: p */
                public final /* synthetic */ df0 f23342p;

                /* renamed from: q */
                public final /* synthetic */ String f23343q;

                /* renamed from: r */
                public final /* synthetic */ String f23344r;

                public RunnableC2598a(df0 df0Var, String str, String str2) {
                    this.f23342p = df0Var;
                    this.f23343q = str;
                    this.f23344r = str2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    C2597a.this.f23340b.mo5907b(this.f23342p, this.f23343q, this.f23344r);
                }
            }

            public C2597a(af0 af0Var) {
                this.f23340b = af0Var;
            }

            @Override // com.daaw.af0
            /* renamed from: a */
            public void mo5908a(Object obj) {
                this.f23339a = obj;
            }

            @Override // com.daaw.af0
            /* renamed from: b */
            public void mo5907b(df0 df0Var, String str, String str2) {
                VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.f23315b.get();
                if (visualizerViewCore != null) {
                    visualizerViewCore.queueEvent(new RunnableC2598a(df0Var, str, str2));
                }
            }
        }

        public C2596c() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(af0 af0Var, C1496h2 c1496h2) {
            C2597a c2597a = new C2597a(af0Var);
            af0Var.mo5908a(c2597a);
            new C1354g2().m22067v(false, c1496h2.f13192a, c1496h2.f13193b, c1496h2.f13194c, c2597a, c1496h2.f11958d, c1496h2.f11959e, c1496h2.f11962h, c1496h2.f11963i, false, c1496h2.f11965k, Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I)));
        }
    }

    /* renamed from: com.daaw.pv1$c0 */
    /* loaded from: classes.dex */
    public class C2599c0 implements vw1.InterfaceC3381a<Boolean> {
        public C2599c0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(pv1.this.f23317d);
        }
    }

    /* renamed from: com.daaw.pv1$d */
    /* loaded from: classes.dex */
    public class C2600d implements ww1.InterfaceC3477a<Integer, Integer> {
        public C2600d() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Integer num) {
            return Integer.valueOf((int) TypedValue.applyDimension(1, Integer.valueOf(num.intValue() / 2).intValue(), dx0.m23837e().getResources().getDisplayMetrics()));
        }
    }

    /* renamed from: com.daaw.pv1$d0 */
    /* loaded from: classes.dex */
    public class C2601d0 implements pw1.InterfaceC2649a {
        public C2601d0() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            int i;
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 == null || (i = m26903r0.f3735N) != 2) {
                return;
            }
            m26903r0.m26936P0(i);
        }
    }

    /* renamed from: com.daaw.pv1$e */
    /* loaded from: classes.dex */
    public class C2602e implements ww1.InterfaceC3477a<List<sv1>, lo1<Integer, List<Integer>>> {
        public C2602e() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public lo1<Integer, List<Integer>> mo5751b(List<sv1> list) {
            List<lo1<sv1, Object>> m8774f = tv1.m8771i().m8774f();
            ArrayList arrayList = new ArrayList(m8774f.size());
            for (lo1<sv1, Object> lo1Var : m8774f) {
                arrayList.add(Integer.valueOf(lo1Var.f17576a.f26665a));
            }
            List<Integer> m18911o = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18911o();
            ArrayList<Integer> arrayList2 = new ArrayList(m8774f.size() + m18911o.size());
            for (lo1<sv1, Object> lo1Var2 : m8774f) {
                arrayList2.add(Integer.valueOf(lo1Var2.f17576a.f26665a));
            }
            for (Integer num : m18911o) {
                if (!arrayList.contains(num)) {
                    arrayList2.add(num);
                }
            }
            for (Integer num2 : arrayList2) {
                list.add(new sv1(num2.intValue(), tv1.m8771i().m8773g(num2.intValue())));
            }
            return new lo1<>(Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I)), arrayList2);
        }
    }

    /* renamed from: com.daaw.pv1$e0 */
    /* loaded from: classes.dex */
    public class C2603e0 implements qw1.InterfaceC2788a<C0645al> {

        /* renamed from: com.daaw.pv1$e0$a */
        /* loaded from: classes.dex */
        public class RunnableC2604a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ VisualizerViewCore f23351p;

            /* renamed from: q */
            public final /* synthetic */ C1469gt f23352q;

            /* renamed from: r */
            public final /* synthetic */ C0645al f23353r;

            /* renamed from: com.daaw.pv1$e0$a$a */
            /* loaded from: classes.dex */
            public class RunnableC2605a implements Runnable {

                /* renamed from: p */
                public final /* synthetic */ int f23355p;

                /* renamed from: q */
                public final /* synthetic */ C3355vn f23356q;

                public RunnableC2605a(int i, C3355vn c3355vn) {
                    this.f23355p = i;
                    this.f23356q = c3355vn;
                }

                @Override // java.lang.Runnable
                public void run() {
                    FragmentManager m27376c;
                    RunnableC2604a runnableC2604a = RunnableC2604a.this;
                    pv1.this.m13084e(this.f23355p, runnableC2604a.f23352q.m21242b());
                    Activity m27378a = RunnableC2604a.this.f23353r.m27378a();
                    if (m27378a == null || m27378a.isFinishing() || (m27376c = RunnableC2604a.this.f23353r.m27376c()) == null || DialogFragmentC1593ho.m20591o(m27376c)) {
                        return;
                    }
                    DialogFragmentC1593ho.m20596j(RunnableC2604a.this.f23353r, Integer.valueOf(this.f23355p), this.f23356q, C3595xv.f32971b);
                }
            }

            public RunnableC2604a(VisualizerViewCore visualizerViewCore, C1469gt c1469gt, C0645al c0645al) {
                this.f23351p = visualizerViewCore;
                this.f23352q = c1469gt;
                this.f23353r = c0645al;
            }

            @Override // java.lang.Runnable
            public void run() {
                int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I);
                C3355vn m7016d = C3355vn.m7016d();
                this.f23351p.m26845i(m7016d, this.f23352q);
                this.f23351p.post(new RunnableC2605a(m18916k, m7016d));
            }
        }

        public C2603e0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            C1469gt c1469gt = new C1469gt();
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.f23315b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.queueEvent(new RunnableC2604a(visualizerViewCore, c1469gt, c0645al));
            }
        }
    }

    /* renamed from: com.daaw.pv1$f */
    /* loaded from: classes.dex */
    public class C2606f implements ww1.InterfaceC3477a<List<sv1>, ir1<List<Bitmap>>> {

        /* renamed from: com.daaw.pv1$f$a */
        /* loaded from: classes.dex */
        public class C2607a implements ir1.InterfaceC1751c<List<Bitmap>> {

            /* renamed from: a */
            public final /* synthetic */ List f23359a;

            public C2607a(List list) {
                this.f23359a = list;
            }

            @Override // com.daaw.ir1.InterfaceC1751c
            /* renamed from: b */
            public List<Bitmap> mo9328a(ir1<List<Bitmap>> ir1Var) {
                ArrayList arrayList = new ArrayList(this.f23359a.size());
                int[] iArr = new int[1];
                HashMap<Integer, Bitmap> hashMap = new HashMap<>(this.f23359a.size());
                f61 m8775e = tv1.m8771i().m8775e(0, false, "");
                for (int i = 0; i < this.f23359a.size(); i++) {
                    int i2 = ((sv1) this.f23359a.get(i)).f26665a;
                    C3355vn m13102O = pv1.m13102O(i2, iArr);
                    Bitmap bitmap = pv1.this.f23332s.get(Integer.valueOf(iArr[0]));
                    if (bitmap == null || iArr[0] == 0) {
                        Bitmap createBitmap = Bitmap.createBitmap(192, 192, Bitmap.Config.ARGB_8888);
                        pv1.this.m13092Y(null, m8775e, i2, true, m13102O);
                        if (m8775e != null) {
                            pv1.this.f23333t.m2878m();
                            pv1.this.f23333t.m2877n(createBitmap);
                            for (int i3 = 0; i3 < 1; i3++) {
                                m8775e.mo2435y(pv1.this.f23333t, null, null);
                            }
                            m8775e.mo7700G(pv1.this.f23333t, null);
                        }
                        bitmap = createBitmap;
                    }
                    hashMap.put(Integer.valueOf(iArr[0]), bitmap);
                    arrayList.add(bitmap);
                }
                pv1.this.f23332s = hashMap;
                return arrayList;
            }
        }

        public C2606f() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public ir1<List<Bitmap>> mo5751b(List<sv1> list) {
            return new ir1<>(new C2607a(list));
        }
    }

    /* renamed from: com.daaw.pv1$f0 */
    /* loaded from: classes.dex */
    public class C2608f0 implements pw1.InterfaceC2649a {
        public C2608f0() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            int i;
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 == null || (i = m26903r0.f3735N) != 2) {
                return;
            }
            m26903r0.m26938N0(false, i);
        }
    }

    /* renamed from: com.daaw.pv1$g */
    /* loaded from: classes.dex */
    public class C2609g implements qw1.InterfaceC2788a<sv1> {
        public C2609g() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(sv1 sv1Var) {
            pv1.m13091Z(sv1Var.f26665a);
        }
    }

    /* renamed from: com.daaw.pv1$g0 */
    /* loaded from: classes.dex */
    public class C2610g0 implements vw1.InterfaceC3381a<Integer> {
        public C2610g0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(pv1.this.m13103N());
        }
    }

    /* renamed from: com.daaw.pv1$h */
    /* loaded from: classes.dex */
    public class C2611h implements qw1.InterfaceC2788a<sv1> {
        public C2611h() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(sv1 sv1Var) {
            if (sv1Var == null) {
                return;
            }
            C3385vy.f30703a.m12018a(dx0.m23840b().getResources().getString(R.string.hold_to_remove_vis));
        }
    }

    /* renamed from: com.daaw.pv1$h0 */
    /* loaded from: classes.dex */
    public class C2612h0 implements pw1.InterfaceC2649a {
        public C2612h0() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            int i;
            MainActivity m26903r0 = MainActivity.m26903r0();
            if (m26903r0 != null && (i = m26903r0.f3735N) == 2) {
                m26903r0.m26938N0(true, i);
            }
            pv1.this.m13089a0(-1, false);
        }
    }

    /* renamed from: com.daaw.pv1$i */
    /* loaded from: classes.dex */
    public class C2613i implements qw1.InterfaceC2788a<sv1> {
        public C2613i() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(sv1 sv1Var) {
            if (sv1Var == null) {
                return;
            }
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
            List<Integer> m18911o = m18928e.m18911o();
            m18911o.remove(Integer.valueOf(sv1Var.f26665a));
            m18928e.m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I);
            m18928e.m18925f0(m18911o);
        }
    }

    /* renamed from: com.daaw.pv1$i0 */
    /* loaded from: classes.dex */
    public class C2614i0 implements sw1.InterfaceC2987a<Integer, Integer, Boolean> {
        public C2614i0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Boolean bool) {
            pv1.this.m13089a0(num2, bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.pv1$j */
    /* loaded from: classes.dex */
    public class C2615j implements rw1.InterfaceC2894a<sv1, List<Integer>> {
        public C2615j() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(sv1 sv1Var, List<Integer> list) {
            if (sv1Var == null) {
                return;
            }
            pv1.m13107J(pv1.m13102O(sv1Var.f26665a, null), list, sv1Var.f26665a);
        }
    }

    /* renamed from: com.daaw.pv1$j0 */
    /* loaded from: classes.dex */
    public class C2616j0 implements sw1.InterfaceC2987a<C0645al, Integer, C3355vn> {
        public C2616j0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(C0645al c0645al, Integer num, C3355vn c3355vn) {
            tv1 m8771i;
            int m7012h;
            if (tv1.m8771i().m8773g(num.intValue())) {
                m8771i = tv1.m8771i();
                m7012h = num.intValue();
            } else {
                m8771i = tv1.m8771i();
                m7012h = c3355vn.m7012h();
            }
            C3355vn m8778b = m8771i.m8778b(m7012h);
            if (m8778b == null) {
                lz1.m16363c("Can't reset visualizer basedOnTemplate not valid");
            } else {
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18940W(num.intValue(), m8778b, true);
            }
        }
    }

    /* renamed from: com.daaw.pv1$k */
    /* loaded from: classes.dex */
    public class C2617k implements qw1.InterfaceC2788a<Boolean> {
        public C2617k() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(Boolean bool) {
            pv1.this.f23323j = bool.booleanValue();
        }
    }

    /* renamed from: com.daaw.pv1$k0 */
    /* loaded from: classes.dex */
    public class C2618k0 implements tw1.InterfaceC3140a<Integer, C3355vn, Integer, rw1<Integer, C3355vn>> {

        /* renamed from: com.daaw.pv1$k0$a */
        /* loaded from: classes.dex */
        public class C2619a implements InterfaceC1153e0<VisualizerViewCore> {

            /* renamed from: a */
            public final /* synthetic */ rw1 f23372a;

            public C2619a(rw1 rw1Var) {
                this.f23372a = rw1Var;
            }

            @Override // com.daaw.InterfaceC1153e0
            /* renamed from: b */
            public void mo7884a(VisualizerViewCore visualizerViewCore) {
                if (this.f23372a != null) {
                    pv1.m13087b0(visualizerViewCore, false, -1);
                }
            }
        }

        public C2618k0() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Integer num, C3355vn c3355vn, Integer num2, rw1<Integer, C3355vn> rw1Var) {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.f23315b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.m26839o(c3355vn, new C2619a(rw1Var));
            }
        }
    }

    /* renamed from: com.daaw.pv1$l */
    /* loaded from: classes.dex */
    public class C2620l implements sw1.InterfaceC2987a<Integer, String, Boolean> {
        public C2620l() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, String str, Boolean bool) {
            VisualizerViewCore visualizerViewCore;
            if (num.equals(Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14326u0))) {
                iv1 m19334e = iv1.m19334e();
                if (m19334e != null) {
                    m19334e.m19332g();
                }
            } else if (num.intValue() < SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14322s0 || num.intValue() > SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14324t0 || SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18917j0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I)) != num.intValue() || (visualizerViewCore = (VisualizerViewCore) pv1.this.f23315b.get()) == null) {
            } else {
                visualizerViewCore.m26842l();
            }
        }
    }

    /* renamed from: com.daaw.pv1$l0 */
    /* loaded from: classes.dex */
    public class C2621l0 implements sw1.InterfaceC2987a<Integer, C3355vn, Integer> {
        public C2621l0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, C3355vn c3355vn, Integer num2) {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18940W(num.intValue(), c3355vn, false);
        }
    }

    /* renamed from: com.daaw.pv1$m */
    /* loaded from: classes.dex */
    public class C2622m implements vw1.InterfaceC3381a<C3355vn> {
        public C2622m() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public C3355vn mo3126a() {
            return pv1.m13102O(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I), null);
        }
    }

    /* renamed from: com.daaw.pv1$m0 */
    /* loaded from: classes.dex */
    public class C2623m0 implements uw1.InterfaceC3263a<Fragment, TextView, List<String>, String, String> {
        public C2623m0() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Fragment fragment, TextView textView, List<String> list, String str, String str2) {
            if (fragment.getActivity() == null || fragment.getActivity().isFinishing()) {
                return;
            }
            pv1.this.f23320g = new WeakReference(textView);
            pv1.this.f23321h = list;
            pv1.this.f23322i = str;
            Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("image/*");
            intent.setFlags(1);
            fragment.startActivityForResult(intent, 44);
        }
    }

    /* renamed from: com.daaw.pv1$n */
    /* loaded from: classes.dex */
    public class C2624n implements pw1.InterfaceC2649a {
        public C2624n() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            VisualizerViewCore visualizerViewCore = (VisualizerViewCore) pv1.this.f23315b.get();
            if (visualizerViewCore != null) {
                pv1.m13087b0(visualizerViewCore, false, -1);
            }
        }
    }

    /* renamed from: com.daaw.pv1$n0 */
    /* loaded from: classes.dex */
    public class C2625n0 implements sw1.InterfaceC2987a<DialogFragmentC1593ho, Integer, Intent> {
        public C2625n0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(DialogFragmentC1593ho dialogFragmentC1593ho, Integer num, Intent intent) {
            String str;
            if (dialogFragmentC1593ho == null) {
                return;
            }
            if (num.intValue() == 43 || num.intValue() == 44) {
                int i = dialogFragmentC1593ho.f12728z;
                if (intent == null) {
                    str = "Data is null";
                } else {
                    Uri data = intent.getData();
                    if (data != null) {
                        File m18936a = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(i);
                        InputStream inputStream = null;
                        try {
                            inputStream = dialogFragmentC1593ho.getActivity().getContentResolver().openInputStream(data);
                        } catch (FileNotFoundException e) {
                            e.printStackTrace();
                        }
                        File m18934b = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18934b(m18936a, inputStream, cr1.m25072h(data.getPath(), ':'));
                        if (m18934b == null) {
                            lz1.m16363c("Copy to local folder failed");
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
                        pv1Var.m13082g(dialogFragmentC1593ho, i, intValue, null, "local:" + m18934b.getName(), 0);
                        return;
                    }
                    str = "originalUri is null";
                }
                lz1.m16363c(str);
            }
        }
    }

    /* renamed from: com.daaw.pv1$o */
    /* loaded from: classes.dex */
    public class C2626o implements ww1.InterfaceC3477a<Context, om1> {
        public C2626o() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public om1 mo5751b(Context context) {
            om1 om1Var = new om1();
            om1Var.f21651a = (float) C0812b5.m26490d();
            float m26491c = (float) C0812b5.m26491c();
            om1Var.f21652b = m26491c;
            float min = Math.min(om1Var.f21651a / m26491c, 1.0f);
            om1Var.f21653c = min;
            om1Var.f21653c = Math.max(min, 0.0f);
            return om1Var;
        }
    }

    /* renamed from: com.daaw.pv1$o0 */
    /* loaded from: classes.dex */
    public class C2627o0 implements sw1.InterfaceC2987a<Integer, Integer, Boolean> {
        public C2627o0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Boolean bool) {
            if (num.intValue() == SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I && bool.booleanValue()) {
                int intValue = num2.intValue();
                pv1 pv1Var = pv1.this;
                pv1Var.m13093X((VisualizerViewCore) pv1Var.f23315b.get(), intValue, false, null);
            } else if (num.intValue() != SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L) {
                num.intValue();
                int i = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14287W;
            } else {
                C0743c.f4017k.m19309a(Integer.valueOf(pv1.this.m13103N()));
                o30 m26904q0 = MainActivity.m26904q0();
                if (m26904q0 != null) {
                    pv1 pv1Var2 = pv1.this;
                    m26904q0.m14588k(pv1Var2.m13100Q(pv1Var2.f23316c));
                    m26904q0.m14585n(num2.intValue());
                }
                ko0 m17610q = ko0.m17610q();
                if (m17610q != null) {
                    m17610q.m17627J(num2.intValue());
                }
            }
        }
    }

    /* renamed from: com.daaw.pv1$p */
    /* loaded from: classes.dex */
    public class C2628p implements ww1.InterfaceC3477a<Context, Integer> {
        public C2628p() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            return Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(context, "pref_alwaysQualityEdges", false) ? 1 : 0);
        }
    }

    /* renamed from: com.daaw.pv1$p0 */
    /* loaded from: classes.dex */
    public class C2629p0 implements rw1.InterfaceC2894a<Integer, Boolean> {
        public C2629p0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Boolean bool) {
            o30 m26904q0;
            if (num.intValue() != SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o || (m26904q0 = MainActivity.m26904q0()) == null) {
                return;
            }
            m26904q0.m14589j(bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.pv1$q */
    /* loaded from: classes.dex */
    public class C2630q implements ww1.InterfaceC3477a<Context, Integer> {
        public C2630q() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            return Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(context, "pref_enableNewestFeatures", true) ? 1 : 0);
        }
    }

    /* renamed from: com.daaw.pv1$q0 */
    /* loaded from: classes.dex */
    public class C2631q0 implements vw1.InterfaceC3381a<SurfaceHolder> {
        public C2631q0() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public SurfaceHolder mo3126a() {
            return (SurfaceHolder) pv1.this.f23314a.get();
        }
    }

    /* renamed from: com.daaw.pv1$r */
    /* loaded from: classes.dex */
    public class C2632r implements vw1.InterfaceC3381a<Boolean> {
        public C2632r() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o));
        }
    }

    /* renamed from: com.daaw.pv1$r0 */
    /* loaded from: classes.dex */
    public class C2633r0 implements sw1.InterfaceC2987a<Integer, Integer, Float> {

        /* renamed from: com.daaw.pv1$r0$a */
        /* loaded from: classes.dex */
        public class RunnableC2634a implements Runnable {
            public RunnableC2634a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                o30 m26904q0 = MainActivity.m26904q0();
                if (m26904q0 != null) {
                    pv1 pv1Var = pv1.this;
                    m26904q0.m14587l(pv1Var.m13100Q(pv1Var.f23316c));
                }
            }
        }

        public C2633r0() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Integer num, Integer num2, Float f) {
            pv1.this.f23316c = f.floatValue();
            pv1.this.f23319f.post(new RunnableC2634a());
        }
    }

    /* renamed from: com.daaw.pv1$s */
    /* loaded from: classes.dex */
    public class C2635s implements pw1.InterfaceC2649a {
        public C2635s() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            Resources resources;
            int i;
            int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L);
            int i2 = m18916k == 1 ? 2 : m18916k == 2 ? 3 : 1;
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L, i2);
            Context m23840b = dx0.m23840b();
            if (m23840b != null) {
                if (i2 == 1) {
                    resources = m23840b.getResources();
                    i = R.string.video_scaling_fit;
                } else if (i2 == 2) {
                    resources = m23840b.getResources();
                    i = R.string.video_scaling_crop;
                } else {
                    resources = m23840b.getResources();
                    i = R.string.video_scaling_stretch;
                }
                C3385vy.f30703a.m12018a(resources.getString(i));
            }
        }
    }

    /* renamed from: com.daaw.pv1$s0 */
    /* loaded from: classes.dex */
    public class C2636s0 implements qw1.InterfaceC2788a<VisualizerViewCore> {
        public C2636s0() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(VisualizerViewCore visualizerViewCore) {
            pv1.this.f23315b = new WeakReference(visualizerViewCore);
        }
    }

    /* renamed from: com.daaw.pv1$t */
    /* loaded from: classes.dex */
    public class C2637t implements vw1.InterfaceC3381a<Integer> {
        public C2637t() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L));
        }
    }

    /* renamed from: com.daaw.pv1$t0 */
    /* loaded from: classes.dex */
    public class C2638t0 implements xw1.InterfaceC3648a<C0729a, Integer, C0729a> {
        public C2638t0() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public C0729a mo4423c(C0729a c0729a, Integer num) {
            return pv1.this.m13101P(num.intValue(), c0729a);
        }
    }

    /* renamed from: com.daaw.pv1$u */
    /* loaded from: classes.dex */
    public class C2639u implements vw1.InterfaceC3381a<Integer> {
        public C2639u() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L));
        }
    }

    /* renamed from: com.daaw.pv1$u0 */
    /* loaded from: classes.dex */
    public class C2640u0 implements rw1.InterfaceC2894a<Float, Float> {
        public C2640u0() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Float f, Float f2) {
            if (pv1.this.m13098S()) {
                pv1.m13109H(pv1.this, f.floatValue());
            }
            if (pv1.this.f23327n.m25857f(pv1.this.f23326m) < 0.1f) {
                pv1.this.f23326m.f5090a = (pv1.this.f23324k.nextFloat() * 2.0f) - 1.0f;
                pv1.this.f23326m.f5091b = (pv1.this.f23324k.nextFloat() * 2.0f) - 1.0f;
                pv1.this.f23326m.m25848o();
            }
            tg0.m9184b(pv1.this.f23327n, pv1.this.f23327n, pv1.this.f23326m, 0.8999999761581421d);
        }
    }

    /* renamed from: com.daaw.pv1$v */
    /* loaded from: classes.dex */
    public class C2641v implements tw1.InterfaceC3140a<tx0, vd0, tx0.C3143b, hx0> {
        public C2641v() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(tx0 tx0Var, vd0 vd0Var, tx0.C3143b c3143b, hx0 hx0Var) {
        }
    }

    /* renamed from: com.daaw.pv1$v0 */
    /* loaded from: classes.dex */
    public class C2642v0 implements xw1.InterfaceC3648a<String, VisualizerViewCore, String> {
        public C2642v0() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public String mo4423c(String str, VisualizerViewCore visualizerViewCore) {
            return str == null ? "" : pv1.this.m13105L(str, visualizerViewCore);
        }
    }

    /* renamed from: com.daaw.pv1$w */
    /* loaded from: classes.dex */
    public class C2643w implements vw1.InterfaceC3381a<Float> {
        public C2643w() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Float mo3126a() {
            pv1 pv1Var = pv1.this;
            return Float.valueOf(pv1Var.m13100Q(pv1Var.f23316c));
        }
    }

    /* renamed from: com.daaw.pv1$x */
    /* loaded from: classes.dex */
    public class C2644x implements pw1.InterfaceC2649a {
        public C2644x() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18929d0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I, SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I), true);
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18915k0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o);
            Context m23840b = dx0.m23840b();
            if (m23840b != null) {
                C3385vy.f30703a.m12018a(m23840b.getResources().getString(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o) ? R.string.switched_to_video : R.string.switched_to_visualizer));
            }
        }
    }

    /* renamed from: com.daaw.pv1$y */
    /* loaded from: classes.dex */
    public class C2645y implements qw1.InterfaceC2788a<SurfaceHolder> {
        public C2645y() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(SurfaceHolder surfaceHolder) {
            pv1.this.f23314a = new WeakReference(surfaceHolder);
            C0743c.f4018l.m19309a(surfaceHolder);
        }
    }

    /* renamed from: com.daaw.pv1$z */
    /* loaded from: classes.dex */
    public class C2646z implements pw1.InterfaceC2649a {
        public C2646z() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            pv1.this.f23314a = new WeakReference(null);
        }
    }

    public pv1() {
        boolean z = true;
        this.f23323j = false;
        Context m23837e = dx0.m23837e();
        this.f23323j = (m23837e == null || !SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18952K(m23837e, "pref_highQualityBlur", false)) ? false : false;
        SettingsActivity.f3768s.m12017b(new C2617k(), this.f23318e);
        MediaPlaybackService.f3864h0.m8755b(new C2641v(), this.f23318e);
        MediaPlaybackService.f3878v0.m6691b(new C2610g0(), this.f23318e);
        MediaPlaybackService.f3877u0.m6691b(new C2631q0(), this.f23318e);
        MediaPlaybackService.f3876t0.m9794b(new C2633r0(), this.f23318e);
        o30.f20983w.m12017b(new C2636s0(), this.f23318e);
        C0812b5.f4296d.m4424b(new C2638t0(), this.f23318e);
        VisualizerViewCore.f3816A.m10861b(new C2640u0(), this.f23318e);
        VisualizerViewCore.f3827u.m4424b(new C2642v0(), this.f23318e);
        VisualizerViewCore.f3828v.m1824b(new C2592a(), this.f23318e);
        VisualizerViewCore.f3829w.m6691b(new C2594b(), this.f23318e);
        VisualizerViewCore.f3830x.m10861b(new C2596c(), this.f23318e);
        VisualizerViewCore.f3822G.m5752b(new C2600d(), this.f23318e);
        iv1.f14032y.m5752b(new C2602e(), this.f23318e);
        iv1.f14029F.m5752b(new C2606f(), this.f23318e);
        iv1.f14033z.m12017b(new C2609g(), this.f23318e);
        iv1.f14024A.m12017b(new C2611h(), this.f23318e);
        iv1.f14025B.m12017b(new C2613i(), this.f23318e);
        iv1.f14026C.m10861b(new C2615j(), this.f23318e);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14301i.m9794b(new C2620l(), this.f23318e);
        VisualizerViewCore.f3831y.m6691b(new C2622m(), this.f23318e);
        VisualizerViewCore.f3832z.m12989b(new C2624n(), this.f23318e);
        VisualizerViewCore.f3825J.m5752b(new C2626o(), this.f23318e);
        C0812b5.f4298f.m5752b(new C2628p(), this.f23318e);
        C0812b5.f4300h.m5752b(new C2630q(), this.f23318e);
        o30.f20984x.m6691b(new C2632r(), this.f23318e);
        ko0.f16530j0.m12989b(new C2635s(), this.f23318e);
        o30.f20985y.m6691b(new C2637t(), this.f23318e);
        ko0.f16529i0.m6691b(new C2639u(), this.f23318e);
        o30.f20986z.m6691b(new C2643w(), this.f23318e);
        ko0.f16531k0.m12989b(new C2644x(), this.f23318e);
        o30.f20977C.m12017b(new C2645y(), this.f23318e);
        o30.f20978D.m12989b(new C2646z(), this.f23318e);
        MainActivity.f3723p0.m10861b(new C2593a0(), this.f23318e);
        o30.f20981G.m12017b(new C2595b0(), this.f23318e);
        o30.f20979E.m6691b(new C2599c0(), this.f23318e);
        o30.f20980F.m12989b(new C2601d0(), this.f23318e);
        o30.f20982H.m12017b(new C2603e0(), this.f23318e);
        DialogFragmentC1593ho.f12704L.m12989b(new C2608f0(), this.f23318e);
        DialogFragmentC1593ho.f12705M.m12989b(new C2612h0(), this.f23318e);
        DialogFragmentC1593ho.f12701I.m9794b(new C2614i0(), this.f23318e);
        DialogFragmentC1593ho.f12697E.m9794b(new C2616j0(), this.f23318e);
        DialogFragmentC1593ho.f12699G.m8755b(new C2618k0(), this.f23318e);
        DialogFragmentC1593ho.f12700H.m9794b(new C2621l0(), this.f23318e);
        DialogFragmentC1593ho.f12702J.m7666b(new C2623m0(), this.f23318e);
        DialogFragmentC1593ho.f12703K.m9794b(new C2625n0(), this.f23318e);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14297g.m9794b(new C2627o0(), this.f23318e);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14299h.m10861b(new C2629p0(), this.f23318e);
        MainActivity.f3713L0.m4424b(new xw1.InterfaceC3648a() { // from class: com.daaw.mv1
            @Override // com.daaw.xw1.InterfaceC3648a
            /* renamed from: c */
            public final Object mo4423c(Object obj, Object obj2) {
                Boolean m13097T;
                m13097T = pv1.m13097T((C0645al) obj, (Integer) obj2);
                return m13097T;
            }
        }, this.f23318e);
    }

    /* renamed from: H */
    public static /* synthetic */ float m13109H(pv1 pv1Var, float f) {
        float f2 = pv1Var.f23328o + f;
        pv1Var.f23328o = f2;
        return f2;
    }

    /* renamed from: J */
    public static int m13107J(C3355vn c3355vn, List<Integer> list, int i) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
        if (c3355vn == null) {
            return -1;
        }
        int i2 = 0;
        while (true) {
            if (!tv1.m8771i().m8773g(i2) && !list.contains(Integer.valueOf(i2))) {
                break;
            }
            i2++;
        }
        if (SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18917j0(i2) < 0) {
            Context m23837e = dx0.m23837e();
            if (m23837e != null) {
                C3385vy.f30703a.m12018a(m23837e.getResources().getString(R.string.vis_error_duplicating));
            }
            return -1;
        }
        list.add(Integer.valueOf(i2));
        if (c3355vn.m7012h() < 0 && i > 0) {
            c3355vn.m7003q(i);
        }
        m18928e.m18940W(i2, c3355vn, false);
        m18928e.m18925f0(list);
        return i2;
    }

    /* renamed from: K */
    public static void m13106K(VisualizerViewCore visualizerViewCore, f61 f61Var, int i, String str, C3355vn c3355vn, boolean z) {
        if (c3355vn == null) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh((C3355vn) null);
                return;
            }
            return;
        }
        if (str.equals(c3355vn.m7008l())) {
            if (visualizerViewCore != null) {
                visualizerViewCore.setThemeElementsUiTh(c3355vn);
            }
            if (f61Var == null) {
                return;
            }
        } else {
            lz1.m16363c("visualizer customization, version mismatch");
            if (z) {
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(c3355vn);
                }
                if (f61Var == null) {
                    return;
                }
            } else {
                c3355vn.m7000t(str);
                SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18940W(i, c3355vn, false);
                Context m23839c = dx0.m23839c();
                if (m23839c != null) {
                    new AlertDialog.Builder(m23839c).setMessage(R.string.vis_customization_dialog_ver_mismatch).show();
                }
                if (visualizerViewCore != null) {
                    visualizerViewCore.setThemeElementsUiTh(c3355vn);
                }
                if (f61Var == null) {
                    return;
                }
            }
        }
        f61Var.m22887t0(c3355vn);
    }

    /* renamed from: O */
    public static C3355vn m13102O(int i, int[] iArr) {
        C3355vn m18912n = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18912n(i, iArr);
        if (m18912n == null) {
            m18912n = tv1.m8771i().m8778b(i);
            if (m18912n == null) {
                return null;
            }
            if (iArr != null) {
                iArr[0] = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18924g(m18912n.m7005o());
            }
        }
        return m18912n;
    }

    /* renamed from: T */
    public static /* synthetic */ Boolean m13097T(C0645al c0645al, Integer num) {
        qw1<C0645al> qw1Var;
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue == 2) {
                qw1Var = o30.f20982H;
            } else if (intValue != 3) {
                return Boolean.TRUE;
            } else {
                qw1Var = o30.f20976B;
            }
            qw1Var.m12018a(c0645al);
        } else {
            iv1.m19335d(c0645al.m27378a());
        }
        return Boolean.TRUE;
    }

    /* renamed from: V */
    public static /* synthetic */ void m13095V(VisualizerViewCore visualizerViewCore, final DialogFragmentC1593ho dialogFragmentC1593ho, final C3355vn c3355vn, final boolean z, final int i, VisualizerViewCore visualizerViewCore2) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.nv1
            @Override // java.lang.Runnable
            public final void run() {
                DialogFragmentC1593ho.this.m20582x(c3355vn, z, i);
            }
        });
    }

    /* renamed from: W */
    public static /* synthetic */ void m13094W(final VisualizerViewCore visualizerViewCore, final boolean z, final int i) {
        final DialogFragmentC1593ho m20595k = DialogFragmentC1593ho.m20595k();
        if (m20595k != null) {
            final C3355vn m7016d = C3355vn.m7016d();
            visualizerViewCore.m26844j(m7016d, new C1610ht(), new InterfaceC1153e0() { // from class: com.daaw.lv1
                @Override // com.daaw.InterfaceC1153e0
                /* renamed from: a */
                public final void mo7884a(Object obj) {
                    pv1.m13095V(VisualizerViewCore.this, m20595k, m7016d, z, i, (VisualizerViewCore) obj);
                }
            });
        }
    }

    /* renamed from: Z */
    public static void m13091Z(int i) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18929d0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14273I, i, true);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18935a0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14313o, false);
    }

    /* renamed from: b0 */
    public static void m13087b0(final VisualizerViewCore visualizerViewCore, final boolean z, final int i) {
        visualizerViewCore.post(new Runnable() { // from class: com.daaw.ov1
            @Override // java.lang.Runnable
            public final void run() {
                pv1.m13094W(VisualizerViewCore.this, z, i);
            }
        });
    }

    /* renamed from: L */
    public final String m13105L(String str, VisualizerViewCore visualizerViewCore) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(32);
        StringBuilder sb2 = null;
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '{') {
                if (sb2 != null) {
                    sb2 = null;
                } else {
                    sb2 = new StringBuilder(16);
                    sb2.append(charAt);
                }
            } else if (charAt == '}' && sb2 != null) {
                sb2.append(charAt);
                sb.append(m13104M(sb2.toString(), visualizerViewCore));
                sb2 = null;
            }
            if (sb2 == null) {
                sb.append(charAt);
            }
            sb2.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: M */
    public final String m13104M(String str, VisualizerViewCore visualizerViewCore) {
        if ("{TimeCurrent}".equals(str)) {
            return br1.m25894o((int) (C0812b5.m26490d() / 1000));
        }
        if ("{TimeRemaining}".equals(str)) {
            return br1.m25894o((int) (Math.max(0L, C0812b5.m26491c() - C0812b5.m26490d()) / 1000));
        } else if ("{TimeLength}".equals(str)) {
            return br1.m25894o((int) (C0812b5.m26491c() / 1000));
        } else {
            if ("{Artist}".equals(str)) {
                tx0.C3143b c3143b = ww0.f31597d;
                return c3143b.m8725h() ? c3143b.f28210h : "";
            } else if ("{ArtistOrTitle}".equals(str)) {
                tx0.C3143b c3143b2 = ww0.f31597d;
                return c3143b2.m8725h() ? c3143b2.f28210h : ww0.f31597d.f28207e;
            } else if ("{ArtistAndTitle}".equals(str)) {
                tx0.C3143b c3143b3 = ww0.f31597d;
                if (!c3143b3.m8725h()) {
                    return "\n" + c3143b3.f28207e;
                }
                return c3143b3.f28210h + "\n" + c3143b3.f28207e;
            } else if ("{MarkedArtistAndTitle}".equals(str)) {
                tx0.C3143b c3143b4 = ww0.f31597d;
                if (!c3143b4.m8725h()) {
                    return "Avee Player\n" + c3143b4.f28207e;
                }
                return "Avee Player\n" + c3143b4.f28210h + " - " + c3143b4.f28207e;
            } else if ("{Title}".equals(str)) {
                return ww0.f31597d.f28207e;
            } else {
                if ("{Album}".equals(str)) {
                    return ww0.f31597d.f28208f;
                }
                if ("{Fps}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21976a();
                } else if ("{FrameTime}".equals(str)) {
                    return "" + visualizerViewCore.getFrameTimeMs();
                } else if ("{StatFlush}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21974c();
                } else if ("{WaitResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21975b();
                } else if ("{ResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21971f();
                } else if ("{GradualResLoad}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21973d();
                } else if ("{RTSwitch}".equals(str)) {
                    return "" + visualizerViewCore.getFrameStats().m21972e();
                } else {
                    return str;
                }
            }
        }
    }

    /* renamed from: N */
    public final int m13103N() {
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L);
        return (m18916k != 1 && m18916k == 2) ? 2 : 1;
    }

    /* renamed from: P */
    public final C0729a m13101P(int i, C0729a c0729a) {
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
        C0729a.C0736g c0736g = new C0729a.C0736g();
        c0736g.f3976e = m18928e.m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14265A);
        c0736g.f3978g = -1L;
        c0736g.f3980a = 1;
        c0736g.f3981b = m18928e.m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14287W);
        c0736g.f3982c = 0L;
        c0736g.f3983d = i;
        return f23313u.m13906a(c0729a, c0736g, null);
    }

    /* renamed from: Q */
    public final float m13100Q(float f) {
        int m18916k = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14276L);
        if (m18916k == 1) {
            return f;
        }
        if (m18916k == 2 || m18916k == 3) {
            return 0.0f;
        }
        return f;
    }

    /* renamed from: R */
    public boolean m13099R() {
        return this.f23323j;
    }

    /* renamed from: S */
    public boolean m13098S() {
        return qv1.m12087b0() || xw0.f33007d;
    }

    /* renamed from: X */
    public final void m13093X(VisualizerViewCore visualizerViewCore, int i, boolean z, int[] iArr) {
        m13092Y(visualizerViewCore, null, i, z, m13102O(i, iArr));
    }

    /* renamed from: Y */
    public final void m13092Y(VisualizerViewCore visualizerViewCore, f61 f61Var, int i, boolean z, C3355vn c3355vn) {
        m13106K(visualizerViewCore, f61Var, i, tv1.f28143c, c3355vn, z);
    }

    /* renamed from: a0 */
    public final void m13089a0(Integer num, boolean z) {
        if (z || this.f23329p != num.intValue()) {
            this.f23329p = num.intValue();
            VisualizerViewCore visualizerViewCore = this.f23315b.get();
            if (visualizerViewCore != null) {
                visualizerViewCore.m26837q(3, num.intValue());
            }
        }
    }

    /* renamed from: e */
    public final void m13084e(int i, List<String> list) {
        File[] listFiles = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18936a(i).listFiles();
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < listFiles.length; i4++) {
            File file = listFiles[i4];
            if (".json".equals(cr1.m25069k(file.getName()))) {
                i3 = i4;
            }
            if ("scene.json".equals(file.getName())) {
                i2 = i4;
            }
        }
        if (i2 == -1) {
            i2 = i3;
        }
        if (i2 >= 0) {
            listFiles[i2] = null;
        }
        for (int i5 = 0; i5 < listFiles.length; i5++) {
            File file2 = listFiles[i5];
            if (file2 != null) {
                for (String str : list) {
                    if (m13083f(file2.getName(), str)) {
                        listFiles[i5] = null;
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

    /* renamed from: f */
    public boolean m13083f(String str, String str2) {
        if (str2 == null) {
            return false;
        }
        return str.equals(cr1.m25072h(str2, ':'));
    }

    /* renamed from: g */
    public final void m13082g(DialogFragmentC1593ho dialogFragmentC1593ho, int i, int i2, Uri uri, String str, int i3) {
        String str2;
        if (i2 == 43) {
            if (this.f23321h != null && this.f23322i != null) {
                dialogFragmentC1593ho.m20586t(this.f23320g.get(), this.f23321h, this.f23322i, str);
                return;
            }
            str2 = "PICK_IMAGE_PROPERTY_REQUEST_CODE invalid data";
        } else if (i2 != 44) {
            return;
        } else {
            if (this.f23321h != null && this.f23322i != null) {
                if ((i3 & 64) != 0 && uri != null) {
                    lz1.m16363c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                    try {
                        dialogFragmentC1593ho.getActivity().getContentResolver().takePersistableUriPermission(uri, 1);
                    } catch (Exception e) {
                        qw1<String> qw1Var = C3385vy.f30703a;
                        qw1Var.m12018a("Error TakePersistableUriPermission " + e.getMessage());
                    }
                }
                try {
                    dialogFragmentC1593ho.m20586t(this.f23320g.get(), this.f23321h, this.f23322i, str);
                    return;
                } catch (Exception e2) {
                    qw1<String> qw1Var2 = C3385vy.f30703a;
                    qw1Var2.m12018a("Error OnImagePropertyValuePicked " + e2.getMessage());
                    return;
                }
            }
            str2 = "PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data";
        }
        lz1.m16363c(str2);
    }
}
