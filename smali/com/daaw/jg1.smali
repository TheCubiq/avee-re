.class public Lcom/daaw/jg1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jp;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/jp<",
        "Ljava/io/InputStream;",
        "Landroid/graphics/Bitmap;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/kg1;

.field public final q:Lcom/daaw/zb;

.field public final r:Lcom/daaw/mg1;

.field public final s:Lcom/daaw/i10;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i10<",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/daaw/bc;Lcom/daaw/cq;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/mg1;

    invoke-direct {v0}, Lcom/daaw/mg1;-><init>()V

    iput-object v0, p0, Lcom/daaw/jg1;->r:Lcom/daaw/mg1;

    new-instance v0, Lcom/daaw/kg1;

    invoke-direct {v0, p1, p2}, Lcom/daaw/kg1;-><init>(Lcom/daaw/bc;Lcom/daaw/cq;)V

    iput-object v0, p0, Lcom/daaw/jg1;->p:Lcom/daaw/kg1;

    new-instance p1, Lcom/daaw/zb;

    invoke-direct {p1}, Lcom/daaw/zb;-><init>()V

    iput-object p1, p0, Lcom/daaw/jg1;->q:Lcom/daaw/zb;

    new-instance p1, Lcom/daaw/i10;

    invoke-direct {p1, v0}, Lcom/daaw/i10;-><init>(Lcom/daaw/d51;)V

    iput-object p1, p0, Lcom/daaw/jg1;->s:Lcom/daaw/i10;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/zw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/zw<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jg1;->r:Lcom/daaw/mg1;

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

    iget-object v0, p0, Lcom/daaw/jg1;->q:Lcom/daaw/zb;

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Landroid/graphics/Bitmap;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/jg1;->p:Lcom/daaw/kg1;

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

    iget-object v0, p0, Lcom/daaw/jg1;->s:Lcom/daaw/i10;

    return-object v0
.end method
