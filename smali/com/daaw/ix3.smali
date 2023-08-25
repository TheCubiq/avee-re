.class public final Lcom/daaw/ix3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ag;

.field public final b:Lcom/daaw/gx3;


# direct methods
.method public constructor <init>(Lcom/daaw/ag;Lcom/daaw/gx3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ix3;->a:Lcom/daaw/ag;

    iput-object p2, p0, Lcom/daaw/ix3;->b:Lcom/daaw/gx3;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/daaw/ix3;
    .locals 0

    invoke-static {p0}, Lcom/daaw/ly3;->d(Landroid/content/Context;)Lcom/daaw/ly3;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/ly3;->b()Lcom/daaw/ix3;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(IJ)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix3;->b:Lcom/daaw/gx3;

    invoke-virtual {v0, p1, p2, p3}, Lcom/daaw/gx3;->b(IJ)V

    return-void
.end method

.method public final c()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ix3;->b:Lcom/daaw/gx3;

    invoke-virtual {v0}, Lcom/daaw/gx3;->a()V

    return-void
.end method

.method public final d(Lcom/google/android/gms/ads/internal/client/zzff;)V
    .locals 3

    iget-object p1, p0, Lcom/daaw/ix3;->b:Lcom/daaw/gx3;

    iget-object v0, p0, Lcom/daaw/ix3;->a:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->a()J

    move-result-wide v0

    const/4 v2, -0x1

    invoke-virtual {p1, v2, v0, v1}, Lcom/daaw/gx3;->b(IJ)V

    return-void
.end method

.method public final e()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/ix3;->b:Lcom/daaw/gx3;

    iget-object v1, p0, Lcom/daaw/ix3;->a:Lcom/daaw/ag;

    invoke-interface {v1}, Lcom/daaw/ag;->a()J

    move-result-wide v1

    const/4 v3, -0x1

    invoke-virtual {v0, v3, v1, v2}, Lcom/daaw/gx3;->b(IJ)V

    return-void
.end method
