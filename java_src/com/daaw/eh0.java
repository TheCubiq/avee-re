package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.List;
/* loaded from: classes.dex */
public class eh0 {
    public static tw1<Context, String, String, al> a = new tw1<>();
    public static tw1<Context, Long, String, al> b = new tw1<>();
    public static tw1<Context, Long, String, al> c = new tw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.eh0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0049a extends l0 {
            public AbstractC0049a() {
                super(a.g);
            }

            public abstract void c(Context context, Object obj, er0<Long, String> er0Var);
        }

        public a() {
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_deletePlaylist);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            er0<Long, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0049a) list2.get(i)).c(alVar.b(), list.get(i), er0Var);
            }
            lo1<Long, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.c.a(alVar.b(), Long.valueOf(lo1Var.a.longValue()), lo1Var.b, alVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ch0 {
        public static ch0 g = new b();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(b.g);
            }

            public abstract void c(Context context, Object obj, er0<String, String> er0Var);
        }

        public b() {
            super(4, true, true, R.drawable.ic_close, R.string.libItemAction_removeStandalonePlaylist);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            er0<String, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), er0Var);
            }
            lo1<String, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.a.a(alVar.b(), lo1Var.a, lo1Var.b, alVar);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends ch0 {
        public static ch0 g = new c();

        /* loaded from: classes.dex */
        public static abstract class a extends l0 {
            public a() {
                super(c.g);
            }

            public abstract void c(Context context, Object obj, er0<Long, String> er0Var);
        }

        public c() {
            super(4, false, true, R.drawable.ic_pencil, R.string.libItemAction_rename);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            er0<Long, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), er0Var);
            }
            lo1<Long, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.b.a(alVar.b(), Long.valueOf(lo1Var.a.longValue()), lo1Var.b, alVar);
            }
        }
    }
}
