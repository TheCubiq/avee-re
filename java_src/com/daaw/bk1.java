package com.daaw;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class bk1 implements Iterable<Intent> {
    public final ArrayList<Intent> p = new ArrayList<>();
    public final Context q;

    /* loaded from: classes.dex */
    public interface a {
        Intent f();
    }

    public bk1(Context context) {
        this.q = context;
    }

    public static bk1 h(Context context) {
        return new bk1(context);
    }

    public bk1 d(Intent intent) {
        this.p.add(intent);
        return this;
    }

    public bk1 e(Activity activity) {
        Intent f = activity instanceof a ? ((a) activity).f() : null;
        if (f == null) {
            f = as0.a(activity);
        }
        if (f != null) {
            ComponentName component = f.getComponent();
            if (component == null) {
                component = f.resolveActivity(this.q.getPackageManager());
            }
            f(component);
            d(f);
        }
        return this;
    }

    public bk1 f(ComponentName componentName) {
        int size = this.p.size();
        try {
            Context context = this.q;
            while (true) {
                Intent b = as0.b(context, componentName);
                if (b == null) {
                    return this;
                }
                this.p.add(size, b);
                context = this.q;
                componentName = b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.p.iterator();
    }

    public void j() {
        k(null);
    }

    public void k(Bundle bundle) {
        if (this.p.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.p.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (zk.h(this.q, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.q.startActivity(intent);
    }
}
