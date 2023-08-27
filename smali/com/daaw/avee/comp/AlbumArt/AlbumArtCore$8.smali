.class final Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/daaw/avee/Common/Func/Func;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->onGlideDrawableResult(Lcom/daaw/avee/comp/AlbumArt/ImageLoadedListener;Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/avee/Common/Func/Func<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

.field final synthetic val$buffTmp2:Lcom/daaw/avee/Common/Ref;

.field final synthetic val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

.field final synthetic val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

.field final synthetic val$lock:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ljava/lang/Object;Lcom/bumptech/glide/gifdecoder/GifDecoder;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)V
    .locals 0

    .line 1077
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$lock:Ljava/lang/Object;

    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iput-object p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onInvoke()Landroid/graphics/Bitmap;
    .locals 5

    .line 1081
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$lock:Ljava/lang/Object;

    monitor-enter v0

    .line 1082
    :try_start_0
    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$gifde:Lcom/bumptech/glide/gifdecoder/GifDecoder;

    invoke-virtual {v1}, Lcom/bumptech/glide/gifdecoder/GifDecoder;->getNextFrame()Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1083
    iget-object v2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$colorKeyParams:Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;

    iget-object v3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$bitmapTmp:Lcom/daaw/avee/Common/Ref;

    iget-object v4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->val$buffTmp2:Lcom/daaw/avee/Common/Ref;

    invoke-static {v1, v2, v3, v4}, Lcom/daaw/avee/comp/AlbumArt/ColorKey;->processBitmapColorKey(Landroid/graphics/Bitmap;Lcom/daaw/avee/comp/AlbumArt/ImageColorKeyParams;Lcom/daaw/avee/Common/Ref;Lcom/daaw/avee/Common/Ref;)Landroid/graphics/Bitmap;

    move-result-object v1

    .line 1085
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    .line 1086
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public bridge synthetic onInvoke()Ljava/lang/Object;
    .locals 1

    .line 1077
    invoke-virtual {p0}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$8;->onInvoke()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
