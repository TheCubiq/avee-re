package com.daaw;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* loaded from: classes.dex */
public final class zo8 {
    public final ep8 a;
    public final MediaFormat b;
    public final f92 c;
    public final Surface d;
    public final MediaCrypto e = null;

    public zo8(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.a = ep8Var;
        this.b = mediaFormat;
        this.c = f92Var;
        this.d = surface;
    }

    public static zo8 a(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, MediaCrypto mediaCrypto) {
        return new zo8(ep8Var, mediaFormat, f92Var, null, null, 0);
    }

    public static zo8 b(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, Surface surface, MediaCrypto mediaCrypto) {
        return new zo8(ep8Var, mediaFormat, f92Var, surface, null, 0);
    }
}
