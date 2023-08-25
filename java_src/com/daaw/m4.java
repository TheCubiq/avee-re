package com.daaw;

import android.content.res.Configuration;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
/* loaded from: classes.dex */
public abstract class m4 extends PreferenceActivity {
    public z3 p;

    public final z3 a() {
        if (this.p == null) {
            this.p = z3.l(this, null);
        }
        return this.p;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().f(view, layoutParams);
    }

    public i0 b() {
        return a().w();
    }

    public void c(Toolbar toolbar) {
        a().S(toolbar);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return a().t();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        a().y();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a().C(configuration);
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        a().x();
        a().D(bundle);
        super.onCreate(bundle);
    }

    @Override // android.preference.PreferenceActivity, android.app.ListActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a().E();
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a().F(bundle);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        a().G();
    }

    @Override // android.preference.PreferenceActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        a().J();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        a().U(charSequence);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        a().P(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        a().Q(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().R(view, layoutParams);
    }
}
