.class public Lcom/daaw/u60;
.super Lcom/daaw/tu;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/tu<",
        "Lcom/daaw/s60;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lcom/daaw/s60;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/tu;-><init>(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget-object v0, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lcom/daaw/s60;

    invoke-virtual {v0}, Lcom/daaw/s60;->d()[B

    move-result-object v0

    array-length v0, v0

    iget-object v1, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v1, Lcom/daaw/s60;

    invoke-virtual {v1}, Lcom/daaw/s60;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/tq1;->f(Landroid/graphics/Bitmap;)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lcom/daaw/s60;

    invoke-virtual {v0}, Lcom/daaw/s60;->stop()V

    iget-object v0, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lcom/daaw/s60;

    invoke-virtual {v0}, Lcom/daaw/s60;->i()V

    return-void
.end method
