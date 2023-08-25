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
import com.daaw.avee.MainActivity;
import com.daaw.avee.R;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.avee.comp.playback.a;
import com.daaw.dt0;
import com.daaw.dv1;
import com.daaw.dx;
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
    public static ww1<Integer[], Boolean> P = new ww1<>();
    public static sw1<Boolean, Long, Boolean> Q = new sw1<>();
    public static ow1<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> R = new ow1<>();
    public static final qw1<Boolean> S = new qw1<>();
    public static volatile boolean T = false;
    public static long U = 0;
    public static long V = 0;
    public static long W = 0;
    public volatile s7 H;
    public dv1.f M;
    public final xw0 b;
    public vm0 c;
    public tx0.b f;
    public tx0 g;
    public com.daaw.avee.comp.playback.a i;
    public com.daaw.avee.comp.playback.a j;
    public volatile f40 u;
    public volatile File w;
    public volatile OutputStream x;
    public List<Object> a = new LinkedList();
    public dv1.e[] d = null;
    public WeakReference<VisualizerViewCore> e = new WeakReference<>(null);
    public long h = 0;
    public volatile boolean k = true;
    public volatile int l = 30;
    public volatile long m = 33333;
    public volatile float n = 8.0f;
    public volatile boolean o = true;
    public volatile float p = 320.0f;
    public volatile int q = 2;
    public volatile String r = "";
    public volatile String s = "";
    public volatile int t = 0;
    public volatile a.g v = new a.g();
    public volatile int y = 0;
    public volatile int z = 0;
    public volatile int A = 0;
    public volatile boolean B = false;
    public v C = new v(this, null);
    public dv1.d D = null;
    public long E = 0;
    public long F = 0;
    public long G = 0;
    public Handler I = new Handler();
    public volatile int J = 0;
    public int K = 0;
    public int L = 0;
    public boolean N = false;
    public wf1 O = new wf1();

    /* loaded from: classes.dex */
    public class a implements rw1.a<Integer, Activity> {
        public final /* synthetic */ xw0 a;

        public a(xw0 xw0Var) {
            this.a = xw0Var;
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(Integer num, Activity activity) {
            if (num.intValue() == 2) {
                this.a.i(num, activity, qv1.T);
                return;
            }
            this.a.i(num, activity, false);
            qv1.this.j0(false, new wf1(), false);
        }
    }

    /* loaded from: classes.dex */
    public class b implements uw1.a<Boolean, Boolean, Integer, String, tx0> {
        public final /* synthetic */ xw0 a;

        public b(xw0 xw0Var) {
            this.a = xw0Var;
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var) {
            this.a.f(bool, bool2, num, str, tx0Var, qv1.T);
        }
    }

    /* loaded from: classes.dex */
    public class c implements vw1.a<Boolean> {
        public final /* synthetic */ pv1 a;

        public c(pv1 pv1Var) {
            this.a = pv1Var;
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return Boolean.valueOf(this.a.R());
        }
    }

    /* loaded from: classes.dex */
    public class d implements vw1.a<Integer> {
        public d() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Integer a() {
            return Integer.valueOf(!qv1.T ? -1 : qv1.this.A);
        }
    }

    /* loaded from: classes.dex */
    public class e implements xw1.a<com.daaw.avee.comp.playback.a, Integer, com.daaw.avee.comp.playback.a> {
        public e() {
        }

        @Override // com.daaw.xw1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a c(com.daaw.avee.comp.playback.a aVar, Integer num) {
            StringBuilder sb;
            if (qv1.this.j == null) {
                qv1.this.j = new com.daaw.avee.comp.playback.a();
            }
            if (!qv1.T) {
                qv1.this.B = true;
                return null;
            }
            int i = qv1.this.J - qv1.this.y;
            int i2 = qv1.this.l;
            if (i < 0 || qv1.this.J > qv1.this.z) {
                return null;
            }
            int i3 = 0;
            boolean z = i >= qv1.this.z - 1;
            qv1.this.v.g = qv1.U;
            a.g gVar = qv1.this.v;
            double d = i2;
            Double.isNaN(d);
            gVar.c = (long) Math.ceil(1000000.0d / d);
            qv1.this.v.d = num.intValue();
            com.daaw.avee.comp.playback.a a = qv1.R.a(qv1.this.j, qv1.this.v, null);
            if (qv1.this.J % 15 == 0) {
                qv1 qv1Var = qv1.this;
                qv1Var.T(qv1Var.v.g);
            }
            if ((a == null || !a.k) && !z) {
                if (a != null) {
                    sb = new StringBuilder();
                    sb.append("not capturedDataFully posMs: ");
                    sb.append(qv1.this.v.g / 1000);
                    sb.append(", readjust and wait ");
                    sb.append(a.l);
                    sb.append(" / ");
                    sb.append(a.b());
                } else {
                    sb = new StringBuilder();
                    sb.append("not capturedDataFully posMs: ");
                    sb.append(qv1.this.v.g / 1000);
                    sb.append(", readjust and wait, outData is null");
                }
                lz1.a(sb.toString());
                qv1.this.d0();
                while (i3 < 10) {
                    if (a != null) {
                        qv1.this.j = a;
                    }
                    a = qv1.R.a(qv1.this.j, qv1.this.v, null);
                    if (a != null && a.k) {
                        break;
                    }
                    try {
                        Thread.sleep(500L);
                    } catch (Exception unused) {
                    }
                    i3++;
                }
                if (i3 > 0) {
                    lz1.a("didn't got with first");
                }
                if (i3 >= 10) {
                    lz1.a("failed to get capturedDataFully, gave up");
                    qv1.this.O.d("warning: failed to get audio data for frame");
                }
            }
            if (a != null) {
                qv1.this.j = a;
            }
            qv1.this.i = a;
            return a;
        }
    }

    /* loaded from: classes.dex */
    public class f implements tw1.a<tx0, vd0, tx0.b, hx0> {
        public f() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(tx0 tx0Var, vd0 vd0Var, tx0.b bVar, hx0 hx0Var) {
            xw0.f = tx0Var;
            xw0.g = bVar;
            xw0.h = hx0Var;
            if (qv1.T) {
                return;
            }
            qv1.this.f = xw0.g;
            qv1.this.g = xw0.f;
            qv1.this.h = xw0.h.a;
        }
    }

    /* loaded from: classes.dex */
    public class g implements vw1.a<f40> {
        public g() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public f40 a() {
            if (qv1.T) {
                return qv1.this.u;
            }
            qv1.this.B = true;
            qv1.this.X(null);
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class h implements sw1.a<vk1, Boolean, String> {

        /* loaded from: classes.dex */
        public class a implements Runnable {
            public final /* synthetic */ String p;

            public a(String str) {
                this.p = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qv1.this.M == null) {
                    qv1.this.M = new dv1.f();
                }
                qv1.this.M.a = true;
                qv1.this.M.b = true;
                qv1.this.M.d = 1;
                qv1.this.M.c = 0;
                qv1.this.M.e = this.p;
                dv1.K(qv1.this.M);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ wf1 p;

            public b(wf1 wf1Var) {
                this.p = wf1Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                qv1.this.j0(true, this.p, true);
            }
        }

        /* loaded from: classes.dex */
        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (qv1.this.M == null) {
                    qv1.this.M = new dv1.f();
                }
                qv1.this.M.a = qv1.T;
                qv1.this.M.b = false;
                qv1.this.M.d = Math.max(qv1.this.z - qv1.this.y, 1);
                qv1.this.M.c = Math.max(Math.min(qv1.this.J - qv1.this.y, qv1.this.M.d), 0);
                dv1.K(qv1.this.M);
            }
        }

        public h() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(vk1 vk1Var, Boolean bool, String str) {
            if (!qv1.T) {
                qv1.this.B = true;
            } else if (bool.booleanValue() && qv1.this.L < 600) {
                qv1.B(qv1.this);
                if (qv1.this.L % 30 == 0) {
                    qv1.this.I.post(new a(str));
                }
            } else {
                if (qv1.this.L >= 600) {
                    qv1.this.O.d("loading resources timeout");
                }
                if (qv1.this.u.d) {
                    return;
                }
                if (qv1.this.J == qv1.this.y) {
                    qv1.this.O.g();
                    System.gc();
                    if (qv1.this.H == null) {
                        int i = qv1.this.i != null ? qv1.this.i.f : 44100;
                        if (qv1.this.i == null) {
                            qv1.this.O.c("failed to get audio sampleRate");
                        }
                        String U = qv1.this.U(vk1Var.getWidth(), vk1Var.getHeight(), i, qv1.this.w, qv1.this.x);
                        if (U != null) {
                            qv1.this.O.a(U);
                        }
                    }
                }
                if (qv1.this.J >= qv1.this.y && qv1.this.J <= qv1.this.z && qv1.this.H != null && !qv1.this.O.f()) {
                    qv1.this.H.f();
                    if (!qv1.this.H.a(vk1Var, qv1.V, qv1.this.K)) {
                        lz1.c("failed to add video frame");
                        qv1.this.O.d("failed to add video frame");
                    }
                    if (qv1.this.i != null && qv1.this.H != null) {
                        qv1.this.i.n = qv1.V;
                        qv1.this.H.b(qv1.this.i.g(qv1.this.H.g(), qv1.this.i.c()), qv1.this.i.n);
                    }
                }
                if ((qv1.this.J == qv1.this.z || qv1.this.O.f()) && qv1.this.H != null) {
                    qv1.this.H.p(qv1.this.O);
                }
                if (qv1.this.J == qv1.this.z + 30 || qv1.this.O.f()) {
                    qv1 qv1Var = qv1.this;
                    qv1Var.X(qv1Var.O);
                    boolean unused = qv1.T = false;
                    qv1.this.I.post(new b(new wf1(qv1.this.O)));
                } else if ((qv1.this.J + 10) % 20 == 0) {
                    qv1.this.I.post(new c());
                }
                qv1 qv1Var2 = qv1.this;
                qv1Var2.f0(qv1Var2.J + 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public class i implements uw1.a<Integer, Boolean, Long, Boolean, tx0> {
        public final /* synthetic */ xw0 a;

        public i(xw0 xw0Var) {
            this.a = xw0Var;
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Integer num, Boolean bool, Long l, Boolean bool2, tx0 tx0Var) {
            if (qv1.T) {
                return;
            }
            this.a.g(num, bool, l, bool2.booleanValue(), tx0Var);
        }
    }

    /* loaded from: classes.dex */
    public class j implements ww1.a<Context, Integer> {
        public j() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public class k implements qw1.a<VisualizerViewCore> {
        public k() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(VisualizerViewCore visualizerViewCore) {
            qv1.this.e = new WeakReference(visualizerViewCore);
        }
    }

    /* loaded from: classes.dex */
    public class l implements ww1.a<Context, Integer> {
        public l() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            return 0;
        }
    }

    /* loaded from: classes.dex */
    public class m implements DialogInterface.OnClickListener {
        public m() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    /* loaded from: classes.dex */
    public class n implements vw1.a<Boolean> {
        public n() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public Boolean a() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class o implements qw1.a<al> {
        public o() {
        }

        @Override // com.daaw.qw1.a
        /* renamed from: a */
        public void b(al alVar) {
            if (alVar.c() == null) {
                return;
            }
            dv1.p(alVar);
        }
    }

    /* loaded from: classes.dex */
    public class p implements tw1.a<Fragment, al, dv1.d, Boolean> {
        public p() {
        }

        @Override // com.daaw.tw1.a
        /* renamed from: b */
        public void a(Fragment fragment, al alVar, dv1.d dVar, Boolean bool) {
            qv1 qv1Var;
            long j;
            long j2;
            long j3 = qv1.this.h;
            j5.e().g0(j5.w0, dVar.g());
            j5.e().g0(j5.x0, dVar.c.f());
            qv1.this.N = bool.booleanValue();
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
                j = dVar.i;
                j2 = dVar.j;
            }
            qv1Var.i0(fragment, alVar, dVar, j, j2, j3);
        }
    }

    /* loaded from: classes.dex */
    public class q implements pw1.a {
        public q() {
        }

        @Override // com.daaw.pw1.a
        public void a() {
            qv1.this.j0(false, new wf1(), false);
        }
    }

    /* loaded from: classes.dex */
    public class r implements sw1.a<Fragment, al, String> {
        public r() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(Fragment fragment, al alVar, String str) {
            st.g(alVar, "visExportDestDir", R.string.vis_choose_export_dir_title, str);
        }
    }

    /* loaded from: classes.dex */
    public class s implements sw1.a<dv1, Integer, Intent> {
        public s() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(dv1 dv1Var, Integer num, Intent intent) {
            if (num.intValue() != 53 && num.intValue() == 54) {
                if (intent == null) {
                    lz1.c("PICK_IMAGE_PROPERTY_REQUEST_CODE_KITKAT invalid data");
                    return;
                }
                Uri data = intent.getData();
                if (data != null) {
                    if ((intent.getFlags() & 64) != 0) {
                        lz1.c("offered FLAG_GRANT_PERSISTABLE_URI_PERMISSION");
                        try {
                            dv1Var.getActivity().getContentResolver().takePersistableUriPermission(data, 1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (qv1.this.D != null) {
                        String b = k10.b(dv1Var.getActivity(), data);
                        OutputStream outputStream = null;
                        File file = b != null ? new File(b) : null;
                        if (file != null && file.canWrite()) {
                            qv1.this.h0(new al(dv1Var.getActivity()), qv1.this.D, file, null, qv1.this.E, qv1.this.F, qv1.this.G);
                            return;
                        }
                        try {
                            outputStream = dv1Var.getActivity().getContentResolver().openOutputStream(data);
                        } catch (FileNotFoundException e2) {
                            e2.printStackTrace();
                        }
                        qv1.this.h0(new al(dv1Var.getActivity()), qv1.this.D, null, outputStream, qv1.this.E, qv1.this.F, qv1.this.G);
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public class t implements sw1.a<al, String, String> {
        public t() {
        }

        @Override // com.daaw.sw1.a
        /* renamed from: b */
        public void a(al alVar, String str, String str2) {
            if (str2.equals("visExportDestDir")) {
                dv1.I(str);
            }
        }
    }

    /* loaded from: classes.dex */
    public class u implements vw1.a<dv1.d> {
        public u() {
        }

        @Override // com.daaw.vw1.a
        /* renamed from: b */
        public dv1.d a() {
            boolean z;
            dv1.d dVar = new dv1.d();
            Integer[] numArr = {Integer.valueOf(qv1.this.q), Integer.valueOf(qv1.this.l), Integer.valueOf(Build.VERSION.SDK_INT), 0};
            if (qv1.P.a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
                qv1.this.d = new dv1.e[]{new dv1.e(0, 2160, 1080, 60, 21.0f, true, 1), new dv1.e(0, 1920, 1080, 60, 18.0f, true, 1), new dv1.e(1, 1920, 1080, 60, 18.0f, true, 0), new dv1.e(1, 1920, 1080, 30, 12.0f, true, 1), new dv1.e(1, 1920, 1080, 30, 12.0f, true, 0), new dv1.e(0, 1280, 720, 60, 12.0f, true, 0), new dv1.e(1, 1280, 720, 30, 7.5f, true, 0)};
                dVar.b = 2;
                z = true;
            } else {
                qv1.this.d = new dv1.e[]{new dv1.e(0, 1280, 720, 30, 7.5f, 2, 128.0f, 0), new dv1.e(0, 1280, 720, 25, 6.0f, 2, 128.0f, 0)};
                dVar.b = 0;
                z = false;
            }
            dVar.a = qv1.this.d;
            dv1.e d = dVar.d(dVar.b);
            dVar.c = d;
            if (d == null) {
                dVar.c = new dv1.e(0, 1920, 1080, 30, 8.0f, 1, 128.0f, 0);
            }
            int[] iArr = {0};
            dVar.d = dx.a(iArr);
            dVar.e = iArr[0];
            dVar.f = qv1.this.Y("/");
            dVar.g = "";
            if (qv1.this.f != null) {
                dVar.g = cr1.n(qv1.this.f.e + " exported");
            }
            if (dVar.g.length() < 1) {
                dVar.g = cr1.n("exported");
            }
            dVar.l = true;
            dVar.m = false;
            dVar.k = false;
            dVar.h = true;
            dVar.i = 0;
            if (qv1.this.f != null) {
                dVar.j = z ? qv1.this.f.j : Math.min(600000, qv1.this.f.j);
            } else {
                dVar.j = 0;
            }
            dVar.b(j5.e().t(j5.w0));
            dVar.c.b(j5.e().t(j5.x0));
            dVar.b = -1;
            return dVar;
        }
    }

    /* loaded from: classes.dex */
    public class v {
        public boolean a;

        public v() {
            this.a = false;
        }

        public /* synthetic */ v(qv1 qv1Var, k kVar) {
            this();
        }

        public void a() {
            this.a = false;
        }
    }

    public qv1(pv1 pv1Var, xw0 xw0Var, vm0 vm0Var) {
        this.b = xw0Var;
        this.c = vm0Var;
        o30.w.b(new k(), this.a);
        o30.A.b(new n(), this.a);
        o30.B.b(new o(), this.a);
        dv1.M.b(new p(), this.a);
        dv1.N.b(new q(), this.a);
        dv1.O.b(new r(), this.a);
        dv1.P.b(new s(), this.a);
        st.t.b(new t(), this.a);
        dv1.R.b(new u(), this.a);
        MainActivity.p0.b(new a(xw0Var), this.a);
        MediaPlaybackService.g0.b(new b(xw0Var), this.a);
        VisualizerViewCore.D.b(new c(pv1Var), this.a);
        VisualizerViewCore.E.b(new d(), this.a);
        b5.c.b(new e(), this.a);
        MediaPlaybackService.h0.b(new f(), this.a);
        VisualizerViewCore.B.b(new g(), this.a);
        VisualizerViewCore.F.b(new h(), this.a);
        MediaPlaybackService.p0.b(new i(xw0Var), this.a);
        b5.e.b(new j(), this.a);
        b5.g.b(new l(), this.a);
    }

    public static /* synthetic */ int B(qv1 qv1Var) {
        int i2 = qv1Var.L;
        qv1Var.L = i2 + 1;
        return i2;
    }

    public static long Z() {
        return W;
    }

    public static long a0() {
        return V;
    }

    public static boolean b0() {
        return T;
    }

    public static void g0(int i2, Context context, String str, Uri uri, String str2, String str3) {
        if (Build.VERSION.SDK_INT >= 24) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(uri, str3);
            PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 67108864);
            dt0.d dVar = new dt0.d(context);
            dVar.i(str2).h(str).n(R.drawable.ic_save5).g(activity).l(true).e(true);
            ((NotificationManager) context.getSystemService("notification")).notify(i2, dVar.b());
        } catch (Exception unused) {
        }
    }

    public final void T(long j2) {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U(int r18, int r19, int r20, java.io.File r21, java.io.OutputStream r22) {
        /*
            r17 = this;
            r0 = r17
            com.daaw.qv1$v r1 = r0.C
            r1.a()
            r1 = 0
            r0.X(r1)
            java.lang.String r2 = "initialize VideoSequenceEncoder"
            com.daaw.lz1.c(r2)
            com.daaw.s7 r2 = new com.daaw.s7
            r2.<init>()
            r0.H = r2
            if (r21 != 0) goto L23
            if (r22 == 0) goto L23
            java.lang.String r2 = "aveeexport"
            java.io.File r2 = java.io.File.createTempFile(r2, r1)     // Catch: java.io.IOException -> L23
            r3 = r2
            goto L25
        L23:
            r3 = r21
        L25:
            r15 = 1
            if (r3 == 0) goto L79
            com.daaw.s7 r2 = r0.H
            int r5 = r0.l
            float r8 = r0.n
            boolean r9 = r0.o
            float r10 = r0.p
            int r11 = r0.q
            java.lang.String r13 = r0.r
            java.lang.String r14 = r0.s
            int r12 = r0.t
            r4 = r22
            r6 = r18
            r7 = r19
            r16 = r12
            r12 = r20
            r1 = 1
            r15 = r16
            java.lang.String r2 = r2.l(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L77
            com.daaw.qv1$v r3 = r0.C
            r3.a = r1
            int r1 = r0.l
            r3 = 40
            java.lang.String r4 = "Failed to initialize encoder: "
            if (r1 <= r3) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = " Try lower value for Fps?"
            goto L6f
        L67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
        L6f:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L80
        L77:
            r1 = 0
            goto L80
        L79:
            r1 = 1
            com.daaw.qv1$v r2 = r0.C
            r2.a = r1
            java.lang.String r1 = "Failed to create file"
        L80:
            if (r1 == 0) goto L85
            com.daaw.lz1.c(r1)
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.qv1.U(int, int, int, java.io.File, java.io.OutputStream):java.lang.String");
    }

    public File V(String str, String str2, String str3) {
        return W(str, str2, str3, 0);
    }

    public File W(String str, String str2, String str3, int i2) {
        File file = new File(str, cr1.n(str2 + " " + i2 + str3));
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.isDirectory()) {
            parentFile.mkdirs();
        }
        return (!file.exists() || i2 >= 1000) ? file : W(str, str2, str3, i2 + 1);
    }

    public void X(wf1 wf1Var) {
        if (this.H != null) {
            this.H.e(wf1Var);
            this.H.m();
            this.H = null;
        }
    }

    public final String Y(String str) {
        File file;
        try {
            file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        } catch (Exception unused) {
            file = null;
        }
        if (file == null) {
            try {
                file = dx0.e().getFilesDir();
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

    public final long c0(long j2, boolean z) {
        com.daaw.avee.comp.playback.c.i.a(Long.valueOf(Math.max(0L, j2 - 300000) / 1000));
        com.daaw.avee.comp.playback.c.f.a(1);
        return 300L;
    }

    public void d0() {
    }

    public void e0() {
        VisualizerViewCore visualizerViewCore = this.e.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.n();
        }
    }

    public final void f0(int i2) {
        this.J = i2;
        this.K = this.J - this.y;
        int i3 = this.l;
        V = s7.c(this.K, i3);
        U = Math.max(0L, s7.c(this.J, i3));
    }

    public void h0(al alVar, dv1.d dVar, File file, OutputStream outputStream, long j2, long j3, long j4) {
        if (T) {
            return;
        }
        this.O.g();
        this.c.e(true);
        System.gc();
        k0(dVar.c, this.d);
        long max = Math.max(Math.min(j2, j3), 0L);
        long min = Math.min(Math.max(max, j3), j4 - 50);
        this.l = Math.max(dVar.c.e, 1);
        this.m = 1000000 / this.l;
        this.n = dVar.c.f;
        this.k = dVar.l;
        this.o = dVar.h;
        this.p = dVar.c.h;
        this.q = dVar.c.g;
        dx.a f2 = dVar.f(dVar.e);
        this.r = f2.b();
        this.s = f2.a();
        this.t = dVar.c.i;
        boolean z = dVar.m;
        int min2 = Math.min(8192, Math.max(16, dVar.c.c));
        int min3 = Math.min(8192, Math.max(16, dVar.c.d));
        if (this.k) {
            min2 = s7.i(min2);
            min3 = s7.h(min3);
        }
        this.u = new f40();
        this.u.d = false;
        this.u.c = (int) (this.m / 1000);
        this.u.a = min2;
        this.u.b = min3;
        j5 e2 = j5.e();
        this.v.a = this.q;
        this.v.e = e2.h(j5.A);
        this.v.g = -1L;
        this.v.b = e2.k(j5.W);
        long j5 = max * 1000;
        this.y = (int) (j5 / this.m);
        this.z = (int) ((min * 1000) / this.m);
        this.z = Math.max(this.y + 1, this.z);
        W = (this.z - this.y) * this.m;
        f0(this.y - 60);
        this.L = 0;
        this.A = 0;
        this.w = file;
        this.x = outputStream;
        if (this.w == null && this.x == null) {
            vy.a.a(alVar.b().getResources().getString(R.string.vis_export_failed_create_file));
        }
        if (this.w == null && this.x == null) {
            dv1.f fVar = new dv1.f();
            fVar.a = false;
            dv1.K(fVar);
            return;
        }
        dv1.f fVar2 = new dv1.f();
        fVar2.a = true;
        fVar2.c = 0;
        fVar2.d = 100;
        dv1.K(fVar2);
        com.daaw.avee.comp.playback.c.f.a(1);
        com.daaw.avee.comp.playback.c.i.a(0L);
        c0(j5, true);
        j5.e().c0(j5.K, 1);
        T = true;
        Q.a(Boolean.valueOf(T), Long.valueOf(j4), Boolean.valueOf(z));
        e0();
    }

    public void i0(Fragment fragment, al alVar, dv1.d dVar, long j2, long j3, long j4) {
        String str = dVar.f;
        if (str == null || str.length() < 1) {
            dVar.f = "/";
        }
        String str2 = dVar.g;
        if (str2 == null || str2.length() < 1) {
            dVar.g = "exported";
        }
        String l2 = cr1.l(dVar.g);
        this.D = dVar;
        this.E = j2;
        this.F = j3;
        this.G = j4;
        File V2 = V(dVar.f, l2, s7.j());
        try {
            V2.createNewFile();
        } catch (IOException unused) {
        }
        if (V2.canWrite()) {
            h0(alVar, dVar, V2, null, j2, j3, j4);
            return;
        }
        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType(s7.k());
        intent.putExtra("android.intent.extra.TITLE", l2);
        fragment.startActivityForResult(intent, 54);
    }

    public final void j0(boolean z, wf1 wf1Var, boolean z2) {
        Resources resources;
        int i2;
        if (z2 || T) {
            this.c.e(false);
            this.B = false;
            T = false;
            Q.a(Boolean.valueOf(T), 0L, Boolean.FALSE);
            int i3 = 0;
            while (!this.B && i3 < 50) {
                i3++;
                try {
                    Thread.sleep(100L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
            if (!this.B) {
                lz1.c("glThreadSignalDoneExporting timed out");
            }
            this.M = null;
            this.b.l(false);
            com.daaw.avee.comp.playback.c.f.a(2);
            dv1.f fVar = new dv1.f();
            fVar.a = false;
            dv1.K(fVar);
            Context b2 = dx0.b();
            if (b2 != null) {
                if (this.w != null) {
                    Uri fromFile = Uri.fromFile(this.w);
                    lz1.a("notify file: " + fromFile);
                    cr1.r(b2, this.w.getAbsolutePath());
                }
                if (z) {
                    if (this.w != null) {
                        Uri fromFile2 = Uri.fromFile(this.w);
                        g0(3, b2, "Exported visualizer", fromFile2, cr1.g(fromFile2.getPath()), "video/mp4");
                    }
                    String e3 = wf1Var != null ? wf1Var.e() : "";
                    if (e3 == null || e3.length() <= 0) {
                        resources = b2.getResources();
                        i2 = R.string.vis_export_finished;
                    } else {
                        Activity d2 = dx0.d();
                        if (d2 != null && !d2.isFinishing()) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(d2);
                            builder.setMessage(e3);
                            builder.setTitle(R.string.vis_export_errors_title);
                            builder.setPositiveButton(R.string.dialog_ok, new m());
                            AlertDialog create = builder.create();
                            create.show();
                            TextView textView = (TextView) create.findViewById(16908299);
                            if (textView != null) {
                                textView.setTextSize(2, 14.0f);
                            }
                        }
                    }
                } else {
                    resources = b2.getResources();
                    i2 = R.string.vis_export_canceled;
                }
                vy.a.a(resources.getString(i2));
            }
            this.u = null;
            this.w = null;
            e0();
            if (z) {
                if (wf1Var == null || !wf1Var.f()) {
                    S.a(Boolean.valueOf(this.N));
                }
            }
        }
    }

    public final void k0(dv1.e eVar, dv1.e[] eVarArr) {
        Integer[] numArr = {Integer.valueOf(this.q), Integer.valueOf(this.t), Integer.valueOf(Build.VERSION.SDK_INT), Integer.valueOf((int) x21.K0)};
        if (P.a(numArr, Boolean.FALSE).booleanValue() && numArr[2].equals(numArr[3])) {
            return;
        }
        eVar.c(dv1.e.d(eVarArr));
    }
}
