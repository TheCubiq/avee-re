.class public Lcom/daaw/df0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Landroid/graphics/Bitmap;

.field public b:Lcom/daaw/h0;


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/df0;->a:Landroid/graphics/Bitmap;

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/daaw/df0;->b:Lcom/daaw/h0;

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Bitmap;Lcom/daaw/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/df0;->a:Landroid/graphics/Bitmap;

    iput-object p2, p0, Lcom/daaw/df0;->b:Lcom/daaw/h0;

    return-void
.end method

.method public static c(Lcom/daaw/df0;)V
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/df0;->b()V

    :cond_0
    return-void
.end method

.method public static g(Lcom/daaw/df0;)Landroid/graphics/Bitmap;
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/df0;->f()Landroid/graphics/Bitmap;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/df0;->b:Lcom/daaw/h0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/h0;->a()V

    :cond_0
    return-void
.end method

.method public d()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public e()Lcom/daaw/jr1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/jr1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lcom/daaw/df0;->a:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public h()V
    .locals 0

    return-void
.end method
