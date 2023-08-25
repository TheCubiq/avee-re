package com.daaw;
/* loaded from: classes2.dex */
public final class vk8 implements tk8 {
    public static final j38 a;
    public static final j38 b;
    public static final j38 c;

    static {
        r28 a2 = new r28(t18.a("com.google.android.gms.measurement")).a();
        a = a2.f("measurement.client.sessions.check_on_reset_and_enable2", true);
        b = a2.f("measurement.client.sessions.check_on_startup", true);
        c = a2.f("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.daaw.tk8
    public final boolean zza() {
        return true;
    }

    @Override // com.daaw.tk8
    public final boolean zzb() {
        return ((Boolean) a.b()).booleanValue();
    }
}
