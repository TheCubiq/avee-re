.class public final Lcom/daaw/w15;
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

    iput-object p1, p0, Lcom/daaw/w15;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/w15;->b:Lcom/daaw/m08;

    iput-object p3, p0, Lcom/daaw/w15;->c:Lcom/daaw/m08;

    iput-object p4, p0, Lcom/daaw/w15;->d:Lcom/daaw/m08;

    iput-object p5, p0, Lcom/daaw/w15;->e:Lcom/daaw/m08;

    return-void
.end method


# virtual methods
.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/w15;->a:Lcom/daaw/m08;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/b94;

    iget-object v1, p0, Lcom/daaw/w15;->b:Lcom/daaw/m08;

    check-cast v1, Lcom/daaw/dq4;

    invoke-virtual {v1}, Lcom/daaw/dq4;->a()Lcom/daaw/sp4;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/w15;->c:Lcom/daaw/m08;

    check-cast v2, Lcom/daaw/ix4;

    invoke-virtual {v2}, Lcom/daaw/ix4;->a()Lcom/daaw/pw4;

    move-result-object v2

    iget-object v3, p0, Lcom/daaw/w15;->d:Lcom/daaw/m08;

    check-cast v3, Lcom/daaw/n15;

    invoke-virtual {v3}, Lcom/daaw/n15;->a()Lcom/daaw/l15;

    move-result-object v3

    iget-object v4, p0, Lcom/daaw/w15;->e:Lcom/daaw/m08;

    check-cast v4, Lcom/daaw/yi4;

    invoke-virtual {v4}, Lcom/daaw/yi4;->a()Lcom/daaw/jt4;

    move-result-object v4

    invoke-virtual {v0}, Lcom/daaw/b94;->j()Lcom/daaw/yj4;

    move-result-object v0

    invoke-virtual {v1}, Lcom/daaw/sp4;->g()Lcom/daaw/up4;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/yj4;->n(Lcom/daaw/up4;)Lcom/daaw/yj4;

    invoke-interface {v0, v2}, Lcom/daaw/yj4;->k(Lcom/daaw/pw4;)Lcom/daaw/yj4;

    invoke-interface {v0, v3}, Lcom/daaw/yj4;->d(Lcom/daaw/l15;)Lcom/daaw/yj4;

    new-instance v1, Lcom/daaw/cx5;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/daaw/cx5;-><init>(Lcom/daaw/fa3;)V

    invoke-interface {v0, v1}, Lcom/daaw/yj4;->o(Lcom/daaw/cx5;)Lcom/daaw/yj4;

    new-instance v1, Lcom/daaw/rl4;

    invoke-direct {v1, v4, v2}, Lcom/daaw/rl4;-><init>(Lcom/daaw/jt4;Lcom/daaw/wv4;)V

    invoke-interface {v0, v1}, Lcom/daaw/yj4;->i(Lcom/daaw/rl4;)Lcom/daaw/yj4;

    new-instance v1, Lcom/daaw/wi4;

    invoke-direct {v1, v2}, Lcom/daaw/wi4;-><init>(Landroid/view/ViewGroup;)V

    invoke-interface {v0, v1}, Lcom/daaw/yj4;->c(Lcom/daaw/wi4;)Lcom/daaw/yj4;

    invoke-interface {v0}, Lcom/daaw/yj4;->zzj()Lcom/daaw/zj4;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/zj4;->c()Lcom/daaw/cm4;

    move-result-object v0

    invoke-static {v0}, Lcom/daaw/e08;->b(Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method
