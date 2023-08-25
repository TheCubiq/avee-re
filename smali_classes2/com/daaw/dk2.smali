.class public final Lcom/daaw/dk2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Lcom/daaw/xe7;

.field public final synthetic q:Lcom/daaw/hl2;


# direct methods
.method public constructor <init>(Lcom/daaw/hl2;Lcom/daaw/xe7;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/dk2;->q:Lcom/daaw/hl2;

    iput-object p2, p0, Lcom/daaw/dk2;->p:Lcom/daaw/xe7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/dk2;->p:Lcom/daaw/xe7;

    invoke-interface {v0}, Lcom/daaw/xe7;->a()Lcom/daaw/b52;

    invoke-static {}, Lcom/daaw/b52;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/dk2;->p:Lcom/daaw/xe7;

    invoke-interface {v0}, Lcom/daaw/xe7;->r()Lcom/daaw/vn6;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/daaw/vn6;->z(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/dk2;->q:Lcom/daaw/hl2;

    invoke-virtual {v0}, Lcom/daaw/hl2;->e()Z

    move-result v0

    iget-object v1, p0, Lcom/daaw/dk2;->q:Lcom/daaw/hl2;

    const-wide/16 v2, 0x0

    invoke-static {v1, v2, v3}, Lcom/daaw/hl2;->a(Lcom/daaw/hl2;J)V

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/daaw/dk2;->q:Lcom/daaw/hl2;

    invoke-virtual {v0}, Lcom/daaw/hl2;->c()V

    :cond_1
    return-void
.end method
