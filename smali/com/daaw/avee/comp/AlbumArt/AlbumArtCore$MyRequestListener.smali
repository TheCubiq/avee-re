.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;
.super Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyRequestListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;II)V
    .locals 12

    move-object v11, p0

    move-object v1, p1

    .line 277
    iput-object v1, v11, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    const/4 v10, 0x0

    move-object v0, p0

    move-object v2, p2

    move-object v3, p3

    move/from16 v4, p4

    move-object/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v8, p8

    move/from16 v9, p9

    .line 278
    invoke-direct/range {v0 .. v10}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;-><init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;IIZ)V

    return-void
.end method


# virtual methods
.method public onException(Ljava/lang/Exception;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
            ">;Z)Z"
        }
    .end annotation

    .line 299
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->context:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$200(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    const p2, 0x7f08008f

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/DrawableTypeRequest;

    move-result-object p1

    .line 302
    iget-boolean p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->useCache:Z

    const/4 p4, 0x1

    if-nez p2, :cond_0

    .line 303
    invoke-virtual {p1, p4}, Lcom/bumptech/glide/DrawableRequestBuilder;->skipMemoryCache(Z)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object p1

    .line 305
    :cond_0
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/DrawableRequestBuilder;->decoder(Lcom/bumptech/glide/load/ResourceDecoder;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object p1

    new-instance p2, Lcom/bumptech/glide/signature/StringSignature;

    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->cacheSignature:Ljava/lang/String;

    invoke-direct {p2, v0}, Lcom/bumptech/glide/signature/StringSignature;-><init>(Ljava/lang/String;)V

    .line 306
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/DrawableRequestBuilder;->signature(Lcom/bumptech/glide/load/Key;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    .line 307
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/DrawableRequestBuilder;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/DrawableRequestBuilder;

    move-result-object p1

    .line 308
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/DrawableRequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return p4
.end method

.method public onResourceReady(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;ZZ)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
            "Ljava/lang/Object;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;",
            ">;ZZ)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;ZZ)Z
    .locals 0

    .line 274
    check-cast p1, Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestListener;->onResourceReady(Lcom/bumptech/glide/load/resource/drawable/GlideDrawable;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;ZZ)Z

    move-result p1

    return p1
.end method
