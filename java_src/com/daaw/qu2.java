package com.daaw;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzatd;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
@TargetApi(19)
/* loaded from: classes.dex */
public abstract class qu2 extends ip2 {

    /* renamed from: P */
    public static final byte[] f24332P = pz2.m12834p("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");

    /* renamed from: A */
    public ByteBuffer[] f24333A;

    /* renamed from: B */
    public ByteBuffer[] f24334B;

    /* renamed from: C */
    public long f24335C;

    /* renamed from: D */
    public int f24336D;

    /* renamed from: E */
    public int f24337E;

    /* renamed from: F */
    public boolean f24338F;

    /* renamed from: G */
    public boolean f24339G;

    /* renamed from: H */
    public int f24340H;

    /* renamed from: I */
    public int f24341I;

    /* renamed from: J */
    public boolean f24342J;

    /* renamed from: K */
    public boolean f24343K;

    /* renamed from: L */
    public boolean f24344L;

    /* renamed from: M */
    public boolean f24345M;

    /* renamed from: N */
    public boolean f24346N;

    /* renamed from: O */
    public as2 f24347O;

    /* renamed from: i */
    public final su2 f24348i;

    /* renamed from: j */
    public final bs2 f24349j;

    /* renamed from: k */
    public final bs2 f24350k;

    /* renamed from: l */
    public final cq2 f24351l;

    /* renamed from: m */
    public final List f24352m;

    /* renamed from: n */
    public final MediaCodec.BufferInfo f24353n;

    /* renamed from: o */
    public zzatd f24354o;

    /* renamed from: p */
    public MediaCodec f24355p;

    /* renamed from: q */
    public ju2 f24356q;

    /* renamed from: r */
    public boolean f24357r;

    /* renamed from: s */
    public boolean f24358s;

    /* renamed from: t */
    public boolean f24359t;

    /* renamed from: u */
    public boolean f24360u;

    /* renamed from: v */
    public boolean f24361v;

    /* renamed from: w */
    public boolean f24362w;

    /* renamed from: x */
    public boolean f24363x;

    /* renamed from: y */
    public boolean f24364y;

    /* renamed from: z */
    public boolean f24365z;

    public qu2(int i, su2 su2Var, ks2 ks2Var, boolean z) {
        super(i);
        az2.m26583e(pz2.f23547a >= 16);
        this.f24348i = su2Var;
        this.f24349j = new bs2(0);
        this.f24350k = new bs2(0);
        this.f24351l = new cq2();
        this.f24352m = new ArrayList();
        this.f24353n = new MediaCodec.BufferInfo();
        this.f24340H = 0;
        this.f24341I = 0;
    }

    /* renamed from: y */
    private final void m12209y() {
        if (this.f24341I == 2) {
            mo12214L();
            m12216J();
            return;
        }
        this.f24345M = true;
        mo9958F();
    }

    /* renamed from: A */
    public ju2 mo9963A(su2 su2Var, zzatd zzatdVar, boolean z) {
        return av2.m26959c(zzatdVar.f36794u, false);
    }

    /* renamed from: B */
    public abstract void mo9962B(ju2 ju2Var, MediaCodec mediaCodec, zzatd zzatdVar, MediaCrypto mediaCrypto);

    /* renamed from: C */
    public abstract void mo9961C(String str, long j, long j2);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if (r6.f36799z == r0.f36799z) goto L21;
     */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo9960D(zzatd zzatdVar) {
        zzatd zzatdVar2 = this.f24354o;
        this.f24354o = zzatdVar;
        if (!pz2.m12835o(zzatdVar.f36797x, zzatdVar2 == null ? null : zzatdVar2.f36797x) && this.f24354o.f36797x != null) {
            throw kp2.m17548a(new IllegalStateException("Media requires a DrmSessionManager"), m19536l());
        }
        MediaCodec mediaCodec = this.f24355p;
        boolean z = true;
        if (mediaCodec == null || !mo12213M(mediaCodec, this.f24356q.f15416b, zzatdVar2, this.f24354o)) {
            if (this.f24342J) {
                this.f24341I = 1;
                return;
            }
            mo12214L();
            m12216J();
            return;
        }
        this.f24339G = true;
        this.f24340H = 1;
        if (this.f24359t) {
            zzatd zzatdVar3 = this.f24354o;
            if (zzatdVar3.f36798y == zzatdVar2.f36798y) {
            }
        }
        z = false;
        this.f24364y = z;
    }

    /* renamed from: E */
    public abstract void mo9959E(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* renamed from: F */
    public void mo9958F() {
    }

    /* renamed from: G */
    public abstract boolean mo9957G(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z);

    /* renamed from: H */
    public final MediaCodec m12218H() {
        return this.f24355p;
    }

    /* renamed from: I */
    public final ju2 m12217I() {
        return this.f24356q;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b5  */
    /* renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m12216J() {
        zzatd zzatdVar;
        boolean z;
        if (this.f24355p != null || (zzatdVar = this.f24354o) == null) {
            return;
        }
        ju2 ju2Var = this.f24356q;
        if (ju2Var == null) {
            try {
                ju2Var = mo9963A(this.f24348i, zzatdVar, false);
                this.f24356q = ju2Var;
                if (ju2Var == null) {
                    throw kp2.m17548a(new pu2(this.f24354o, (Throwable) null, false, -49999), m19536l());
                }
            } catch (vu2 e) {
                throw kp2.m17548a(new pu2(this.f24354o, (Throwable) e, false, -49998), m19536l());
            }
        }
        if (!mo12212N(ju2Var)) {
            return;
        }
        String str = this.f24356q.f15415a;
        zzatd zzatdVar2 = this.f24354o;
        int i = pz2.f23547a;
        this.f24357r = i < 21 && zzatdVar2.f36796w.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
        this.f24358s = i < 18 || (i == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i == 19 && pz2.f23550d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
        try {
            if (i < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                String str2 = pz2.f23548b;
                if ("flounder".equals(str2) || "flounder_lte".equals(str2) || "grouper".equals(str2) || "tilapia".equals(str2)) {
                    z = true;
                    this.f24359t = z;
                    this.f24360u = i > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                    this.f24361v = (i > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(pz2.f23548b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
                    this.f24362w = i != 21 && "OMX.google.aac.decoder".equals(str);
                    this.f24363x = i > 18 && this.f24354o.f36779G == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    nz2.m14710a("createCodec:" + str);
                    this.f24355p = MediaCodec.createByCodecName(str);
                    nz2.m14709b();
                    nz2.m14710a("configureCodec");
                    mo9962B(this.f24356q, this.f24355p, this.f24354o, null);
                    nz2.m14709b();
                    nz2.m14710a("startCodec");
                    this.f24355p.start();
                    nz2.m14709b();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    mo9961C(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.f24333A = this.f24355p.getInputBuffers();
                    this.f24334B = this.f24355p.getOutputBuffers();
                    this.f24335C = zzb() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.f24336D = -1;
                    this.f24337E = -1;
                    this.f24346N = true;
                    this.f24347O.f3518a++;
                    return;
                }
            }
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            nz2.m14710a("createCodec:" + str);
            this.f24355p = MediaCodec.createByCodecName(str);
            nz2.m14709b();
            nz2.m14710a("configureCodec");
            mo9962B(this.f24356q, this.f24355p, this.f24354o, null);
            nz2.m14709b();
            nz2.m14710a("startCodec");
            this.f24355p.start();
            nz2.m14709b();
            long elapsedRealtime22 = SystemClock.elapsedRealtime();
            mo9961C(str, elapsedRealtime22, elapsedRealtime22 - elapsedRealtime3);
            this.f24333A = this.f24355p.getInputBuffers();
            this.f24334B = this.f24355p.getOutputBuffers();
            this.f24335C = zzb() != 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
            this.f24336D = -1;
            this.f24337E = -1;
            this.f24346N = true;
            this.f24347O.f3518a++;
            return;
        } catch (Exception e2) {
            throw kp2.m17548a(new pu2(this.f24354o, (Throwable) e2, false, str), m19536l());
        }
        z = false;
        this.f24359t = z;
        this.f24360u = i > 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
        this.f24361v = (i > 23 && "OMX.google.vorbis.decoder".equals(str)) || (i <= 19 && "hb2000".equals(pz2.f23548b) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str)));
        this.f24362w = i != 21 && "OMX.google.aac.decoder".equals(str);
        this.f24363x = i > 18 && this.f24354o.f36779G == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    /* renamed from: K */
    public void mo12215K(bs2 bs2Var) {
    }

    /* renamed from: L */
    public void mo12214L() {
        this.f24335C = -9223372036854775807L;
        this.f24336D = -1;
        this.f24337E = -1;
        this.f24338F = false;
        this.f24352m.clear();
        this.f24333A = null;
        this.f24334B = null;
        this.f24356q = null;
        this.f24339G = false;
        this.f24342J = false;
        this.f24357r = false;
        this.f24358s = false;
        this.f24359t = false;
        this.f24360u = false;
        this.f24361v = false;
        this.f24363x = false;
        this.f24364y = false;
        this.f24365z = false;
        this.f24343K = false;
        this.f24340H = 0;
        this.f24341I = 0;
        this.f24349j.f5093c = null;
        MediaCodec mediaCodec = this.f24355p;
        if (mediaCodec != null) {
            this.f24347O.f3519b++;
            try {
                mediaCodec.stop();
                try {
                    this.f24355p.release();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    this.f24355p.release();
                    throw th;
                } finally {
                }
            }
        }
    }

    /* renamed from: M */
    public boolean mo12213M(MediaCodec mediaCodec, boolean z, zzatd zzatdVar, zzatd zzatdVar2) {
        return false;
    }

    /* renamed from: N */
    public boolean mo12212N(ju2 ju2Var) {
        return true;
    }

    @Override // com.daaw.hq2
    /* renamed from: a */
    public final int mo12211a(zzatd zzatdVar) {
        try {
            return mo9944x(this.f24348i, zzatdVar);
        } catch (vu2 e) {
            throw kp2.m17548a(e, m19536l());
        }
    }

    @Override // com.daaw.gq2
    /* renamed from: d */
    public boolean mo9953d() {
        if (this.f24354o != null) {
            if (m19542c() || this.f24337E >= 0) {
                return true;
            }
            if (this.f24335C != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f24335C) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r16.f24345M == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
        if (r16.f24345M == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        mo12214L();
     */
    @Override // com.daaw.gq2
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo12210k(long j, long j2) {
        boolean mo9957G;
        int dequeueOutputBuffer;
        boolean z;
        if (this.f24345M) {
            mo9958F();
            return;
        }
        if (this.f24354o == null) {
            this.f24350k.mo5837b();
            int m19535m = m19535m(this.f24351l, this.f24350k, true);
            if (m19535m != -5) {
                if (m19535m == -4) {
                    az2.m26583e(this.f24350k.m5833f());
                    this.f24344L = true;
                    m12209y();
                    return;
                }
                return;
            }
            mo9960D(this.f24351l.f6080a);
        }
        m12216J();
        if (this.f24355p != null) {
            nz2.m14710a("drainAndFeed");
            while (true) {
                if (this.f24337E < 0) {
                    if (this.f24362w && this.f24343K) {
                        try {
                            dequeueOutputBuffer = this.f24355p.dequeueOutputBuffer(this.f24353n, 0L);
                            this.f24337E = dequeueOutputBuffer;
                        } catch (IllegalStateException unused) {
                            m12209y();
                        }
                    } else {
                        dequeueOutputBuffer = this.f24355p.dequeueOutputBuffer(this.f24353n, 0L);
                        this.f24337E = dequeueOutputBuffer;
                    }
                    if (dequeueOutputBuffer >= 0) {
                        if (this.f24365z) {
                            this.f24365z = false;
                            this.f24355p.releaseOutputBuffer(dequeueOutputBuffer, false);
                            this.f24337E = -1;
                        } else {
                            MediaCodec.BufferInfo bufferInfo = this.f24353n;
                            if ((bufferInfo.flags & 4) != 0) {
                                m12209y();
                                this.f24337E = -1;
                                break;
                            }
                            ByteBuffer byteBuffer = this.f24334B[this.f24337E];
                            if (byteBuffer != null) {
                                byteBuffer.position(bufferInfo.offset);
                                MediaCodec.BufferInfo bufferInfo2 = this.f24353n;
                                byteBuffer.limit(bufferInfo2.offset + bufferInfo2.size);
                            }
                            long j3 = this.f24353n.presentationTimeUs;
                            int size = this.f24352m.size();
                            int i = 0;
                            while (true) {
                                if (i >= size) {
                                    z = false;
                                    break;
                                } else if (((Long) this.f24352m.get(i)).longValue() == j3) {
                                    this.f24352m.remove(i);
                                    z = true;
                                    break;
                                } else {
                                    i++;
                                }
                            }
                            this.f24338F = z;
                        }
                    } else if (dequeueOutputBuffer == -2) {
                        MediaFormat outputFormat = this.f24355p.getOutputFormat();
                        if (this.f24359t && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.f24365z = true;
                        } else {
                            if (this.f24363x) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            mo9959E(this.f24355p, outputFormat);
                        }
                    } else if (dequeueOutputBuffer == -3) {
                        this.f24334B = this.f24355p.getOutputBuffers();
                    } else if (this.f24360u && (this.f24344L || this.f24341I == 2)) {
                        m12209y();
                    }
                }
                if (this.f24362w && this.f24343K) {
                    try {
                        MediaCodec mediaCodec = this.f24355p;
                        ByteBuffer[] byteBufferArr = this.f24334B;
                        int i2 = this.f24337E;
                        ByteBuffer byteBuffer2 = byteBufferArr[i2];
                        MediaCodec.BufferInfo bufferInfo3 = this.f24353n;
                        mo9957G = mo9957G(j, j2, mediaCodec, byteBuffer2, i2, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.f24338F);
                    } catch (IllegalStateException unused2) {
                        m12209y();
                    }
                } else {
                    MediaCodec mediaCodec2 = this.f24355p;
                    ByteBuffer[] byteBufferArr2 = this.f24334B;
                    int i3 = this.f24337E;
                    ByteBuffer byteBuffer3 = byteBufferArr2[i3];
                    MediaCodec.BufferInfo bufferInfo4 = this.f24353n;
                    mo9957G = mo9957G(j, j2, mediaCodec2, byteBuffer3, i3, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.f24338F);
                }
                if (!mo9957G) {
                    break;
                }
                long j4 = this.f24353n.presentationTimeUs;
                this.f24337E = -1;
            }
            do {
            } while (m12208z());
            nz2.m14709b();
        } else {
            m19532w(j);
            this.f24350k.mo5837b();
            int m19535m2 = m19535m(this.f24351l, this.f24350k, false);
            if (m19535m2 == -5) {
                mo9960D(this.f24351l.f6080a);
            } else if (m19535m2 == -4) {
                az2.m26583e(this.f24350k.m5833f());
                this.f24344L = true;
                m12209y();
            }
        }
        this.f24347O.m27100a();
    }

    @Override // com.daaw.ip2
    /* renamed from: q */
    public void mo9949q() {
        this.f24354o = null;
        mo12214L();
    }

    @Override // com.daaw.ip2
    /* renamed from: r */
    public void mo9948r(boolean z) {
        this.f24347O = new as2();
    }

    @Override // com.daaw.ip2
    /* renamed from: s */
    public void mo9947s(long j, boolean z) {
        this.f24344L = false;
        this.f24345M = false;
        if (this.f24355p != null) {
            this.f24335C = -9223372036854775807L;
            this.f24336D = -1;
            this.f24337E = -1;
            this.f24346N = true;
            this.f24338F = false;
            this.f24352m.clear();
            this.f24364y = false;
            this.f24365z = false;
            if (this.f24358s || ((this.f24361v && this.f24343K) || this.f24341I != 0)) {
                mo12214L();
                m12216J();
            } else {
                this.f24355p.flush();
                this.f24342J = false;
            }
            if (!this.f24339G || this.f24354o == null) {
                return;
            }
            this.f24340H = 1;
        }
    }

    /* renamed from: x */
    public abstract int mo9944x(su2 su2Var, zzatd zzatdVar);

    /* renamed from: z */
    public final boolean m12208z() {
        MediaCodec mediaCodec = this.f24355p;
        if (mediaCodec == null || this.f24341I == 2 || this.f24344L) {
            return false;
        }
        if (this.f24336D < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
            this.f24336D = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            bs2 bs2Var = this.f24349j;
            bs2Var.f5093c = this.f24333A[dequeueInputBuffer];
            bs2Var.mo5837b();
        }
        if (this.f24341I == 1) {
            if (!this.f24360u) {
                this.f24343K = true;
                this.f24355p.queueInputBuffer(this.f24336D, 0, 0, 0L, 4);
                this.f24336D = -1;
            }
            this.f24341I = 2;
            return false;
        } else if (this.f24364y) {
            this.f24364y = false;
            ByteBuffer byteBuffer = this.f24349j.f5093c;
            byte[] bArr = f24332P;
            byteBuffer.put(bArr);
            MediaCodec mediaCodec2 = this.f24355p;
            int i = this.f24336D;
            int length = bArr.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0L, 0);
            this.f24336D = -1;
            this.f24342J = true;
            return true;
        } else {
            if (this.f24340H == 1) {
                for (int i2 = 0; i2 < this.f24354o.f36796w.size(); i2++) {
                    this.f24349j.f5093c.put((byte[]) this.f24354o.f36796w.get(i2));
                }
                this.f24340H = 2;
            }
            int position = this.f24349j.f5093c.position();
            int m19535m = m19535m(this.f24351l, this.f24349j, false);
            if (m19535m == -3) {
                return false;
            }
            if (m19535m == -5) {
                if (this.f24340H == 2) {
                    this.f24349j.mo5837b();
                    this.f24340H = 1;
                }
                mo9960D(this.f24351l.f6080a);
                return true;
            }
            bs2 bs2Var2 = this.f24349j;
            if (bs2Var2.m5833f()) {
                if (this.f24340H == 2) {
                    bs2Var2.mo5837b();
                    this.f24340H = 1;
                }
                this.f24344L = true;
                if (!this.f24342J) {
                    m12209y();
                    return false;
                }
                try {
                    if (!this.f24360u) {
                        this.f24343K = true;
                        this.f24355p.queueInputBuffer(this.f24336D, 0, 0, 0L, 4);
                        this.f24336D = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw kp2.m17548a(e, m19536l());
                }
            } else if (this.f24346N && !bs2Var2.m5832g()) {
                bs2Var2.mo5837b();
                if (this.f24340H == 2) {
                    this.f24340H = 1;
                }
                return true;
            } else {
                this.f24346N = false;
                boolean m25842i = bs2Var2.m25842i();
                if (this.f24357r && !m25842i) {
                    ByteBuffer byteBuffer2 = bs2Var2.f5093c;
                    byte[] bArr2 = gz2.f11863a;
                    int position2 = byteBuffer2.position();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i5 >= position2) {
                            byteBuffer2.clear();
                            break;
                        }
                        int i6 = byteBuffer2.get(i3) & 255;
                        if (i4 == 3) {
                            if (i6 == 1) {
                                if ((byteBuffer2.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer2.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer2.position(0);
                                    byteBuffer2.put(duplicate);
                                    break;
                                }
                                i6 = 1;
                            }
                        } else if (i6 == 0) {
                            i4++;
                        }
                        if (i6 != 0) {
                            i4 = 0;
                        }
                        i3 = i5;
                    }
                    if (this.f24349j.f5093c.position() == 0) {
                        return true;
                    }
                    this.f24357r = false;
                }
                try {
                    bs2 bs2Var3 = this.f24349j;
                    long j = bs2Var3.f5094d;
                    if (bs2Var3.m5834e()) {
                        this.f24352m.add(Long.valueOf(j));
                    }
                    this.f24349j.f5093c.flip();
                    mo12215K(this.f24349j);
                    if (m25842i) {
                        MediaCodec.CryptoInfo m1964a = this.f24349j.f5092b.m1964a();
                        if (position != 0) {
                            if (m1964a.numBytesOfClearData == null) {
                                m1964a.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = m1964a.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.f24355p.queueSecureInputBuffer(this.f24336D, 0, m1964a, j, 0);
                    } else {
                        this.f24355p.queueInputBuffer(this.f24336D, 0, this.f24349j.f5093c.limit(), j, 0);
                    }
                    this.f24336D = -1;
                    this.f24342J = true;
                    this.f24340H = 0;
                    this.f24347O.f3520c++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw kp2.m17548a(e2, m19536l());
                }
            }
        }
    }

    @Override // com.daaw.gq2
    public boolean zzE() {
        return this.f24345M;
    }

    @Override // com.daaw.hq2
    public final int zze() {
        return 4;
    }
}
