.class public final synthetic Lcom/daaw/kk5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/m08;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/m08;Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/kk5;->a:Lcom/daaw/m08;

    iput-object p2, p0, Lcom/daaw/kk5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 2

    iget-object v0, p0, Lcom/daaw/kk5;->a:Lcom/daaw/m08;

    iget-object v1, p0, Lcom/daaw/kk5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    check-cast p1, Lcom/daaw/gi5;

    invoke-interface {v0}, Lcom/daaw/m08;->zzb()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/ok5;

    invoke-interface {p1, v1}, Lcom/daaw/ok5;->a(Lcom/google/android/gms/internal/ads/zzccb;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
