.class public final Lcom/daaw/wu5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/gj6;

.field public final b:Lcom/daaw/sa5;

.field public final c:Lcom/daaw/kd5;

.field public final d:Lcom/daaw/on6;


# direct methods
.method public constructor <init>(Lcom/daaw/gj6;Lcom/daaw/sa5;Lcom/daaw/kd5;Lcom/daaw/on6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/wu5;->a:Lcom/daaw/gj6;

    iput-object p2, p0, Lcom/daaw/wu5;->b:Lcom/daaw/sa5;

    iput-object p3, p0, Lcom/daaw/wu5;->c:Lcom/daaw/kd5;

    iput-object p4, p0, Lcom/daaw/wu5;->d:Lcom/daaw/on6;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/wh6;Lcom/daaw/th6;ILcom/daaw/uq5;J)V
    .locals 9
    .param p4    # Lcom/daaw/uq5;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    sget-object v0, Lcom/daaw/g93;->K7:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "adapter_sv"

    const-string v2, "adapter_v"

    const-string v3, "areec"

    const-string v4, "ancn"

    const-string v5, "arec"

    const-string v6, "sc"

    const-string v7, "adapter_l"

    const-string v8, "adapter_status"

    if-eqz v0, :cond_3

    invoke-static {v8}, Lcom/daaw/nn6;->b(Ljava/lang/String;)Lcom/daaw/nn6;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/nn6;->g(Lcom/daaw/wh6;)Lcom/daaw/nn6;

    invoke-virtual {v0, p2}, Lcom/daaw/nn6;->f(Lcom/daaw/th6;)Lcom/daaw/nn6;

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v7, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v6, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lcom/daaw/uq5;->b()Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p1, p0, Lcom/daaw/wu5;->a:Lcom/daaw/gj6;

    invoke-virtual {p4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/gj6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, v3, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_0
    iget-object p1, p0, Lcom/daaw/wu5;->b:Lcom/daaw/sa5;

    iget-object p2, p2, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/daaw/sa5;->b(Ljava/util/List;)Lcom/daaw/ra5;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p2, p1, Lcom/daaw/ra5;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, p2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    iget-object p2, p1, Lcom/daaw/ra5;->b:Lcom/google/android/gms/internal/ads/zzbye;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v2, p2}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_1
    iget-object p1, p1, Lcom/daaw/ra5;->c:Lcom/google/android/gms/internal/ads/zzbye;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/nn6;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/nn6;

    :cond_2
    iget-object p1, p0, Lcom/daaw/wu5;->d:Lcom/daaw/on6;

    invoke-interface {p1, v0}, Lcom/daaw/on6;->a(Lcom/daaw/nn6;)V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/daaw/wu5;->c:Lcom/daaw/kd5;

    invoke-virtual {v0}, Lcom/daaw/kd5;->a()Lcom/daaw/jd5;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/daaw/jd5;->e(Lcom/daaw/wh6;)Lcom/daaw/jd5;

    invoke-virtual {v0, p2}, Lcom/daaw/jd5;->d(Lcom/daaw/th6;)Lcom/daaw/jd5;

    const-string p1, "action"

    invoke-virtual {v0, p1, v8}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {p5, p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v7, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v6, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    if-eqz p4, :cond_4

    invoke-virtual {p4}, Lcom/daaw/uq5;->b()Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object p1

    iget p1, p1, Lcom/google/android/gms/ads/internal/client/zze;->zza:I

    invoke-static {p1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v5, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    iget-object p1, p0, Lcom/daaw/wu5;->a:Lcom/daaw/gj6;

    invoke-virtual {p4}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lcom/daaw/gj6;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {v0, v3, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_4
    iget-object p1, p0, Lcom/daaw/wu5;->b:Lcom/daaw/sa5;

    iget-object p2, p2, Lcom/daaw/th6;->u:Ljava/util/List;

    invoke-virtual {p1, p2}, Lcom/daaw/sa5;->b(Ljava/util/List;)Lcom/daaw/ra5;

    move-result-object p1

    if-eqz p1, :cond_6

    iget-object p2, p1, Lcom/daaw/ra5;->a:Ljava/lang/String;

    invoke-virtual {v0, v4, p2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    iget-object p2, p1, Lcom/daaw/ra5;->b:Lcom/google/android/gms/internal/ads/zzbye;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v2, p2}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_5
    iget-object p1, p1, Lcom/daaw/ra5;->c:Lcom/google/android/gms/internal/ads/zzbye;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/ads/zzbye;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lcom/daaw/jd5;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/jd5;

    :cond_6
    invoke-virtual {v0}, Lcom/daaw/jd5;->g()V

    return-void
.end method
