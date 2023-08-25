.class public final Lcom/daaw/nz5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/u35;

.field public final b:Lcom/daaw/az5;

.field public final c:Lcom/daaw/oq4;


# direct methods
.method public constructor <init>(Lcom/daaw/u35;Lcom/daaw/on6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/nz5;->a:Lcom/daaw/u35;

    new-instance v0, Lcom/daaw/az5;

    invoke-direct {v0, p2}, Lcom/daaw/az5;-><init>(Lcom/daaw/on6;)V

    iput-object v0, p0, Lcom/daaw/nz5;->b:Lcom/daaw/az5;

    invoke-virtual {p1}, Lcom/daaw/u35;->g()Lcom/daaw/sj3;

    move-result-object p1

    new-instance p2, Lcom/daaw/mz5;

    invoke-direct {p2, v0, p1}, Lcom/daaw/mz5;-><init>(Lcom/daaw/az5;Lcom/daaw/sj3;)V

    iput-object p2, p0, Lcom/daaw/nz5;->c:Lcom/daaw/oq4;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/oq4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz5;->c:Lcom/daaw/oq4;

    return-object v0
.end method

.method public final b()Lcom/daaw/fs4;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz5;->b:Lcom/daaw/az5;

    return-object v0
.end method

.method public final c()Lcom/daaw/l15;
    .locals 3

    new-instance v0, Lcom/daaw/l15;

    iget-object v1, p0, Lcom/daaw/nz5;->a:Lcom/daaw/u35;

    iget-object v2, p0, Lcom/daaw/nz5;->b:Lcom/daaw/az5;

    invoke-virtual {v2}, Lcom/daaw/az5;->k()Lcom/google/android/gms/ads/internal/client/zzbh;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lcom/daaw/l15;-><init>(Lcom/daaw/u35;Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-object v0
.end method

.method public final d()Lcom/daaw/az5;
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz5;->b:Lcom/daaw/az5;

    return-object v0
.end method

.method public final e(Lcom/google/android/gms/ads/internal/client/zzbh;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/nz5;->b:Lcom/daaw/az5;

    invoke-virtual {v0, p1}, Lcom/daaw/az5;->s(Lcom/google/android/gms/ads/internal/client/zzbh;)V

    return-void
.end method
