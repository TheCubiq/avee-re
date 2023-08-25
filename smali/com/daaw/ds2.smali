.class public final Lcom/daaw/ds2;
.super Lcom/daaw/ku2;
.source ""


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Lcom/daaw/an3;

.field public final synthetic e:Lcom/google/android/gms/ads/internal/client/zzaw;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/client/zzaw;Landroid/content/Context;Ljava/lang/String;Lcom/daaw/an3;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ds2;->e:Lcom/google/android/gms/ads/internal/client/zzaw;

    iput-object p2, p0, Lcom/daaw/ds2;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/daaw/ds2;->c:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/ds2;->d:Lcom/daaw/an3;

    invoke-direct {p0}, Lcom/daaw/ku2;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/ds2;->b:Landroid/content/Context;

    const-string v1, "rewarded"

    invoke-static {v0, v1}, Lcom/google/android/gms/ads/internal/client/zzaw;->i(Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/ads/internal/client/zzfc;

    invoke-direct {v0}, Lcom/google/android/gms/ads/internal/client/zzfc;-><init>()V

    return-object v0
.end method

.method public final bridge synthetic b(Lcom/google/android/gms/ads/internal/client/zzce;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lcom/daaw/ds2;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/daaw/nt0;->g3(Ljava/lang/Object;)Lcom/daaw/yd0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/ds2;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/ds2;->d:Lcom/daaw/an3;

    const v3, 0xd601280

    invoke-interface {p1, v0, v1, v2, v3}, Lcom/google/android/gms/ads/internal/client/zzce;->zzo(Lcom/daaw/yd0;Ljava/lang/String;Lcom/daaw/an3;I)Lcom/daaw/wv3;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ds2;->b:Landroid/content/Context;

    iget-object v1, p0, Lcom/daaw/ds2;->c:Ljava/lang/String;

    iget-object v2, p0, Lcom/daaw/ds2;->d:Lcom/daaw/an3;

    invoke-static {v0, v1, v2}, Lcom/daaw/iw3;->a(Landroid/content/Context;Ljava/lang/String;Lcom/daaw/an3;)Lcom/daaw/wv3;

    move-result-object v0

    return-object v0
.end method
