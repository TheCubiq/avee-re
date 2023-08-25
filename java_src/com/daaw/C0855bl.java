package com.daaw;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
/* renamed from: com.daaw.bl */
/* loaded from: classes.dex */
public class C0855bl extends ContextWrapper {

    /* renamed from: a */
    public int f4882a;

    /* renamed from: b */
    public Resources.Theme f4883b;

    /* renamed from: c */
    public LayoutInflater f4884c;

    /* renamed from: d */
    public Configuration f4885d;

    /* renamed from: e */
    public Resources f4886e;

    /* renamed from: com.daaw.bl$a */
    /* loaded from: classes.dex */
    public static class C0856a {
        /* renamed from: a */
        public static Context m26074a(C0855bl c0855bl, Configuration configuration) {
            return c0855bl.createConfigurationContext(configuration);
        }
    }

    public C0855bl() {
        super(null);
    }

    public C0855bl(Context context, int i) {
        super(context);
        this.f4882a = i;
    }

    public C0855bl(Context context, Resources.Theme theme) {
        super(context);
        this.f4883b = theme;
    }

    /* renamed from: a */
    public void m26079a(Configuration configuration) {
        if (this.f4886e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f4885d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f4885d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    /* renamed from: b */
    public final Resources m26078b() {
        if (this.f4886e == null) {
            Configuration configuration = this.f4885d;
            this.f4886e = configuration == null ? super.getResources() : C0856a.m26074a(this, configuration).getResources();
        }
        return this.f4886e;
    }

    /* renamed from: c */
    public int m26077c() {
        return this.f4882a;
    }

    /* renamed from: d */
    public final void m26076d() {
        boolean z = this.f4883b == null;
        if (z) {
            this.f4883b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f4883b.setTo(theme);
            }
        }
        m26075e(this.f4883b, this.f4882a, z);
    }

    /* renamed from: e */
    public void m26075e(Resources.Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return m26078b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            if (this.f4884c == null) {
                this.f4884c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
            }
            return this.f4884c;
        }
        return getBaseContext().getSystemService(str);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f4883b;
        if (theme != null) {
            return theme;
        }
        if (this.f4882a == 0) {
            this.f4882a = l21.Theme_AppCompat_Light;
        }
        m26076d();
        return this.f4883b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f4882a != i) {
            this.f4882a = i;
            m26076d();
        }
    }
}
