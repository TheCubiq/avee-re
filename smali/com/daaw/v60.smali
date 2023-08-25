.class public Lcom/daaw/v60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/cn1<",
        "Lcom/daaw/s60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/bc;


# direct methods
.method public constructor <init>(Lcom/daaw/cn1;Lcom/daaw/bc;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/bc;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v60;->a:Lcom/daaw/cn1;

    iput-object p2, p0, Lcom/daaw/v60;->b:Lcom/daaw/bc;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/z41;II)Lcom/daaw/z41;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;II)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/s60;

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/s60;

    invoke-virtual {v1}, Lcom/daaw/s60;->f()Landroid/graphics/Bitmap;

    move-result-object v1

    new-instance v2, Lcom/daaw/dc;

    iget-object v3, p0, Lcom/daaw/v60;->b:Lcom/daaw/bc;

    invoke-direct {v2, v1, v3}, Lcom/daaw/dc;-><init>(Landroid/graphics/Bitmap;Lcom/daaw/bc;)V

    iget-object v3, p0, Lcom/daaw/v60;->a:Lcom/daaw/cn1;

    invoke-interface {v3, v2, p2, p3}, Lcom/daaw/cn1;->a(Lcom/daaw/z41;II)Lcom/daaw/z41;

    move-result-object p2

    invoke-interface {p2}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/graphics/Bitmap;

    invoke-virtual {p2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_0

    new-instance p1, Lcom/daaw/u60;

    new-instance p3, Lcom/daaw/s60;

    iget-object v1, p0, Lcom/daaw/v60;->a:Lcom/daaw/cn1;

    invoke-direct {p3, v0, p2, v1}, Lcom/daaw/s60;-><init>(Lcom/daaw/s60;Landroid/graphics/Bitmap;Lcom/daaw/cn1;)V

    invoke-direct {p1, p3}, Lcom/daaw/u60;-><init>(Lcom/daaw/s60;)V

    :cond_0
    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v60;->a:Lcom/daaw/cn1;

    invoke-interface {v0}, Lcom/daaw/cn1;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
