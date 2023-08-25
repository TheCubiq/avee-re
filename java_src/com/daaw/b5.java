package com.daaw;

import android.content.Context;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.ww1;
/* loaded from: classes.dex */
public class b5 extends kt {
    public static xw1<com.daaw.avee.comp.playback.a, Integer, com.daaw.avee.comp.playback.a> c = new xw1<>();
    public static xw1<com.daaw.avee.comp.playback.a, Integer, com.daaw.avee.comp.playback.a> d = new xw1<>();
    public static ww1<Context, Integer> e = new ww1<>();
    public static ww1<Context, Integer> f = new ww1<>();
    public static ww1<Context, Integer> g = new ww1<>();
    public static ww1<Context, Integer> h = new ww1<>();
    public com.daaw.avee.comp.playback.a b = new com.daaw.avee.comp.playback.a();

    /* loaded from: classes.dex */
    public class a implements ww1.a<Integer, com.daaw.avee.comp.playback.a> {
        public a() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public com.daaw.avee.comp.playback.a b(Integer num) {
            com.daaw.avee.comp.playback.a a = (qv1.b0() ? b5.c : b5.d).a(b5.this.b, num, null);
            if (a != null) {
                b5.this.b = a;
            }
            return a;
        }
    }

    /* loaded from: classes.dex */
    public class b implements ww1.a<Context, Integer> {
        public b() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            return (qv1.b0() ? b5.e : b5.f).a(context, 0);
        }
    }

    /* loaded from: classes.dex */
    public class c implements ww1.a<Context, Integer> {
        public c() {
        }

        @Override // com.daaw.ww1.a
        /* renamed from: a */
        public Integer b(Context context) {
            ww1<Context, Integer> ww1Var;
            int i;
            if (qv1.b0()) {
                ww1Var = b5.g;
                i = 0;
            } else {
                ww1Var = b5.h;
                i = 1;
            }
            return Integer.valueOf(ww1Var.a(context, Integer.valueOf(i)).intValue() | 2);
        }
    }

    public b5() {
        VisualizerViewCore.t.b(new a(), this.a);
        VisualizerViewCore.H.b(new b(), this.a);
        VisualizerViewCore.I.b(new c(), this.a);
    }

    public static long c() {
        return qv1.b0() ? qv1.Z() / 1000 : xw0.h.a;
    }

    public static long d() {
        return qv1.b0() ? qv1.a0() / 1000 : xw0.i;
    }
}
