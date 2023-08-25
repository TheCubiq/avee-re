.class public Lcom/daaw/t60;
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
        "Lcom/daaw/s60;",
        ">;"
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/c70;

.field public final q:Lcom/daaw/d70;

.field public final r:Lcom/daaw/mg1;

.field public final s:Lcom/daaw/i10;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/i10<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/bc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/c70;

    invoke-direct {v0, p1, p2}, Lcom/daaw/c70;-><init>(Landroid/content/Context;Lcom/daaw/bc;)V

    iput-object v0, p0, Lcom/daaw/t60;->p:Lcom/daaw/c70;

    new-instance p1, Lcom/daaw/i10;

    invoke-direct {p1, v0}, Lcom/daaw/i10;-><init>(Lcom/daaw/d51;)V

    iput-object p1, p0, Lcom/daaw/t60;->s:Lcom/daaw/i10;

    new-instance p1, Lcom/daaw/d70;

    invoke-direct {p1, p2}, Lcom/daaw/d70;-><init>(Lcom/daaw/bc;)V

    iput-object p1, p0, Lcom/daaw/t60;->q:Lcom/daaw/d70;

    new-instance p1, Lcom/daaw/mg1;

    invoke-direct {p1}, Lcom/daaw/mg1;-><init>()V

    iput-object p1, p0, Lcom/daaw/t60;->r:Lcom/daaw/mg1;

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

    iget-object v0, p0, Lcom/daaw/t60;->r:Lcom/daaw/mg1;

    return-object v0
.end method

.method public c()Lcom/daaw/e51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/e51<",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/t60;->q:Lcom/daaw/d70;

    return-object v0
.end method

.method public d()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/InputStream;",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/t60;->p:Lcom/daaw/c70;

    return-object v0
.end method

.method public e()Lcom/daaw/d51;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/d51<",
            "Ljava/io/File;",
            "Lcom/daaw/s60;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/t60;->s:Lcom/daaw/i10;

    return-object v0
.end method
