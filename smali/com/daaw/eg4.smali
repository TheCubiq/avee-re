.class public final Lcom/daaw/eg4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jr4;


# instance fields
.field public final p:Lcom/daaw/oj6;


# direct methods
.method public constructor <init>(Lcom/daaw/oj6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/eg4;->p:Lcom/daaw/oj6;

    return-void
.end method


# virtual methods
.method public final f(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lcom/daaw/eg4;->p:Lcom/daaw/oj6;

    invoke-virtual {p1}, Lcom/daaw/oj6;->l()V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Cannot invoke onDestroy for the mediation adapter."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final l(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lcom/daaw/eg4;->p:Lcom/daaw/oj6;

    invoke-virtual {v0}, Lcom/daaw/oj6;->z()V

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/daaw/eg4;->p:Lcom/daaw/oj6;

    invoke-virtual {v0, p1}, Lcom/daaw/oj6;->x(Landroid/content/Context;)V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    return-void

    :catch_0
    move-exception p1

    const-string v0, "Cannot invoke onResume for the mediation adapter."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final s(Landroid/content/Context;)V
    .locals 1

    :try_start_0
    iget-object p1, p0, Lcom/daaw/eg4;->p:Lcom/daaw/oj6;

    invoke-virtual {p1}, Lcom/daaw/oj6;->y()V
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Cannot invoke onPause for the mediation adapter."

    invoke-static {v0, p1}, Lcom/daaw/k04;->zzk(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
