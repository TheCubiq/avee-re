package com.daaw.avee.comp.playback;

import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.Virtualizer;
import com.daaw.br1;
import com.daaw.lz1;
/* loaded from: classes.dex */
public abstract class b {
    public C0042b b;
    public d c;
    public String d;
    public int a = 0;
    public boolean e = false;
    public int g = 0;
    public boolean h = false;
    public int j = 0;
    public Equalizer f = null;
    public Virtualizer i = null;

    /* loaded from: classes.dex */
    public class a implements AudioEffect.OnControlStatusChangeListener {
        public a() {
        }

        @Override // android.media.audiofx.AudioEffect.OnControlStatusChangeListener
        public void onControlStatusChange(AudioEffect audioEffect, boolean z) {
            b.this.h = z;
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0042b {
        public static final C0042b g = new C0042b("Default");
        public String a;
        public int b;
        public int c;
        public int d;
        public int[] e;
        public float[] f;

        public C0042b() {
        }

        public C0042b(String str) {
            this.a = str;
            this.b = 0;
            this.c = -1000;
            this.d = 1000;
            this.e = new int[0];
            this.f = new float[0];
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public boolean b;
        public int c;
        public float[] d;
        public float e;
    }

    /* loaded from: classes.dex */
    public interface d {
        void c(C0042b c0042b);

        c d(String str);

        boolean w(String str);
    }

    public b(d dVar, String str) {
        this.c = dVar;
        this.d = str;
        this.b = new C0042b(str);
    }

    public final void b(c cVar, C0042b c0042b) {
        String str;
        Equalizer equalizer = this.f;
        if (equalizer == null || cVar == null) {
            return;
        }
        boolean enabled = equalizer.getEnabled();
        boolean z = cVar.a;
        if (enabled != z) {
            this.f.setEnabled(z);
        }
        if (cVar.a) {
            try {
                if (cVar.b) {
                    short s = (short) cVar.c;
                    if (s < this.f.getNumberOfPresets() && s >= 0) {
                        this.f.usePreset(s);
                        return;
                    }
                    str = "invalid preset: " + ((int) s);
                } else {
                    int i = (c0042b.d - c0042b.c) / 2;
                    if (cVar.d.length == this.f.getNumberOfBands()) {
                        for (int i2 = 0; i2 < c0042b.f.length; i2++) {
                            this.f.setBandLevel((short) i2, (short) (Math.round(cVar.d[i2] * i) + i + c0042b.c));
                        }
                        return;
                    }
                    str = "invalid band count " + cVar.d.length;
                }
                lz1.c(str);
            } catch (Exception e) {
                lz1.c("Equalizer exception");
                e.printStackTrace();
            }
        }
    }

    public final void c(c cVar) {
        Virtualizer virtualizer = this.i;
        if (virtualizer == null) {
            return;
        }
        virtualizer.setEnabled(cVar.a && cVar.e > 0.0f);
        if (this.i.getStrengthSupported()) {
            this.i.setStrength((short) br1.j(cVar.e * 1000.0f, 0.0f, 1000.0f));
        }
    }

    public C0042b d() {
        f(true, this.a);
        this.c.c(this.b);
        return this.b;
    }

    public String e() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean f(boolean r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            r6.h = r0
            r1 = 1
            if (r8 == 0) goto L26
            if (r7 == 0) goto L26
            android.media.audiofx.Equalizer r7 = r6.f
            if (r7 == 0) goto L10
            int r7 = r6.g
            if (r7 == r8) goto L29
        L10:
            r6.k()
            r6.g = r8
            android.media.audiofx.Equalizer r7 = new android.media.audiofx.Equalizer     // Catch: java.lang.Exception -> L24
            r7.<init>(r0, r8)     // Catch: java.lang.Exception -> L24
            r6.f = r7     // Catch: java.lang.Exception -> L24
            com.daaw.avee.comp.playback.b$a r8 = new com.daaw.avee.comp.playback.b$a     // Catch: java.lang.Exception -> L24
            r8.<init>()     // Catch: java.lang.Exception -> L24
            r7.setControlStatusListener(r8)     // Catch: java.lang.Exception -> L24
        L24:
            r7 = 1
            goto L2a
        L26:
            r6.k()
        L29:
            r7 = 0
        L2a:
            android.media.audiofx.Equalizer r8 = r6.f
            if (r8 != 0) goto L40
            com.daaw.avee.comp.playback.b$b r8 = r6.b
            if (r8 != 0) goto L3e
            com.daaw.avee.comp.playback.b$b r7 = new com.daaw.avee.comp.playback.b$b
            java.lang.String r8 = r6.e()
            r7.<init>(r8)
            r6.b = r7
            goto L3f
        L3e:
            r1 = r7
        L3f:
            return r1
        L40:
            com.daaw.avee.comp.playback.b$b r8 = r6.b
            if (r8 != 0) goto L4c
            com.daaw.avee.comp.playback.b$b r7 = new com.daaw.avee.comp.playback.b$b
            r7.<init>()
            r6.b = r7
            r7 = 1
        L4c:
            com.daaw.avee.comp.playback.b$b r8 = r6.b     // Catch: java.lang.Exception -> Laf
            java.lang.String r2 = r6.e()     // Catch: java.lang.Exception -> Laf
            r8.a = r2     // Catch: java.lang.Exception -> Laf
            com.daaw.avee.comp.playback.b$b r8 = r6.b     // Catch: java.lang.Exception -> Laf
            android.media.audiofx.Equalizer r2 = r6.f     // Catch: java.lang.Exception -> Laf
            short r2 = r2.getNumberOfBands()     // Catch: java.lang.Exception -> Laf
            r8.b = r2     // Catch: java.lang.Exception -> Laf
            com.daaw.avee.comp.playback.b$b r8 = r6.b     // Catch: java.lang.Exception -> Laf
            android.media.audiofx.Equalizer r2 = r6.f     // Catch: java.lang.Exception -> Laf
            short[] r2 = r2.getBandLevelRange()     // Catch: java.lang.Exception -> Laf
            short r2 = r2[r0]     // Catch: java.lang.Exception -> Laf
            r8.c = r2     // Catch: java.lang.Exception -> Laf
            com.daaw.avee.comp.playback.b$b r8 = r6.b     // Catch: java.lang.Exception -> Laf
            android.media.audiofx.Equalizer r2 = r6.f     // Catch: java.lang.Exception -> Laf
            short[] r2 = r2.getBandLevelRange()     // Catch: java.lang.Exception -> Laf
            short r1 = r2[r1]     // Catch: java.lang.Exception -> Laf
            r8.d = r1     // Catch: java.lang.Exception -> Laf
            com.daaw.avee.comp.playback.b$b r8 = r6.b     // Catch: java.lang.Exception -> Laf
            int r1 = r8.b     // Catch: java.lang.Exception -> Laf
            float[] r2 = new float[r1]     // Catch: java.lang.Exception -> Laf
            r8.f = r2     // Catch: java.lang.Exception -> Laf
            int[] r1 = new int[r1]     // Catch: java.lang.Exception -> Laf
            r8.e = r1     // Catch: java.lang.Exception -> Laf
            int r1 = r8.d     // Catch: java.lang.Exception -> Laf
            int r8 = r8.c     // Catch: java.lang.Exception -> Laf
            int r1 = r1 - r8
            int r1 = r1 / 2
            float r8 = (float) r1     // Catch: java.lang.Exception -> Laf
        L8a:
            com.daaw.avee.comp.playback.b$b r1 = r6.b     // Catch: java.lang.Exception -> Laf
            float[] r1 = r1.f     // Catch: java.lang.Exception -> Laf
            int r2 = r1.length     // Catch: java.lang.Exception -> Laf
            if (r0 >= r2) goto Lce
            android.media.audiofx.Equalizer r2 = r6.f     // Catch: java.lang.Exception -> Laf
            short r3 = (short) r0     // Catch: java.lang.Exception -> Laf
            short r2 = r2.getBandLevel(r3)     // Catch: java.lang.Exception -> Laf
            com.daaw.avee.comp.playback.b$b r4 = r6.b     // Catch: java.lang.Exception -> Laf
            int r5 = r4.c     // Catch: java.lang.Exception -> Laf
            int r2 = r2 - r5
            float r2 = (float) r2     // Catch: java.lang.Exception -> Laf
            float r2 = r2 - r8
            float r2 = r2 / r8
            r1[r0] = r2     // Catch: java.lang.Exception -> Laf
            int[] r1 = r4.e     // Catch: java.lang.Exception -> Laf
            android.media.audiofx.Equalizer r2 = r6.f     // Catch: java.lang.Exception -> Laf
            int r2 = r2.getCenterFreq(r3)     // Catch: java.lang.Exception -> Laf
            r1[r0] = r2     // Catch: java.lang.Exception -> Laf
            int r0 = r0 + 1
            goto L8a
        Laf:
            r8 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Equalizer parameter exception: "
            r0.append(r1)
            java.lang.String r1 = r8.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.daaw.lz1.c(r0)
            r8.printStackTrace()
            r6.k()
        Lce:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.avee.comp.playback.b.f(boolean, int):boolean");
    }

    public final void g(boolean z, int i) {
        if (i == 0 || !z) {
            l();
        } else if (this.i == null || this.j != i) {
            l();
            this.j = i;
            try {
                this.i = new Virtualizer(0, i);
            } catch (Exception unused) {
            }
        }
    }

    public void h(int i) {
        this.a = i;
        boolean z = false;
        if (this.c.w(e())) {
            c d2 = this.c.d(e());
            boolean z2 = d2.a;
            this.e = z2;
            f(z2, i);
            b(d2, this.b);
            if (d2.a && d2.e > 0.0f) {
                z = true;
            }
            g(z, i);
            c(d2);
        } else {
            f(false, i);
            g(false, i);
        }
        this.c.c(this.b);
    }

    public void i() {
        if (this.e) {
            return;
        }
        k();
    }

    public void j() {
        k();
        l();
    }

    public final void k() {
        try {
            Equalizer equalizer = this.f;
            if (equalizer != null) {
                equalizer.setControlStatusListener(null);
                this.f.release();
            }
        } catch (Exception unused) {
        }
        this.h = false;
        this.f = null;
        this.g = 0;
    }

    public final void l() {
        try {
            Virtualizer virtualizer = this.i;
            if (virtualizer != null) {
                virtualizer.release();
            }
        } catch (Exception unused) {
        }
        this.i = null;
        this.j = 0;
    }

    public void m(c cVar) {
        boolean z = cVar.a;
        this.e = z;
        f(z, this.a);
        b(cVar, this.b);
        g(cVar.a && cVar.e > 0.0f, this.a);
        c(cVar);
    }
}
