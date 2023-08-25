.class public abstract Lcom/daaw/zv8;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public a:Lcom/daaw/yv8;

.field public b:Lcom/daaw/mw8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/zv8;->a:Lcom/daaw/yv8;

    iput-object v0, p0, Lcom/daaw/zv8;->b:Lcom/daaw/mw8;

    return-void
.end method

.method public b(Lcom/daaw/o98;)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

.method public c()Z
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public abstract d([Lcom/daaw/l98;Lcom/daaw/au8;Lcom/daaw/pr8;Lcom/daaw/l64;)Lcom/daaw/fw8;
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public final f()Lcom/daaw/mw8;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zv8;->b:Lcom/daaw/mw8;

    invoke-static {v0}, Lcom/daaw/uo4;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final g(Lcom/daaw/yv8;Lcom/daaw/mw8;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zv8;->a:Lcom/daaw/yv8;

    iput-object p2, p0, Lcom/daaw/zv8;->b:Lcom/daaw/mw8;

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/zv8;->a:Lcom/daaw/yv8;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/daaw/yv8;->zzj()V

    :cond_0
    return-void
.end method
