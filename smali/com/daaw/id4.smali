.class public final Lcom/daaw/id4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/nh6;


# instance fields
.field public final a:Lcom/daaw/bb4;

.field public final b:Lcom/daaw/id4;

.field public final c:Lcom/daaw/m08;

.field public final d:Lcom/daaw/m08;

.field public final e:Lcom/daaw/m08;

.field public final f:Lcom/daaw/m08;

.field public final g:Lcom/daaw/m08;

.field public final h:Lcom/daaw/m08;

.field public final i:Lcom/daaw/m08;

.field public final j:Lcom/daaw/m08;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/bb4;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/hd4;)V
    .locals 10

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p0, p0, Lcom/daaw/id4;->b:Lcom/daaw/id4;

    iput-object p1, p0, Lcom/daaw/id4;->a:Lcom/daaw/bb4;

    invoke-static {p2}, Lcom/daaw/xz7;->a(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object p2

    iput-object p2, p0, Lcom/daaw/id4;->c:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->Z(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p4

    invoke-static {p1}, Lcom/daaw/bb4;->l0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v0

    new-instance v4, Lcom/daaw/hf6;

    invoke-direct {v4, p2, p4, v0}, Lcom/daaw/hf6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    iput-object v4, p0, Lcom/daaw/id4;->d:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->Z(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object p4

    new-instance v0, Lcom/daaw/ug6;

    invoke-direct {v0, p4}, Lcom/daaw/ug6;-><init>(Lcom/daaw/m08;)V

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p4

    iput-object p4, p0, Lcom/daaw/id4;->e:Lcom/daaw/m08;

    invoke-static {}, Lcom/daaw/oi6;->a()Lcom/daaw/oi6;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v8

    iput-object v8, p0, Lcom/daaw/id4;->f:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->N(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v2

    invoke-static {p1}, Lcom/daaw/bb4;->J(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v3

    invoke-static {}, Lcom/daaw/ti6;->a()Lcom/daaw/ti6;

    move-result-object v6

    new-instance v9, Lcom/daaw/eh6;

    move-object v0, v9

    move-object v1, p2

    move-object v5, p4

    move-object v7, v8

    invoke-direct/range {v0 .. v7}, Lcom/daaw/eh6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v9}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v2

    iput-object v2, p0, Lcom/daaw/id4;->g:Lcom/daaw/m08;

    new-instance v0, Lcom/daaw/rh6;

    invoke-direct {v0, v2, p4, v8}, Lcom/daaw/rh6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {v0}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/id4;->h:Lcom/daaw/m08;

    invoke-static {p3}, Lcom/daaw/xz7;->b(Ljava/lang/Object;)Lcom/daaw/wz7;

    move-result-object v1

    iput-object v1, p0, Lcom/daaw/id4;->i:Lcom/daaw/m08;

    invoke-static {p1}, Lcom/daaw/bb4;->d0(Lcom/daaw/bb4;)Lcom/daaw/m08;

    move-result-object v6

    new-instance p1, Lcom/daaw/lh6;

    move-object v0, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, v8

    invoke-direct/range {v0 .. v6}, Lcom/daaw/lh6;-><init>(Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;Lcom/daaw/m08;)V

    invoke-static {p1}, Lcom/daaw/vz7;->b(Lcom/daaw/m08;)Lcom/daaw/m08;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/id4;->j:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final zza()Lcom/daaw/kh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/id4;->j:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/kh6;

    return-object v0
.end method

.method public final zzb()Lcom/daaw/qh6;
    .locals 1

    iget-object v0, p0, Lcom/daaw/id4;->h:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/qh6;

    return-object v0
.end method
