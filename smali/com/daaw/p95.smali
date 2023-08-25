.class public final Lcom/daaw/p95;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p95;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/p95;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/p95;->c:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final synthetic zzb()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/p95;->a:Lcom/daaw/m08;

    iget-object v1, p0, Lcom/daaw/p95;->b:Lcom/daaw/m08;

    iget-object v2, p0, Lcom/daaw/p95;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/cq4;

    invoke-virtual {v2}, Lcom/daaw/cq4;->a()Lcom/daaw/ri6;

    move-result-object v2

    iget-object v2, v2, Lcom/daaw/ri6;->o:Lcom/daaw/bi6;

    iget v2, v2, Lcom/daaw/bi6;->a:I

    add-int/lit8 v3, v2, -0x1

    if-eqz v2, :cond_1

    if-eqz v3, :cond_0

    check-cast v1, Lcom/daaw/mw5;

    invoke-virtual {v1}, Lcom/daaw/mw5;->a()Lcom/daaw/lw5;

    move-result-object v0

    goto :goto_0

    :cond_0
    check-cast v0, Lcom/daaw/mw5;

    invoke-virtual {v0}, Lcom/daaw/mw5;->a()Lcom/daaw/lw5;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    throw v0
.end method
