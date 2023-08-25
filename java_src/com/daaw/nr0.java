package com.daaw;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class nr0 extends bo0 {

    /* renamed from: A0 */
    public int f20596A0;

    /* renamed from: B0 */
    public int f20597B0;

    /* renamed from: C0 */
    public String f20598C0;

    /* renamed from: D0 */
    public int f20599D0;

    /* renamed from: E0 */
    public ne0 f20600E0;

    /* renamed from: F0 */
    public WeakReference<Object> f20601F0;

    /* renamed from: G0 */
    public int f20602G0;

    public nr0(ne0 ne0Var, int i, WeakReference<Object> weakReference, Context context, eo0 eo0Var, InterfaceC3746yu<i40> interfaceC3746yu, boolean z, Handler handler, InterfaceC2251n7 interfaceC2251n7, C1372g7 c1372g7, InterfaceC2154m7... interfaceC2154m7Arr) {
        super(context, eo0Var, interfaceC3746yu, z, handler, interfaceC2251n7, c1372g7, interfaceC2154m7Arr);
        this.f20596A0 = 44100;
        this.f20597B0 = 2;
        this.f20598C0 = "audio/raw";
        this.f20602G0 = 0;
        this.f20601F0 = weakReference;
        this.f20599D0 = i;
        this.f20600E0 = ne0Var;
        kv1.m17411a(this, i, ne0Var);
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: A */
    public void mo3466A() {
        ne0 m17410b = kv1.m17410b(this, this.f20599D0, this.f20600E0);
        if (m17410b != null) {
            m17410b.mo13836e(false);
        }
        super.mo3466A();
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: B */
    public void mo5370B(boolean z) {
        ne0 m17410b = kv1.m17410b(this, this.f20599D0, this.f20600E0);
        if (m17410b != null) {
            m17410b.mo13836e(true);
        }
        super.mo5370B(z);
    }

    @Override // com.daaw.bo0, com.daaw.do0, com.daaw.AbstractC3517xa
    /* renamed from: C */
    public void mo3465C(long j, boolean z) {
        super.mo3465C(j, z);
    }

    @Override // com.daaw.bo0
    /* renamed from: F0 */
    public void mo14858F0(int i) {
        super.mo14858F0(i);
        ne0 m17410b = kv1.m17410b(this, this.f20599D0, this.f20600E0);
        if (m17410b != null) {
            m17410b.mo13840a(i);
        }
    }

    @Override // com.daaw.bo0, com.daaw.do0
    /* renamed from: g0 */
    public void mo14857g0(Format format) {
        super.mo14857g0(format);
        int i = format.f35717q;
        if (i < 0) {
            this.f20602G0 = 16;
        } else {
            this.f20602G0 = (i / format.f35707H) / format.f35706G;
        }
    }

    @Override // com.daaw.bo0, com.daaw.do0
    /* renamed from: h0 */
    public void mo14856h0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.f20596A0 = 44100;
        this.f20597B0 = 2;
        this.f20598C0 = "audio/raw";
        if (mediaFormat.containsKey("sample-rate")) {
            this.f20596A0 = mediaFormat.getInteger("sample-rate");
        }
        if (mediaFormat.containsKey("channel-count")) {
            this.f20597B0 = mediaFormat.getInteger("channel-count");
        }
        if (mediaFormat.containsKey("mime")) {
            this.f20598C0 = mediaFormat.getString("mime");
        }
        super.mo14856h0(mediaCodec, mediaFormat);
    }

    @Override // com.daaw.bo0, com.daaw.do0
    /* renamed from: l0 */
    public boolean mo14855l0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) {
        ne0 m17410b = kv1.m17410b(this, this.f20599D0, this.f20600E0);
        if (!z && (i2 & 2) == 0 && m17410b != null && i >= 0 && i < 8192 && byteBuffer != null) {
            m17410b.mo13838c(byteBuffer, j3 - 0, i, this.f20596A0, this.f20597B0, this.f20602G0, j - 0);
        }
        return super.mo14855l0(j, j2, mediaCodec, byteBuffer, i, i2, j3, z);
    }
}
