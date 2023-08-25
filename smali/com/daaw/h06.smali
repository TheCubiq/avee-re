.class public final Lcom/daaw/h06;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i76;


# instance fields
.field public final a:Lcom/daaw/g77;

.field public final b:Lcom/daaw/g77;

.field public final c:Landroid/content/Context;

.field public final d:Lcom/daaw/ri6;

.field public final e:Landroid/view/View;


# direct methods
.method public constructor <init>(Lcom/daaw/g77;Lcom/daaw/g77;Landroid/content/Context;Lcom/daaw/ri6;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/h06;->a:Lcom/daaw/g77;

    iput-object p2, p0, Lcom/daaw/h06;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/h06;->c:Landroid/content/Context;

    iput-object p4, p0, Lcom/daaw/h06;->d:Lcom/daaw/ri6;

    iput-object p5, p0, Lcom/daaw/h06;->e:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final synthetic a()Lcom/daaw/i06;
    .locals 4

    new-instance v0, Lcom/daaw/i06;

    iget-object v1, p0, Lcom/daaw/h06;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/h06;->d:Lcom/daaw/ri6;

    iget-object v2, v2, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-virtual {p0}, Lcom/daaw/h06;->c()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/i06;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/util/List;)V

    return-object v0
.end method

.method public final synthetic b()Lcom/daaw/i06;
    .locals 4

    new-instance v0, Lcom/daaw/i06;

    iget-object v1, p0, Lcom/daaw/h06;->c:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/h06;->d:Lcom/daaw/ri6;

    iget-object v2, v2, Lcom/daaw/ri6;->e:Lcom/google/android/gms/ads/internal/client/zzq;

    invoke-virtual {p0}, Lcom/daaw/h06;->c()Ljava/util/List;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/daaw/i06;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/client/zzq;Ljava/util/List;)V

    return-object v0
.end method

.method public final c()Ljava/util/List;
    .locals 6

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/daaw/h06;->e:Landroid/view/View;

    :goto_0
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_0

    goto :goto_2

    :cond_0
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_1

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    invoke-virtual {v3, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v1

    goto :goto_1

    :cond_1
    const/4 v1, -0x1

    :goto_1
    new-instance v3, Landroid/os/Bundle;

    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v4

    const-string v5, "type"

    invoke-virtual {v3, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v4, "index_of_child"

    invoke-virtual {v3, v4, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    instance-of v1, v2, Landroid/view/View;

    if-eqz v1, :cond_2

    move-object v1, v2

    check-cast v1, Landroid/view/View;

    goto :goto_0

    :cond_2
    :goto_2
    return-object v0
.end method

.method public final zza()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method

.method public final zzb()Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/h06;->c:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/g93;->c(Landroid/content/Context;)V

    sget-object v0, Lcom/daaw/g93;->g9:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/h06;->b:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/f06;

    invoke-direct {v1, p0}, Lcom/daaw/f06;-><init>(Lcom/daaw/h06;)V

    :goto_0
    invoke-interface {v0, v1}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/daaw/h06;->a:Lcom/daaw/g77;

    new-instance v1, Lcom/daaw/g06;

    invoke-direct {v1, p0}, Lcom/daaw/g06;-><init>(Lcom/daaw/h06;)V

    goto :goto_0
.end method
