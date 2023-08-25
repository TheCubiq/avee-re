.class public final Lcom/daaw/xa4;
.super Lcom/daaw/f96;
.source ""


# instance fields
.field public final a:Lcom/daaw/t86;

.field public final b:Lcom/daaw/bb4;

.field public final c:Lcom/daaw/xa4;

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
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/t86;Lcom/daaw/ta4;)V
    .locals 5

    invoke-direct {p0}, Lcom/daaw/f96;-><init>()V

    iput-object p0, p0, Lcom/daaw/xa4;->c:Lcom/daaw/xa4;

    iput-object p1, p0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    iput-object p2, p0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {p1}, Lcom/daaw/bb4;->s0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p3

    new-instance v0, Lcom/daaw/uo6;

    invoke-direct {v0, p3}, Lcom/daaw/uo6;-><init>(Lcom/daaw/m08;)V

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p3

    iput-object p3, p0, Lcom/daaw/xa4;->d:Lcom/daaw/m08;

    new-instance p3, Lcom/daaw/b96;

    invoke-direct {p3, p2}, Lcom/daaw/b96;-><init>(Lcom/daaw/t86;)V

    iput-object p3, p0, Lcom/daaw/xa4;->e:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/fc5;->a()Lcom/daaw/fc5;

    move-result-object p2

    invoke-static {p2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xa4;->f:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/dc5;->a()Lcom/daaw/dc5;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/xa4;->g:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/hc5;->a()Lcom/daaw/hc5;

    move-result-object v1

    invoke-static {v1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/xa4;->h:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/jc5;->a()Lcom/daaw/jc5;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/xa4;->i:Lcom/daaw/m08;

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

    iput-object p2, p0, Lcom/daaw/xa4;->j:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->r0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v0

    invoke-static {}, Lcom/daaw/wl6;->a()Lcom/daaw/wl6;

    move-result-object v1

    new-instance v2, Lcom/daaw/kc5;

    invoke-direct {v2, p3, v0, v1, p2}, Lcom/daaw/kc5;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v2}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xa4;->k:Lcom/daaw/m08;

    const/4 p3, 0x0

    const/4 v0, 0x1

    invoke-static {p3, v0}, Lcom/daaw/k08;->a(II)Lcom/daaw/g08;

    move-result-object p3

    invoke-virtual {p3, p2}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-virtual {p3}, Lcom/daaw/g08;->c()Lcom/daaw/k08;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/xa4;->l:Lcom/daaw/m08;

    new-instance p3, Lcom/daaw/hn6;

    invoke-direct {p3, p2}, Lcom/daaw/hn6;-><init>(Lcom/daaw/m08;)V

    iput-object p3, p0, Lcom/daaw/xa4;->m:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/wl6;->a()Lcom/daaw/wl6;

    move-result-object p2

    invoke-static {p1}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p1

    new-instance v0, Lcom/daaw/gn6;

    invoke-direct {v0, p2, p1, p3}, Lcom/daaw/gn6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/xa4;->n:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/l76;
    .locals 21

    move-object/from16 v0, p0

    new-instance v7, Lcom/daaw/l76;

    iget-object v1, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v1}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v1

    invoke-virtual {v1}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/daaw/z04;->a:Lcom/daaw/g77;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/daaw/ga6;

    new-instance v4, Lcom/daaw/ez3;

    invoke-direct {v4}, Lcom/daaw/ez3;-><init>()V

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v5}, Lcom/daaw/u86;->a(Lcom/daaw/t86;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    invoke-direct {v1, v4, v3, v5, v6}, Lcom/daaw/ga6;-><init>(Lcom/daaw/ez3;Lcom/daaw/g77;Ljava/lang/String;[B)V

    invoke-static {}, Lcom/daaw/d56;->a()Lcom/daaw/b56;

    move-result-object v4

    iget-object v5, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v5}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/ScheduledExecutorService;

    const/4 v15, 0x0

    invoke-static {v1, v4, v5, v15}, Lcom/daaw/fb6;->a(Lcom/daaw/ga6;Lcom/daaw/b56;Ljava/util/concurrent/ScheduledExecutorService;I)Lcom/daaw/i76;

    move-result-object v1

    new-instance v4, Lcom/daaw/ta6;

    new-instance v5, Lcom/daaw/lr3;

    invoke-direct {v5}, Lcom/daaw/lr3;-><init>()V

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v9, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v9}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v9

    invoke-virtual {v9}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v4, v5, v8, v9, v6}, Lcom/daaw/ta6;-><init>(Lcom/daaw/lr3;Ljava/util/concurrent/ScheduledExecutorService;Landroid/content/Context;[B)V

    iget-object v5, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v5}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v4, v5}, Lcom/daaw/fb6;->b(Lcom/daaw/ta6;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/i76;

    move-result-object v4

    new-instance v8, Lcom/daaw/hz3;

    invoke-direct {v8}, Lcom/daaw/hz3;-><init>()V

    iget-object v5, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v5}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v5

    invoke-virtual {v5}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v9

    invoke-static {v9}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v5}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v5

    invoke-interface {v5}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v5

    move-object v10, v5

    check-cast v10, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v5}, Lcom/daaw/v86;->a(Lcom/daaw/t86;)I

    move-result v12

    iget-object v5, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v5}, Lcom/daaw/x86;->a(Lcom/daaw/t86;)Z

    move-result v13

    iget-object v5, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v5}, Lcom/daaw/y86;->a(Lcom/daaw/t86;)Z

    move-result v14

    move-object v11, v3

    invoke-static/range {v8 .. v14}, Lcom/daaw/n86;->a(Lcom/daaw/hz3;Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;IZZ)Lcom/daaw/l86;

    move-result-object v5

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v5, v8}, Lcom/daaw/gb6;->a(Lcom/daaw/l86;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/i76;

    move-result-object v5

    new-instance v8, Lcom/daaw/ob6;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v8, v3}, Lcom/daaw/ob6;-><init>(Lcom/daaw/g77;)V

    iget-object v9, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v9}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v9

    invoke-interface {v9}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v8, v9}, Lcom/daaw/fb6;->c(Lcom/daaw/ob6;Ljava/util/concurrent/ScheduledExecutorService;)Lcom/daaw/i76;

    move-result-object v17

    sget-object v18, Lcom/daaw/db6;->a:Lcom/daaw/db6;

    new-instance v14, Lcom/daaw/h96;

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v8

    invoke-static {v8}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v9, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v9}, Lcom/daaw/u86;->a(Lcom/daaw/t86;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v14, v6, v8, v9, v3}, Lcom/daaw/h96;-><init>(Lcom/daaw/ou3;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/g77;)V

    const/4 v8, 0x6

    new-array v13, v8, [Lcom/daaw/i76;

    new-instance v8, Lcom/daaw/z96;

    new-instance v9, Lcom/daaw/m33;

    invoke-direct {v9}, Lcom/daaw/m33;-><init>()V

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v10}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v8, v9, v3, v10, v6}, Lcom/daaw/z96;-><init>(Lcom/daaw/m33;Lcom/daaw/g77;Landroid/content/Context;[B)V

    aput-object v8, v13, v15

    new-instance v8, Lcom/daaw/ka6;

    new-instance v9, Lcom/daaw/n83;

    invoke-direct {v9}, Lcom/daaw/n83;-><init>()V

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v10, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v10}, Lcom/daaw/w86;->a(Lcom/daaw/t86;)Ljava/util/List;

    move-result-object v10

    invoke-direct {v8, v9, v3, v10, v6}, Lcom/daaw/ka6;-><init>(Lcom/daaw/n83;Lcom/daaw/g77;Ljava/util/List;[B)V

    const/4 v6, 0x1

    aput-object v8, v13, v6

    new-instance v6, Lcom/daaw/r86;

    new-instance v9, Lcom/daaw/hz3;

    invoke-direct {v9}, Lcom/daaw/hz3;-><init>()V

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v8}, Lcom/daaw/z86;->a(Lcom/daaw/t86;)Ljava/lang/String;

    move-result-object v11

    iget-object v8, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v8}, Lcom/daaw/a96;->a(Lcom/daaw/t86;)Landroid/content/pm/PackageInfo;

    move-result-object v12

    iget-object v8, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v8}, Lcom/daaw/v86;->a(Lcom/daaw/t86;)I

    move-result v15

    const/16 v16, 0x0

    move-object v8, v6

    move-object v10, v3

    move-object/from16 v19, v13

    move v13, v15

    move-object/from16 v20, v14

    move-object/from16 v14, v16

    invoke-direct/range {v8 .. v14}, Lcom/daaw/r86;-><init>(Lcom/daaw/hz3;Ljava/util/concurrent/Executor;Ljava/lang/String;Landroid/content/pm/PackageInfo;I[B)V

    const/4 v8, 0x2

    aput-object v6, v19, v8

    new-instance v6, Lcom/daaw/v96;

    new-instance v9, Lcom/daaw/hz3;

    invoke-direct {v9}, Lcom/daaw/hz3;-><init>()V

    iget-object v8, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v8}, Lcom/daaw/v86;->a(Lcom/daaw/t86;)I

    move-result v10

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->E(Lcom/daaw/bb4;)Lcom/daaw/e94;

    move-result-object v8

    invoke-virtual {v8}, Lcom/daaw/e94;->a()Landroid/content/Context;

    move-result-object v11

    invoke-static {v11}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->o0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v8

    move-object v12, v8

    check-cast v12, Lcom/daaw/qz3;

    iget-object v8, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v8}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v8

    invoke-interface {v8}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v8

    move-object v13, v8

    check-cast v13, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v8, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v8}, Lcom/daaw/u86;->a(Lcom/daaw/t86;)Ljava/lang/String;

    move-result-object v15

    move-object v8, v6

    move-object v14, v3

    invoke-direct/range {v8 .. v16}, Lcom/daaw/v96;-><init>(Lcom/daaw/hz3;ILandroid/content/Context;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Ljava/util/concurrent/Executor;Ljava/lang/String;[B)V

    const/4 v8, 0x3

    aput-object v6, v19, v8

    iget-object v6, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v6}, Lcom/daaw/bb4;->Q(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v6

    invoke-interface {v6}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/i76;

    const/4 v8, 0x4

    aput-object v6, v19, v8

    iget-object v6, v0, Lcom/daaw/xa4;->a:Lcom/daaw/t86;

    invoke-static {v6}, Lcom/daaw/u86;->a(Lcom/daaw/t86;)Ljava/lang/String;

    move-result-object v6

    new-instance v8, Lcom/daaw/y23;

    invoke-direct {v8}, Lcom/daaw/y23;-><init>()V

    iget-object v9, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v9}, Lcom/daaw/bb4;->o0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v9

    invoke-interface {v9}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/daaw/qz3;

    iget-object v10, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v10}, Lcom/daaw/bb4;->F0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v10

    invoke-interface {v10}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v3}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v8, v9, v10, v3}, Lcom/daaw/r96;->a(Ljava/lang/String;Lcom/daaw/y23;Lcom/daaw/qz3;Ljava/util/concurrent/ScheduledExecutorService;Lcom/daaw/g77;)Lcom/daaw/p96;

    move-result-object v6

    const/4 v8, 0x5

    aput-object v6, v19, v8

    move-object v8, v1

    move-object v9, v4

    move-object v10, v5

    move-object/from16 v11, v17

    move-object/from16 v12, v18

    move-object/from16 v13, v20

    move-object/from16 v14, v19

    invoke-static/range {v8 .. v14}, Lcom/daaw/d27;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;)Lcom/daaw/d27;

    move-result-object v4

    iget-object v1, v0, Lcom/daaw/xa4;->d:Lcom/daaw/m08;

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lcom/daaw/to6;

    iget-object v1, v0, Lcom/daaw/xa4;->b:Lcom/daaw/bb4;

    invoke-static {v1}, Lcom/daaw/bb4;->S(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v1

    invoke-interface {v1}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lcom/daaw/kd5;

    move-object v1, v7

    invoke-direct/range {v1 .. v6}, Lcom/daaw/l76;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/Set;Lcom/daaw/to6;Lcom/daaw/kd5;)V

    return-object v7
.end method

.method public final b()Lcom/daaw/en6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/xa4;->n:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/en6;

    return-object v0
.end method
