.class public final Lcom/google/android/gms/internal/ads/zzace;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mLock:Ljava/lang/Object;

.field private zzadx:I

.field private zzady:I

.field private zzadz:Lcom/google/android/gms/internal/ads/zzamj;

.field private final zzagj:Landroid/util/DisplayMetrics;

.field private final zzbjc:Lcom/google/android/gms/internal/ads/zzci;

.field private final zzbze:Lcom/google/android/gms/internal/ads/zzaji;

.field private final zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

.field private zzcbd:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private zzcbe:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private final zzvr:Lcom/google/android/gms/internal/ads/zznx;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzaji;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbc;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/ads/zzace;->mLock:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadx:I

    iput v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzady:I

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzace;->mContext:Landroid/content/Context;

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzace;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iput-object p3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iput-object p4, p0, Lcom/google/android/gms/internal/ads/zzace;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    iput-object p5, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

    new-instance p2, Lcom/google/android/gms/internal/ads/zzamj;

    const-wide/16 p3, 0xc8

    invoke-direct {p2, p3, p4}, Lcom/google/android/gms/internal/ads/zzamj;-><init>(J)V

    iput-object p2, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadz:Lcom/google/android/gms/internal/ads/zzamj;

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzek()Lcom/google/android/gms/internal/ads/zzakk;

    const-string p2, "window"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/WindowManager;

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zzakk;->zza(Landroid/view/WindowManager;)Landroid/util/DisplayMetrics;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/ads/zzace;->zzagj:Landroid/util/DisplayMetrics;

    return-void
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzace;)Lcom/google/android/gms/ads/internal/zzbc;
    .locals 0

    iget-object p0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

    return-object p0
.end method

.method static synthetic zza(Lcom/google/android/gms/internal/ads/zzace;Ljava/lang/ref/WeakReference;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/android/gms/internal/ads/zzace;->zza(Ljava/lang/ref/WeakReference;Z)V

    return-void
.end method

.method private final zza(Ljava/lang/ref/WeakReference;Z)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ref/WeakReference<",
            "Lcom/google/android/gms/internal/ads/zzaqw;",
            ">;Z)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_2

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadz:Lcom/google/android/gms/internal/ads/zzamj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzamj;->tryAcquire()Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->getView()Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {v0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzif()Lcom/google/android/gms/internal/ads/zzamu;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzagj:Landroid/util/DisplayMetrics;

    const/4 v2, 0x0

    aget v3, v1, v2

    invoke-static {v0, v3}, Lcom/google/android/gms/internal/ads/zzamu;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzif()Lcom/google/android/gms/internal/ads/zzamu;

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzagj:Landroid/util/DisplayMetrics;

    const/4 v4, 0x1

    aget v1, v1, v4

    invoke-static {v3, v1}, Lcom/google/android/gms/internal/ads/zzamu;->zzb(Landroid/util/DisplayMetrics;I)I

    move-result v1

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzace;->mLock:Ljava/lang/Object;

    monitor-enter v3

    :try_start_0
    iget v5, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadx:I

    if-ne v5, v0, :cond_3

    iget v5, p0, Lcom/google/android/gms/internal/ads/zzace;->zzady:I

    if-eq v5, v1, :cond_5

    :cond_3
    iput v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadx:I

    iput v1, p0, Lcom/google/android/gms/internal/ads/zzace;->zzady:I

    invoke-interface {p1}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object p1

    iget v0, p0, Lcom/google/android/gms/internal/ads/zzace;->zzadx:I

    iget v1, p0, Lcom/google/android/gms/internal/ads/zzace;->zzady:I

    if-nez p2, :cond_4

    const/4 v2, 0x1

    :cond_4
    invoke-interface {p1, v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzasc;->zza(IIZ)V

    :cond_5
    monitor-exit v3

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_6
    :goto_0
    return-void
.end method


# virtual methods
.method final synthetic zza(Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzaqw;Z)V
    .locals 0

    iget-object p3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {p3}, Lcom/google/android/gms/ads/internal/zzbc;->zzdw()V

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V

    return-void
.end method

.method final synthetic zza(Lorg/json/JSONObject;Lcom/google/android/gms/internal/ads/zzaoj;)V
    .locals 11

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzel()Lcom/google/android/gms/internal/ads/zzarc;

    iget-object v0, p0, Lcom/google/android/gms/internal/ads/zzace;->mContext:Landroid/content/Context;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvq()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object v1

    const-string v2, "native-video"

    const/4 v3, 0x0

    const/4 v4, 0x0

    iget-object v5, p0, Lcom/google/android/gms/internal/ads/zzace;->zzbjc:Lcom/google/android/gms/internal/ads/zzci;

    iget-object v6, p0, Lcom/google/android/gms/internal/ads/zzace;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaji;->zzcgs:Lcom/google/android/gms/internal/ads/zzaef;

    iget-object v6, v6, Lcom/google/android/gms/internal/ads/zzaef;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    iget-object v7, p0, Lcom/google/android/gms/internal/ads/zzace;->zzvr:Lcom/google/android/gms/internal/ads/zznx;

    const/4 v8, 0x0

    iget-object v9, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v9}, Lcom/google/android/gms/ads/internal/zza;->zzbi()Lcom/google/android/gms/ads/internal/zzw;

    move-result-object v9

    iget-object v10, p0, Lcom/google/android/gms/internal/ads/zzace;->zzbze:Lcom/google/android/gms/internal/ads/zzaji;

    iget-object v10, v10, Lcom/google/android/gms/internal/ads/zzaji;->zzcoq:Lcom/google/android/gms/internal/ads/zzhs;

    invoke-static/range {v0 .. v10}, Lcom/google/android/gms/internal/ads/zzarc;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzasi;Ljava/lang/String;ZZLcom/google/android/gms/internal/ads/zzci;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zznx;Lcom/google/android/gms/ads/internal/zzbo;Lcom/google/android/gms/ads/internal/zzw;Lcom/google/android/gms/internal/ads/zzhs;)Lcom/google/android/gms/internal/ads/zzaqw;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzasi;->zzvr()Lcom/google/android/gms/internal/ads/zzasi;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Lcom/google/android/gms/internal/ads/zzasi;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbc:Lcom/google/android/gms/ads/internal/zzbc;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/ads/internal/zzbc;->zzf(Lcom/google/android/gms/internal/ads/zzaqw;)V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbd:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    if-nez v3, :cond_0

    new-instance v3, Lcom/google/android/gms/internal/ads/zzack;

    invoke-direct {v3, p0, v1}, Lcom/google/android/gms/internal/ads/zzack;-><init>(Lcom/google/android/gms/internal/ads/zzace;Ljava/lang/ref/WeakReference;)V

    iput-object v3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbd:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    :cond_0
    iget-object v3, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbd:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    iget-object v4, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbe:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    if-nez v4, :cond_1

    new-instance v4, Lcom/google/android/gms/internal/ads/zzacl;

    invoke-direct {v4, p0, v1}, Lcom/google/android/gms/internal/ads/zzacl;-><init>(Lcom/google/android/gms/internal/ads/zzace;Ljava/lang/ref/WeakReference;)V

    iput-object v4, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbe:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    :cond_1
    iget-object v1, p0, Lcom/google/android/gms/internal/ads/zzace;->zzcbe:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-interface {v2, v3, v1}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    const-string v1, "/video"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblz:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/videoMeta"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbma:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/precache"

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaql;

    invoke-direct {v2}, Lcom/google/android/gms/internal/ads/zzaql;-><init>()V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/delayPageLoaded"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmd:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/instrument"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzbmb:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/log"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblu:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/videoClicked"

    sget-object v2, Lcom/google/android/gms/ads/internal/gmsg/zzf;->zzblv:Lcom/google/android/gms/ads/internal/gmsg/zzv;

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/trackActiveViewUnit"

    new-instance v2, Lcom/google/android/gms/internal/ads/zzaci;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzaci;-><init>(Lcom/google/android/gms/internal/ads/zzace;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    const-string v1, "/untrackActiveViewUnit"

    new-instance v2, Lcom/google/android/gms/internal/ads/zzacj;

    invoke-direct {v2, p0}, Lcom/google/android/gms/internal/ads/zzacj;-><init>(Lcom/google/android/gms/internal/ads/zzace;)V

    invoke-interface {v0, v1, v2}, Lcom/google/android/gms/internal/ads/zzaqw;->zza(Ljava/lang/String;Lcom/google/android/gms/ads/internal/gmsg/zzv;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/ads/zzacg;

    invoke-direct {v2, v0, p1}, Lcom/google/android/gms/internal/ads/zzacg;-><init>(Lcom/google/android/gms/internal/ads/zzaqw;Lorg/json/JSONObject;)V

    invoke-interface {v1, v2}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzase;)V

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object p1

    new-instance v1, Lcom/google/android/gms/internal/ads/zzach;

    invoke-direct {v1, p0, p2, v0}, Lcom/google/android/gms/internal/ads/zzach;-><init>(Lcom/google/android/gms/internal/ads/zzace;Lcom/google/android/gms/internal/ads/zzaoj;Lcom/google/android/gms/internal/ads/zzaqw;)V

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/ads/zzasc;->zza(Lcom/google/android/gms/internal/ads/zzasd;)V

    sget-object p1, Lcom/google/android/gms/internal/ads/zznk;->zzbbs:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzaqw;->loadUrl(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    const-string v0, "Exception occurred while getting video view"

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/ads/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/ads/zzaoj;->set(Ljava/lang/Object;)V

    return-void
.end method
