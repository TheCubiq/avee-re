package com.daaw.avee.comp.playback;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.view.SurfaceHolder;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.dx0;
import com.daaw.hw1;
import com.daaw.iw1;
import com.daaw.lw1;
import com.daaw.mw1;
import com.daaw.ow1;
import java.util.LinkedList;
import java.util.List;
/* renamed from: com.daaw.avee.comp.playback.c */
/* loaded from: classes.dex */
public class C0743c {

    /* renamed from: a */
    public static List<Object> f4007a = new LinkedList();

    /* renamed from: b */
    public static hw1 f4008b = new hw1().m20362b(new C0754k(), f4007a);

    /* renamed from: c */
    public static hw1 f4009c = new hw1().m20362b(new C0760q(), f4007a);

    /* renamed from: d */
    public static ow1<C0729a, C0729a.C0736g, C0729a> f4010d = new ow1().m13905b(new C0761r(), f4007a);

    /* renamed from: e */
    public static lw1<String, Boolean, Long, Long> f4011e = new lw1().m16454b(new C0762s(), f4007a);

    /* renamed from: f */
    public static iw1<Integer> f4012f = new iw1().m19308b(new C0763t(), f4007a);

    /* renamed from: g */
    public static hw1 f4013g = new hw1().m20362b(new C0764u(), f4007a);

    /* renamed from: h */
    public static iw1<Boolean> f4014h = new iw1().m19308b(new C0765v(), f4007a);

    /* renamed from: i */
    public static iw1<Long> f4015i = new iw1().m19308b(new C0766w(), f4007a);

    /* renamed from: j */
    public static iw1<Integer> f4016j = new iw1().m19308b(new C0767x(), f4007a);

    /* renamed from: k */
    public static iw1<Integer> f4017k = new iw1().m19308b(new C0744a(), f4007a);

    /* renamed from: l */
    public static iw1<SurfaceHolder> f4018l = new iw1().m19308b(new C0745b(), f4007a);

    /* renamed from: m */
    public static iw1<Float> f4019m = new iw1().m19308b(new C0746c(), f4007a);

    /* renamed from: n */
    public static iw1<Integer> f4020n = new iw1().m19308b(new C0747d(), f4007a);

    /* renamed from: o */
    public static mw1<Float> f4021o = new mw1().m15744b(new C0748e(), f4007a);

    /* renamed from: p */
    public static mw1<Integer> f4022p = new mw1().m15744b(new C0749f(), f4007a);

    /* renamed from: q */
    public static iw1<Boolean> f4023q = new iw1().m19308b(new C0750g(), f4007a);

    /* renamed from: r */
    public static hw1 f4024r = new hw1().m20362b(new C0751h(), f4007a);

    /* renamed from: s */
    public static iw1<Float> f4025s = new iw1().m19308b(new C0752i(), f4007a);

    /* renamed from: t */
    public static iw1<Float> f4026t = new iw1().m19308b(new C0753j(), f4007a);

    /* renamed from: u */
    public static hw1 f4027u = new hw1().m20362b(new C0755l(), f4007a);

    /* renamed from: v */
    public static iw1<Integer> f4028v = new iw1().m19308b(new C0756m(), f4007a);

    /* renamed from: w */
    public static hw1 f4029w = new hw1().m20362b(new C0757n(), f4007a);

    /* renamed from: x */
    public static mw1<AbstractC0738b.C0740b> f4030x = new mw1().m15744b(new C0758o(), f4007a);

    /* renamed from: y */
    public static iw1<AbstractC0738b.C0741c> f4031y = new iw1().m19308b(new C0759p(), f4007a);

    /* renamed from: com.daaw.avee.comp.playback.c$a */
    /* loaded from: classes.dex */
    public class C0744a implements iw1.InterfaceC1765a<Integer> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Integer num) {
            C0743c.m26713d("VIDEO_SCALING_MODE_ACTION", num.intValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$b */
    /* loaded from: classes.dex */
    public class C0745b implements iw1.InterfaceC1765a<SurfaceHolder> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(SurfaceHolder surfaceHolder) {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26828C0(surfaceHolder);
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$c */
    /* loaded from: classes.dex */
    public class C0746c implements iw1.InterfaceC1765a<Float> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Float f) {
            C0743c.m26714c("VOLUME_PERCENTAGE_ACTION", f.floatValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$d */
    /* loaded from: classes.dex */
    public class C0747d implements iw1.InterfaceC1765a<Integer> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Integer num) {
            C0743c.m26713d("VOLUME_ACTION", num.intValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$e */
    /* loaded from: classes.dex */
    public class C0748e implements mw1.InterfaceC2216a<Float> {
        @Override // com.daaw.mw1.InterfaceC2216a
        /* renamed from: b */
        public Float mo15743a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            return Float.valueOf(m26827D != null ? m26827D.m26811L() : 0.0f);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$f */
    /* loaded from: classes.dex */
    public class C0749f implements mw1.InterfaceC2216a<Integer> {
        @Override // com.daaw.mw1.InterfaceC2216a
        /* renamed from: b */
        public Integer mo15743a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            return Integer.valueOf(m26827D != null ? m26827D.m26815J() : 0);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$g */
    /* loaded from: classes.dex */
    public class C0750g implements iw1.InterfaceC1765a<Boolean> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Boolean bool) {
            C0743c.m26711f("SET_MUTE_ACTION", bool.booleanValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$h */
    /* loaded from: classes.dex */
    public class C0751h implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
            C0743c.m26715b("TOGGLE_MUTE_ACTION");
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$i */
    /* loaded from: classes.dex */
    public class C0752i implements iw1.InterfaceC1765a<Float> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Float f) {
            C0743c.m26714c("VOLUME_STEREO_BALANCE_ACTION", f.floatValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$j */
    /* loaded from: classes.dex */
    public class C0753j implements iw1.InterfaceC1765a<Float> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Float f) {
            C0743c.m26714c("CROSS_FADE_VALUE_ACTION", f.floatValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$k */
    /* loaded from: classes.dex */
    public class C0754k implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26767n0();
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$l */
    /* loaded from: classes.dex */
    public class C0755l implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26771l0();
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$m */
    /* loaded from: classes.dex */
    public class C0756m implements iw1.InterfaceC1765a<Integer> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Integer num) {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26759r0(num.intValue());
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$n */
    /* loaded from: classes.dex */
    public class C0757n implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26775j0();
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$o */
    /* loaded from: classes.dex */
    public class C0758o implements mw1.InterfaceC2216a<AbstractC0738b.C0740b> {
        @Override // com.daaw.mw1.InterfaceC2216a
        /* renamed from: b */
        public AbstractC0738b.C0740b mo15743a() {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                return m26827D.m26829C();
            }
            return null;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$p */
    /* loaded from: classes.dex */
    public class C0759p implements iw1.InterfaceC1765a<AbstractC0738b.C0741c> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(AbstractC0738b.C0741c c0741c) {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                m26827D.m26753u0(c0741c);
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$q */
    /* loaded from: classes.dex */
    public class C0760q implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
            C0743c.m26715b("EXIT_ACTION");
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$r */
    /* loaded from: classes.dex */
    public class C0761r implements ow1.InterfaceC2485a<C0729a, C0729a.C0736g, C0729a> {
        @Override // com.daaw.ow1.InterfaceC2485a
        /* renamed from: a */
        public C0729a mo13904c(C0729a c0729a, C0729a.C0736g c0736g) {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (m26827D != null) {
                return m26827D.m26817I(c0729a, c0736g);
            }
            return null;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$s */
    /* loaded from: classes.dex */
    public class C0762s implements lw1.InterfaceC2127a<String, Boolean, Long, Long> {
        @Override // com.daaw.lw1.InterfaceC2127a
        /* renamed from: b */
        public void mo16453a(String str, Boolean bool, Long l, Long l2) {
            Intent intent = new Intent("PLAY_DATA_SOURCE_ACTION");
            intent.putExtra("EXTRA_ARG_1", str);
            intent.putExtra("EXTRA_ARG_2", bool);
            intent.putExtra("EXTRA_ARG_3", l);
            intent.putExtra("EXTRA_ARG_4", l2 == null ? 0L : l2.longValue());
            C0743c.m26716a(intent);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$t */
    /* loaded from: classes.dex */
    public class C0763t implements iw1.InterfaceC1765a<Integer> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Integer num) {
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
            C0743c.m26715b(str);
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$u */
    /* loaded from: classes.dex */
    public class C0764u implements hw1.InterfaceC1626a {
        @Override // com.daaw.hw1.InterfaceC1626a
        /* renamed from: a */
        public void mo20361a() {
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$v */
    /* loaded from: classes.dex */
    public class C0765v implements iw1.InterfaceC1765a<Boolean> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Boolean bool) {
            MediaPlaybackService m26827D = MediaPlaybackService.m26827D();
            if (!bool.booleanValue()) {
                C0743c.m26715b("TIMEOUT_DISABLE_ACTION");
            } else if (m26827D != null) {
                m26827D.m26743z0(true);
            }
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$w */
    /* loaded from: classes.dex */
    public class C0766w implements iw1.InterfaceC1765a<Long> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Long l) {
            C0743c.m26712e("SEEK_ACTION", l.longValue());
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.c$x */
    /* loaded from: classes.dex */
    public class C0767x implements iw1.InterfaceC1765a<Integer> {
        @Override // com.daaw.iw1.InterfaceC1765a
        /* renamed from: a */
        public void mo19307b(Integer num) {
            C0743c.m26713d("REPEAT_MODE_ACTION", num.intValue());
        }
    }

    /* renamed from: a */
    public static void m26716a(Intent intent) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        intent.setComponent(new ComponentName(m23837e, MediaPlaybackService.class));
        m26710g(m23837e, intent);
    }

    /* renamed from: b */
    public static void m26715b(String str) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        ComponentName componentName = new ComponentName(m23837e, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.setComponent(componentName);
        m26710g(m23837e, intent);
    }

    /* renamed from: c */
    public static void m26714c(String str, float f) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        ComponentName componentName = new ComponentName(m23837e, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", f);
        intent.setComponent(componentName);
        m26710g(m23837e, intent);
    }

    /* renamed from: d */
    public static void m26713d(String str, int i) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        ComponentName componentName = new ComponentName(m23837e, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", i);
        intent.setComponent(componentName);
        m26710g(m23837e, intent);
    }

    /* renamed from: e */
    public static void m26712e(String str, long j) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        ComponentName componentName = new ComponentName(m23837e, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", j);
        intent.setComponent(componentName);
        m26710g(m23837e, intent);
    }

    /* renamed from: f */
    public static void m26711f(String str, boolean z) {
        Context m23837e = dx0.m23837e();
        if (m23837e == null) {
            return;
        }
        ComponentName componentName = new ComponentName(m23837e, MediaPlaybackService.class);
        Intent intent = new Intent(str);
        intent.putExtra("EXTRA_ARG_1", z);
        intent.setComponent(componentName);
        m26710g(m23837e, intent);
    }

    /* renamed from: g */
    public static void m26710g(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
