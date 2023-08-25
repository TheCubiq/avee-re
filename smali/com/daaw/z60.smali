.class public Lcom/daaw/z60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/d51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/d51<",
        "Lcom/daaw/r60;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Lcom/daaw/bc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/z60;->a:Lcom/daaw/bc;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/r60;II)Lcom/daaw/z41;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/r60;",
            "II)",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/r60;->i()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object p2, p0, Lcom/daaw/z60;->a:Lcom/daaw/bc;

    invoke-static {p1, p2}, Lcom/daaw/dc;->d(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/dc;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(Ljava/lang/Object;II)Lcom/daaw/z41;
    .locals 0

    check-cast p1, Lcom/daaw/r60;

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/z60;->a(Lcom/daaw/r60;II)Lcom/daaw/z41;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    const-string v0, "GifFrameResourceDecoder.com.bumptech.glide.load.resource.gif"

    return-object v0
.end method
