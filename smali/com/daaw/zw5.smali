.class public final Lcom/daaw/zw5;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/ads/internal/zzf;


# instance fields
.field public final synthetic a:Lcom/daaw/e14;

.field public final synthetic b:Lcom/daaw/fi6;

.field public final synthetic c:Lcom/daaw/th6;

.field public final synthetic d:Lcom/daaw/fx5;

.field public final synthetic e:Lcom/daaw/ax5;


# direct methods
.method public constructor <init>(Lcom/daaw/ax5;Lcom/daaw/e14;Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/fx5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/zw5;->e:Lcom/daaw/ax5;

    iput-object p2, p0, Lcom/daaw/zw5;->a:Lcom/daaw/e14;

    iput-object p3, p0, Lcom/daaw/zw5;->b:Lcom/daaw/fi6;

    iput-object p4, p0, Lcom/daaw/zw5;->c:Lcom/daaw/th6;

    iput-object p5, p0, Lcom/daaw/zw5;->d:Lcom/daaw/fx5;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza(Landroid/view/View;)V
    .locals 5

    iget-object v0, p0, Lcom/daaw/zw5;->a:Lcom/daaw/e14;

    iget-object v1, p0, Lcom/daaw/zw5;->e:Lcom/daaw/ax5;

    invoke-static {v1}, Lcom/daaw/ax5;->d(Lcom/daaw/ax5;)Lcom/daaw/jx5;

    move-result-object v1

    iget-object v2, p0, Lcom/daaw/zw5;->b:Lcom/daaw/fi6;

    iget-object v3, p0, Lcom/daaw/zw5;->c:Lcom/daaw/th6;

    iget-object v4, p0, Lcom/daaw/zw5;->d:Lcom/daaw/fx5;

    invoke-virtual {v1, v2, v3, p1, v4}, Lcom/daaw/jx5;->a(Lcom/daaw/fi6;Lcom/daaw/th6;Landroid/view/View;Lcom/daaw/fx5;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/daaw/e14;->b(Ljava/lang/Object;)Z

    return-void
.end method

.method public final zzb()V
    .locals 0

    return-void
.end method

.method public final zzc()V
    .locals 0

    return-void
.end method
