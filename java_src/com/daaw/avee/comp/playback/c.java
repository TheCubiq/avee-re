package com.daaw.avee.comp.playback;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.SurfaceHolder;
import com.daaw.avee.comp.playback.a;
import com.daaw.avee.comp.playback.b;
import com.daaw.dx0;
import com.daaw.hw1;
import com.daaw.iw1;
import com.daaw.lw1;
import com.daaw.mw1;
import com.daaw.ow1;
import java.util.LinkedList;
import java.util.List;
/* loaded from: classes.dex */
public class c {
    public static List<Object> a = new LinkedList();
    public static hw1 b = new hw1().b(new k(), a);
    public static hw1 c = new hw1().b(new q(), a);
    public static ow1<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> d = new ow1().b(new r(), a);
    public static lw1<String, Boolean, Long, Long> e = new lw1().b(new s(), a);
    public static iw1<Integer> f = new iw1().b(new t(), a);
    public static hw1 g = new hw1().b(new u(), a);
    public static iw1<Boolean> h = new iw1().b(new v(), a);
    public static iw1<Long> i = new iw1().b(new w(), a);
    public static iw1<Integer> j = new iw1().b(new x(), a);
    public static iw1<Integer> k = new iw1().b(new a(), a);
    public static iw1<SurfaceHolder> l = new iw1().b(new b(), a);
    public static iw1<Float> m = new iw1().b(new C0043c(), a);
    public static iw1<Integer> n = new iw1().b(new d(), a);
    public static mw1<Float> o = new mw1().b(new e(), a);
    public static mw1<Integer> p = new mw1().b(new f(), a);
    public static iw1<Boolean> q = new iw1().b(new g(), a);
    public static hw1 r = new hw1().b(new h(), a);
    public static iw1<Float> s = new iw1().b(new i(), a);
    public static iw1<Float> t = new iw1().b(new j(), a);
    public static hw1 u = new hw1().b(new l(), a);
    public static iw1<Integer> v = new iw1().b(new m(), a);
    public static hw1 w = new hw1().b(new n(), a);
    public static mw1<b.C0042b> x = new mw1().b(new o(), a);
    public static iw1<b.c> y = new iw1().b(new p(), a);

    /* loaded from: classes.dex */
    public class a implements iw1.a<Integer> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Integer num) {
            c.d("VIDEO_SCALING_MODE_ACTION", num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class b implements iw1.a<SurfaceHolder> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(SurfaceHolder surfaceHolder) {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.C0(surfaceHolder);
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0043c implements iw1.a<Float> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Float f) {
            c.c("VOLUME_PERCENTAGE_ACTION", f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class d implements iw1.a<Integer> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Integer num) {
            c.d("VOLUME_ACTION", num.intValue());
        }
    }

    /* loaded from: classes.dex */
    public class e implements mw1.a<Float> {
        @Override // com.daaw.mw1.a
        /* renamed from: b */
        public Float a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            return Float.valueOf(D != null ? D.L() : 0.0f);
        }
    }

    /* loaded from: classes.dex */
    public class f implements mw1.a<Integer> {
        @Override // com.daaw.mw1.a
        /* renamed from: b */
        public Integer a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            return Integer.valueOf(D != null ? D.J() : 0);
        }
    }

    /* loaded from: classes.dex */
    public class g implements iw1.a<Boolean> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            c.f("SET_MUTE_ACTION", bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    public class h implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
            c.b("TOGGLE_MUTE_ACTION");
        }
    }

    /* loaded from: classes.dex */
    public class i implements iw1.a<Float> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Float f) {
            c.c("VOLUME_STEREO_BALANCE_ACTION", f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class j implements iw1.a<Float> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Float f) {
            c.c("CROSS_FADE_VALUE_ACTION", f.floatValue());
        }
    }

    /* loaded from: classes.dex */
    public class k implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.n0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class l implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.l0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class m implements iw1.a<Integer> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Integer num) {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.r0(num.intValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public class n implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.j0();
            }
        }
    }

    /* loaded from: classes.dex */
    public class o implements mw1.a<b.C0042b> {
        @Override // com.daaw.mw1.a
        /* renamed from: b */
        public b.C0042b a() {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                return D.C();
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class p implements iw1.a<b.c> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(b.c cVar) {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                D.u0(cVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public class q implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
            c.b("EXIT_ACTION");
        }
    }

    /* loaded from: classes.dex */
    public class r implements ow1.a<com.daaw.avee.comp.playback.a, a.g, com.daaw.avee.comp.playback.a> {
        @Override // com.daaw.ow1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a c(com.daaw.avee.comp.playback.a aVar, a.g gVar) {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (D != null) {
                return D.I(aVar, gVar);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public class s implements lw1.a<String, Boolean, Long, Long> {
        @Override // com.daaw.lw1.a
        /* renamed from: b */
        public void a(String str, Boolean bool, Long l, Long l2) {
            Intent intent = new Intent("PLAY_DATA_SOURCE_ACTION");
            intent.putExtra("EXTRA_ARG_1", str);
            intent.putExtra("EXTRA_ARG_2", bool);
            intent.putExtra("EXTRA_ARG_3", l);
            intent.putExtra("EXTRA_ARG_4", l2 == null ? 0L : l2.longValue());
            c.a(intent);
        }
    }

    /* loaded from: classes.dex */
    public class t implements iw1.a<Integer> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Integer num) {
            String str;
            int intValue = num.intValue();
            if (intValue == 1) {
                str = "PLAY_ACTION";
            } else if (intValue == 2) {
                str = "PAUSE_ACTION";
            } else if (intValue == 3) {
                str = "STOP_ACTION";
            } else if (intValue != 4) {
                return;
            } else {
                str = "TOGGLE_PAUSE_ACTION";
            }
            c.b(str);
        }
    }

    /* loaded from: classes.dex */
    public class u implements hw1.a {
        @Override // com.daaw.hw1.a
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public class v implements iw1.a<Boolean> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Boolean bool) {
            MediaPlaybackService D = MediaPlaybackService.D();
            if (!bool.booleanValue()) {
                c.b("TIMEOUT_DISABLE_ACTION");
            } else if (D != null) {
                D.z0(true);
            }
        }
    }

    /* loaded from: classes.dex */
    public class w implements iw1.a<Long> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Long l) {
            c.e("SEEK_ACTION", l.longValue());
        }
    }

    /* loaded from: classes.dex */
    public class x implements iw1.a<Integer> {
        @Override // com.daaw.iw1.a
        /* renamed from: a */
        public void b(Integer num) {
            c.d("REPEAT_MODE_ACTION", num.intValue());
        }
    }

    public static void a(Intent intent) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        intent.setComponent(new ComponentName(e2, MediaPlaybackService.class));
        g(e2, intent);
    }

    public static void b(String str) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(e2, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.setComponent(componentName);
        g(e2, intent);
    }

    public static void c(String str, float f2) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(e2, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", f2);
        intent.setComponent(componentName);
        g(e2, intent);
    }

    public static void d(String str, int i2) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(e2, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", i2);
        intent.setComponent(componentName);
        g(e2, intent);
    }

    public static void e(String str, long j2) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(e2, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", j2);
        intent.setComponent(componentName);
        g(e2, intent);
    }

    public static void f(String str, boolean z) {
        Context e2 = dx0.e();
        if (e2 == null) {
            return;
        }
        ComponentName componentName = new ComponentName(e2, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", z);
        intent.setComponent(componentName);
        g(e2, intent);
    }

    public static void g(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
