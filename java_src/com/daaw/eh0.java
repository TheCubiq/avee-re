package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.List;
/* loaded from: classes.dex */
public class eh0 {

    /* renamed from: a */
    public static tw1<Context, String, String, C0645al> f8471a = new tw1<>();

    /* renamed from: b */
    public static tw1<Context, Long, String, C0645al> f8472b = new tw1<>();

    /* renamed from: c */
    public static tw1<Context, Long, String, C0645al> f8473c = new tw1<>();

    /* renamed from: com.daaw.eh0$a */
    /* loaded from: classes.dex */
    public static class C1185a extends ch0 {

        /* renamed from: g */
        public static ch0 f8474g = new C1185a();

        /* renamed from: com.daaw.eh0$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1186a extends AbstractC2004l0 {
            public AbstractC1186a() {
                super(C1185a.f8474g);
            }

            /* renamed from: c */
            public abstract void mo21547c(Context context, Object obj, er0<Long, String> er0Var);
        }

        public C1185a() {
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_deletePlaylist);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            er0<Long, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1186a) list2.get(i)).mo21547c(c0645al.m27377b(), list.get(i), er0Var);
            }
            lo1<Long, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.f8473c.m8756a(c0645al.m27377b(), Long.valueOf(lo1Var.f17576a.longValue()), lo1Var.f17577b, c0645al);
            }
        }
    }

    /* renamed from: com.daaw.eh0$b */
    /* loaded from: classes.dex */
    public static class C1187b extends ch0 {

        /* renamed from: g */
        public static ch0 f8475g = new C1187b();

        /* renamed from: com.daaw.eh0$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1188a extends AbstractC2004l0 {
            public AbstractC1188a() {
                super(C1187b.f8475g);
            }

            /* renamed from: c */
            public abstract void mo20659c(Context context, Object obj, er0<String, String> er0Var);
        }

        public C1187b() {
            super(4, true, true, R.drawable.ic_close, R.string.libItemAction_removeStandalonePlaylist);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            er0<String, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1188a) list2.get(i)).mo20659c(c0645al.m27377b(), list.get(i), er0Var);
            }
            lo1<String, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.f8471a.m8756a(c0645al.m27377b(), lo1Var.f17576a, lo1Var.f17577b, c0645al);
            }
        }
    }

    /* renamed from: com.daaw.eh0$c */
    /* loaded from: classes.dex */
    public static class C1189c extends ch0 {

        /* renamed from: g */
        public static ch0 f8476g = new C1189c();

        /* renamed from: com.daaw.eh0$c$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1190a extends AbstractC2004l0 {
            public AbstractC1190a() {
                super(C1189c.f8476g);
            }

            /* renamed from: c */
            public abstract void mo21548c(Context context, Object obj, er0<Long, String> er0Var);
        }

        public C1189c() {
            super(4, false, true, R.drawable.ic_pencil, R.string.libItemAction_rename);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            er0<Long, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1190a) list2.get(i)).mo21548c(c0645al.m27377b(), list.get(i), er0Var);
            }
            lo1<Long, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                eh0.f8472b.m8756a(c0645al.m27377b(), Long.valueOf(lo1Var.f17576a.longValue()), lo1Var.f17577b, c0645al);
            }
        }
    }
}
