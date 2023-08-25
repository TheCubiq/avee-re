.class public final Lcom/daaw/nn8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vn8;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/f92;)I
    .locals 0

    iget-object p1, p1, Lcom/daaw/f92;->o:Lcom/google/android/gms/internal/ads/zzx;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
