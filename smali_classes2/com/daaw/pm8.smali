.class public final Lcom/daaw/pm8;
.super Lcom/daaw/v70;
.source ""

# interfaces
.implements Lcom/daaw/l5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/v70<",
        "Lcom/daaw/k3$d$c;",
        ">;",
        "Lcom/daaw/l5;"
    }
.end annotation


# static fields
.field public static final m:Lcom/daaw/k3$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$g<",
            "Lcom/daaw/hl4;",
            ">;"
        }
    .end annotation
.end field

.field public static final n:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "Lcom/daaw/hl4;",
            "Lcom/daaw/k3$d$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final o:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "Lcom/daaw/k3$d$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final k:Landroid/content/Context;

.field public final l:Lcom/daaw/x70;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/daaw/k3$g;

    invoke-direct {v0}, Lcom/daaw/k3$g;-><init>()V

    sput-object v0, Lcom/daaw/pm8;->m:Lcom/daaw/k3$g;

    new-instance v1, Lcom/daaw/uh8;

    invoke-direct {v1}, Lcom/daaw/uh8;-><init>()V

    sput-object v1, Lcom/daaw/pm8;->n:Lcom/daaw/k3$a;

    new-instance v2, Lcom/daaw/k3;

    const-string v3, "AppSet.API"

    invoke-direct {v2, v3, v1, v0}, Lcom/daaw/k3;-><init>(Ljava/lang/String;Lcom/daaw/k3$a;Lcom/daaw/k3$g;)V

    sput-object v2, Lcom/daaw/pm8;->o:Lcom/daaw/k3;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/daaw/x70;)V
    .locals 3

    sget-object v0, Lcom/daaw/pm8;->o:Lcom/daaw/k3;

    sget-object v1, Lcom/daaw/k3$d;->a:Lcom/daaw/k3$d$c;

    sget-object v2, Lcom/daaw/v70$a;->c:Lcom/daaw/v70$a;

    invoke-direct {p0, p1, v0, v1, v2}, Lcom/daaw/v70;-><init>(Landroid/content/Context;Lcom/daaw/k3;Lcom/daaw/k3$d;Lcom/daaw/v70$a;)V

    iput-object p1, p0, Lcom/daaw/pm8;->k:Landroid/content/Context;

    iput-object p2, p0, Lcom/daaw/pm8;->l:Lcom/daaw/x70;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/rj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/rj1<",
            "Lcom/daaw/m5;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/pm8;->l:Lcom/daaw/x70;

    iget-object v1, p0, Lcom/daaw/pm8;->k:Landroid/content/Context;

    const v2, 0xcaf1200

    invoke-virtual {v0, v1, v2}, Lcom/daaw/x70;->h(Landroid/content/Context;I)I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/daaw/sj1;->a()Lcom/daaw/sj1$a;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/android/gms/common/Feature;

    sget-object v2, Lcom/daaw/he5;->a:Lcom/google/android/gms/common/Feature;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/daaw/sj1$a;->d([Lcom/google/android/gms/common/Feature;)Lcom/daaw/sj1$a;

    move-result-object v0

    new-instance v1, Lcom/daaw/hf8;

    invoke-direct {v1, p0}, Lcom/daaw/hf8;-><init>(Lcom/daaw/pm8;)V

    invoke-virtual {v0, v1}, Lcom/daaw/sj1$a;->b(Lcom/daaw/q31;)Lcom/daaw/sj1$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/daaw/sj1$a;->c(Z)Lcom/daaw/sj1$a;

    move-result-object v0

    const/16 v1, 0x6bd1

    invoke-virtual {v0, v1}, Lcom/daaw/sj1$a;->e(I)Lcom/daaw/sj1$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/sj1$a;->a()Lcom/daaw/sj1;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/daaw/v70;->e(Lcom/daaw/sj1;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Lcom/daaw/l3;

    new-instance v1, Lcom/google/android/gms/common/api/Status;

    const/16 v2, 0x11

    invoke-direct {v1, v2}, Lcom/google/android/gms/common/api/Status;-><init>(I)V

    invoke-direct {v0, v1}, Lcom/daaw/l3;-><init>(Lcom/google/android/gms/common/api/Status;)V

    invoke-static {v0}, Lcom/daaw/dk1;->d(Ljava/lang/Exception;)Lcom/daaw/rj1;

    move-result-object v0

    return-object v0
.end method
