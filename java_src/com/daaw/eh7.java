package com.daaw;

import android.media.AudioManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class eh7 implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: p */
    public final Handler f8493p;

    /* renamed from: q */
    public final /* synthetic */ kj7 f8494q;

    public eh7(kj7 kj7Var, Handler handler) {
        this.f8494q = kj7Var;
        this.f8493p = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.f8493p.post(new Runnable() { // from class: com.daaw.bg7
            @Override // java.lang.Runnable
            public final void run() {
                eh7 eh7Var = eh7.this;
                kj7.m17692c(eh7Var.f8494q, i);
            }
        });
    }
}
