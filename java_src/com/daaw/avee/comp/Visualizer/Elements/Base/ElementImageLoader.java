package com.daaw.avee.comp.Visualizer.Elements.Base;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.daaw.avee.Common.Func.Func1;
import com.daaw.avee.Common.Func.Func2;
import com.daaw.avee.Common.Ref;
import com.daaw.avee.Common.Tuple2;
import com.daaw.avee.Common.Utils;
import com.daaw.avee.Common.VAsyncTask2;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest;
import com.daaw.avee.comp.AlbumArt.AlbumArtRequest2;
import com.daaw.avee.comp.AlbumArt.ImageColorKeyParams;
import com.daaw.avee.comp.AlbumArt.ImageLoadedListener;
import com.daaw.avee.comp.AlbumArt.ImageResult;
import com.daaw.avee.comp.Visualizer.Elements.Composition;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasFlippedTexture;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasFlippedTextureArray;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.AtlasTextureArray;
import com.daaw.avee.comp.Visualizer.Graphic.IAtlasTexture;
import com.daaw.avee.comp.Visualizer.Graphic.IRenderState;
import com.daaw.avee.comp.Visualizer.Graphic.RenderState;
import com.daaw.avee.comp.Visualizer.Graphic.VFrameBuffer;
import com.daaw.avee.comp.Visualizer.Graphic.VTexture;
import com.daaw.avee.comp.Visualizer.ICompositionDependencies;
import com.daaw.avee.comp.Visualizer.InternalVisualizationDataProvider;
import mdesl.graphics.ITexture;
import mdesl.graphics.glutils.FrameBuffer;
/* loaded from: classes.dex */
public class ElementImageLoader implements ImageLoadedListener {
    private Object imageLoadStrongReference;
    IOnNeedReCreateGLResources onNeedReCreateGLResources;
    Func1<IRenderState, AlbumArtRequest> onRequestValueForNullCb;
    Func2<RenderState, Bitmap, Bitmap> processBitmapCb;
    Func2<RenderState, Bitmap, Bitmap> processBitmapSecondaryCb;
    public static final String[] internalImages = {"internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:vignette80", "internalres:rainbow128", "internalres:particle_blur01_more", "internalres:lens_flare", "internalres:lens_flare_2", "internalres:anim128_g_m10_15", "composition:0"};
    // smali: added more items (internalres:anim128_g_m10_15, internalres:snowflake, internalres:year2018)
    public static final String[] internalMaskImages = {"internalres:transparent", "internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:particle_blur01", "internalres:particle_blur_inv", "internalres:vignette80", "composition:0"};
    static Ref<Bitmap> bitmapTmp = new Ref<>(null);
    private IAtlasTexture atlasTex1 = null;
    private IAtlasTexture atlasTex2 = null;
    private AlbumArtRequest albumArtRequest = new AlbumArtRequest(Uri.EMPTY, "", "", "");
    protected String customImagePath = null;
    int referenceComposition = 0;
    private ImageResult imageResult = null;
    private int albumArtGenerateHint = 0;
    protected boolean keepAspectRatioAndCropToFit = false;
    int generatedAlbumArtColor = -1;
    int loadState = 0;
    Ref<Tuple2<ITexture[], Object>> gradualLoadingTextures = new Ref<>(null);
    private boolean colorKeyEnabled = false;
    private ImageColorKeyParams colorKeyParams = new ImageColorKeyParams(-16711936, true, 1.0f, 1.0f);

    /* loaded from: classes.dex */
    public interface IOnNeedReCreateGLResources {
        void markNeedReCreateGLResources();
    }

    private static Bitmap processBitmapColorKey(Bitmap bitmap, int i, Ref<Bitmap> ref) {
        return bitmap;
    }

    public ElementImageLoader(IOnNeedReCreateGLResources iOnNeedReCreateGLResources, Func1<IRenderState, AlbumArtRequest> func1, Func2<RenderState, Bitmap, Bitmap> func2, Func2<RenderState, Bitmap, Bitmap> func22) {
        this.onNeedReCreateGLResources = iOnNeedReCreateGLResources;
        this.onRequestValueForNullCb = func1;
        this.processBitmapCb = func2;
        this.processBitmapSecondaryCb = func22;
    }

    public void setAlbumArtGenerateHint(int i) {
        if (this.albumArtGenerateHint == i) {
            return;
        }
        this.albumArtGenerateHint = i;
        invokeMarkNeedReCreateGLResources();
    }

    public int getAlbumArtGenerateHint() {
        return this.albumArtGenerateHint;
    }

    public void setGeneratedAlbumArtColor(int i) {
        if (this.generatedAlbumArtColor == i) {
            return;
        }
        this.generatedAlbumArtColor = i;
        invokeMarkNeedReCreateGLResources();
    }

    public int getGeneratedAlbumArtColor() {
        return this.generatedAlbumArtColor;
    }

    public void setKeepAspectRatioAndCropToFit(boolean z) {
        if (this.keepAspectRatioAndCropToFit == z) {
            return;
        }
        this.keepAspectRatioAndCropToFit = z;
        invokeMarkNeedReCreateGLResources();
    }

    public boolean getKeepAspectRatioAndCropToFit() {
        return this.keepAspectRatioAndCropToFit;
    }

    public void setCustomImage(String str) {
        this.customImagePath = str;
        int indexFromStringPath = Composition.getIndexFromStringPath(str);
        this.referenceComposition = indexFromStringPath;
        if (indexFromStringPath > 0) {
            setResPicturePath(null);
            return;
        }
        String str2 = this.customImagePath;
        if (str2 != null && str2.length() > 0) {
            setResPicturePath(new AlbumArtRequest(Uri.EMPTY, this.customImagePath, "", ""));
            return;
        }
        Func1<IRenderState, AlbumArtRequest> func1 = this.onRequestValueForNullCb;
        setResPicturePath(func1 != null ? func1.onInvoke(null) : null);
    }

    public String getCustomImagePath() {
        return this.customImagePath;
    }

    public void setColorKeyEnabled(boolean z) {
        if (this.colorKeyEnabled == z) {
            return;
        }
        this.colorKeyEnabled = z;
        invokeMarkNeedReCreateGLResources();
    }

    public boolean getColorKeyEnabled() {
        return this.colorKeyEnabled;
    }

    public void setColorAutoDetect(boolean z) {
        if (this.colorKeyParams.autoDetect == z) {
            return;
        }
        this.colorKeyParams.autoDetect = z;
        invokeMarkNeedReCreateGLResources();
    }

    public void setColorKeyColorKey(int i) {
        if (this.colorKeyParams.colorKey == i) {
            return;
        }
        this.colorKeyParams.colorKey = i;
        invokeMarkNeedReCreateGLResources();
    }

    public void setColorKeyTransparencyStrength(float f) {
        if (this.colorKeyParams.transparencyStrength == f) {
            return;
        }
        this.colorKeyParams.transparencyStrength = f;
        invokeMarkNeedReCreateGLResources();
    }

    public void setColorKeyOpacityStrength(float f) {
        if (this.colorKeyParams.opacityStrength == f) {
            return;
        }
        this.colorKeyParams.opacityStrength = f;
        invokeMarkNeedReCreateGLResources();
    }

    public ImageColorKeyParams setColorKeyParams() {
        invokeMarkNeedReCreateGLResources();
        return this.colorKeyParams;
    }

    public ImageColorKeyParams getColorKeyParams() {
        return this.colorKeyParams;
    }

    public void setResPicturePath(AlbumArtRequest albumArtRequest) {
        AlbumArtRequest albumArtRequest2;
        if (albumArtRequest == null && this.albumArtRequest == null) {
            return;
        }
        if (albumArtRequest != null && (albumArtRequest2 = this.albumArtRequest) != null && Utils.compareNullStrings(albumArtRequest2.videoThumbDataSource.getPath(), albumArtRequest.videoThumbDataSource.getPath()) && Utils.compareNullStrings(this.albumArtRequest.path0, albumArtRequest.path0) && Utils.compareNullStrings(this.albumArtRequest.path1, albumArtRequest.path1) && Utils.compareNullStrings(this.albumArtRequest.genStr, albumArtRequest.genStr)) {
            return;
        }
        this.albumArtRequest = albumArtRequest;
        invokeMarkNeedReCreateGLResources();
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
    public void onBitmapLoaded(ImageResult imageResult, String str, String str2, String str3) {
        AlbumArtRequest albumArtRequest = this.albumArtRequest;
        if (albumArtRequest != null && Utils.compareNullStrings(str2, albumArtRequest.path0) && Utils.compareNullStrings(str2, this.albumArtRequest.path0) && Utils.compareNullStrings(str3, this.albumArtRequest.path1)) {
            invokeMarkNeedReCreateGLResources();
            ImageResult.closeSafe(this.imageResult);
            this.imageResult = imageResult;
            this.loadState = 2;
        }
    }

    @Override // com.daaw.avee.comp.AlbumArt.ImageLoadedListener
    public void setUserObject1(Object obj) {
        this.imageLoadStrongReference = obj;
    }

    private void invokeMarkNeedReCreateGLResources() {
        markNeedReCreateGLResources();
        this.onNeedReCreateGLResources.markNeedReCreateGLResources();
    }

    public void markNeedReCreateGLResources() {
        this.loadState = 0;
    }

    public void onDestroyGLResources(RenderState renderState) {
        clearTex1();
        clearTex2();
    }

    public boolean onCreateGLResources(RenderState renderState, RectF rectF, int i) {
        int i2;
        ImageColorKeyParams imageColorKeyParams;
        if (this.loadState == 0) {
            ImageResult.closeSafe(this.imageResult);
            this.imageResult = null;
            this.loadState = 1;
            if (this.albumArtRequest == null) {
                invokeMarkNeedReCreateGLResources();
                ImageResult.closeSafe(this.imageResult);
                this.imageResult = null;
                this.loadState = 2;
                return true;
            }
            InternalVisualizationDataProvider internalVisualizationDataProvider = renderState.res.visualizationData;
            Uri uri = this.albumArtRequest.videoThumbDataSource;
            String str = this.albumArtRequest.path0;
            String str2 = this.albumArtRequest.path1;
            String str3 = this.albumArtRequest.genStr;
            boolean z = !this.keepAspectRatioAndCropToFit;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            int width2 = (int) rectF.width();
            int height2 = (int) rectF.height();
            int i3 = this.albumArtGenerateHint;
            int i4 = this.generatedAlbumArtColor;
            if (this.colorKeyEnabled) {
                imageColorKeyParams = this.colorKeyParams;
                i2 = i4;
            } else {
                i2 = i4;
                imageColorKeyParams = null;
            }
            internalVisualizationDataProvider.onRequestAlbumArtPathAndBitmap(this, new AlbumArtRequest2(uri, str, str2, str3, z, width, height, width2, height2, i3, i2, imageColorKeyParams));
            return true;
        }
        return true;
    }

    public boolean onCreateGradualGLResources(RenderState renderState, int i) {
        if (this.loadState == 2 && createAlbumArtResources(renderState, this.imageResult, i)) {
            this.loadState = 3;
            ImageResult.closeSafe(this.imageResult);
            this.imageResult = null;
            return true;
        }
        return true;
    }

    public void onEarlyUpdate(IRenderState iRenderState, FrameBuffer frameBuffer, ICompositionDependencies iCompositionDependencies) {
        int i = this.referenceComposition;
        if (i > 0) {
            iCompositionDependencies.addDependencyCompositionIndex(i);
        }
        String str = this.customImagePath;
        if ((str == null || str.length() <= 0) && this.referenceComposition <= 0) {
            Func1<IRenderState, AlbumArtRequest> func1 = this.onRequestValueForNullCb;
            setResPicturePath(func1 != null ? func1.onInvoke(iRenderState) : null);
        }
    }

    public void onRender(RenderState renderState, FrameBuffer frameBuffer) {
        if (this.loadState == 3 || this.referenceComposition > 0) {
            return;
        }
        renderState.frameResourcesLoadingAdd();
    }

    protected boolean createAlbumArtResources(RenderState renderState, ImageResult imageResult, int i) {
        if (imageResult == null) {
            clearTex1();
            return true;
        }
        Ref ref = new Ref(null);
        Ref ref2 = new Ref(null);
        boolean atlasTextureFromImageResult = atlasTextureFromImageResult(ref, ref2, renderState, imageResult, this.gradualLoadingTextures, i, this.processBitmapCb, this.processBitmapSecondaryCb);
        if (this.atlasTex1 != ref.obj) {
            clearTex1();
        }
        this.atlasTex1 = (IAtlasTexture) ref.obj;
        clearTex2();
        this.atlasTex2 = (IAtlasTexture) ref2.obj;
        return atlasTextureFromImageResult;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class GradualLoadData {
        public int gradualLoadingIndex = 0;
        public AtlasTextureArray array = null;
        public VAsyncTask2<Bitmap> task = null;

        GradualLoadData() {
        }
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [com.daaw.avee.comp.Visualizer.Graphic.AtlasFlippedTexture, T] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, com.daaw.avee.comp.Visualizer.Graphic.AtlasTextureArray] */
    /* JADX WARN: Type inference failed for: r2v11, types: [T, com.daaw.avee.Common.Tuple2] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.daaw.avee.comp.Visualizer.Graphic.AtlasFlippedTexture, T] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, com.daaw.avee.comp.Visualizer.Graphic.AtlasTextureArray] */
    public static boolean atlasTextureFromImageResult(Ref<IAtlasTexture> ref, Ref<IAtlasTexture> ref2, RenderState renderState, ImageResult imageResult, Ref<Tuple2<ITexture[], Object>> ref3, int i, Func2<RenderState, Bitmap, Bitmap> func2, Func2<RenderState, Bitmap, Bitmap> func22) {
        if (imageResult == null) {
            ref.obj = null;
            if (ref2 != null) {
                ref2.obj = null;
            }
            return true;
        }
        Bitmap nonPersistentBitmapSafe = ImageResult.getNonPersistentBitmapSafe(imageResult);
        if (nonPersistentBitmapSafe == null) {
            ref.obj = null;
            if (ref2 != null) {
                ref2.obj = null;
            }
            return true;
        }
        if (ref2 != null) {
            Bitmap Invoke = func2 != null ? func22.Invoke(renderState, nonPersistentBitmapSafe) : null;
            if (Invoke != null) {
                ref2.obj = new AtlasFlippedTexture(new VTexture(Invoke, 9729, 9729, 10497, false), true);
            } else {
                ref2.obj = null;
            }
            if (Invoke != null && nonPersistentBitmapSafe != Invoke) {
                Invoke.recycle();
            }
        }
        int framesCount = imageResult.getFramesCount();
        if (framesCount > 1) {
            if (i == 0) {
                imageResult.resetCurrentFrame();
                ref3.obj = new Tuple2(new ITexture[framesCount], new GradualLoadData());
            }
            GradualLoadData gradualLoadData = ref3.obj != null ? (GradualLoadData) ref3.obj.obj2 : null;
            if (gradualLoadData == null) {
                return true;
            }
            if (gradualLoadData.gradualLoadingIndex < framesCount) {
                if (gradualLoadData.task == null) {
                    imageResult.advanceNextFrame();
                    gradualLoadData.task = imageResult.getNextFrame2();
                }
                if (gradualLoadData.task.isDone()) {
                    Bitmap result = gradualLoadData.task.getResult();
                    if (result == null) {
                        result = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                    }
                    VTexture vTexture = new VTexture(processBitmapColorKey(result, 0, bitmapTmp), 9729, 9729, 10497, false);
                    if (gradualLoadData.gradualLoadingIndex == 0) {
                        ITexture[] iTextureArr = ref3.obj.obj1;
                        iTextureArr[gradualLoadData.gradualLoadingIndex] = vTexture;
                        gradualLoadData.array = new AtlasFlippedTextureArray(iTextureArr, true);
                    }
                    ref3.obj.obj1[gradualLoadData.gradualLoadingIndex] = vTexture;
                    AtlasTextureArray atlasTextureArray = gradualLoadData.array;
                    if (atlasTextureArray != null) {
                        atlasTextureArray.gradualLoadTexture(gradualLoadData.gradualLoadingIndex, vTexture);
                    }
                    gradualLoadData.gradualLoadingIndex++;
                    gradualLoadData.task = null;
                }
                ref.obj = gradualLoadData.array;
                return false;
            }
            ref.obj = gradualLoadData.array;
            ref3.obj = null;
        } else {
            Bitmap Invoke2 = func2 != null ? func2.Invoke(renderState, nonPersistentBitmapSafe) : nonPersistentBitmapSafe;
            if (Invoke2 != null) {
                ref.obj = new AtlasFlippedTexture(new VTexture(processBitmapColorKey(Invoke2, 0, bitmapTmp), 9729, 9729, 10497, false), true);
            } else {
                ref.obj = null;
            }
            if (Invoke2 != null && nonPersistentBitmapSafe != Invoke2) {
                Invoke2.recycle();
            }
        }
        return true;
    }

    void clearTex1() {
        IAtlasTexture iAtlasTexture = this.atlasTex1;
        if (iAtlasTexture != null) {
            iAtlasTexture.dispose();
        }
        this.atlasTex1 = null;
    }

    void clearTex2() {
        IAtlasTexture iAtlasTexture = this.atlasTex2;
        if (iAtlasTexture != null) {
            iAtlasTexture.dispose();
        }
        this.atlasTex2 = null;
    }

    public IAtlasTexture getTexture(RenderState renderState) {
        int i = this.referenceComposition;
        if (i > 0) {
            VFrameBuffer compositionResult = renderState.getCompositionResult(i);
            if (compositionResult == null) {
                return renderState.res.getAtlasTexWhite();
            }
            return new AtlasTexture(compositionResult.getTexture(), false);
        }
        return this.atlasTex1;
    }

    public IAtlasTexture getTextureSecondary(RenderState renderState) {
        if (this.referenceComposition > 0) {
            return null;
        }
        return this.atlasTex2;
    }
}
