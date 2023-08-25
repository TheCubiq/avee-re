.class public final Lcom/daaw/lp4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fs4;
.implements Lcom/daaw/jr4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/th6;

.field public final r:Lcom/daaw/mr3;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/th6;Lcom/daaw/mr3;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lp4;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/lp4;->q:Lcom/daaw/th6;

    iput-object p3, p0, Lcom/daaw/lp4;->r:Lcom/daaw/mr3;

    return-void
.end method


# virtual methods
.method public final f(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final l(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final s(Landroid/content/Context;)V
    .locals 0

    return-void
.end method

.method public final zzn()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/lp4;->q:Lcom/daaw/th6;

    iget-object v0, v0, Lcom/daaw/th6;->e0:Lcom/daaw/nr3;

    if-eqz v0, :cond_1

    iget-boolean v0, v0, Lcom/daaw/nr3;->a:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/lp4;->q:Lcom/daaw/th6;

    iget-object v1, v1, Lcom/daaw/th6;->e0:Lcom/daaw/nr3;

    iget-object v1, v1, Lcom/daaw/nr3;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/daaw/lp4;->q:Lcom/daaw/th6;

    iget-object v1, v1, Lcom/daaw/th6;->e0:Lcom/daaw/nr3;

    iget-object v1, v1, Lcom/daaw/nr3;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    :goto_0
    return-void
.end method
