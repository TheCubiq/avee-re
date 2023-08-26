.class Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;
.super Ljava/lang/Object;
.source "AlbumArtCore.java"

# interfaces
.implements Lcom/bumptech/glide/load/ResourceDecoder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MyRequestDecoder"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/bumptech/glide/load/ResourceDecoder<",
        "Lcom/bumptech/glide/load/model/ImageVideoWrapper;",
        "Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;",
        ">;"
    }
.end annotation


# instance fields
.field private bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

.field public cacheSignature:Ljava/lang/String;

.field protected context:Landroid/content/Context;

.field private dataSource:Ljava/lang/String;

.field private gen_hint:I

.field private gen_hint2:I

.field private generateText:Ljava/lang/String;

.field private isLarge:Z

.field private loadFromMp3Tags:Z

.field final synthetic this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

.field protected useCache:Z


# direct methods
.method public constructor <init>(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;Landroid/content/Context;ZLjava/lang/String;ZLjava/lang/String;IIZ)V
    .locals 0

    .line 228
    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 229
    iput-object p2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    .line 230
    iput-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->context:Landroid/content/Context;

    .line 231
    iput-boolean p4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->useCache:Z

    .line 232
    iput-object p5, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->dataSource:Ljava/lang/String;

    .line 233
    iput-boolean p6, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->isLarge:Z

    .line 234
    iput-object p7, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->generateText:Ljava/lang/String;

    .line 237
    iput p8, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->gen_hint:I

    .line 238
    iput p9, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->gen_hint2:I

    .line 239
    iput-boolean p10, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->loadFromMp3Tags:Z

    .line 242
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "src:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, ":"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "t:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p10, :cond_0

    const-string p2, "t"

    goto :goto_0

    :cond_0
    const-string p2, "f"

    :goto_0
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->cacheSignature:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public decode(Lcom/bumptech/glide/load/model/ImageVideoWrapper;II)Lcom/bumptech/glide/load/engine/Resource;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/bumptech/glide/load/model/ImageVideoWrapper;",
            "II)",
            "Lcom/bumptech/glide/load/engine/Resource<",
            "Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 250
    iget p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->gen_hint:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    .line 252
    iget-boolean p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->loadFromMp3Tags:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->dataSource:Ljava/lang/String;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_1

    .line 253
    iget-object p1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->dataSource:Ljava/lang/String;

    invoke-static {p1, v1}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$000(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-nez p1, :cond_2

    .line 256
    iget-object v1, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->this$0:Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;

    iget-object v2, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->dataSource:Ljava/lang/String;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->generateText:Ljava/lang/String;

    iget v7, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->gen_hint:I

    iget v8, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->gen_hint2:I

    move v5, p2

    move v6, p3

    invoke-static/range {v1 .. v8}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;->access$100(Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore;Ljava/lang/String;ZLjava/lang/String;IIII)Landroid/graphics/Bitmap;

    move-result-object p1

    :cond_2
    if-nez p1, :cond_3

    return-object v0

    .line 262
    :cond_3
    new-instance p2, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;

    iget-object p3, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->bitmapPool:Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;

    invoke-static {p1, p3}, Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;->obtain(Landroid/graphics/Bitmap;Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;)Lcom/bumptech/glide/load/resource/bitmap/BitmapResource;

    move-result-object p1

    invoke-direct {p2, p1, v0}, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;-><init>(Lcom/bumptech/glide/load/engine/Resource;Lcom/bumptech/glide/load/engine/Resource;)V

    .line 263
    new-instance p1, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperResource;

    invoke-direct {p1, p2}, Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapperResource;-><init>(Lcom/bumptech/glide/load/resource/gifbitmap/GifBitmapWrapper;)V

    return-object p1
.end method

.method public bridge synthetic decode(Ljava/lang/Object;II)Lcom/bumptech/glide/load/engine/Resource;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 210
    check-cast p1, Lcom/bumptech/glide/load/model/ImageVideoWrapper;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->decode(Lcom/bumptech/glide/load/model/ImageVideoWrapper;II)Lcom/bumptech/glide/load/engine/Resource;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    .line 269
    iget-object v0, p0, Lcom/daaw/avee/comp/AlbumArt/AlbumArtCore$MyRequestDecoder;->cacheSignature:Ljava/lang/String;

    return-object v0
.end method
