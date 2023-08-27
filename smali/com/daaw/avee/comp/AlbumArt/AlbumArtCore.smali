.class public Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;,
        Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;,
        Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;,
        Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;
    }
.end annotation


# static fields
.field public static final THUMB_FROM_RESOLVER:Z

.field private static final createInstanceLock:Ljava/lang/Object;

.field private static drawableBg:Landroid/graphics/drawable/Drawable;

.field private static volatile instanceWeak:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;",
            ">;"
        }
    .end annotation
.end field

.field public static onRequestLocalFolder:Lcom/daaw/avee/Common/Events/WeakEventR1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/avee/Common/Events/WeakEventR1<",
            "Ljava/lang/Object;",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 73
    sget-boolean v0, Lcom/daaw/avee/Common/Utils;->PRE_Q:Z

    xor-int/lit8 v0, v0, 0x1

    sput-boolean v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->THUMB_FROM_RESOLVER:Z

    .line 75
    new-instance v0, Lcom/daaw/avee/Common/Events/WeakEventR1;

    invoke-direct {v0}, Lcom/daaw/avee/Common/Events/WeakEventR1;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onRequestLocalFolder:Lcom/daaw/avee/Common/Events/WeakEventR1;

    .line 77
    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->createInstanceLock:Ljava/lang/Object;

    .line 78
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 80
    sput-object v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->drawableBg:Landroid/graphics/drawable/Drawable;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$000(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadAlbumArtFromTags(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$100(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Ljava/lang/String;ZLjava/lang/String;IIII)Landroid/graphics/Bitmap;
    .locals 0

    .line 71
    invoke-direct/range {p0 .. p7}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadVideoThumbOrGenerate(Ljava/lang/String;ZLjava/lang/String;IIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;
    .locals 0

    .line 71
    invoke-direct {p0, p1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getMyPicasso(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$300(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
    .locals 0

    .line 71
    invoke-static/range {p0 .. p5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    return-void
.end method

.method public static createInstance(Landroid/content/Context;)Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;
    .locals 2

    .line 433
    sget-object p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {p0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    if-eqz p0, :cond_0

    return-object p0

    .line 436
    :cond_0
    sget-object p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->createInstanceLock:Ljava/lang/Object;

    monitor-enter p0

    .line 437
    :try_start_0
    sget-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    if-nez v0, :cond_1

    .line 439
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    invoke-direct {v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;-><init>()V

    .line 440
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    .line 443
    :cond_1
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    .line 444
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private getBitmapPool(Landroid/content/Context;)Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;
    .locals 0

    .line 448
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->get(Landroid/content/Context;)Lcom/bumptech/glide/Glide;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/Glide;->getBitmapPool()Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    move-result-object p1

    return-object p1
.end method

.method private getDecoder(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/ResourceDecoder;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
            ")",
            "Lcom/bumptech/glide/load/ResourceDecoder<",
            "Lcom/bumptech/glide/load/model/ImageVideoWrapper;",
            "Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;",
            ">;"
        }
    .end annotation

    .line 453
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/ImageVideoBitmapDecoder;

    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/StreamBitmapDecoder;

    sget-object v2, Lcom/bumptech/glide/load/DecodeFormat;->PREFER_ARGB_8888:Lcom/bumptech/glide/load/DecodeFormat;

    invoke-direct {v1, p2, v2}, Lcom/bumptech/glide/load/resource/bitmap/StreamBitmapDecoder;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/bumptech/glide/load/DecodeFormat;)V

    new-instance v2, Lcom/bumptech/glide/load/resource/bitmap/FileDescriptorBitmapDecoder;

    sget-object v3, Lcom/bumptech/glide/load/DecodeFormat;->PREFER_ARGB_8888:Lcom/bumptech/glide/load/DecodeFormat;

    invoke-direct {v2, p2, v3}, Lcom/bumptech/glide/load/resource/bitmap/FileDescriptorBitmapDecoder;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/bumptech/glide/load/DecodeFormat;)V

    invoke-direct {v0, v1, v2}, Lcom/bumptech/glide/load/resource/bitmap/ImageVideoBitmapDecoder;-><init>(Lcom/bumptech/glide/load/ResourceDecoder;Lcom/bumptech/glide/load/ResourceDecoder;)V

    .line 456
    new-instance v1, Lcom/bumptech/glide/load/resource/gif/GifResourceDecoder;

    invoke-direct {v1, p1, p2}, Lcom/bumptech/glide/load/resource/gif/GifResourceDecoder;-><init>(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V

    .line 457
    new-instance p1, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperResourceDecoder;

    invoke-direct {p1, v0, v1, p2}, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperResourceDecoder;-><init>(Lcom/bumptech/glide/load/ResourceDecoder;Lcom/bumptech/glide/load/ResourceDecoder;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V

    return-object p1
.end method

.method public static getInstance()Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;
    .locals 1

    .line 428
    sget-object v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->instanceWeak:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/avee/comp/AlbumArt/IAlbumArtCore;

    return-object v0
.end method

.method private getMyPicasso(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;
    .locals 0

    .line 463
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->with(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    return-object p1
.end method

.method private loadASyncAlbumArtLarge2(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V
    .locals 25

    move-object/from16 v12, p0

    move-object/from16 v13, p3

    move-object/from16 v14, p7

    move/from16 v0, p8

    move/from16 v15, p9

    move-object/from16 v10, p16

    .line 749
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v11

    if-nez v11, :cond_0

    return-void

    .line 754
    :cond_0
    invoke-virtual/range {p2 .. p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    move-object/from16 v1, p2

    .line 755
    invoke-direct {v12, v11, v1, v0, v15}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadFromResolver(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 757
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-direct {v0, v1}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;-><init>(Landroid/graphics/Bitmap;)V

    move-object/from16 v8, p4

    invoke-interface {v14, v0, v9, v13, v8}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    move-object/from16 v8, p4

    .line 761
    invoke-direct {v12, v9}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->shouldTryLoadFromMp3Tags(Ljava/lang/String;)Z

    move-result v16

    .line 770
    new-instance v7, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;

    move-object v1, v7

    move-object/from16 v2, p0

    move-object/from16 v3, p7

    move-object v4, v9

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object v0, v7

    move-object/from16 v7, p15

    move/from16 v8, p8

    move-object/from16 v17, v9

    move/from16 v9, p9

    invoke-direct/range {v1 .. v9}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$1;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;II)V

    .line 830
    invoke-interface {v14, v0}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->setUserObject1(Ljava/lang/Object;)V

    and-int/lit8 v1, p12, 0x4

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    :goto_0
    const-string v8, "file://"

    if-eqz v1, :cond_3

    move-object/from16 v18, v8

    goto :goto_1

    :cond_3
    move-object/from16 v18, v13

    .line 836
    :goto_1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    if-ne v1, v3, :cond_4

    const/16 v19, 0x1

    goto :goto_2

    :cond_4
    const/16 v19, 0x0

    .line 838
    :goto_2
    invoke-direct {v12, v11}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getBitmapPool(Landroid/content/Context;)Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    move-result-object v20

    .line 846
    invoke-static/range {v18 .. v18}, Lcom/daaw/avee/comp/AlbumArt/InternalBitmapLoader;->getResIdFromPath(Ljava/lang/String;)I

    move-result v1

    const/16 v7, 0x2f

    const/4 v6, 0x0

    if-lez v1, :cond_5

    .line 849
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x1

    const/4 v10, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v20

    move-object v5, v11

    move/from16 v6, p14

    move-object/from16 v7, v17

    move-object/from16 v22, v8

    move v8, v10

    const/4 v10, 0x0

    move-object/from16 v9, p5

    move/from16 v10, p12

    move-object/from16 v23, v11

    move/from16 v11, p13

    invoke-virtual/range {v1 .. v11}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromUri(Ljava/lang/Integer;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v6

    .line 850
    invoke-virtual {v6}, Lcom/bumptech/glide/DrawableRequestBuilder;->dontAnimate()Lcom/bumptech/glide/DrawableRequestBuilder;

    move-object/from16 v1, v18

    move-object/from16 v24, v22

    const/16 v21, 0x0

    goto/16 :goto_5

    :cond_5
    move-object/from16 v22, v8

    move-object/from16 v23, v11

    if-eqz v18, :cond_9

    .line 852
    invoke-virtual/range {v18 .. v18}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_9

    .line 854
    invoke-static/range {v18 .. v18}, Lcom/daaw/avee/comp/AlbumArt/LocalBitmapLoader;->getFileNameFromPath(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v10, :cond_9

    if-eqz v1, :cond_9

    .line 857
    sget-object v2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onRequestLocalFolder:Lcom/daaw/avee/Common/Events/WeakEventR1;

    const/4 v11, 0x0

    invoke-virtual {v2, v10, v11}, Lcom/daaw/avee/Common/Events/WeakEventR1;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Ljava/io/File;

    if-eqz v6, :cond_6

    goto :goto_3

    :cond_6
    move-object v6, v11

    .line 860
    :goto_3
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v6, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 862
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 865
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_8

    const/4 v10, 0x0

    .line 866
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v9, 0x2f

    if-ne v2, v9, :cond_7

    .line 867
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v8, v22

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_4

    :cond_7
    move-object/from16 v8, v22

    goto :goto_4

    :cond_8
    move-object/from16 v8, v22

    const/16 v9, 0x2f

    const/4 v10, 0x0

    :goto_4
    move-object/from16 v18, v1

    .line 871
    invoke-static/range {v18 .. v18}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    const/4 v3, 0x1

    const/16 v21, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v20

    move-object/from16 v5, v23

    move/from16 v6, p14

    move-object/from16 v7, v17

    move-object/from16 v24, v8

    move/from16 v8, v21

    move-object/from16 v9, p5

    move/from16 v10, p12

    move-object/from16 v21, v11

    move/from16 v11, p13

    .line 872
    invoke-virtual/range {v1 .. v11}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromUri(Landroid/net/Uri;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v6

    .line 873
    invoke-virtual {v6}, Lcom/bumptech/glide/DrawableRequestBuilder;->dontAnimate()Lcom/bumptech/glide/DrawableRequestBuilder;

    move-object/from16 v1, v18

    goto :goto_5

    :cond_9
    move-object/from16 v24, v22

    const/16 v21, 0x0

    move-object/from16 v1, v18

    move-object/from16 v6, v21

    :goto_5
    if-nez v6, :cond_e

    if-eqz v1, :cond_a

    .line 882
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_a

    const/4 v2, 0x0

    .line 883
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_a

    .line 884
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v2, v24

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_6

    :cond_a
    move-object/from16 v2, v24

    :goto_6
    move-object v8, v1

    if-eqz v8, :cond_b

    .line 893
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v1

    if-gtz v1, :cond_c

    :cond_b
    move-object v8, v2

    .line 897
    :cond_c
    invoke-static {v8}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    if-eqz v16, :cond_d

    const/4 v2, 0x1

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move-object/from16 v3, v20

    move-object/from16 v4, v23

    move/from16 v5, p14

    move-object/from16 v6, v17

    move-object/from16 v8, p5

    move/from16 v9, p12

    move/from16 v10, p13

    .line 901
    invoke-virtual/range {v1 .. v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromMp3Tags(ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v1

    goto :goto_7

    :cond_d
    const/4 v3, 0x1

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object/from16 v4, v20

    move-object/from16 v5, v23

    move/from16 v6, p14

    move-object/from16 v7, v17

    move-object/from16 v9, p5

    move/from16 v10, p12

    move/from16 v11, p13

    .line 903
    invoke-virtual/range {v1 .. v11}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromUri(Landroid/net/Uri;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v1

    :goto_7
    move-object v6, v1

    .line 904
    invoke-virtual {v6}, Lcom/bumptech/glide/DrawableRequestBuilder;->dontAnimate()Lcom/bumptech/glide/DrawableRequestBuilder;

    :cond_e
    if-eqz v19, :cond_f

    .line 936
    invoke-virtual {v6, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    goto :goto_9

    :cond_f
    if-eqz p1, :cond_10

    move/from16 v0, p8

    .line 948
    :try_start_0
    invoke-virtual {v6, v0, v15}, Lcom/bumptech/glide/DrawableRequestBuilder;->into(II)Lcom/bumptech/glide/request/FutureTarget;

    move-result-object v0

    const-wide/16 v1, 0x5dc

    .line 949
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Lcom/bumptech/glide/request/FutureTarget;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_8

    :catch_0
    move-exception v0

    .line 951
    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    move-object/from16 v0, v21

    :goto_8
    move-object/from16 p5, p7

    move-object/from16 p6, v0

    move-object/from16 p7, v17

    move-object/from16 p8, p3

    move-object/from16 p9, p4

    move-object/from16 p10, p15

    .line 954
    invoke-static/range {p5 .. p10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    goto :goto_9

    :cond_10
    move/from16 v0, p8

    .line 961
    new-instance v1, Lcom/daaw/avee/Common/VAsyncTask;

    new-instance v2, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;

    invoke-direct {v2, v12, v6, v0, v15}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$2;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/DrawableRequestBuilder;II)V

    invoke-direct {v1, v2}, Lcom/daaw/avee/Common/VAsyncTask;-><init>(Lcom/daaw/avee/Common/VAsyncTask$TaskListener;)V

    .line 1005
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;

    move-object/from16 p8, v0

    move-object/from16 p9, p0

    move-object/from16 p10, p7

    move-object/from16 p11, v17

    move-object/from16 p12, p3

    move-object/from16 p13, p4

    move-object/from16 p14, p15

    invoke-direct/range {p8 .. p14}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$3;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V

    invoke-virtual {v1, v0}, Lcom/daaw/avee/Common/VAsyncTask;->RunParallel(Lcom/daaw/avee/Common/VAsyncTask$ResultListener;)V

    :goto_9
    return-void
.end method

.method private loadAlbumArtFromTags(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 2

    const/4 v0, 0x0

    .line 1113
    :try_start_0
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 1115
    new-instance v1, Lcom/mpatric/mp3agic/Mp3File;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/mpatric/mp3agic/Mp3File;-><init>(Ljava/lang/String;)V

    .line 1116
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/Mp3File;->hasId3v2Tag()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1117
    invoke-virtual {v1}, Lcom/mpatric/mp3agic/Mp3File;->getId3v2Tag()Lcom/mpatric/mp3agic/ID3v2;

    move-result-object p1

    .line 1118
    invoke-interface {p1}, Lcom/mpatric/mp3agic/ID3v2;->getAlbumImage()[B

    move-result-object v1

    if-eqz v1, :cond_0

    .line 1121
    invoke-interface {p1}, Lcom/mpatric/mp3agic/ID3v2;->getAlbumImageMimeType()Ljava/lang/String;

    .line 1122
    new-instance p1, Ljava/io/ByteArrayInputStream;

    invoke-direct {p1, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v0, p1

    goto :goto_0

    :catch_0
    move-exception p1

    .line 1134
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_0
    :goto_0
    return-object v0
.end method

.method private loadFromResolver(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;
    .locals 5

    .line 561
    sget-boolean v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->THUMB_FROM_RESOLVER:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    const/4 v0, 0x0

    const/4 v2, 0x1

    if-ge p3, v2, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-ge p4, v2, :cond_1

    const/4 v0, 0x1

    :cond_1
    if-nez v0, :cond_2

    if-eqz v3, :cond_3

    :cond_2
    const-string v2, "Dimensions were too small"

    .line 564
    invoke-static {v2}, Lcom/daaw/avee/Common/tlog;->w(Ljava/lang/String;)V

    .line 566
    :cond_3
    new-instance v2, Landroid/util/Size;

    const/16 v4, 0xc8

    if-eqz v3, :cond_4

    const/16 p3, 0xc8

    :cond_4
    if-eqz v0, :cond_5

    const/16 p4, 0xc8

    :cond_5
    invoke-direct {v2, p3, p4}, Landroid/util/Size;-><init>(II)V

    .line 568
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    invoke-virtual {p1, p2, v2, v1}, Landroid/content/ContentResolver;->loadThumbnail(Landroid/net/Uri;Landroid/util/Size;Landroid/os/CancellationSignal;)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, ""

    .line 570
    invoke-static {p1, p2}, Lcom/daaw/avee/Common/tlog;->e(Ljava/lang/Exception;Ljava/lang/String;)V

    :cond_6
    return-object v1
.end method

.method private loadVideoThumbOrGenerate(Ljava/lang/String;ZLjava/lang/String;IIII)Landroid/graphics/Bitmap;
    .locals 14

    move-object/from16 v2, p3

    .line 1142
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    and-int/lit8 v1, p6, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v5, p6, 0x4

    if-eqz v5, :cond_1

    const/4 v5, 0x1

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x2

    and-int/lit8 v7, p6, 0x2

    if-eqz v7, :cond_2

    const/4 v7, 0x1

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    const/4 v8, 0x3

    if-nez v5, :cond_4

    if-eqz v0, :cond_4

    .line 1161
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    .line 1162
    invoke-static {v0}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameExt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v9, "mp3"

    .line 1163
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "wav"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_4

    const-string v9, "ogg"

    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    if-eqz p2, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x3

    .line 1164
    :goto_3
    invoke-static {v0, v5}, Lcom/AOSP/MyThumbnailUtils;->createVideoThumbnail(Ljava/lang/String;I)Landroid/graphics/Bitmap;

    move-result-object v0

    if-eqz v0, :cond_4

    return-object v0

    :cond_4
    if-eqz v2, :cond_8

    .line 1181
    invoke-virtual/range {p3 .. p3}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_8

    new-array v0, v8, [F

    move/from16 v5, p7

    .line 1185
    invoke-static {v5, v0}, Landroidx/core/graphics/ColorUtils;->colorToHSL(I[F)V

    .line 1186
    aget v9, v0, v6

    const v10, 0x3f7d70a4    # 0.99f

    const/high16 v11, 0x3f800000    # 1.0f

    cmpl-float v9, v9, v10

    if-lez v9, :cond_5

    aput v11, v0, v4

    .line 1187
    :cond_5
    invoke-static/range {p7 .. p7}, Landroid/graphics/Color;->alpha(I)I

    move-result v5

    .line 1189
    invoke-virtual {v2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v9

    .line 1190
    invoke-static {v9}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->valueInAlphabet(C)F

    move-result v9

    const/high16 v10, 0x43b40000    # 360.0f

    mul-float v9, v9, v10

    const/4 v10, 0x0

    if-eqz v1, :cond_6

    const/high16 v1, 0x41700000    # 15.0f

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    add-float/2addr v9, v1

    float-to-int v1, v9

    add-int/lit8 v1, v1, 0x1e

    .line 1192
    rem-int/lit16 v1, v1, 0x168

    new-array v12, v8, [F

    add-float/2addr v10, v9

    aput v10, v12, v3

    const v10, 0x3e4ccccd    # 0.2f

    aput v10, v12, v4

    aput v11, v12, v6

    new-array v10, v8, [F

    aput v9, v10, v3

    const v9, 0x3f666666    # 0.9f

    aput v9, v10, v4

    const v11, 0x3f19999a    # 0.6f

    .line 1197
    aget v13, v0, v6

    mul-float v13, v13, v11

    aput v13, v10, v6

    new-array v8, v8, [F

    int-to-float v1, v1

    aput v1, v8, v3

    aput v9, v8, v4

    const v1, 0x3ecccccd    # 0.4f

    .line 1198
    aget v0, v0, v6

    mul-float v0, v0, v1

    aput v0, v8, v6

    .line 1205
    invoke-static {v12}, Landroidx/core/graphics/ColorUtils;->HSLToColor([F)I

    move-result v0

    if-eqz v7, :cond_7

    goto :goto_5

    :cond_7
    const/16 v3, 0xff

    :goto_5
    invoke-static {v0, v3}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v3

    .line 1206
    invoke-static {v10}, Landroidx/core/graphics/ColorUtils;->HSLToColor([F)I

    move-result v0

    invoke-static {v0, v5}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v4

    .line 1207
    invoke-static {v8}, Landroidx/core/graphics/ColorUtils;->HSLToColor([F)I

    move-result v0

    invoke-static {v0, v5}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    move-result v5

    sget-object v6, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->drawableBg:Landroid/graphics/drawable/Drawable;

    move/from16 v0, p4

    move/from16 v1, p5

    move-object/from16 v2, p3

    .line 1202
    invoke-static/range {v0 .. v6}, Lcom/daaw/avee/comp/AlbumArt/SimpleTextAlbumArtCreator;->textAsBitmap(IILjava/lang/String;IIILandroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0

    :cond_8
    const/4 v0, 0x0

    return-object v0
.end method

.method private static onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const/4 v5, 0x0

    if-nez v1, :cond_0

    .line 1020
    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    invoke-direct {v1, v5}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;-><init>(Landroid/graphics/Bitmap;)V

    invoke-interface {v0, v1, v2, v3, v4}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1024
    :cond_0
    instance-of v6, v1, Lcom/bumptech/glide/load/resource/bitmap/GlideBitmapDrawable;

    if-eqz v6, :cond_1

    .line 1025
    check-cast v1, Lcom/bumptech/glide/load/resource/bitmap/GlideBitmapDrawable;

    .line 1029
    new-instance v6, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v6, v5}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 1030
    new-instance v7, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v7, v5}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 1031
    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/bitmap/GlideBitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v1

    move-object/from16 v11, p5

    invoke-static {v1, v11, v7, v6}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->processBitmapColorKey(Landroid/graphics/Bitmap;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1033
    new-instance v5, Lcom/daaw/avee/comp/AlbumArt/ImageResult;

    new-instance v8, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;

    invoke-direct {v8, v6, v7}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$4;-><init>(Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V

    invoke-direct {v5, v1, v8}, Lcom/daaw/avee/comp/AlbumArt/ImageResult;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/avee/Common/Action;)V

    invoke-interface {v0, v5, v2, v3, v4}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    move-object/from16 v11, p5

    .line 1042
    instance-of v6, v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    if-eqz v6, :cond_2

    .line 1045
    check-cast v1, Lcom/bumptech/glide/load/resource/gif/GifDrawable;

    .line 1046
    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getDecoder()Lcom/bumptech/glide/gifdecoder/GifDecoder;

    move-result-object v10

    .line 1056
    new-instance v6, Ljava/lang/Object;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1058
    new-instance v7, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v7, v5}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 1059
    new-instance v14, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v14, v5}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 1061
    new-instance v5, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;

    invoke-virtual {v1}, Lcom/bumptech/glide/load/resource/gif/GifDrawable;->getFirstFrame()Landroid/graphics/Bitmap;

    move-result-object v16

    new-instance v1, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;

    invoke-direct {v1, v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$5;-><init>(Lcom/bumptech/glide/gifdecoder/GifDecoder;)V

    new-instance v15, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$6;

    invoke-direct {v15, v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$6;-><init>(Lcom/bumptech/glide/gifdecoder/GifDecoder;)V

    new-instance v13, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$7;

    invoke-direct {v13, v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$7;-><init>(Lcom/bumptech/glide/gifdecoder/GifDecoder;)V

    new-instance v20, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;

    move-object/from16 v8, v20

    move-object v9, v6

    move-object/from16 v11, p5

    move-object v12, v14

    move-object/from16 v19, v13

    move-object v13, v7

    invoke-direct/range {v8 .. v13}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;-><init>(Ljava/lang/Object;Lcom/bumptech/glide/gifdecoder/GifDecoder;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V

    new-instance v8, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;

    invoke-direct {v8, v6, v7, v14}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$9;-><init>(Ljava/lang/Object;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V

    move-object v6, v15

    move-object v15, v5

    move-object/from16 v17, v1

    move-object/from16 v18, v6

    move-object/from16 v21, v8

    invoke-direct/range {v15 .. v21}, Lcom/daaw/avee/comp/AlbumArt/ImageSequenceResult;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action;Lcom/daaw/avee/Common/Action;Lcom/daaw/avee/Common/Func/Func;Lcom/daaw/avee/Common/Action;)V

    .line 1100
    invoke-interface {v0, v5, v2, v3, v4}, Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;->onBitmapLoaded(Lcom/daaw/avee/comp/AlbumArt/ImageResult;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    :goto_0
    return-void
.end method

.method private shouldTryLoadFromMp3Tags(Ljava/lang/String;)Z
    .locals 1

    if-eqz p1, :cond_0

    .line 472
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 474
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 476
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p1

    .line 477
    invoke-static {p1}, Lcom/daaw/avee/Common/UtilsFileSys;->extractFilenameExt(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "mp3"

    .line 478
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public cancelRequest(Landroid/widget/ImageView;)V
    .locals 0

    .line 467
    invoke-static {p1}, Lcom/bumptech/glide/Glide;->clear(Landroid/view/View;)V

    return-void
.end method

.method public loadAlbumArt(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/widget/ImageView;ZZZ)V
    .locals 13

    move-object v11, p0

    move-object v0, p2

    move-object/from16 v12, p5

    .line 495
    invoke-static {}, Lcom/daaw/avee/PlayerCore;->s()Lcom/daaw/avee/PlayerCore;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/avee/PlayerCore;->getAppContext()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    .line 500
    :cond_0
    invoke-virtual/range {p5 .. p5}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    invoke-virtual/range {p5 .. p5}, Landroid/widget/ImageView;->getHeight()I

    move-result v2

    move-object v3, p1

    invoke-direct {p0, v4, p1, v1, v2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadFromResolver(Landroid/content/Context;Landroid/net/Uri;II)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 502
    invoke-virtual {v12, v1}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    return-void

    .line 506
    :cond_1
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 508
    invoke-direct {p0, v6}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->shouldTryLoadFromMp3Tags(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "file://"

    if-eqz v0, :cond_2

    .line 511
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2

    const/4 v3, 0x0

    .line 512
    invoke-virtual {p2, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v5, 0x2f

    if-ne v3, v5, :cond_2

    .line 513
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    move-object v2, v0

    .line 524
    :goto_0
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v2

    .line 526
    invoke-direct {p0, v4}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getBitmapPool(Landroid/content/Context;)Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    move-result-object v3

    if-eqz v1, :cond_4

    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, -0x1

    move-object v0, p0

    move/from16 v1, p6

    move-object v2, v3

    move-object v3, v4

    move v4, v5

    move-object v5, v6

    move v6, v7

    move-object/from16 v7, p4

    .line 542
    invoke-virtual/range {v0 .. v9}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromMp3Tags(ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    goto :goto_1

    :cond_4
    const/4 v5, 0x1

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, -0x1

    move-object v0, p0

    move-object v1, v2

    move/from16 v2, p6

    move-object/from16 v8, p4

    .line 544
    invoke-virtual/range {v0 .. v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->setupFromUri(Landroid/net/Uri;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    .line 546
    :goto_1
    invoke-virtual {v0, v12}, Lcom/bumptech/glide/DrawableRequestBuilder;->into(Landroid/widget/ImageView;)Lcom/bumptech/glide/request/target/Target;

    return-void
.end method

.method public loadAlbumArtLarge(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V
    .locals 21

    move/from16 v0, p9

    move/from16 v1, p11

    const/4 v2, 0x2

    move/from16 v3, p8

    if-ge v3, v2, :cond_0

    .line 596
    invoke-static/range {p8 .. p9}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    :cond_0
    move v12, v3

    if-ge v0, v2, :cond_1

    .line 597
    invoke-static {v12, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_1
    move v13, v0

    move/from16 v0, p10

    if-ge v0, v2, :cond_2

    .line 599
    invoke-static/range {p10 .. p11}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :cond_2
    move v14, v0

    if-ge v1, v2, :cond_3

    .line 600
    invoke-static {v14, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    move v15, v0

    goto :goto_0

    :cond_3
    move v15, v1

    :goto_0
    move-object/from16 v4, p0

    move/from16 v5, p1

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move-object/from16 v9, p5

    move/from16 v10, p6

    move-object/from16 v11, p7

    move/from16 v16, p12

    move/from16 v17, p13

    move/from16 v18, p14

    move-object/from16 v19, p15

    move-object/from16 v20, p16

    .line 603
    invoke-direct/range {v4 .. v20}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->loadASyncAlbumArtLarge2(ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;IIIIIIZLcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Ljava/lang/Object;)V

    return-void
.end method

.method public setupFromMp3Tags(ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "II)",
            "Lcom/bumptech/glide/DrawableRequestBuilder<",
            "*>;"
        }
    .end annotation

    move-object v11, p0

    move-object/from16 v3, p3

    .line 634
    invoke-direct {p0, v3}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getMyPicasso(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    const v1, 0x7f0800dc

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/DrawableTypeRequest;

    move-result-object v0

    const v1, 0x7f080148

    .line 635
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->placeholder(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 636
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->error(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    if-eqz p1, :cond_0

    .line 637
    invoke-virtual {v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->fitCenter()Lcom/bumptech/glide/DrawableRequestBuilder;

    :cond_0
    if-nez p4, :cond_1

    const/4 v1, 0x1

    .line 640
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->skipMemoryCache(Z)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    :cond_1
    move-object v12, v0

    .line 642
    new-instance v13, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;

    const/4 v10, 0x1

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;IIZ)V

    .line 643
    new-instance v0, Lcom/bumptech/glide/signature/StringSignature;

    iget-object v1, v13, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->cacheSignature:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/signature/StringSignature;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->signature(Lcom/bumptech/glide/load/Key;)Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 644
    invoke-virtual {v12, v13}, Lcom/bumptech/glide/DrawableRequestBuilder;->decoder(Lcom/bumptech/glide/load/ResourceDecoder;)Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 645
    sget-object v0, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {v12, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/DrawableRequestBuilder;

    return-object v12
.end method

.method public setupFromUri(Landroid/net/Uri;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Z",
            "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "II)",
            "Lcom/bumptech/glide/DrawableRequestBuilder<",
            "*>;"
        }
    .end annotation

    move-object v10, p0

    move-object/from16 v11, p4

    .line 684
    invoke-direct {p0, v11}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getMyPicasso(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    move-object v1, p1

    .line 685
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/RequestManager;->load(Landroid/net/Uri;)Lcom/bumptech/glide/DrawableTypeRequest;

    move-result-object v0

    const v1, 0x7f080148

    .line 686
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableTypeRequest;->placeholder(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    .line 687
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->error(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    .line 688
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v12

    if-eqz p2, :cond_0

    .line 690
    invoke-virtual {v12}, Lcom/bumptech/glide/DrawableRequestBuilder;->fitCenter()Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 692
    :cond_0
    new-instance v13, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;

    move-object v0, v13

    move-object v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move/from16 v8, p9

    move/from16 v9, p10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)V

    .line 693
    new-instance v0, Lcom/bumptech/glide/signature/StringSignature;

    iget-object v1, v13, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->cacheSignature:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/signature/StringSignature;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->signature(Lcom/bumptech/glide/load/Key;)Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 694
    invoke-virtual {v12, v13}, Lcom/bumptech/glide/DrawableRequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-object/from16 v0, p3

    .line 696
    invoke-direct {p0, v11, v0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getDecoder(Landroid/content/Context;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/ResourceDecoder;

    move-result-object v0

    .line 697
    invoke-virtual {v12, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->decoder(Lcom/bumptech/glide/load/ResourceDecoder;)Lcom/bumptech/glide/DrawableRequestBuilder;

    return-object v12
.end method

.method public setupFromUri(Ljava/lang/Integer;ZLcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)Lcom/bumptech/glide/DrawableRequestBuilder;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Z",
            "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;",
            "Landroid/content/Context;",
            "Z",
            "Ljava/lang/String;",
            "Z",
            "Ljava/lang/String;",
            "II)",
            "Lcom/bumptech/glide/DrawableRequestBuilder<",
            "*>;"
        }
    .end annotation

    move-object v10, p0

    move-object/from16 v3, p4

    .line 714
    invoke-direct {p0, v3}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->getMyPicasso(Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object v0

    move-object v1, p1

    .line 715
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/DrawableTypeRequest;

    move-result-object v0

    const v1, 0x7f080148

    .line 716
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableTypeRequest;->placeholder(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    .line 717
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->error(I)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v0

    sget-object v1, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    .line 718
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/DrawableRequestBuilder;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object v11

    if-eqz p2, :cond_0

    .line 720
    invoke-virtual {v11}, Lcom/bumptech/glide/DrawableRequestBuilder;->fitCenter()Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 722
    :cond_0
    new-instance v12, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;

    move-object v0, v12

    move-object v1, p0

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    move/from16 v4, p5

    move-object/from16 v5, p6

    move/from16 v6, p7

    move-object/from16 v7, p8

    move/from16 v8, p9

    move/from16 v9, p10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)V

    .line 723
    new-instance v0, Lcom/bumptech/glide/signature/StringSignature;

    iget-object v1, v12, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->cacheSignature:Ljava/lang/String;

    invoke-direct {v0, v1}, Lcom/bumptech/glide/signature/StringSignature;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0}, Lcom/bumptech/glide/DrawableRequestBuilder;->signature(Lcom/bumptech/glide/load/Key;)Lcom/bumptech/glide/DrawableRequestBuilder;

    .line 724
    invoke-virtual {v11, v12}, Lcom/bumptech/glide/DrawableRequestBuilder;->listener(Lcom/bumptech/glide/request/RequestListener;)Lcom/bumptech/glide/DrawableRequestBuilder;

    return-object v11
.end method
