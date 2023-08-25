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
    public static final Object c = new Object();
    public static ArrayList<WeakReference<rl1>> d;
    public final Resources a;
    public final Resources.Theme b;

    public rl1(Context context) {
        super(context);
        if (!hs1.c()) {
            this.a = new tl1(this, context.getResources());
            this.b = null;
            return;
        }
        hs1 hs1Var = new hs1(this, context.getResources());
        this.a = hs1Var;
        Resources.Theme newTheme = hs1Var.newTheme();
        this.b = newTheme;
        newTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof rl1) || (context.getResources() instanceof tl1) || (context.getResources() instanceof hs1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || hs1.c();
    }

    public static Context b(Context context) {
        if (a(context)) {
            synchronized (c) {
                ArrayList<WeakReference<rl1>> arrayList = d;
                if (arrayList == null) {
                    d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<rl1> weakReference = d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            d.remove(size);
                        }
                    }
                    for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<rl1> weakReference2 = d.get(size2);
                        rl1 rl1Var = weakReference2 != null ? weakReference2.get() : null;
                        if (rl1Var != null && rl1Var.getBaseContext() == context) {
                            return rl1Var;
                        }
                    }
                }
                rl1 rl1Var2 = new rl1(context);
                d.add(new WeakReference<>(rl1Var2));
                return rl1Var2;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
