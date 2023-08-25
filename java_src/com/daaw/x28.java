package com.daaw;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public final class x28 {

    /* renamed from: a */
    public final AudioAttributes f32042a;

    public /* synthetic */ x28(o98 o98Var, lu7 lu7Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = it5.f13991a;
        if (i >= 29) {
            y76.m4030a(usage, 1);
        }
        if (i >= 32) {
            t07.m9667a(usage, 0);
        }
        this.f32042a = usage.build();
    }
}
