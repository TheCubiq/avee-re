package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class fh0 {

    /* renamed from: a */
    public static ww1<Integer, Boolean> f9596a = new ww1<>();

    /* renamed from: b */
    public static qw1<C0645al> f9597b = new qw1<>();

    /* renamed from: c */
    public static qw1<List<vd0>> f9598c = new qw1<>();

    /* renamed from: d */
    public static qw1<vd0> f9599d = new qw1<>();

    /* renamed from: com.daaw.fh0$a */
    /* loaded from: classes.dex */
    public static class C1281a extends ch0 {

        /* renamed from: g */
        public static ch0 f9600g = new C1281a();

        /* renamed from: com.daaw.fh0$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1282a extends AbstractC2004l0 {
            public AbstractC1282a() {
                super(C1281a.f9600g);
            }

            /* renamed from: c */
            public abstract vd0 mo12372c(Context context, Object obj);
        }

        public C1281a() {
            super(1, false, R.drawable.ic_playlist4, R.string.libItemAction_playQueue);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            fh0.f9599d.m12018a(((AbstractC1282a) list2.get(size)).mo12372c(c0645al.m27377b(), list.get(size)));
        }
    }

    /* renamed from: com.daaw.fh0$b */
    /* loaded from: classes.dex */
    public static class C1283b extends ch0 {

        /* renamed from: g */
        public static ch0 f9601g = new C1283b();

        /* renamed from: com.daaw.fh0$b$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1284a extends AbstractC2004l0 {
            public AbstractC1284a() {
                super(C1283b.f9601g);
            }

            /* renamed from: c */
            public abstract void mo12371c(Context context, Object obj, List<Integer> list, List<vd0> list2);
        }

        public C1283b() {
            super(5, true, R.drawable.ic_playlist4, R.string.libItemAction_removeQueueItem);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1284a) list2.get(i)).mo12371c(c0645al.m27377b(), list.get(i), arrayList, arrayList2);
            }
            fh0.f9598c.m12018a(arrayList2);
        }
    }

    /* renamed from: com.daaw.fh0$c */
    /* loaded from: classes.dex */
    public static class C1285c extends ch0 {

        /* renamed from: g */
        public static ch0 f9602g = new C1285c();

        /* renamed from: com.daaw.fh0$c$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1286a extends AbstractC2004l0 {
            public AbstractC1286a() {
                super(C1285c.f9602g);
            }
        }

        public C1285c() {
            super(5, true, R.drawable.ic_info2, R.string.libItemAction_tipReorder);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            fh0.f9597b.m12018a(c0645al);
        }

        @Override // com.daaw.ch0
        /* renamed from: e */
        public boolean mo22639e() {
            return fh0.f9596a.m5753a(Integer.valueOf(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14323t), Boolean.FALSE).booleanValue();
        }
    }
}
