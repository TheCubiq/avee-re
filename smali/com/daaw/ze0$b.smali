.class public Lcom/daaw/ze0$b;
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

    iput-object p1, p0, Lcom/daaw/ze0$b;->a:Lcom/daaw/ze0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/y31;

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/ze0$b;->b(Lcom/daaw/y31;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method public b(Lcom/daaw/y31;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 2

    iget-object p1, p0, Lcom/daaw/ze0$b;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->i0(Lcom/daaw/ze0;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ze0$b;->a:Lcom/daaw/ze0;

    invoke-static {p1}, Lcom/daaw/ze0;->j0(Lcom/daaw/ze0;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    const/16 v0, 0x20

    invoke-static {p2, v0, v0, p1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    const/4 p2, 0x7

    :try_start_0
    invoke-static {p1, p2}, Lcom/daaw/j00;->a(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    const-string p2, "Art blurring failed: OutOfMemoryError"

    goto :goto_0

    :catch_1
    move-exception p2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Art blurring failed: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    invoke-static {p2}, Lcom/daaw/lz1;->c(Ljava/lang/String;)V

    :goto_1
    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
