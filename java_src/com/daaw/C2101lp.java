package com.daaw;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
/* renamed from: com.daaw.lp */
/* loaded from: classes.dex */
public final class C2101lp implements InterfaceC2200mp {

    /* renamed from: a */
    public C2570pp f17584a;

    /* renamed from: b */
    public int f17585b;

    /* renamed from: c */
    public byte[] f17586c;

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: b */
    public int mo8642b(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.f17586c.length - this.f17585b;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.f17586c, this.f17585b, bArr, i, min);
        this.f17585b += min;
        return min;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: c */
    public long mo8641c(C2570pp c2570pp) {
        this.f17584a = c2570pp;
        Uri uri = c2570pp.f23115a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new tv0("Unsupported scheme: " + scheme);
        }
        String[] m10022W = sq1.m10022W(uri.getSchemeSpecificPart(), ",");
        if (m10022W.length != 2) {
            throw new tv0("Unexpected URI format: " + uri);
        }
        String str = m10022W[1];
        if (m10022W[0].contains(";base64")) {
            try {
                this.f17586c = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw new tv0("Error while parsing Base64 encoded string: " + str, e);
            }
        } else {
            this.f17586c = URLDecoder.decode(str, "US-ASCII").getBytes();
        }
        return this.f17586c.length;
    }

    @Override // com.daaw.InterfaceC2200mp
    public void close() {
        this.f17584a = null;
        this.f17586c = null;
    }

    @Override // com.daaw.InterfaceC2200mp
    /* renamed from: d */
    public Uri mo8640d() {
        C2570pp c2570pp = this.f17584a;
        if (c2570pp != null) {
            return c2570pp.f23115a;
        }
        return null;
    }
}
