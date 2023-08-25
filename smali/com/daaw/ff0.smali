.class public Lcom/daaw/ff0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Lcom/daaw/jf0;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/d51;Lcom/daaw/d51;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/d51<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ff0;->a:Lcom/daaw/d51;

    iput-object p2, p0, Lcom/daaw/ff0;->b:Lcom/daaw/d51;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/jf0;II)Lcom/daaw/z41;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jf0;",
            "II)",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/jf0;->b()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v1, p0, Lcom/daaw/ff0;->a:Lcom/daaw/d51;

    invoke-interface {v1, v0, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/jf0;->a()Landroid/os/ParcelFileDescriptor;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/daaw/ff0;->b:Lcom/daaw/d51;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/d51;->c(Ljava/lang/Object;II)Lcom/daaw/z41;

    move-result-object v0

    :cond_1
    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Lcom/daaw/jf0;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ff0;->a(Lcom/daaw/jf0;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "ImageVideoBitmapDecoder.com.bumptech.glide.load.resource.bitmap"

    return-object v0
.end method
