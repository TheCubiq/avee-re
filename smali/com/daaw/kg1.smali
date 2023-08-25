.class public Lcom/daaw/kg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/bumptech/glide/load/resource/bitmap/a;

.field public b:Lcom/daaw/bc;

.field public c:Lcom/daaw/cq;

.field public d:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/bumptech/glide/load/resource/bitmap/a;Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kg1;->a:Lcom/bumptech/glide/load/resource/bitmap/a;

    iput-object p2, p0, Lcom/daaw/kg1;->b:Lcom/daaw/bc;

    iput-object p3, p0, Lcom/daaw/kg1;->c:Lcom/daaw/cq;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 1

    sget-object v0, Lcom/bumptech/glide/load/resource/bitmap/a;->c:Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-direct {p0, v0, p1, p2}, Lcom/daaw/kg1;-><init>(Lcom/bumptech/glide/load/resource/bitmap/a;Lcom/daaw/bc;Lcom/daaw/cq;)V

    return-void
.end method


# virtual methods
.method public a(Ljava/io/InputStream;II)Lcom/daaw/z41;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "II)",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/kg1;->a:Lcom/bumptech/glide/load/resource/bitmap/a;

    iget-object v2, p0, Lcom/daaw/kg1;->b:Lcom/daaw/bc;

    iget-object v5, p0, Lcom/daaw/kg1;->c:Lcom/daaw/cq;

    move-object v1, p1

    move v3, p2

    move v4, p3

    invoke-virtual/range {v0 .. v5}, Lcom/bumptech/glide/load/resource/bitmap/a;->a(Ljava/io/InputStream;Lcom/daaw/bc;IILcom/daaw/cq;)Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/kg1;->b:Lcom/daaw/bc;

    invoke-static {p1, p2}, Lcom/daaw/dc;->d(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/dc;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/kg1;->a(Ljava/io/InputStream;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kg1;->d:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "StreamBitmapDecoder.com.bumptech.glide.load.resource.bitmap"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/kg1;->a:Lcom/bumptech/glide/load/resource/bitmap/a;

    invoke-interface {v1}, Lcom/daaw/yb;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/kg1;->c:Lcom/daaw/cq;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/kg1;->d:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/daaw/kg1;->d:Ljava/lang/String;

    return-object v0
.end method
