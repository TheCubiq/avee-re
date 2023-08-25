.class public final synthetic Lcom/daaw/zl5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# instance fields
.field public final synthetic a:Lcom/daaw/am5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccb;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/am5;Lcom/google/android/gms/internal/ads/zzccb;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/zl5;->a:Lcom/daaw/am5;

    iput-object p2, p0, Lcom/daaw/zl5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lcom/daaw/zl5;->a:Lcom/daaw/am5;

    iget-object v1, p0, Lcom/daaw/zl5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    check-cast p1, Lcom/daaw/on5;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/am5;->a(Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/on5;)Lcom/google/android/gms/internal/ads/zzcbj;

    move-result-object p1

    return-object p1
.end method
