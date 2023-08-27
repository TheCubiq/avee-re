.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/bumptech/glide/load/ResourceDecoder;
.implements Lcom/bumptech/glide/request/RequestListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyBitmapRequestListener"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/ResourceDecoder<",
        "Lcom/bumptech/glide/load/model/ImageVideoWrapper;",
        "Landroid/graphics/Bitmap;",
        ">;",
        "Lcom/bumptech/glide/request/RequestListener<",
        "Landroid/net/Uri;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field private bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

.field public cacheSignature:Ljava/lang/String;

.field private context:Landroid/content/Context;

.field private dataSource:Ljava/lang/String;

.field private gen_hint:I

.field private gen_hint2:I

.field private generateText:Ljava/lang/String;

.field private isLarge:Z

.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

.field private useCache:Z


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;IIII)V
    .locals 0

    .line 352
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 354
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    .line 355
    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->context:Landroid/content/Context;

    .line 356
    iput-boolean p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->useCache:Z

    .line 357
    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->dataSource:Ljava/lang/String;

    .line 358
    iput-boolean p6, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->isLarge:Z

    .line 359
    iput-object p7, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->generateText:Ljava/lang/String;

    .line 362
    iput p10, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->gen_hint:I

    .line 363
    iput p11, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->gen_hint2:I

    .line 365
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "ca1:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->cacheSignature:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public decode(Lcom/bumptech/glide/load/model/ImageVideoWrapper;II)Lcom/bumptech/glide/load/engine/Resource;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/model/ImageVideoWrapper;",
            "II)",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 p1, 0x0

    .line 413
    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    invoke-static {p1, p2}, Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;->obtain(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic decode(Ljava/lang/Object;II)Lcom/bumptech/glide/load/engine/Resource;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 336
    check-cast p1, Lcom/bumptech/glide/load/model/ImageVideoWrapper;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->decode(Lcom/bumptech/glide/load/model/ImageVideoWrapper;II)Lcom/bumptech/glide/load/engine/Resource;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 420
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->cacheSignature:Ljava/lang/String;

    return-object v0
.end method

.method public onException(Ljava/lang/Exception;Landroid/net/Uri;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Landroid/net/Uri;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/Bitmap;",
            ">;Z)Z"
        }
    .end annotation

    .line 380
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iget-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->context:Landroid/content/Context;

    invoke-static {p1, p2}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$200(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Landroid/content/Context;)Lcom/bumptech/glide/RequestManager;

    move-result-object p1

    const p2, 0x7f08008f

    .line 381
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/RequestManager;->load(Ljava/lang/Integer;)Lcom/bumptech/glide/DrawableTypeRequest;

    move-result-object p1

    invoke-virtual {p1}, Lcom/bumptech/glide/DrawableTypeRequest;->asBitmap()Lcom/bumptech/glide/BitmapTypeRequest;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/engine/DiskCacheStrategy;->NONE:Lcom/bumptech/glide/load/engine/DiskCacheStrategy;

    invoke-virtual {p1, p2}, Lcom/bumptech/glide/BitmapTypeRequest;->diskCacheStrategy(Lcom/bumptech/glide/load/engine/DiskCacheStrategy;)Lcom/bumptech/glide/BitmapRequestBuilder;

    move-result-object p1

    .line 384
    iget-boolean p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->useCache:Z

    const/4 p4, 0x1

    if-nez p2, :cond_0

    .line 385
    invoke-virtual {p1, p4}, Lcom/bumptech/glide/BitmapRequestBuilder;->skipMemoryCache(Z)Lcom/bumptech/glide/BitmapRequestBuilder;

    move-result-object p1

    .line 388
    :cond_0
    invoke-virtual {p1, p0}, Lcom/bumptech/glide/BitmapRequestBuilder;->decoder(Lcom/bumptech/glide/load/ResourceDecoder;)Lcom/bumptech/glide/BitmapRequestBuilder;

    move-result-object p1

    new-instance p2, Lcom/bumptech/glide/signature/StringSignature;

    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->cacheSignature:Ljava/lang/String;

    invoke-direct {p2, v0}, Lcom/bumptech/glide/signature/StringSignature;-><init>(Ljava/lang/String;)V

    .line 389
    invoke-virtual {p1, p2}, Lcom/bumptech/glide/BitmapRequestBuilder;->signature(Lcom/bumptech/glide/load/Key;)Lcom/bumptech/glide/BitmapRequestBuilder;

    move-result-object p1

    .line 390
    invoke-virtual {p1, p3}, Lcom/bumptech/glide/BitmapRequestBuilder;->into(Lcom/bumptech/glide/request/target/Target;)Lcom/bumptech/glide/request/target/Target;

    return p4
.end method

.method public bridge synthetic onException(Ljava/lang/Exception;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;Z)Z
    .locals 0

    .line 336
    check-cast p2, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->onException(Ljava/lang/Exception;Landroid/net/Uri;Lcom/bumptech/glide/request/target/Target;Z)Z

    move-result p1

    return p1
.end method

.method public onResourceReady(Landroid/graphics/Bitmap;Landroid/net/Uri;Lcom/bumptech/glide/request/target/Target;ZZ)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Landroid/net/Uri;",
            "Lcom/bumptech/glide/request/target/Target<",
            "Landroid/graphics/Bitmap;",
            ">;ZZ)Z"
        }
    .end annotation

    const/4 p1, 0x0

    return p1
.end method

.method public bridge synthetic onResourceReady(Ljava/lang/Object;Ljava/lang/Object;Lcom/bumptech/glide/request/target/Target;ZZ)Z
    .locals 0

    .line 336
    check-cast p1, Landroid/graphics/Bitmap;

    check-cast p2, Landroid/net/Uri;

    invoke-virtual/range {p0 .. p5}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyBitmapRequestListener;->onResourceReady(Landroid/graphics/Bitmap;Landroid/net/Uri;Lcom/bumptech/glide/request/target/Target;ZZ)Z

    move-result p1

    return p1
.end method
