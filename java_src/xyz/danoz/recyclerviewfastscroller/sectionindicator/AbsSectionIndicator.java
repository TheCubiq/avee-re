package xyz.danoz.recyclerviewfastscroller.sectionindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import xyz.danoz.recyclerviewfastscroller.R;
import xyz.danoz.recyclerviewfastscroller.calculation.VerticalScrollBoundsProvider;
import xyz.danoz.recyclerviewfastscroller.calculation.position.VerticalScreenPositionCalculator;
import xyz.danoz.recyclerviewfastscroller.sectionindicator.animation.DefaultSectionIndicatorAlphaAnimator;
/* loaded from: classes2.dex */
public abstract class AbsSectionIndicator<T> extends FrameLayout implements SectionIndicator<T> {
    private static final int[] STYLEABLE = R.styleable.AbsSectionIndicator;
    private DefaultSectionIndicatorAlphaAnimator mDefaultSectionIndicatorAlphaAnimator;
    private VerticalScreenPositionCalculator mScreenPositionCalculator;

    protected abstract void applyCustomBackgroundColorAttribute(int i);

    protected abstract int getDefaultBackgroundColor();

    protected abstract int getDefaultLayoutId();

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.SectionIndicator
    public abstract void setSection(T t);

    public AbsSectionIndicator(Context context) {
        this(context, null);
    }

    public AbsSectionIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AbsSectionIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, STYLEABLE, 0, 0);
        try {
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(obtainStyledAttributes.getResourceId(R.styleable.AbsSectionIndicator_rfs_section_indicator_layout, getDefaultLayoutId()), (ViewGroup) this, true);
            obtainStyledAttributes.recycle();
            this.mDefaultSectionIndicatorAlphaAnimator = new DefaultSectionIndicatorAlphaAnimator(this);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.mScreenPositionCalculator == null) {
            this.mScreenPositionCalculator = new VerticalScreenPositionCalculator(new VerticalScrollBoundsProvider(0.0f, ((ViewGroup) getParent()).getHeight() - getHeight()));
        }
    }

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.SectionIndicator
    public void setProgress(float f) {
        setY(this.mScreenPositionCalculator.getYPositionFromScrollProgress(f));
    }

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.SectionIndicator
    public void animateAlpha(float f) {
        this.mDefaultSectionIndicatorAlphaAnimator.animateTo(f);
    }
}
