package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.List;
/* loaded from: classes.dex */
public class ih0 {

    /* renamed from: a */
    public static sw1<List<tx0>, Integer, be0> f13631a = new sw1<>();

    /* renamed from: com.daaw.ih0$a */
    /* loaded from: classes.dex */
    public static class C1705a extends ch0 {

        /* renamed from: g */
        public static ch0 f13632g = new C1705a();

        /* renamed from: com.daaw.ih0$a$a */
        /* loaded from: classes.dex */
        public class C1706a implements ir1.InterfaceC1750b<List<tx0>> {
            public C1706a() {
            }

            @Override // com.daaw.ir1.InterfaceC1750b
            /* renamed from: b */
            public void mo15140a(List<tx0> list, boolean z) {
                if (z) {
                    return;
                }
                ih0.f13631a.m9795a(list, 0, null);
            }
        }

        /* renamed from: com.daaw.ih0$a$b */
        /* loaded from: classes.dex */
        public static abstract class AbstractC1707b extends AbstractC2004l0 {
            public AbstractC1707b() {
                super(C1705a.f13632g);
            }

            /* renamed from: c */
            public abstract ir1<List<tx0>> mo16894c(Context context, Object obj);
        }

        public C1705a() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.ch0
        /* renamed from: b */
        public void mo8957b(C0645al c0645al, List<Object> list, List<AbstractC2004l0> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC1707b) list2.get(i)).mo16894c(c0645al.m27377b(), list.get(i)).mo8856a(new C1706a());
            }
        }
    }
}
