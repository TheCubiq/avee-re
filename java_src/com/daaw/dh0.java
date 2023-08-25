package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class dh0 {
    public static sw1<Context, String, String> a = new sw1<>();
    public static rw1<Context, List<String>> b = new rw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.dh0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0048a extends l0 {
            public AbstractC0048a() {
                super(a.g);
            }

            public abstract void c(Context context, Object obj, List<String> list);
        }

        public a() {
            super(4, true, R.drawable.ic_add2, R.string.libItemAction_addToFolders);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0048a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            dh0.b.a(alVar.b(), arrayList);
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
            super(4, false, true, R.drawable.ic_close, R.string.libItemAction_removeFolder);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            er0<String, String> er0Var = new er0<>();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), er0Var);
            }
            lo1<String, String> lo1Var = er0Var.size() > 0 ? er0Var.get(er0Var.size() - 1) : null;
            if (lo1Var != null) {
                dh0.a.a(alVar.b(), lo1Var.a, lo1Var.b);
            }
        }
    }
}
