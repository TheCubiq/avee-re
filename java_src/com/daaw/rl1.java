package com.daaw;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class rl1 extends ContextWrapper {

    /* renamed from: c */
    public static final Object f25403c = new Object();

    /* renamed from: d */
    public static ArrayList<WeakReference<rl1>> f25404d;

    /* renamed from: a */
    public final Resources f25405a;

    /* renamed from: b */
    public final Resources.Theme f25406b;

    public rl1(Context context) {
        super(context);
        if (!hs1.m20440c()) {
            this.f25405a = new tl1(this, context.getResources());
            this.f25406b = null;
            return;
        }
        hs1 hs1Var = new hs1(this, context.getResources());
        this.f25405a = hs1Var;
        Resources.Theme newTheme = hs1Var.newTheme();
        this.f25406b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    /* renamed from: a */
    public static boolean m11200a(Context context) {
        if ((context instanceof rl1) || (context.getResources() instanceof tl1) || (context.getResources() instanceof hs1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || hs1.m20440c();
    }

    /* renamed from: b */
    public static Context m11199b(Context context) {
        if (m11200a(context)) {
            synchronized (f25403c) {
                ArrayList<WeakReference<rl1>> arrayList = f25404d;
                if (arrayList == null) {
                    f25404d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<rl1> weakReference = f25404d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f25404d.remove(size);
                        }
                    }
                    for (int size2 = f25404d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<rl1> weakReference2 = f25404d.get(size2);
                        rl1 rl1Var = weakReference2 != null ? weakReference2.get() : null;
                        if (rl1Var != null && rl1Var.getBaseContext() == context) {
                            return rl1Var;
                        }
                    }
                }
                rl1 rl1Var2 = new rl1(context);
                f25404d.add(new WeakReference<>(rl1Var2));
                return rl1Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f25405a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f25405a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f25406b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f25406b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
