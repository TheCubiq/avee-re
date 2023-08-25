.class public final Lcom/daaw/qm2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/eu6;


# instance fields
.field public final a:Lcom/daaw/js6;

.field public final b:Lcom/daaw/at6;

.field public final c:Lcom/daaw/en2;

.field public final d:Lcom/daaw/pm2;

.field public final e:Lcom/daaw/wl2;

.field public final f:Lcom/daaw/gn2;

.field public final g:Lcom/daaw/xm2;


# direct methods
.method public constructor <init>(Lcom/daaw/js6;Lcom/daaw/at6;Lcom/daaw/en2;Lcom/daaw/pm2;Lcom/daaw/wl2;Lcom/daaw/gn2;Lcom/daaw/xm2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/qm2;->a:Lcom/daaw/js6;

    iput-object p2, p0, Lcom/daaw/qm2;->b:Lcom/daaw/at6;

    iput-object p3, p0, Lcom/daaw/qm2;->c:Lcom/daaw/en2;

    iput-object p4, p0, Lcom/daaw/qm2;->d:Lcom/daaw/pm2;

    iput-object p5, p0, Lcom/daaw/qm2;->e:Lcom/daaw/wl2;

    iput-object p6, p0, Lcom/daaw/qm2;->f:Lcom/daaw/gn2;

    iput-object p7, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/qm2;->c:Lcom/daaw/en2;

    invoke-virtual {v0, p1}, Lcom/daaw/en2;->d(Landroid/view/View;)V

    return-void
.end method

.method public final b()Ljava/util/Map;
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/daaw/qm2;->b:Lcom/daaw/at6;

    invoke-virtual {v1}, Lcom/daaw/at6;->b()Lcom/daaw/fj2;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/qm2;->a:Lcom/daaw/js6;

    invoke-virtual {v2}, Lcom/daaw/js6;->b()Ljava/lang/String;

    move-result-object v2

    const-string v3, "v"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Lcom/daaw/qm2;->a:Lcom/daaw/js6;

    invoke-virtual {v2}, Lcom/daaw/js6;->c()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "gms"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/daaw/fj2;->J0()Ljava/lang/String;

    move-result-object v1

    const-string v2, "int"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->d:Lcom/daaw/pm2;

    invoke-virtual {v1}, Lcom/daaw/pm2;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "up"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    const-string v2, "t"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/xm2;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tcq"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->g()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tpq"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->d()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tcv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->h()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tpv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tchv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tphv"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tcc"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->g:Lcom/daaw/xm2;

    invoke-virtual {v1}, Lcom/daaw/xm2;->e()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "tpc"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method public final zza()Ljava/util/Map;
    .locals 3

    invoke-virtual {p0}, Lcom/daaw/qm2;->b()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qm2;->c:Lcom/daaw/en2;

    invoke-virtual {v1}, Lcom/daaw/en2;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "lts"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final zzb()Ljava/util/Map;
    .locals 4

    invoke-virtual {p0}, Lcom/daaw/qm2;->b()Ljava/util/Map;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/qm2;->b:Lcom/daaw/at6;

    invoke-virtual {v1}, Lcom/daaw/at6;->a()Lcom/daaw/fj2;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/qm2;->a:Lcom/daaw/js6;

    invoke-virtual {v2}, Lcom/daaw/js6;->d()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "gai"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/daaw/fj2;->I0()Ljava/lang/String;

    move-result-object v2

    const-string v3, "did"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/daaw/fj2;->x0()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "dst"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/daaw/fj2;->u0()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "doo"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->e:Lcom/daaw/wl2;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/daaw/wl2;->a()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "nt"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v1, p0, Lcom/daaw/qm2;->f:Lcom/daaw/gn2;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/daaw/gn2;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "vs"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/qm2;->f:Lcom/daaw/gn2;

    invoke-virtual {v1}, Lcom/daaw/gn2;->b()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "vf"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-object v0
.end method

.method public final zzc()Ljava/util/Map;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/qm2;->b()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method
