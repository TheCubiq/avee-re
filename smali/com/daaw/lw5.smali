.class public final Lcom/daaw/lw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/sq5;

.field public final b:Lcom/daaw/xq5;

.field public final c:Lcom/daaw/en6;

.field public final d:Lcom/daaw/g77;


# direct methods
.method public constructor <init>(Lcom/daaw/en6;Lcom/daaw/g77;Lcom/daaw/sq5;Lcom/daaw/xq5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/lw5;->c:Lcom/daaw/en6;

    iput-object p2, p0, Lcom/daaw/lw5;->d:Lcom/daaw/g77;

    iput-object p4, p0, Lcom/daaw/lw5;->b:Lcom/daaw/xq5;

    iput-object p3, p0, Lcom/daaw/lw5;->a:Lcom/daaw/sq5;

    return-void
.end method

.method public static final e(Ljava/lang/String;I)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error from: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ", code: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p2, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 6

    const-class v0, Lcom/google/ads/mediation/admob/AdMobAdapter;

    iget-object v1, p2, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    :try_start_0
    iget-object v3, p0, Lcom/daaw/lw5;->a:Lcom/daaw/sq5;

    iget-object v4, p2, Lcom/daaw/th6;->w:Lorg/json/JSONObject;

    invoke-interface {v3, v2, v4}, Lcom/daaw/sq5;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lcom/daaw/tq5;

    move-result-object v1
    :try_end_0
    .catch Lcom/daaw/wi6; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_1
    if-nez v1, :cond_1

    new-instance p1, Lcom/daaw/hu5;

    const-string p2, "Unable to instantiate mediation adapter class."

    invoke-direct {p1, p2}, Lcom/daaw/hu5;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lcom/daaw/s67;->h(Ljava/lang/Throwable;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v2, Lcom/daaw/e14;

    invoke-direct {v2}, Lcom/daaw/e14;-><init>()V

    new-instance v3, Lcom/daaw/kw5;

    invoke-direct {v3, p0, v1, v2}, Lcom/daaw/kw5;-><init>(Lcom/daaw/lw5;Lcom/daaw/tq5;Lcom/daaw/e14;)V

    iget-object v4, v1, Lcom/daaw/tq5;->c:Lcom/daaw/yr4;

    invoke-interface {v4, v3}, Lcom/daaw/yr4;->I(Lcom/daaw/xr4;)V

    iget-boolean v3, p2, Lcom/daaw/th6;->N:Z

    if-eqz v3, :cond_3

    iget-object v3, p1, Lcom/daaw/fi6;->a:Lcom/daaw/ci6;

    iget-object v3, v3, Lcom/daaw/ci6;->a:Lcom/daaw/ri6;

    iget-object v3, v3, Lcom/daaw/ri6;->d:Lcom/google/android/gms/ads/internal/client/zzl;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/client/zzl;->zzm:Landroid/os/Bundle;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    if-nez v4, :cond_2

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0, v4}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    const/4 v0, 0x1

    const-string v3, "render_test_ad_label"

    invoke-virtual {v4, v3, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-object v0, p0, Lcom/daaw/lw5;->c:Lcom/daaw/en6;

    sget-object v3, Lcom/daaw/ym6;->F:Lcom/daaw/ym6;

    new-instance v4, Lcom/daaw/iw5;

    invoke-direct {v4, p0, p1, p2, v1}, Lcom/daaw/iw5;-><init>(Lcom/daaw/lw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    iget-object v5, p0, Lcom/daaw/lw5;->d:Lcom/daaw/g77;

    invoke-static {v4, v5, v3, v0}, Lcom/daaw/lm6;->d(Lcom/daaw/fm6;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object v0

    sget-object v3, Lcom/daaw/ym6;->G:Lcom/daaw/ym6;

    invoke-virtual {v0, v3}, Lcom/daaw/vm6;->b(Ljava/lang/Object;)Lcom/daaw/vm6;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/vm6;->d(Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object v0

    sget-object v2, Lcom/daaw/ym6;->H:Lcom/daaw/ym6;

    invoke-virtual {v0, v2}, Lcom/daaw/vm6;->b(Ljava/lang/Object;)Lcom/daaw/vm6;

    move-result-object v0

    new-instance v2, Lcom/daaw/jw5;

    invoke-direct {v2, p0, p1, p2, v1}, Lcom/daaw/jw5;-><init>(Lcom/daaw/lw5;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    invoke-virtual {v0, v2}, Lcom/daaw/vm6;->e(Lcom/daaw/em6;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;Ljava/lang/Void;)Ljava/lang/Object;
    .locals 0

    iget-object p4, p0, Lcom/daaw/lw5;->b:Lcom/daaw/xq5;

    invoke-interface {p4, p1, p2, p3}, Lcom/daaw/xq5;->b(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic d(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/lw5;->b:Lcom/daaw/xq5;

    invoke-interface {v0, p1, p2, p3}, Lcom/daaw/xq5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/tq5;)V

    return-void
.end method
