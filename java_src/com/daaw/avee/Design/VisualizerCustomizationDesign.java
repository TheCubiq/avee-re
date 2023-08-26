package com.daaw.avee.Design;

import android.app.DialogFragment;
import android.content.Context;
import com.daaw.avee.Common.Action1;
import com.daaw.avee.Common.Events.WeakEvent1;
import com.daaw.avee.Common.Events.WeakEvent3;
import com.daaw.avee.Common.Events.WeakEvent4;
import com.daaw.avee.Common.Events.WeakEvent5;
import com.daaw.avee.Common.Events.WeakEventR1;
import com.daaw.avee.Common.Events.WeakEventR3;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.ContextData;
import com.daaw.avee.EventsGlobal.EventsGlobalTextNotifier;
import com.daaw.avee.PlayerCore;
import com.daaw.avee.R;
import com.daaw.avee.comp.VisualUI.Fragment2;
import com.daaw.avee.comp.Visualizer.CustomComposition;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.CustomScene;
import com.daaw.avee.comp.Visualizer.Elements.AudioDataProviderElement;
import com.daaw.avee.comp.Visualizer.Elements.Composition;
import com.daaw.avee.comp.Visualizer.Elements.ImageElement;
import com.daaw.avee.comp.Visualizer.Elements.LogoMark2;
import com.daaw.avee.comp.Visualizer.Elements.MirrorEffectElement;
import com.daaw.avee.comp.Visualizer.Elements.MotionBlurEffectElement;
import com.daaw.avee.comp.Visualizer.Elements.ParticlesElement;
import com.daaw.avee.comp.Visualizer.Elements.RgbSplitEffectElement;
import com.daaw.avee.comp.Visualizer.Elements.TextElement;
import com.daaw.avee.comp.Visualizer.VisualizerViewCore;
import com.daaw.avee.comp.VisualizerCutomization.CustomizeVisDialog;
import java.lang.ref.WeakReference;
import nz.net.speakman.androidlicensespage.LicensesFragment;
/* loaded from: classes.dex */
public class VisualizerCustomizationDesign extends DesignBase {
    private WeakReference<VisualizerViewCore> visualizerSurfaceView = new WeakReference<>(null);

    public VisualizerCustomizationDesign() {
        CustomizeVisDialog.onRequestIsElementTypePr.subscribeWeak(new WeakEventR1.Handler<String, Boolean>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.1
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(String str) {
                return Boolean.valueOf(!Composition.typeName.equals(str));
            }
        }, this.listenerRefHolder);
        Fragment2.onSurfaceCreated.subscribeWeak(new WeakEvent1.Handler<VisualizerViewCore>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.2
            @Override // com.daaw.avee.Common.Events.WeakEvent1.Handler
            public void invoke(VisualizerViewCore visualizerViewCore) {
                VisualizerCustomizationDesign.this.visualizerSurfaceView = new WeakReference(visualizerViewCore);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onAddElementAction.subscribeWeak(new WeakEvent5.Handler<ContextData, Integer, Integer, CustomScene, String>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.3
            @Override // com.daaw.avee.Common.Events.WeakEvent5.Handler
            public void invoke(ContextData contextData, Integer num, Integer num2, CustomScene customScene, String str) {
                VisualizerCustomizationDesign.this.addElementToCustomScene(customScene, str);
                VisualizerCustomizationDesign.this.updateChangesToVisDialogGlTh(customScene, true, -1);
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onActionDuplicate.subscribeWeak(new WeakEvent3.Handler<Context, Integer, CustomScene>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.4
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Context context, Integer num, CustomScene customScene) {
                CustomPropertiesList element;
                CustomPropertiesList parent;
                CustomizeVisDialog customizeVisDialog = CustomizeVisDialog.getInstance();
                if (customizeVisDialog == null) {
                    return;
                }
                CustomizeVisDialog.ThreeEntry treeItem = customizeVisDialog.getTreeItem(num.intValue());
                if (treeItem.getComposition() == null && (element = treeItem.getElement()) != null && (parent = element.getParent()) != null && (parent instanceof CustomComposition)) {
                    CustomComposition customComposition = (CustomComposition) parent;
                    customComposition.createDataEntryClonedFrom(element);
                    VisualizerCustomizationDesign.this.updateChangesToVisDialogGlTh(customScene, false, customComposition.GetCompositionIndex());
                }
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onActionRemove.subscribeWeak(new WeakEvent3.Handler<Context, Integer, CustomScene>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.5
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(Context context, Integer num, CustomScene customScene) {
                CustomizeVisDialog customizeVisDialog = CustomizeVisDialog.getInstance();
                if (customizeVisDialog != null) {
                    customizeVisDialog.removeTreeItem(num.intValue());
                }
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onElementWikiInfoAction.subscribeWeak(new WeakEvent3.Handler<CustomizeVisDialog, String, String>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.6
            @Override // com.daaw.avee.Common.Events.WeakEvent3.Handler
            public void invoke(CustomizeVisDialog customizeVisDialog, String str, String str2) {
                if (LogoMark2.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_app_logo, 0, "");
                } else if (AudioDataProviderElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_audio_provider, 0, "");
                } else if ("BlurEffect".equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_blur_effect, 0, "");
                } else if (Composition.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_composition, 0, "");
                } else if (ImageElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_image, 0, "");
                } else if (MirrorEffectElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_mirror_effect, 0, "");
                } else if (MotionBlurEffectElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_motion_blur_effect, 0, "");
                } else if (ParticlesElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_particles_element, 0, "");
                } else if (RgbSplitEffectElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_rgb_split_effect, 0, "");
                } else if ("Bars".equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_segment_bars, 0, "");
                } else if (TextElement.typeName.equals(str)) {
                    LicensesFragment.displayLicensesFragment(customizeVisDialog.getFragmentManager(), true, R.raw.element_text, 0, "");
                }
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onActionResetElement.subscribeWeak(new WeakEvent4.Handler<CustomizeVisDialog, CustomScene, CustomPropertiesList, String>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.7
            @Override // com.daaw.avee.Common.Events.WeakEvent4.Handler
            public void invoke(CustomizeVisDialog customizeVisDialog, CustomScene customScene, CustomPropertiesList customPropertiesList, String str) {
                if (customScene == null || customPropertiesList == null) {
                    return;
                }
                customPropertiesList.clearAll(customPropertiesList.getTypeName(), customPropertiesList.getVersionId());
                Context appContext = PlayerCore.s().getAppContext();
                if (appContext != null) {
                    EventsGlobalTextNotifier.onTextMsg.invoke(appContext.getString(R.string.vis_customization_element_reset));
                }
                VisualizerCustomizationDesign.this.updateChangesToVisDialogGlTh(customScene, false, -1);
            }
        }, this.listenerRefHolder);
        LicensesFragment.onRequestUrl.subscribeWeak(new WeakEventR1.Handler<String, Integer>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.8
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Integer invoke(String str) {
                if ("customization_general".equals(str)) {
                    return Integer.valueOf((int) R.raw.customization_general);
                }
                if ("customization_segment_renderers".equals(str)) {
                    return Integer.valueOf((int) R.raw.customization_segment_renderers);
                }
                return 0;
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onRequestElementAvailableVersions.subscribeWeak(new WeakEventR3.Handler<CustomizeVisDialog, String, String, Tuple2<String[], String>>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.9
            @Override // com.daaw.avee.Common.Events.WeakEventR3.Handler
            public Tuple2<String[], String> invoke(CustomizeVisDialog customizeVisDialog, String str, String str2) {
                return new Tuple2<>(new String[]{"10"}, "10");
            }
        }, this.listenerRefHolder);
        CustomizeVisDialog.onBackPressed.subscribeWeak(new WeakEventR1.Handler<DialogFragment, Boolean>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.10
            @Override // com.daaw.avee.Common.Events.WeakEventR1.Handler
            public Boolean invoke(DialogFragment dialogFragment) {
                CustomizeVisDialog customizeVisDialog = CustomizeVisDialog.getInstance();
                if (customizeVisDialog == null || (!customizeVisDialog.closePropertyView() && !customizeVisDialog.goToView(0))) {
                    return false;
                }
                return true;
            }
        }, this.listenerRefHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateChangesToVisDialogGlTh(CustomScene customScene, final boolean z, final int i) {
        VisualizerViewCore visualizerViewCore = this.visualizerSurfaceView.get();
        if (visualizerViewCore != null) {
            visualizerViewCore.setThemeCustomizationDataUiTh(customScene, new Action1<VisualizerViewCore>() { // from class: com.daaw.avee.Design.VisualizerCustomizationDesign.11
                @Override // com.daaw.avee.Common.Action1
                public void onInvoke(VisualizerViewCore visualizerViewCore2) {
                    VisualizerDesign.updateChangesToVisDialogGlTh(visualizerViewCore2, z, i);
                }
            });
        }
    }

    public void addElementToCustomScene(CustomScene customScene, String str) {
        CustomPropertiesList createDataEntry;
        if (Composition.typeName.equals(str)) {
            createDataEntry = customScene.createDataEntry();
        } else {
            createDataEntry = customScene.getEntryCount() > 0 ? customScene.getEntry(customScene.getEntryCount() - 1).createDataEntry() : null;
        }
        if (createDataEntry != null) {
            createDataEntry.putChildTypeValue(str);
        }
    }
}
