.class public Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;
.super Ljava/lang/Object;
.source "ElementImageLoader.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;,
        Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;
    }
.end annotation


# static fields
.field static bitmapTmp:Lcom/daaw/avee/Common/Ref;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Ref<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public static final internalImages:[Ljava/lang/String;

.field public static final internalMaskImages:[Ljava/lang/String;


# instance fields
.field private albumArtGenerateHint:I

.field private albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

.field private atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

.field private atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

.field private colorKeyEnabled:Z

.field private colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field protected customImagePath:Ljava/lang/String;

.field generatedAlbumArtColor:I

.field gradualLoadingTextures:Lcom/daaw/avee/Common/Ref;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "[",
            "Lmdesl/graphics/ITexture;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation
.end field

.field private imageLoadStrongReference:Ljava/lang/Object;

.field private imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

.field protected keepAspectRatioAndCropToFit:Z

.field loadState:I

.field onNeedReCreateGLResources:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;

.field onRequestValueForNullCb:Lcom/daaw/avee/Common/Func/Func1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            ">;"
        }
    .end annotation
.end field

.field processBitmapCb:Lcom/daaw/avee/Common/Func/Func2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field processBitmapSecondaryCb:Lcom/daaw/avee/Common/Func/Func2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field referenceComposition:I


# direct methods
.method static constructor <clinit>()V
    .locals 15

    const/16 v0, 0x9

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "internalres:white"

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-string v3, "internalres:black"

    const/4 v4, 0x1

    aput-object v3, v0, v4

    const-string v5, "internalres:particle_circle_blur4"

    const/4 v6, 0x2

    aput-object v5, v0, v6

    const-string v7, "internalres:vignette80"

    const/4 v8, 0x3

    aput-object v7, v0, v8

    const-string v9, "internalres:rainbow128"

    const/4 v10, 0x4

    aput-object v9, v0, v10

    const-string v9, "internalres:particle_blur01_more"

    const/4 v11, 0x5

    aput-object v9, v0, v11

    const-string v9, "internalres:lens_flare"

    const/4 v12, 0x6

    aput-object v9, v0, v12

    const-string v9, "internalres:lens_flare_2"

    const/4 v13, 0x7

    aput-object v9, v0, v13

    const-string v9, "composition:0"

    const/16 v14, 0x8

    aput-object v9, v0, v14

    .line 41
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalImages:[Ljava/lang/String;

    new-array v0, v14, [Ljava/lang/String;

    const-string v14, "internalres:transparent"

    aput-object v14, v0, v2

    aput-object v1, v0, v4

    aput-object v3, v0, v6

    aput-object v5, v0, v8

    const-string v1, "internalres:particle_blur01"

    aput-object v1, v0, v10

    const-string v1, "internalres:particle_blur_inv"

    aput-object v1, v0, v11

    aput-object v7, v0, v12

    aput-object v9, v0, v13

    .line 53
    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->internalMaskImages:[Ljava/lang/String;

    .line 415
    new-instance v0, Lcom/daaw/avee/Common/Ref;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->bitmapTmp:Lcom/daaw/avee/Common/Ref;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;Lcom/daaw/avee/Common/Func/Func1;Lcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;",
            "Lcom/daaw/avee/Common/Func/Func1<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 82
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 83
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 85
    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    sget-object v2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    const-string v3, ""

    invoke-direct {v1, v2, v3, v3, v3}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    .line 86
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    const/4 v1, 0x0

    .line 87
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    .line 88
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    .line 93
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtGenerateHint:I

    .line 94
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->keepAspectRatioAndCropToFit:Z

    const/4 v2, -0x1

    .line 95
    iput v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->generatedAlbumArtColor:I

    .line 97
    iput v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    .line 100
    new-instance v2, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v2, v0}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->gradualLoadingTextures:Lcom/daaw/avee/Common/Ref;

    .line 102
    iput-boolean v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyEnabled:Z

    .line 103
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    const/high16 v1, 0x3f800000    # 1.0f

    const v2, -0xff0100

    const/4 v3, 0x1

    invoke-direct {v0, v2, v3, v1, v1}, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;-><init>(IZFF)V

    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    .line 111
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onNeedReCreateGLResources:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;

    .line 113
    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRequestValueForNullCb:Lcom/daaw/avee/Common/Func/Func1;

    .line 114
    iput-object p3, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapCb:Lcom/daaw/avee/Common/Func/Func2;

    .line 115
    iput-object p4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapSecondaryCb:Lcom/daaw/avee/Common/Func/Func2;

    return-void
.end method

.method public static atlasTextureFromImageResult(Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Lcom/daaw/avee/Common/Ref;ILcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)Z
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            ">;",
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;",
            ">;",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Lcom/daaw/avee/comp/AlbumArt/ImageResult;",
            "Lcom/daaw/avee/Common/Ref<",
            "Lcom/daaw/avee/Common/Tuple2<",
            "[",
            "Lmdesl/graphics/ITexture;",
            "Ljava/lang/Object;",
            ">;>;I",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/avee/Common/Func/Func2<",
            "Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;",
            "Landroid/graphics/Bitmap;",
            "Landroid/graphics/Bitmap;",
            ">;)Z"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p4

    move-object/from16 v4, p6

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-nez p3, :cond_1

    .line 435
    iput-object v6, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v1, :cond_0

    .line 436
    iput-object v6, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    :cond_0
    return v5

    .line 440
    :cond_1
    invoke-static/range {p3 .. p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNonPersistentBitmapSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)Landroid/graphics/Bitmap;

    move-result-object v7

    if-nez v7, :cond_3

    .line 442
    iput-object v6, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v1, :cond_2

    .line 443
    iput-object v6, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    :cond_2
    return v5

    :cond_3
    if-eqz v1, :cond_6

    if-eqz v4, :cond_4

    move-object/from16 v8, p7

    .line 453
    invoke-interface {v8, v2, v7}, Lcom/daaw/avee/Common/Func/Func2;->Invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_4
    move-object v8, v6

    :goto_0
    if-eqz v8, :cond_5

    .line 456
    new-instance v15, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;

    new-instance v14, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    const/16 v11, 0x2601

    const/16 v12, 0x2601

    const/16 v13, 0x2901

    const/16 v16, 0x0

    move-object v9, v14

    move-object v10, v8

    move-object v6, v14

    move/from16 v14, v16

    invoke-direct/range {v9 .. v14}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v15, v6, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v15, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    goto :goto_1

    .line 462
    :cond_5
    iput-object v6, v1, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    :goto_1
    if-eqz v8, :cond_6

    if-eq v7, v8, :cond_6

    .line 465
    invoke-virtual {v8}, Landroid/graphics/Bitmap;->recycle()V

    .line 468
    :cond_6
    invoke-virtual/range {p3 .. p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getFramesCount()I

    move-result v1

    const/4 v6, 0x0

    if-le v1, v5, :cond_10

    if-nez p5, :cond_7

    .line 483
    invoke-virtual/range {p3 .. p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->resetCurrentFrame()V

    .line 484
    new-instance v2, Lcom/daaw/avee/Common/Tuple2;

    new-array v4, v1, [Lmdesl/graphics/ITexture;

    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;

    invoke-direct {v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;-><init>()V

    invoke-direct {v2, v4, v7}, Lcom/daaw/avee/Common/Tuple2;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    iput-object v2, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 488
    :cond_7
    iget-object v2, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eqz v2, :cond_8

    .line 489
    iget-object v2, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/avee/Common/Tuple2;

    iget-object v2, v2, Lcom/daaw/avee/Common/Tuple2;->obj2:Ljava/lang/Object;

    check-cast v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;

    goto :goto_2

    :cond_8
    const/4 v2, 0x0

    :goto_2
    if-nez v2, :cond_9

    return v5

    .line 493
    :cond_9
    iget v4, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    if-ge v4, v1, :cond_f

    .line 504
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    if-nez v1, :cond_a

    .line 505
    invoke-virtual/range {p3 .. p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->advanceNextFrame()V

    .line 506
    invoke-virtual/range {p3 .. p3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->getNextFrame2()Lcom/daaw/avee/Common/VAsyncTask2;

    move-result-object v1

    iput-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    .line 509
    :cond_a
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/VAsyncTask2;->isDone()Z

    move-result v1

    if-eqz v1, :cond_e

    .line 514
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    invoke-virtual {v1}, Lcom/daaw/avee/Common/VAsyncTask2;->getResult()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    if-nez v1, :cond_b

    .line 522
    sget-object v1, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/16 v4, 0x20

    invoke-static {v4, v4, v1}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 524
    :cond_b
    new-instance v4, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    sget-object v7, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->bitmapTmp:Lcom/daaw/avee/Common/Ref;

    invoke-static {v1, v6, v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapColorKey(Landroid/graphics/Bitmap;ILcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;

    move-result-object v8

    const/16 v9, 0x2601

    const/16 v10, 0x2601

    const/16 v11, 0x2901

    const/4 v12, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v12}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    .line 530
    iget v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    if-nez v1, :cond_c

    .line 532
    iget-object v1, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, [Lmdesl/graphics/ITexture;

    .line 533
    iget v7, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    aput-object v4, v1, v7

    .line 534
    new-instance v7, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTextureArray;

    invoke-direct {v7, v1, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTextureArray;-><init>([Lmdesl/graphics/ITexture;Z)V

    .line 535
    iput-object v7, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    .line 538
    :cond_c
    iget-object v1, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast v1, Lcom/daaw/avee/Common/Tuple2;

    iget-object v1, v1, Lcom/daaw/avee/Common/Tuple2;->obj1:Ljava/lang/Object;

    check-cast v1, [Lmdesl/graphics/ITexture;

    iget v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    aput-object v4, v1, v3

    .line 539
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    if-eqz v1, :cond_d

    .line 542
    iget v3, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    invoke-virtual {v1, v3, v4}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;->gradualLoadTexture(ILmdesl/graphics/ITexture;)V

    .line 546
    :cond_d
    iget v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    add-int/2addr v1, v5

    iput v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->gradualLoadingIndex:I

    const/4 v1, 0x0

    .line 547
    iput-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->task:Lcom/daaw/avee/Common/VAsyncTask2;

    .line 552
    :cond_e
    iget-object v1, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    iput-object v1, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    return v6

    :cond_f
    const/4 v1, 0x0

    .line 556
    iget-object v2, v2, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$GradualLoadData;->array:Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTextureArray;

    iput-object v2, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    .line 559
    iput-object v1, v3, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    goto :goto_5

    :cond_10
    if-eqz v4, :cond_11

    .line 566
    invoke-interface {v4, v2, v7}, Lcom/daaw/avee/Common/Func/Func2;->Invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/graphics/Bitmap;

    goto :goto_3

    :cond_11
    move-object v1, v7

    :goto_3
    if-eqz v1, :cond_12

    .line 569
    new-instance v2, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;

    new-instance v3, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;

    sget-object v4, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->bitmapTmp:Lcom/daaw/avee/Common/Ref;

    invoke-static {v1, v6, v4}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapColorKey(Landroid/graphics/Bitmap;ILcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;

    move-result-object v4

    const/16 v6, 0x2601

    const/16 v8, 0x2601

    const/16 v9, 0x2901

    const/4 v10, 0x0

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move/from16 p3, v6

    move/from16 p4, v8

    move/from16 p5, v9

    move/from16 p6, v10

    invoke-direct/range {p1 .. p6}, Lcom/daaw/avee/comp/Visualizer/Graphic/VTexture;-><init>(Landroid/graphics/Bitmap;IIIZ)V

    invoke-direct {v2, v3, v5}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasFlippedTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    iput-object v2, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    goto :goto_4

    :cond_12
    const/4 v2, 0x0

    .line 575
    iput-object v2, v0, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    :goto_4
    if-eqz v1, :cond_13

    if-eq v7, v1, :cond_13

    .line 578
    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_13
    :goto_5
    return v5
.end method

.method private invokeMarkNeedReCreateGLResources()V
    .locals 1

    .line 270
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->markNeedReCreateGLResources()V

    .line 271
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onNeedReCreateGLResources:Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader$IOnNeedReCreateGLResources;->markNeedReCreateGLResources()V

    return-void
.end method

.method private static processBitmapColorKey(Landroid/graphics/Bitmap;ILcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "I",
            "Lcom/daaw/avee/Common/Ref<",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    return-object p0
.end method


# virtual methods
.method clearTex1()V
    .locals 1

    .line 781
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->dispose()V

    :cond_0
    const/4 v0, 0x0

    .line 782
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void
.end method

.method clearTex2()V
    .locals 1

    .line 787
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;->dispose()V

    :cond_0
    const/4 v0, 0x0

    .line 788
    iput-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-void
.end method

.method protected createAlbumArtResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;I)Z
    .locals 10

    if-nez p2, :cond_0

    .line 395
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->clearTex1()V

    const/4 p1, 0x1

    return p1

    .line 404
    :cond_0
    new-instance v8, Lcom/daaw/avee/Common/Ref;

    const/4 v0, 0x0

    invoke-direct {v8, v0}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 405
    new-instance v9, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v9, v0}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 406
    iget-object v4, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->gradualLoadingTextures:Lcom/daaw/avee/Common/Ref;

    iget-object v6, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapCb:Lcom/daaw/avee/Common/Func/Func2;

    iget-object v7, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->processBitmapSecondaryCb:Lcom/daaw/avee/Common/Func/Func2;

    move-object v0, v8

    move-object v1, v9

    move-object v2, p1

    move-object v3, p2

    move v5, p3

    invoke-static/range {v0 .. v7}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTextureFromImageResult(Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;Lcom/daaw/avee/Common/Ref;ILcom/daaw/avee/Common/Func/Func2;Lcom/daaw/avee/Common/Func/Func2;)Z

    move-result p1

    .line 407
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iget-object p3, v8, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    if-eq p2, p3, :cond_1

    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->clearTex1()V

    .line 408
    :cond_1
    iget-object p2, v8, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    .line 409
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->clearTex2()V

    .line 410
    iget-object p2, v9, Lcom/daaw/avee/Common/Ref;->obj:Ljava/lang/Object;

    check-cast p2, Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    iput-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return p1
.end method

.method public getAlbumArtGenerateHint()I
    .locals 1

    .line 127
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtGenerateHint:I

    return v0
.end method

.method public getColorKeyEnabled()Z
    .locals 1

    .line 185
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyEnabled:Z

    return v0
.end method

.method public getColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;
    .locals 1

    .line 220
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    return-object v0
.end method

.method public getCustomImagePath()Ljava/lang/String;
    .locals 1

    .line 172
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    return-object v0
.end method

.method public getGeneratedAlbumArtColor()I
    .locals 1

    .line 138
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->generatedAlbumArtColor:I

    return v0
.end method

.method public getKeepAspectRatioAndCropToFit()Z
    .locals 1

    .line 149
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->keepAspectRatioAndCropToFit:Z

    return v0
.end method

.method public getTexture(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 2

    .line 793
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    if-lez v0, :cond_1

    .line 794
    invoke-virtual {p1, v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->getCompositionResult(I)Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;

    move-result-object v0

    if-nez v0, :cond_0

    .line 796
    iget-object p1, p1, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->getAtlasTexWhite()Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    move-result-object p1

    return-object p1

    .line 798
    :cond_0
    new-instance p1, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;

    invoke-virtual {v0}, Lcom/daaw/avee/comp/Visualizer/Graphic/VFrameBuffer;->getTexture()Lmdesl/graphics/Texture;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lcom/daaw/avee/comp/Visualizer/Graphic/AtlasTexture;-><init>(Lmdesl/graphics/ITexture;Z)V

    return-object p1

    .line 800
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex1:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-object p1
.end method

.method public getTextureSecondary(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;
    .locals 0

    .line 806
    iget p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    if-lez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 809
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->atlasTex2:Lcom/daaw/avee/comp/Visualizer/Graphic/IAtlasTexture;

    return-object p1
.end method

.method public markNeedReCreateGLResources()V
    .locals 1

    const/4 v0, 0x0

    .line 276
    iput v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    return-void
.end method

.method public onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 246
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    if-eqz p2, :cond_0

    iget-object p2, p2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    invoke-static {p3, p2}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 247
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object p2, p2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    invoke-static {p3, p2}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 248
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object p2, p2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    invoke-static {p4, p2}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 250
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    .line 254
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-static {p2}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    .line 255
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    const/4 p1, 0x2

    .line 256
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    :cond_0
    return-void
.end method

.method public onCreateGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Landroid/graphics/RectF;I)Z
    .locals 17

    move-object/from16 v0, p0

    .line 303
    iget v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    const/4 v2, 0x1

    if-nez v1, :cond_2

    .line 304
    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-static {v1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    const/4 v1, 0x0

    .line 305
    iput-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    .line 307
    iput v2, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    .line 310
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    if-nez v3, :cond_0

    .line 317
    invoke-direct/range {p0 .. p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    .line 320
    iget-object v3, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-static {v3}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    .line 321
    iput-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    const/4 v1, 0x2

    .line 322
    iput v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    goto :goto_1

    :cond_0
    move-object/from16 v3, p1

    .line 326
    iget-object v3, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->res:Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;

    iget-object v3, v3, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState$RenderResources;->visualizationData:Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;

    new-instance v15, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v5, v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v6, v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v7, v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    iget-object v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v8, v4, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->keepAspectRatioAndCropToFit:Z

    xor-int/lit8 v9, v4, 0x1

    .line 334
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-int v10, v4

    .line 335
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-int v11, v4

    .line 336
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->width()F

    move-result v4

    float-to-int v12, v4

    .line 337
    invoke-virtual/range {p2 .. p2}, Landroid/graphics/RectF;->height()F

    move-result v4

    float-to-int v13, v4

    iget v14, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtGenerateHint:I

    iget v4, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->generatedAlbumArtColor:I

    iget-boolean v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyEnabled:Z

    if-eqz v1, :cond_1

    iget-object v1, v0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    move-object/from16 v16, v1

    move v1, v4

    goto :goto_0

    :cond_1
    move v1, v4

    const/16 v16, 0x0

    :goto_0
    move-object v4, v15

    move-object v2, v15

    move v15, v1

    invoke-direct/range {v4 .. v16}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIIIIIILcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    .line 326
    invoke-interface {v3, v0, v2}, Lcom/daaw/avee/comp/Visualizer/InternalVisualizationDataProvider;->onRequestAlbumArtPathAndBitmap(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest2;)V

    :cond_2
    :goto_1
    const/4 v1, 0x1

    return v1
.end method

.method public onCreateGradualGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;I)Z
    .locals 2

    .line 352
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 355
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-virtual {p0, p1, v0, p2}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->createAlbumArtResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lcom/daaw/avee/comp/AlbumArt/ImageResult;I)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x3

    .line 356
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    .line 357
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-static {p1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;->closeSafe(Lcom/daaw/avee/comp/AlbumArt/ImageResult;)V

    const/4 p1, 0x0

    .line 358
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageResult:Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method public onDestroyGLResources(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;)V
    .locals 0

    .line 293
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->clearTex1()V

    .line 294
    invoke-virtual {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->clearTex2()V

    return-void
.end method

.method public onEarlyUpdate(Lcom/daaw/avee/comp/Visualizer/Graphic/IRenderState;Lmdesl/graphics/glutils/FrameBuffer;Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;)V
    .locals 0

    .line 367
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    if-lez p2, :cond_0

    .line 368
    invoke-interface {p3, p2}, Lcom/daaw/avee/comp/Visualizer/ICompositionDependencies;->addDependencyCompositionIndex(I)V

    .line 374
    :cond_0
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p2

    if-gtz p2, :cond_3

    :cond_1
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    if-gtz p2, :cond_3

    .line 375
    iget-object p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRequestValueForNullCb:Lcom/daaw/avee/Common/Func/Func1;

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setResPicturePath(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;)V

    :cond_3
    return-void
.end method

.method public onRender(Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;Lmdesl/graphics/glutils/FrameBuffer;)V
    .locals 1

    .line 385
    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->loadState:I

    const/4 v0, 0x3

    if-eq p2, v0, :cond_0

    iget p2, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    if-gtz p2, :cond_0

    .line 388
    invoke-virtual {p1}, Lcom/daaw/avee/comp/Visualizer/Graphic/RenderState;->frameResourcesLoadingAdd()V

    :cond_0
    return-void
.end method

.method public setAlbumArtGenerateHint(I)V
    .locals 1

    .line 119
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtGenerateHint:I

    if-ne v0, p1, :cond_0

    return-void

    .line 120
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtGenerateHint:I

    .line 122
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setColorAutoDetect(Z)V
    .locals 1

    .line 189
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iget-boolean v0, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 190
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput-boolean p1, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->autoDetect:Z

    .line 191
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setColorKeyColorKey(I)V
    .locals 1

    .line 195
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iget v0, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    if-ne v0, p1, :cond_0

    return-void

    .line 196
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput p1, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->colorKey:I

    .line 197
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setColorKeyEnabled(Z)V
    .locals 1

    .line 177
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyEnabled:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 178
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyEnabled:Z

    .line 180
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setColorKeyOpacityStrength(F)V
    .locals 1

    .line 207
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iget v0, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 208
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput p1, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->opacityStrength:F

    .line 209
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setColorKeyParams()Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;
    .locals 1

    .line 214
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    .line 215
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    return-object v0
.end method

.method public setColorKeyTransparencyStrength(F)V
    .locals 1

    .line 201
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iget v0, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    cmpl-float v0, v0, p1

    if-nez v0, :cond_0

    return-void

    .line 202
    :cond_0
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput p1, v0, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->transparencyStrength:F

    .line 203
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setCustomImage(Ljava/lang/String;)V
    .locals 3

    .line 154
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    .line 155
    invoke-static {p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Composition;->getIndexFromStringPath(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->referenceComposition:I

    const/4 v0, 0x0

    if-lez p1, :cond_0

    .line 158
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setResPicturePath(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;)V

    return-void

    .line 162
    :cond_0
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 163
    new-instance p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    iget-object v1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->customImagePath:Ljava/lang/String;

    const-string v2, ""

    invoke-direct {p1, v0, v1, v2, v2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;-><init>(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    invoke-virtual {p0, p1}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setResPicturePath(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;)V

    goto :goto_0

    .line 166
    :cond_1
    iget-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->onRequestValueForNullCb:Lcom/daaw/avee/Common/Func/Func1;

    if-eqz p1, :cond_2

    invoke-interface {p1, v0}, Lcom/daaw/avee/Common/Func/Func1;->onInvoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    :cond_2
    invoke-virtual {p0, v0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->setResPicturePath(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;)V

    :goto_0
    return-void
.end method

.method public setGeneratedAlbumArtColor(I)V
    .locals 1

    .line 131
    iget v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->generatedAlbumArtColor:I

    if-ne v0, p1, :cond_0

    return-void

    .line 132
    :cond_0
    iput p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->generatedAlbumArtColor:I

    .line 133
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setKeepAspectRatioAndCropToFit(Z)V
    .locals 1

    .line 142
    iget-boolean v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->keepAspectRatioAndCropToFit:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 143
    :cond_0
    iput-boolean p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->keepAspectRatioAndCropToFit:Z

    .line 145
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setResPicturePath(Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;)V
    .locals 2

    if-nez p1, :cond_0

    .line 225
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    if-nez v0, :cond_0

    return-void

    :cond_0
    if-eqz p1, :cond_1

    .line 227
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    if-eqz v0, :cond_1

    .line 228
    iget-object v0, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->videoThumbDataSource:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 229
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v0, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path0:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 230
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v0, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->path1:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 231
    iget-object v0, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    iget-object v0, v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    iget-object v1, p1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;->genStr:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/daaw/avee/Common/Utils;->compareNullStrings(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 239
    :cond_1
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->albumArtRequest:Lcom/daaw/avee/comp/AlbumArt/AlbumArtRequest;

    .line 241
    invoke-direct {p0}, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->invokeMarkNeedReCreateGLResources()V

    return-void
.end method

.method public setUserObject1(Ljava/lang/Object;)V
    .locals 0

    .line 264
    iput-object p1, p0, Lcom/daaw/avee/comp/Visualizer/Elements/Base/ElementImageLoader;->imageLoadStrongReference:Ljava/lang/Object;

    return-void
.end method
