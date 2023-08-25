.class public final synthetic Lcom/daaw/vq4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/jw4;


# static fields
.field public static final synthetic a:Lcom/daaw/vq4;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vq4;

    invoke-direct {v0}, Lcom/daaw/vq4;-><init>()V

    sput-object v0, Lcom/daaw/vq4;->a:Lcom/daaw/vq4;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Lcom/daaw/er4;

    const/16 v0, 0xb

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lcom/daaw/tj6;->d(ILjava/lang/String;Lcom/google/android/gms/ads/internal/client/zze;)Lcom/google/android/gms/ads/internal/client/zze;

    move-result-object v0

    invoke-interface {p1, v0}, Lcom/daaw/er4;->A(Lcom/google/android/gms/ads/internal/client/zze;)V

    return-void
.end method
