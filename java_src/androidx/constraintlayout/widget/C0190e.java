package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.C2716qj;
/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public class C0190e extends View {

    /* renamed from: p */
    public int f1105p;

    /* renamed from: q */
    public View f1106q;

    /* renamed from: r */
    public int f1107r;

    /* renamed from: a */
    public void m29826a(ConstraintLayout constraintLayout) {
        if (this.f1106q == null) {
            return;
        }
        ConstraintLayout.C0175b c0175b = (ConstraintLayout.C0175b) getLayoutParams();
        ConstraintLayout.C0175b c0175b2 = (ConstraintLayout.C0175b) this.f1106q.getLayoutParams();
        c0175b2.f943n0.m12468A0(0);
        C2716qj.EnumC2718b m12397w = c0175b.f943n0.m12397w();
        C2716qj.EnumC2718b enumC2718b = C2716qj.EnumC2718b.FIXED;
        if (m12397w != enumC2718b) {
            c0175b.f943n0.m12466B0(c0175b2.f943n0.m12450N());
        }
        if (c0175b.f943n0.m12453K() != enumC2718b) {
            c0175b.f943n0.m12432e0(c0175b2.f943n0.m12403t());
        }
        c0175b2.f943n0.m12468A0(8);
    }

    /* renamed from: b */
    public void m29825b(ConstraintLayout constraintLayout) {
        if (this.f1105p == -1 && !isInEditMode()) {
            setVisibility(this.f1107r);
        }
        View findViewById = constraintLayout.findViewById(this.f1105p);
        this.f1106q = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.C0175b) findViewById.getLayoutParams()).f919b0 = true;
            this.f1106q.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.f1106q;
    }

    public int getEmptyVisibility() {
        return this.f1107r;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((width / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((height / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int i) {
        View findViewById;
        if (this.f1105p == i) {
            return;
        }
        View view = this.f1106q;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.C0175b) this.f1106q.getLayoutParams()).f919b0 = false;
            this.f1106q = null;
        }
        this.f1105p = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.f1107r = i;
    }
}
