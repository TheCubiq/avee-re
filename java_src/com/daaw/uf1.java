package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.uw1;
/* loaded from: classes.dex */
public class uf1 extends C1983kt {

    /* renamed from: com.daaw.uf1$a */
    /* loaded from: classes.dex */
    public class C3205a implements uw1.InterfaceC3263a<Boolean, Boolean, Integer, String, tx0> {
        public C3205a() {
        }

        @Override // com.daaw.uw1.InterfaceC3263a
        /* renamed from: b */
        public void mo3116a(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var) {
        }
    }

    public uf1() {
        MediaPlaybackService.f3863g0.m7666b(new C3205a(), this.f16736a);
    }

    /* renamed from: a */
    public boolean m8278a(tx0 tx0Var) {
        if (tx0Var == null || !tx0Var.m8736p() || SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18916k(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K) == 1) {
            return false;
        }
        Context m23839c = dx0.m23839c();
        if (m23839c != null) {
            C3385vy.f30703a.m12018a(m23839c.getResources().getString(R.string.switched_to_x, m23839c.getResources().getString(R.string.musicSys_short_exo)));
        }
        SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.m18928e().m18931c0(SharedPreferences$OnSharedPreferenceChangeListenerC1788j5.f14275K, 1);
        return true;
    }
}
