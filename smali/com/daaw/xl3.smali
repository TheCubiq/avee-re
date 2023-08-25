.class public final Lcom/daaw/xl3;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljavax/annotation/ParametersAreNonnullByDefault;
.end annotation


# static fields
.field public static final b:Lcom/google/android/gms/ads/internal/util/zzbb;

.field public static final c:Lcom/google/android/gms/ads/internal/util/zzbb;


# instance fields
.field public final a:Lcom/daaw/jl3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/vl3;

    invoke-direct {v0}, Lcom/daaw/vl3;-><init>()V

    sput-object v0, Lcom/daaw/xl3;->b:Lcom/google/android/gms/ads/internal/util/zzbb;

    new-instance v0, Lcom/daaw/wl3;

    invoke-direct {v0}, Lcom/daaw/wl3;-><init>()V

    sput-object v0, Lcom/daaw/xl3;->c:Lcom/google/android/gms/ads/internal/util/zzbb;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/daaw/vo6;)V
    .locals 8
    .param p4    # Lcom/daaw/vo6;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lcom/daaw/jl3;

    sget-object v4, Lcom/daaw/xl3;->b:Lcom/google/android/gms/ads/internal/util/zzbb;

    sget-object v5, Lcom/daaw/xl3;->c:Lcom/google/android/gms/ads/internal/util/zzbb;

    move-object v0, v7

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/jl3;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/ads/zzchu;Ljava/lang/String;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/google/android/gms/ads/internal/util/zzbb;Lcom/daaw/vo6;)V

    iput-object v7, p0, Lcom/daaw/xl3;->a:Lcom/daaw/jl3;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)Lcom/daaw/nl3;
    .locals 2

    new-instance v0, Lcom/daaw/bm3;

    iget-object v1, p0, Lcom/daaw/xl3;->a:Lcom/daaw/jl3;

    invoke-direct {v0, v1, p1, p2, p3}, Lcom/daaw/bm3;-><init>(Lcom/daaw/jl3;Ljava/lang/String;Lcom/daaw/ql3;Lcom/daaw/pl3;)V

    return-object v0
.end method

.method public final b()Lcom/daaw/jm3;
    .locals 2

    new-instance v0, Lcom/daaw/jm3;

    iget-object v1, p0, Lcom/daaw/xl3;->a:Lcom/daaw/jl3;

    invoke-direct {v0, v1}, Lcom/daaw/jm3;-><init>(Lcom/daaw/jl3;)V

    return-object v0
.end method
