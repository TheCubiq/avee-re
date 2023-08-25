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

    /* renamed from: p */
    public final ArrayList<Intent> f4874p = new ArrayList<>();

    /* renamed from: q */
    public final Context f4875q;

    /* renamed from: com.daaw.bk1$a */
    /* loaded from: classes.dex */
    public interface InterfaceC0854a {
        /* renamed from: f */
        Intent mo13663f();
    }

    public bk1(Context context) {
        this.f4875q = context;
    }

    /* renamed from: h */
    public static bk1 m26090h(Context context) {
        return new bk1(context);
    }

    /* renamed from: d */
    public bk1 m26093d(Intent intent) {
        this.f4874p.add(intent);
        return this;
    }

    /* renamed from: e */
    public bk1 m26092e(Activity activity) {
        Intent mo13663f = activity instanceof InterfaceC0854a ? ((InterfaceC0854a) activity).mo13663f() : null;
        if (mo13663f == null) {
            mo13663f = as0.m27111a(activity);
        }
        if (mo13663f != null) {
            ComponentName component = mo13663f.getComponent();
            if (component == null) {
                component = mo13663f.resolveActivity(this.f4875q.getPackageManager());
            }
            m26091f(component);
            m26093d(mo13663f);
        }
        return this;
    }

    /* renamed from: f */
    public bk1 m26091f(ComponentName componentName) {
        int size = this.f4874p.size();
        try {
            Context context = this.f4875q;
            while (true) {
                Intent m27110b = as0.m27110b(context, componentName);
                if (m27110b == null) {
                    return this;
                }
                this.f4874p.add(size, m27110b);
                context = this.f4875q;
                componentName = m27110b.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f4874p.iterator();
    }

    /* renamed from: j */
    public void m26089j() {
        m26088k(null);
    }

    /* renamed from: k */
    public void m26088k(Bundle bundle) {
        if (this.f4874p.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f4874p.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C3866zk.m2175h(this.f4875q, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f4875q.startActivity(intent);
    }
}
