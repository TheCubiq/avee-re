.class public final Lcom/google/android/gms/ads/internal/zzbc;
.super Lcom/google/android/gms/ads/internal/zzd;

# interfaces
.implements Lcom/google/android/gms/internal/ads/zzpa;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field private final mLock:Ljava/lang/Object;

.field private zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

.field private zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

.field private zzaac:I

.field private zzaad:Lcom/google/android/gms/internal/ads/zzacm;

.field private final zzaae:Ljava/lang/String;

.field private zzwl:Z

.field private zzzy:Z

.field private zzzz:Lcom/google/android/gms/internal/ads/zzaoj;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/ads/zzaoj<",
            "Lcom/google/android/gms/internal/ads/zzpb;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 8

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/ads/internal/zzbc;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Z)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Z)V
    .locals 7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    move-object v5, p6

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/google/android/gms/ads/internal/zzd;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/ads/internal/zzw;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->mLock:Ljava/lang/Object;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-direct {p1}, Lcom/google/android/gms/internal/ads/zzaoj;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzzz:Lcom/google/android/gms/internal/ads/zzaoj;

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaac:I

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaae:Ljava/lang/String;

    iput-boolean p7, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzzy:Z

    return-void
.end method

.method private static zza(Lcom/google/android/gms/internal/ads/zzpb;)Lcom/google/android/gms/internal/ads/zzov;
    .locals 20

    move-object/from16 v0, p0

    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzoq;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/google/android/gms/internal/ads/zzoq;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzov;

    move-object v3, v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getHeadline()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getImages()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getBody()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzkg()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getCallToAction()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getAdvertiser()Ljava/lang/String;

    move-result-object v9

    const-wide/high16 v10, -0x4010000000000000L    # -1.0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzkc()Lcom/google/android/gms/internal/ads/zzoj;

    move-result-object v14

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzkd()Landroid/view/View;

    move-result-object v16

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v17

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->getExtras()Landroid/os/Bundle;

    move-result-object v19

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/internal/ads/zzov;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    goto :goto_1

    :cond_0
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzoo;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/google/android/gms/internal/ads/zzoo;

    new-instance v1, Lcom/google/android/gms/internal/ads/zzov;

    move-object v3, v1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getHeadline()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getImages()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getBody()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getCallToAction()Ljava/lang/String;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getStarRating()D

    move-result-wide v10

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getStore()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getPrice()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzkc()Lcom/google/android/gms/internal/ads/zzoj;

    move-result-object v14

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v15

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzkd()Landroid/view/View;

    move-result-object v16

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v17

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getMediationAdapterClassName()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->getExtras()Landroid/os/Bundle;

    move-result-object v19

    invoke-direct/range {v3 .. v19}, Lcom/google/android/gms/internal/ads/zzov;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;)V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzka()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :cond_2
    :goto_1
    instance-of v0, v2, Lcom/google/android/gms/internal/ads/zzpd;

    if-eqz v0, :cond_3

    check-cast v2, Lcom/google/android/gms/internal/ads/zzpd;

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/ads/zzov;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    :cond_3
    return-object v1
.end method

.method static synthetic zza(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/ads/internal/zzbw;Lcom/google/android/gms/ads/internal/zzbw;)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/ads/internal/zzbw;Lcom/google/android/gms/ads/internal/zzbw;)V

    return-void
.end method

.method private static zza(Lcom/google/android/gms/ads/internal/zzbw;Lcom/google/android/gms/ads/internal/zzbw;)V
    .locals 1

    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadf:Lcom/google/android/gms/internal/ads/zzqz;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadf:Lcom/google/android/gms/internal/ads/zzqz;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadf:Lcom/google/android/gms/internal/ads/zzqz;

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadh:Landroidx/collection/SimpleArrayMap;

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadh:Landroidx/collection/SimpleArrayMap;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadh:Landroidx/collection/SimpleArrayMap;

    :cond_2
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    :cond_3
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadk:Lcom/google/android/gms/internal/ads/zzmu;

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadk:Lcom/google/android/gms/internal/ads/zzmu;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadk:Lcom/google/android/gms/internal/ads/zzmu;

    :cond_4
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    if-nez v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    :cond_5
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzads:Ljava/util/List;

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzads:Ljava/util/List;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzads:Ljava/util/List;

    :cond_6
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacy:Lcom/google/android/gms/internal/ads/zzajj;

    if-nez v0, :cond_7

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacy:Lcom/google/android/gms/internal/ads/zzajj;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacy:Lcom/google/android/gms/internal/ads/zzajj;

    :cond_7
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadt:Lcom/google/android/gms/internal/ads/zzaju;

    if-nez v0, :cond_8

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadt:Lcom/google/android/gms/internal/ads/zzaju;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzadt:Lcom/google/android/gms/internal/ads/zzaju;

    :cond_8
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacz:Lcom/google/android/gms/internal/ads/zzke;

    if-nez v0, :cond_9

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacz:Lcom/google/android/gms/internal/ads/zzke;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacz:Lcom/google/android/gms/internal/ads/zzke;

    :cond_9
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzada:Lcom/google/android/gms/internal/ads/zzkh;

    if-nez v0, :cond_a

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzada:Lcom/google/android/gms/internal/ads/zzkh;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzada:Lcom/google/android/gms/internal/ads/zzkh;

    :cond_a
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    if-nez v0, :cond_b

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    :cond_b
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-nez v0, :cond_c

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iput-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    :cond_c
    iget-object v0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacx:Lcom/google/android/gms/internal/ads/zzaji;

    if-nez v0, :cond_d

    iget-object p0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacx:Lcom/google/android/gms/internal/ads/zzaji;

    iput-object p0, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacx:Lcom/google/android/gms/internal/ads/zzaji;

    :cond_d
    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzoo;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzbg;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzbg;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzoo;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzoq;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzbi;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzbi;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzoq;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private final zza(Lcom/google/android/gms/internal/ads/zzov;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzbh;

    invoke-direct {v1, p0, p1}, Lcom/google/android/gms/ads/internal/zzbh;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzov;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method static synthetic zzb(Lcom/google/android/gms/internal/ads/zzpb;)Lcom/google/android/gms/internal/ads/zzov;
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzpb;)Lcom/google/android/gms/internal/ads/zzov;

    move-result-object p0

    return-object p0
.end method

.method private final zzcp()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzcfp:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final zzcw()Lcom/google/android/gms/internal/ads/zzwy;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzceq:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzcod:Lcom/google/android/gms/internal/ads/zzwy;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private final zzdx()V
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdr()Lcom/google/android/gms/internal/ads/zzacm;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzacm;->zzmc()V

    :cond_0
    return-void
.end method


# virtual methods
.method public final getAdUnitId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacp:Ljava/lang/String;

    return-object v0
.end method

.method public final getUuid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaae:Ljava/lang/String;

    return-object v0
.end method

.method public final pause()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support pause()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final resume()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native Ad DOES NOT support resume()."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final showInterstitial()V
    .locals 2

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Interstitial is NOT supported by NativeAdManager."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzaaw;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "In App Purchase is NOT supported by NativeAdManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zznx;)V
    .locals 12

    const-string v0, ""

    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzaji;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, p1, Lcom/google/android/gms/internal/ads/zzaji;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iput-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    :cond_0
    iget v1, p1, Lcom/google/android/gms/internal/ads/zzaji;->errorCode:I

    const/4 v2, -0x2

    if-eq v1, v2, :cond_1

    sget-object p2, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v0, Lcom/google/android/gms/ads/internal/zzbd;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/ads/internal/zzbd;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzaji;)V

    invoke-virtual {p2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_1
    iget-object v1, p1, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzaef;->zzceg:I

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-ne v1, v2, :cond_3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iput v8, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzej()Lcom/google/android/gms/internal/ads/zzabl;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v5, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    const/4 v6, 0x0

    iget-object v7, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwh:Lcom/google/android/gms/internal/ads/zzxn;

    move-object v3, p0

    move-object v4, p1

    move-object v8, p0

    move-object v9, p2

    invoke-static/range {v2 .. v9}, Lcom/google/android/gms/internal/ads/zzabl;->zza(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zza;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzaqw;Lcom/google/android/gms/internal/ads/zzxn;Lcom/google/android/gms/internal/ads/zzabm;Lcom/google/android/gms/internal/ads/zznx;)Lcom/google/android/gms/internal/ads/zzalc;

    move-result-object p1

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacu:Lcom/google/android/gms/internal/ads/zzalc;

    const-string p1, "AdRenderer: "

    iget-object p2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object p2, p2, Lcom/google/android/gms/ads/internal/zzbw;->zzacu:Lcom/google/android/gms/internal/ads/zzalc;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_2
    new-instance p2, Ljava/lang/String;

    invoke-direct {p2, p1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object p1, p2

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzck(Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    iget-object v3, p1, Lcom/google/android/gms/internal/ads/zzaji;->zzcos:Lcom/google/android/gms/internal/ads/zzaej;

    iget-object v3, v3, Lcom/google/android/gms/internal/ads/zzaej;->zzceo:Ljava/lang/String;

    invoke-direct {v2, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "slots"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    const/4 v3, 0x0

    :goto_1
    invoke-virtual {v2}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_5

    invoke-virtual {v2, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    const-string v5, "ads"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v6

    if-ge v5, v6, :cond_4

    invoke-virtual {v4, v5}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {p2, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_4

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_5
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdx()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    const/4 v10, 0x0

    :goto_3
    if-ge v10, v1, :cond_6

    new-instance v11, Lcom/google/android/gms/ads/internal/zzbe;

    move-object v2, v11

    move-object v3, p0

    move v4, v10

    move-object v5, p2

    move v6, v1

    move-object v7, p1

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/ads/internal/zzbe;-><init>(Lcom/google/android/gms/ads/internal/zzbc;ILorg/json/JSONArray;ILcom/google/android/gms/internal/ads/zzaji;)V

    invoke-static {v11}, Lcom/google/android/gms/internal/ads/zzaki;->zza(Ljava/util/concurrent/Callable;)Lcom/google/android/gms/internal/ads/zzanz;

    move-result-object v2

    invoke-interface {v9, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result p1

    if-ge v8, p1, :cond_7

    :try_start_1
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzanz;

    sget-object p2, Lcom/google/android/gms/internal/ads/zznk;->zzbao:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, p2}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    sget-object p2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {p1, v1, v2, p2}, Lcom/google/android/gms/internal/ads/zzanz;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzpb;

    sget-object p2, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v1, Lcom/google/android/gms/ads/internal/zzbf;

    invoke-direct {v1, p0, p1, v8, v9}, Lcom/google/android/gms/ads/internal/zzbf;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzpb;ILjava/util/List;)V

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_6

    :catch_0
    move-exception p1

    goto :goto_5

    :catch_1
    move-exception p1

    goto :goto_5

    :catch_2
    move-exception p1

    :goto_5
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzane;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_6

    :catch_3
    move-exception p1

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzane;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    :goto_6
    add-int/lit8 v8, v8, 0x1

    goto :goto_4

    :cond_7
    return-void

    :catch_4
    move-exception p1

    const-string p2, "Malformed native ad response"

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0, v8}, Lcom/google/android/gms/ads/internal/zza;->zzi(I)V

    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzod;)V
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "CustomRendering is NOT supported by NativeAdManager."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzox;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzb(Lcom/google/android/gms/internal/ads/zzox;)V

    :cond_0
    return-void
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzoz;)V
    .locals 4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzcob:Lorg/json/JSONObject;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzqd()Lcom/google/android/gms/internal/ads/zzes;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    new-instance v3, Lcom/google/android/gms/internal/ads/zzev;

    invoke-direct {v3, p1}, Lcom/google/android/gms/internal/ads/zzev;-><init>(Lcom/google/android/gms/internal/ads/zzoz;)V

    const/4 p1, 0x0

    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzes;->zza(Lcom/google/android/gms/internal/ads/zzjn;Lcom/google/android/gms/internal/ads/zzajh;Lcom/google/android/gms/internal/ads/zzgd;Lcom/google/android/gms/internal/ads/zzaqw;)V

    :cond_0
    return-void
.end method

.method protected final zza(Lcom/google/android/gms/internal/ads/zzajh;Lcom/google/android/gms/internal/ads/zzajh;)Z
    .locals 27

    move-object/from16 v7, p0

    move-object/from16 v8, p2

    const/4 v0, 0x0

    invoke-virtual {v7, v0}, Lcom/google/android/gms/ads/internal/zzbc;->zzd(Ljava/util/List;)V

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    invoke-virtual {v1}, Lcom/google/android/gms/ads/internal/zzbw;->zzfo()Z

    move-result v1

    if-eqz v1, :cond_1b

    iget-boolean v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzceq:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_14

    invoke-direct/range {p0 .. p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdx()V

    :try_start_0
    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-eqz v1, :cond_0

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzxq;->zzmu()Lcom/google/android/gms/internal/ads/zzyf;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object v5, v0

    :goto_0
    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-eqz v1, :cond_1

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzxq;->zzmo()Lcom/google/android/gms/internal/ads/zzxz;

    move-result-object v1

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object v6, v0

    :goto_1
    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-eqz v1, :cond_2

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzxq;->zzmp()Lcom/google/android/gms/internal/ads/zzyc;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object v9, v0

    :goto_2
    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-eqz v1, :cond_3

    iget-object v1, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzxq;->zzmt()Lcom/google/android/gms/internal/ads/zzqs;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v0

    :goto_3
    invoke-static/range {p2 .. p2}, Lcom/google/android/gms/ads/internal/zzbc;->zzc(Lcom/google/android/gms/internal/ads/zzajh;)Ljava/lang/String;

    move-result-object v3

    if-eqz v5, :cond_6

    iget-object v4, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzbw;->zzadg:Lcom/google/android/gms/internal/ads/zzrl;

    if-eqz v4, :cond_6

    new-instance v9, Lcom/google/android/gms/internal/ads/zzov;

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getHeadline()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getImages()Ljava/util/List;

    move-result-object v12

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getBody()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    move-object v14, v1

    goto :goto_4

    :cond_4
    move-object v14, v0

    :goto_4
    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getCallToAction()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getAdvertiser()Ljava/lang/String;

    move-result-object v16

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getStarRating()D

    move-result-wide v17

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getStore()Ljava/lang/String;

    move-result-object v19

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getPrice()Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x0

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v22

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_5
    move-object/from16 v23, v0

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v24

    invoke-interface {v5}, Lcom/google/android/gms/internal/ads/zzyf;->getExtras()Landroid/os/Bundle;

    move-result-object v26

    move-object v10, v9

    move-object/from16 v25, v3

    invoke-direct/range {v10 .. v26}, Lcom/google/android/gms/internal/ads/zzov;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    move-object v1, v0

    move-object/from16 v3, p0

    move-object v6, v9

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzyf;Lcom/google/android/gms/internal/ads/zzpb;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzov;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    :goto_5
    invoke-direct {v7, v9}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzov;)V

    goto/16 :goto_b

    :cond_6
    if-eqz v6, :cond_9

    iget-object v4, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzbw;->zzadg:Lcom/google/android/gms/internal/ads/zzrl;

    if-eqz v4, :cond_9

    new-instance v9, Lcom/google/android/gms/internal/ads/zzov;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getHeadline()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getImages()Ljava/util/List;

    move-result-object v12

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getBody()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    move-object v14, v1

    goto :goto_6

    :cond_7
    move-object v14, v0

    :goto_6
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getCallToAction()Ljava/lang/String;

    move-result-object v15

    const/16 v16, 0x0

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getStarRating()D

    move-result-wide v17

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getStore()Ljava/lang/String;

    move-result-object v19

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getPrice()Ljava/lang/String;

    move-result-object v20

    const/16 v21, 0x0

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v22

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_8
    move-object/from16 v23, v0

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v24

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getExtras()Landroid/os/Bundle;

    move-result-object v26

    move-object v10, v9

    move-object/from16 v25, v3

    invoke-direct/range {v10 .. v26}, Lcom/google/android/gms/internal/ads/zzov;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    move-object v1, v0

    move-object/from16 v3, p0

    move-object v5, v6

    move-object v6, v9

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzxz;Lcom/google/android/gms/internal/ads/zzpb;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzov;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    goto :goto_5

    :cond_9
    if-eqz v6, :cond_c

    iget-object v4, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    if-eqz v4, :cond_c

    new-instance v9, Lcom/google/android/gms/internal/ads/zzoo;

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getHeadline()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getImages()Ljava/util/List;

    move-result-object v12

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getBody()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzjz()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    move-object v14, v1

    goto :goto_7

    :cond_a
    move-object v14, v0

    :goto_7
    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getCallToAction()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getStarRating()D

    move-result-wide v16

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getStore()Ljava/lang/String;

    move-result-object v18

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getPrice()Ljava/lang/String;

    move-result-object v19

    const/16 v20, 0x0

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getExtras()Landroid/os/Bundle;

    move-result-object v21

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v22

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_b
    move-object/from16 v23, v0

    invoke-interface {v6}, Lcom/google/android/gms/internal/ads/zzxz;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v24

    move-object v10, v9

    move-object/from16 v25, v3

    invoke-direct/range {v10 .. v25}, Lcom/google/android/gms/internal/ads/zzoo;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    move-object v1, v0

    move-object/from16 v3, p0

    move-object v5, v6

    move-object v6, v9

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzxz;Lcom/google/android/gms/internal/ads/zzpb;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzoo;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    invoke-direct {v7, v9}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzoo;)V

    goto/16 :goto_b

    :cond_c
    if-eqz v9, :cond_f

    iget-object v4, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzbw;->zzadg:Lcom/google/android/gms/internal/ads/zzrl;

    if-eqz v4, :cond_f

    new-instance v6, Lcom/google/android/gms/internal/ads/zzov;

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getHeadline()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getImages()Ljava/util/List;

    move-result-object v12

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getBody()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzkg()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzkg()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    move-object v14, v1

    goto :goto_8

    :cond_d
    move-object v14, v0

    :goto_8
    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getCallToAction()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getAdvertiser()Ljava/lang/String;

    move-result-object v16

    const-wide/high16 v17, -0x4010000000000000L    # -1.0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v22

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_e
    move-object/from16 v23, v0

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v24

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getExtras()Landroid/os/Bundle;

    move-result-object v26

    move-object v10, v6

    move-object/from16 v25, v3

    invoke-direct/range {v10 .. v26}, Lcom/google/android/gms/internal/ads/zzov;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;Landroid/os/Bundle;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    move-object v1, v0

    move-object/from16 v3, p0

    move-object v5, v9

    move-object v9, v6

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzyc;Lcom/google/android/gms/internal/ads/zzpb;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzov;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    goto/16 :goto_5

    :cond_f
    if-eqz v9, :cond_12

    iget-object v4, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v4, Lcom/google/android/gms/ads/internal/zzbw;->zzadf:Lcom/google/android/gms/internal/ads/zzqz;

    if-eqz v4, :cond_12

    new-instance v6, Lcom/google/android/gms/internal/ads/zzoq;

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getHeadline()Ljava/lang/String;

    move-result-object v11

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getImages()Ljava/util/List;

    move-result-object v12

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getBody()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzkg()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzkg()Lcom/google/android/gms/internal/ads/zzpw;

    move-result-object v1

    move-object v14, v1

    goto :goto_9

    :cond_10
    move-object v14, v0

    :goto_9
    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getCallToAction()Ljava/lang/String;

    move-result-object v15

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getAdvertiser()Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getExtras()Landroid/os/Bundle;

    move-result-object v18

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v19

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzmw()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    :cond_11
    move-object/from16 v20, v0

    invoke-interface {v9}, Lcom/google/android/gms/internal/ads/zzyc;->zzke()Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object v21

    move-object v10, v6

    move-object/from16 v22, v3

    invoke-direct/range {v10 .. v22}, Lcom/google/android/gms/internal/ads/zzoq;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzpw;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzoj;Landroid/os/Bundle;Lcom/google/android/gms/internal/ads/zzlo;Landroid/view/View;Lcom/google/android/gms/dynamic/IObjectWrapper;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/ads/zzoy;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v4, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    move-object v1, v0

    move-object/from16 v3, p0

    move-object v5, v9

    move-object v9, v6

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/ads/zzoy;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzpa;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzyc;Lcom/google/android/gms/internal/ads/zzpb;)V

    invoke-virtual {v9, v0}, Lcom/google/android/gms/internal/ads/zzoq;->zzb(Lcom/google/android/gms/internal/ads/zzoz;)V

    invoke-direct {v7, v9}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzoq;)V

    goto/16 :goto_b

    :cond_12
    if-eqz v1, :cond_13

    iget-object v0, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    if-eqz v0, :cond_13

    iget-object v0, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzqs;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_13

    sget-object v0, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/zzbk;

    invoke-direct {v2, v7, v1}, Lcom/google/android/gms/ads/internal/zzbk;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Lcom/google/android/gms/internal/ads/zzqs;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_b

    :cond_13
    const-string v0, "No matching mapper/listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lcom/google/android/gms/ads/internal/zza;->zzi(I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return v2

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_b

    :cond_14
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzcoj:Lcom/google/android/gms/internal/ads/zzpb;

    iget-boolean v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzzy:Z

    if-eqz v1, :cond_15

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzzz:Lcom/google/android/gms/internal/ads/zzaoj;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V

    goto :goto_b

    :cond_15
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzoq;

    if-eqz v1, :cond_16

    iget-object v3, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->zzadg:Lcom/google/android/gms/internal/ads/zzrl;

    if-eqz v3, :cond_16

    :goto_a
    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzcoj:Lcom/google/android/gms/internal/ads/zzpb;

    invoke-static {v0}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzpb;)Lcom/google/android/gms/internal/ads/zzov;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzov;)V

    goto :goto_b

    :cond_16
    if-eqz v1, :cond_17

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzadf:Lcom/google/android/gms/internal/ads/zzqz;

    if-eqz v1, :cond_17

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzcoj:Lcom/google/android/gms/internal/ads/zzpb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzoq;

    invoke-direct {v7, v0}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzoq;)V

    goto :goto_b

    :cond_17
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzoo;

    if-eqz v1, :cond_18

    iget-object v3, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v3, Lcom/google/android/gms/ads/internal/zzbw;->zzadg:Lcom/google/android/gms/internal/ads/zzrl;

    if-eqz v3, :cond_18

    goto :goto_a

    :cond_18
    if-eqz v1, :cond_19

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzade:Lcom/google/android/gms/internal/ads/zzqw;

    if-eqz v1, :cond_19

    iget-object v0, v8, Lcom/google/android/gms/internal/ads/zzajh;->zzcoj:Lcom/google/android/gms/internal/ads/zzpb;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzoo;

    invoke-direct {v7, v0}, Lcom/google/android/gms/ads/internal/zzbc;->zza(Lcom/google/android/gms/internal/ads/zzoo;)V

    goto :goto_b

    :cond_19
    instance-of v1, v0, Lcom/google/android/gms/internal/ads/zzos;

    if-eqz v1, :cond_1a

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    if-eqz v1, :cond_1a

    iget-object v1, v7, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    check-cast v0, Lcom/google/android/gms/internal/ads/zzos;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzos;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzos;->getCustomTemplateId()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/ads/zzakk;->zzcrm:Landroid/os/Handler;

    new-instance v2, Lcom/google/android/gms/ads/internal/zzbj;

    invoke-direct {v2, v7, v0, v8}, Lcom/google/android/gms/ads/internal/zzbj;-><init>(Lcom/google/android/gms/ads/internal/zzbc;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzajh;)V

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :goto_b
    invoke-super/range {p0 .. p2}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/ads/zzajh;Lcom/google/android/gms/internal/ads/zzajh;)Z

    move-result v0

    return v0

    :cond_1a
    const-string v0, "No matching listener for retrieved native ad template."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    invoke-virtual {v7, v2}, Lcom/google/android/gms/ads/internal/zza;->zzi(I)V

    return v2

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Native ad DOES NOT have custom rendering mode."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    goto :goto_d

    :goto_c
    throw v0

    :goto_d
    goto :goto_c
.end method

.method protected final zza(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zzajh;Z)Z
    .locals 0

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvv:Lcom/google/android/gms/ads/internal/zzbl;

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzbl;->zzdz()Z

    move-result p1

    return p1
.end method

.method public final zza(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zznx;)Z
    .locals 1

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdq()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaac:I

    invoke-super {p0, p1, p2, v0}, Lcom/google/android/gms/ads/internal/zzd;->zza(Lcom/google/android/gms/internal/ads/zzjj;Lcom/google/android/gms/internal/ads/zznx;I)Z

    move-result p1

    return p1

    :catch_0
    move-exception p1

    const/4 p2, 0x4

    invoke-static {p2}, Lcom/google/android/gms/internal/ads/zzane;->isLoggable(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const-string p2, "Error initializing webview."

    const-string v0, "Ads"

    invoke-static {v0, p2, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method protected final zzb(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->unwrap(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    instance-of v0, p1, Lcom/google/android/gms/internal/ads/zzoz;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzoz;

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzoz;->zzkl()V

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    const/4 v0, 0x0

    invoke-super {p0, p1, v0}, Lcom/google/android/gms/ads/internal/zzd;->zzb(Lcom/google/android/gms/internal/ads/zzajh;Z)V

    return-void
.end method

.method protected final zzb(Z)V
    .locals 6

    invoke-super {p0, p1}, Lcom/google/android/gms/ads/internal/zzd;->zzb(Z)V

    iget-boolean p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwl:Z

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/android/gms/internal/ads/zznk;->zzbcb:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdt()V

    :cond_0
    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcp()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz p1, :cond_4

    :cond_1
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz p1, :cond_3

    const-string v0, "javascript"

    goto :goto_0

    :cond_3
    move-object p1, v0

    move-object v5, p1

    :goto_1
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getWebView()Landroid/webkit/WebView;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfa()Lcom/google/android/gms/internal/ads/zzaan;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzaan;->zzi(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget v0, v0, Lcom/google/android/gms/internal/ads/zzang;->zzcve:I

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget v1, v1, Lcom/google/android/gms/internal/ads/zzang;->zzcvf:I

    const/16 v2, 0x17

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "."

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfa()Lcom/google/android/gms/internal/ads/zzaan;

    move-result-object v0

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getWebView()Landroid/webkit/WebView;

    move-result-object v2

    const-string v3, ""

    const-string v4, "javascript"

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/internal/ads/zzaan;->zza(Ljava/lang/String;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/dynamic/IObjectWrapper;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    if-eqz p1, :cond_4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfa()Lcom/google/android/gms/internal/ads/zzaan;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    invoke-virtual {p1, v0}, Lcom/google/android/gms/internal/ads/zzaan;->zzm(Lcom/google/android/gms/dynamic/IObjectWrapper;)V

    :cond_4
    return-void
.end method

.method protected final zzbq()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/ads/internal/zza;->zzb(Z)V

    return-void
.end method

.method protected final zzc(IZ)V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzdx()V

    invoke-super {p0, p1, p2}, Lcom/google/android/gms/ads/internal/zzd;->zzc(IZ)V

    return-void
.end method

.method public final zzcd()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v1, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-nez v1, :cond_0

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzcd()V

    return-void

    :cond_0
    :try_start_0
    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    const/4 v1, 0x0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxq;->zzmo()Lcom/google/android/gms/internal/ads/zzxz;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzxz;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v1

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxq;->zzmp()Lcom/google/android/gms/internal/ads/zzyc;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {v2}, Lcom/google/android/gms/internal/ads/zzyc;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v1

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxq;->zzmt()Lcom/google/android/gms/internal/ads/zzqs;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzqs;->getVideoController()Lcom/google/android/gms/internal/ads/zzlo;

    move-result-object v1

    :cond_3
    :goto_0
    if-nez v1, :cond_4

    return-void

    :cond_4
    invoke-interface {v1}, Lcom/google/android/gms/internal/ads/zzlo;->zzio()Lcom/google/android/gms/internal/ads/zzlr;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzlr;->onVideoEnd()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_5
    return-void

    :catch_0
    move-exception v0

    const-string v1, "#007 Could not call remote method."

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzd(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public final zzce()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbty:Ljava/lang/String;

    const-string v1, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbs()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzce()V

    return-void
.end method

.method public final zzcj()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbty:Ljava/lang/String;

    const-string v1, "com.google.ads.mediation.admob.AdMobAdapter"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/ads/internal/zza;->zzbr()V

    return-void

    :cond_0
    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzcj()V

    return-void
.end method

.method public final zzcr()V
    .locals 3

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcp()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    if-nez v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v1, :cond_2

    :goto_0
    move-object v0, v1

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v1, :cond_3

    goto :goto_0

    :cond_3
    :goto_1
    if-eqz v0, :cond_4

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "onSdkImpression"

    invoke-interface {v0, v2, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Ljava/util/Map;)V

    :cond_4
    return-void
.end method

.method public final zzcs()V
    .locals 1

    invoke-super {p0}, Lcom/google/android/gms/ads/internal/zzd;->zzby()V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    :cond_0
    return-void
.end method

.method public final zzct()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->destroy()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    :cond_0
    return-void
.end method

.method public final zzcu()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcw()Lcom/google/android/gms/internal/ads/zzwy;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcw()Lcom/google/android/gms/internal/ads/zzwy;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbta:Z

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzcv()Z
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcw()Lcom/google/android/gms/internal/ads/zzwy;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/google/android/gms/ads/internal/zzbc;->zzcw()Lcom/google/android/gms/internal/ads/zzwy;

    move-result-object v0

    iget-boolean v0, v0, Lcom/google/android/gms/internal/ads/zzwy;->zzbtb:Z

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzd(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "setNativeTemplates must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iput-object p1, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzads:Ljava/util/List;

    return-void
.end method

.method final zzdq()V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/ads/zzarg;
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    const-string v1, "Initializing webview native ads utills"

    invoke-static {v1}, Lcom/google/android/gms/internal/ads/zzakb;->v(Ljava/lang/String;)V

    new-instance v1, Lcom/google/android/gms/internal/ads/zzacq;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v3, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iget-object v5, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaae:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v6, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v7, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    move-object v2, v1

    move-object v4, p0

    invoke-direct/range {v2 .. v7}, Lcom/google/android/gms/internal/ads/zzacq;-><init>(Landroid/content/Context;Lcom/google/android/gms/ads/internal/zzbc;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;)V

    iput-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public final zzdr()Lcom/google/android/gms/internal/ads/zzacm;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->mLock:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaad:Lcom/google/android/gms/internal/ads/zzacm;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method protected final zzds()Ljava/util/concurrent/Future;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/concurrent/Future<",
            "Lcom/google/android/gms/internal/ads/zzpb;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzzz:Lcom/google/android/gms/internal/ads/zzaoj;

    return-object v0
.end method

.method public final zzdt()V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzqd()Lcom/google/android/gms/internal/ads/zzes;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v2, v2, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v3}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object v3

    iget-object v4, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/android/gms/internal/ads/zzes;->zza(Lcom/google/android/gms/internal/ads/zzjn;Lcom/google/android/gms/internal/ads/zzajh;Landroid/view/View;Lcom/google/android/gms/internal/ads/zzaqw;)V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwl:Z

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwl:Z

    const-string v0, "Request to enable ActiveView before adState is available."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final zzdu()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwl:Z

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzqd()Lcom/google/android/gms/internal/ads/zzes;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzes;->zzh(Lcom/google/android/gms/internal/ads/zzajh;)V

    return-void

    :cond_0
    const-string v0, "Request to enable ActiveView before adState is available."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    return-void
.end method

.method public final zzdv()Landroidx/collection/SimpleArrayMap;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/collection/SimpleArrayMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzrf;",
            ">;"
        }
    .end annotation

    const-string v0, "getOnCustomTemplateAdLoadedListeners must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    return-object v0
.end method

.method public final zzdw()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zztm()Lcom/google/android/gms/internal/ads/zzarl;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzpl;->zzbjr:Lcom/google/android/gms/internal/ads/zzmu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zztm()Lcom/google/android/gms/internal/ads/zzarl;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbw;->zzadj:Lcom/google/android/gms/internal/ads/zzpl;

    iget-object v1, v1, Lcom/google/android/gms/internal/ads/zzpl;->zzbjr:Lcom/google/android/gms/internal/ads/zzmu;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/ads/zzarl;->zzb(Lcom/google/android/gms/internal/ads/zzmu;)V

    :cond_0
    return-void
.end method

.method public final zzf(Lcom/google/android/gms/internal/ads/zzaqw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaaa:Lcom/google/android/gms/internal/ads/zzaqw;

    return-void
.end method

.method public final zzg(Lcom/google/android/gms/internal/ads/zzaqw;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaab:Lcom/google/android/gms/internal/ads/zzaqw;

    return-void
.end method

.method protected final zzi(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/android/gms/ads/internal/zza;->zzc(IZ)V

    return-void
.end method

.method public final zzi(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzfa()Lcom/google/android/gms/internal/ads/zzaan;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzwb:Lcom/google/android/gms/dynamic/IObjectWrapper;

    invoke-virtual {v0, v1, p1}, Lcom/google/android/gms/internal/ads/zzaan;->zza(Lcom/google/android/gms/dynamic/IObjectWrapper;Landroid/view/View;)V

    :cond_0
    return-void
.end method

.method public final zzj(I)V
    .locals 1

    const-string v0, "setMaxNumberOfAds must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iput p1, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzaac:I

    return-void
.end method

.method public final zzr(Ljava/lang/String;)Lcom/google/android/gms/internal/ads/zzrc;
    .locals 1

    const-string v0, "getOnCustomClickListener must be called on the main UI thread."

    invoke-static {v0}, Lcom/google/android/gms/common/internal/Preconditions;->checkMainThread(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadh:Landroidx/collection/SimpleArrayMap;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbc;->zzvw:Lcom/google/android/gms/ads/internal/zzbw;

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbw;->zzadh:Landroidx/collection/SimpleArrayMap;

    invoke-virtual {v0, p1}, Landroidx/collection/SimpleArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzrc;

    return-object p1
.end method
