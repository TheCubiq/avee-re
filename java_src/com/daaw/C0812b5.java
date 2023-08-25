package com.daaw;

import android.content.Context;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.playback.C0729a;
import com.daaw.ww1;
/* renamed from: com.daaw.b5 */
/* loaded from: classes.dex */
public class C0812b5 extends C1983kt {

    /* renamed from: c */
    public static xw1<C0729a, Integer, C0729a> f4295c = new xw1<>();

    /* renamed from: d */
    public static xw1<C0729a, Integer, C0729a> f4296d = new xw1<>();

    /* renamed from: e */
    public static ww1<Context, Integer> f4297e = new ww1<>();

    /* renamed from: f */
    public static ww1<Context, Integer> f4298f = new ww1<>();

    /* renamed from: g */
    public static ww1<Context, Integer> f4299g = new ww1<>();

    /* renamed from: h */
    public static ww1<Context, Integer> f4300h = new ww1<>();

    /* renamed from: b */
    public C0729a f4301b = new C0729a();

    /* renamed from: com.daaw.b5$a */
    /* loaded from: classes.dex */
    public class C0813a implements ww1.InterfaceC3477a<Integer, C0729a> {
        public C0813a() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public C0729a mo5751b(Integer num) {
            C0729a m4425a = (qv1.m12087b0() ? C0812b5.f4295c : C0812b5.f4296d).m4425a(C0812b5.this.f4301b, num, null);
            if (m4425a != null) {
                C0812b5.this.f4301b = m4425a;
            }
            return m4425a;
        }
    }

    /* renamed from: com.daaw.b5$b */
    /* loaded from: classes.dex */
    public class C0814b implements ww1.InterfaceC3477a<Context, Integer> {
        public C0814b() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            return (qv1.m12087b0() ? C0812b5.f4297e : C0812b5.f4298f).m5753a(context, 0);
        }
    }

    /* renamed from: com.daaw.b5$c */
    /* loaded from: classes.dex */
    public class C0815c implements ww1.InterfaceC3477a<Context, Integer> {
        public C0815c() {
        }

        @Override // com.daaw.ww1.InterfaceC3477a
        /* renamed from: a */
        public Integer mo5751b(Context context) {
            ww1<Context, Integer> ww1Var;
            int i;
            if (qv1.m12087b0()) {
                ww1Var = C0812b5.f4299g;
                i = 0;
            } else {
                ww1Var = C0812b5.f4300h;
                i = 1;
            }
            return Integer.valueOf(ww1Var.m5753a(context, Integer.valueOf(i)).intValue() | 2);
        }
    }

    public C0812b5() {
        VisualizerViewCore.f3826t.m5752b(new C0813a(), this.f16736a);
        VisualizerViewCore.f3823H.m5752b(new C0814b(), this.f16736a);
        VisualizerViewCore.f3824I.m5752b(new C0815c(), this.f16736a);
    }

    /* renamed from: c */
    public static long m26491c() {
        return qv1.m12087b0() ? qv1.m12091Z() / 1000 : xw0.f33011h.f13044a;
    }

    /* renamed from: d */
    public static long m26490d() {
        return qv1.m12087b0() ? qv1.m12089a0() / 1000 : xw0.f33012i;
    }
}
