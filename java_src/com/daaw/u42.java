package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.util.Arrays;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* loaded from: classes.dex */
public final class u42 implements j09 {

    /* renamed from: p */
    public static final int[] f28526p;

    /* renamed from: s */
    public static final int f28529s;

    /* renamed from: b */
    public boolean f28531b;

    /* renamed from: c */
    public long f28532c;

    /* renamed from: d */
    public int f28533d;

    /* renamed from: e */
    public int f28534e;

    /* renamed from: f */
    public boolean f28535f;

    /* renamed from: h */
    public int f28537h;

    /* renamed from: i */
    public long f28538i;

    /* renamed from: j */
    public m09 f28539j;

    /* renamed from: k */
    public m42 f28540k;

    /* renamed from: l */
    public i42 f28541l;

    /* renamed from: m */
    public boolean f28542m;

    /* renamed from: n */
    public static final q09 f28524n = new q09() { // from class: com.daaw.t42
        @Override // com.daaw.q09
        /* renamed from: a */
        public final /* synthetic */ j09[] mo2588a(Uri uri, Map map) {
            return p09.m13771a(this, uri, map);
        }

        @Override // com.daaw.q09
        public final j09[] zza() {
            q09 q09Var = u42.f28524n;
            return new j09[]{new u42(0)};
        }
    };

    /* renamed from: o */
    public static final int[] f28525o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: q */
    public static final byte[] f28527q = it5.m19430B("#!AMR\n");

    /* renamed from: r */
    public static final byte[] f28528r = it5.m19430B("#!AMR-WB\n");

    /* renamed from: a */
    public final byte[] f28530a = new byte[1];

    /* renamed from: g */
    public int f28536g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f28526p = iArr;
        f28529s = iArr[8];
    }

    public u42(int i) {
    }

    /* renamed from: e */
    public static boolean m8588e(k09 k09Var, byte[] bArr) {
        k09Var.zzj();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ((rz8) k09Var).mo5661h(bArr2, 0, length, false);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.daaw.j09
    /* renamed from: a */
    public final boolean mo3957a(k09 k09Var) {
        return m8587g(k09Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039 A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e A[Catch: EOFException -> 0x0090, TryCatch #0 {EOFException -> 0x0090, blocks: (B:4:0x0007, B:6:0x001b, B:20:0x0039, B:22:0x0042, B:21:0x003e, B:31:0x005c, B:32:0x0079, B:33:0x007a, B:34:0x008f), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    @RequiresNonNull({"trackOutput"})
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m8589b(k09 k09Var) {
        int i;
        int i2 = this.f28534e;
        if (i2 == 0) {
            try {
                k09Var.zzj();
                ((rz8) k09Var).mo5661h(this.f28530a, 0, 1, false);
                byte b = this.f28530a[0];
                if ((b & 131) > 0) {
                    throw dl3.m24267a("Invalid padding bits for frame header " + ((int) b), null);
                }
                int i3 = (b >> 3) & 15;
                boolean z = this.f28531b;
                if (z) {
                    if (i3 >= 10) {
                        if (i3 > 13) {
                        }
                    }
                    i2 = !z ? f28526p[i3] : f28525o[i3];
                    this.f28533d = i2;
                    this.f28534e = i2;
                    i = this.f28536g;
                    if (i == -1) {
                        this.f28536g = i2;
                        i = i2;
                    }
                    if (i == i2) {
                        this.f28537h++;
                    }
                }
                if (!z) {
                    if (i3 >= 12 && i3 <= 14) {
                    }
                    if (!z) {
                    }
                    this.f28533d = i2;
                    this.f28534e = i2;
                    i = this.f28536g;
                    if (i == -1) {
                    }
                    if (i == i2) {
                    }
                }
                throw dl3.m24267a("Illegal AMR " + (true != z ? "NB" : "WB") + " frame type " + i3, null);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int m18051a = k42.m18051a(this.f28540k, k09Var, i2, true);
        if (m18051a == -1) {
            return -1;
        }
        int i4 = this.f28534e - m18051a;
        this.f28534e = i4;
        if (i4 > 0) {
            return 0;
        }
        this.f28540k.mo16222b(this.f28532c, 1, this.f28533d, 0, null);
        this.f28532c += 20000;
        return 0;
    }

    @Override // com.daaw.j09
    /* renamed from: c */
    public final void mo3955c(m09 m09Var) {
        this.f28539j = m09Var;
        this.f28540k = m09Var.mo3292n(0, 1);
        m09Var.zzC();
    }

    @Override // com.daaw.j09
    /* renamed from: d */
    public final int mo3954d(k09 k09Var, f42 f42Var) {
        uo4.m7876b(this.f28540k);
        int i = it5.f13991a;
        if (k09Var.zzf() != 0 || m8587g(k09Var)) {
            if (!this.f28542m) {
                this.f28542m = true;
                boolean z = this.f28531b;
                String str = true != z ? "audio/3gpp" : "audio/amr-wb";
                int i2 = true != z ? 8000 : 16000;
                m42 m42Var = this.f28540k;
                b72 b72Var = new b72();
                b72Var.m26372s(str);
                b72Var.m26379l(f28529s);
                b72Var.m26389e0(1);
                b72Var.m26371t(i2);
                m42Var.mo16218f(b72Var.m26366y());
            }
            int m8589b = m8589b(k09Var);
            if (this.f28535f) {
                return m8589b;
            }
            h42 h42Var = new h42(-9223372036854775807L, 0L);
            this.f28541l = h42Var;
            this.f28539j.mo3297i(h42Var);
            this.f28535f = true;
            return m8589b;
        }
        throw dl3.m24267a("Could not find AMR header.", null);
    }

    @Override // com.daaw.j09
    /* renamed from: f */
    public final void mo3953f(long j, long j2) {
        this.f28532c = 0L;
        this.f28533d = 0;
        this.f28534e = 0;
        this.f28538i = 0L;
    }

    /* renamed from: g */
    public final boolean m8587g(k09 k09Var) {
        int length;
        byte[] bArr = f28527q;
        if (m8588e(k09Var, bArr)) {
            this.f28531b = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f28528r;
            if (!m8588e(k09Var, bArr2)) {
                return false;
            }
            this.f28531b = true;
            length = bArr2.length;
        }
        ((rz8) k09Var).m10811l(length, false);
        return true;
    }
}
