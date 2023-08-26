package com.daaw.avee.comp.MediaControlsUI;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Tuple3;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.google.android.material.badge.BadgeDrawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class VolumePopupWindow extends PopupWindow {
    private TextView audioVolumeText;
    private TextView balanceText;
    private TextView crossFadeText;
    private float crossFadeTextSizeDefault;
    private float crossFadeTextSizeSmall;
    private ImageButton eqButton;
    private View expandableView;
    private Handler handler;
    private ImageButton muteButton;
    private SeekBar seekBarAudioVolume;
    private SeekBar seekBarBalance;
    private SeekBar seekBarCrossFade;
    private ImageButton toggleExpandButton;

    public VolumePopupWindow(LayoutInflater layoutInflater, View view) {
        super(view.getContext(), (AttributeSet) null, 0, (int) R.style.MyListPopupWindowDarkStyle);
        this.handler = new Handler(new Handler.Callback() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                return false;
            }
        });
        View inflate = View.inflate(view.getContext(), R.layout.popup_media_controls_volume, null);
        ImageButton imageButton = (ImageButton) inflate.findViewById(R.id.btnVolumeMute);
        this.muteButton = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MediaControlsUI.onToggleMuteAction.invoke();
                VolumePopupWindow.this.handler.sendEmptyMessageDelayed(0, 900L);
            }
        });
        this.seekBarAudioVolume = (SeekBar) inflate.findViewById(R.id.seekBarVolume);
        this.audioVolumeText = (TextView) inflate.findViewById(R.id.txtVolume);
        final Tuple2<Integer, Integer> invoke = MediaControlsUI.onRequestAudioVolumeState.invoke(new Tuple2<>(0, 0));
        onAudioVolumeChanged(invoke.obj1.intValue(), invoke.obj2.intValue(), false);
        this.seekBarAudioVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.3
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                VolumePopupWindow.this.onAudioVolumeChanged(i, ((Integer) invoke.obj2).intValue(), true);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                VolumePopupWindow.this.handler.removeMessages(0);
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                VolumePopupWindow.this.handler.sendEmptyMessageDelayed(0, 900L);
            }
        });
        boolean booleanValue = MediaControlsUI.onRequestAudioViewExpandedState.invoke(false).booleanValue();
        this.expandableView = inflate.findViewById(R.id.layoutExpandable);
        this.toggleExpandButton = (ImageButton) inflate.findViewById(R.id.btnExpand);
        updateExapned(booleanValue, true);
        this.toggleExpandButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (VolumePopupWindow.this.expandableView.getVisibility() == 0) {
                    VolumePopupWindow.this.updateExapned(false, false);
                    MediaControlsUI.onSetAudioViewExpandedState.invoke(false);
                    return;
                }
                VolumePopupWindow.this.updateExapned(true, false);
                MediaControlsUI.onSetAudioViewExpandedState.invoke(true);
            }
        });
        this.seekBarBalance = (SeekBar) inflate.findViewById(R.id.seekBarVolumeBalance);
        this.balanceText = (TextView) inflate.findViewById(R.id.txtVolumeBalanceStatus);
        final Tuple2<Integer, Integer> invoke2 = MediaControlsUI.onRequestAudioBalanceState.invoke(new Tuple2<>(0, 0));
        onAudioStereoBalanceChanged(invoke2.obj1.intValue(), invoke2.obj2.intValue(), false);
        this.seekBarBalance.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.5
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                VolumePopupWindow.this.onAudioStereoBalanceChanged(i, ((Integer) invoke2.obj2).intValue(), true);
            }
        });
        this.seekBarCrossFade = (SeekBar) inflate.findViewById(R.id.seekBarCrossfade);
        this.crossFadeText = (TextView) inflate.findViewById(R.id.txtCrossfadeStatus);
        this.crossFadeTextSizeSmall = layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.textSizeM3);
        this.crossFadeTextSizeDefault = this.crossFadeText.getTextSize();
        final Tuple3<Integer, Integer, Float> invoke3 = MediaControlsUI.onRequestCrossFadeState.invoke(new Tuple3<>(0, 0, Float.valueOf(1.0f)));
        onCrossFadeChanged(invoke3.obj1.intValue(), invoke3.obj2.intValue(), invoke3.obj3.floatValue(), false);
        this.seekBarCrossFade.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                VolumePopupWindow.this.onCrossFadeChanged(i, ((Integer) invoke3.obj2).intValue(), ((Float) invoke3.obj3).floatValue(), true);
            }
        });
        ImageButton imageButton2 = (ImageButton) inflate.findViewById(R.id.btnEq);
        this.eqButton = imageButton2;
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.MediaControlsUI.VolumePopupWindow.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                VolumePopupWindow.this.handler.sendEmptyMessageDelayed(0, 900L);
                MediaControlsUI.onActionEq.invoke(new ContextData(view2));
            }
        });
        setContentView(inflate);
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(true);
        setFocusable(true);
        onVolumeMuteChanged(MediaControlsUI.onRequestVolumeMuteState.invoke(false).booleanValue(), MediaControlsUI.onRequestAudioEffectsActiveState.invoke(false).booleanValue());
        onEqStateChanged(MediaControlsUI.onRequestEqState.invoke(false).booleanValue());
        if (Build.VERSION.SDK_INT >= 17) {
            Point point = new Point();
            view.getLocationInWindow(r9);
            view.getDisplay().getRealSize(point);
            int[] iArr = {0, point.y - iArr[1]};
            showAtLocation(view, BadgeDrawable.BOTTOM_START, iArr[0], iArr[1]);
            return;
        }
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = rect.height();
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        showAtLocation(view, BadgeDrawable.BOTTOM_START, iArr2[0], (height - iArr2[1]) + ((int) view.getResources().getDimension(R.dimen.player_controls_volume_popup_offset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateExapned(boolean z, boolean z2) {
        if (z) {
            ViewPropertyAnimator rotation = this.toggleExpandButton.animate().rotation(90.0f);
            if (z2) {
                rotation.setDuration(0L);
            }
            this.expandableView.setVisibility(0);
            return;
        }
        ViewPropertyAnimator rotation2 = this.toggleExpandButton.animate().rotation(0.0f);
        if (z2) {
            rotation2.setDuration(0L);
        }
        this.expandableView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioVolumeChanged(int i, int i2, boolean z) {
        int round = Math.round((i / i2) * 100.0f);
        TextView textView = this.audioVolumeText;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_volume_x, round, Integer.valueOf(round)));
        if (!z) {
            this.seekBarAudioVolume.setMax(i2);
            this.seekBarAudioVolume.setProgress(i);
            return;
        }
        MediaControlsUI.onSetAudioVolume.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAudioStereoBalanceChanged(int i, int i2, boolean z) {
        int i3 = i2 / 2;
        int round = Math.round(((i - i3) / i3) * 100.0f);
        TextView textView = this.balanceText;
        textView.setText(textView.getResources().getQuantityString(R.plurals.audio_stereo_balance_x, round, Integer.valueOf(round)));
        if (!z) {
            this.seekBarBalance.setMax(i2);
            this.seekBarBalance.setProgress(i);
            return;
        }
        MediaControlsUI.onSetAudioStereoBalance.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onCrossFadeChanged(int i, int i2, float f, boolean z) {
        if (i == 0) {
            this.crossFadeText.setText(R.string.playback_crossfade_off);
        } else if (i == 1) {
            this.crossFadeText.setText(R.string.playback_gapless);
        } else {
            float f2 = (i - 1) * f;
            TextView textView = this.crossFadeText;
            textView.setText(textView.getResources().getQuantityString(R.plurals.playback_crossFade_x_sec, (int) f2, Float.valueOf(f2)));
        }
        if (!z) {
            this.seekBarCrossFade.setMax(i2);
            this.seekBarCrossFade.setProgress(i);
            return;
        }
        MediaControlsUI.onSetCrossFade.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    public void onVolumeMuteChanged(boolean z, boolean z2) {
        if (z) {
            ImageButton imageButton = this.muteButton;
            imageButton.setColorFilter(UtilsUI.getAttrColor(imageButton, (int) R.attr.mediaControlsHighLight));
            return;
        }
        ImageButton imageButton2 = this.muteButton;
        imageButton2.setColorFilter(UtilsUI.getAttrColor(imageButton2, (int) R.attr.mediaControlsFG));
    }

    public void onEqStateChanged(boolean z) {
        if (z) {
            this.eqButton.setColorFilter(UtilsUI.getAttrColor(this.muteButton, (int) R.attr.mediaControlsHighLight));
        } else {
            this.eqButton.setColorFilter(UtilsUI.getAttrColor(this.muteButton, (int) R.attr.mediaControlsFG));
        }
    }
}
