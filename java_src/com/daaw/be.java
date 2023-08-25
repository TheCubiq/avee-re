package com.daaw;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.daaw.i61;
/* loaded from: classes.dex */
public class be extends de {

    /* loaded from: classes.dex */
    public class a implements i61.a {
        public a() {
        }

        @Override // com.daaw.i61.a
        public void a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // com.daaw.fe
    public void h() {
        i61.r = new a();
    }
}
