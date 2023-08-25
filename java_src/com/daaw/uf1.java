package com.daaw;

import android.content.Context;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.daaw.uw1;
/* loaded from: classes.dex */
public class uf1 extends kt {

    /* loaded from: classes.dex */
    public class a implements uw1.a<Boolean, Boolean, Integer, String, tx0> {
        public a() {
        }

        @Override // com.daaw.uw1.a
        /* renamed from: b */
        public void a(Boolean bool, Boolean bool2, Integer num, String str, tx0 tx0Var) {
        }
    }

    public uf1() {
        MediaPlaybackService.g0.b(new a(), this.a);
    }

    public boolean a(tx0 tx0Var) {
        if (tx0Var == null || !tx0Var.p() || j5.e().k(j5.K) == 1) {
            return false;
        }
        Context c = dx0.c();
        if (c != null) {
            vy.a.a(c.getResources().getString(R.string.switched_to_x, c.getResources().getString(R.string.musicSys_short_exo)));
        }
        j5.e().c0(j5.K, 1);
        return true;
    }
}
