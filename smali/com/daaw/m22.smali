.class public final Lcom/daaw/m22;
.super Lcom/daaw/v70;
.source ""

# interfaces
.implements Lcom/daaw/gk1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/v70<",
        "Lcom/daaw/hk1;",
        ">;",
        "Lcom/daaw/gk1;"
    }
.end annotation


# static fields
.field public static final k:Lcom/daaw/k3$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$g<",
            "Lcom/daaw/o22;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "Lcom/daaw/o22;",
            "Lcom/daaw/hk1;",
            ">;"
        }
    .end annotation
.end field

.field public static final m:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "Lcom/daaw/hk1;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic n:I


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/k3$g;

    invoke-direct {v0}, Lcom/daaw/k3$g;-><init>()V

    sput-object v0, Lcom/daaw/m22;->k:Lcom/daaw/k3$g;

    new-instance v1, Lcom/daaw/k22;

    invoke-direct {v1}, Lcom/daaw/k22;-><init>()V

    sput-object v1, Lcom/daaw/m22;->l:Lcom/daaw/k3$a;

    new-instance v2, Lcom/daaw/k3;

    const-string v3, "ClientTelemetry.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/daaw/k3;-><init>(Ljava/lang/String;Lcom/daaw/k3$a;Lcom/daaw/k3$g;)V

    sput-object v2, Lcom/daaw/m22;->m:Lcom/daaw/k3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/hk1;)V
    .locals 2

    sget-object v0, Lcom/daaw/m22;->m:Lcom/daaw/k3;

    sget-object v1, Lcom/daaw/v70$a;->c:Lcom/daaw/v70$a;

    invoke-direct {p0, p1, v0, p2, v1}, Lcom/daaw/v70;-><init>(Landroid/content/Context;Lcom/daaw/k3;Lcom/daaw/k3$d;Lcom/daaw/v70$a;)V

    return-void
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/common/internal/TelemetryData;)Lcom/daaw/rj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/common/internal/TelemetryData;",
            ")",
            "Lcom/daaw/rj1<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    invoke-static {}, Lcom/daaw/sj1;->a()Lcom/daaw/sj1$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lcom/daaw/j12;->a:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/daaw/sj1$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/daaw/sj1$a;

    invoke-virtual {v0, v3}, Lcom/daaw/sj1$a;->c(Z)Lcom/daaw/sj1$a;

    new-instance v1, Lcom/daaw/h22;

    invoke-direct {v1, p1}, Lcom/daaw/h22;-><init>(Lcom/google/android/gms/common/internal/TelemetryData;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sj1$a;->b(Lcom/daaw/q31;)Lcom/daaw/sj1$a;

    invoke-virtual {v0}, Lcom/daaw/sj1$a;->a()Lcom/daaw/sj1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/daaw/v70;->d(Lcom/daaw/sj1;)Lcom/daaw/rj1;

    move-result-object p1

    return-object p1
.end method
