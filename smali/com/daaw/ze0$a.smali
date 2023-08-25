.class public Lcom/daaw/ze0$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/s40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/ze0;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/s40<",
        "Lcom/daaw/y31;",
        "Landroid/graphics/Bitmap;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/ze0;


# direct methods
.method public constructor <init>(Lcom/daaw/ze0;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ze0$a;->a:Lcom/daaw/ze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ze0$a;->b(Lcom/daaw/y31;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/y31;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;

    iget-object p1, p0, Lcom/daaw/ze0$a;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->f0(Lcom/daaw/ze0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/daaw/ze0$a;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->g0(Lcom/daaw/ze0;)I

    move-result p1

    const/4 v0, 0x1

    shl-int p1, v0, p1

    const/16 v1, 0x200

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    div-float/2addr v1, v2

    int-to-float v2, p1

    mul-float v2, v2, v1

    float-to-int v1, v2

    if-lez v1, :cond_0

    if-lez p1, :cond_0

    invoke-static {p2, v1, p1, v0}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/ze0$a;->a:Lcom/daaw/ze0;

    invoke-static {v0}, Lcom/daaw/ze0;->h0(Lcom/daaw/ze0;)I

    move-result v0

    invoke-static {p1, v0}, Lcom/daaw/j00;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    const-string p1, "Art blurring failed: OutOfMemoryError"

    goto :goto_1

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Art blurring failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :goto_1
    invoke-static {p1}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :cond_1
    :goto_2
    return-object p2
.end method
