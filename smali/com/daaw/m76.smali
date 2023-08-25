.class public final Lcom/daaw/m76;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/m08;

.field public final b:Lcom/daaw/m08;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;


# direct methods
.method public constructor <init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/m76;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/m76;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/m76;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/m76;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/m76;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l76;
    .locals 7

    iget-object v0, p0, Lcom/daaw/m76;->a:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/h94;

    invoke-virtual {v0}, Lcom/daaw/h94;->a()Landroid/content/Context;

    move-result-object v2

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lcom/daaw/m76;->c:Lcom/daaw/m08;

    check-cast v0, Lcom/daaw/k08;

    invoke-virtual {v0}, Lcom/daaw/k08;->b()Ljava/util/Set;

    move-result-object v4

    iget-object v0, p0, Lcom/daaw/m76;->d:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/daaw/to6;

    iget-object v0, p0, Lcom/daaw/m76;->e:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/daaw/kd5;

    new-instance v0, Lcom/daaw/l76;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/l76;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/Set;Lcom/daaw/to6;Lcom/daaw/kd5;)V

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/m76;->a()Lcom/daaw/l76;

    move-result-object v0

    return-object v0
.end method
