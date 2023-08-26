package com.daaw.avee.comp.VisualUI;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.daaw.avee.Common.Events.WeakEvent;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEventR;
import com.daaw.avee.Common.UtilsUI;
import com.daaw.avee.ContextData;
import com.daaw.avee.R;
import com.daaw.avee.comp.LibraryQueueUI.MyView;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
/* loaded from: classes.dex */
public class Fragment2 extends Fragment {
    private ImageButton btn1;
    private View layoutButtons;
    private View layoutButtonsShadow;
    private View rootView;
    private SurfaceView surfaceViewVideo;
    private VisualizerViewCore surfaceViewVisualizer;
    private AspectRatioFrameLayout videoFrame;
    public static WeakEvent1<VisualizerViewCore> onSurfaceCreated = new WeakEvent1<>();
    public static WeakEventR<Boolean> onRequestShowVideoContentState = new WeakEventR<>();
    public static WeakEventR<Integer> onRequestVideoScalingMode = new WeakEventR<>();
    public static WeakEventR<Float> onRequestVideoWidthHeightRatio = new WeakEventR<>();
    public static WeakEventR<Boolean> onRequestIsExportAvailable = new WeakEventR<>();
    public static WeakEvent1<ContextData> onExportAction = new WeakEvent1<>();
    public static WeakEvent1<SurfaceHolder> onVideoSurfaceHolderCreated = new WeakEvent1<>();
    public static WeakEvent onVideoSurfaceHolderDestroyed = new WeakEvent();
    public static WeakEventR<Boolean> onRequestUIComponentNeedChangedValue = new WeakEventR<>();
    public static WeakEvent onVideoElementInteracted = new WeakEvent();
    public static WeakEvent1<Boolean> onUIComponentNeedChanged = new WeakEvent1<>();
    public static WeakEvent1<ContextData> onCustomizeAction = new WeakEvent1<>();
    private int surfaceViewTag = 0;
    private int surfaceViewVideoTag = 0;
    private float widthHeightRatio = 0.0f;

    public void updateVideoScaleMode(int i) {
    }

    public static Fragment2 newInstance() {
        Fragment2 fragment2 = new Fragment2();
        fragment2.setArguments(new Bundle());
        return fragment2;
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_2, viewGroup, false);
        this.rootView = inflate;
        UtilsUI.setStatusBarDimensions(inflate.findViewById(R.id.viewStatusBarBg));
        this.rootView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                final int i9 = i3 - i;
                final int i10 = i4 - i2;
                Fragment2.this.rootView.post(new Runnable() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Fragment2.this.updateVideoSize(i9, i10);
                    }
                });
            }
        });
        View view = this.layoutButtons;
        if (view != null) {
            ((ImageButton) view.findViewById(R.id.btn0)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Fragment2.this.createThemeChooserMenu(view2);
                }
            });
            ImageButton imageButton = (ImageButton) this.layoutButtons.findViewById(R.id.btn1);
            this.btn1 = imageButton;
            imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Fragment2.onCustomizeAction.invoke(new ContextData(view2));
                }
            });
            ImageButton imageButton2 = (ImageButton) this.layoutButtons.findViewById(R.id.btn5);
            imageButton2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Fragment2.onExportAction.invoke(new ContextData(view2));
                }
            });
            if (onRequestIsExportAvailable.invoke(false).booleanValue()) {
                imageButton2.setAlpha(1.0f);
            } else {
                imageButton2.setAlpha(0.25f);
            }
        }
        ((MyView) this.rootView.findViewById(R.id.surfaceViewBackground)).setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Fragment2.onVideoElementInteracted.invoke();
            }
        });
        this.videoFrame = (AspectRatioFrameLayout) this.rootView.findViewById(R.id.videoFrame);
        VisualizerViewCore visualizerViewCore = (VisualizerViewCore) this.rootView.findViewById(R.id.surfaceViewVisualizer);
        this.surfaceViewVisualizer = visualizerViewCore;
        if (visualizerViewCore != null) {
            visualizerViewCore.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.6
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Fragment2.onVideoElementInteracted.invoke();
                }
            });
        }
        SurfaceView surfaceView = (SurfaceView) this.rootView.findViewById(R.id.surfaceViewVideo);
        this.surfaceViewVideo = surfaceView;
        surfaceView.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                Fragment2.onVideoElementInteracted.invoke();
            }
        });
        onSurfaceCreated.invoke(this.surfaceViewVisualizer);
        SurfaceView surfaceView2 = this.surfaceViewVideo;
        if (surfaceView2 != null) {
            onVideoSurfaceHolderCreated.invoke(surfaceView2.getHolder());
        }
        updateVideoScaleMode(onRequestVideoScalingMode.invoke(0).intValue());
        setVideoSize(onRequestVideoWidthHeightRatio.invoke(Float.valueOf(1.0f)).floatValue());
        updateSurfaceVisibility(onRequestUIComponentNeedChangedValue.invoke(true).booleanValue(), onRequestShowVideoContentState.invoke(false).booleanValue());
        return this.rootView;
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        onVideoSurfaceHolderDestroyed.invoke();
        super.onDestroyView();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    boolean isViewCreated() {
        return this.rootView != null;
    }

    boolean isSurfaceVisible() {
        SurfaceView surfaceView = this.surfaceViewVideo;
        if (surfaceView == null || !(surfaceView.getVisibility() == 0 || this.surfaceViewVideoTag == 1)) {
            VisualizerViewCore visualizerViewCore = this.surfaceViewVisualizer;
            return visualizerViewCore != null && (visualizerViewCore.getVisibility() == 0 || this.surfaceViewTag == 1);
        }
        return true;
    }

    public void updateSurfaceVisibility(boolean z, boolean z2) {
        if (!z) {
            SurfaceView surfaceView = this.surfaceViewVideo;
            if (surfaceView != null) {
                this.surfaceViewVideoTag = 0;
                surfaceView.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore = this.surfaceViewVisualizer;
            if (visualizerViewCore != null) {
                this.surfaceViewTag = 0;
                visualizerViewCore.setVisibility(8);
            }
        } else if (z2) {
            VisualizerViewCore visualizerViewCore2 = this.surfaceViewVisualizer;
            if (visualizerViewCore2 != null) {
                this.surfaceViewTag = 0;
                visualizerViewCore2.setVisibility(8);
            }
            SurfaceView surfaceView2 = this.surfaceViewVideo;
            if (surfaceView2 != null) {
                this.surfaceViewVideoTag = 1;
                surfaceView2.postDelayed(new Runnable() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.8
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Fragment2.this.surfaceViewVideoTag == 1) {
                            Fragment2.this.surfaceViewVideo.setVisibility(0);
                            Fragment2.onVideoSurfaceHolderCreated.invoke(Fragment2.this.surfaceViewVideo.getHolder());
                        }
                    }
                }, 250L);
            }
        } else {
            SurfaceView surfaceView3 = this.surfaceViewVideo;
            if (surfaceView3 != null) {
                this.surfaceViewVideoTag = 0;
                surfaceView3.setVisibility(8);
            }
            VisualizerViewCore visualizerViewCore3 = this.surfaceViewVisualizer;
            if (visualizerViewCore3 != null) {
                this.surfaceViewTag = 1;
                visualizerViewCore3.postDelayed(new Runnable() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (Fragment2.this.surfaceViewTag == 1) {
                            Fragment2.this.surfaceViewVisualizer.setVisibility(0);
                        }
                    }
                }, 250L);
            }
        }
    }

    public void setShowVideoContentState(boolean z) {
        updateSurfaceVisibility(isSurfaceVisible(), z);
    }

    public void setVideoSize(float f) {
        if (isViewCreated()) {
            this.widthHeightRatio = f;
            updateVideoSize(this.rootView.getWidth(), this.rootView.getHeight());
        }
    }

    public void setVideoSizeTh(final float f) {
        if (isViewCreated()) {
            this.rootView.post(new Runnable() { // from class: com.daaw.avee.comp.VisualUI.Fragment2.10
                @Override // java.lang.Runnable
                public void run() {
                    Fragment2.this.widthHeightRatio = f;
                    Fragment2 fragment2 = Fragment2.this;
                    fragment2.updateVideoSize(fragment2.rootView.getWidth(), Fragment2.this.rootView.getHeight());
                }
            });
        }
    }

    void updateVideoSize(float f, float f2) {
        float f3 = this.widthHeightRatio;
        if (f3 != 0.0f) {
            AspectRatioFrameLayout aspectRatioFrameLayout = this.videoFrame;
            if (aspectRatioFrameLayout != null) {
                aspectRatioFrameLayout.setAspectRatio(f3);
            }
        } else if (f <= 0.0f || f2 <= 0.0f) {
        } else {
            float f4 = f / f2;
            AspectRatioFrameLayout aspectRatioFrameLayout2 = this.videoFrame;
            if (aspectRatioFrameLayout2 != null) {
                aspectRatioFrameLayout2.setAspectRatio(f4);
            }
        }
    }

    public void animateShow(boolean z) {
        View view = this.layoutButtons;
        if (view == null) {
            return;
        }
        int integer = view.getResources().getInteger(17694720);
        if (z) {
            long j = integer;
            this.layoutButtons.animate().translationX(0.0f).alpha(1.0f).setDuration(j);
            this.layoutButtonsShadow.animate().translationX(0.0f).alpha(1.0f).setDuration(j);
            return;
        }
        long j2 = integer;
        this.layoutButtons.animate().translationX(this.layoutButtons.getWidth()).alpha(0.0f).setDuration(j2);
        this.layoutButtonsShadow.animate().translationX(this.layoutButtons.getWidth()).alpha(0.0f).setDuration(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void createThemeChooserMenu(View view) {
        VisualizerChooseDialog.createAndShowDialog(getActivity());
    }

    private static void setStatusBarDimensions(View view) {
        if (view == null) {
            return;
        }
        view.getLayoutParams().height = UtilsUI.getStatusBarHeight(view.getContext());
    }
}
