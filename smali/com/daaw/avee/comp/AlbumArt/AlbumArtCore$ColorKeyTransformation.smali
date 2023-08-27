.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;
.super Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperTransformation;
.source "AlbumArtCore.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "ColorKeyTransformation"
.end annotation


# instance fields
.field private bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

.field private colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field private context:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
    .locals 1

    .line 89
    new-instance v0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;

    invoke-direct {v0, p3, p1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;-><init>(Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperTransformation;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Lcom/bumptech/glide/load/Transformation;)V

    .line 111
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;->context:Landroid/content/Context;

    .line 112
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    .line 113
    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;->colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    return-void
.end method
