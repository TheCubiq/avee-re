package com.daaw;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class gp0 {

    /* renamed from: a */
    public final Runnable f11553a;

    /* renamed from: b */
    public final CopyOnWriteArrayList<mp0> f11554b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final Map<mp0, Object> f11555c = new HashMap();

    public gp0(Runnable runnable) {
        this.f11553a = runnable;
    }

    /* renamed from: a */
    public void m21367a(Menu menu, MenuInflater menuInflater) {
        Iterator<mp0> it = this.f11554b.iterator();
        while (it.hasNext()) {
            it.next().m15866c(menu, menuInflater);
        }
    }

    /* renamed from: b */
    public void m21366b(Menu menu) {
        Iterator<mp0> it = this.f11554b.iterator();
        while (it.hasNext()) {
            it.next().m15867b(menu);
        }
    }

    /* renamed from: c */
    public boolean m21365c(MenuItem menuItem) {
        Iterator<mp0> it = this.f11554b.iterator();
        while (it.hasNext()) {
            if (it.next().m15868a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m21364d(Menu menu) {
        Iterator<mp0> it = this.f11554b.iterator();
        while (it.hasNext()) {
            it.next().m15865d(menu);
        }
    }
}
