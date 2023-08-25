package com.daaw;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.List;
/* loaded from: classes.dex */
public interface gb0 {
    public static final gb0 a = new er();

    Pair<zz, Boolean> a(zz zzVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, ol1 ol1Var);
}
