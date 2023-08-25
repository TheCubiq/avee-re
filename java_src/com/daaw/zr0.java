package com.daaw;

import android.media.audiofx.Virtualizer;
import android.media.audiofx.Visualizer;
import com.daaw.avee.comp.playback.C0729a;
/* loaded from: classes.dex */
public class zr0 {

    /* renamed from: c */
    public Visualizer f35424c;

    /* renamed from: b */
    public byte[] f35423b = new byte[1];

    /* renamed from: d */
    public int f35425d = -1;

    /* renamed from: e */
    public Virtualizer f35426e = null;

    /* renamed from: a */
    public boolean f35422a = false;

    /* renamed from: b */
    public static int m1972b(int i) {
        if (i < 0) {
            return 0;
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 1);
        int i4 = i3 | (i3 >> 2);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 8);
        return (i6 | (i6 >> 16)) + 1;
    }

    /* renamed from: a */
    public C0729a m1973a(long j, C0729a.C0737h c0737h, C0729a c0729a, int i, boolean z) {
        if (this.f35422a) {
            return null;
        }
        int i2 = 0;
        if (z) {
            i = 0;
        }
        if (this.f35424c == null || this.f35425d != i) {
            try {
                lz1.m16365a("### audioSessionId: " + i);
                Visualizer visualizer = new Visualizer(i);
                this.f35424c = visualizer;
                this.f35425d = i;
                visualizer.setScalingMode(0);
            } catch (RuntimeException e) {
                lz1.m16365a("### visualizer exception: " + e.getMessage());
                this.f35422a = true;
                this.f35425d = -1;
            }
        }
        Visualizer visualizer2 = this.f35424c;
        if (visualizer2 == null) {
            return null;
        }
        int captureSize = visualizer2.getCaptureSize();
        int m1972b = m1972b(c0737h.f3983d);
        int[] captureSizeRange = Visualizer.getCaptureSizeRange();
        int max = Math.max(captureSizeRange[0], Math.min(captureSizeRange[1], m1972b));
        c0729a.m26738e(44100, c0737h.f3980a, max, 0, false);
        if (max != captureSize) {
            this.f35424c.setEnabled(false);
            try {
                this.f35424c.setCaptureSize(max);
                captureSize = max;
            } catch (IllegalStateException unused) {
            }
        }
        if (this.f35423b.length != captureSize) {
            this.f35423b = new byte[captureSize];
        }
        if (!this.f35424c.getEnabled()) {
            this.f35424c.setEnabled(true);
        }
        try {
            this.f35424c.getWaveForm(this.f35423b);
        } catch (IllegalStateException unused2) {
        }
        float f = 0.0f;
        int min = Math.min(this.f35423b.length, c0729a.m26741b());
        int i3 = c0729a.f3943b;
        if (i3 == 1) {
            while (i2 < min) {
                short s = (short) (((short) ((this.f35423b[i2] & 255) - 128)) * 2 * 150);
                short[] sArr = c0729a.f3944c;
                int i4 = c0729a.f3943b;
                sArr[i2 * i4] = s;
                if (c0729a.f3945d > s) {
                    c0729a.f3945d = s;
                }
                if (c0729a.f3946e < s) {
                    c0729a.f3946e = s;
                }
                f += sArr[i4 * i2] / 255.0f;
                i2++;
            }
        } else if (i3 == 2) {
            while (i2 < min) {
                short s2 = (short) (((short) ((this.f35423b[i2] & 255) - 128)) * 2 * 150);
                short[] sArr2 = c0729a.f3944c;
                int i5 = c0729a.f3943b;
                sArr2[i2 * i5] = s2;
                sArr2[(i2 * i5) + 1] = s2;
                if (c0729a.f3945d > s2) {
                    c0729a.f3945d = s2;
                }
                if (c0729a.f3946e < s2) {
                    c0729a.f3946e = s2;
                }
                f += sArr2[i5 * i2] / 255.0f;
                i2++;
            }
        }
        c0729a.f3948g = f / c0729a.m26741b();
        c0729a.f3942a = true;
        return c0729a;
    }

    /* renamed from: c */
    public void m1971c() {
        Visualizer visualizer = this.f35424c;
        if (visualizer != null) {
            visualizer.setEnabled(false);
            this.f35424c.release();
        }
        Virtualizer virtualizer = this.f35426e;
        if (virtualizer != null) {
            virtualizer.setEnabled(true);
            this.f35426e.setEnabled(false);
            this.f35426e.release();
        }
    }

    /* renamed from: d */
    public void m1970d() {
        this.f35422a = false;
    }
}
