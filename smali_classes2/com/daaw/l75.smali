.class public abstract Lcom/daaw/l75;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final p:J

.field public final q:J

.field public final r:Z

.field public final synthetic s:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Z)V
    .locals 2

    iput-object p1, p0, Lcom/daaw/l75;->s:Lcom/daaw/gk5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object v0, p1, Lcom/daaw/gk5;->b:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/l75;->p:J

    iget-object p1, p1, Lcom/daaw/gk5;->b:Lcom/daaw/ag;

    invoke-interface {p1}, Lcom/daaw/ag;->b()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/daaw/l75;->q:J

    iput-boolean p2, p0, Lcom/daaw/l75;->r:Z

    return-void
.end method


# virtual methods
.method public abstract a()V
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/l75;->s:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->h(Lcom/daaw/gk5;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/l75;->b()V

    return-void

    :cond_0
    :try_start_0
    invoke-virtual {p0}, Lcom/daaw/l75;->a()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/daaw/l75;->s:Lcom/daaw/gk5;

    const/4 v2, 0x0

    iget-boolean v3, p0, Lcom/daaw/l75;->r:Z

    invoke-static {v1, v0, v2, v3}, Lcom/daaw/gk5;->E(Lcom/daaw/gk5;Ljava/lang/Exception;ZZ)V

    invoke-virtual {p0}, Lcom/daaw/l75;->b()V

    return-void
.end method
