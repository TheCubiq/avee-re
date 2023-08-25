package com.daaw;

import android.net.Uri;
import java.io.EOFException;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes.dex */
public final class mq8 implements os8 {

    /* renamed from: a */
    public final q09 f19083a;

    /* renamed from: b */
    public j09 f19084b;

    /* renamed from: c */
    public k09 f19085c;

    public mq8(q09 q09Var) {
        this.f19083a = q09Var;
    }

    @Override // com.daaw.os8
    /* renamed from: a */
    public final int mo14006a(f42 f42Var) {
        j09 j09Var = this.f19084b;
        Objects.requireNonNull(j09Var);
        k09 k09Var = this.f19085c;
        Objects.requireNonNull(k09Var);
        return j09Var.mo3954d(k09Var, f42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r6.zzf() != r11) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        r1 = false;
     */
    @Override // com.daaw.os8
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo14005b(xp8 xp8Var, Uri uri, Map map, long j, long j2, m09 m09Var) {
        rz8 rz8Var = new rz8(xp8Var, j, j2);
        this.f19085c = rz8Var;
        if (this.f19084b != null) {
            return;
        }
        j09[] mo2588a = this.f19083a.mo2588a(uri, map);
        int length = mo2588a.length;
        boolean z = false;
        if (length == 1) {
            this.f19084b = mo2588a[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                j09 j09Var = mo2588a[i];
                try {
                } catch (EOFException unused) {
                    if (this.f19084b == null) {
                    }
                } catch (Throwable th) {
                    uo4.m7872f((this.f19084b != null || rz8Var.zzf() == j) ? true : true);
                    rz8Var.zzj();
                    throw th;
                }
                if (j09Var.mo3957a(rz8Var)) {
                    this.f19084b = j09Var;
                    uo4.m7872f(true);
                    rz8Var.zzj();
                    break;
                }
                if (this.f19084b == null) {
                }
                boolean z2 = true;
                uo4.m7872f(z2);
                rz8Var.zzj();
                i++;
            }
            if (this.f19084b == null) {
                String m19385k = it5.m19385k(mo2588a);
                throw new bu8("None of the available extractors (" + m19385k + ") could read the stream.", uri);
            }
        }
        this.f19084b.mo3955c(m09Var);
    }

    @Override // com.daaw.os8
    /* renamed from: c */
    public final void mo14004c(long j, long j2) {
        j09 j09Var = this.f19084b;
        Objects.requireNonNull(j09Var);
        j09Var.mo3953f(j, j2);
    }

    @Override // com.daaw.os8
    public final long zzb() {
        k09 k09Var = this.f19085c;
        if (k09Var != null) {
            return k09Var.zzf();
        }
        return -1L;
    }

    @Override // com.daaw.os8
    public final void zzc() {
        j09 j09Var = this.f19084b;
        if (j09Var instanceof v82) {
            ((v82) j09Var).m7344b();
        }
    }

    @Override // com.daaw.os8
    public final void zze() {
        if (this.f19084b != null) {
            this.f19084b = null;
        }
        this.f19085c = null;
    }
}
