.class public final Lcom/daaw/kt5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/c15;


# instance fields
.field public final a:Lcom/daaw/th6;

.field public final b:Lcom/daaw/dp3;

.field public final c:Lcom/google/android/gms/ads/AdFormat;

.field public d:Lcom/daaw/gr4;


# direct methods
.method public constructor <init>(Lcom/daaw/th6;Lcom/daaw/dp3;Lcom/google/android/gms/ads/AdFormat;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/kt5;->d:Lcom/daaw/gr4;

    iput-object p1, p0, Lcom/daaw/kt5;->a:Lcom/daaw/th6;

    iput-object p2, p0, Lcom/daaw/kt5;->b:Lcom/daaw/dp3;

    iput-object p3, p0, Lcom/daaw/kt5;->c:Lcom/google/android/gms/ads/AdFormat;

    return-void
.end method


# virtual methods
.method public final a(ZLandroid/content/Context;Lcom/daaw/br4;)V
    .locals 1

    :try_start_0
    sget-object p1, Lcom/google/android/gms/ads/AdFormat;->BANNER:Lcom/google/android/gms/ads/AdFormat;

    iget-object p1, p0, Lcom/daaw/kt5;->c:Lcom/google/android/gms/ads/AdFormat;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    const/4 p3, 0x1

    const/4 v0, 0x2

    if-eq p1, p3, :cond_1

    if-eq p1, v0, :cond_0

    const/4 p3, 0x6

    if-ne p1, p3, :cond_4

    iget-object p1, p0, Lcom/daaw/kt5;->b:Lcom/daaw/dp3;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/dp3;->q(Lcom/daaw/yd0;)Z

    move-result p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/kt5;->b:Lcom/daaw/dp3;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/dp3;->L1(Lcom/daaw/yd0;)Z

    move-result p1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lcom/daaw/kt5;->b:Lcom/daaw/dp3;

    invoke-static {p2}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object p2

    invoke-interface {p1, p2}, Lcom/daaw/dp3;->q1(Lcom/daaw/yd0;)Z

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/daaw/kt5;->d:Lcom/daaw/gr4;

    if-nez p1, :cond_2

    return-void

    :cond_2
    sget-object p1, Lcom/daaw/g93;->p1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/daaw/kt5;->a:Lcom/daaw/th6;

    iget p1, p1, Lcom/daaw/th6;->Z:I

    if-ne p1, v0, :cond_3

    iget-object p1, p0, Lcom/daaw/kt5;->d:Lcom/daaw/gr4;

    invoke-virtual {p1}, Lcom/daaw/gr4;->zza()V

    :cond_3
    return-void

    :cond_4
    new-instance p1, Lcom/daaw/b15;

    const-string p2, "Adapter failed to show."

    invoke-direct {p1, p2}, Lcom/daaw/b15;-><init>(Ljava/lang/String;)V

    throw p1

    :catchall_0
    move-exception p1

    new-instance p2, Lcom/daaw/b15;

    invoke-direct {p2, p1}, Lcom/daaw/b15;-><init>(Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final b(Lcom/daaw/gr4;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/kt5;->d:Lcom/daaw/gr4;

    return-void
.end method
