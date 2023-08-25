.class public final Lcom/daaw/xf$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/xf;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Landroid/accounts/Account;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field

.field public b:Lcom/daaw/j6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/j6<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;"
        }
    .end annotation
.end field

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Lcom/daaw/xc1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lcom/daaw/xc1;->k:Lcom/daaw/xc1;

    iput-object v0, p0, Lcom/daaw/xf$a;->e:Lcom/daaw/xc1;

    return-void
.end method


# virtual methods
.method public a()Lcom/daaw/xf;
    .locals 11

    new-instance v10, Lcom/daaw/xf;

    iget-object v1, p0, Lcom/daaw/xf$a;->a:Landroid/accounts/Account;

    iget-object v2, p0, Lcom/daaw/xf$a;->b:Lcom/daaw/j6;

    iget-object v6, p0, Lcom/daaw/xf$a;->c:Ljava/lang/String;

    iget-object v7, p0, Lcom/daaw/xf$a;->d:Ljava/lang/String;

    iget-object v8, p0, Lcom/daaw/xf$a;->e:Lcom/daaw/xc1;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lcom/daaw/xf;-><init>(Landroid/accounts/Account;Ljava/util/Set;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/xc1;Z)V

    return-object v10
.end method

.method public b(Ljava/lang/String;)Lcom/daaw/xf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/xf$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/util/Collection;)Lcom/daaw/xf$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/google/android/gms/common/api/Scope;",
            ">;)",
            "Lcom/daaw/xf$a;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/xf$a;->b:Lcom/daaw/j6;

    if-nez v0, :cond_0

    new-instance v0, Lcom/daaw/j6;

    invoke-direct {v0}, Lcom/daaw/j6;-><init>()V

    iput-object v0, p0, Lcom/daaw/xf$a;->b:Lcom/daaw/j6;

    :cond_0
    iget-object v0, p0, Lcom/daaw/xf$a;->b:Lcom/daaw/j6;

    invoke-virtual {v0, p1}, Lcom/daaw/j6;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final d(Landroid/accounts/Account;)Lcom/daaw/xf$a;
    .locals 0
    .param p1    # Landroid/accounts/Account;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    iput-object p1, p0, Lcom/daaw/xf$a;->a:Landroid/accounts/Account;

    return-object p0
.end method

.method public final e(Ljava/lang/String;)Lcom/daaw/xf$a;
    .locals 0

    iput-object p1, p0, Lcom/daaw/xf$a;->d:Ljava/lang/String;

    return-object p0
.end method
