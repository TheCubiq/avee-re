.class public final Lcom/daaw/ap4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/pt4;


# instance fields
.field public final p:Landroid/content/Context;

.field public final q:Lcom/daaw/ri6;

.field public final r:Lcom/google/android/gms/internal/ads/zzchu;

.field public final s:Lcom/google/android/gms/ads/internal/util/zzg;

.field public final t:Lcom/daaw/fg5;

.field public final u:Lcom/daaw/vo6;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/daaw/ri6;Lcom/google/android/gms/internal/ads/zzchu;Lcom/google/android/gms/ads/internal/util/zzg;Lcom/daaw/fg5;Lcom/daaw/vo6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ap4;->p:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/ap4;->q:Lcom/daaw/ri6;

    iput-object p3, p0, Lcom/daaw/ap4;->r:Lcom/google/android/gms/internal/ads/zzchu;

    iput-object p4, p0, Lcom/daaw/ap4;->s:Lcom/google/android/gms/ads/internal/util/zzg;

    iput-object p5, p0, Lcom/daaw/ap4;->t:Lcom/daaw/fg5;

    iput-object p6, p0, Lcom/daaw/ap4;->u:Lcom/daaw/vo6;

    return-void
.end method


# virtual methods
.method public final F(Lcom/daaw/fi6;)V
    .locals 0

    return-void
.end method

.method public final e(Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 6

    sget-object p1, Lcom/daaw/g93;->v3:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/daaw/ap4;->s:Lcom/google/android/gms/ads/internal/util/zzg;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/util/zzg;->zzh()Lcom/daaw/kz3;

    move-result-object v4

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzt;->zza()Lcom/google/android/gms/ads/internal/zze;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ap4;->p:Landroid/content/Context;

    iget-object v2, p0, Lcom/daaw/ap4;->r:Lcom/google/android/gms/internal/ads/zzchu;

    iget-object p1, p0, Lcom/daaw/ap4;->q:Lcom/daaw/ri6;

    iget-object v3, p1, Lcom/daaw/ri6;->f:Ljava/lang/String;

    iget-object v5, p0, Lcom/daaw/ap4;->u:Lcom/daaw/vo6;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/gms/ads/internal/zze;->zzc(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/daaw/kz3;Lcom/daaw/vo6;)V

    :cond_0
    iget-object p1, p0, Lcom/daaw/ap4;->t:Lcom/daaw/fg5;

    invoke-virtual {p1}, Lcom/daaw/fg5;->r()V

    return-void
.end method
