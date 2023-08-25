.class public Lcom/daaw/o60;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/e51;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/e51<",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lcom/daaw/e51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e51<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/daaw/e51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e51<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/e51;Lcom/daaw/e51;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/e51<",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/e51<",
            "Lcom/daaw/s60;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/o60;->a:Lcom/daaw/e51;

    iput-object p2, p0, Lcom/daaw/o60;->b:Lcom/daaw/e51;

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;Ljava/io/OutputStream;)Z
    .locals 0

    check-cast p1, Lcom/daaw/z41;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/o60;->b(Lcom/daaw/z41;Ljava/io/OutputStream;)Z

    move-result p1

    return p1
.end method

.method public b(Lcom/daaw/z41;Ljava/io/OutputStream;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/z41<",
            "Lcom/daaw/k60;",
            ">;",
            "Ljava/io/OutputStream;",
            ")Z"
        }
    .end annotation

    invoke-interface {p1}, Lcom/daaw/z41;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/k60;

    invoke-virtual {p1}, Lcom/daaw/k60;->a()Lcom/daaw/z41;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/daaw/o60;->a:Lcom/daaw/e51;

    invoke-interface {p1, v0, p2}, Lcom/daaw/zw;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/o60;->b:Lcom/daaw/e51;

    invoke-virtual {p1}, Lcom/daaw/k60;->b()Lcom/daaw/z41;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/daaw/zw;->a(Ljava/lang/Object;Ljava/io/OutputStream;)Z

    move-result p1

    return p1
.end method

.method public getId()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/o60;->c:Ljava/lang/String;

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/daaw/o60;->a:Lcom/daaw/e51;

    invoke-interface {v1}, Lcom/daaw/zw;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/daaw/o60;->b:Lcom/daaw/e51;

    invoke-interface {v1}, Lcom/daaw/zw;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/o60;->c:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Lcom/daaw/o60;->c:Ljava/lang/String;

    return-object v0
.end method
