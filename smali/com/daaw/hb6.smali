.class public final Lcom/daaw/hb6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# direct methods
.method public static a(Landroid/content/Context;Lcom/daaw/ez3;Lcom/daaw/fz3;Ljava/lang/Object;Lcom/daaw/r86;Lcom/daaw/ka6;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Lcom/daaw/qz7;Ljava/util/concurrent/Executor;Lcom/daaw/to6;Lcom/daaw/kd5;)Lcom/daaw/l76;
    .locals 3

    move-object v0, p3

    check-cast v0, Lcom/daaw/da6;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v0, p4

    invoke-interface {v1, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-object v0, p5

    invoke-interface {v1, p5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v0, Lcom/daaw/g93;->g5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p6}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v0, Lcom/daaw/g93;->h5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p7}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_1
    sget-object v0, Lcom/daaw/g93;->i5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p8}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_2
    sget-object v0, Lcom/daaw/g93;->j5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p9}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_3
    sget-object v0, Lcom/daaw/g93;->n5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p11}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_4
    sget-object v0, Lcom/daaw/g93;->o5:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p12}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_5
    sget-object v0, Lcom/daaw/g93;->v2:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface/range {p14 .. p14}, Lcom/daaw/qz7;->zzb()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/daaw/i76;

    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_6
    new-instance v0, Lcom/daaw/l76;

    move-object p1, v0

    move-object p2, p0

    move-object/from16 p3, p15

    move-object p4, v1

    move-object/from16 p5, p16

    move-object/from16 p6, p17

    invoke-direct/range {p1 .. p6}, Lcom/daaw/l76;-><init>(Landroid/content/Context;Ljava/util/concurrent/Executor;Ljava/util/Set;Lcom/daaw/to6;Lcom/daaw/kd5;)V

    return-object v0
.end method
