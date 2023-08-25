.class public final Lcom/daaw/k03;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Landroid/os/Handler;

.field public final b:Lcom/daaw/l03;


# direct methods
.method public constructor <init>(Landroid/os/Handler;Lcom/daaw/l03;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    iput-object p2, p0, Lcom/daaw/k03;->b:Lcom/daaw/l03;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/k03;)Lcom/daaw/l03;
    .locals 0

    iget-object p0, p0, Lcom/daaw/k03;->b:Lcom/daaw/l03;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;JJ)V
    .locals 9

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v8, Lcom/daaw/e03;

    move-object v1, v8

    move-object v2, p0

    move-object v3, p1

    move-wide v4, p2

    move-wide v6, p4

    invoke-direct/range {v1 .. v7}, Lcom/daaw/e03;-><init>(Lcom/daaw/k03;Ljava/lang/String;JJ)V

    invoke-virtual {v0, v8}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final c(Lcom/daaw/as2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/j03;

    invoke-direct {v1, p0, p1}, Lcom/daaw/j03;-><init>(Lcom/daaw/k03;Lcom/daaw/as2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final d(IJ)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/g03;

    invoke-direct {v1, p0, p1, p2, p3}, Lcom/daaw/g03;-><init>(Lcom/daaw/k03;IJ)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final e(Lcom/daaw/as2;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/d03;

    invoke-direct {v1, p0, p1}, Lcom/daaw/d03;-><init>(Lcom/daaw/k03;Lcom/daaw/as2;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final f(Lcom/google/android/gms/internal/ads/zzatd;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/f03;

    invoke-direct {v1, p0, p1}, Lcom/daaw/f03;-><init>(Lcom/daaw/k03;Lcom/google/android/gms/internal/ads/zzatd;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final g(Landroid/view/Surface;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/i03;

    invoke-direct {v1, p0, p1}, Lcom/daaw/i03;-><init>(Lcom/daaw/k03;Landroid/view/Surface;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public final h(IIIF)V
    .locals 8

    iget-object v0, p0, Lcom/daaw/k03;->a:Landroid/os/Handler;

    new-instance v7, Lcom/daaw/h03;

    move-object v1, v7

    move-object v2, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    invoke-direct/range {v1 .. v6}, Lcom/daaw/h03;-><init>(Lcom/daaw/k03;IIIF)V

    invoke-virtual {v0, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
