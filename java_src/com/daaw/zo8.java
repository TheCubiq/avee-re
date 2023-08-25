package com.daaw;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* loaded from: classes.dex */
public final class zo8 {

    /* renamed from: a */
    public final ep8 f35330a;

    /* renamed from: b */
    public final MediaFormat f35331b;

    /* renamed from: c */
    public final f92 f35332c;

    /* renamed from: d */
    public final Surface f35333d;

    /* renamed from: e */
    public final MediaCrypto f35334e = null;

    public zo8(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.f35330a = ep8Var;
        this.f35331b = mediaFormat;
        this.f35332c = f92Var;
        this.f35333d = surface;
    }

    /* renamed from: a */
    public static zo8 m2022a(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, MediaCrypto mediaCrypto) {
        return new zo8(ep8Var, mediaFormat, f92Var, null, null, 0);
    }

    /* renamed from: b */
    public static zo8 m2021b(ep8 ep8Var, MediaFormat mediaFormat, f92 f92Var, Surface surface, MediaCrypto mediaCrypto) {
        return new zo8(ep8Var, mediaFormat, f92Var, surface, null, 0);
    }
}
