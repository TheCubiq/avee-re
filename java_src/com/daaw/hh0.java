package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class hh0 {

    /* renamed from: a */
    public static sw1<List<tx0>, Integer, be0> f12539a = new sw1<>();

    /* renamed from: com.daaw.hh0$a */
    /* loaded from: classes.dex */
    public static class C1536a extends ch0 {

        /* renamed from: g */
        public static ch0 f12540g = new C1536a();

        /* renamed from: com.daaw.hh0$a$a */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1537a extends AbstractC2004l0 {
            public AbstractC1537a() {
                super(C1536a.f12540g);
            }

            /* renamed from: c */
            public abstract void mo20798c(Context context, Object obj, List<tx0> list);
        }

        public C1536a() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1537a) list2.get(i)).mo20798c(c0645al.m27377b(), list.get(i), arrayList);
            }
            hh0.f12539a.m9795a(arrayList, 0, null);
        }
    }
}
