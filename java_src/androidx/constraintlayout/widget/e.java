package androidx.constraintlayout.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.daaw.qj;
/* loaded from: classes.dex */
public class e extends View {
    public int p;
    public View q;
    public int r;

    public void a(ConstraintLayout constraintLayout) {
        if (this.q == null) {
            return;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
        ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.q.getLayoutParams();
        bVar2.n0.A0(0);
        qj.b w = bVar.n0.w();
        qj.b bVar3 = qj.b.FIXED;
        if (w != bVar3) {
            bVar.n0.B0(bVar2.n0.N());
        }
        if (bVar.n0.K() != bVar3) {
            bVar.n0.e0(bVar2.n0.t());
        }
        bVar2.n0.A0(8);
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.p == -1 && !isInEditMode()) {
            setVisibility(this.r);
        }
        View findViewById = constraintLayout.findViewById(this.p);
        this.q = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).b0 = true;
            this.q.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.q;
    }

    public int getEmptyVisibility() {
        return this.r;
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
        if (this.p == i) {
            return;
        }
        View view = this.q;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.b) this.q.getLayoutParams()).b0 = false;
            this.q = null;
        }
        this.p = i;
        if (i == -1 || (findViewById = ((View) getParent()).findViewById(i)) == null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int i) {
        this.r = i;
    }
}
