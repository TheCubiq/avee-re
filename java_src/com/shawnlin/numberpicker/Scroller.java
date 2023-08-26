package com.shawnlin.numberpicker;

import android.content.Context;
import android.view.ViewConfiguration;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
/* loaded from: classes2.dex */
public class Scroller {
    private static final int DEFAULT_DURATION = 250;
    private static final int FLING_MODE = 1;
    private static final int NB_SAMPLES = 100;
    private static final int SCROLL_MODE = 0;
    private static float sViscousFluidNormalize;
    private static float sViscousFluidScale;
    private int mCurrX;
    private int mCurrY;
    private float mDeceleration;
    private float mDeltaX;
    private float mDeltaY;
    private int mDuration;
    private float mDurationReciprocal;
    private int mFinalX;
    private int mFinalY;
    private boolean mFinished;
    private boolean mFlywheel;
    private Interpolator mInterpolator;
    private int mMaxX;
    private int mMaxY;
    private int mMinX;
    private int mMinY;
    private int mMode;
    private final float mPpi;
    private long mStartTime;
    private int mStartX;
    private int mStartY;
    private float mVelocity;
    private static float DECELERATION_RATE = (float) (Math.log(0.75d) / Math.log(0.9d));
    private static float ALPHA = 800.0f;
    private static float START_TENSION = 0.4f;
    private static float END_TENSION = 1.0f - 0.4f;
    private static final float[] SPLINE = new float[101];

    static {
        float f;
        float f2;
        float f3 = 0.0f;
        for (int i = 0; i <= 100; i++) {
            float f4 = i / 100.0f;
            float f5 = 1.0f;
            while (true) {
                float f6 = ((f5 - f3) / 2.0f) + f3;
                float f7 = 1.0f - f6;
                f = 3.0f * f6 * f7;
                f2 = f6 * f6 * f6;
                float f8 = (((f7 * START_TENSION) + (END_TENSION * f6)) * f) + f2;
                if (Math.abs(f8 - f4) < 1.0E-5d) {
                    break;
                } else if (f8 > f4) {
                    f5 = f6;
                } else {
                    f3 = f6;
                }
            }
            SPLINE[i] = f + f2;
        }
        SPLINE[100] = 1.0f;
        sViscousFluidScale = 8.0f;
        sViscousFluidNormalize = 1.0f;
        sViscousFluidNormalize = 1.0f / viscousFluid(1.0f);
    }

    public Scroller(Context context) {
        this(context, null);
    }

    public Scroller(Context context, Interpolator interpolator) {
        this(context, interpolator, true);
    }

    public Scroller(Context context, Interpolator interpolator, boolean z) {
        this.mFinished = true;
        this.mInterpolator = interpolator;
        this.mPpi = context.getResources().getDisplayMetrics().density * 160.0f;
        this.mDeceleration = computeDeceleration(ViewConfiguration.getScrollFriction());
        this.mFlywheel = z;
    }

    public final void setFriction(float f) {
        this.mDeceleration = computeDeceleration(f);
    }

    private float computeDeceleration(float f) {
        return this.mPpi * 386.0878f * f;
    }

    public final boolean isFinished() {
        return this.mFinished;
    }

    public final void forceFinished(boolean z) {
        this.mFinished = z;
    }

    public final int getDuration() {
        return this.mDuration;
    }

    public final int getCurrX() {
        return this.mCurrX;
    }

    public final int getCurrY() {
        return this.mCurrY;
    }

    public float getCurrVelocity() {
        return this.mVelocity - ((this.mDeceleration * timePassed()) / 2000.0f);
    }

    public final int getStartX() {
        return this.mStartX;
    }

    public final int getStartY() {
        return this.mStartY;
    }

    public final int getFinalX() {
        return this.mFinalX;
    }

    public final int getFinalY() {
        return this.mFinalY;
    }

    public boolean computeScrollOffset() {
        float interpolation;
        if (this.mFinished) {
            return false;
        }
        int currentAnimationTimeMillis = (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
        int i = this.mDuration;
        if (currentAnimationTimeMillis < i) {
            int i2 = this.mMode;
            if (i2 == 0) {
                float f = currentAnimationTimeMillis * this.mDurationReciprocal;
                Interpolator interpolator = this.mInterpolator;
                if (interpolator == null) {
                    interpolation = viscousFluid(f);
                } else {
                    interpolation = interpolator.getInterpolation(f);
                }
                this.mCurrX = this.mStartX + Math.round(this.mDeltaX * interpolation);
                this.mCurrY = this.mStartY + Math.round(interpolation * this.mDeltaY);
            } else if (i2 == 1) {
                float f2 = currentAnimationTimeMillis / i;
                int i3 = (int) (f2 * 100.0f);
                float f3 = i3 / 100.0f;
                int i4 = i3 + 1;
                float[] fArr = SPLINE;
                float f4 = fArr[i3];
                float f5 = f4 + (((f2 - f3) / ((i4 / 100.0f) - f3)) * (fArr[i4] - f4));
                int i5 = this.mStartX;
                int round = i5 + Math.round((this.mFinalX - i5) * f5);
                this.mCurrX = round;
                int min = Math.min(round, this.mMaxX);
                this.mCurrX = min;
                this.mCurrX = Math.max(min, this.mMinX);
                int i6 = this.mStartY;
                int round2 = i6 + Math.round(f5 * (this.mFinalY - i6));
                this.mCurrY = round2;
                int min2 = Math.min(round2, this.mMaxY);
                this.mCurrY = min2;
                int max = Math.max(min2, this.mMinY);
                this.mCurrY = max;
                if (this.mCurrX == this.mFinalX && max == this.mFinalY) {
                    this.mFinished = true;
                }
            }
        } else {
            this.mCurrX = this.mFinalX;
            this.mCurrY = this.mFinalY;
            this.mFinished = true;
        }
        return true;
    }

    public void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, 250);
    }

    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.mMode = 0;
        this.mFinished = false;
        this.mDuration = i5;
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i;
        this.mStartY = i2;
        this.mFinalX = i + i3;
        this.mFinalY = i2 + i4;
        this.mDeltaX = i3;
        this.mDeltaY = i4;
        this.mDurationReciprocal = 1.0f / this.mDuration;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (!this.mFlywheel || this.mFinished) {
            i9 = i3;
        } else {
            float currVelocity = getCurrVelocity();
            float f = this.mFinalX - this.mStartX;
            float f2 = this.mFinalY - this.mStartY;
            float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
            float f3 = (f / sqrt) * currVelocity;
            float f4 = (f2 / sqrt) * currVelocity;
            i9 = i3;
            float f5 = i9;
            if (Math.signum(f5) == Math.signum(f3)) {
                i10 = i4;
                float f6 = i10;
                if (Math.signum(f6) == Math.signum(f4)) {
                    i9 = (int) (f5 + f3);
                    i10 = (int) (f6 + f4);
                }
                this.mMode = 1;
                this.mFinished = false;
                float sqrt2 = (float) Math.sqrt((i9 * i9) + (i10 * i10));
                this.mVelocity = sqrt2;
                double log = Math.log((START_TENSION * sqrt2) / ALPHA);
                double d = DECELERATION_RATE;
                Double.isNaN(d);
                this.mDuration = (int) (Math.exp(log / (d - 1.0d)) * 1000.0d);
                this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
                this.mStartX = i;
                this.mStartY = i2;
                float f7 = sqrt2 != 0.0f ? 1.0f : i9 / sqrt2;
                float f8 = sqrt2 != 0.0f ? i10 / sqrt2 : 1.0f;
                double d2 = ALPHA;
                float f9 = DECELERATION_RATE;
                double d3 = f9;
                double d4 = f9;
                Double.isNaN(d4);
                Double.isNaN(d3);
                double exp = Math.exp((d3 / (d4 - 1.0d)) * log);
                Double.isNaN(d2);
                this.mMinX = i5;
                this.mMaxX = i6;
                this.mMinY = i7;
                this.mMaxY = i8;
                float f10 = (int) (d2 * exp);
                int round = i + Math.round(f7 * f10);
                this.mFinalX = round;
                int min = Math.min(round, this.mMaxX);
                this.mFinalX = min;
                this.mFinalX = Math.max(min, this.mMinX);
                int round2 = Math.round(f10 * f8) + i2;
                this.mFinalY = round2;
                int min2 = Math.min(round2, this.mMaxY);
                this.mFinalY = min2;
                this.mFinalY = Math.max(min2, this.mMinY);
            }
        }
        i10 = i4;
        this.mMode = 1;
        this.mFinished = false;
        float sqrt22 = (float) Math.sqrt((i9 * i9) + (i10 * i10));
        this.mVelocity = sqrt22;
        double log2 = Math.log((START_TENSION * sqrt22) / ALPHA);
        double d5 = DECELERATION_RATE;
        Double.isNaN(d5);
        this.mDuration = (int) (Math.exp(log2 / (d5 - 1.0d)) * 1000.0d);
        this.mStartTime = AnimationUtils.currentAnimationTimeMillis();
        this.mStartX = i;
        this.mStartY = i2;
        if (sqrt22 != 0.0f) {
        }
        if (sqrt22 != 0.0f) {
        }
        double d22 = ALPHA;
        float f92 = DECELERATION_RATE;
        double d32 = f92;
        double d42 = f92;
        Double.isNaN(d42);
        Double.isNaN(d32);
        double exp2 = Math.exp((d32 / (d42 - 1.0d)) * log2);
        Double.isNaN(d22);
        this.mMinX = i5;
        this.mMaxX = i6;
        this.mMinY = i7;
        this.mMaxY = i8;
        float f102 = (int) (d22 * exp2);
        int round3 = i + Math.round(f7 * f102);
        this.mFinalX = round3;
        int min3 = Math.min(round3, this.mMaxX);
        this.mFinalX = min3;
        this.mFinalX = Math.max(min3, this.mMinX);
        int round22 = Math.round(f102 * f8) + i2;
        this.mFinalY = round22;
        int min22 = Math.min(round22, this.mMaxY);
        this.mFinalY = min22;
        this.mFinalY = Math.max(min22, this.mMinY);
    }

    static float viscousFluid(float f) {
        float exp;
        float f2 = f * sViscousFluidScale;
        if (f2 < 1.0f) {
            exp = f2 - (1.0f - ((float) Math.exp(-f2)));
        } else {
            exp = ((1.0f - ((float) Math.exp(1.0f - f2))) * 0.63212055f) + 0.36787945f;
        }
        return exp * sViscousFluidNormalize;
    }

    public void abortAnimation() {
        this.mCurrX = this.mFinalX;
        this.mCurrY = this.mFinalY;
        this.mFinished = true;
    }

    public void extendDuration(int i) {
        int timePassed = timePassed() + i;
        this.mDuration = timePassed;
        this.mDurationReciprocal = 1.0f / timePassed;
        this.mFinished = false;
    }

    public int timePassed() {
        return (int) (AnimationUtils.currentAnimationTimeMillis() - this.mStartTime);
    }

    public void setFinalX(int i) {
        this.mFinalX = i;
        this.mDeltaX = i - this.mStartX;
        this.mFinished = false;
    }

    public void setFinalY(int i) {
        this.mFinalY = i;
        this.mDeltaY = i - this.mStartY;
        this.mFinished = false;
    }

    public boolean isScrollingInDirection(float f, float f2) {
        return !this.mFinished && Math.signum(f) == Math.signum((float) (this.mFinalX - this.mStartX)) && Math.signum(f2) == Math.signum((float) (this.mFinalY - this.mStartY));
    }
}
