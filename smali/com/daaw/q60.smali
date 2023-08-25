.class public Lcom/daaw/q60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cn1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/cn1<",
        "Lcom/daaw/k60;",
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

.field public final b:Lcom/daaw/cn1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/cn1<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/cn1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/bc;",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/v60;

    invoke-direct {v0, p2, p1}, Lcom/daaw/v60;-><init>(Lcom/daaw/cn1;Lcom/daaw/bc;)V

    invoke-direct {p0, p2, v0}, Lcom/daaw/q60;-><init>(Lcom/daaw/cn1;Lcom/daaw/cn1;)V

    return-void
.end method

.method public constructor <init>(Lcom/daaw/cn1;Lcom/daaw/cn1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/cn1<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/cn1<",
            "Lcom/daaw/s60;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/q60;->a:Lcom/daaw/cn1;

    iput-object p2, p0, Lcom/daaw/q60;->b:Lcom/daaw/cn1;

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/z41;II)Lcom/daaw/z41;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;II)",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/k60;

    invoke-virtual {v0}, Lcom/daaw/k60;->a()Lcom/daaw/z41;

    move-result-object v0

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/daaw/k60;

    invoke-virtual {v1}, Lcom/daaw/k60;->b()Lcom/daaw/z41;

    move-result-object v1

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/daaw/q60;->a:Lcom/daaw/cn1;

    if-eqz v2, :cond_0

    invoke-interface {v2, v0, p2, p3}, Lcom/daaw/cn1;->a(Lcom/daaw/z41;II)Lcom/daaw/z41;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    new-instance p3, Lcom/daaw/k60;

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/k60;

    invoke-virtual {p1}, Lcom/daaw/k60;->b()Lcom/daaw/z41;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    new-instance p1, Lcom/daaw/m60;

    invoke-direct {p1, p3}, Lcom/daaw/m60;-><init>(Lcom/daaw/k60;)V

    return-object p1

    :cond_0
    if-eqz v1, :cond_1

    iget-object v0, p0, Lcom/daaw/q60;->b:Lcom/daaw/cn1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v1, p2, p3}, Lcom/daaw/cn1;->a(Lcom/daaw/z41;II)Lcom/daaw/z41;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_1

    new-instance p3, Lcom/daaw/k60;

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/k60;

    invoke-virtual {p1}, Lcom/daaw/k60;->a()Lcom/daaw/z41;

    move-result-object p1

    invoke-direct {p3, p1, p2}, Lcom/daaw/k60;-><init>(Lcom/daaw/z41;Lcom/daaw/z41;)V

    new-instance p1, Lcom/daaw/m60;

    invoke-direct {p1, p3}, Lcom/daaw/m60;-><init>(Lcom/daaw/k60;)V

    :cond_1
    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/q60;->a:Lcom/daaw/cn1;

    invoke-interface {v0}, Lcom/daaw/cn1;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
