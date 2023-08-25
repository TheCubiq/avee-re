.class public final Lcom/daaw/ri3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/google/android/gms/internal/ads/zzbrm;


# direct methods
.method public constructor <init>(Lcom/daaw/vi3;Lcom/google/android/gms/internal/ads/zzbrm;)V
    .locals 0

    iput-object p2, p0, Lcom/daaw/ri3;->a:Lcom/google/android/gms/internal/ads/zzbrm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    check-cast p1, Lcom/daaw/pi3;

    new-instance v0, Lcom/daaw/e14;

    invoke-direct {v0}, Lcom/daaw/e14;-><init>()V

    iget-object v1, p0, Lcom/daaw/ri3;->a:Lcom/google/android/gms/internal/ads/zzbrm;

    new-instance v2, Lcom/daaw/qi3;

    invoke-direct {v2, p0, v0}, Lcom/daaw/qi3;-><init>(Lcom/daaw/ri3;Lcom/daaw/e14;)V

    invoke-virtual {p1, v1, v2}, Lcom/daaw/pi3;->h3(Lcom/google/android/gms/internal/ads/zzbrm;Lcom/daaw/oi3;)V

    return-object v0
.end method
