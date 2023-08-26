package xyz.danoz.recyclerviewfastscroller.sectionindicator.title;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import xyz.danoz.recyclerviewfastscroller.R;
import xyz.danoz.recyclerviewfastscroller.sectionindicator.AbsSectionIndicator;
/* loaded from: classes2.dex */
public abstract class SectionTitleIndicator<T> extends AbsSectionIndicator<T> {
    private static final int DEFAULT_BACKGROUND_COLOR = 17170432;
    private static final int DEFAULT_TEXT_COLOR = 17170443;
    private final View mIndicatorBackground;
    private final TextView mTitleText;
    private static final int[] STYLEABLE = R.styleable.SectionTitleIndicator;
    private static final int DEFAULT_TITLE_INDICATOR_LAYOUT = R.layout.section_indicator_with_title;

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.AbsSectionIndicator
    protected int getDefaultBackgroundColor() {
        return DEFAULT_BACKGROUND_COLOR;
    }

    protected int getDefaultTextColor() {
        return DEFAULT_TEXT_COLOR;
    }

    public SectionTitleIndicator(Context context) {
        this(context, null);
    }

    public SectionTitleIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SectionTitleIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mIndicatorBackground = findViewById(R.id.section_title_popup);
        this.mTitleText = (TextView) findViewById(R.id.section_indicator_text);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, STYLEABLE, 0, 0);
        try {
            applyCustomBackgroundColorAttribute(obtainStyledAttributes.getColor(R.styleable.SectionTitleIndicator_rfs_backgroundColor, getDefaultBackgroundColor()));
            applyCustomTextColorAttribute(obtainStyledAttributes.getColor(R.styleable.SectionTitleIndicator_rfs_textColor, getDefaultBackgroundColor()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.AbsSectionIndicator
    protected int getDefaultLayoutId() {
        return DEFAULT_TITLE_INDICATOR_LAYOUT;
    }

    @Override // xyz.danoz.recyclerviewfastscroller.sectionindicator.AbsSectionIndicator
    protected void applyCustomBackgroundColorAttribute(int i) {
        setIndicatorBackgroundColor(i);
    }

    public void setIndicatorBackgroundColor(int i) {
        Drawable background = this.mIndicatorBackground.getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        } else {
            this.mIndicatorBackground.setBackgroundColor(i);
        }
    }

    protected void applyCustomTextColorAttribute(int i) {
        setIndicatorTextColor(i);
    }

    public void setIndicatorTextColor(int i) {
        this.mTitleText.setTextColor(i);
    }

    public void setTitleText(String str) {
        this.mTitleText.setText(str);
    }
}
