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

    /* renamed from: a */
    public List<Object> f30893a = new ArrayList(1);

    /* renamed from: com.daaw.w51$a */
    /* loaded from: classes.dex */
    public class C3399a implements rw1.InterfaceC2894a<C0645al, Collection<tx0>> {
        public C3399a() {
        }

        @Override // com.daaw.rw1.InterfaceC2894a
        /* renamed from: a */
        public void mo2813c(C0645al c0645al, Collection<tx0> collection) {
            tx0 next;
            Resources resources;
            int i;
            if (!C1658i5.m20122b(c0645al.m27377b(), c0645al.m27378a())) {
                resources = c0645al.m27377b().getResources();
                i = R.string.ringtone_failed_set_no_permission;
            } else if (collection.size() <= 0) {
                return;
            } else {
                Iterator<tx0> it = collection.iterator();
                if (!it.hasNext() || (next = it.next()) == null) {
                    return;
                }
                tx0.C3144c m8741k = next.m8741k(c0645al.m27377b());
                int length = m8741k.f28220a.f28204b.length();
                Context m27377b = c0645al.m27377b();
                if (length > 0) {
                    x51.m5525a(m27377b, m8741k.f28220a.f28204b, m8741k.f28226g, m8741k.f28224e, m8741k.f28222c);
                    return;
                } else {
                    resources = m27377b.getResources();
                    i = R.string.ringtone_failed_set_not_useable;
                }
            }
            C3385vy.f30703a.m12018a(resources.getString(i));
        }
    }

    public w51() {
        dj0.f7138B.m10861b(new C3399a(), this.f30893a);
    }
}
