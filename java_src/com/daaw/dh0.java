package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dh0 {

    /* renamed from: a */
    public static sw1<Context, String, String> f7056a = new sw1<>();

    /* renamed from: b */
    public static rw1<Context, List<String>> f7057b = new rw1<>();

    /* renamed from: com.daaw.dh0$a */
    /* loaded from: classes.dex */
    public static class C1084a extends ch0 {

        /* renamed from: g */
        public static ch0 f7058g = new C1084a();

        /* renamed from: com.daaw.dh0$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1085a extends AbstractC2004l0 {
            public AbstractC1085a() {
                super(C1084a.f7058g);
            }

            /* renamed from: c */
            public abstract void mo2219c(Context context, Object obj, List<String> list);
        }

        public C1084a() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_addToFolders);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1085a) list2.get(i)).mo2219c(c0645al.m27377b(), list.get(i), arrayList);
            }
            dh0.f7057b.m10862a(c0645al.m27377b(), arrayList);
        }
    }

    /* renamed from: com.daaw.dh0$b */
    /* loaded from: classes.dex */
    public static class C1086b extends ch0 {

        /* renamed from: g */
        public static ch0 f7059g = new C1086b();

        /* renamed from: com.daaw.dh0$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1087a extends AbstractC2004l0 {
            public AbstractC1087a() {
                super(C1086b.f7059g);
            }

            /* renamed from: c */
            public abstract void mo24413c(Context context, Object obj, er0<String, String> er0Var);
        }

        public C1086b() {
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_removeFolder);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            er0<String, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1087a) list2.get(i)).mo24413c(c0645al.m27377b(), list.get(i), er0Var);
            }
            lo1<String, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                dh0.f7056a.m9795a(c0645al.m27377b(), lo1Var.f17576a, lo1Var.f17577b);
            }
        }
    }
}
