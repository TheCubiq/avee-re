.class public final Lcom/daaw/ax5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/qq5;


# instance fields
.field public final a:Lcom/daaw/fa3;

.field public final b:Lcom/daaw/g77;

.field public final c:Lcom/daaw/en6;

.field public final d:Lcom/daaw/jx5;


# direct methods
.method public constructor <init>(Lcom/daaw/en6;Lcom/daaw/g77;Lcom/daaw/fa3;Lcom/daaw/jx5;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ax5;->c:Lcom/daaw/en6;

    iput-object p2, p0, Lcom/daaw/ax5;->b:Lcom/daaw/g77;

    iput-object p3, p0, Lcom/daaw/ax5;->a:Lcom/daaw/fa3;

    iput-object p4, p0, Lcom/daaw/ax5;->d:Lcom/daaw/jx5;

    return-void
.end method

.method public static bridge synthetic d(Lcom/daaw/ax5;)Lcom/daaw/jx5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/ax5;->d:Lcom/daaw/jx5;

    return-object p0
.end method


# virtual methods
.method public final a(Lcom/daaw/fi6;Lcom/daaw/th6;)Z
    .locals 0

    iget-object p1, p0, Lcom/daaw/ax5;->a:Lcom/daaw/fa3;

    if-eqz p1, :cond_0

    iget-object p1, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lcom/daaw/yh6;->a:Ljava/lang/String;

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b(Lcom/daaw/fi6;Lcom/daaw/th6;)Lcom/daaw/f77;
    .locals 9

    new-instance v6, Lcom/daaw/e14;

    invoke-direct {v6}, Lcom/daaw/e14;-><init>()V

    new-instance v7, Lcom/daaw/fx5;

    invoke-direct {v7}, Lcom/daaw/fx5;-><init>()V

    new-instance v8, Lcom/daaw/zw5;

    move-object v0, v8

    move-object v1, p0

    move-object v2, v6

    move-object v3, p1

    move-object v4, p2

    move-object v5, v7

    invoke-direct/range {v0 .. v5}, Lcom/daaw/zw5;-><init>(Lcom/daaw/ax5;Lcom/daaw/e14;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/fx5;)V

    invoke-virtual {v7, v8}, Lcom/daaw/fx5;->a(Lcom/google/android/gms/ads/internal/zzf;)V

    new-instance p1, Lcom/daaw/w93;

    iget-object p2, p2, Lcom/daaw/th6;->t:Lcom/daaw/yh6;

    iget-object v0, p2, Lcom/daaw/yh6;->b:Ljava/lang/String;

    iget-object p2, p2, Lcom/daaw/yh6;->a:Ljava/lang/String;

    invoke-direct {p1, v7, v0, p2}, Lcom/daaw/w93;-><init>(Lcom/google/android/gms/ads/internal/zzf;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/daaw/ax5;->c:Lcom/daaw/en6;

    sget-object v0, Lcom/daaw/ym6;->I:Lcom/daaw/ym6;

    new-instance v1, Lcom/daaw/yw5;

    invoke-direct {v1, p0, p1}, Lcom/daaw/yw5;-><init>(Lcom/daaw/ax5;Lcom/daaw/w93;)V

    iget-object p1, p0, Lcom/daaw/ax5;->b:Lcom/daaw/g77;

    invoke-static {v1, p1, v0, p2}, Lcom/daaw/lm6;->d(Lcom/daaw/fm6;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object p1

    sget-object p2, Lcom/daaw/ym6;->J:Lcom/daaw/ym6;

    invoke-virtual {p1, p2}, Lcom/daaw/vm6;->b(Ljava/lang/Object;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1, v6}, Lcom/daaw/vm6;->d(Lcom/daaw/f77;)Lcom/daaw/vm6;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/vm6;->a()Lcom/daaw/gm6;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic c(Lcom/daaw/w93;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/ax5;->a:Lcom/daaw/fa3;

    invoke-interface {v0, p1}, Lcom/daaw/fa3;->a0(Lcom/daaw/ca3;)V

    return-void
.end method
