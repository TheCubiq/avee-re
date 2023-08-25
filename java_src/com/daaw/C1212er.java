package com.daaw;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.Collections;
import java.util.List;
/* renamed from: com.daaw.er */
/* loaded from: classes.dex */
public final class C1212er implements gb0 {
    @Override // com.daaw.gb0
    /* renamed from: a */
    public Pair<InterfaceC3919zz, Boolean> mo21827a(InterfaceC3919zz interfaceC3919zz, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, ol1 ol1Var) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        boolean z = false;
        if ("text/vtt".equals(format.f35721u) || lastPathSegment.endsWith(".webvtt") || lastPathSegment.endsWith(".vtt")) {
            interfaceC3919zz = new ex1(format.f35713N, ol1Var);
        } else {
            if (lastPathSegment.endsWith(".aac")) {
                interfaceC3919zz = new C2902s1();
            } else if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
                interfaceC3919zz = new C2899s();
            } else if (lastPathSegment.endsWith(".mp3")) {
                interfaceC3919zz = new tq0(0, 0L);
            } else if (interfaceC3919zz == null) {
                if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5)) {
                    if (list == null) {
                        list = Collections.emptyList();
                    }
                    interfaceC3919zz = new d40(0, ol1Var, null, drmInitData, list);
                } else {
                    int i = 16;
                    if (list != null) {
                        i = 48;
                    } else {
                        list = Collections.emptyList();
                    }
                    String str = format.f35718r;
                    if (!TextUtils.isEmpty(str)) {
                        if (!"audio/mp4a-latm".equals(hq0.m20504a(str))) {
                            i |= 2;
                        }
                        if (!"video/avc".equals(hq0.m20495j(str))) {
                            i |= 4;
                        }
                    }
                    interfaceC3919zz = new do1(2, ol1Var, new C0884bs(i, list));
                }
            }
            z = true;
        }
        return Pair.create(interfaceC3919zz, Boolean.valueOf(z));
    }
}
