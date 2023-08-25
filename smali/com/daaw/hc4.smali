.class public final Lcom/daaw/hc4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lk4;


# instance fields
.field public final a:Lcom/daaw/mk4;

.field public final b:Lcom/daaw/bb4;

.field public final c:Lcom/daaw/zb4;

.field public final d:Lcom/daaw/hc4;

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

.field public final o:Lcom/daaw/m08;

.field public final p:Lcom/daaw/m08;

.field public final q:Lcom/daaw/m08;

.field public final r:Lcom/daaw/m08;

.field public final s:Lcom/daaw/m08;

.field public final t:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Lcom/daaw/zb4;Lcom/daaw/rm4;Lcom/daaw/mk4;Lcom/daaw/gc4;)V
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, v0, Lcom/daaw/hc4;->d:Lcom/daaw/hc4;

    move-object/from16 v3, p1

    iput-object v3, v0, Lcom/daaw/hc4;->b:Lcom/daaw/bb4;

    move-object/from16 v4, p2

    iput-object v4, v0, Lcom/daaw/hc4;->c:Lcom/daaw/zb4;

    iput-object v2, v0, Lcom/daaw/hc4;->a:Lcom/daaw/mk4;

    new-instance v5, Lcom/daaw/vm4;

    invoke-direct {v5, v1}, Lcom/daaw/vm4;-><init>(Lcom/daaw/rm4;)V

    iput-object v5, v0, Lcom/daaw/hc4;->e:Lcom/daaw/m08;

    new-instance v12, Lcom/daaw/sm4;

    invoke-direct {v12, v1}, Lcom/daaw/sm4;-><init>(Lcom/daaw/rm4;)V

    iput-object v12, v0, Lcom/daaw/hc4;->f:Lcom/daaw/m08;

    const/4 v6, 0x0

    const/4 v7, 0x2

    invoke-static {v6, v7}, Lcom/daaw/k08;->a(II)Lcom/daaw/g08;

    move-result-object v6

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->U(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->e0(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-virtual {v6}, Lcom/daaw/g08;->c()Lcom/daaw/k08;

    move-result-object v6

    iput-object v6, v0, Lcom/daaw/hc4;->g:Lcom/daaw/m08;

    new-instance v7, Lcom/daaw/or4;

    invoke-direct {v7, v6}, Lcom/daaw/or4;-><init>(Lcom/daaw/m08;)V

    invoke-static {v7}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v13

    iput-object v13, v0, Lcom/daaw/hc4;->h:Lcom/daaw/m08;

    const/4 v6, 0x4

    const/4 v7, 0x3

    invoke-static {v6, v7}, Lcom/daaw/k08;->a(II)Lcom/daaw/g08;

    move-result-object v6

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->b0(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->b(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->m(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->b(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->o(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->b(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->V(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->t(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->g(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->B(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->b(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-virtual {v6}, Lcom/daaw/g08;->c()Lcom/daaw/k08;

    move-result-object v6

    iput-object v6, v0, Lcom/daaw/hc4;->i:Lcom/daaw/m08;

    new-instance v7, Lcom/daaw/es4;

    invoke-direct {v7, v6}, Lcom/daaw/es4;-><init>(Lcom/daaw/m08;)V

    invoke-static {v7}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v14

    iput-object v14, v0, Lcom/daaw/hc4;->j:Lcom/daaw/m08;

    new-instance v8, Lcom/daaw/tm4;

    invoke-direct {v8, v1}, Lcom/daaw/tm4;-><init>(Lcom/daaw/rm4;)V

    iput-object v8, v0, Lcom/daaw/hc4;->k:Lcom/daaw/m08;

    new-instance v10, Lcom/daaw/um4;

    invoke-direct {v10, v1}, Lcom/daaw/um4;-><init>(Lcom/daaw/rm4;)V

    iput-object v10, v0, Lcom/daaw/hc4;->l:Lcom/daaw/m08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->R(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v9

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->z(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v11

    new-instance v1, Lcom/daaw/fq4;

    move-object v6, v1

    move-object v7, v12

    invoke-direct/range {v6 .. v11}, Lcom/daaw/fq4;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    iput-object v1, v0, Lcom/daaw/hc4;->m:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/gv4;->a()Lcom/daaw/gv4;

    move-result-object v6

    invoke-static {v6}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v11

    iput-object v11, v0, Lcom/daaw/hc4;->n:Lcom/daaw/m08;

    const/4 v6, 0x1

    invoke-static {v6, v6}, Lcom/daaw/k08;->a(II)Lcom/daaw/g08;

    move-result-object v6

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->u(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->a(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->h(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/daaw/g08;->b(Lcom/daaw/m08;)Lcom/daaw/g08;

    invoke-virtual {v6}, Lcom/daaw/g08;->c()Lcom/daaw/k08;

    move-result-object v6

    iput-object v6, v0, Lcom/daaw/hc4;->o:Lcom/daaw/m08;

    new-instance v15, Lcom/daaw/is4;

    invoke-direct {v15, v6}, Lcom/daaw/is4;-><init>(Lcom/daaw/m08;)V

    iput-object v15, v0, Lcom/daaw/hc4;->p:Lcom/daaw/m08;

    invoke-static/range {p2 .. p2}, Lcom/daaw/zb4;->E(Lcom/daaw/zb4;)Lcom/daaw/m08;

    move-result-object v9

    new-instance v10, Lcom/daaw/eo4;

    move-object v4, v10

    move-object v6, v12

    move-object v7, v13

    move-object v8, v14

    move-object v13, v10

    move-object v10, v1

    move-object v12, v15

    invoke-direct/range {v4 .. v12}, Lcom/daaw/eo4;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    iput-object v13, v0, Lcom/daaw/hc4;->q:Lcom/daaw/m08;

    new-instance v1, Lcom/daaw/ok4;

    invoke-direct {v1, v2}, Lcom/daaw/ok4;-><init>(Lcom/daaw/mk4;)V

    iput-object v1, v0, Lcom/daaw/hc4;->r:Lcom/daaw/m08;

    new-instance v4, Lcom/daaw/nk4;

    invoke-direct {v4, v2}, Lcom/daaw/nk4;-><init>(Lcom/daaw/mk4;)V

    iput-object v4, v0, Lcom/daaw/hc4;->s:Lcom/daaw/m08;

    invoke-static/range {p1 .. p1}, Lcom/daaw/bb4;->N(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v2

    new-instance v3, Lcom/daaw/pk4;

    invoke-direct {v3, v13, v1, v4, v2}, Lcom/daaw/pk4;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v3}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v1

    iput-object v1, v0, Lcom/daaw/hc4;->t:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/zi4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/hc4;->t:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/kk4;

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
