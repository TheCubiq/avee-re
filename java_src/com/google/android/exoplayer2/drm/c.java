package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.daaw.d01;
import com.daaw.dd;
import com.daaw.nz;
import com.daaw.s6;
import com.daaw.sq1;
import com.daaw.yu;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
@TargetApi(18)
/* loaded from: classes.dex */
public class c<T extends nz> implements yu<T>, a.c<T> {
    public final UUID a;
    public final f<T> b;
    public final g c;
    public final HashMap<String, String> d;
    public final boolean e;
    public final int f;
    public final List<com.google.android.exoplayer2.drm.a<T>> g;
    public final List<com.google.android.exoplayer2.drm.a<T>> h;
    public Looper i;
    public int j;
    public byte[] k;
    public volatile c<T>.b l;

    @SuppressLint({"HandlerLeak"})
    /* loaded from: classes.dex */
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (com.google.android.exoplayer2.drm.a aVar : c.this.g) {
                if (aVar.k(bArr)) {
                    aVar.q(message.what);
                    return;
                }
            }
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0094c extends Exception {
        public C0094c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static DrmInitData.SchemeData i(DrmInitData drmInitData, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(drmInitData.s);
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= drmInitData.s) {
                break;
            }
            DrmInitData.SchemeData h = drmInitData.h(i);
            if (!h.g(uuid) && (!dd.d.equals(uuid) || !h.g(dd.c))) {
                z2 = false;
            }
            if (z2 && (h.s != null || z)) {
                arrayList.add(h);
            }
            i++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dd.e.equals(uuid)) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData = (DrmInitData.SchemeData) arrayList.get(i2);
                int f = schemeData.c() ? d01.f(schemeData.s) : -1;
                int i3 = sq1.a;
                if (i3 < 23 && f == 0) {
                    return schemeData;
                }
                if (i3 >= 23 && f == 1) {
                    return schemeData;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    public static byte[] j(DrmInitData.SchemeData schemeData, UUID uuid) {
        byte[] d;
        byte[] bArr = schemeData.s;
        return (sq1.a >= 21 || (d = d01.d(bArr, uuid)) == null) ? bArr : d;
    }

    public static String k(DrmInitData.SchemeData schemeData, UUID uuid) {
        String str = schemeData.r;
        return (sq1.a >= 26 || !dd.d.equals(uuid)) ? str : ("video/mp4".equals(str) || "audio/mp4".equals(str)) ? "cenc" : str;
    }

    @Override // com.daaw.yu
    public d<T> a(Looper looper, DrmInitData drmInitData) {
        byte[] bArr;
        String str;
        Looper looper2 = this.i;
        s6.f(looper2 == null || looper2 == looper);
        if (this.g.isEmpty()) {
            this.i = looper;
            if (this.l == null) {
                this.l = new b(looper);
            }
        }
        com.google.android.exoplayer2.drm.a<T> aVar = null;
        if (this.k == null) {
            DrmInitData.SchemeData i = i(drmInitData, this.a, false);
            if (i == null) {
                new C0094c(this.a);
                throw null;
            }
            byte[] j = j(i, this.a);
            str = k(i, this.a);
            bArr = j;
        } else {
            bArr = null;
            str = null;
        }
        if (this.e) {
            Iterator<com.google.android.exoplayer2.drm.a<T>> it = this.g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.exoplayer2.drm.a<T> next = it.next();
                if (next.j(bArr)) {
                    aVar = next;
                    break;
                }
            }
        } else if (!this.g.isEmpty()) {
            aVar = this.g.get(0);
        }
        if (aVar == null) {
            com.google.android.exoplayer2.drm.a<T> aVar2 = new com.google.android.exoplayer2.drm.a<>(this.a, this.b, this, bArr, str, this.j, this.k, this.d, this.c, looper, null, this.f);
            this.g.add(aVar2);
            aVar = aVar2;
        }
        aVar.g();
        return aVar;
    }

    @Override // com.google.android.exoplayer2.drm.a.c
    public void b(com.google.android.exoplayer2.drm.a<T> aVar) {
        this.h.add(aVar);
        if (this.h.size() == 1) {
            aVar.w();
        }
    }

    @Override // com.google.android.exoplayer2.drm.a.c
    public void c(Exception exc) {
        for (com.google.android.exoplayer2.drm.a<T> aVar : this.h) {
            aVar.s(exc);
        }
        this.h.clear();
    }

    @Override // com.daaw.yu
    public boolean d(DrmInitData drmInitData) {
        if (this.k != null) {
            return true;
        }
        if (i(drmInitData, this.a, true) == null) {
            if (drmInitData.s != 1 || !drmInitData.h(0).g(dd.c)) {
                return false;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DrmInitData only contains common PSSH SchemeData. Assuming support for: ");
            sb.append(this.a);
        }
        String str = drmInitData.r;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        return !("cbc1".equals(str) || "cbcs".equals(str) || "cens".equals(str)) || sq1.a >= 25;
    }

    @Override // com.google.android.exoplayer2.drm.a.c
    public void e() {
        for (com.google.android.exoplayer2.drm.a<T> aVar : this.h) {
            aVar.r();
        }
        this.h.clear();
    }

    @Override // com.daaw.yu
    public void f(d<T> dVar) {
        if (dVar instanceof e) {
            return;
        }
        com.google.android.exoplayer2.drm.a<T> aVar = (com.google.android.exoplayer2.drm.a) dVar;
        if (aVar.x()) {
            this.g.remove(aVar);
            if (this.h.size() > 1 && this.h.get(0) == aVar) {
                this.h.get(1).w();
            }
            this.h.remove(aVar);
        }
    }

    public final void h(Handler handler, com.google.android.exoplayer2.drm.b bVar) {
        throw null;
    }
}
