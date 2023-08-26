.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/bumptech/glide/load/Transformation;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation;-><init>(Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/Transformation<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

.field final synthetic val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;


# direct methods
.method constructor <init>(Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;->val$bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getId()Ljava/lang/String;
    .locals 2

    .line 108
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ck4"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    invoke-virtual {v1}, Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;->getStrId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public transform(Lcom/bumptech/glide/load/engine/Resource;II)Lcom/bumptech/glide/load/engine/Resource;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Landroid/graphics/Bitmap;",
            ">;II)",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .line 93
    invoke-interface {p1}, Lcom/bumptech/glide/load/engine/Resource;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 v0, 0x0

    .line 94
    invoke-static {p1, p2, p3, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 99
    new-instance p2, Lcom/daaw/avee/Common/Ref;

    const/4 p3, 0x0

    invoke-direct {p2, p3}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 100
    new-instance v0, Lcom/daaw/avee/Common/Ref;

    invoke-direct {v0, p3}, Lcom/daaw/avee/Common/Ref;-><init>(Ljava/lang/Object;)V

    .line 101
    iget-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    invoke-static {p1, p3, v0, p2}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->processBitmapColorKey(Landroid/graphics/Bitmap;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;

    move-result-object p1

    .line 103
    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$ColorKeyTransformation$1;->val$bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    invoke-static {p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;->obtain(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;

    move-result-object p1

    return-object p1
.end method
