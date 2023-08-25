package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class hh0 {
    public static sw1<List<tx0>, Integer, be0> a = new sw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.hh0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static abstract class AbstractC0052a extends l0 {
            public AbstractC0052a() {
                super(a.g);
            }

            public abstract void c(Context context, Object obj, List<tx0> list);
        }

        public a() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                ((AbstractC0052a) list2.get(i)).c(alVar.b(), list.get(i), arrayList);
            }
            hh0.a.a(arrayList, 0, null);
        }
    }
}
