package com.daaw;
/* loaded from: classes2.dex */
public enum b32 {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11);
    
    public static final ix8 E;
    public final int p;

    static {
        b32[] values;
        bw8 bw8Var = new bw8();
        for (b32 b32Var : values()) {
            bw8Var.a(Integer.valueOf(b32Var.p), b32Var);
        }
        E = bw8Var.b();
    }

    b32(int i) {
        this.p = i;
    }

    public static b32 a(int i) {
        ix8 ix8Var = E;
        Integer valueOf = Integer.valueOf(i);
        return !ix8Var.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (b32) ix8Var.get(valueOf);
    }
}
