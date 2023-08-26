package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.ViewCompat;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public class DefaultTimeBar extends View implements TimeBar {
    public static final int DEFAULT_AD_MARKER_COLOR = -1291845888;
    public static final int DEFAULT_AD_MARKER_WIDTH_DP = 4;
    public static final int DEFAULT_BAR_HEIGHT_DP = 4;
    private static final int DEFAULT_INCREMENT_COUNT = 20;
    public static final int DEFAULT_PLAYED_COLOR = -1;
    public static final int DEFAULT_SCRUBBER_DISABLED_SIZE_DP = 0;
    public static final int DEFAULT_SCRUBBER_DRAGGED_SIZE_DP = 16;
    public static final int DEFAULT_SCRUBBER_ENABLED_SIZE_DP = 12;
    public static final int DEFAULT_TOUCH_TARGET_HEIGHT_DP = 26;
    private static final int FINE_SCRUB_RATIO = 3;
    private static final int FINE_SCRUB_Y_THRESHOLD_DP = -50;
    private static final long STOP_SCRUBBING_TIMEOUT_MS = 1000;
    private int adGroupCount;
    private long[] adGroupTimesMs;
    private final Paint adMarkerPaint;
    private final int adMarkerWidth;
    private final int barHeight;
    private final Rect bufferedBar;
    private final Paint bufferedPaint;
    private long bufferedPosition;
    private long duration;
    private final int fineScrubYThreshold;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private int keyCountIncrement;
    private long keyTimeIncrement;
    private int lastCoarseScrubXPosition;
    private final CopyOnWriteArraySet<TimeBar.OnScrubListener> listeners;
    private int[] locationOnScreen;
    private boolean[] playedAdGroups;
    private final Paint playedAdMarkerPaint;
    private final Paint playedPaint;
    private long position;
    private final Rect progressBar;
    private long scrubPosition;
    private final Rect scrubberBar;
    private final int scrubberDisabledSize;
    private final int scrubberDraggedSize;
    private final Drawable scrubberDrawable;
    private final int scrubberEnabledSize;
    private final int scrubberPadding;
    private final Paint scrubberPaint;
    private boolean scrubbing;
    private final Rect seekBounds;
    private final Runnable stopScrubbingRunnable;
    private Point touchPosition;
    private final int touchTargetHeight;
    private final Paint unplayedPaint;

    public static int getDefaultBufferedColor(int i) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | (-872415232);
    }

    public static int getDefaultPlayedAdMarkerColor(int i) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public static int getDefaultScrubberColor(int i) {
        return i | ViewCompat.MEASURED_STATE_MASK;
    }

    public static int getDefaultUnplayedColor(int i) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | 855638016;
    }

    public DefaultTimeBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.seekBounds = new Rect();
        this.progressBar = new Rect();
        this.bufferedBar = new Rect();
        this.scrubberBar = new Rect();
        this.playedPaint = new Paint();
        this.bufferedPaint = new Paint();
        this.unplayedPaint = new Paint();
        this.adMarkerPaint = new Paint();
        this.playedAdMarkerPaint = new Paint();
        Paint paint = new Paint();
        this.scrubberPaint = paint;
        paint.setAntiAlias(true);
        this.listeners = new CopyOnWriteArraySet<>();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.fineScrubYThreshold = dpToPx(displayMetrics, FINE_SCRUB_Y_THRESHOLD_DP);
        int dpToPx = dpToPx(displayMetrics, 4);
        int dpToPx2 = dpToPx(displayMetrics, 26);
        int dpToPx3 = dpToPx(displayMetrics, 4);
        int dpToPx4 = dpToPx(displayMetrics, 12);
        int dpToPx5 = dpToPx(displayMetrics, 0);
        int dpToPx6 = dpToPx(displayMetrics, 16);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.DefaultTimeBar, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.DefaultTimeBar_scrubber_drawable);
                this.scrubberDrawable = drawable;
                if (drawable != null) {
                    setDrawableLayoutDirection(drawable);
                    dpToPx2 = Math.max(this.scrubberDrawable.getMinimumHeight(), dpToPx2);
                }
                this.barHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_bar_height, dpToPx);
                this.touchTargetHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_touch_target_height, dpToPx2);
                this.adMarkerWidth = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_ad_marker_width, dpToPx3);
                this.scrubberEnabledSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_enabled_size, dpToPx4);
                this.scrubberDisabledSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_disabled_size, dpToPx5);
                this.scrubberDraggedSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.DefaultTimeBar_scrubber_dragged_size, dpToPx6);
                int i = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_color, -1);
                int i2 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_scrubber_color, getDefaultScrubberColor(i));
                int i3 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_buffered_color, getDefaultBufferedColor(i));
                int i4 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_unplayed_color, getDefaultUnplayedColor(i));
                int i5 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_ad_marker_color, DEFAULT_AD_MARKER_COLOR);
                int i6 = obtainStyledAttributes.getInt(R.styleable.DefaultTimeBar_played_ad_marker_color, getDefaultPlayedAdMarkerColor(i5));
                this.playedPaint.setColor(i);
                this.scrubberPaint.setColor(i2);
                this.bufferedPaint.setColor(i3);
                this.unplayedPaint.setColor(i4);
                this.adMarkerPaint.setColor(i5);
                this.playedAdMarkerPaint.setColor(i6);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.barHeight = dpToPx;
            this.touchTargetHeight = dpToPx2;
            this.adMarkerWidth = dpToPx3;
            this.scrubberEnabledSize = dpToPx4;
            this.scrubberDisabledSize = dpToPx5;
            this.scrubberDraggedSize = dpToPx6;
            this.playedPaint.setColor(-1);
            this.scrubberPaint.setColor(getDefaultScrubberColor(-1));
            this.bufferedPaint.setColor(getDefaultBufferedColor(-1));
            this.unplayedPaint.setColor(getDefaultUnplayedColor(-1));
            this.adMarkerPaint.setColor(DEFAULT_AD_MARKER_COLOR);
            this.scrubberDrawable = null;
        }
        this.formatBuilder = new StringBuilder();
        this.formatter = new Formatter(this.formatBuilder, Locale.getDefault());
        this.stopScrubbingRunnable = new Runnable() { // from class: com.google.android.exoplayer2.ui.DefaultTimeBar.1
            @Override // java.lang.Runnable
            public void run() {
                DefaultTimeBar.this.stopScrubbing(false);
            }
        };
        Drawable drawable2 = this.scrubberDrawable;
        if (drawable2 != null) {
            this.scrubberPadding = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.scrubberPadding = (Math.max(this.scrubberDisabledSize, Math.max(this.scrubberEnabledSize, this.scrubberDraggedSize)) + 1) / 2;
        }
        this.duration = C.TIME_UNSET;
        this.keyTimeIncrement = C.TIME_UNSET;
        this.keyCountIncrement = 20;
        setFocusable(true);
        if (Util.SDK_INT >= 16) {
            maybeSetImportantForAccessibilityV16();
        }
    }

    public void setPlayedColor(int i) {
        this.playedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setScrubberColor(int i) {
        this.scrubberPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setBufferedColor(int i) {
        this.bufferedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setUnplayedColor(int i) {
        this.unplayedPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setAdMarkerColor(int i) {
        this.adMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    public void setPlayedAdMarkerColor(int i) {
        this.playedAdMarkerPaint.setColor(i);
        invalidate(this.seekBounds);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void addListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.add(onScrubListener);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void removeListener(TimeBar.OnScrubListener onScrubListener) {
        this.listeners.remove(onScrubListener);
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyTimeIncrement(long j) {
        Assertions.checkArgument(j > 0);
        this.keyCountIncrement = -1;
        this.keyTimeIncrement = j;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setKeyCountIncrement(int i) {
        Assertions.checkArgument(i > 0);
        this.keyCountIncrement = i;
        this.keyTimeIncrement = C.TIME_UNSET;
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setPosition(long j) {
        this.position = j;
        setContentDescription(getProgressText());
        update();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setBufferedPosition(long j) {
        this.bufferedPosition = j;
        update();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setDuration(long j) {
        this.duration = j;
        if (this.scrubbing && j == C.TIME_UNSET) {
            stopScrubbing(true);
        }
        update();
    }

    @Override // com.google.android.exoplayer2.ui.TimeBar
    public void setAdGroupTimesMs(long[] jArr, boolean[] zArr, int i) {
        Assertions.checkArgument(i == 0 || !(jArr == null || zArr == null));
        this.adGroupCount = i;
        this.adGroupTimesMs = jArr;
        this.playedAdGroups = zArr;
        update();
    }

    @Override // android.view.View, com.google.android.exoplayer2.ui.TimeBar
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.scrubbing || z) {
            return;
        }
        stopScrubbing(true);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        drawTimeBar(canvas);
        drawPlayhead(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 != 3) goto L37;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.duration > 0) {
            Point resolveRelativeTouchPosition = resolveRelativeTouchPosition(motionEvent);
            int i = resolveRelativeTouchPosition.x;
            int i2 = resolveRelativeTouchPosition.y;
            int action = motionEvent.getAction();
            if (action == 0) {
                float f = i;
                if (isInSeekBar(f, i2)) {
                    positionScrubber(f);
                    startScrubbing();
                    this.scrubPosition = getScrubberPosition();
                    update();
                    invalidate();
                    return true;
                }
            } else {
                if (action != 1) {
                    if (action == 2) {
                        if (this.scrubbing) {
                            if (i2 < this.fineScrubYThreshold) {
                                int i3 = this.lastCoarseScrubXPosition;
                                positionScrubber(i3 + ((i - i3) / 3));
                            } else {
                                this.lastCoarseScrubXPosition = i;
                                positionScrubber(i);
                            }
                            this.scrubPosition = getScrubberPosition();
                            Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
                            while (it.hasNext()) {
                                it.next().onScrubMove(this, this.scrubPosition);
                            }
                            update();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.scrubbing) {
                    stopScrubbing(motionEvent.getAction() == 3);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case 21:
                        positionIncrement = -positionIncrement;
                        if (scrubIncrementally(positionIncrement)) {
                            removeCallbacks(this.stopScrubbingRunnable);
                            postDelayed(this.stopScrubbingRunnable, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (scrubIncrementally(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.scrubbing) {
                removeCallbacks(this.stopScrubbingRunnable);
                this.stopScrubbingRunnable.run();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        updateDrawableState();
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.touchTargetHeight;
        } else if (mode != 1073741824) {
            size = Math.min(this.touchTargetHeight, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        updateDrawableState();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.touchTargetHeight) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.touchTargetHeight;
        int i7 = ((i6 - this.barHeight) / 2) + i5;
        this.seekBounds.set(paddingLeft, i5, paddingRight, i6 + i5);
        this.progressBar.set(this.seekBounds.left + this.scrubberPadding, i7, this.seekBounds.right - this.scrubberPadding, this.barHeight + i7);
        update();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null || !setDrawableLayoutDirection(drawable, i)) {
            return;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName(DefaultTimeBar.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(DefaultTimeBar.class.getCanonicalName());
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.duration <= 0) {
            return;
        }
        if (Util.SDK_INT >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else if (Util.SDK_INT >= 16) {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    @Override // android.view.View
    public boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.duration <= 0) {
            return false;
        }
        if (i == 8192) {
            if (scrubIncrementally(-getPositionIncrement())) {
                stopScrubbing(false);
            }
        } else if (i != 4096) {
            return false;
        } else {
            if (scrubIncrementally(getPositionIncrement())) {
                stopScrubbing(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    private void maybeSetImportantForAccessibilityV16() {
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    private void startScrubbing() {
        this.scrubbing = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStart(this, getScrubberPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScrubbing(boolean z) {
        this.scrubbing = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubStop(this, getScrubberPosition(), z);
        }
    }

    private void update() {
        this.bufferedBar.set(this.progressBar);
        this.scrubberBar.set(this.progressBar);
        long j = this.scrubbing ? this.scrubPosition : this.position;
        if (this.duration > 0) {
            this.bufferedBar.right = Math.min(this.progressBar.left + ((int) ((this.progressBar.width() * this.bufferedPosition) / this.duration)), this.progressBar.right);
            this.scrubberBar.right = Math.min(this.progressBar.left + ((int) ((this.progressBar.width() * j) / this.duration)), this.progressBar.right);
        } else {
            this.bufferedBar.right = this.progressBar.left;
            this.scrubberBar.right = this.progressBar.left;
        }
        invalidate(this.seekBounds);
    }

    private void positionScrubber(float f) {
        this.scrubberBar.right = Util.constrainValue((int) f, this.progressBar.left, this.progressBar.right);
    }

    private Point resolveRelativeTouchPosition(MotionEvent motionEvent) {
        if (this.locationOnScreen == null) {
            this.locationOnScreen = new int[2];
            this.touchPosition = new Point();
        }
        getLocationOnScreen(this.locationOnScreen);
        this.touchPosition.set(((int) motionEvent.getRawX()) - this.locationOnScreen[0], ((int) motionEvent.getRawY()) - this.locationOnScreen[1]);
        return this.touchPosition;
    }

    private long getScrubberPosition() {
        if (this.progressBar.width() <= 0 || this.duration == C.TIME_UNSET) {
            return 0L;
        }
        return (this.scrubberBar.width() * this.duration) / this.progressBar.width();
    }

    private boolean isInSeekBar(float f, float f2) {
        return this.seekBounds.contains((int) f, (int) f2);
    }

    private void drawTimeBar(Canvas canvas) {
        int height = this.progressBar.height();
        int centerY = this.progressBar.centerY() - (height / 2);
        int i = height + centerY;
        if (this.duration <= 0) {
            canvas.drawRect(this.progressBar.left, centerY, this.progressBar.right, i, this.unplayedPaint);
            return;
        }
        int i2 = this.bufferedBar.left;
        int i3 = this.bufferedBar.right;
        int max = Math.max(Math.max(this.progressBar.left, i3), this.scrubberBar.right);
        if (max < this.progressBar.right) {
            canvas.drawRect(max, centerY, this.progressBar.right, i, this.unplayedPaint);
        }
        int max2 = Math.max(i2, this.scrubberBar.right);
        if (i3 > max2) {
            canvas.drawRect(max2, centerY, i3, i, this.bufferedPaint);
        }
        if (this.scrubberBar.width() > 0) {
            canvas.drawRect(this.scrubberBar.left, centerY, this.scrubberBar.right, i, this.playedPaint);
        }
        int i4 = this.adMarkerWidth / 2;
        for (int i5 = 0; i5 < this.adGroupCount; i5++) {
            int min = this.progressBar.left + Math.min(this.progressBar.width() - this.adMarkerWidth, Math.max(0, ((int) ((this.progressBar.width() * Util.constrainValue(this.adGroupTimesMs[i5], 0L, this.duration)) / this.duration)) - i4));
            canvas.drawRect(min, centerY, min + this.adMarkerWidth, i, this.playedAdGroups[i5] ? this.playedAdMarkerPaint : this.adMarkerPaint);
        }
    }

    private void drawPlayhead(Canvas canvas) {
        int i;
        if (this.duration <= 0) {
            return;
        }
        int constrainValue = Util.constrainValue(this.scrubberBar.right, this.scrubberBar.left, this.progressBar.right);
        int centerY = this.scrubberBar.centerY();
        Drawable drawable = this.scrubberDrawable;
        if (drawable == null) {
            if (this.scrubbing || isFocused()) {
                i = this.scrubberDraggedSize;
            } else {
                i = isEnabled() ? this.scrubberEnabledSize : this.scrubberDisabledSize;
            }
            canvas.drawCircle(constrainValue, centerY, i / 2, this.scrubberPaint);
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        int intrinsicHeight = this.scrubberDrawable.getIntrinsicHeight() / 2;
        this.scrubberDrawable.setBounds(constrainValue - intrinsicWidth, centerY - intrinsicHeight, constrainValue + intrinsicWidth, centerY + intrinsicHeight);
        this.scrubberDrawable.draw(canvas);
    }

    private void updateDrawableState() {
        Drawable drawable = this.scrubberDrawable;
        if (drawable != null && drawable.isStateful() && this.scrubberDrawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    private String getProgressText() {
        return Util.getStringForTime(this.formatBuilder, this.formatter, this.position);
    }

    private long getPositionIncrement() {
        long j = this.keyTimeIncrement;
        if (j == C.TIME_UNSET) {
            long j2 = this.duration;
            if (j2 == C.TIME_UNSET) {
                return 0L;
            }
            return j2 / this.keyCountIncrement;
        }
        return j;
    }

    private boolean scrubIncrementally(long j) {
        if (this.duration <= 0) {
            return false;
        }
        long scrubberPosition = getScrubberPosition();
        long constrainValue = Util.constrainValue(scrubberPosition + j, 0L, this.duration);
        this.scrubPosition = constrainValue;
        if (constrainValue == scrubberPosition) {
            return false;
        }
        if (!this.scrubbing) {
            startScrubbing();
        }
        Iterator<TimeBar.OnScrubListener> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().onScrubMove(this, this.scrubPosition);
        }
        update();
        return true;
    }

    private boolean setDrawableLayoutDirection(Drawable drawable) {
        return Util.SDK_INT >= 23 && setDrawableLayoutDirection(drawable, getLayoutDirection());
    }

    private static boolean setDrawableLayoutDirection(Drawable drawable, int i) {
        return Util.SDK_INT >= 23 && drawable.setLayoutDirection(i);
    }

    private static int dpToPx(DisplayMetrics displayMetrics, int i) {
        return (int) ((i * displayMetrics.density) + 0.5f);
    }
}
