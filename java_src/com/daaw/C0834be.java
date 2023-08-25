package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.daaw.i61;
/* renamed from: com.daaw.be */
/* loaded from: classes.dex */
public class C0834be extends C1076de {

    /* renamed from: com.daaw.be$a */
    /* loaded from: classes.dex */
    public class C0835a implements i61.InterfaceC1661a {
        public C0835a() {
        }

        @Override // com.daaw.i61.InterfaceC1661a
        /* renamed from: a */
        public void mo20049a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // com.daaw.InterfaceC1273fe
    /* renamed from: h */
    public void mo22759h() {
        i61.f13296r = new C0835a();
    }
}
