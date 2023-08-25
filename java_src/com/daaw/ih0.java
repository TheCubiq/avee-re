package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import com.daaw.ir1;
import java.util.List;
/* loaded from: classes.dex */
public class ih0 {
    public static sw1<List<tx0>, Integer, be0> a = new sw1<>();

    /* loaded from: classes.dex */
    public static class a extends ch0 {
        public static ch0 g = new a();

        /* renamed from: com.daaw.ih0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0054a implements ir1.b<List<tx0>> {
            public C0054a() {
            }

            @Override // com.daaw.ir1.b
            /* renamed from: b */
            public void a(List<tx0> list, boolean z) {
                if (z) {
                    return;
                }
                ih0.a.a(list, 0, null);
            }
        }

        /* loaded from: classes.dex */
        public static abstract class b extends l0 {
            public b() {
                super(a.g);
            }

            public abstract ir1<List<tx0>> c(Context context, Object obj);
        }

        public a() {
            super(1, false, true, R.drawable.ic_playlist4, R.string.libItemAction_play);
        }

        @Override // com.daaw.ch0
        public void b(al alVar, List<Object> list, List<l0> list2) {
            for (int i = 0; i < list.size(); i++) {
                ((b) list2.get(i)).c(alVar.b(), list.get(i)).a(new C0054a());
            }
        }
    }
}
