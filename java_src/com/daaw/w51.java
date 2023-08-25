package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import com.daaw.avee.R;
import com.daaw.rw1;
import com.daaw.tx0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class w51 {
    public List<Object> a = new ArrayList(1);

    /* loaded from: classes.dex */
    public class a implements rw1.a<al, Collection<tx0>> {
        public a() {
        }

        @Override // com.daaw.rw1.a
        /* renamed from: a */
        public void c(al alVar, Collection<tx0> collection) {
            tx0 next;
            Resources resources;
            int i;
            if (!i5.b(alVar.b(), alVar.a())) {
                resources = alVar.b().getResources();
                i = R.string.ringtone_failed_set_no_permission;
            } else if (collection.size() <= 0) {
                return;
            } else {
                Iterator<tx0> it = collection.iterator();
                if (!it.hasNext() || (next = it.next()) == null) {
                    return;
                }
                tx0.c k = next.k(alVar.b());
                int length = k.a.b.length();
                Context b = alVar.b();
                if (length > 0) {
                    x51.a(b, k.a.b, k.g, k.e, k.c);
                    return;
                } else {
                    resources = b.getResources();
                    i = R.string.ringtone_failed_set_not_useable;
                }
            }
            vy.a.a(resources.getString(i));
        }
    }

    public w51() {
        dj0.B.b(new a(), this.a);
    }
}
