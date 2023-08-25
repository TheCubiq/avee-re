.class public Lcom/daaw/l60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/i51<",
        "Lcom/daaw/k60;",
        "Lcom/daaw/l70;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/i51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i51<",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/h70;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/i51;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/i51<",
            "Landroid/graphics/Bitmap;",
            "Lcom/daaw/h70;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/l60;->a:Lcom/daaw/i51;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/z41;)Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/l70;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/k60;

    invoke-virtual {p1}, Lcom/daaw/k60;->a()Lcom/daaw/z41;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/l60;->a:Lcom/daaw/i51;

    invoke-interface {p1, v0}, Lcom/daaw/i51;->a(Lcom/daaw/z41;)Lcom/daaw/z41;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/k60;->b()Lcom/daaw/z41;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode"

    return-object v0
.end method
