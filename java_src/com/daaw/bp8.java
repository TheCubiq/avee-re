package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface bp8 {
    /* renamed from: a */
    void mo18333a(int i, long j);

    /* renamed from: b */
    void mo18332b(int i, int i2, int i3, long j, int i4);

    /* renamed from: c */
    ByteBuffer mo18331c(int i);

    /* renamed from: d */
    void mo18330d(int i, int i2, d77 d77Var, long j, int i3);

    /* renamed from: e */
    void mo18329e(Surface surface);

    /* renamed from: f */
    void mo18328f(int i);

    /* renamed from: g */
    void mo18327g(int i, boolean z);

    /* renamed from: h */
    int mo18326h(MediaCodec.BufferInfo bufferInfo);

    /* renamed from: o */
    void mo18325o(Bundle bundle);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    void zzi();

    void zzl();

    boolean zzr();
}
