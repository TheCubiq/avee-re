package com.daaw;

import android.net.Uri;
/* loaded from: classes.dex */
public final class bf1 {
    /* renamed from: a */
    public static Uri m26190a(Uri uri) {
        return sq1.m10017a0(uri.getLastPathSegment()).matches("manifest(\\(.+\\))?") ? uri : Uri.withAppendedPath(uri, "Manifest");
    }
}
