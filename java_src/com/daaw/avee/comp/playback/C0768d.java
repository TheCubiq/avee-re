package com.daaw.avee.comp.playback;

import android.os.Handler;
import android.os.Message;
import android.view.SurfaceHolder;
import com.daaw.C2668pz;
import com.daaw.avee.comp.playback.AbstractC0738b;
import com.daaw.avee.comp.playback.InterfaceC0771e;
import com.daaw.br1;
import com.daaw.wd0;
import java.lang.ref.WeakReference;
/* renamed from: com.daaw.avee.comp.playback.d */
/* loaded from: classes.dex */
public class C0768d {

    /* renamed from: a */
    public InterfaceC0771e f4032a;

    /* renamed from: b */
    public InterfaceC0771e.InterfaceC0773b f4033b;

    /* renamed from: c */
    public int f4034c = 0;

    /* renamed from: d */
    public int f4035d = 0;

    /* renamed from: e */
    public long f4036e = 80;

    /* renamed from: f */
    public float f4037f = 0.25f;

    /* renamed from: g */
    public float f4038g = (((float) (80 + 10)) * 0.001f) / 0.25f;

    /* renamed from: h */
    public long f4039h = 300;

    /* renamed from: i */
    public long f4040i = -1;

    /* renamed from: j */
    public HandlerC0770b f4041j = new HandlerC0770b(this);

    /* renamed from: com.daaw.avee.comp.playback.d$a */
    /* loaded from: classes.dex */
    public class C0769a implements InterfaceC0771e.InterfaceC0773b {
        public C0769a() {
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: a */
        public void mo26657a(boolean z, String str) {
            C0768d.this.f4033b.mo26657a(z, str);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: b */
        public void mo26656b() {
            C0768d.this.f4033b.mo26656b();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: c */
        public void mo26655c(AbstractC0738b.C0740b c0740b) {
            C0768d.this.f4033b.mo26655c(c0740b);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: d */
        public AbstractC0738b.C0741c mo26654d(String str) {
            return C0768d.this.f4033b.mo26654d(str);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: e */
        public boolean mo26653e(String str) {
            return C0768d.this.f4033b.mo26653e(str);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: f */
        public void mo26652f(boolean z) {
            C0768d.this.f4033b.mo26652f(z);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: g */
        public void mo26651g(boolean z) {
            if (C0768d.this.f4041j.hasMessages(5) || C0768d.this.f4041j.hasMessages(6) || C0768d.this.f4041j.hasMessages(7)) {
                return;
            }
            C0768d.this.f4033b.mo26651g(z);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: h */
        public boolean mo26650h() {
            return C0768d.this.f4033b.mo26650h();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: i */
        public void mo26649i(int i, int i2, float f) {
            C0768d.this.f4033b.mo26649i(i, i2, f);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: j */
        public void mo26648j(boolean z, int i) {
            C0768d.this.f4033b.mo26648j(z, i);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: k */
        public void mo26647k(C2668pz c2668pz) {
            C0768d.this.f4033b.mo26647k(c2668pz);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: l */
        public int mo26646l() {
            return C0768d.this.f4033b.mo26646l();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: m */
        public void mo26645m(long j) {
            C0768d.this.f4033b.mo26645m(j);
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: n */
        public SurfaceHolder mo26644n() {
            return C0768d.this.f4033b.mo26644n();
        }

        @Override // com.daaw.avee.comp.playback.InterfaceC0771e.InterfaceC0773b
        /* renamed from: o */
        public void mo26643o() {
            if (C0768d.this.f4041j.hasMessages(5) || C0768d.this.f4041j.hasMessages(6) || C0768d.this.f4041j.hasMessages(7)) {
                return;
            }
            C0768d.this.f4033b.mo26643o();
        }
    }

    /* renamed from: com.daaw.avee.comp.playback.d$b */
    /* loaded from: classes.dex */
    public static class HandlerC0770b extends Handler {

        /* renamed from: a */
        public WeakReference<C0768d> f4043a;

        public HandlerC0770b(C0768d c0768d) {
            this.f4043a = new WeakReference<>(c0768d);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
            if (r0.f4032a.mo6869t(-r0.f4038g, 1) != false) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
            r0.f4032a.mo6867v();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
            if (r0.f4032a.mo6869t(-r3, 1) != false) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
        /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            Message obtainMessage;
            long j;
            C0768d c0768d = this.f4043a.get();
            if (c0768d == null) {
                return;
            }
            float f = (((float) (c0768d.f4036e + 10)) * 0.001f) / (((float) c0768d.f4040i) * 0.001f);
            switch (message.what) {
                case 2:
                    if (c0768d.f4034c != 1) {
                        if (c0768d.f4034c != 2) {
                            if (c0768d.f4034c != 3) {
                                c0768d.f4034c = 0;
                                if (c0768d.f4034c != 0) {
                                }
                                break;
                            } else {
                                c0768d.f4034c = 0;
                                if (c0768d.f4034c != 0) {
                                }
                                break;
                            }
                        } else {
                            if (c0768d.f4032a.mo6869t(-c0768d.f4038g, 0)) {
                                c0768d.f4032a.mo6887b();
                                c0768d.f4034c = 0;
                            }
                            if (c0768d.f4034c != 0) {
                            }
                        }
                    } else {
                        if (c0768d.f4032a.mo6869t(-c0768d.f4038g, 0)) {
                            c0768d.f4032a.stop();
                            c0768d.f4034c = 0;
                        }
                        if (c0768d.f4034c != 0) {
                            return;
                        }
                        obtainMessage = obtainMessage(2);
                    }
                    j = c0768d.f4036e;
                    break;
                case 3:
                    if (c0768d.f4035d == 4) {
                        break;
                    } else {
                        if (c0768d.f4035d != 5) {
                            if (c0768d.f4035d == 6) {
                                break;
                            }
                            if (c0768d.f4035d != 0) {
                                return;
                            }
                            obtainMessage = obtainMessage(3);
                        }
                        c0768d.f4035d = 0;
                        if (c0768d.f4035d != 0) {
                        }
                    }
                    j = c0768d.f4036e;
                    break;
                case 4:
                    if (c0768d.f4040i >= 0) {
                        long mo6878k = c0768d.f4032a.mo6878k();
                        long mo6877l = c0768d.f4032a.mo6877l();
                        long j2 = mo6877l - mo6878k;
                        if (mo6877l > c0768d.f4040i + 1500 && j2 <= c0768d.f4040i + 1500) {
                            long m25911F = br1.m25911F();
                            c0768d.f4033b.mo26645m(m25911F + ((j2 - c0768d.f4040i) - 10));
                            return;
                        }
                        obtainMessage = obtainMessage(4);
                        j = c0768d.f4039h;
                        break;
                    } else {
                        return;
                    }
                case 5:
                    c0768d.m26690B();
                    c0768d.m26667q();
                    return;
                case 6:
                    c0768d.m26689C();
                    c0768d.m26668p();
                    return;
                case 7:
                    c0768d.m26663u();
                    return;
                default:
                    return;
            }
            sendMessageDelayed(obtainMessage, j);
        }
    }

    public C0768d(InterfaceC0771e interfaceC0771e, InterfaceC0771e.InterfaceC0773b interfaceC0773b, long j) {
        this.f4032a = interfaceC0771e;
        this.f4033b = interfaceC0773b;
        m26691A(j);
        interfaceC0771e.mo6872q(new C0769a());
    }

    /* renamed from: A */
    public void m26691A(long j) {
        this.f4040i = j;
    }

    /* renamed from: B */
    public final void m26690B() {
        this.f4034c = 5;
        this.f4032a.start();
        this.f4041j.removeMessages(2);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(2), this.f4036e);
    }

    /* renamed from: C */
    public final void m26689C() {
        this.f4034c = 3;
        this.f4032a.start();
        this.f4041j.removeMessages(2);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(2), this.f4036e);
    }

    /* renamed from: D */
    public void m26688D() {
        m26689C();
        m26666r();
    }

    /* renamed from: E */
    public final void m26687E(wd0 wd0Var, boolean z, boolean z2, float f, long j) {
        this.f4041j.removeMessages(4);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(4), this.f4039h);
        this.f4041j.removeMessages(3);
        this.f4035d = 0;
        this.f4034c = 0;
        this.f4041j.removeMessages(2);
        this.f4032a.mo6871r(wd0Var);
        this.f4032a.mo6879j(z, z2, f, j);
    }

    /* renamed from: F */
    public void m26686F() {
        this.f4032a.stop();
    }

    /* renamed from: G */
    public final void m26685G() {
        this.f4034c = 1;
        this.f4041j.removeMessages(2);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(2), this.f4036e);
    }

    /* renamed from: H */
    public void m26684H() {
        m26685G();
        m26666r();
    }

    /* renamed from: p */
    public final void m26668p() {
        this.f4032a.mo6867v();
    }

    /* renamed from: q */
    public void m26667q() {
        this.f4041j.removeMessages(3);
        this.f4035d = 6;
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(3), this.f4036e);
    }

    /* renamed from: r */
    public void m26666r() {
        this.f4041j.removeMessages(3);
        this.f4035d = 4;
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(3), this.f4036e);
    }

    /* renamed from: s */
    public InterfaceC0771e m26665s() {
        return this.f4032a;
    }

    /* renamed from: t */
    public final void m26664t() {
        this.f4034c = 5;
        this.f4041j.removeMessages(2);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(2), this.f4036e);
    }

    /* renamed from: u */
    public final void m26663u() {
        this.f4032a.start();
    }

    /* renamed from: v */
    public final void m26662v() {
        this.f4034c = 2;
        this.f4041j.removeMessages(2);
        this.f4041j.sendMessageDelayed(this.f4041j.obtainMessage(2), this.f4036e);
    }

    /* renamed from: w */
    public void m26661w() {
        m26662v();
        m26666r();
    }

    /* renamed from: x */
    public void m26660x(wd0 wd0Var, boolean z, long j) {
        this.f4041j.removeMessages(5);
        this.f4041j.removeMessages(6);
        this.f4041j.removeMessages(7);
        long j2 = this.f4040i;
        if (j2 < 0 || j2 <= this.f4039h) {
            m26687E(wd0Var, true, z, 1.0f, j);
            m26668p();
            return;
        }
        m26687E(wd0Var, false, z, 0.0f, j);
        m26664t();
        m26667q();
    }

    /* renamed from: y */
    public void m26659y(wd0 wd0Var, boolean z, long j, long j2) {
        Message obtainMessage;
        this.f4041j.removeMessages(5);
        this.f4041j.removeMessages(6);
        this.f4041j.removeMessages(7);
        long m25911F = j2 - br1.m25911F();
        if (j2 <= 0 || m25911F <= 0) {
            m26660x(wd0Var, z, j);
            return;
        }
        long j3 = this.f4040i;
        if (j3 < 0 || j3 <= this.f4039h) {
            if (j3 >= 0) {
                m26687E(wd0Var, false, false, 1.0f, j);
                if (!z) {
                    return;
                }
            } else {
                m26687E(wd0Var, true, false, 1.0f, j);
                if (!z) {
                    return;
                }
            }
            obtainMessage = this.f4041j.obtainMessage(7);
        } else {
            m26687E(wd0Var, false, false, 0.0f, j);
            if (!z) {
                return;
            }
            obtainMessage = this.f4041j.obtainMessage(5);
        }
        this.f4041j.sendMessageAtTime(obtainMessage, j2);
    }

    /* renamed from: z */
    public void m26658z() {
        this.f4041j.removeCallbacksAndMessages(null);
        this.f4032a.mo6888a();
        this.f4032a = null;
    }
}
