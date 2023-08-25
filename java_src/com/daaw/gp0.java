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
    public final Runnable a;
    public final CopyOnWriteArrayList<mp0> b = new CopyOnWriteArrayList<>();
    public final Map<mp0, Object> c = new HashMap();

    public gp0(Runnable runnable) {
        this.a = runnable;
    }

    public void a(Menu menu, MenuInflater menuInflater) {
        Iterator<mp0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void b(Menu menu) {
        Iterator<mp0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean c(MenuItem menuItem) {
        Iterator<mp0> it = this.b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void d(Menu menu) {
        Iterator<mp0> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }
}
