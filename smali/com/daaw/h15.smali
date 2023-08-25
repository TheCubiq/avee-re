.class public final Lcom/daaw/h15;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/lq4;
.implements Lcom/daaw/cy4;


# instance fields
.field public final p:Lcom/daaw/sx3;

.field public final q:Landroid/content/Context;

.field public final r:Lcom/daaw/ky3;

.field public final s:Landroid/view/View;

.field public t:Ljava/lang/String;

.field public final u:Lcom/daaw/k43;


# direct methods
.method public constructor <init>(Lcom/daaw/sx3;Landroid/content/Context;Lcom/daaw/ky3;Landroid/view/View;Lcom/daaw/k43;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h15;->p:Lcom/daaw/sx3;

    iput-object p2, p0, Lcom/daaw/h15;->q:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/h15;->r:Lcom/daaw/ky3;

    iput-object p4, p0, Lcom/daaw/h15;->s:Landroid/view/View;

    iput-object p5, p0, Lcom/daaw/h15;->u:Lcom/daaw/k43;

    return-void
.end method


# virtual methods
.method public final T()V
    .locals 0

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method

.method public final m(Lcom/daaw/cv3;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6
    .annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
    .end annotation

    iget-object p2, p0, Lcom/daaw/h15;->r:Lcom/daaw/ky3;

    iget-object p3, p0, Lcom/daaw/h15;->q:Landroid/content/Context;

    invoke-virtual {p2, p3}, Lcom/daaw/ky3;->z(Landroid/content/Context;)Z

    move-result p2

    if-eqz p2, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/daaw/h15;->r:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/h15;->q:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/ky3;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    iget-object p2, p0, Lcom/daaw/h15;->p:Lcom/daaw/sx3;

    invoke-virtual {p2}, Lcom/daaw/sx3;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1}, Lcom/daaw/cv3;->zzc()Ljava/lang/String;

    move-result-object v4

    invoke-interface {p1}, Lcom/daaw/cv3;->zzb()I

    move-result v5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/ky3;->t(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string p2, "Remote Exception to get reward item."

    invoke-static {p2, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public final zzf()V
    .locals 0

    return-void
.end method

.method public final zzg()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h15;->u:Lcom/daaw/k43;

    sget-object v1, Lcom/daaw/k43;->A:Lcom/daaw/k43;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/daaw/h15;->r:Lcom/daaw/ky3;

    iget-object v1, p0, Lcom/daaw/h15;->q:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/daaw/ky3;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/h15;->t:Ljava/lang/String;

    iget-object v1, p0, Lcom/daaw/h15;->u:Lcom/daaw/k43;

    sget-object v2, Lcom/daaw/k43;->x:Lcom/daaw/k43;

    if-ne v1, v2, :cond_1

    const-string v1, "/Rewarded"

    goto :goto_0

    :cond_1
    const-string v1, "/Interstitial"

    :goto_0
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/h15;->t:Ljava/lang/String;

    return-void
.end method

.method public final zzj()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/h15;->p:Lcom/daaw/sx3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/daaw/sx3;->c(Z)V

    return-void
.end method

.method public final zzm()V
    .locals 0

    return-void
.end method

.method public final zzo()V
    .locals 3

    iget-object v0, p0, Lcom/daaw/h15;->s:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/daaw/h15;->t:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/h15;->r:Lcom/daaw/ky3;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v2, p0, Lcom/daaw/h15;->t:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Lcom/daaw/ky3;->x(Landroid/content/Context;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lcom/daaw/h15;->p:Lcom/daaw/sx3;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/daaw/sx3;->c(Z)V

    return-void
.end method
