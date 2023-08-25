.class public final synthetic Lcom/daaw/el5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/w57;


# instance fields
.field public final synthetic a:Lcom/daaw/fl5;

.field public final synthetic b:Lcom/google/android/gms/internal/ads/zzcbj;

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/fl5;Lcom/google/android/gms/internal/ads/zzcbj;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/el5;->a:Lcom/daaw/fl5;

    iput-object p2, p0, Lcom/daaw/el5;->b:Lcom/google/android/gms/internal/ads/zzcbj;

    iput p3, p0, Lcom/daaw/el5;->c:I

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Lcom/daaw/f77;
    .locals 3

    iget-object v0, p0, Lcom/daaw/el5;->a:Lcom/daaw/fl5;

    iget-object v1, p0, Lcom/daaw/el5;->b:Lcom/google/android/gms/internal/ads/zzcbj;

    iget v2, p0, Lcom/daaw/el5;->c:I

    check-cast p1, Lcom/daaw/pk5;

    invoke-virtual {v0, v1, v2, p1}, Lcom/daaw/fl5;->b(Lcom/google/android/gms/internal/ads/zzcbj;ILcom/daaw/pk5;)Lcom/daaw/f77;

    move-result-object p1

    return-object p1
.end method
