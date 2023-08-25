.class public final Lcom/daaw/qa4;
.super Lcom/daaw/d96;
.source ""


# instance fields
.field public final a:Lcom/daaw/ma6;

.field public final b:Lcom/daaw/bb4;

.field public final c:Lcom/daaw/qa4;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;

.field public final k:Lcom/daaw/m08;

.field public final l:Lcom/daaw/m08;

.field public final m:Lcom/daaw/m08;

.field public final n:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/ma6;Lcom/daaw/pa4;)V
    .locals 5

    invoke-direct {p0}, Lcom/daaw/d96;-><init>()V

    iput-object p0, p0, Lcom/daaw/qa4;->c:Lcom/daaw/qa4;

    iput-object p1, p0, Lcom/daaw/qa4;->b:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/qa4;->a:Lcom/daaw/ma6;

    new-instance p3, Lcom/daaw/ra6;

    invoke-direct {p3, p2}, Lcom/daaw/ra6;-><init>(Lcom/daaw/ma6;)V

    iput-object p3, p0, Lcom/daaw/qa4;->d:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/fc5;->a()Lcom/daaw/fc5;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/qa4;->e:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/dc5;->a()Lcom/daaw/dc5;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/qa4;->f:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/hc5;->a()Lcom/daaw/hc5;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/qa4;->g:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/jc5;->a()Lcom/daaw/jc5;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/qa4;->h:Lcom/daaw/m08;

    const/4 v3, 0x4

    invoke-static {v3}, Lcom/daaw/a08;->b(I)Lcom/daaw/zz7;

    move-result-object v3

    sget-object v4, Lcom/daaw/ym6;->u:Lcom/daaw/ym6;

    invoke-virtual {v3, v4, p2}, Lcom/daaw/zz7;->b(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/zz7;

    sget-object p2, Lcom/daaw/ym6;->w:Lcom/daaw/ym6;

    invoke-virtual {v3, p2, v0}, Lcom/daaw/zz7;->b(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/zz7;

    sget-object p2, Lcom/daaw/ym6;->y:Lcom/daaw/ym6;

    invoke-virtual {v3, p2, v1}, Lcom/daaw/zz7;->b(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/zz7;

    sget-object p2, Lcom/daaw/ym6;->A:Lcom/daaw/ym6;

    invoke-virtual {v3, p2, v2}, Lcom/daaw/zz7;->b(Ljava/lang/Object;Lcom/daaw/m08;)Lcom/daaw/zz7;

    invoke-virtual {v3}, Lcom/daaw/zz7;->c()Lcom/daaw/a08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/qa4;->i:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->r0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v0

    invoke-static {}, Lcom/daaw/wl6;->a()Lcom/daaw/wl6;

    move-result-object v1

    new-instance v2, Lcom/daaw/kc5;

    invoke-direct {v2, p3, v0, v1, p2}, Lcom/daaw/kc5;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/qa4;->j:Lcom/daaw/m08;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/daaw/k08;->a(II)Lcom/daaw/g08;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-virtual {p3}, Lcom/daaw/g08;->c()Lcom/daaw/k08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/qa4;->k:Lcom/daaw/m08;

    new-instance p3, Lcom/daaw/hn6;

    invoke-direct {p3, p2}, Lcom/daaw/hn6;-><init>(Lcom/daaw/m08;)V

    iput-object p3, p0, Lcom/daaw/qa4;->l:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/wl6;->a()Lcom/daaw/wl6;

    move-result-object p2

    invoke-static {p1}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v0

    new-instance v1, Lcom/daaw/gn6;

    invoke-direct {v1, p2, v0, p3}, Lcom/daaw/gn6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/qa4;->m:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->s0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p1

    new-instance p2, Lcom/daaw/uo6;

    invoke-direct {p2, p1}, Lcom/daaw/uo6;-><init>(Lcom/daaw/m08;)V

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/qa4;->n:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l76;
    .locals 10

    iget-object v0, p0, Lcom/daaw/qa4;->b:Lcom/daaw/bb4;

    invoke-static {v0}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/ga6;

    new-instance v1, Lcom/daaw/ez3;

    invoke-direct {v1}, Lcom/daaw/ez3;-><init>()V

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v4, p0, Lcom/daaw/qa4;->a:Lcom/daaw/ma6;

    invoke-static {v4}, Lcom/daaw/qa6;->a(Lcom/daaw/ma6;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-direct {v0, v1, v3, v4, v5}, Lcom/daaw/ga6;-><init>(Lcom/daaw/ez3;Lcom/daaw/g77;Ljava/lang/String;[B)V

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qa4;->b:Lcom/daaw/bb4;

    invoke-static {v1}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v4, p0, Lcom/daaw/qa4;->n:Lcom/daaw/m08;

    invoke-interface {v4}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/daaw/to6;

    iget-object v4, p0, Lcom/daaw/qa4;->b:Lcom/daaw/bb4;

    invoke-static {v4}, Lcom/daaw/bb4;->S(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v4

    invoke-interface {v4}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lcom/daaw/kd5;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v7, Lcom/daaw/j56;

    const-wide/16 v8, 0x0

    invoke-direct {v7, v0, v8, v9, v1}, Lcom/daaw/j56;-><init>(Lcom/daaw/i76;JLjava/util/concurrent/ScheduledExecutorService;)V

    invoke-interface {v4, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    new-instance v0, Lcom/daaw/l76;

    move-object v1, v0

    invoke-direct/range {v1 .. v6}, Lcom/daaw/l76;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/Set;Lcom/daaw/to6;Lcom/daaw/kd5;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/en6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/qa4;->m:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/en6;

    return-object v0
.end method
