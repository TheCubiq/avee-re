.class public final Lcom/google/android/gms/internal/ads/zzacn;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzacd;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ads/zzacd<",
        "Lcom/google/android/gms/internal/ads/zzoo;",
        ">;"
    }
.end annotation


# instance fields
.field private final zzbto:Z

.field private final zzcbk:Z

.field private final zzcbl:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/google/android/gms/internal/ads/zzacn;->zzcbk:Z

    iput-boolean p2, p0, Lcom/google/android/gms/internal/ads/zzacn;->zzcbl:Z

    iput-boolean p3, p0, Lcom/google/android/gms/internal/ads/zzacn;->zzbto:Z

    return-void
.end method


# virtual methods
.method public final synthetic zza(Lcom/google/android/gms/internal/ads/zzabv;Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzpb;
    .locals 21
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/lang/InterruptedException;,
            Ljava/util/concurrent/ExecutionException;
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    iget-boolean v5, v0, Lcom/google/android/gms/internal/ads/zzacn;->zzcbk:Z

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzacn;->zzcbl:Z

    const-string v3, "images"

    const/4 v4, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZZ)Ljava/util/List;

    move-result-object v1

    iget-boolean v2, v0, Lcom/google/android/gms/internal/ads/zzacn;->zzcbk:Z

    const-string v3, "app_icon"

    const/4 v4, 0x1

    invoke-virtual {v7, v8, v3, v4, v2}, Lcom/google/android/gms/internal/ads/zzabv;->zza(Lorg/json/JSONObject;Ljava/lang/String;ZZ)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v2

    const-string v3, "video"

    invoke-virtual {v7, v8, v3}, Lcom/google/android/gms/internal/ads/zzabv;->zzc(Lorg/json/JSONObject;Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v3

    invoke-virtual/range {p1 .. p2}, Lcom/google/android/gms/internal/ads/zzabv;->zzg(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v4

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzanz;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzanz;->get()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/android/gms/internal/ads/zzon;

    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v3}, Lcom/google/android/gms/internal/ads/zzabv;->zzc(Lcom/google/android/gms/internal/ads/zzanz;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v1

    new-instance v3, Lcom/google/android/gms/internal/ads/zzoo;

    const-string v5, "headline"

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iget-boolean v6, v0, Lcom/google/android/gms/internal/ads/zzacn;->zzbto:Z

    if-eqz v6, :cond_2

    sget-object v6, Lcom/google/android/gms/internal/ads/zznk;->zzbfr:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v9

    invoke-virtual {v9, v6}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/android/gms/internal/ads/zzajm;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    if-eqz v6, :cond_1

    sget v9, Lcom/google/android/gms/ads/impl/R$string;->s7:I

    invoke-virtual {v6, v9}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :cond_1
    const-string v6, "Test Ad"

    :goto_1
    if-eqz v5, :cond_3

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    add-int/lit8 v9, v9, 0x3

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/String;->length()I

    move-result v10

    add-int/2addr v9, v10

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v9}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " : "

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_2
    move-object v6, v5

    :cond_3
    const-string v5, "body"

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/ads/zzpw;

    const-string v5, "call_to_action"

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-wide/high16 v11, -0x4010000000000000L    # -1.0

    const-string v5, "rating"

    invoke-virtual {v8, v5, v11, v12}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v11

    const-string v5, "store"

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v5, "price"

    invoke-virtual {v8, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-interface {v4}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v4

    move-object v15, v4

    check-cast v15, Lcom/google/android/gms/internal/ads/zzoj;

    new-instance v16, Landroid/os/Bundle;

    invoke-direct/range {v16 .. v16}, Landroid/os/Bundle;-><init>()V

    const/4 v4, 0x0

    if-eqz v1, :cond_4

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zztm()Lcom/google/android/gms/internal/ads/zzarl;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_2

    :cond_4
    move-object/from16 v17, v4

    :goto_2
    if-eqz v1, :cond_5

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_3

    :cond_5
    move-object/from16 v18, v4

    :goto_3
    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v5, v3

    move-object v8, v9

    move-object v9, v2

    invoke-direct/range {v5 .. v20}, Lcom/google/android/gms/internal/ads/zzoo;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;)V

    return-object v3
.end method
