package com.daaw;

import android.media.AudioAttributes;
/* loaded from: classes.dex */
public final class x28 {
    public final AudioAttributes a;

    public /* synthetic */ x28(o98 o98Var, lu7 lu7Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = it5.a;
        if (i >= 29) {
            y76.a(usage, 1);
        }
        if (i >= 32) {
            t07.a(usage, 0);
        }
        this.a = usage.build();
    }
}
