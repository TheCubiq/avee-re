.class public final Lcom/daaw/ae6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cf6;


# instance fields
.field public a:Lcom/daaw/rp4;

.field public final b:Ljava/util/concurrent/Executor;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/daaw/m77;->b()Ljava/util/concurrent/Executor;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/ae6;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/daaw/df6;Lcom/daaw/ye6;Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 0

    const/4 p3, 0x0

    invoke-virtual {p0, p1, p2, p3}, Lcom/daaw/ae6;->c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final b()Lcom/daaw/rp4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ae6;->a:Lcom/daaw/rp4;

    return-object v0
.end method

.method public final c(Lcom/daaw/df6;Lcom/daaw/ye6;Lcom/daaw/rp4;)Lcom/daaw/f77;
    .locals 1

    iget-object p1, p1, Lcom/daaw/df6;->b:Lcom/daaw/xe6;

    invoke-interface {p2, p1}, Lcom/daaw/ye6;->a(Lcom/daaw/xe6;)Lcom/daaw/qp4;

    move-result-object p1

    new-instance p2, Lcom/daaw/if6;

    const/4 p3, 0x1

    invoke-direct {p2, p3}, Lcom/daaw/if6;-><init>(Z)V

    invoke-interface {p1, p2}, Lcom/daaw/qp4;->j(Lcom/daaw/if6;)Lcom/daaw/qp4;

    invoke-interface {p1}, Lcom/daaw/qp4;->zzh()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/rp4;

    iput-object p1, p0, Lcom/daaw/ae6;->a:Lcom/daaw/rp4;

    invoke-interface {p1}, Lcom/daaw/rp4;->zzb()Lcom/daaw/jn4;

    move-result-object p1

    new-instance p2, Lcom/daaw/qk6;

    invoke-direct {p2}, Lcom/daaw/qk6;-><init>()V

    invoke-virtual {p1}, Lcom/daaw/jn4;->j()Lcom/daaw/f77;

    move-result-object p3

    invoke-static {p3}, Lcom/daaw/j67;->D(Lcom/daaw/f77;)Lcom/daaw/j67;

    move-result-object p3

    new-instance v0, Lcom/daaw/vd6;

    invoke-direct {v0, p0, p2, p1}, Lcom/daaw/vd6;-><init>(Lcom/daaw/ae6;Lcom/daaw/qk6;Lcom/daaw/jn4;)V

    iget-object p1, p0, Lcom/daaw/ae6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p3, v0, p1}, Lcom/daaw/s67;->n(Lcom/daaw/f77;Lcom/daaw/w57;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    new-instance p3, Lcom/daaw/zd6;

    invoke-direct {p3, p2}, Lcom/daaw/zd6;-><init>(Lcom/daaw/qk6;)V

    iget-object p2, p0, Lcom/daaw/ae6;->b:Ljava/util/concurrent/Executor;

    invoke-static {p1, p3, p2}, Lcom/daaw/s67;->m(Lcom/daaw/f77;Lcom/daaw/ey6;Ljava/util/concurrent/Executor;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzd()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ae6;->a:Lcom/daaw/rp4;

    return-object v0
.end method
