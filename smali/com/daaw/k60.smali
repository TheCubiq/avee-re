.class public Lcom/daaw/k60;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/z41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/z41;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/z41;Lcom/daaw/z41;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Can only contain either a bitmap resource or a gif resource, not both"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    if-nez p1, :cond_3

    if-eqz p2, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Must contain either a bitmap resource or a gif resource"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-object p1, p0, Lcom/daaw/k60;->b:Lcom/daaw/z41;

    iput-object p2, p0, Lcom/daaw/k60;->a:Lcom/daaw/z41;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k60;->b:Lcom/daaw/z41;

    return-object v0
.end method

.method public b()Lcom/daaw/z41;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/k60;->a:Lcom/daaw/z41;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/daaw/k60;->b:Lcom/daaw/z41;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/z41;->a()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/k60;->a:Lcom/daaw/z41;

    invoke-interface {v0}, Lcom/daaw/z41;->a()I

    move-result v0

    return v0
.end method
