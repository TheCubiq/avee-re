package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class tn {
    public static rw1<Context, Integer> a = new rw1<>();
    public static rw1<Context, Integer> b = new rw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static a g = new a();

        /* renamed from: com.daaw.tn$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0089a extends l0 {
            public AbstractC0089a() {
                super(a.g);
            }

            public abstract void c(Context context, Object obj, List<Integer> list);
        }

        public a() {
            super(1, false, true, R.drawable.ic_close, R.string.vis_action_duplicate);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0089a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                tn.b.a(alVar.b(), (Integer) arrayList.get(0));
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

            public abstract void c(Context context, Object obj, List<Integer> list);
        }

        public b() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                tn.a.a(alVar.b(), (Integer) arrayList.get(0));
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

            public abstract void c(Context context, Object obj, List<Integer> list);
        }

        public c() {
            super(0, false, true, R.drawable.ic_close, R.string.vis_action_remove);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            if (arrayList.size() > 0) {
                tn.a.a(alVar.b(), (Integer) arrayList.get(0));
            }
        }
    }
}
