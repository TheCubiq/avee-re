.class public Lcom/daaw/dc;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/z41;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/z41<",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Landroid/graphics/Bitmap;

.field public final b:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/daaw/bc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Bitmap must not be null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const-string v0, "BitmapPool must not be null"

    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/dc;->a:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/daaw/dc;->b:Lcom/daaw/bc;

    return-void
.end method

.method public static d(Landroid/graphics/Bitmap;Lcom/daaw/bc;)Lcom/daaw/dc;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Lcom/daaw/dc;

    invoke-direct {v0, p0, p1}, Lcom/daaw/dc;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/bc;)V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc;->a:Landroid/graphics/Bitmap;

    invoke-static {v0}, Lcom/daaw/tq1;->f(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public b()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/dc;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/dc;->b:Lcom/daaw/bc;

    iget-object v1, p0, Lcom/daaw/dc;->a:Landroid/graphics/Bitmap;

    invoke-interface {v0, v1}, Lcom/daaw/bc;->a(Landroid/graphics/Bitmap;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dc;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V

    :cond_0
    return-void
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/dc;->b()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method
