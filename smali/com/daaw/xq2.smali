.class public final Lcom/daaw/xq2;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/dr2;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/dr2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/xq2;->b:Lcom/daaw/dr2;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/xq2;)Lcom/daaw/dr2;
    .locals 0

    iget-object p0, p0, Lcom/daaw/xq2;->b:Lcom/daaw/dr2;

    return-object p0
.end method


# virtual methods
.method public final b(I)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/wq2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/wq2;-><init>(Lcom/daaw/xq2;I)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(IJJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/uq2;

    move-object v1, v8

    move-object v2, p0

    move v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/uq2;-><init>(Lcom/daaw/xq2;IJJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/sq2;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/sq2;-><init>(Lcom/daaw/xq2;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final e(Lcom/daaw/as2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/vq2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/vq2;-><init>(Lcom/daaw/xq2;Lcom/daaw/as2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final f(Lcom/daaw/as2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/rq2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/rq2;-><init>(Lcom/daaw/xq2;Lcom/daaw/as2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final g(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/xq2;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/tq2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/tq2;-><init>(Lcom/daaw/xq2;Lcom/google/android/gms/internal/ads/zzatd;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
