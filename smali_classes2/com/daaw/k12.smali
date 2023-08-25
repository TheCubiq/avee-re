.class public final Lcom/daaw/k12;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/k3$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$g<",
            "Lcom/daaw/wc1;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lcom/daaw/k3$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$g<",
            "Lcom/daaw/wc1;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "Lcom/daaw/wc1;",
            "Lcom/daaw/xc1;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lcom/daaw/k3$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3$a<",
            "Lcom/daaw/wc1;",
            "Lcom/daaw/t02;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/common/api/Scope;

.field public static final f:Lcom/google/android/gms/common/api/Scope;

.field public static final g:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "Lcom/daaw/xc1;",
            ">;"
        }
    .end annotation
.end field

.field public static final h:Lcom/daaw/k3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/k3<",
            "Lcom/daaw/t02;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/daaw/k3$g;

    invoke-direct {v0}, Lcom/daaw/k3$g;-><init>()V

    sput-object v0, Lcom/daaw/k12;->a:Lcom/daaw/k3$g;

    new-instance v1, Lcom/daaw/k3$g;

    invoke-direct {v1}, Lcom/daaw/k3$g;-><init>()V

    sput-object v1, Lcom/daaw/k12;->b:Lcom/daaw/k3$g;

    new-instance v2, Lcom/daaw/nz1;

    invoke-direct {v2}, Lcom/daaw/nz1;-><init>()V

    sput-object v2, Lcom/daaw/k12;->c:Lcom/daaw/k3$a;

    new-instance v3, Lcom/daaw/zz1;

    invoke-direct {v3}, Lcom/daaw/zz1;-><init>()V

    sput-object v3, Lcom/daaw/k12;->d:Lcom/daaw/k3$a;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "profile"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lcom/daaw/k12;->e:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/google/android/gms/common/api/Scope;

    const-string v5, "email"

    invoke-direct {v4, v5}, Lcom/google/android/gms/common/api/Scope;-><init>(Ljava/lang/String;)V

    sput-object v4, Lcom/daaw/k12;->f:Lcom/google/android/gms/common/api/Scope;

    new-instance v4, Lcom/daaw/k3;

    const-string v5, "SignIn.API"

    invoke-direct {v4, v5, v2, v0}, Lcom/daaw/k3;-><init>(Ljava/lang/String;Lcom/daaw/k3$a;Lcom/daaw/k3$g;)V

    sput-object v4, Lcom/daaw/k12;->g:Lcom/daaw/k3;

    new-instance v0, Lcom/daaw/k3;

    const-string v2, "SignIn.INTERNAL_API"

    invoke-direct {v0, v2, v3, v1}, Lcom/daaw/k3;-><init>(Ljava/lang/String;Lcom/daaw/k3$a;Lcom/daaw/k3$g;)V

    sput-object v0, Lcom/daaw/k12;->h:Lcom/daaw/k3;

    return-void
.end method
