package com.daaw;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public interface bp8 {
    void a(int i, long j);

    void b(int i, int i2, int i3, long j, int i4);

    ByteBuffer c(int i);

    void d(int i, int i2, d77 d77Var, long j, int i3);

    void e(Surface surface);

    void f(int i);

    void g(int i, boolean z);

    int h(MediaCodec.BufferInfo bufferInfo);

    void o(Bundle bundle);

    int zza();

    MediaFormat zzc();

    ByteBuffer zzf(int i);

    void zzi();

    void zzl();

    boolean zzr();
}
