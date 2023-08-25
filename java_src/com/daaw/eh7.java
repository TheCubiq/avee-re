package com.daaw;

import android.media.AudioManager;
import android.os.Handler;
/* loaded from: classes.dex */
public final class eh7 implements AudioManager.OnAudioFocusChangeListener {
    public final Handler p;
    public final /* synthetic */ kj7 q;

    public eh7(kj7 kj7Var, Handler handler) {
        this.q = kj7Var;
        this.p = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i) {
        this.p.post(new Runnable() { // from class: com.daaw.bg7
            @Override // java.lang.Runnable
            public final void run() {
                eh7 eh7Var = eh7.this;
                kj7.c(eh7Var.q, i);
            }
        });
    }
}
