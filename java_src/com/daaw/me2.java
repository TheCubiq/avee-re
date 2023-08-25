package com.daaw;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
/* loaded from: classes.dex */
public final class me2 implements le2 {

    /* renamed from: a */
    public final FileChannel f18841a;

    /* renamed from: b */
    public final long f18842b;

    /* renamed from: c */
    public final long f18843c;

    public me2(FileChannel fileChannel, long j, long j2) {
        this.f18841a = fileChannel;
        this.f18842b = j;
        this.f18843c = j2;
    }

    @Override // com.daaw.le2
    /* renamed from: a */
    public final void mo16049a(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.f18841a.map(FileChannel.MapMode.READ_ONLY, this.f18842b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // com.daaw.le2
    public final long zza() {
        return this.f18843c;
    }
}
