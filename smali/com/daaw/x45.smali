.class public final Lcom/daaw/x45;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ia5;

.field public final b:Lcom/daaw/u85;

.field public final c:Lcom/daaw/nh4;

.field public final d:Lcom/daaw/r35;


# direct methods
.method public constructor <init>(Lcom/daaw/ia5;Lcom/daaw/u85;Lcom/daaw/nh4;Lcom/daaw/r35;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/x45;->a:Lcom/daaw/ia5;

    iput-object p2, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    iput-object p3, p0, Lcom/daaw/x45;->c:Lcom/daaw/nh4;

    iput-object p4, p0, Lcom/daaw/x45;->d:Lcom/daaw/r35;

    return-void
.end method


# virtual methods
.method public final a()Landroid/view/View;
    .locals 5

    iget-object v0, p0, Lcom/daaw/x45;->a:Lcom/daaw/ia5;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzq;->zzc()Lcom/google/android/gms/ads/internal/client/zzq;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/daaw/ia5;->a(Lcom/google/android/gms/ads/internal/client/zzq;Lcom/daaw/th6;Lcom/daaw/wh6;)Lcom/daaw/a74;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/view/View;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    new-instance v1, Lcom/daaw/r45;

    invoke-direct {v1, p0}, Lcom/daaw/r45;-><init>(Lcom/daaw/x45;)V

    const-string v2, "/sendMessageToSdk"

    invoke-interface {v0, v2, v1}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    new-instance v1, Lcom/daaw/s45;

    invoke-direct {v1, p0}, Lcom/daaw/s45;-><init>(Lcom/daaw/x45;)V

    const-string v2, "/adMuted"

    invoke-interface {v0, v2, v1}, Lcom/daaw/a74;->y(Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v1, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/daaw/t45;

    invoke-direct {v3, p0}, Lcom/daaw/t45;-><init>(Lcom/daaw/x45;)V

    const-string v4, "/loadHtml"

    invoke-virtual {v1, v2, v4, v3}, Lcom/daaw/u85;->j(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v1, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/daaw/u45;

    invoke-direct {v3, p0}, Lcom/daaw/u45;-><init>(Lcom/daaw/x45;)V

    const-string v4, "/showOverlay"

    invoke-virtual {v1, v2, v4, v3}, Lcom/daaw/u85;->j(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/daaw/zg3;)V

    iget-object v1, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lcom/daaw/v45;

    invoke-direct {v3, p0}, Lcom/daaw/v45;-><init>(Lcom/daaw/x45;)V

    const-string v4, "/hideOverlay"

    invoke-virtual {v1, v2, v4, v3}, Lcom/daaw/u85;->j(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lcom/daaw/zg3;)V

    check-cast v0, Landroid/view/View;

    return-object v0
.end method

.method public final synthetic b(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    const-string v0, "sendMessageToNativeJs"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/u85;->g(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final synthetic c(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/x45;->d:Lcom/daaw/r35;

    invoke-interface {p1}, Lcom/daaw/r35;->zzg()V

    return-void
.end method

.method public final synthetic d(Ljava/util/Map;Z)V
    .locals 2

    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    const-string v0, "messageType"

    const-string v1, "htmlLoaded"

    invoke-interface {p2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "id"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {p2, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lcom/daaw/x45;->b:Lcom/daaw/u85;

    const-string v0, "sendMessageToNativeJs"

    invoke-virtual {p1, v0, p2}, Lcom/daaw/u85;->g(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public final synthetic e(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    const-string p2, "Showing native ads overlay."

    invoke-static {p2}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/x45;->c:Lcom/daaw/nh4;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/daaw/nh4;->f(Z)V

    return-void
.end method

.method public final synthetic f(Lcom/daaw/a74;Ljava/util/Map;)V
    .locals 0

    const-string p2, "Hiding native ads overlay."

    invoke-static {p2}, Lcom/daaw/k04;->zzi(Ljava/lang/String;)V

    invoke-interface {p1}, Lcom/daaw/a74;->g()Landroid/view/View;

    move-result-object p1

    const/16 p2, 0x8

    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lcom/daaw/x45;->c:Lcom/daaw/nh4;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/daaw/nh4;->f(Z)V

    return-void
.end method
