.class public final Lcom/google/android/gms/ads/internal/zzbw;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/view/ViewTreeObserver$OnScrollChangedListener;


# annotations
.annotation runtime Lcom/google/android/gms/internal/ads/zzadh;
.end annotation

.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# instance fields
.field final zzaco:Ljava/lang/String;

.field public zzacp:Ljava/lang/String;

.field final zzacq:Lcom/google/android/gms/internal/ads/zzci;

.field public final zzacr:Lcom/google/android/gms/internal/ads/zzang;

.field zzacs:Lcom/google/android/gms/ads/internal/zzbx;

.field public zzact:Lcom/google/android/gms/internal/ads/zzajx;

.field public zzacu:Lcom/google/android/gms/internal/ads/zzalc;

.field public zzacv:Lcom/google/android/gms/internal/ads/zzjn;

.field public zzacw:Lcom/google/android/gms/internal/ads/zzajh;

.field public zzacx:Lcom/google/android/gms/internal/ads/zzaji;

.field public zzacy:Lcom/google/android/gms/internal/ads/zzajj;

.field zzacz:Lcom/google/android/gms/internal/ads/zzke;

.field zzada:Lcom/google/android/gms/internal/ads/zzkh;

.field zzadb:Lcom/google/android/gms/internal/ads/zzla;

.field zzadc:Lcom/google/android/gms/internal/ads/zzkx;

.field zzadd:Lcom/google/android/gms/internal/ads/zzlg;

.field zzade:Lcom/google/android/gms/internal/ads/zzqw;

.field zzadf:Lcom/google/android/gms/internal/ads/zzqz;

.field zzadg:Lcom/google/android/gms/internal/ads/zzrl;

.field zzadh:Landroidx/collection/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SimpleArrayMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzrc;",
            ">;"
        }
    .end annotation
.end field

.field zzadi:Landroidx/collection/SimpleArrayMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/collection/SimpleArrayMap<",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/ads/zzrf;",
            ">;"
        }
    .end annotation
.end field

.field zzadj:Lcom/google/android/gms/internal/ads/zzpl;

.field zzadk:Lcom/google/android/gms/internal/ads/zzmu;

.field zzadl:Lcom/google/android/gms/internal/ads/zzlu;

.field zzadm:Lcom/google/android/gms/internal/ads/zzri;

.field zzadn:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field zzado:Lcom/google/android/gms/internal/ads/zzod;

.field zzadp:Lcom/google/android/gms/internal/ads/zzahe;

.field zzadq:Lcom/google/android/gms/internal/ads/zzagx;

.field public zzadr:Ljava/lang/String;

.field zzads:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public zzadt:Lcom/google/android/gms/internal/ads/zzaju;

.field zzadu:Landroid/view/View;

.field public zzadv:I

.field private zzadw:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/zzajj;",
            ">;"
        }
    .end annotation
.end field

.field private zzadx:I

.field private zzady:I

.field private zzadz:Lcom/google/android/gms/internal/ads/zzamj;

.field private zzaea:Z

.field private zzaeb:Z

.field private zzaec:Z

.field public final zzrt:Landroid/content/Context;

.field zzze:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzang;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zzbw;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzci;)V

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/ads/zzang;Lcom/google/android/gms/internal/ads/zzci;)V
    .locals 7

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p5, 0x0

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadt:Lcom/google/android/gms/internal/ads/zzaju;

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadu:Landroid/view/View;

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzze:Z

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadw:Ljava/util/HashSet;

    const/4 v1, -0x1

    iput v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadx:I

    iput v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzady:I

    const/4 v1, 0x1

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaea:Z

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaeb:Z

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaec:Z

    invoke-static {p1}, Lcom/google/android/gms/internal/ads/zznk;->initialize(Landroid/content/Context;)V

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajm;->zzpy()Lcom/google/android/gms/internal/ads/zznn;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/google/android/gms/internal/ads/zznk;->zzjc()Ljava/util/List;

    move-result-object v0

    iget v1, p4, Lcom/google/android/gms/internal/ads/zzang;->zzcve:I

    if-eqz v1, :cond_0

    iget v1, p4, Lcom/google/android/gms/internal/ads/zzang;->zzcve:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbv;->zzeo()Lcom/google/android/gms/internal/ads/zzajm;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/ads/zzajm;->zzpy()Lcom/google/android/gms/internal/ads/zznn;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zznn;->zzg(Ljava/util/List;)V

    :cond_1
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaco:Ljava/lang/String;

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzjn;->zzarc:Z

    if-nez v0, :cond_3

    iget-boolean v0, p2, Lcom/google/android/gms/internal/ads/zzjn;->zzare:Z

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    new-instance p5, Lcom/google/android/gms/ads/internal/zzbx;

    iget-object v4, p4, Lcom/google/android/gms/internal/ads/zzang;->zzcw:Ljava/lang/String;

    move-object v1, p5

    move-object v2, p1

    move-object v3, p3

    move-object v5, p0

    move-object v6, p0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/ads/internal/zzbx;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    iget v0, p2, Lcom/google/android/gms/internal/ads/zzjn;->widthPixels:I

    invoke-virtual {p5, v0}, Lcom/google/android/gms/ads/internal/zzbx;->setMinimumWidth(I)V

    iget-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    iget v0, p2, Lcom/google/android/gms/internal/ads/zzjn;->heightPixels:I

    invoke-virtual {p5, v0}, Lcom/google/android/gms/ads/internal/zzbx;->setMinimumHeight(I)V

    iget-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    const/4 v0, 0x4

    invoke-virtual {p5, v0}, Lcom/google/android/gms/ads/internal/zzbx;->setVisibility(I)V

    goto :goto_1

    :cond_3
    :goto_0
    iput-object p5, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    :goto_1
    iput-object p2, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacv:Lcom/google/android/gms/internal/ads/zzjn;

    iput-object p3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacp:Ljava/lang/String;

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    iput-object p4, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacr:Lcom/google/android/gms/internal/ads/zzang;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzci;

    new-instance p2, Lcom/google/android/gms/ads/internal/zzag;

    invoke-direct {p2, p0}, Lcom/google/android/gms/ads/internal/zzag;-><init>(Lcom/google/android/gms/ads/internal/zzbw;)V

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/ads/zzci;-><init>(Lcom/google/android/gms/internal/ads/zzce;)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    new-instance p1, Lcom/google/android/gms/internal/ads/zzamj;

    const-wide/16 p2, 0xc8

    invoke-direct {p1, p2, p3}, Lcom/google/android/gms/internal/ads/zzamj;-><init>(J)V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadz:Lcom/google/android/gms/internal/ads/zzamj;

    new-instance p1, Landroidx/collection/SimpleArrayMap;

    invoke-direct {p1}, Landroidx/collection/SimpleArrayMap;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadi:Landroidx/collection/SimpleArrayMap;

    return-void
.end method

.method private final zzf(Z)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadz:Lcom/google/android/gms/internal/ads/zzamj;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzamj;->tryAcquire()Z

    move-result v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v0

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzasc;->zzfz()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const/4 v0, 0x2

    new-array v0, v0, [I

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v2, v0}, Lcom/google/android/gms/ads/internal/zzbx;->getLocationOnScreen([I)V

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzif()Lcom/google/android/gms/internal/ads/zzamu;

    iget-object v2, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    aget v3, v0, v1

    invoke-static {v2, v3}, Lcom/google/android/gms/internal/ads/zzamu;->zzb(Landroid/content/Context;I)I

    move-result v2

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzif()Lcom/google/android/gms/internal/ads/zzamu;

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzrt:Landroid/content/Context;

    const/4 v4, 0x1

    aget v0, v0, v4

    invoke-static {v3, v0}, Lcom/google/android/gms/internal/ads/zzamu;->zzb(Landroid/content/Context;I)I

    move-result v0

    iget v3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadx:I

    if-ne v2, v3, :cond_2

    iget v3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzady:I

    if-eq v0, v3, :cond_3

    :cond_2
    iput v2, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadx:I

    iput v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzady:I

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->zzuf()Lcom/google/android/gms/internal/ads/zzasc;

    move-result-object v0

    iget v2, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadx:I

    iget v3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzady:I

    xor-int/2addr p1, v4

    invoke-interface {v0, v2, v3, p1}, Lcom/google/android/gms/internal/ads/zzasc;->zza(IIZ)V

    :cond_3
    iget-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/google/android/gms/ads/internal/zzbx;->getRootView()Landroid/view/View;

    move-result-object p1

    const v0, 0x1020002

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_5

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacs:Lcom/google/android/gms/ads/internal/zzbx;

    invoke-virtual {v3, v0}, Lcom/google/android/gms/ads/internal/zzbx;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    invoke-virtual {p1, v2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    iget p1, v0, Landroid/graphics/Rect;->top:I

    iget v3, v2, Landroid/graphics/Rect;->top:I

    if-eq p1, v3, :cond_4

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaea:Z

    :cond_4
    iget p1, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v2, Landroid/graphics/Rect;->bottom:I

    if-eq p1, v0, :cond_5

    iput-boolean v1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaeb:Z

    :cond_5
    :goto_0
    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzbw;->zzf(Z)V

    return-void
.end method

.method public final onScrollChanged()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/google/android/gms/ads/internal/zzbw;->zzf(Z)V

    iput-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaec:Z

    return-void
.end method

.method public final zza(Ljava/util/HashSet;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/zzajj;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadw:Ljava/util/HashSet;

    return-void
.end method

.method public final zzfl()Ljava/util/HashSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/HashSet<",
            "Lcom/google/android/gms/internal/ads/zzajj;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadw:Ljava/util/HashSet;

    return-object v0
.end method

.method public final zzfm()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->destroy()V

    :cond_0
    return-void
.end method

.method public final zzfn()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    if-eqz v0, :cond_0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbtx:Lcom/google/android/gms/internal/ads/zzxq;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzxq;->destroy()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    const-string v0, "Could not destroy mediation adapter."

    invoke-static {v0}, Lcom/google/android/gms/internal/ads/zzakb;->zzdk(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final zzfo()Z
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzfp()Z
    .locals 2

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final zzfq()Ljava/lang/String;
    .locals 2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaea:Z

    const-string v1, ""

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaeb:Z

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaea:Z

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaec:Z

    if-eqz v0, :cond_1

    const-string v0, "top-scrollable"

    return-object v0

    :cond_1
    const-string v0, "top-locked"

    return-object v0

    :cond_2
    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaeb:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzaec:Z

    if-eqz v0, :cond_3

    const-string v0, "bottom-scrollable"

    return-object v0

    :cond_3
    const-string v0, "bottom-locked"

    return-object v0

    :cond_4
    return-object v1
.end method

.method public final zzg(Z)V
    .locals 1

    iget v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzadv:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    iget-object v0, v0, Lcom/google/android/gms/internal/ads/zzajh;->zzbyo:Lcom/google/android/gms/internal/ads/zzaqw;

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzaqw;->stopLoading()V

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzact:Lcom/google/android/gms/internal/ads/zzajx;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzajx;->cancel()V

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacu:Lcom/google/android/gms/internal/ads/zzalc;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lcom/google/android/gms/internal/ads/zzalc;->cancel()V

    :cond_2
    if-eqz p1, :cond_3

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacw:Lcom/google/android/gms/internal/ads/zzajh;

    :cond_3
    return-void
.end method

.method final zzj(Landroid/view/View;)V
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/ads/zznk;->zzbat:Lcom/google/android/gms/internal/ads/zzna;

    invoke-static {}, Lcom/google/android/gms/internal/ads/zzkb;->zzik()Lcom/google/android/gms/internal/ads/zzni;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/ads/zzni;->zzd(Lcom/google/android/gms/internal/ads/zzna;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/ads/internal/zzbw;->zzacq:Lcom/google/android/gms/internal/ads/zzci;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/ads/zzci;->zzaa()Lcom/google/android/gms/internal/ads/zzce;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/ads/zzce;->zzb(Landroid/view/View;)V

    :cond_1
    return-void
.end method
