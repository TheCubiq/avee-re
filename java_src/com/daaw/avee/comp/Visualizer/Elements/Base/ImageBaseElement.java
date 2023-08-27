package com.daaw.avee.comp.Visualizer.Elements.Base;

import android.graphics.Bitmap;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.Func.Func2;
import com.daaw.avee.Common.Ref;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.Common.MeasureDefs;
import com.daaw.avee.comp.Visualizer.CustomPropertiesList;
import com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.IDependencyResourceCounter;
import mdesl.graphics.ITexture;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public abstract class ImageBaseElement extends Element {
    AlbumArtRequest currentAlbumArtPath;
    protected ElementImageLoader elementImageLoader;
    private boolean generatedAlbumArtHintForceGen;
    private boolean generatedAlbumArtHintNoText;
    private boolean generatedAlbumArtHintShiftHue;
    protected MeasuredVar measureAnimationSpeed;

    protected abstract boolean onAlbumArtCreateGLResources(RenderState renderState, ImageResult imageResult, Ref<Tuple2<ITexture[], Object>> ref, int i);

    protected abstract void onAlbumArtRender(RenderState renderState);

    public ImageBaseElement() {
        super(0, 1.0f, 1.0f);
        this.currentAlbumArtPath = null;
        this.measureAnimationSpeed = new MeasuredVar(MeasureDefs.totalTimeAndBeat, 0.5f, 0.5f);
        this.generatedAlbumArtHintShiftHue = false;
        this.generatedAlbumArtHintNoText = false;
        this.generatedAlbumArtHintForceGen = false;
        setScale(1.0f, 1.0f);
    }

    public void initialize(Func2<RenderState, Bitmap, Bitmap> func2, Func2<RenderState, Bitmap, Bitmap> func22) {
        this.elementImageLoader = new ElementImageLoader(new ElementImageLoader.IOnNeedReCreateGLResources() { // from class: com.daaw.avee.comp.Visualizer.Elements.Base.ImageBaseElement.1
            @Override // com.daaw.avee.comp.Visualizer.Elements.Base.ElementImageLoader.IOnNeedReCreateGLResources
            public void markNeedReCreateGLResources() {
                ImageBaseElement.this.markNeedReCreateGLResourcesDontOverride();
            }
        }, new Func1<IRenderState, AlbumArtRequest>() { // from class: com.daaw.avee.comp.Visualizer.Elements.Base.ImageBaseElement.2
            @Override // com.daaw.avee.Common.Func.Func1
            public AlbumArtRequest onInvoke(IRenderState iRenderState) {
                if (iRenderState != null) {
                    ImageBaseElement.this.currentAlbumArtPath = iRenderState.getRes().getVisualizationData().onRequestsAlbumArtPath();
                }
                return ImageBaseElement.this.currentAlbumArtPath;
            }
        }, func2, func22);
    }

    public void setCustomImage(String str) {
        this.elementImageLoader.setCustomImage(str);
    }

    public void setAlbumArtGenerateHint(int i) {
        this.elementImageLoader.setAlbumArtGenerateHint(i);
        this.generatedAlbumArtHintShiftHue = (i & 1) != 0;
        this.generatedAlbumArtHintNoText = (i & 2) != 0;
        this.generatedAlbumArtHintForceGen = (i & 4) != 0;
    }

    public void setGeneratedAlbumArtColor(int i) {
        this.elementImageLoader.setGeneratedAlbumArtColor(i);
    }

    public void setKeepAspectRatioAndCropToFit(boolean z) {
        this.elementImageLoader.setKeepAspectRatioAndCropToFit(z);
    }

    public boolean getKeepAspectRatioAndCropToFit() {
        return this.elementImageLoader.getKeepAspectRatioAndCropToFit();
    }

    public void setMeasureAnimationSpeed(MeasuredVar measuredVar) {
        this.measureAnimationSpeed = measuredVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onApplyCustomization(CustomPropertiesList customPropertiesList) {
        super.onApplyCustomization(customPropertiesList);
        super.onApplyCustomizationAdditional(customPropertiesList);
        setCustomImage(customPropertiesList.getPropertyString("customImage", null));
        int propertyInt = customPropertiesList.getPropertyInt("generatedAlbumArtHint", 0);
        this.generatedAlbumArtHintShiftHue = customPropertiesList.getPropertyBool("generatedAlbumArtHintShiftHue", (propertyInt & 1) != 0);
        this.generatedAlbumArtHintNoText = customPropertiesList.getPropertyBool("generatedAlbumArtHintNoText", (propertyInt & 2) != 0);
        this.generatedAlbumArtHintForceGen = customPropertiesList.getPropertyBool("generatedAlbumArtHintForceGen", (propertyInt & 4) != 0);
        setAlbumArtGenerateHint((this.generatedAlbumArtHintShiftHue ? 1 : 0) | (this.generatedAlbumArtHintNoText ? 2 : 0) | (this.generatedAlbumArtHintForceGen ? 4 : 0));
        setGeneratedAlbumArtColor(customPropertiesList.getPropertyInt("generatedAlbumArtColor", -1));
        setKeepAspectRatioAndCropToFit(customPropertiesList.getPropertyBool("keepAspectRatioAndCropToFit", false));
        this.elementImageLoader.setColorKeyEnabled(customPropertiesList.getPropertyBool("colorKeyEnabled", false));
        this.elementImageLoader.setColorAutoDetect(customPropertiesList.getPropertyBool("autoDetectColorKey", true));
        this.elementImageLoader.setColorKeyColorKey(customPropertiesList.getPropertyInt("colorKey", -16711936));
        this.elementImageLoader.setColorKeyTransparencyStrength(customPropertiesList.getPropertyFloat("transparencyStrength", 1.0f));
        this.elementImageLoader.setColorKeyOpacityStrength(customPropertiesList.getPropertyFloat("opacityStrength", 1.0f));
        this.measureAnimationSpeed.onApplyCustomization(customPropertiesList.getChild("measureAnimationSpeed"), MeasureDefs.totalTimeAndBeat, 0.5f, 0.5f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onReadCustomization(CustomPropertiesList customPropertiesList, IDependencyResourceCounter iDependencyResourceCounter) {
        super.onReadCustomization(customPropertiesList, iDependencyResourceCounter);
        super.onReadCustomizationAdditional(customPropertiesList);
        iDependencyResourceCounter.PutDependencyResourceName(this.elementImageLoader.getCustomImagePath());
        customPropertiesList.putPropertyStringAsImage("customImage", this.elementImageLoader.getCustomImagePath(), "1_image", ElementImageLoader.internalImages);
        this.measureAnimationSpeed.onReadCustomization1D(customPropertiesList.putEmptyChild("measureAnimationSpeed", "", "1_image", new String[0]));
        customPropertiesList.putPropertyIntAsRangeHidden("generatedAlbumArtHint", this.elementImageLoader.getAlbumArtGenerateHint(), "generatedAlbumArt", 0, 7);
        customPropertiesList.putPropertyBool("generatedAlbumArtHintShiftHue", (this.elementImageLoader.getAlbumArtGenerateHint() & 1) != 0, "generatedAlbumArt");
        customPropertiesList.putPropertyBool("generatedAlbumArtHintNoText", (this.elementImageLoader.getAlbumArtGenerateHint() & 2) != 0, "generatedAlbumArt");
        customPropertiesList.putPropertyBool("generatedAlbumArtHintForceGen", (this.elementImageLoader.getAlbumArtGenerateHint() & 4) != 0, "generatedAlbumArt");
        customPropertiesList.putPropertyIntAsCRGBA("generatedAlbumArtColor", this.elementImageLoader.getGeneratedAlbumArtColor(), "generatedAlbumArt");
        customPropertiesList.putPropertyBool("keepAspectRatioAndCropToFit", this.elementImageLoader.getKeepAspectRatioAndCropToFit(), "1_image");
        customPropertiesList.putPropertyBool("colorKeyEnabled", this.elementImageLoader.getColorKeyEnabled(), "2_ColorKey");
        customPropertiesList.putPropertyBool("autoDetectColorKey", this.elementImageLoader.getColorKeyParams().autoDetect, "2_ColorKey");
        customPropertiesList.putPropertyIntAsCRGB_HL("colorKey", this.elementImageLoader.getColorKeyParams().colorKey, "2_ColorKey");
        customPropertiesList.putPropertyFloatAsRange("transparencyStrength", this.elementImageLoader.getColorKeyParams().transparencyStrength, "2_ColorKey", 0.0f, 4.0f);
        customPropertiesList.putPropertyFloatAsRange("opacityStrength", this.elementImageLoader.getColorKeyParams().opacityStrength, "2_ColorKey", 0.0f, 4.0f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void markNeedReCreateGLResources() {
        super.markNeedReCreateGLResources();
        ElementImageLoader elementImageLoader = this.elementImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.markNeedReCreateGLResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onDestroyGLResources(RenderState renderState) {
        super.onDestroyGLResources(renderState);
        ElementImageLoader elementImageLoader = this.elementImageLoader;
        if (elementImageLoader != null) {
            elementImageLoader.onDestroyGLResources(renderState);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public boolean onCreateGLResources(RenderState renderState) {
        super.onCreateGLResources(renderState);
        this.elementImageLoader.onCreateGLResources(renderState, measureDrawRect(renderState.res.meter), 0);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onCreateGradualGLResources(RenderState renderState, int i) {
        this.elementImageLoader.onCreateGradualGLResources(renderState, i);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        super.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
        this.elementImageLoader.onEarlyUpdate(iRenderState, frameBuffer, iCompositionDependencies);
    }

    @Override // com.daaw.avee.comp.Visualizer.Elements.Base.Element
    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        super.onRender(renderState, frameBuffer);
        this.elementImageLoader.onRender(renderState, frameBuffer);
        onAlbumArtRender(renderState);
    }
}
