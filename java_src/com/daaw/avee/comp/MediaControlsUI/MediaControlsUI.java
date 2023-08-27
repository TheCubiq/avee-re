package com.daaw.avee.comp.MediaControlsUI;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.AOSP.MyThumbnailUtils;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent2;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Tuple3;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.playback.PlayingMediaInfo;
import com.daaw.avee.comp.playback.Song.PlaylistSong;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public class MediaControlsUI {
    private static final int MSG_REFRESH = 1;
    private ImageButton buttonOverflow;
    private ImageButton buttonPause;
    private ImageButton buttonPauseS;
    private ImageButton buttonVolume;
    private ImageButton buttonVolumeS;
    private TextView currentTime;
    private TextView currentTitle;
    private TextView currentTitleS;
    private float designHeight0;
    private final Handler handler;
    private long lastSeekEventTime;
    private TextView lengthTime;
    private ImageView overlayButtonPause;
    private ImageView overlayButtonPauseS;
    private SeekBar progress;
    private SeekBar progressS;
    private RotateAnimation rotateAnimation;
    private RotateAnimation rotateAnimationS;
    private TextView txtSongDetailInfo;
    private TextView txtSongDetailInfo0;
    private View viewRootBg;
    private View viewRootL;
    private View viewRootS;
    public static WeakEventR<Boolean> onRequestVolumeMuteState = new WeakEventR<>();
    public static WeakEventR<Boolean> onRequestAudioEffectsActiveState = new WeakEventR<>();
    public static WeakEventR<Integer> onRequestShowState = new WeakEventR<>();
    public static WeakEvent onPlaybackPrev = new WeakEvent();
    public static WeakEvent onPlaybackNext = new WeakEvent();
    public static WeakEvent onPlaybackTogglePause = new WeakEvent();
    public static WeakEventR<Long> onRequestTrackPosition = new WeakEventR<>();
    public static WeakEventR<Tuple2<PlaylistSong.Data, PlayingMediaInfo>> onRequestTrackInfo = new WeakEventR<>();
    public static WeakEventR<Tuple2<Boolean, Boolean>> onRequestPlaystate = new WeakEventR<>();
    public static WeakEvent1<Long> onSetTrackPosition = new WeakEvent1<>();
    public static WeakEventR<Tuple2<Integer, Integer>> onRequestAudioVolumeState = new WeakEventR<>();
    public static WeakEventR<Tuple2<Integer, Integer>> onRequestAudioBalanceState = new WeakEventR<>();
    public static WeakEventR<Tuple2<Integer, Integer>> onRequestAudioEffectVirtualizerState = new WeakEventR<>();
    public static WeakEventR<Tuple3<Integer, Integer, Float>> onRequestCrossFadeState = new WeakEventR<>();
    public static WeakEvent2<Integer, Integer> onSetAudioVolume = new WeakEvent2<>();
    public static WeakEvent2<Integer, Integer> onSetAudioStereoBalance = new WeakEvent2<>();
    public static WeakEvent2<Integer, Integer> onSetCrossFade = new WeakEvent2<>();
    public static WeakEventR<Boolean> onRequestAudioViewExpandedState = new WeakEventR<>();
    public static WeakEvent1<Boolean> onSetAudioViewExpandedState = new WeakEvent1<>();
    public static WeakEvent onToggleMuteAction = new WeakEvent();
    public static WeakEvent1<ContextData> onActionEq = new WeakEvent1<>();
    public static WeakEventR<Boolean> onRequestEqState = new WeakEventR<>();
    public static WeakEventR<Integer> onRequestShuffleMode = new WeakEventR<>();
    public static WeakEvent1<Integer> onSetShuffleMode = new WeakEvent1<>();
    public static WeakEventR<Integer> onRequestRepeatMode = new WeakEventR<>();
    public static WeakEvent1<Integer> onSetRepeatMode = new WeakEvent1<>();
    public static WeakEventR<Integer> onRequestMusicSystemIndex = new WeakEventR<>();
    public static WeakEvent1<Integer> onSelectMusicSysAction = new WeakEvent1<>();
    public static WeakEvent1<ContextData> onTrackSelect = new WeakEvent1<>();
    public static WeakEventR<Integer> onRequestVideoScalingMode = new WeakEventR<>();
    public static WeakEvent onToggleVideoScalingMode = new WeakEvent();
    public static WeakEvent onToggleVisualPreferShowContent = new WeakEvent();
    private static final Object createInstanceLock = new Object();
    private static volatile WeakReference<MediaControlsUI> instanceWeak = new WeakReference<>(null);
    private WeakReference<VolumePopupWindow> volumePopupWindowSingleton = new WeakReference<>(null);
    private WeakReference<ThreeDotPopupWindow> ctrlOverflowPopupWindowSingleton = new WeakReference<>(null);
    private long duration = 1000;
    private long posOverride = -1;
    private int lastShowLevel = -1;
    private Runnable viewRootLHide = new Runnable() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.1
        @Override // java.lang.Runnable
        public void run() {
            MediaControlsUI.this.viewRootL.setVisibility(4);
        }
    };
    private Runnable viewRootSHide = new Runnable() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.2
        @Override // java.lang.Runnable
        public void run() {
            if (MediaControlsUI.this.viewRootS != null) {
                MediaControlsUI.this.viewRootS.setVisibility(4);
            }
        }
    };
    private SeekBar.OnSeekBarChangeListener seekListener = new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.3
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            MediaControlsUI.this.lastSeekEventTime = 0L;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                MediaControlsUI mediaControlsUI = MediaControlsUI.this;
                mediaControlsUI.posOverride = (mediaControlsUI.duration * i) / 1000;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime - MediaControlsUI.this.lastSeekEventTime > 250) {
                    MediaControlsUI.this.lastSeekEventTime = elapsedRealtime;
                    MediaControlsUI.onSetTrackPosition.invoke(Long.valueOf(MediaControlsUI.this.posOverride));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            MediaControlsUI.onSetTrackPosition.invoke(Long.valueOf(MediaControlsUI.this.posOverride));
            MediaControlsUI.this.posOverride = -1L;
        }
    };

    public MediaControlsUI() {
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.rotateAnimation = rotateAnimation;
        rotateAnimation.setInterpolator(new LinearInterpolator());
        this.rotateAnimation.setDuration(6000L);
        this.rotateAnimation.setRepeatCount(-1);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        this.rotateAnimationS = rotateAnimation2;
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        this.rotateAnimationS.setDuration(6000L);
        this.rotateAnimationS.setRepeatCount(-1);
        this.handler = new Handler(new Handler.Callback() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.4
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                MediaControlsUI.this.queueNextRefresh(MediaControlsUI.this.refreshNow());
                return false;
            }
        });
    }

    public static MediaControlsUI createOrGetInstance() {
        MediaControlsUI mediaControlsUI;
        MediaControlsUI mediaControlsUI2 = instanceWeak.get();
        if (mediaControlsUI2 != null) {
            return mediaControlsUI2;
        }
        synchronized (createInstanceLock) {
            mediaControlsUI = instanceWeak.get();
            if (mediaControlsUI == null) {
                mediaControlsUI = new MediaControlsUI();
                instanceWeak = new WeakReference<>(mediaControlsUI);
            }
        }
        return mediaControlsUI;
    }

    public static MediaControlsUI getInstance() {
        return instanceWeak.get();
    }

    private boolean isViewCreated() {
        return this.viewRootBg != null;
    }

    public void onCreateView(View view, View view2, View view3) {
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                LayoutInflater layoutInflater = new ContextData(view4).getLayoutInflater();
                UtilsUI.dismissSafe((VolumePopupWindow) MediaControlsUI.this.volumePopupWindowSingleton.get());
                MediaControlsUI.this.volumePopupWindowSingleton = new WeakReference(new VolumePopupWindow(layoutInflater, view4));
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                UtilsUI.dismissSafe((ThreeDotPopupWindow) MediaControlsUI.this.ctrlOverflowPopupWindowSingleton.get());
                MediaControlsUI.this.ctrlOverflowPopupWindowSingleton = new WeakReference(new ThreeDotPopupWindow(view4));
            }
        };
        this.designHeight0 = view.getResources().getDimension(R.dimen.design_height_0);
        this.viewRootL = view;
        this.viewRootBg = view3;
        this.viewRootS = view2;
        UtilsUI.disallowInterceptTouchEventRecursive(view, view.getParent());
        this.currentTime = (TextView) view.findViewById(R.id.txtSongCurrentTime);
        this.lengthTime = (TextView) view.findViewById(R.id.txtSongDuration);
        this.progress = (SeekBar) view.findViewById(R.id.seekBarSongProgress);
        this.currentTitle = (TextView) view.findViewById(R.id.txtSongTitle);
        this.progress.setOnSeekBarChangeListener(this.seekListener);
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.btnPrev);
        imageButton.setImageResource(R.drawable.ic_ctrl_fb);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                MediaControlsUI.onPlaybackPrev.invoke();
            }
        });
        ImageButton imageButton2 = (ImageButton) view.findViewById(R.id.btnNext);
        imageButton2.setImageResource(R.drawable.ic_ctrl_ff);
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view4) {
                MediaControlsUI.onPlaybackNext.invoke();
            }
        });
        ImageButton imageButton3 = (ImageButton) view.findViewById(R.id.btnPause);
        this.buttonPause = imageButton3;
        if (imageButton3 != null) {
            imageButton3.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view4) {
                    MediaControlsUI.onPlaybackTogglePause.invoke();
                }
            });
        }
        this.overlayButtonPause = (ImageView) view.findViewById(R.id.viewOverlayPause);
        ImageButton imageButton4 = (ImageButton) view.findViewById(R.id.btnVolume);
        this.buttonVolume = imageButton4;
        imageButton4.setOnClickListener(onClickListener);
        ImageButton imageButton5 = (ImageButton) view.findViewById(R.id.btnMediaControlsOverflow);
        this.buttonOverflow = imageButton5;
        imageButton5.setOnClickListener(onClickListener2);
        this.txtSongDetailInfo = (TextView) view.findViewById(R.id.txtSongDetailInfo);
        this.txtSongDetailInfo0 = (TextView) view.findViewById(R.id.txtSongDetailInfo0);
        View view4 = this.viewRootS;
        if (view4 != null) {
            this.progressS = (SeekBar) view4.findViewById(R.id.seekBarSongProgress);
            this.currentTitleS = (TextView) this.viewRootS.findViewById(R.id.txtSongTitle);
            this.progressS.setOnSeekBarChangeListener(this.seekListener);
            ImageButton imageButton6 = (ImageButton) this.viewRootS.findViewById(R.id.btnVolume);
            this.buttonVolumeS = imageButton6;
            imageButton6.setOnClickListener(onClickListener);
            ((ImageButton) this.viewRootS.findViewById(R.id.btnMediaControlsOverflow)).setOnClickListener(onClickListener2);
        }
        View view5 = this.viewRootS;
        if (view5 == null) {
            view5 = this.viewRootL;
        }
        ImageButton imageButton7 = (ImageButton) view5.findViewById(R.id.btnPauseS);
        this.buttonPauseS = imageButton7;
        if (imageButton7 != null) {
            imageButton7.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.MediaControlsUI.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view6) {
                    MediaControlsUI.onPlaybackTogglePause.invoke();
                }
            });
        }
        this.overlayButtonPauseS = (ImageView) view5.findViewById(R.id.viewOverlayPauseS);
        int intValue = onRequestShowState.invoke(2).intValue();
        this.lastShowLevel = -1;
        animateShow(intValue);
        Tuple2<Boolean, Boolean> invoke = onRequestPlaystate.invoke(new Tuple2<>(false, false));
        updatePlaystate(invoke.obj1.booleanValue(), invoke.obj2.booleanValue());
        Tuple2<PlaylistSong.Data, PlayingMediaInfo> invoke2 = onRequestTrackInfo.invoke(new Tuple2<>(PlaylistSong.emptyData, PlayingMediaInfo.empty));
        updateTrackInfo(invoke2.obj1, invoke2.obj2);
        onVolumeMuteChanged(onRequestVolumeMuteState.invoke(false).booleanValue(), onRequestAudioEffectsActiveState.invoke(false).booleanValue());
        queueNextRefresh(100L);
    }

    private void updatePauseButtonImage(boolean z, boolean z2) {
        if (z2) {
            ImageView imageView = this.overlayButtonPause;
            if (imageView != null && this.buttonPause != null) {
                if (z) {
                    if (imageView.getAnimation() == null || !this.overlayButtonPause.getAnimation().hasStarted()) {
                        this.overlayButtonPause.startAnimation(this.rotateAnimation);
                    }
                } else {
                    imageView.clearAnimation();
                }
                this.overlayButtonPause.setVisibility(0);
                this.buttonPause.setImageResource(R.drawable.ic_ctrl_pause_s);
            }
            ImageView imageView2 = this.overlayButtonPauseS;
            if (imageView2 == null || this.buttonPauseS == null) {
                return;
            }
            if (z) {
                if (imageView2.getAnimation() == null || !this.overlayButtonPauseS.getAnimation().hasStarted()) {
                    this.overlayButtonPauseS.startAnimation(this.rotateAnimationS);
                }
            } else {
                imageView2.clearAnimation();
            }
            this.overlayButtonPauseS.setVisibility(0);
            this.buttonPauseS.setImageResource(R.drawable.ic_ctrl_pause_vs);
            return;
        }
        ImageView imageView3 = this.overlayButtonPause;
        if (imageView3 != null && this.buttonPause != null) {
            imageView3.clearAnimation();
            this.overlayButtonPause.setVisibility(4);
            this.buttonPause.setImageResource(R.drawable.ic_ctrl_play_s);
        }
        ImageView imageView4 = this.overlayButtonPauseS;
        if (imageView4 == null || this.buttonPauseS == null) {
            return;
        }
        imageView4.clearAnimation();
        this.overlayButtonPauseS.setVisibility(4);
        this.buttonPauseS.setImageResource(R.drawable.ic_ctrl_play_s);
    }

    private void updatePauseButtonImageTrackUpdate() {
        ImageView imageView = this.overlayButtonPause;
        if (imageView != null && imageView.getAnimation() != null && this.overlayButtonPause.getAnimation().hasStarted()) {
            this.overlayButtonPause.clearAnimation();
            this.overlayButtonPause.startAnimation(this.rotateAnimation);
        }
        ImageView imageView2 = this.overlayButtonPauseS;
        if (imageView2 == null || imageView2.getAnimation() == null || !this.overlayButtonPauseS.getAnimation().hasStarted()) {
            return;
        }
        this.overlayButtonPauseS.clearAnimation();
        this.overlayButtonPauseS.startAnimation(this.rotateAnimationS);
    }

    private void updateButtonVolume(boolean z, boolean z2) {
        int attrColor = UtilsUI.getAttrColor(this.buttonVolume, (int) R.attr.mediaControlsFG);
        if (z) {
            int attrColor2 = UtilsUI.getAttrColor(this.buttonVolume, (int) R.attr.mediaControlsHighLight);
            this.buttonVolume.setImageResource(R.drawable.ic_mute_s);
            this.buttonVolume.setColorFilter(attrColor2);
            ImageButton imageButton = this.buttonVolumeS;
            if (imageButton != null) {
                imageButton.setImageResource(R.drawable.ic_mute_s);
                this.buttonVolumeS.setColorFilter(attrColor2);
            }
        } else if (z2) {
            this.buttonVolume.setImageResource(R.drawable.ic_speaker_asterisk_s);
            this.buttonVolume.setColorFilter(attrColor);
            ImageButton imageButton2 = this.buttonVolumeS;
            if (imageButton2 != null) {
                imageButton2.setImageResource(R.drawable.ic_speaker_asterisk_s);
                this.buttonVolumeS.setColorFilter(attrColor);
            }
        } else {
            this.buttonVolume.setImageResource(R.drawable.ic_speaker_s);
            this.buttonVolume.setColorFilter(attrColor);
            ImageButton imageButton3 = this.buttonVolumeS;
            if (imageButton3 != null) {
                imageButton3.setImageResource(R.drawable.ic_speaker_s);
                this.buttonVolumeS.setColorFilter(attrColor);
            }
        }
    }

    public void updatePlaystate(boolean z, boolean z2) {
        if (isViewCreated()) {
            updatePauseButtonImage(z, z2);
        }
    }

    public void updateTrackInfo(PlaylistSong.Data data, PlayingMediaInfo playingMediaInfo) {
        if (isViewCreated()) {
            long j = playingMediaInfo.duration;
            this.duration = j;
            this.lengthTime.setText(Utils.getDurationStringHMSS((int) (j / 1000)));
            this.currentTitle.setText(data.trackName);
            this.currentTitle.setSelected(true);
            this.currentTitle.setEllipsize(TextUtils.TruncateAt.END);
            this.currentTitle.setClickable(false);
            this.currentTitle.setLongClickable(false);
            TextView textView = this.currentTitleS;
            if (textView != null) {
                textView.setText(data.trackName);
                this.currentTitleS.setSelected(true);
                this.currentTitleS.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                this.currentTitleS.setMovementMethod(new MyTitleScrollingMovementMethod());
                this.currentTitleS.setClickable(false);
                this.currentTitleS.setLongClickable(false);
            }
            TextView textView2 = this.txtSongDetailInfo;
            if (textView2 != null) {
                textView2.setText("");
            }
            TextView textView3 = this.txtSongDetailInfo0;
            if (textView3 != null) {
                textView3.setText(data.isArtistKnownOrSecondName() ? data.artistName : "");
            }
            queueNextRefresh(100L);
            updatePauseButtonImageTrackUpdate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void queueNextRefresh(long j) {
        Message obtainMessage = this.handler.obtainMessage(1);
        this.handler.removeMessages(1);
        this.handler.sendMessageDelayed(obtainMessage, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long refreshNow() {
        long longValue = onRequestTrackPosition.invoke(-1L).longValue();
        int i = 0;
        Tuple2<Boolean, Boolean> invoke = onRequestPlaystate.invoke(new Tuple2<>(false, false));
        if (longValue < 0) {
            return 500L;
        }
        try {
            if (this.posOverride >= 0) {
                longValue = this.posOverride;
            }
            if (longValue >= 0 && this.duration >= 0) {
                this.currentTime.setText(Utils.getDurationStringHMSS((int) (longValue / 1000)));
                int i2 = (int) ((longValue * 1000) / this.duration);
                this.progress.setProgress(i2);
                if (this.progressS != null) {
                    this.progressS.setProgress(i2);
                }
                if (invoke.obj1.booleanValue()) {
                    this.currentTime.setVisibility(0);
                } else {
                    int visibility = this.currentTime.getVisibility();
                    TextView textView = this.currentTime;
                    if (visibility != 4) {
                        i = 4;
                    }
                    textView.setVisibility(i);
                    return 500L;
                }
            } else {
                this.currentTime.setText("--:--");
                this.progress.setProgress(1000);
                if (this.progressS != null) {
                    this.progressS.setProgress(1000);
                }
            }
            long j = 1000 - (longValue % 1000);
            int width = this.progress.getWidth();
            if (width == 0) {
                width = MyThumbnailUtils.TARGET_SIZE_MINI_THUMBNAIL;
            }
            long j2 = this.duration / width;
            if (j2 > j) {
                return j;
            }
            if (j2 < 20) {
                return 20L;
            }
            return j2;
        } catch (Exception unused) {
            return 500L;
        }
    }

    public void animateShow(int i) {
        if (isViewCreated()) {
            if (i == 1 && this.viewRootS == null) {
                i = 2;
            }
            if (this.lastShowLevel != i) {
                VolumePopupWindow volumePopupWindow = this.volumePopupWindowSingleton.get();
                if (volumePopupWindow != null) {
                    UtilsUI.dismissSafe(volumePopupWindow);
                    this.volumePopupWindowSingleton.clear();
                }
                ThreeDotPopupWindow threeDotPopupWindow = this.ctrlOverflowPopupWindowSingleton.get();
                if (threeDotPopupWindow != null) {
                    UtilsUI.dismissSafe(threeDotPopupWindow);
                    this.ctrlOverflowPopupWindowSingleton.clear();
                }
            }
            this.lastShowLevel = i;
            View view = this.viewRootL;
            int integer = view.getResources().getInteger(17694720);
            float dimension = this.viewRootBg.getResources().getDimension(R.dimen.player_controls_height);
            if (i == 0) {
                this.viewRootBg.animate().cancel();
                long j = integer;
                this.viewRootBg.animate().translationY(dimension).alpha(0.0f).setDuration(j);
                view.animate().cancel();
                view.animate().withEndAction(this.viewRootLHide).translationY(dimension).alpha(0.0f).setDuration(j);
                View view2 = this.viewRootS;
                if (view2 != null) {
                    view2.animate().cancel();
                    this.viewRootS.animate().withEndAction(this.viewRootSHide).translationY(this.designHeight0).alpha(0.0f).setDuration(j);
                }
            } else if (i == 1) {
                long j2 = integer;
                this.viewRootBg.animate().translationY(dimension - this.designHeight0).alpha(1.0f).setDuration(j2);
                view.animate().cancel();
                view.animate().withEndAction(this.viewRootLHide);
                view.animate().translationY(dimension).alpha(0.0f).setDuration(j2);
                View view3 = this.viewRootS;
                if (view3 != null) {
                    view3.animate().cancel();
                    this.viewRootS.animate().withEndAction(null);
                    this.viewRootS.setVisibility(0);
                    this.viewRootS.animate().translationY(0.0f).alpha(1.0f).setDuration(j2);
                }
            } else if (i == 2) {
                long j3 = integer;
                this.viewRootBg.animate().translationY(0.0f).alpha(1.0f).setDuration(j3);
                view.animate().cancel();
                view.setVisibility(0);
                view.animate().withEndAction(null);
                view.animate().translationY(0.0f).alpha(1.0f).setDuration(j3);
                View view4 = this.viewRootS;
                if (view4 != null) {
                    view4.animate().cancel();
                    this.viewRootS.animate().withEndAction(this.viewRootSHide);
                    this.viewRootS.animate().translationY(-this.designHeight0).alpha(0.0f).setDuration(j3);
                }
            }
        }
    }

    public void onVolumeMuteChanged(boolean z) {
        if (isViewCreated()) {
            onVolumeMuteChanged(z, onRequestAudioEffectsActiveState.invoke(false).booleanValue());
        }
    }

    public void onAudioEffectsActiveChanged(boolean z) {
        if (isViewCreated()) {
            onVolumeMuteChanged(onRequestVolumeMuteState.invoke(false).booleanValue(), z);
        }
    }

    private void onVolumeMuteChanged(boolean z, boolean z2) {
        VolumePopupWindow volumePopupWindow = this.volumePopupWindowSingleton.get();
        if (volumePopupWindow != null && volumePopupWindow.isShowing()) {
            volumePopupWindow.onVolumeMuteChanged(z, z2);
        }
        updateButtonVolume(z, z2);
    }

    public void onRepeatModeChanged(int i) {
        ThreeDotPopupWindow threeDotPopupWindow = this.ctrlOverflowPopupWindowSingleton.get();
        if (threeDotPopupWindow == null || !threeDotPopupWindow.isShowing()) {
            return;
        }
        threeDotPopupWindow.onRepeatModeChanged(i);
    }

    public void onShuffleModeChanged(int i) {
        ThreeDotPopupWindow threeDotPopupWindow = this.ctrlOverflowPopupWindowSingleton.get();
        if (threeDotPopupWindow == null || !threeDotPopupWindow.isShowing()) {
            return;
        }
        threeDotPopupWindow.onShuffleModeChanged(i);
    }

    public void onMusicSysChanged(int i) {
        ThreeDotPopupWindow threeDotPopupWindow = this.ctrlOverflowPopupWindowSingleton.get();
        if (threeDotPopupWindow == null || !threeDotPopupWindow.isShowing()) {
            return;
        }
        threeDotPopupWindow.onMusicSysChanged(i);
    }

    public void onEqStateChanged(boolean z) {
        VolumePopupWindow volumePopupWindow = this.volumePopupWindowSingleton.get();
        if (volumePopupWindow == null || !volumePopupWindow.isShowing()) {
            return;
        }
        volumePopupWindow.onEqStateChanged(z);
    }

    public void updateVideoScaleMode(int i) {
        ThreeDotPopupWindow threeDotPopupWindow = this.ctrlOverflowPopupWindowSingleton.get();
        if (threeDotPopupWindow == null || !threeDotPopupWindow.isShowing()) {
            return;
        }
        threeDotPopupWindow.updateVideoScaleMode(i);
    }
}
