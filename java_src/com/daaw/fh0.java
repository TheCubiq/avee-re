package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class fh0 {
    public static ww1<Integer, Boolean> a = new ww1<>();
    public static qw1<al> b = new qw1<>();
    public static qw1<List<vd0>> c = new qw1<>();
    public static qw1<vd0> d = new qw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.fh0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0050a extends l0 {
            public AbstractC0050a() {
                super(a.g);
            }

            public abstract vd0 c(Context context, Object obj);
        }

        public a() {
            super(1, false, R.drawable.ic_playlist4, R.string.libItemAction_playQueue);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            fh0.d.a(((AbstractC0050a) list2.get(size)).c(alVar.b(), list.get(size)));
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

            public abstract void c(Context context, Object obj, List<Integer> list, List<vd0> list2);
        }

        public b() {
            super(5, true, R.drawable.ic_playlist4, R.string.libItemAction_removeQueueItem);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((a) list2.get(i)).c(alVar.b(), list.get(i), arrayList, arrayList2);
            }
            fh0.c.a(arrayList2);
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
        }

        public c() {
            super(5, true, R.drawable.ic_info2, R.string.libItemAction_tipReorder);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            fh0.b.a(alVar);
        }

        @Override // com.daaw.ch0
        public boolean e() {
            return fh0.a.a(Integer.valueOf(j5.t), Boolean.FALSE).booleanValue();
        }
    }
}
