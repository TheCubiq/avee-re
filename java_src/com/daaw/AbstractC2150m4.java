package com.daaw;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
/* renamed from: com.daaw.m4 */
/* loaded from: classes.dex */
public abstract class AbstractC2150m4 extends PreferenceActivity {

    /* renamed from: p */
    public AbstractC3800z3 f18431p;

    /* renamed from: a */
    public final AbstractC3800z3 m16235a() {
        if (this.f18431p == null) {
            this.f18431p = AbstractC3800z3.m2926l(this, null);
        }
        return this.f18431p;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16235a().mo2932f(view, layoutParams);
    }

    /* renamed from: b */
    public AbstractC1643i0 m16234b() {
        return m16235a().mo2915w();
    }

    /* renamed from: c */
    public void m16233c(Toolbar toolbar) {
        m16235a().mo2940S(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return m16235a().mo2918t();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        m16235a().mo2913y();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m16235a().mo2956C(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        m16235a().mo2914x();
        m16235a().mo2955D(bundle);
        super.onCreate(bundle);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m16235a().mo2954E();
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        m16235a().mo2953F(bundle);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        m16235a().mo2952G();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        m16235a().mo2949J();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m16235a().mo2938U(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        m16235a().mo2943P(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m16235a().mo2942Q(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m16235a().mo2941R(view, layoutParams);
    }
}
