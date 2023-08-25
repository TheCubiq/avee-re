package com.daaw;

import android.graphics.Point;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.daaw.avee.R;
/* loaded from: classes.dex */
public class gl1 extends PopupWindow {
    public Handler a;
    public ImageView b;
    public ImageView c;
    public ImageView d;
    public ImageView e;
    public ImageView f;
    public ImageView g;
    public TextView[] h;
    public ImageView[] i;
    public int j;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                gr1.k(gl1.this);
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.g0.a(0);
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.g0.a(1);
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.j0.a();
        }
    }

    /* loaded from: classes.dex */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.k0.a();
        }
    }

    /* loaded from: classes.dex */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.e0.a(Integer.valueOf(ko0.d0.a(0).intValue() != 1 ? 1 : 0));
        }
    }

    /* loaded from: classes.dex */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.e0.a(Integer.valueOf(ko0.d0.a(0).intValue() != 2 ? 2 : 0));
        }
    }

    public gl1(View view) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.h = new TextView[7];
        this.i = new ImageView[7];
        this.a = new Handler(new a());
        this.j = gr1.n(view, R.attr.mediaControlsFG);
        View inflate = View.inflate(view.getContext(), R.layout.popup_media_controls_overflow, null);
        View[] viewArr = new View[7];
        viewArr[0] = inflate.findViewById(R.id.groupPlaybackEngine0);
        viewArr[1] = inflate.findViewById(R.id.groupPlaybackEngine1);
        viewArr[2] = inflate.findViewById(R.id.groupVideoFit);
        viewArr[3] = inflate.findViewById(R.id.groupSwitchScreen);
        viewArr[4] = inflate.findViewById(R.id.groupRepeatOnce);
        viewArr[5] = inflate.findViewById(R.id.groupRepeatAll);
        this.d = (ImageView) inflate.findViewById(R.id.btnPlaybackEngine0);
        viewArr[0].setOnClickListener(new b());
        this.e = (ImageView) inflate.findViewById(R.id.btnPlaybackEngine1);
        viewArr[1].setOnClickListener(new c());
        this.f = (ImageView) inflate.findViewById(R.id.btnVideoFit);
        viewArr[2].setOnClickListener(new d());
        this.g = (ImageView) inflate.findViewById(R.id.btnSwitchScreen);
        viewArr[3].setOnClickListener(new e());
        this.b = (ImageView) inflate.findViewById(R.id.btnRepeatOnce);
        viewArr[4].setOnClickListener(new f());
        this.c = (ImageView) inflate.findViewById(R.id.btnRepeatAll);
        viewArr[5].setOnClickListener(new g());
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        this.g.setColorFilter(this.j);
        d(ko0.i0.a(0).intValue());
        a(ko0.f0.a(-1).intValue());
        b(ko0.d0.a(0).intValue());
        c(ko0.b0.a(0).intValue());
        Point point = new Point();
        view.getLocationInWindow(r0);
        view.getDisplay().getRealSize(point);
        int[] iArr = {0, point.y - iArr[1]};
        showAtLocation(view, 8388691, iArr[0], iArr[1]);
    }

    public void a(int i) {
        ImageView imageView;
        int n;
        if (i == 0) {
            ImageView imageView2 = this.d;
            imageView2.setColorFilter(gr1.n(imageView2, R.attr.mediaControlsHighLight));
            imageView = this.e;
            n = gr1.n(imageView, R.attr.mediaControlsFG);
        } else {
            ImageView imageView3 = this.d;
            imageView3.setColorFilter(gr1.n(imageView3, R.attr.mediaControlsFG));
            imageView = this.e;
            n = gr1.n(imageView, R.attr.mediaControlsHighLight);
        }
        imageView.setColorFilter(n);
    }

    public void b(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int n;
        if (i == 1) {
            imageView = this.b;
            i2 = gr1.n(imageView, R.attr.mediaControlsHighLight);
        } else if (i == 2) {
            this.b.setColorFilter(this.j);
            imageView2 = this.c;
            n = gr1.n(imageView2, R.attr.mediaControlsHighLight);
            imageView2.setColorFilter(n);
        } else {
            imageView = this.b;
            i2 = this.j;
        }
        imageView.setColorFilter(i2);
        imageView2 = this.c;
        n = this.j;
        imageView2.setColorFilter(n);
    }

    public void c(int i) {
    }

    public void d(int i) {
        ImageView imageView;
        int i2;
        if (i == 1) {
            imageView = this.f;
            i2 = R.drawable.ic_vis_fit3;
        } else if (i != 2) {
            if (i == 3) {
                imageView = this.f;
                i2 = R.drawable.ic_vis_stretch3;
            }
            this.f.setColorFilter(this.j);
        } else {
            imageView = this.f;
            i2 = R.drawable.ic_vis_fit_crop3;
        }
        imageView.setImageResource(i2);
        this.f.setColorFilter(this.j);
    }
}
