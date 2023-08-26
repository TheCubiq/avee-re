.class final Lcom/google/android/gms/ads/internal/zzbe;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/ads/zzpb;",
        ">;"
    }
.end annotation


# instance fields
.field private final synthetic zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

.field private final synthetic zzaag:I

.field private final synthetic zzaah:Lorg/json/JSONArray;

.field private final synthetic zzaai:I

.field private final synthetic zzwg:Lcom/google/android/gms/internal/ads/zzaji;


# direct methods
.method constructor <init>(Lcom/google/android/gms/ads/internal/zzbc;ILorg/json/JSONArray;ILcom/google/android/gms/internal/ads/zzaji;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iput p2, p0, Lcom/google/android/gms/ads/internal/zzbe;->zzaag:I

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzbe;->zzaah:Lorg/json/JSONArray;

    iput p4, p0, Lcom/google/android/gms/ads/internal/zzbe;->zzaai:I

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbe;->zzwg:Lcom/google/android/gms/internal/ads/zzaji;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 76
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p0

    iget v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaag:I

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaah:Lorg/json/JSONArray;

    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-lt v1, v2, :cond_0

    const/4 v1, 0x0

    return-object v1

    :cond_0
    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iget-object v2, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaah:Lorg/json/JSONArray;

    iget v3, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaag:I

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "ads"

    invoke-virtual {v2, v3, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzwc:Lcom/google/android/gms/ads/internal/zzw;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v6, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacp:Ljava/lang/String;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v8, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzwh:Lcom/google/android/gms/internal/ads/zzxn;

    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v9, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzbc;

    const/4 v10, 0x1

    move-object v3, v1

    invoke-direct/range {v3 .. v10}, Lcom/google/android/gms/ads/internal/zzbc;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Z)V

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v4, v3, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-static {v3, v4, v5}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/ads/internal/zzbw;Lcom/google/android/gms/ads/internal/zzbw;)V

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzbc;->zzdq()V

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaaf:Lcom/google/android/gms/ads/internal/zzbc;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbc;->zzvs:Lcom/google/android/gms/internal/ads/zznv;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/ads/internal/zza;->zza(Lcom/google/android/gms/internal/ads/zznv;)V

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/zza;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    iget v4, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaag:I

    iget v5, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzaai:I

    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    const-string v6, "num_ads_requested"

    invoke-virtual {v3, v6, v5}, Lcom/google/android/gms/internal/ads/zznx;->zze(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "ad_index"

    invoke-virtual {v3, v5, v4}, Lcom/google/android/gms/internal/ads/zznx;->zze(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v3, v0, Lcom/google/android/gms/ads/internal/zzbe;->zzwg:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v2

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v4, v4, Lcom/google/android/gms/internal/ads/zzjj;->extras:Landroid/os/Bundle;

    if-eqz v4, :cond_1

    new-instance v4, Landroid/os/Bundle;

    iget-object v5, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v5, v5, Lcom/google/android/gms/internal/ads/zzjj;->extras:Landroid/os/Bundle;

    invoke-direct {v4, v5}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    goto :goto_0

    :cond_1
    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    :goto_0
    move-object v9, v4

    const-string v4, "_ad"

    invoke-virtual {v9, v4, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v5, Lcom/google/android/gms/internal/ads/zzjj;

    move-object/from16 v27, v5

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget v6, v2, Lcom/google/android/gms/internal/ads/zzjj;->versionCode:I

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-wide v7, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzapw:J

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget v10, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzapx:I

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v11, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzapy:Ljava/util/List;

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-boolean v12, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzapz:Z

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget v13, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqa:I

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-boolean v14, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqb:Z

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v15, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqc:Ljava/lang/String;

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqd:Lcom/google/android/gms/internal/ads/zzmq;

    move-object/from16 v16, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqe:Landroid/location/Location;

    move-object/from16 v17, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqf:Ljava/lang/String;

    move-object/from16 v18, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqg:Landroid/os/Bundle;

    move-object/from16 v19, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqh:Landroid/os/Bundle;

    move-object/from16 v20, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqi:Ljava/util/List;

    move-object/from16 v21, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqj:Ljava/lang/String;

    move-object/from16 v22, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-object v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaqk:Ljava/lang/String;

    move-object/from16 v23, v2

    iget-object v2, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccv:Lcom/google/android/gms/internal/ads/zzjj;

    iget-boolean v2, v2, Lcom/google/android/gms/internal/ads/zzjj;->zzaql:Z

    move/from16 v24, v2

    invoke-direct/range {v5 .. v24}, Lcom/google/android/gms/internal/ads/zzjj;-><init>(IJLandroid/os/Bundle;ILjava/util/List;ZIZLjava/lang/String;Lcom/google/android/gms/internal/ads/zzmq;Landroid/location/Location;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Z)V

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaeg;

    move-object/from16 v25, v2

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccu:Landroid/os/Bundle;

    move-object/from16 v26, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    move-object/from16 v28, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzacp:Ljava/lang/String;

    move-object/from16 v29, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    move-object/from16 v30, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccw:Landroid/content/pm/PackageInfo;

    move-object/from16 v31, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccy:Ljava/lang/String;

    move-object/from16 v32, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccz:Ljava/lang/String;

    move-object/from16 v33, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    move-object/from16 v34, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcda:Landroid/os/Bundle;

    move-object/from16 v35, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzads:Ljava/util/List;

    move-object/from16 v36, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdk:Ljava/util/List;

    move-object/from16 v37, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdc:Landroid/os/Bundle;

    move-object/from16 v38, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdd:Z

    move/from16 v39, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcde:I

    move/from16 v40, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdf:I

    move/from16 v41, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzagu:F

    move/from16 v42, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdg:Ljava/lang/String;

    move-object/from16 v43, v4

    iget-wide v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdh:J

    move-wide/from16 v44, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdi:Ljava/lang/String;

    move-object/from16 v46, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdj:Ljava/util/List;

    move-object/from16 v47, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzaco:Ljava/lang/String;

    move-object/from16 v48, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    move-object/from16 v49, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdm:Ljava/lang/String;

    move-object/from16 v50, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdn:F

    move/from16 v51, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdt:Z

    move/from16 v52, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdo:I

    move/from16 v53, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdp:I

    move/from16 v54, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdq:Z

    move/from16 v55, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdr:Z

    move/from16 v56, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcds:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object v57

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdu:Ljava/lang/String;

    move-object/from16 v58, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzbss:Z

    move/from16 v59, v4

    iget v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdv:I

    move/from16 v60, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdw:Landroid/os/Bundle;

    move-object/from16 v61, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdx:Ljava/lang/String;

    move-object/from16 v62, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzadl:Lcom/google/android/gms/internal/ads/zzlu;

    move-object/from16 v63, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdy:Z

    move/from16 v64, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcdz:Landroid/os/Bundle;

    move-object/from16 v65, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzced:Z

    move/from16 v66, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzccx:Ljava/lang/String;

    invoke-static {v4}, Lcom/google/android/gms/internal/ads/zzano;->zzi(Ljava/lang/Object;)Lcom/google/android/gms/internal/ads/zzany;

    move-result-object v67

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzadn:Ljava/util/List;

    move-object/from16 v68, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcee:Ljava/lang/String;

    move-object/from16 v69, v4

    iget-object v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcef:Ljava/util/List;

    move-object/from16 v70, v4

    const/16 v71, 0x1

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzceh:Z

    move/from16 v72, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcei:Z

    move/from16 v73, v4

    iget-boolean v4, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcej:Z

    move/from16 v74, v4

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaef;->zzcek:Ljava/util/ArrayList;

    move-object/from16 v75, v3

    invoke-direct/range {v25 .. v75}, Lcom/google/android/gms/internal/ads/zzaeg;-><init>(Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Landroid/content/pm/ApplicationInfo;Landroid/content/pm/PackageInfo;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzang;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;Landroid/os/Bundle;ZIIFLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpl;Ljava/lang/String;FZIIZZLjava/util/concurrent/Future;Ljava/lang/String;ZILandroid/os/Bundle;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzlu;ZLandroid/os/Bundle;ZLjava/util/concurrent/Future;Ljava/util/List;Ljava/lang/String;Ljava/util/List;IZZZLjava/util/ArrayList;)V

    iget-object v3, v1, Lcom/google/android/gms/ads/internal/zza;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/ads/zzaeg;Lcom/google/android/gms/internal/ads/zznx;)Z

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzbc;->zzds()Ljava/util/concurrent/Future;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/ads/zzpb;

    return-object v1
.end method
