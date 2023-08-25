package com.daaw;

import java.util.Set;
/* loaded from: classes.dex */
public final class wx4 extends kw4 implements yx4 {
    public wx4(Set set) {
        super(set);
    }

    @Override // com.daaw.yx4
    public final void c(final String str, final String str2) {
        B0(new jw4() { // from class: com.daaw.tx4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).c(str, str2);
            }
        });
    }

    @Override // com.daaw.yx4
    public final void l(final String str) {
        B0(new jw4() { // from class: com.daaw.ux4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).l(str);
            }
        });
    }

    @Override // com.daaw.yx4
    public final void m(final String str) {
        B0(new jw4() { // from class: com.daaw.sx4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).m(str);
            }
        });
    }

    @Override // com.daaw.yx4
    public final void zza(String str) {
        B0(new jw4("MalformedJson") { // from class: com.daaw.vx4
            public final /* synthetic */ String a = "MalformedJson";

            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).zza(this.a);
            }
        });
    }

    @Override // com.daaw.yx4
    public final void zze() {
        B0(new jw4() { // from class: com.daaw.rx4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).zze();
            }
        });
    }

    @Override // com.daaw.yx4
    public final void zzf() {
        B0(new jw4() { // from class: com.daaw.ox4
            @Override // com.daaw.jw4
            public final void zza(Object obj) {
                ((yx4) obj).zzf();
            }
        });
    }
}
