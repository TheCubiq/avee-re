.class public final Lcom/daaw/ih4;
.super Lcom/daaw/l75;
.source ""


# instance fields
.field public final synthetic t:Ljava/lang/String;

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Landroid/content/Context;

.field public final synthetic w:Landroid/os/Bundle;

.field public final synthetic x:Lcom/daaw/gk5;


# direct methods
.method public constructor <init>(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    iput-object p2, p0, Lcom/daaw/ih4;->t:Ljava/lang/String;

    iput-object p3, p0, Lcom/daaw/ih4;->u:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    iput-object p5, p0, Lcom/daaw/ih4;->w:Landroid/os/Bundle;

    const/4 p2, 0x1

    invoke-direct {p0, p1, p2}, Lcom/daaw/l75;-><init>(Lcom/daaw/gk5;Z)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 14

    const-string v0, "com.google.android.gms.measurement.dynamite"

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    iget-object v4, p0, Lcom/daaw/ih4;->t:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/ih4;->u:Ljava/lang/String;

    invoke-static {v3, v4, v5}, Lcom/daaw/gk5;->i(Lcom/daaw/gk5;Ljava/lang/String;Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    iget-object v4, p0, Lcom/daaw/ih4;->u:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/ih4;->t:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    invoke-static {v5}, Lcom/daaw/gk5;->v(Lcom/daaw/gk5;)Ljava/lang/String;

    move-result-object v5

    move-object v10, v3

    move-object v11, v4

    move-object v9, v5

    goto :goto_0

    :cond_0
    move-object v9, v4

    move-object v10, v9

    move-object v11, v10

    :goto_0
    iget-object v3, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-static {v3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    iget-object v4, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-virtual {v3, v4, v2}, Lcom/daaw/gk5;->t(Landroid/content/Context;Z)Lcom/daaw/ju3;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/daaw/gk5;->D(Lcom/daaw/gk5;Lcom/daaw/ju3;)V

    iget-object v3, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    invoke-static {v3}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v3

    if-nez v3, :cond_1

    iget-object v0, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    invoke-static {v0}, Lcom/daaw/gk5;->v(Lcom/daaw/gk5;)Ljava/lang/String;

    return-void

    :cond_1
    iget-object v3, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-static {v3, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v3

    iget-object v4, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-static {v4, v0}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v4

    if-ge v0, v3, :cond_2

    const/4 v8, 0x1

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    :goto_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzcl;

    int-to-long v6, v4

    const-wide/32 v4, 0x1212d

    iget-object v12, p0, Lcom/daaw/ih4;->w:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-static {v3}, Lcom/daaw/ji6;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    move-object v3, v0

    invoke-direct/range {v3 .. v13}, Lcom/google/android/gms/internal/measurement/zzcl;-><init>(JJZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V

    iget-object v3, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    invoke-static {v3}, Lcom/daaw/gk5;->s(Lcom/daaw/gk5;)Lcom/daaw/ju3;

    move-result-object v3

    invoke-static {v3}, Lcom/daaw/ry0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ju3;

    iget-object v4, p0, Lcom/daaw/ih4;->v:Landroid/content/Context;

    invoke-static {v4}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v4

    iget-wide v5, p0, Lcom/daaw/l75;->p:J

    invoke-interface {v3, v4, v0, v5, v6}, Lcom/daaw/ju3;->initialize(Lcom/daaw/yd0;Lcom/google/android/gms/internal/measurement/zzcl;J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    iget-object v3, p0, Lcom/daaw/ih4;->x:Lcom/daaw/gk5;

    invoke-static {v3, v0, v2, v1}, Lcom/daaw/gk5;->E(Lcom/daaw/gk5;Ljava/lang/Exception;ZZ)V

    return-void
.end method
