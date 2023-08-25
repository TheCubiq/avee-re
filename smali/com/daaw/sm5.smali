.class public final synthetic Lcom/daaw/sm5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lcom/daaw/cn5;

.field public final synthetic b:Lcom/daaw/f77;

.field public final synthetic c:Lcom/daaw/f77;

.field public final synthetic d:Lcom/google/android/gms/internal/ads/zzccb;

.field public final synthetic e:Lcom/daaw/io6;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/cn5;Lcom/daaw/f77;Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/io6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sm5;->a:Lcom/daaw/cn5;

    iput-object p2, p0, Lcom/daaw/sm5;->b:Lcom/daaw/f77;

    iput-object p3, p0, Lcom/daaw/sm5;->c:Lcom/daaw/f77;

    iput-object p4, p0, Lcom/daaw/sm5;->d:Lcom/google/android/gms/internal/ads/zzccb;

    iput-object p5, p0, Lcom/daaw/sm5;->e:Lcom/daaw/io6;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/daaw/sm5;->a:Lcom/daaw/cn5;

    iget-object v1, p0, Lcom/daaw/sm5;->b:Lcom/daaw/f77;

    iget-object v2, p0, Lcom/daaw/sm5;->c:Lcom/daaw/f77;

    iget-object v3, p0, Lcom/daaw/sm5;->d:Lcom/google/android/gms/internal/ads/zzccb;

    iget-object v4, p0, Lcom/daaw/sm5;->e:Lcom/daaw/io6;

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/daaw/cn5;->k3(Lcom/daaw/f77;Lcom/daaw/f77;Lcom/google/android/gms/internal/ads/zzccb;Lcom/daaw/io6;)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method
