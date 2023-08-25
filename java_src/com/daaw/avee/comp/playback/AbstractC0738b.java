package com.daaw.avee.comp.playback;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Virtualizer;
import com.daaw.br1;
import com.daaw.lz1;
/* renamed from: com.daaw.avee.comp.playback.b */
/* loaded from: classes.dex */
public abstract class AbstractC0738b {

    /* renamed from: b */
    public C0740b f3985b;

    /* renamed from: c */
    public InterfaceC0742d f3986c;

    /* renamed from: d */
    public String f3987d;

    /* renamed from: a */
    public int f3984a = 0;

    /* renamed from: e */
    public boolean f3988e = false;

    /* renamed from: g */
    public int f3990g = 0;

    /* renamed from: h */
    public boolean f3991h = false;

    /* renamed from: j */
    public int f3993j = 0;

    /* renamed from: f */
    public Equalizer f3989f = null;

    /* renamed from: i */
    public Virtualizer f3992i = null;

    /* renamed from: com.daaw.avee.comp.playback.b$a */
    /* loaded from: classes.dex */
    public class C0739a implements AudioEffect.OnControlStatusChangeListener {
        public C0739a() {
        }

        @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
        public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
            AbstractC0738b.this.f3991h = z;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.b$b */
    /* loaded from: classes.dex */
    public static class C0740b {

        /* renamed from: g */
        public static final C0740b f3995g = new C0740b("Default");

        /* renamed from: a */
        public String f3996a;

        /* renamed from: b */
        public int f3997b;

        /* renamed from: c */
        public int f3998c;

        /* renamed from: d */
        public int f3999d;

        /* renamed from: e */
        public int[] f4000e;

        /* renamed from: f */
        public float[] f4001f;

        public C0740b() {
        }

        public C0740b(String str) {
            this.f3996a = str;
            this.f3997b = 0;
            this.f3998c = -1000;
            this.f3999d = 1000;
            this.f4000e = new int[0];
            this.f4001f = new float[0];
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.b$c */
    /* loaded from: classes.dex */
    public static class C0741c {

        /* renamed from: a */
        public boolean f4002a;

        /* renamed from: b */
        public boolean f4003b;

        /* renamed from: c */
        public int f4004c;

        /* renamed from: d */
        public float[] f4005d;

        /* renamed from: e */
        public float f4006e;
    }

    /* renamed from: com.daaw.avee.comp.playback.b$d */
    /* loaded from: classes.dex */
    public interface InterfaceC0742d {
        /* renamed from: c */
        void mo6886c(C0740b c0740b);

        /* renamed from: d */
        C0741c mo6885d(String str);

        /* renamed from: w */
        boolean mo6866w(String str);
    }

    public AbstractC0738b(InterfaceC0742d interfaceC0742d, String str) {
        this.f3986c = interfaceC0742d;
        this.f3987d = str;
        this.f3985b = new C0740b(str);
    }

    /* renamed from: b */
    public final void m26728b(C0741c c0741c, C0740b c0740b) {
        String str;
        Equalizer equalizer = this.f3989f;
        if (equalizer == null || c0741c == null) {
            return;
        }
        boolean enabled = equalizer.getEnabled();
        boolean z = c0741c.f4002a;
        if (enabled != z) {
            this.f3989f.setEnabled(z);
        }
        if (c0741c.f4002a) {
            try {
                if (c0741c.f4003b) {
                    short s = (short) c0741c.f4004c;
                    if (s < this.f3989f.getNumberOfPresets() && s >= 0) {
                        this.f3989f.usePreset(s);
                        return;
                    }
                    str = "invalid preset: " + ((int) s);
                } else {
                    int i = (c0740b.f3999d - c0740b.f3998c) / 2;
                    if (c0741c.f4005d.length == this.f3989f.getNumberOfBands()) {
                        for (int i2 = 0; i2 < c0740b.f4001f.length; i2++) {
                            this.f3989f.setBandLevel((short) i2, (short) (Math.round(c0741c.f4005d[i2] * i) + i + c0740b.f3998c));
                        }
                        return;
                    }
                    str = "invalid band count " + c0741c.f4005d.length;
                }
                lz1.m16363c(str);
            } catch (Exception e) {
                lz1.m16363c("Equalizer exception");
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public final void m26727c(C0741c c0741c) {
        Virtualizer virtualizer = this.f3992i;
        if (virtualizer == null) {
            return;
        }
        virtualizer.setEnabled(c0741c.f4002a && c0741c.f4006e > 0.0f);
        if (this.f3992i.getStrengthSupported()) {
            this.f3992i.setStrength((short) br1.m25899j(c0741c.f4006e * 1000.0f, 0.0f, 1000.0f));
        }
    }

    /* renamed from: d */
    public C0740b m26726d() {
        m26724f(true, this.f3984a);
        this.f3986c.mo6886c(this.f3985b);
        return this.f3985b;
    }

    /* renamed from: e */
    public String m26725e() {
        return this.f3987d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m26724f(boolean z, int i) {
        boolean z2;
        int i2 = 0;
        this.f3991h = false;
        if (i == 0 || !z) {
            m26719k();
        } else if (this.f3989f == null || this.f3990g != i) {
            m26719k();
            this.f3990g = i;
            try {
                Equalizer equalizer = new Equalizer(0, i);
                this.f3989f = equalizer;
                equalizer.setControlStatusListener(new C0739a());
            } catch (Exception unused) {
            }
            z2 = true;
            if (this.f3989f != null) {
                if (this.f3985b == null) {
                    this.f3985b = new C0740b(m26725e());
                    return true;
                }
                return z2;
            }
            if (this.f3985b == null) {
                this.f3985b = new C0740b();
                z2 = true;
            }
            try {
                this.f3985b.f3996a = m26725e();
                this.f3985b.f3997b = this.f3989f.getNumberOfBands();
                this.f3985b.f3998c = this.f3989f.getBandLevelRange()[0];
                this.f3985b.f3999d = this.f3989f.getBandLevelRange()[1];
                C0740b c0740b = this.f3985b;
                int i3 = c0740b.f3997b;
                c0740b.f4001f = new float[i3];
                c0740b.f4000e = new int[i3];
                float f = (c0740b.f3999d - c0740b.f3998c) / 2;
                while (true) {
                    float[] fArr = this.f3985b.f4001f;
                    if (i2 >= fArr.length) {
                        break;
                    }
                    short s = (short) i2;
                    short bandLevel = this.f3989f.getBandLevel(s);
                    C0740b c0740b2 = this.f3985b;
                    fArr[i2] = ((bandLevel - c0740b2.f3998c) - f) / f;
                    c0740b2.f4000e[i2] = this.f3989f.getCenterFreq(s);
                    i2++;
                }
            } catch (Exception e) {
                lz1.m16363c("Equalizer parameter exception: " + e.getMessage());
                e.printStackTrace();
                m26719k();
            }
            return z2;
        }
        z2 = false;
        if (this.f3989f != null) {
        }
    }

    /* renamed from: g */
    public final void m26723g(boolean z, int i) {
        if (i == 0 || !z) {
            m26718l();
        } else if (this.f3992i == null || this.f3993j != i) {
            m26718l();
            this.f3993j = i;
            try {
                this.f3992i = new Virtualizer(0, i);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public void m26722h(int i) {
        this.f3984a = i;
        boolean z = false;
        if (this.f3986c.mo6866w(m26725e())) {
            C0741c mo6885d = this.f3986c.mo6885d(m26725e());
            boolean z2 = mo6885d.f4002a;
            this.f3988e = z2;
            m26724f(z2, i);
            m26728b(mo6885d, this.f3985b);
            if (mo6885d.f4002a && mo6885d.f4006e > 0.0f) {
                z = true;
            }
            m26723g(z, i);
            m26727c(mo6885d);
        } else {
            m26724f(false, i);
            m26723g(false, i);
        }
        this.f3986c.mo6886c(this.f3985b);
    }

    /* renamed from: i */
    public void m26721i() {
        if (this.f3988e) {
            return;
        }
        m26719k();
    }

    /* renamed from: j */
    public void m26720j() {
        m26719k();
        m26718l();
    }

    /* renamed from: k */
    public final void m26719k() {
        try {
            Equalizer equalizer = this.f3989f;
            if (equalizer != null) {
                equalizer.setControlStatusListener(null);
                this.f3989f.release();
            }
        } catch (Exception unused) {
        }
        this.f3991h = false;
        this.f3989f = null;
        this.f3990g = 0;
    }

    /* renamed from: l */
    public final void m26718l() {
        try {
            Virtualizer virtualizer = this.f3992i;
            if (virtualizer != null) {
                virtualizer.release();
            }
        } catch (Exception unused) {
        }
        this.f3992i = null;
        this.f3993j = 0;
    }

    /* renamed from: m */
    public void m26717m(C0741c c0741c) {
        boolean z = c0741c.f4002a;
        this.f3988e = z;
        m26724f(z, this.f3984a);
        m26728b(c0741c, this.f3985b);
        m26723g(c0741c.f4002a && c0741c.f4006e > 0.0f, this.f3984a);
        m26727c(c0741c);
    }
}
