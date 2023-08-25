.class public Lcom/daaw/i70;
.super Lcom/daaw/tu;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/tu<",
        "Lcom/daaw/h70;",
        ">;"
    }
.end annotation


# instance fields
.field public final b:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Lcom/daaw/h70;Lcom/daaw/bc;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/daaw/tu;-><init>(Landroid/graphics/drawable/Drawable;)V

    iput-object p2, p0, Lcom/daaw/i70;->b:Lcom/daaw/bc;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v0, Lcom/daaw/h70;

    invoke-virtual {v0}, Lcom/daaw/h70;->d()Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/tq1;->f(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/i70;->b:Lcom/daaw/bc;

    iget-object v1, p0, Lcom/daaw/tu;->a:Landroid/graphics/drawable/Drawable;

    check-cast v1, Lcom/daaw/h70;

    invoke-virtual {v1}, Lcom/daaw/h70;->d()Landroid/graphics/Bitmap;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/bc;->a(Landroid/graphics/Bitmap;)Z

    return-void
.end method
