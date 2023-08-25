.class public Lcom/daaw/hf0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jp;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jp<",
        "Lcom/daaw/jf0;",
        "Lcom/daaw/k60;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation
.end field

.field public final q:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lcom/daaw/e51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e51<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Lcom/daaw/zw;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/zw<",
            "Lcom/daaw/jf0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/jp;Lcom/daaw/jp;Lcom/daaw/bc;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jp<",
            "Lcom/daaw/jf0;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/jp<",
            "Ljava/io/InputStream;",
            "Lcom/daaw/s60;",
            ">;",
            "Lcom/daaw/bc;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/n60;

    invoke-interface {p1}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v1

    invoke-interface {p2}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object v2

    invoke-direct {v0, v1, v2, p3}, Lcom/daaw/n60;-><init>(Lcom/daaw/d51;Lcom/daaw/d51;Lcom/daaw/bc;)V

    new-instance p3, Lcom/daaw/i10;

    new-instance v1, Lcom/daaw/p60;

    invoke-direct {v1, v0}, Lcom/daaw/p60;-><init>(Lcom/daaw/d51;)V

    invoke-direct {p3, v1}, Lcom/daaw/i10;-><init>(Lcom/daaw/d51;)V

    iput-object p3, p0, Lcom/daaw/hf0;->p:Lcom/daaw/d51;

    iput-object v0, p0, Lcom/daaw/hf0;->q:Lcom/daaw/d51;

    new-instance p3, Lcom/daaw/o60;

    invoke-interface {p1}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v0

    invoke-interface {p2}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object p2

    invoke-direct {p3, v0, p2}, Lcom/daaw/o60;-><init>(Lcom/daaw/e51;Lcom/daaw/e51;)V

    iput-object p3, p0, Lcom/daaw/hf0;->r:Lcom/daaw/e51;

    invoke-interface {p1}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/hf0;->s:Lcom/daaw/zw;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "Lcom/daaw/jf0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/hf0;->s:Lcom/daaw/zw;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/hf0;->r:Lcom/daaw/e51;

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/hf0;->q:Lcom/daaw/d51;

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Lcom/daaw/k60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/hf0;->p:Lcom/daaw/d51;

    return-object v0
.end method
