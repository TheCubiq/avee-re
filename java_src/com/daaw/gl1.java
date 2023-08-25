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

    /* renamed from: a */
    public Handler f11403a;

    /* renamed from: b */
    public ImageView f11404b;

    /* renamed from: c */
    public ImageView f11405c;

    /* renamed from: d */
    public ImageView f11406d;

    /* renamed from: e */
    public ImageView f11407e;

    /* renamed from: f */
    public ImageView f11408f;

    /* renamed from: g */
    public ImageView f11409g;

    /* renamed from: h */
    public TextView[] f11410h;

    /* renamed from: i */
    public ImageView[] f11411i;

    /* renamed from: j */
    public int f11412j;

    /* renamed from: com.daaw.gl1$a */
    /* loaded from: classes.dex */
    public class C1440a implements Handler.Callback {
        public C1440a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                gr1.m21324k(gl1.this);
                return false;
            }
            return false;
        }
    }

    /* renamed from: com.daaw.gl1$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1441b implements View.OnClickListener {
        public View$OnClickListenerC1441b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16527g0.m12018a(0);
        }
    }

    /* renamed from: com.daaw.gl1$c */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1442c implements View.OnClickListener {
        public View$OnClickListenerC1442c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16527g0.m12018a(1);
        }
    }

    /* renamed from: com.daaw.gl1$d */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1443d implements View.OnClickListener {
        public View$OnClickListenerC1443d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16530j0.m12990a();
        }
    }

    /* renamed from: com.daaw.gl1$e */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1444e implements View.OnClickListener {
        public View$OnClickListenerC1444e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16531k0.m12990a();
        }
    }

    /* renamed from: com.daaw.gl1$f */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1445f implements View.OnClickListener {
        public View$OnClickListenerC1445f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16525e0.m12018a(Integer.valueOf(ko0.f16524d0.m6692a(0).intValue() != 1 ? 1 : 0));
        }
    }

    /* renamed from: com.daaw.gl1$g */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC1446g implements View.OnClickListener {
        public View$OnClickListenerC1446g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ko0.f16525e0.m12018a(Integer.valueOf(ko0.f16524d0.m6692a(0).intValue() != 2 ? 2 : 0));
        }
    }

    public gl1(View view) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.f11410h = new TextView[7];
        this.f11411i = new ImageView[7];
        this.f11403a = new Handler(new C1440a());
        this.f11412j = gr1.m21321n(view, R.attr.mediaControlsFG);
        View inflate = View.inflate(view.getContext(), R.layout.popup_media_controls_overflow, null);
        View[] viewArr = new View[7];
        viewArr[0] = inflate.findViewById(R.id.groupPlaybackEngine0);
        viewArr[1] = inflate.findViewById(R.id.groupPlaybackEngine1);
        viewArr[2] = inflate.findViewById(R.id.groupVideoFit);
        viewArr[3] = inflate.findViewById(R.id.groupSwitchScreen);
        viewArr[4] = inflate.findViewById(R.id.groupRepeatOnce);
        viewArr[5] = inflate.findViewById(R.id.groupRepeatAll);
        this.f11406d = (ImageView) inflate.findViewById(R.id.btnPlaybackEngine0);
        viewArr[0].setOnClickListener(new View$OnClickListenerC1441b());
        this.f11407e = (ImageView) inflate.findViewById(R.id.btnPlaybackEngine1);
        viewArr[1].setOnClickListener(new View$OnClickListenerC1442c());
        this.f11408f = (ImageView) inflate.findViewById(R.id.btnVideoFit);
        viewArr[2].setOnClickListener(new View$OnClickListenerC1443d());
        this.f11409g = (ImageView) inflate.findViewById(R.id.btnSwitchScreen);
        viewArr[3].setOnClickListener(new View$OnClickListenerC1444e());
        this.f11404b = (ImageView) inflate.findViewById(R.id.btnRepeatOnce);
        viewArr[4].setOnClickListener(new View$OnClickListenerC1445f());
        this.f11405c = (ImageView) inflate.findViewById(R.id.btnRepeatAll);
        viewArr[5].setOnClickListener(new View$OnClickListenerC1446g());
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        this.f11409g.setColorFilter(this.f11412j);
        m21493d(ko0.f16529i0.m6692a(0).intValue());
        m21496a(ko0.f16526f0.m6692a(-1).intValue());
        m21495b(ko0.f16524d0.m6692a(0).intValue());
        m21494c(ko0.f16522b0.m6692a(0).intValue());
        Point point = new Point();
        view.getLocationInWindow(r0);
        view.getDisplay().getRealSize(point);
        int[] iArr = {0, point.y - iArr[1]};
        showAtLocation(view, 8388691, iArr[0], iArr[1]);
    }

    /* renamed from: a */
    public void m21496a(int i) {
        ImageView imageView;
        int m21321n;
        if (i == 0) {
            ImageView imageView2 = this.f11406d;
            imageView2.setColorFilter(gr1.m21321n(imageView2, R.attr.mediaControlsHighLight));
            imageView = this.f11407e;
            m21321n = gr1.m21321n(imageView, R.attr.mediaControlsFG);
        } else {
            ImageView imageView3 = this.f11406d;
            imageView3.setColorFilter(gr1.m21321n(imageView3, R.attr.mediaControlsFG));
            imageView = this.f11407e;
            m21321n = gr1.m21321n(imageView, R.attr.mediaControlsHighLight);
        }
        imageView.setColorFilter(m21321n);
    }

    /* renamed from: b */
    public void m21495b(int i) {
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int m21321n;
        if (i == 1) {
            imageView = this.f11404b;
            i2 = gr1.m21321n(imageView, R.attr.mediaControlsHighLight);
        } else if (i == 2) {
            this.f11404b.setColorFilter(this.f11412j);
            imageView2 = this.f11405c;
            m21321n = gr1.m21321n(imageView2, R.attr.mediaControlsHighLight);
            imageView2.setColorFilter(m21321n);
        } else {
            imageView = this.f11404b;
            i2 = this.f11412j;
        }
        imageView.setColorFilter(i2);
        imageView2 = this.f11405c;
        m21321n = this.f11412j;
        imageView2.setColorFilter(m21321n);
    }

    /* renamed from: c */
    public void m21494c(int i) {
    }

    /* renamed from: d */
    public void m21493d(int i) {
        ImageView imageView;
        int i2;
        if (i == 1) {
            imageView = this.f11408f;
            i2 = R.drawable.ic_vis_fit3;
        } else if (i != 2) {
            if (i == 3) {
                imageView = this.f11408f;
                i2 = R.drawable.ic_vis_stretch3;
            }
            this.f11408f.setColorFilter(this.f11412j);
        } else {
            imageView = this.f11408f;
            i2 = R.drawable.ic_vis_fit_crop3;
        }
        imageView.setImageResource(i2);
        this.f11408f.setColorFilter(this.f11412j);
    }
}
