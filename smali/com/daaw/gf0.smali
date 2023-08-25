.class public Lcom/daaw/gf0;
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
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/ff0;

.field public final q:Lcom/daaw/d51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final r:Lcom/daaw/e51;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/e51<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field

.field public final s:Lcom/daaw/kf0;


# direct methods
.method public constructor <init>(Lcom/daaw/jp;Lcom/daaw/jp;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/jp<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;",
            "Lcom/daaw/jp<",
            "Landroid/os/ParcelFileDescriptor;",
            "Landroid/graphics/Bitmap;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-interface {p1}, Lcom/daaw/jp;->c()Lcom/daaw/e51;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gf0;->r:Lcom/daaw/e51;

    new-instance v0, Lcom/daaw/kf0;

    invoke-interface {p1}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v1

    invoke-interface {p2}, Lcom/daaw/jp;->a()Lcom/daaw/zw;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/kf0;-><init>(Lcom/daaw/zw;Lcom/daaw/zw;)V

    iput-object v0, p0, Lcom/daaw/gf0;->s:Lcom/daaw/kf0;

    invoke-interface {p1}, Lcom/daaw/jp;->e()Lcom/daaw/d51;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/gf0;->q:Lcom/daaw/d51;

    new-instance v0, Lcom/daaw/ff0;

    invoke-interface {p1}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object p1

    invoke-interface {p2}, Lcom/daaw/jp;->d()Lcom/daaw/d51;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lcom/daaw/ff0;-><init>(Lcom/daaw/d51;Lcom/daaw/d51;)V

    iput-object v0, p0, Lcom/daaw/gf0;->p:Lcom/daaw/ff0;

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

    iget-object v0, p0, Lcom/daaw/gf0;->s:Lcom/daaw/kf0;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/gf0;->r:Lcom/daaw/e51;

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Lcom/daaw/jf0;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/gf0;->p:Lcom/daaw/ff0;

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/gf0;->q:Lcom/daaw/d51;

    return-object v0
.end method
