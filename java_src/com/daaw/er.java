package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class er implements gb0 {
    @Override // com.daaw.gb0
    public Pair<zz, Boolean> a(zz zzVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, ol1 ol1Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        boolean z = false;
        if ("text/vtt".equals(format.u) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            zzVar = new ex1(format.N, ol1Var);
        } else {
            if (lastPathSegment.endsWith(".aac")) {
                zzVar = new s1();
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                zzVar = new s();
            } else if (lastPathSegment.endsWith(".mp3")) {
                zzVar = new tq0(0, 0L);
            } else if (zzVar == null) {
                if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    zzVar = new d40(0, ol1Var, null, drmInitData, list);
                } else {
                    int i = 16;
                    if (list != null) {
                        i = 48;
                    } else {
                        list = Collections.emptyList();
                    }
                    String str = format.r;
                    if (!TextUtils.isEmpty(str)) {
                        if (!"audio/mp4a-latm".equals(hq0.a(str))) {
                            i |= 2;
                        }
                        if (!"video/avc".equals(hq0.j(str))) {
                            i |= 4;
                        }
                    }
                    zzVar = new do1(2, ol1Var, new bs(i, list));
                }
            }
            z = true;
        }
        return Pair.create(zzVar, Boolean.valueOf(z));
    }
}
