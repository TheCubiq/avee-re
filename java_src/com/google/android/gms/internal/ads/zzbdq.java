package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* loaded from: classes2.dex */
public final class zzbdq<FieldDescriptorType> extends zzbdp<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbdq(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbdp
    public final void zzaaz() {
        if (!isImmutable()) {
            for (int i = 0; i < zzafs(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzcy = zzcy(i);
                if (((zzbbi) zzcy.getKey()).zzada()) {
                    zzcy.setValue(Collections.unmodifiableList((List) zzcy.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzaft()) {
                if (((zzbbi) entry.getKey()).zzada()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzaaz();
    }
}
