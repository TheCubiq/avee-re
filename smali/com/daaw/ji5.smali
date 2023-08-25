.class public final synthetic Lcom/daaw/ji5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/ki5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzccb;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/ki5;Lcom/google/android/gms/internal/ads/zzccb;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ji5;->a:Lcom/daaw/ki5;

    iput-object p2, p0, Lcom/daaw/ji5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    iput p3, p0, Lcom/daaw/ji5;->c:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/ji5;->a:Lcom/daaw/ki5;

    iget-object v1, p0, Lcom/daaw/ji5;->b:Lcom/google/android/gms/internal/ads/zzccb;

    iget v2, p0, Lcom/daaw/ji5;->c:I

    check-cast p1, Lcom/daaw/pk5;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/ki5;->a(Lcom/google/android/gms/internal/ads/zzccb;ILcom/daaw/pk5;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
