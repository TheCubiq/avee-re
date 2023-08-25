package com.daaw;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.widget.TextView;
import com.daaw.C1148dx;
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.avee.comp.playback.C0743c;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.dt0;
import com.daaw.dv1;
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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class qv1 {

    /* renamed from: P */
    public static ww1<Integer[], Boolean> f24436P = new ww1<>();

    /* renamed from: Q */
    public static sw1<Boolean, Long, Boolean> f24437Q = new sw1<>();

    /* renamed from: R */
    public static ow1<C0729a, C0729a.C0736g, C0729a> f24438R = new ow1<>();

    /* renamed from: S */
    public static final qw1<Boolean> f24439S = new qw1<>();

    /* renamed from: T */
    public static volatile boolean f24440T = false;

    /* renamed from: U */
    public static long f24441U = 0;

    /* renamed from: V */
    public static long f24442V = 0;

    /* renamed from: W */
    public static long f24443W = 0;

    /* renamed from: H */
    public volatile C2916s7 f24451H;

    /* renamed from: M */
    public dv1.C1145f f24456M;

    /* renamed from: b */
    public final xw0 f24460b;

    /* renamed from: c */
    public vm0 f24461c;

    /* renamed from: f */
    public tx0.C3143b f24464f;

    /* renamed from: g */
    public tx0 f24465g;

    /* renamed from: i */
    public C0729a f24467i;

    /* renamed from: j */
    public C0729a f24468j;

    /* renamed from: u */
    public volatile f40 f24479u;

    /* renamed from: w */
    public volatile File f24481w;

    /* renamed from: x */
    public volatile OutputStream f24482x;

    /* renamed from: a */
    public List<Object> f24459a = new LinkedList();

    /* renamed from: d */
    public dv1.C1144e[] f24462d = null;

    /* renamed from: e */
    public WeakReference<VisualizerViewCore> f24463e = new WeakReference<>(null);

    /* renamed from: h */
    public long f24466h = 0;

    /* renamed from: k */
    public volatile boolean f24469k = true;

    /* renamed from: l */
    public volatile int f24470l = 30;

    /* renamed from: m */
    public volatile long f24471m = 33333;

    /* renamed from: n */
    public volatile float f24472n = 8.0f;

    /* renamed from: o */
    public volatile boolean f24473o = true;

    /* renamed from: p */
    public volatile float f24474p = 320.0f;

    /* renamed from: q */
    public volatile int f24475q = 2;

    /* renamed from: r */
    public volatile String f24476r = "";

    /* renamed from: s */
    public volatile String f24477s = "";

    /* renamed from: t */
    public volatile int f24478t = 0;

    /* renamed from: v */
    public volatile C0729a.C0736g f24480v = new C0729a.C0736g();

    /* renamed from: y */
    public volatile int f24483y = 0;

    /* renamed from: z */
    public volatile int f24484z = 0;

    /* renamed from: A */
    public volatile int f24444A = 0;

    /* renamed from: B */
    public volatile boolean f24445B = false;

    /* renamed from: C */
    public C2786v f24446C = new C2786v(this, null);

    /* renamed from: D */
    public dv1.C1143d f24447D = null;

    /* renamed from: E */
    public long f24448E = 0;

    /* renamed from: F */
    public long f24449F = 0;

    /* renamed from: G */
    public long f24450G = 0;

    /* renamed from: I */
    public Handler f24452I = new Handler();

    /* renamed from: J */
    public volatile int f24453J = 0;

    /* renamed from: K */
    public int f24454K = 0;

    /* renamed from: L */
    public int f24455L = 0;

    /* renamed from: N */
    public boolean f24457N = false;

    /* renamed from: O */
    public wf1 f24458O = new wf1();

    /* renamed from: com.daaw.qv1$a */
    /* loaded from: classes.dex */
    public class C2762a implements rw1.InterfaceC2894a<Integer, Activity> {

        /* renamed from: a */
        public final /* synthetic */ xw0 f24485a;

        public C2762a(xw0 xw0Var) {
            this.f24485a = xw0Var;
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(Integer num, Activity activity) {
            if (num.intValue() == 2) {
                this.f24485a.m4465i(num, activity, qv1.f24440T);
                return;
            }
            this.f24485a.m4465i(num, activity, false);
            qv1.this.m12071j0(false, new wf1(), false);
        }
    }

    /* renamed from: com.daaw.qv1$b */
    /* loaded from: classes.dex */
    public class C2763b implements uw1.InterfaceC3263a<Boolean, Boolean, Integer, String, tx0> {

        /* renamed from: a */
        public final /* synthetic */ xw0 f24487a;

        public C2763b(xw0 xw0Var) {
            this.f24487a = xw0Var;
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var) {
            this.f24487a.m4468f(bool, bool2, num, str, tx0Var, qv1.f24440T);
        }
    }

    /* renamed from: com.daaw.qv1$c */
    /* loaded from: classes.dex */
    public class C2764c implements vw1.InterfaceC3381a<Boolean> {

        /* renamed from: a */
        public final /* synthetic */ pv1 f24489a;

        public C2764c(pv1 pv1Var) {
            this.f24489a = pv1Var;
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return Boolean.valueOf(this.f24489a.m13099R());
        }
    }

    /* renamed from: com.daaw.qv1$d */
    /* loaded from: classes.dex */
    public class C2765d implements vw1.InterfaceC3381a<Integer> {
        public C2765d() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Integer mo3126a() {
            return Integer.valueOf(!qv1.f24440T ? -1 : qv1.this.f24444A);
        }
    }

    /* renamed from: com.daaw.qv1$e */
    /* loaded from: classes.dex */
    public class C2766e implements xw1.InterfaceC3648a<C0729a, Integer, C0729a> {
        public C2766e() {
        }

        @Override // com.daaw.xw1.InterfaceC3648a
        /* renamed from: a */
        public C0729a mo4423c(C0729a c0729a, Integer num) {
            StringBuilder sb;
            if (qv1.this.f24468j == null) {
                qv1.this.f24468j = new C0729a();
            }
            if (!qv1.f24440T) {
                qv1.this.f24445B = true;
                return null;
            }
            int i = qv1.this.f24453J - qv1.this.f24483y;
            int i2 = qv1.this.f24470l;
            if (i < 0 || qv1.this.f24453J > qv1.this.f24484z) {
                return null;
            }
            int i3 = 0;
            boolean z = i >= qv1.this.f24484z - 1;
            qv1.this.f24480v.f3978g = qv1.f24441U;
            C0729a.C0736g c0736g = qv1.this.f24480v;
            double d = i2;
            Double.isNaN(d);
            c0736g.f3982c = (long) Math.ceil(1000000.0d / d);
            qv1.this.f24480v.f3983d = num.intValue();
            C0729a m13906a = qv1.f24438R.m13906a(qv1.this.f24468j, qv1.this.f24480v, null);
            if (qv1.this.f24453J % 15 == 0) {
                qv1 qv1Var = qv1.this;
                qv1Var.m12097T(qv1Var.f24480v.f3978g);
            }
            if ((m13906a == null || !m13906a.f3952k) && !z) {
                if (m13906a != null) {
                    sb = new StringBuilder();
                    sb.append("not capturedDataFully posMs: ");
                    sb.append(qv1.this.f24480v.f3978g / 1000);
                    sb.append(", readjust and wait ");
                    sb.append(m13906a.f3953l);
                    sb.append(" / ");
                    sb.append(m13906a.m26741b());
                } else {
                    sb = new StringBuilder();
                    sb.append("not capturedDataFully posMs: ");
                    sb.append(qv1.this.f24480v.f3978g / 1000);
                    sb.append(", readjust and wait, outData is null");
                }
                lz1.m16365a(sb.toString());
                qv1.this.m12083d0();
                while (i3 < 10) {
                    if (m13906a != null) {
                        qv1.this.f24468j = m13906a;
                    }
                    m13906a = qv1.f24438R.m13906a(qv1.this.f24468j, qv1.this.f24480v, null);
                    if (m13906a != null && m13906a.f3952k) {
                        break;
                    }
                    try {
                        Thread.sleep(500L);
                    } catch (Exception unused) {
                    }
                    i3++;
                }
                if (i3 > 0) {
                    lz1.m16365a("didn't got with first");
                }
                if (i3 >= 10) {
                    lz1.m16365a("failed to get capturedDataFully, gave up");
                    qv1.this.f24458O.m6093d("warning: failed to get audio data for frame");
                }
            }
            if (m13906a != null) {
                qv1.this.f24468j = m13906a;
            }
            qv1.this.f24467i = m13906a;
            return m13906a;
        }
    }

    /* renamed from: com.daaw.qv1$f */
    /* loaded from: classes.dex */
    public class C2767f implements tw1.InterfaceC3140a<tx0, vd0, tx0.C3143b, hx0> {
        public C2767f() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(tx0 tx0Var, vd0 vd0Var, tx0.C3143b c3143b, hx0 hx0Var) {
            xw0.f33009f = tx0Var;
            xw0.f33010g = c3143b;
            xw0.f33011h = hx0Var;
            if (qv1.f24440T) {
                return;
            }
            qv1.this.f24464f = xw0.f33010g;
            qv1.this.f24465g = xw0.f33009f;
            qv1.this.f24466h = xw0.f33011h.f13044a;
        }
    }

    /* renamed from: com.daaw.qv1$g */
    /* loaded from: classes.dex */
    public class C2768g implements vw1.InterfaceC3381a<f40> {
        public C2768g() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public f40 mo3126a() {
            if (qv1.f24440T) {
                return qv1.this.f24479u;
            }
            qv1.this.f24445B = true;
            qv1.this.m12093X(null);
            return null;
        }
    }

    /* renamed from: com.daaw.qv1$h */
    /* loaded from: classes.dex */
    public class C2769h implements sw1.InterfaceC2987a<vk1, Boolean, String> {

        /* renamed from: com.daaw.qv1$h$a */
        /* loaded from: classes.dex */
        public class RunnableC2770a implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ String f24496p;

            public RunnableC2770a(String str) {
                this.f24496p = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qv1.this.f24456M == null) {
                    qv1.this.f24456M = new dv1.C1145f();
                }
                qv1.this.f24456M.f7895a = true;
                qv1.this.f24456M.f7896b = true;
                qv1.this.f24456M.f7898d = 1;
                qv1.this.f24456M.f7897c = 0;
                qv1.this.f24456M.f7899e = this.f24496p;
                dv1.m23918K(qv1.this.f24456M);
            }
        }

        /* renamed from: com.daaw.qv1$h$b */
        /* loaded from: classes.dex */
        public class RunnableC2771b implements Runnable {

            /* renamed from: p */
            public final /* synthetic */ wf1 f24498p;

            public RunnableC2771b(wf1 wf1Var) {
                this.f24498p = wf1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                qv1.this.m12071j0(true, this.f24498p, true);
            }
        }

        /* renamed from: com.daaw.qv1$h$c */
        /* loaded from: classes.dex */
        public class RunnableC2772c implements Runnable {
            public RunnableC2772c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qv1.this.f24456M == null) {
                    qv1.this.f24456M = new dv1.C1145f();
                }
                qv1.this.f24456M.f7895a = qv1.f24440T;
                qv1.this.f24456M.f7896b = false;
                qv1.this.f24456M.f7898d = Math.max(qv1.this.f24484z - qv1.this.f24483y, 1);
                qv1.this.f24456M.f7897c = Math.max(Math.min(qv1.this.f24453J - qv1.this.f24483y, qv1.this.f24456M.f7898d), 0);
                dv1.m23918K(qv1.this.f24456M);
            }
        }

        public C2769h() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(vk1 vk1Var, Boolean bool, String str) {
            if (!qv1.f24440T) {
                qv1.this.f24445B = true;
            } else if (bool.booleanValue() && qv1.this.f24455L < 600) {
                qv1.m12115B(qv1.this);
                if (qv1.this.f24455L % 30 == 0) {
                    qv1.this.f24452I.post(new RunnableC2770a(str));
                }
            } else {
                if (qv1.this.f24455L >= 600) {
                    qv1.this.f24458O.m6093d("loading resources timeout");
                }
                if (qv1.this.f24479u.f9089d) {
                    return;
                }
                if (qv1.this.f24453J == qv1.this.f24483y) {
                    qv1.this.f24458O.m6090g();
                    System.gc();
                    if (qv1.this.f24451H == null) {
                        int i = qv1.this.f24467i != null ? qv1.this.f24467i.f3947f : 44100;
                        if (qv1.this.f24467i == null) {
                            qv1.this.f24458O.m6094c("failed to get audio sampleRate");
                        }
                        String m12096U = qv1.this.m12096U(vk1Var.getWidth(), vk1Var.getHeight(), i, qv1.this.f24481w, qv1.this.f24482x);
                        if (m12096U != null) {
                            qv1.this.f24458O.m6096a(m12096U);
                        }
                    }
                }
                if (qv1.this.f24453J >= qv1.this.f24483y && qv1.this.f24453J <= qv1.this.f24484z && qv1.this.f24451H != null && !qv1.this.f24458O.m6091f()) {
                    qv1.this.f24451H.m10619f();
                    if (!qv1.this.f24451H.m10624a(vk1Var, qv1.f24442V, qv1.this.f24454K)) {
                        lz1.m16363c("failed to add video frame");
                        qv1.this.f24458O.m6093d("failed to add video frame");
                    }
                    if (qv1.this.f24467i != null && qv1.this.f24451H != null) {
                        qv1.this.f24467i.f3955n = qv1.f24442V;
                        qv1.this.f24451H.m10623b(qv1.this.f24467i.m26736g(qv1.this.f24451H.m10618g(), qv1.this.f24467i.m26740c()), qv1.this.f24467i.f3955n);
                    }
                }
                if ((qv1.this.f24453J == qv1.this.f24484z || qv1.this.f24458O.m6091f()) && qv1.this.f24451H != null) {
                    qv1.this.f24451H.m10609p(qv1.this.f24458O);
                }
                if (qv1.this.f24453J == qv1.this.f24484z + 30 || qv1.this.f24458O.m6091f()) {
                    qv1 qv1Var = qv1.this;
                    qv1Var.m12093X(qv1Var.f24458O);
                    boolean unused = qv1.f24440T = false;
                    qv1.this.f24452I.post(new RunnableC2771b(new wf1(qv1.this.f24458O)));
                } else if ((qv1.this.f24453J + 10) % 20 == 0) {
                    qv1.this.f24452I.post(new RunnableC2772c());
                }
                qv1 qv1Var2 = qv1.this;
                qv1Var2.m12079f0(qv1Var2.f24453J + 1);
            }
        }
    }

    /* renamed from: com.daaw.qv1$i */
    /* loaded from: classes.dex */
    public class C2773i implements uw1.InterfaceC3263a<Integer, Boolean, Long, Boolean, tx0> {

        /* renamed from: a */
        public final /* synthetic */ xw0 f24501a;

        public C2773i(xw0 xw0Var) {
            this.f24501a = xw0Var;
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Integer num, Boolean bool, Long l, Boolean bool2, tx0 tx0Var) {
            if (qv1.f24440T) {
                return;
            }
            this.f24501a.m4467g(num, bool, l, bool2.booleanValue(), tx0Var);
        }
    }

    /* renamed from: com.daaw.qv1$j */
    /* loaded from: classes.dex */
    public class C2774j implements ww1.InterfaceC3477a<Context, Integer> {
        public C2774j() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            return 1;
        }
    }

    /* renamed from: com.daaw.qv1$k */
    /* loaded from: classes.dex */
    public class C2775k implements qw1.InterfaceC2788a<VisualizerViewCore> {
        public C2775k() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(VisualizerViewCore visualizerViewCore) {
            qv1.this.f24463e = new WeakReference(visualizerViewCore);
        }
    }

    /* renamed from: com.daaw.qv1$l */
    /* loaded from: classes.dex */
    public class C2776l implements ww1.InterfaceC3477a<Context, Integer> {
        public C2776l() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            return 0;
        }
    }

    /* renamed from: com.daaw.qv1$m */
    /* loaded from: classes.dex */
    public class DialogInterface$OnClickListenerC2777m implements DialogInterface.OnClickListener {
        public DialogInterface$OnClickListenerC2777m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* renamed from: com.daaw.qv1$n */
    /* loaded from: classes.dex */
    public class C2778n implements vw1.InterfaceC3381a<Boolean> {
        public C2778n() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public Boolean mo3126a() {
            return true;
        }
    }

    /* renamed from: com.daaw.qv1$o */
    /* loaded from: classes.dex */
    public class C2779o implements qw1.InterfaceC2788a<C0645al> {
        public C2779o() {
        }

        @Override // com.daaw.qw1.InterfaceC2788a
        /* renamed from: a */
        public void mo3122b(C0645al c0645al) {
            if (c0645al.m27376c() == null) {
                return;
            }
            dv1.m23901p(c0645al);
        }
    }

    /* renamed from: com.daaw.qv1$p */
    /* loaded from: classes.dex */
    public class C2780p implements tw1.InterfaceC3140a<Fragment, C0645al, dv1.C1143d, Boolean> {
        public C2780p() {
        }

        @Override // com.daaw.tw1.InterfaceC3140a
        /* renamed from: b */
        public void mo3114a(Fragment fragment, C0645al c0645al, dv1.C1143d c1143d, Boolean bool) {
            qv1 qv1Var;
            long j;
            long j2;
            long j3 = qv1.this.f24466h;
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18923g0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14330w0, c1143d.m23884g());
            SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18923g0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14332x0, c1143d.f7875c.m23878f());
            qv1.this.f24457N = bool.booleanValue();
            if (bool.booleanValue()) {
                int i = (j3 > 30000L ? 1 : (j3 == 30000L ? 0 : -1));
                qv1Var = qv1.this;
                if (i < 0) {
                    j = 0;
                    j2 = 15000;
                } else {
                    j = j3 / 5;
                    j2 = j + 15000;
                }
            } else {
                qv1Var = qv1.this;
                j = c1143d.f7881i;
                j2 = c1143d.f7882j;
            }
            qv1Var.m12073i0(fragment, c0645al, c1143d, j, j2, j3);
        }
    }

    /* renamed from: com.daaw.qv1$q */
    /* loaded from: classes.dex */
    public class C2781q implements pw1.InterfaceC2649a {
        public C2781q() {
        }

        @Override // com.daaw.pw1.InterfaceC2649a
        /* renamed from: a */
        public void mo3124a() {
            qv1.this.m12071j0(false, new wf1(), false);
        }
    }

    /* renamed from: com.daaw.qv1$r */
    /* loaded from: classes.dex */
    public class C2782r implements sw1.InterfaceC2987a<Fragment, C0645al, String> {
        public C2782r() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(Fragment fragment, C0645al c0645al, String str) {
            DialogFragmentC2971st.m9913g(c0645al, "visExportDestDir", R.string.vis_choose_export_dir_title, str);
        }
    }

    /* renamed from: com.daaw.qv1$s */
    /* loaded from: classes.dex */
    public class C2783s implements sw1.InterfaceC2987a<dv1, Integer, Intent> {
        public C2783s() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(dv1 dv1Var, Integer num, Intent intent) {
            if (num.intValue() != 53 && num.intValue() == 54) {
                if (intent == null) {
                    lz1.m16363c("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
                    return;
                }
                Uri data = intent.getData();
                if (data != null) {
                    if ((intent.getFlags() & 64) != 0) {
                        lz1.m16363c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                        try {
                            dv1Var.getActivity().getContentResolver().takePersistableUriPermission(data, 1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (qv1.this.f24447D != null) {
                        String m18084b = k10.m18084b(dv1Var.getActivity(), data);
                        OutputStream outputStream = null;
                        File file = m18084b != null ? new File(m18084b) : null;
                        if (file != null && file.canWrite()) {
                            qv1.this.m12075h0(new C0645al(dv1Var.getActivity()), qv1.this.f24447D, file, null, qv1.this.f24448E, qv1.this.f24449F, qv1.this.f24450G);
                            return;
                        }
                        try {
                            outputStream = dv1Var.getActivity().getContentResolver().openOutputStream(data);
                        } catch (FileNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        qv1.this.m12075h0(new C0645al(dv1Var.getActivity()), qv1.this.f24447D, null, outputStream, qv1.this.f24448E, qv1.this.f24449F, qv1.this.f24450G);
                    }
                }
            }
        }
    }

    /* renamed from: com.daaw.qv1$t */
    /* loaded from: classes.dex */
    public class C2784t implements sw1.InterfaceC2987a<C0645al, String, String> {
        public C2784t() {
        }

        @Override // com.daaw.sw1.InterfaceC2987a
        /* renamed from: b */
        public void mo3118a(C0645al c0645al, String str, String str2) {
            if (str2.equals("visExportDestDir")) {
                dv1.m23920I(str);
            }
        }
    }

    /* renamed from: com.daaw.qv1$u */
    /* loaded from: classes.dex */
    public class C2785u implements vw1.InterfaceC3381a<dv1.C1143d> {
        public C2785u() {
        }

        @Override // com.daaw.vw1.InterfaceC3381a
        /* renamed from: b */
        public dv1.C1143d mo3126a() {
            boolean z;
            dv1.C1143d c1143d = new dv1.C1143d();
            Integer[] numArr = {Integer.valueOf(qv1.this.f24475q), Integer.valueOf(qv1.this.f24470l), Integer.valueOf(Build.VERSION.SDK_INT), 0};
            if (qv1.f24436P.m5753a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
                qv1.this.f24462d = new dv1.C1144e[]{new dv1.C1144e(0, 2160, 1080, 60, 21.0f, true, 1), new dv1.C1144e(0, 1920, 1080, 60, 18.0f, true, 1), new dv1.C1144e(1, 1920, 1080, 60, 18.0f, true, 0), new dv1.C1144e(1, 1920, 1080, 30, 12.0f, true, 1), new dv1.C1144e(1, 1920, 1080, 30, 12.0f, true, 0), new dv1.C1144e(0, 1280, 720, 60, 12.0f, true, 0), new dv1.C1144e(1, 1280, 720, 30, 7.5f, true, 0)};
                c1143d.f7874b = 2;
                z = true;
            } else {
                qv1.this.f24462d = new dv1.C1144e[]{new dv1.C1144e(0, 1280, 720, 30, 7.5f, 2, 128.0f, 0), new dv1.C1144e(0, 1280, 720, 25, 6.0f, 2, 128.0f, 0)};
                c1143d.f7874b = 0;
                z = false;
            }
            c1143d.f7873a = qv1.this.f24462d;
            dv1.C1144e m23887d = c1143d.m23887d(c1143d.f7874b);
            c1143d.f7875c = m23887d;
            if (m23887d == null) {
                c1143d.f7875c = new dv1.C1144e(0, 1920, 1080, 30, 8.0f, 1, 128.0f, 0);
            }
            int[] iArr = {0};
            c1143d.f7876d = C1148dx.m23847a(iArr);
            c1143d.f7877e = iArr[0];
            c1143d.f7878f = qv1.this.m12092Y("/");
            c1143d.f7879g = "";
            if (qv1.this.f24464f != null) {
                c1143d.f7879g = cr1.m25066n(qv1.this.f24464f.f28207e + " exported");
            }
            if (c1143d.f7879g.length() < 1) {
                c1143d.f7879g = cr1.m25066n("exported");
            }
            c1143d.f7884l = true;
            c1143d.f7885m = false;
            c1143d.f7883k = false;
            c1143d.f7880h = true;
            c1143d.f7881i = 0;
            if (qv1.this.f24464f != null) {
                c1143d.f7882j = z ? qv1.this.f24464f.f28212j : Math.min(600000, qv1.this.f24464f.f28212j);
            } else {
                c1143d.f7882j = 0;
            }
            c1143d.m23889b(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14330w0));
            c1143d.f7875c.m23882b(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18906t(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14332x0));
            c1143d.f7874b = -1;
            return c1143d;
        }
    }

    /* renamed from: com.daaw.qv1$v */
    /* loaded from: classes.dex */
    public class C2786v {

        /* renamed from: a */
        public boolean f24515a;

        public C2786v() {
            this.f24515a = false;
        }

        public /* synthetic */ C2786v(qv1 qv1Var, C2775k c2775k) {
            this();
        }

        /* renamed from: a */
        public void m12034a() {
            this.f24515a = false;
        }
    }

    public qv1(pv1 pv1Var, xw0 xw0Var, vm0 vm0Var) {
        this.f24460b = xw0Var;
        this.f24461c = vm0Var;
        o30.f20983w.m12017b(new C2775k(), this.f24459a);
        o30.f20975A.m6691b(new C2778n(), this.f24459a);
        o30.f20976B.m12017b(new C2779o(), this.f24459a);
        dv1.f7838M.m8755b(new C2780p(), this.f24459a);
        dv1.f7839N.m12989b(new C2781q(), this.f24459a);
        dv1.f7840O.m9794b(new C2782r(), this.f24459a);
        dv1.f7841P.m9794b(new C2783s(), this.f24459a);
        DialogFragmentC2971st.f26613t.m9794b(new C2784t(), this.f24459a);
        dv1.f7843R.m6691b(new C2785u(), this.f24459a);
        MainActivity.f3723p0.m10861b(new C2762a(xw0Var), this.f24459a);
        MediaPlaybackService.f3863g0.m7666b(new C2763b(xw0Var), this.f24459a);
        VisualizerViewCore.f3819D.m6691b(new C2764c(pv1Var), this.f24459a);
        VisualizerViewCore.f3820E.m6691b(new C2765d(), this.f24459a);
        C0812b5.f4295c.m4424b(new C2766e(), this.f24459a);
        MediaPlaybackService.f3864h0.m8755b(new C2767f(), this.f24459a);
        VisualizerViewCore.f3817B.m6691b(new C2768g(), this.f24459a);
        VisualizerViewCore.f3821F.m9794b(new C2769h(), this.f24459a);
        MediaPlaybackService.f3872p0.m7666b(new C2773i(xw0Var), this.f24459a);
        C0812b5.f4297e.m5752b(new C2774j(), this.f24459a);
        C0812b5.f4299g.m5752b(new C2776l(), this.f24459a);
    }

    /* renamed from: B */
    public static /* synthetic */ int m12115B(qv1 qv1Var) {
        int i = qv1Var.f24455L;
        qv1Var.f24455L = i + 1;
        return i;
    }

    /* renamed from: Z */
    public static long m12091Z() {
        return f24443W;
    }

    /* renamed from: a0 */
    public static long m12089a0() {
        return f24442V;
    }

    /* renamed from: b0 */
    public static boolean m12087b0() {
        return f24440T;
    }

    /* renamed from: g0 */
    public static void m12077g0(int i, Context context, String str, Uri uri, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str3);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
            dt0.C1136d c1136d = new dt0.C1136d(context);
            c1136d.m23969i(str2).m23970h(str).m23964n(R.drawable.ic_save5).m23971g(activity).m23966l(true).m23973e(true);
            ((NotificationManager) context.getSystemService("notification")).notify(i, c1136d.m23976b());
        } catch (Exception unused) {
        }
    }

    /* renamed from: T */
    public final void m12097T(long j) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m12096U(int i, int i2, int i3, File file, OutputStream outputStream) {
        File file2;
        String str;
        StringBuilder sb;
        this.f24446C.m12034a();
        m12093X(null);
        lz1.m16363c("initialize VideoSequenceEncoder");
        this.f24451H = new C2916s7();
        if (file == null && outputStream != null) {
            try {
                file2 = File.createTempFile("aveeexport", null);
            } catch (IOException unused) {
            }
            if (file2 == null) {
                String m10613l = this.f24451H.m10613l(file2, outputStream, this.f24470l, i, i2, this.f24472n, this.f24473o, this.f24474p, this.f24475q, i3, this.f24476r, this.f24477s, this.f24478t);
                if (m10613l != null) {
                    this.f24446C.f24515a = true;
                    if (this.f24470l > 40) {
                        sb = new StringBuilder();
                        sb.append("Failed to initialize encoder: ");
                        sb.append(m10613l);
                        m10613l = " Try lower value for Fps?";
                    } else {
                        sb = new StringBuilder();
                        sb.append("Failed to initialize encoder: ");
                    }
                    sb.append(m10613l);
                    str = sb.toString();
                } else {
                    str = null;
                }
            } else {
                this.f24446C.f24515a = true;
                str = "Failed to create file";
            }
            if (str != null) {
                lz1.m16363c(str);
            }
            return str;
        }
        file2 = file;
        if (file2 == null) {
        }
        if (str != null) {
        }
        return str;
    }

    /* renamed from: V */
    public File m12095V(String str, String str2, String str3) {
        return m12094W(str, str2, str3, 0);
    }

    /* renamed from: W */
    public File m12094W(String str, String str2, String str3, int i) {
        File file = new File(str, cr1.m25066n(str2 + " " + i + str3));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.isDirectory()) {
            parentFile.mkdirs();
        }
        return (!file.exists() || i >= 1000) ? file : m12094W(str, str2, str3, i + 1);
    }

    /* renamed from: X */
    public void m12093X(wf1 wf1Var) {
        if (this.f24451H != null) {
            this.f24451H.m10620e(wf1Var);
            this.f24451H.m10612m();
            this.f24451H = null;
        }
    }

    /* renamed from: Y */
    public final String m12092Y(String str) {
        File file;
        try {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        } catch (Exception unused) {
            file = null;
        }
        if (file == null) {
            try {
                file = dx0.m23837e().getFilesDir();
            } catch (Exception unused2) {
            }
        }
        if (file != null) {
            try {
                return file.getCanonicalPath();
            } catch (Exception unused3) {
                return str;
            }
        }
        return str;
    }

    /* renamed from: c0 */
    public final long m12085c0(long j, boolean z) {
        C0743c.f4015i.m19309a(Long.valueOf(Math.max(0L, j - 300000) / 1000));
        C0743c.f4012f.m19309a(1);
        return 300L;
    }

    /* renamed from: d0 */
    public void m12083d0() {
    }

    /* renamed from: e0 */
    public void m12081e0() {
        VisualizerViewCore visualizerViewCore = this.f24463e.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.m26840n();
        }
    }

    /* renamed from: f0 */
    public final void m12079f0(int i) {
        this.f24453J = i;
        this.f24454K = this.f24453J - this.f24483y;
        int i2 = this.f24470l;
        f24442V = C2916s7.m10622c(this.f24454K, i2);
        f24441U = Math.max(0L, C2916s7.m10622c(this.f24453J, i2));
    }

    /* renamed from: h0 */
    public void m12075h0(C0645al c0645al, dv1.C1143d c1143d, File file, OutputStream outputStream, long j, long j2, long j3) {
        if (f24440T) {
            return;
        }
        this.f24458O.m6090g();
        this.f24461c.m7050e(true);
        System.gc();
        m12069k0(c1143d.f7875c, this.f24462d);
        long max = Math.max(Math.min(j, j2), 0L);
        long min = Math.min(Math.max(max, j2), j3 - 50);
        this.f24470l = Math.max(c1143d.f7875c.f7890e, 1);
        this.f24471m = 1000000 / this.f24470l;
        this.f24472n = c1143d.f7875c.f7891f;
        this.f24469k = c1143d.f7884l;
        this.f24473o = c1143d.f7880h;
        this.f24474p = c1143d.f7875c.f7893h;
        this.f24475q = c1143d.f7875c.f7892g;
        C1148dx.C1149a m23885f = c1143d.m23885f(c1143d.f7877e);
        this.f24476r = m23885f.m23843b();
        this.f24477s = m23885f.m23844a();
        this.f24478t = c1143d.f7875c.f7894i;
        boolean z = c1143d.f7885m;
        int min2 = Math.min(8192, Math.max(16, c1143d.f7875c.f7888c));
        int min3 = Math.min(8192, Math.max(16, c1143d.f7875c.f7889d));
        if (this.f24469k) {
            min2 = C2916s7.m10616i(min2);
            min3 = C2916s7.m10617h(min3);
        }
        this.f24479u = new f40();
        this.f24479u.f9089d = false;
        this.f24479u.f9088c = (int) (this.f24471m / 1000);
        this.f24479u.f9086a = min2;
        this.f24479u.f9087b = min3;
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5 m18928e = SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e();
        this.f24480v.f3980a = this.f24475q;
        this.f24480v.f3976e = m18928e.m18922h(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14265A);
        this.f24480v.f3978g = -1L;
        this.f24480v.f3981b = m18928e.m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14287W);
        long j4 = max * 1000;
        this.f24483y = (int) (j4 / this.f24471m);
        this.f24484z = (int) ((min * 1000) / this.f24471m);
        this.f24484z = Math.max(this.f24483y + 1, this.f24484z);
        f24443W = (this.f24484z - this.f24483y) * this.f24471m;
        m12079f0(this.f24483y - 60);
        this.f24455L = 0;
        this.f24444A = 0;
        this.f24481w = file;
        this.f24482x = outputStream;
        if (this.f24481w == null && this.f24482x == null) {
            C3385vy.f30703a.m12018a(c0645al.m27377b().getResources().getString(R.string.vis_export_failed_create_file));
        }
        if (this.f24481w == null && this.f24482x == null) {
            dv1.C1145f c1145f = new dv1.C1145f();
            c1145f.f7895a = false;
            dv1.m23918K(c1145f);
            return;
        }
        dv1.C1145f c1145f2 = new dv1.C1145f();
        c1145f2.f7895a = true;
        c1145f2.f7897c = 0;
        c1145f2.f7898d = 100;
        dv1.m23918K(c1145f2);
        C0743c.f4012f.m19309a(1);
        C0743c.f4015i.m19309a(0L);
        m12085c0(j4, true);
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K, 1);
        f24440T = true;
        f24437Q.m9795a(Boolean.valueOf(f24440T), Long.valueOf(j3), Boolean.valueOf(z));
        m12081e0();
    }

    /* renamed from: i0 */
    public void m12073i0(Fragment fragment, C0645al c0645al, dv1.C1143d c1143d, long j, long j2, long j3) {
        String str = c1143d.f7878f;
        if (str == null || str.length() < 1) {
            c1143d.f7878f = "/";
        }
        String str2 = c1143d.f7879g;
        if (str2 == null || str2.length() < 1) {
            c1143d.f7879g = "exported";
        }
        String m25068l = cr1.m25068l(c1143d.f7879g);
        this.f24447D = c1143d;
        this.f24448E = j;
        this.f24449F = j2;
        this.f24450G = j3;
        File m12095V = m12095V(c1143d.f7878f, m25068l, C2916s7.m10615j());
        try {
            m12095V.createNewFile();
        } catch (IOException unused) {
        }
        if (m12095V.canWrite()) {
            m12075h0(c0645al, c1143d, m12095V, null, j, j2, j3);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(C2916s7.m10614k());
        intent.putExtra("android.intent.extra.TITLE", m25068l);
        fragment.startActivityForResult(intent, 54);
    }

    /* renamed from: j0 */
    public final void m12071j0(boolean z, wf1 wf1Var, boolean z2) {
        Resources resources;
        int i;
        if (z2 || f24440T) {
            this.f24461c.m7050e(false);
            this.f24445B = false;
            f24440T = false;
            f24437Q.m9795a(Boolean.valueOf(f24440T), 0L, Boolean.FALSE);
            int i2 = 0;
            while (!this.f24445B && i2 < 50) {
                i2++;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (!this.f24445B) {
                lz1.m16363c("glThreadSignalDoneExporting timed out");
            }
            this.f24456M = null;
            this.f24460b.m4462l(false);
            C0743c.f4012f.m19309a(2);
            dv1.C1145f c1145f = new dv1.C1145f();
            c1145f.f7895a = false;
            dv1.m23918K(c1145f);
            Context m23840b = dx0.m23840b();
            if (m23840b != null) {
                if (this.f24481w != null) {
                    Uri fromFile = Uri.fromFile(this.f24481w);
                    lz1.m16365a("notify file: " + fromFile);
                    cr1.m25062r(m23840b, this.f24481w.getAbsolutePath());
                }
                if (z) {
                    if (this.f24481w != null) {
                        Uri fromFile2 = Uri.fromFile(this.f24481w);
                        m12077g0(3, m23840b, "Exported visualizer", fromFile2, cr1.m25073g(fromFile2.getPath()), "video/mp4");
                    }
                    String m6092e = wf1Var != null ? wf1Var.m6092e() : "";
                    if (m6092e == null || m6092e.length() <= 0) {
                        resources = m23840b.getResources();
                        i = R.string.vis_export_finished;
                    } else {
                        Activity m23838d = dx0.m23838d();
                        if (m23838d != null && !m23838d.isFinishing()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(m23838d);
                            builder.setMessage(m6092e);
                            builder.setTitle(R.string.vis_export_errors_title);
                            builder.setPositiveButton(R.string.dialog_ok, new DialogInterface$OnClickListenerC2777m());
                            AlertDialog create = builder.create();
                            create.show();
                            TextView textView = (TextView) create.findViewById(16908299);
                            if (textView != null) {
                                textView.setTextSize(2, 14.0f);
                            }
                        }
                    }
                } else {
                    resources = m23840b.getResources();
                    i = R.string.vis_export_canceled;
                }
                C3385vy.f30703a.m12018a(resources.getString(i));
            }
            this.f24479u = null;
            this.f24481w = null;
            m12081e0();
            if (z) {
                if (wf1Var == null || !wf1Var.m6091f()) {
                    f24439S.m12018a(Boolean.valueOf(this.f24457N));
                }
            }
        }
    }

    /* renamed from: k0 */
    public final void m12069k0(dv1.C1144e c1144e, dv1.C1144e[] c1144eArr) {
        Integer[] numArr = {Integer.valueOf(this.f24475q), Integer.valueOf(this.f24478t), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf((int) x21.f31809K0)};
        if (f24436P.m5753a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            return;
        }
        c1144e.m23881c(dv1.C1144e.m23880d(c1144eArr));
    }
}
