.class public final Lcom/daaw/vg5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/fg5;

.field public final b:Lcom/daaw/sa5;

.field public final c:Ljava/lang/Object;

.field public final d:Ljava/util/List;

.field public e:Z


# direct methods
.method public constructor <init>(Lcom/daaw/fg5;Lcom/daaw/sa5;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/daaw/vg5;->c:Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/vg5;->a:Lcom/daaw/fg5;

    iput-object p2, p0, Lcom/daaw/vg5;->b:Lcom/daaw/sa5;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/daaw/vg5;->d:Ljava/util/List;

    return-void
.end method

.method public static bridge synthetic b(Lcom/daaw/vg5;Ljava/util/List;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/daaw/vg5;->d(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method public final a()Lorg/json/JSONArray;
    .locals 4

    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    iget-object v1, p0, Lcom/daaw/vg5;->c:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    iget-boolean v2, p0, Lcom/daaw/vg5;->e:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/daaw/vg5;->a:Lcom/daaw/fg5;

    invoke-virtual {v2}, Lcom/daaw/fg5;->t()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/vg5;->a:Lcom/daaw/fg5;

    invoke-virtual {v2}, Lcom/daaw/fg5;->g()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0, v2}, Lcom/daaw/vg5;->d(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/daaw/vg5;->c()V

    monitor-exit v1

    return-object v0

    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/daaw/vg5;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/daaw/ug5;

    invoke-virtual {v3}, Lcom/daaw/ug5;->a()Lorg/json/JSONObject;

    move-result-object v3

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_1

    :cond_2
    monitor-exit v1

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    throw v0

    :goto_3
    goto :goto_2
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, Lcom/daaw/vg5;->a:Lcom/daaw/fg5;

    new-instance v1, Lcom/daaw/tg5;

    invoke-direct {v1, p0}, Lcom/daaw/tg5;-><init>(Lcom/daaw/vg5;)V

    invoke-virtual {v0, v1}, Lcom/daaw/fg5;->s(Lcom/daaw/gj3;)V

    return-void
.end method

.method public final d(Ljava/util/List;)V
    .locals 12

    iget-object v0, p0, Lcom/daaw/vg5;->c:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lcom/daaw/vg5;->e:Z

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzbrz;

    sget-object v3, Lcom/daaw/g93;->r8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v3, p0, Lcom/daaw/vg5;->b:Lcom/daaw/sa5;

    iget-object v4, v1, Lcom/google/android/gms/internal/ads/zzbrz;->p:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/daaw/sa5;->a(Ljava/lang/String;)Lcom/daaw/ra5;

    move-result-object v3

    if-eqz v3, :cond_2

    iget-object v3, v3, Lcom/daaw/ra5;->c:Lcom/google/android/gms/internal/ads/zzbye;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    :goto_1
    const-string v3, ""

    :goto_2
    move-object v6, v3

    sget-object v3, Lcom/daaw/g93;->s8:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/daaw/vg5;->b:Lcom/daaw/sa5;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbrz;->p:Ljava/lang/String;

    invoke-virtual {v3, v5}, Lcom/daaw/sa5;->a(Ljava/lang/String;)Lcom/daaw/ra5;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    iget-boolean v3, v3, Lcom/daaw/ra5;->d:Z

    if-eqz v3, :cond_4

    const/4 v11, 0x1

    goto :goto_4

    :cond_4
    :goto_3
    const/4 v11, 0x0

    :goto_4
    iget-object v2, p0, Lcom/daaw/vg5;->d:Ljava/util/List;

    new-instance v3, Lcom/daaw/ug5;

    iget-object v5, v1, Lcom/google/android/gms/internal/ads/zzbrz;->p:Ljava/lang/String;

    iget-object v4, p0, Lcom/daaw/vg5;->b:Lcom/daaw/sa5;

    invoke-virtual {v4, v5}, Lcom/daaw/sa5;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    iget-boolean v8, v1, Lcom/google/android/gms/internal/ads/zzbrz;->q:Z

    iget-object v9, v1, Lcom/google/android/gms/internal/ads/zzbrz;->s:Ljava/lang/String;

    iget v10, v1, Lcom/google/android/gms/internal/ads/zzbrz;->r:I

    move-object v4, v3

    invoke-direct/range {v4 .. v11}, Lcom/daaw/ug5;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IZ)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iput-boolean v2, p0, Lcom/daaw/vg5;->e:Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :goto_5
    throw p1

    :goto_6
    goto :goto_5
.end method
