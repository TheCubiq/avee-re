package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.ControlDispatcher;
import com.google.android.exoplayer2.DefaultControlDispatcher;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.PlaybackPreparer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Locale;
/* loaded from: classes.dex */
public class PlayerControlView extends FrameLayout {
    public static final int DEFAULT_FAST_FORWARD_MS = 15000;
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_REWIND_MS = 5000;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    private static final long MAX_POSITION_FOR_SEEK_TO_PREVIOUS = 3000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final ComponentListener componentListener;
    private ControlDispatcher controlDispatcher;
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final View fastForwardButton;
    private int fastForwardMs;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final View nextButton;
    private final View pauseButton;
    private final Timeline.Period period;
    private final View playButton;
    private PlaybackPreparer playbackPreparer;
    private boolean[] playedAdGroups;
    private Player player;
    private final TextView positionView;
    private final View previousButton;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final View rewindButton;
    private int rewindMs;
    private boolean scrubbing;
    private boolean showMultiWindowTimeBar;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final View shuffleButton;
    private final TimeBar timeBar;
    private final Runnable updateProgressAction;
    private VisibilityListener visibilityListener;
    private final Timeline.Window window;

    /* loaded from: classes.dex */
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, null);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        this.updateProgressAction = new Runnable() { // from class: com.google.android.exoplayer2.ui.PlayerControlView.1
            @Override // java.lang.Runnable
            public void run() {
                PlayerControlView.this.updateProgress();
            }
        };
        this.hideAction = new Runnable() { // from class: com.google.android.exoplayer2.ui.PlayerControlView.2
            @Override // java.lang.Runnable
            public void run() {
                PlayerControlView.this.hide();
            }
        };
        int i2 = R.layout.exo_player_control_view;
        this.rewindMs = 5000;
        this.fastForwardMs = 15000;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.hideAtMs = C.TIME_UNSET;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.PlayerControlView, 0, 0);
            try {
                this.rewindMs = obtainStyledAttributes.getInt(R.styleable.PlayerControlView_rewind_increment, this.rewindMs);
                this.fastForwardMs = obtainStyledAttributes.getInt(R.styleable.PlayerControlView_fastforward_increment, this.fastForwardMs);
                this.showTimeoutMs = obtainStyledAttributes.getInt(R.styleable.PlayerControlView_show_timeout, this.showTimeoutMs);
                i2 = obtainStyledAttributes.getResourceId(R.styleable.PlayerControlView_controller_layout_id, i2);
                this.repeatToggleModes = getRepeatToggleModes(obtainStyledAttributes, this.repeatToggleModes);
                this.showShuffleButton = obtainStyledAttributes.getBoolean(R.styleable.PlayerControlView_show_shuffle_button, this.showShuffleButton);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        this.formatBuilder = new StringBuilder();
        this.formatter = new Formatter(this.formatBuilder, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        this.componentListener = new ComponentListener();
        this.controlDispatcher = new DefaultControlDispatcher();
        LayoutInflater.from(context).inflate(i2, this);
        setDescendantFocusability(262144);
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        TimeBar timeBar = (TimeBar) findViewById(R.id.exo_progress);
        this.timeBar = timeBar;
        if (timeBar != null) {
            timeBar.addListener(this.componentListener);
        }
        View findViewById = findViewById(R.id.exo_play);
        this.playButton = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(this.componentListener);
        }
        View findViewById2 = findViewById(R.id.exo_pause);
        this.pauseButton = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(this.componentListener);
        }
        View findViewById3 = findViewById(R.id.exo_prev);
        this.previousButton = findViewById3;
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(this.componentListener);
        }
        View findViewById4 = findViewById(R.id.exo_next);
        this.nextButton = findViewById4;
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(this.componentListener);
        }
        View findViewById5 = findViewById(R.id.exo_rew);
        this.rewindButton = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(this.componentListener);
        }
        View findViewById6 = findViewById(R.id.exo_ffwd);
        this.fastForwardButton = findViewById6;
        if (findViewById6 != null) {
            findViewById6.setOnClickListener(this.componentListener);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(this.componentListener);
        }
        View findViewById7 = findViewById(R.id.exo_shuffle);
        this.shuffleButton = findViewById7;
        if (findViewById7 != null) {
            findViewById7.setOnClickListener(this.componentListener);
        }
        Resources resources = context.getResources();
        this.repeatOffButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(R.drawable.exo_controls_repeat_all);
        this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i) {
        return typedArray.getInt(R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setPlayer(Player player) {
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeBarMode();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            Assertions.checkArgument(jArr.length == zArr.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr;
        }
        updateProgress();
    }

    public void setVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListener = visibilityListener;
    }

    public void setPlaybackPreparer(PlaybackPreparer playbackPreparer) {
        this.playbackPreparer = playbackPreparer;
    }

    public void setControlDispatcher(ControlDispatcher controlDispatcher) {
        if (controlDispatcher == null) {
            controlDispatcher = new DefaultControlDispatcher();
        }
        this.controlDispatcher = controlDispatcher;
    }

    public void setRewindIncrementMs(int i) {
        this.rewindMs = i;
        updateNavigation();
    }

    public void setFastForwardIncrementMs(int i) {
        this.fastForwardMs = i;
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 0);
            } else if (i == 1 && repeatMode == 2) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 1);
            } else if (i == 2 && repeatMode == 1) {
                this.controlDispatcher.dispatchSetRepeatMode(this.player, 2);
            }
        }
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            VisibilityListener visibilityListener = this.visibilityListener;
            if (visibilityListener != null) {
                visibilityListener.onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
        }
        hideAfterTimeout();
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            VisibilityListener visibilityListener = this.visibilityListener;
            if (visibilityListener != null) {
                visibilityListener.onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = uptimeMillis + i;
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, i);
                return;
            }
            return;
        }
        this.hideAtMs = C.TIME_UNSET;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        if (isVisible() && this.isAttachedToWindow) {
            boolean isPlaying = isPlaying();
            View view = this.playButton;
            boolean z2 = true;
            if (view != null) {
                z = (isPlaying && view.isFocused()) | false;
                this.playButton.setVisibility(isPlaying ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z |= (isPlaying || !view2.isFocused()) ? false : false;
                this.pauseButton.setVisibility(isPlaying ? 0 : 8);
            }
            if (z) {
                requestPlayPauseFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean z;
        boolean z2;
        boolean z3;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            Timeline currentTimeline = player != null ? player.getCurrentTimeline() : null;
            boolean z4 = true;
            if (!((currentTimeline == null || currentTimeline.isEmpty()) ? false : true) || this.player.isPlayingAd()) {
                z = false;
                z2 = false;
                z3 = false;
            } else {
                currentTimeline.getWindow(this.player.getCurrentWindowIndex(), this.window);
                z = this.window.isSeekable;
                z3 = (!z && this.window.isDynamic && this.player.getPreviousWindowIndex() == -1) ? false : true;
                z2 = this.window.isDynamic || this.player.getNextWindowIndex() != -1;
            }
            setButtonEnabled(z3, this.previousButton);
            setButtonEnabled(z2, this.nextButton);
            setButtonEnabled(this.fastForwardMs > 0 && z, this.fastForwardButton);
            setButtonEnabled((this.rewindMs <= 0 || !z) ? false : false, this.rewindButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                imageView.setVisibility(8);
            } else if (this.player == null) {
                setButtonEnabled(false, imageView);
            } else {
                setButtonEnabled(true, imageView);
                int repeatMode = this.player.getRepeatMode();
                if (repeatMode == 0) {
                    this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                    this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                } else if (repeatMode == 1) {
                    this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                    this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
                } else if (repeatMode == 2) {
                    this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                    this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
                }
                this.repeatToggleButton.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        View view;
        if (isVisible() && this.isAttachedToWindow && (view = this.shuffleButton) != null) {
            if (!this.showShuffleButton) {
                view.setVisibility(8);
                return;
            }
            Player player = this.player;
            if (player == null) {
                setButtonEnabled(false, view);
                return;
            }
            view.setAlpha(player.getShuffleModeEnabled() ? 1.0f : 0.3f);
            this.shuffleButton.setEnabled(true);
            this.shuffleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeBarMode() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            boolean z = true;
            if (player != null) {
                Timeline currentTimeline = player.getCurrentTimeline();
                if (currentTimeline.isEmpty()) {
                    j4 = 0;
                    j5 = 0;
                    i = 0;
                } else {
                    int currentWindowIndex = this.player.getCurrentWindowIndex();
                    int i2 = this.multiWindowTimeBar ? 0 : currentWindowIndex;
                    int windowCount = this.multiWindowTimeBar ? currentTimeline.getWindowCount() - 1 : currentWindowIndex;
                    long j6 = 0;
                    j5 = 0;
                    i = 0;
                    while (true) {
                        if (i2 > windowCount) {
                            break;
                        }
                        if (i2 == currentWindowIndex) {
                            j5 = j6;
                        }
                        currentTimeline.getWindow(i2, this.window);
                        if (this.window.durationUs == C.TIME_UNSET) {
                            Assertions.checkState(this.multiWindowTimeBar ^ z);
                            break;
                        }
                        for (int i3 = this.window.firstPeriodIndex; i3 <= this.window.lastPeriodIndex; i3++) {
                            currentTimeline.getPeriod(i3, this.period);
                            int adGroupCount = this.period.getAdGroupCount();
                            for (int i4 = 0; i4 < adGroupCount; i4++) {
                                long adGroupTimeUs = this.period.getAdGroupTimeUs(i4);
                                if (adGroupTimeUs == Long.MIN_VALUE) {
                                    if (this.period.durationUs != C.TIME_UNSET) {
                                        adGroupTimeUs = this.period.durationUs;
                                    }
                                }
                                long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                                if (positionInWindowUs >= 0 && positionInWindowUs <= this.window.durationUs) {
                                    long[] jArr = this.adGroupTimesMs;
                                    if (i == jArr.length) {
                                        int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                        this.adGroupTimesMs = Arrays.copyOf(this.adGroupTimesMs, length);
                                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                    }
                                    this.adGroupTimesMs[i] = C.usToMs(j6 + positionInWindowUs);
                                    this.playedAdGroups[i] = this.period.hasPlayedAdGroup(i4);
                                    i++;
                                }
                            }
                        }
                        j6 += this.window.durationUs;
                        i2++;
                        z = true;
                    }
                    j4 = j6;
                }
                j = C.usToMs(j4);
                long usToMs = C.usToMs(j5);
                if (this.player.isPlayingAd()) {
                    j2 = usToMs + this.player.getContentPosition();
                    j3 = j2;
                } else {
                    long currentPosition = this.player.getCurrentPosition() + usToMs;
                    long bufferedPosition = usToMs + this.player.getBufferedPosition();
                    j2 = currentPosition;
                    j3 = bufferedPosition;
                }
                if (this.timeBar != null) {
                    int length2 = this.extraAdGroupTimesMs.length;
                    int i5 = i + length2;
                    long[] jArr2 = this.adGroupTimesMs;
                    if (i5 > jArr2.length) {
                        this.adGroupTimesMs = Arrays.copyOf(jArr2, i5);
                        this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i5);
                    }
                    System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
                    System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
                    this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i5);
                }
            } else {
                j = 0;
                j2 = 0;
                j3 = 0;
            }
            TextView textView = this.durationView;
            if (textView != null) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j));
            }
            TextView textView2 = this.positionView;
            if (textView2 != null && !this.scrubbing) {
                textView2.setText(Util.getStringForTime(this.formatBuilder, this.formatter, j2));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(j2);
                this.timeBar.setBufferedPosition(j3);
                this.timeBar.setDuration(j);
            }
            removeCallbacks(this.updateProgressAction);
            Player player2 = this.player;
            int playbackState = player2 == null ? 1 : player2.getPlaybackState();
            if (playbackState == 1 || playbackState == 4) {
                return;
            }
            long j7 = 1000;
            if (this.player.getPlayWhenReady() && playbackState == 3) {
                float f = this.player.getPlaybackParameters().speed;
                if (f > 0.1f) {
                    if (f <= 5.0f) {
                        long max = 1000 / Math.max(1, Math.round(1.0f / f));
                        long j8 = max - (j2 % max);
                        if (j8 < max / 5) {
                            j8 += max;
                        }
                        if (f != 1.0f) {
                            j8 = ((float) j8) / f;
                        }
                        j7 = j8;
                    } else {
                        j7 = 200;
                    }
                }
            }
            postDelayed(this.updateProgressAction, j7);
        }
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean isPlaying = isPlaying();
        if (!isPlaying && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else if (!isPlaying || (view = this.pauseButton) == null) {
        } else {
            view.requestFocus();
        }
    }

    private void setButtonEnabled(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.3f);
        view.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void previous() {
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return;
        }
        currentTimeline.getWindow(this.player.getCurrentWindowIndex(), this.window);
        int previousWindowIndex = this.player.getPreviousWindowIndex();
        if (previousWindowIndex != -1 && (this.player.getCurrentPosition() <= MAX_POSITION_FOR_SEEK_TO_PREVIOUS || (this.window.isDynamic && !this.window.isSeekable))) {
            seekTo(previousWindowIndex, C.TIME_UNSET);
        } else {
            seekTo(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void next() {
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return;
        }
        int currentWindowIndex = this.player.getCurrentWindowIndex();
        int nextWindowIndex = this.player.getNextWindowIndex();
        if (nextWindowIndex != -1) {
            seekTo(nextWindowIndex, C.TIME_UNSET);
        } else if (currentTimeline.getWindow(currentWindowIndex, this.window, false).isDynamic) {
            seekTo(currentWindowIndex, C.TIME_UNSET);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rewind() {
        if (this.rewindMs <= 0) {
            return;
        }
        seekTo(Math.max(this.player.getCurrentPosition() - this.rewindMs, 0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fastForward() {
        if (this.fastForwardMs <= 0) {
            return;
        }
        long duration = this.player.getDuration();
        long currentPosition = this.player.getCurrentPosition() + this.fastForwardMs;
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        seekTo(currentPosition);
    }

    private void seekTo(long j) {
        seekTo(this.player.getCurrentWindowIndex(), j);
    }

    private void seekTo(int i, long j) {
        if (this.controlDispatcher.dispatchSeekTo(this.player, i, j)) {
            return;
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(long j) {
        int currentWindowIndex;
        Timeline currentTimeline = this.player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentWindowIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentWindowIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                } else if (currentWindowIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentWindowIndex++;
                }
            }
        } else {
            currentWindowIndex = this.player.getCurrentWindowIndex();
        }
        seekTo(currentWindowIndex, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != C.TIME_UNSET) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, uptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                fastForward();
            } else if (keyCode == 89) {
                rewind();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    ControlDispatcher controlDispatcher = this.controlDispatcher;
                    Player player = this.player;
                    controlDispatcher.dispatchSetPlayWhenReady(player, !player.getPlayWhenReady());
                } else if (keyCode == 87) {
                    next();
                } else if (keyCode == 88) {
                    previous();
                } else if (keyCode == 126) {
                    this.controlDispatcher.dispatchSetPlayWhenReady(this.player, true);
                } else if (keyCode == 127) {
                    this.controlDispatcher.dispatchSetPlayWhenReady(this.player, false);
                }
            }
        }
        return true;
    }

    private boolean isPlaying() {
        Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    /* loaded from: classes.dex */
    private final class ComponentListener extends Player.DefaultEventListener implements TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j) {
            PlayerControlView playerControlView = PlayerControlView.this;
            playerControlView.removeCallbacks(playerControlView.hideAction);
            PlayerControlView.this.scrubbing = true;
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j) {
            if (PlayerControlView.this.positionView != null) {
                PlayerControlView.this.positionView.setText(Util.getStringForTime(PlayerControlView.this.formatBuilder, PlayerControlView.this.formatter, j));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j, boolean z) {
            PlayerControlView.this.scrubbing = false;
            if (!z && PlayerControlView.this.player != null) {
                PlayerControlView.this.seekToTimeBarPosition(j);
            }
            PlayerControlView.this.hideAfterTimeout();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onPlayerStateChanged(boolean z, int i) {
            PlayerControlView.this.updatePlayPauseButton();
            PlayerControlView.this.updateProgress();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onRepeatModeChanged(int i) {
            PlayerControlView.this.updateRepeatModeButton();
            PlayerControlView.this.updateNavigation();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onShuffleModeEnabledChanged(boolean z) {
            PlayerControlView.this.updateShuffleButton();
            PlayerControlView.this.updateNavigation();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onPositionDiscontinuity(int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateProgress();
        }

        @Override // com.google.android.exoplayer2.Player.DefaultEventListener, com.google.android.exoplayer2.Player.EventListener
        public void onTimelineChanged(Timeline timeline, Object obj, int i) {
            PlayerControlView.this.updateNavigation();
            PlayerControlView.this.updateTimeBarMode();
            PlayerControlView.this.updateProgress();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PlayerControlView.this.player != null) {
                if (PlayerControlView.this.nextButton == view) {
                    PlayerControlView.this.next();
                } else if (PlayerControlView.this.previousButton == view) {
                    PlayerControlView.this.previous();
                } else if (PlayerControlView.this.fastForwardButton == view) {
                    PlayerControlView.this.fastForward();
                } else if (PlayerControlView.this.rewindButton == view) {
                    PlayerControlView.this.rewind();
                } else if (PlayerControlView.this.playButton == view) {
                    if (PlayerControlView.this.player.getPlaybackState() == 1) {
                        if (PlayerControlView.this.playbackPreparer != null) {
                            PlayerControlView.this.playbackPreparer.preparePlayback();
                        }
                    } else if (PlayerControlView.this.player.getPlaybackState() == 4) {
                        PlayerControlView.this.controlDispatcher.dispatchSeekTo(PlayerControlView.this.player, PlayerControlView.this.player.getCurrentWindowIndex(), C.TIME_UNSET);
                    }
                    PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(PlayerControlView.this.player, true);
                } else if (PlayerControlView.this.pauseButton == view) {
                    PlayerControlView.this.controlDispatcher.dispatchSetPlayWhenReady(PlayerControlView.this.player, false);
                } else if (PlayerControlView.this.repeatToggleButton != view) {
                    if (PlayerControlView.this.shuffleButton == view) {
                        PlayerControlView.this.controlDispatcher.dispatchSetShuffleModeEnabled(PlayerControlView.this.player, true ^ PlayerControlView.this.player.getShuffleModeEnabled());
                    }
                } else {
                    PlayerControlView.this.controlDispatcher.dispatchSetRepeatMode(PlayerControlView.this.player, RepeatModeUtil.getNextRepeatMode(PlayerControlView.this.player.getRepeatMode(), PlayerControlView.this.repeatToggleModes));
                }
            }
            PlayerControlView.this.hideAfterTimeout();
        }
    }
}
