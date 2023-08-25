package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.C1075dd;
import com.daaw.C2914s6;
import com.daaw.InterfaceC2376nz;
import com.daaw.InterfaceC3746yu;
import com.daaw.d01;
import com.daaw.sq1;
import com.google.android.exoplayer2.drm.C3923a;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
@TargetApi(18)
/* renamed from: com.google.android.exoplayer2.drm.c */
/* loaded from: classes.dex */
public class C3929c<T extends InterfaceC2376nz> implements InterfaceC3746yu<T>, C3923a.InterfaceC3926c<T> {

    /* renamed from: a */
    public final UUID f35756a;

    /* renamed from: b */
    public final InterfaceC3936f<T> f35757b;

    /* renamed from: c */
    public final InterfaceC3940g f35758c;

    /* renamed from: d */
    public final HashMap<String, String> f35759d;

    /* renamed from: e */
    public final boolean f35760e;

    /* renamed from: f */
    public final int f35761f;

    /* renamed from: g */
    public final List<C3923a<T>> f35762g;

    /* renamed from: h */
    public final List<C3923a<T>> f35763h;

    /* renamed from: i */
    public Looper f35764i;

    /* renamed from: j */
    public int f35765j;

    /* renamed from: k */
    public byte[] f35766k;

    /* renamed from: l */
    public volatile C3929c<T>.HandlerC3931b f35767l;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.c$b */
    /* loaded from: classes.dex */
    public class HandlerC3931b extends Handler {
        public HandlerC3931b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (C3923a c3923a : C3929c.this.f35762g) {
                if (c3923a.m1694k(bArr)) {
                    c3923a.m1688q(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.c$c */
    /* loaded from: classes.dex */
    public static final class C3932c extends Exception {
        public C3932c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* renamed from: i */
    public static DrmInitData.SchemeData m1668i(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.f35730s);
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= drmInitData.f35730s) {
                break;
            }
            DrmInitData.SchemeData m1710h = drmInitData.m1710h(i);
            if (!m1710h.m1706g(uuid) && (!C1075dd.f6944d.equals(uuid) || !m1710h.m1706g(C1075dd.f6943c))) {
                z2 = false;
            }
            if (z2 && (m1710h.f35734s != null || z)) {
                arrayList.add(m1710h);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C1075dd.f6945e.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int m24840f = schemeData.m1707c() ? d01.m24840f(schemeData.f35734s) : -1;
                int i3 = sq1.f26525a;
                if (i3 < 23 && m24840f == 0) {
                    return schemeData;
                }
                if (i3 >= 23 && m24840f == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    /* renamed from: j */
    public static byte[] m1667j(DrmInitData.SchemeData schemeData, UUID uuid) {
        byte[] m24842d;
        byte[] bArr = schemeData.f35734s;
        return (sq1.f26525a >= 21 || (m24842d = d01.m24842d(bArr, uuid)) == null) ? bArr : m24842d;
    }

    /* renamed from: k */
    public static String m1666k(DrmInitData.SchemeData schemeData, UUID uuid) {
        String str = schemeData.f35733r;
        return (sq1.f26525a >= 26 || !C1075dd.f6944d.equals(uuid)) ? str : ("video/mp4".equals(str) || "audio/mp4".equals(str)) ? "cenc" : str;
    }

    @Override // com.daaw.InterfaceC3746yu
    /* renamed from: a */
    public InterfaceC3933d<T> mo1676a(Looper looper, DrmInitData drmInitData) {
        byte[] bArr;
        String str;
        Looper looper2 = this.f35764i;
        C2914s6.m10685f(looper2 == null || looper2 == looper);
        if (this.f35762g.isEmpty()) {
            this.f35764i = looper;
            if (this.f35767l == null) {
                this.f35767l = new HandlerC3931b(looper);
            }
        }
        C3923a<T> c3923a = null;
        if (this.f35766k == null) {
            DrmInitData.SchemeData m1668i = m1668i(drmInitData, this.f35756a, false);
            if (m1668i == null) {
                new C3932c(this.f35756a);
                throw null;
            }
            byte[] m1667j = m1667j(m1668i, this.f35756a);
            str = m1666k(m1668i, this.f35756a);
            bArr = m1667j;
        } else {
            bArr = null;
            str = null;
        }
        if (this.f35760e) {
            Iterator<C3923a<T>> it = this.f35762g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C3923a<T> next = it.next();
                if (next.m1695j(bArr)) {
                    c3923a = next;
                    break;
                }
            }
        } else if (!this.f35762g.isEmpty()) {
            c3923a = this.f35762g.get(0);
        }
        if (c3923a == null) {
            C3923a<T> c3923a2 = new C3923a<>(this.f35756a, this.f35757b, this, bArr, str, this.f35765j, this.f35766k, this.f35759d, this.f35758c, looper, null, this.f35761f);
            this.f35762g.add(c3923a2);
            c3923a = c3923a2;
        }
        c3923a.m1698g();
        return c3923a;
    }

    @Override // com.google.android.exoplayer2.drm.C3923a.InterfaceC3926c
    /* renamed from: b */
    public void mo1675b(C3923a<T> c3923a) {
        this.f35763h.add(c3923a);
        if (this.f35763h.size() == 1) {
            c3923a.m1682w();
        }
    }

    @Override // com.google.android.exoplayer2.drm.C3923a.InterfaceC3926c
    /* renamed from: c */
    public void mo1674c(Exception exc) {
        for (C3923a<T> c3923a : this.f35763h) {
            c3923a.m1686s(exc);
        }
        this.f35763h.clear();
    }

    @Override // com.daaw.InterfaceC3746yu
    /* renamed from: d */
    public boolean mo1673d(DrmInitData drmInitData) {
        if (this.f35766k != null) {
            return true;
        }
        if (m1668i(drmInitData, this.f35756a, true) == null) {
            if (drmInitData.f35730s != 1 || !drmInitData.m1710h(0).m1706g(C1075dd.f6943c)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.f35756a);
        }
        String str = drmInitData.f35729r;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || sq1.f26525a >= 25;
    }

    @Override // com.google.android.exoplayer2.drm.C3923a.InterfaceC3926c
    /* renamed from: e */
    public void mo1672e() {
        for (C3923a<T> c3923a : this.f35763h) {
            c3923a.m1687r();
        }
        this.f35763h.clear();
    }

    @Override // com.daaw.InterfaceC3746yu
    /* renamed from: f */
    public void mo1671f(InterfaceC3933d<T> interfaceC3933d) {
        if (interfaceC3933d instanceof C3935e) {
            return;
        }
        C3923a<T> c3923a = (C3923a) interfaceC3933d;
        if (c3923a.m1681x()) {
            this.f35762g.remove(c3923a);
            if (this.f35763h.size() > 1 && this.f35763h.get(0) == c3923a) {
                this.f35763h.get(1).m1682w();
            }
            this.f35763h.remove(c3923a);
        }
    }

    /* renamed from: h */
    public final void m1669h(Handler handler, InterfaceC3927b interfaceC3927b) {
        throw null;
    }
}
