.class public Lcom/daaw/wb;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/g01;
.implements Lcom/daaw/d0;
.implements Lcom/daaw/f01;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/wb$e;
    }
.end annotation


# static fields
.field public static final h:Lcom/daaw/nw1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/nw1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lcom/daaw/qb;

.field public b:Z

.field public final c:Lcom/daaw/wb$e;

.field public final d:Landroid/app/Activity;

.field public final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;"
        }
    .end annotation
.end field

.field public f:I

.field public g:I


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/nw1;

    invoke-direct {v0}, Lcom/daaw/nw1;-><init>()V

    sput-object v0, Lcom/daaw/wb;->h:Lcom/daaw/nw1;

    return-void
.end method

.method public constructor <init>(Landroid/app/Activity;Lcom/daaw/wb$e;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/daaw/wb;->e:Ljava/util/List;

    const/4 v0, 0x0

    iput v0, p0, Lcom/daaw/wb;->f:I

    const/4 v0, -0x1

    iput v0, p0, Lcom/daaw/wb;->g:I

    iput-object p1, p0, Lcom/daaw/wb;->d:Landroid/app/Activity;

    iput-object p2, p0, Lcom/daaw/wb;->c:Lcom/daaw/wb$e;

    invoke-static {p1}, Lcom/daaw/qb;->e(Landroid/content/Context;)Lcom/daaw/qb$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qb$a;->b()Lcom/daaw/qb$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/daaw/qb$a;->c(Lcom/daaw/g01;)Lcom/daaw/qb$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/qb$a;->a()Lcom/daaw/qb;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    new-instance p1, Lcom/daaw/vb;

    invoke-direct {p1, p0}, Lcom/daaw/vb;-><init>(Lcom/daaw/wb;)V

    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/daaw/ub;

    invoke-direct {v0, p2}, Lcom/daaw/ub;-><init>(Lcom/daaw/wb$e;)V

    invoke-virtual {p0, p1, v0}, Lcom/daaw/wb;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic d(Lcom/daaw/wb;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/wb;->q()V

    return-void
.end method

.method public static synthetic e(Lcom/daaw/wb;)Landroid/app/Activity;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb;->d:Landroid/app/Activity;

    return-object p0
.end method

.method public static synthetic f(Lcom/daaw/wb;)Lcom/daaw/qb;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    return-object p0
.end method

.method public static synthetic g(Lcom/daaw/wb;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Lcom/daaw/wb;->e:Ljava/util/List;

    return-object p0
.end method

.method public static synthetic h(Lcom/daaw/wb;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/wb;->f:I

    return p1
.end method

.method public static synthetic i(Lcom/daaw/wb;Z)Z
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/wb;->b:Z

    return p1
.end method

.method public static synthetic j(Lcom/daaw/wb;I)I
    .locals 0

    iput p1, p0, Lcom/daaw/wb;->g:I

    return p1
.end method

.method public static m(Lcom/daaw/kz0;)Lcom/daaw/kz0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/kz0;->d()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/daaw/kz0;->d()Ljava/util/List;

    move-result-object p0

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/kz0$d;

    invoke-virtual {p0}, Lcom/daaw/kz0$d;->b()Lcom/daaw/kz0$c;

    move-result-object p0

    invoke-virtual {p0}, Lcom/daaw/kz0$c;->a()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/daaw/kz0$b;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private synthetic q()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wb;->c:Lcom/daaw/wb$e;

    invoke-interface {v0}, Lcom/daaw/wb$e;->b()V

    invoke-virtual {p0}, Lcom/daaw/wb;->r()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/xb;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Purchase acknowledged "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/xb;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public b(Lcom/daaw/xb;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/xb;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_2

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/android/billingclient/api/Purchase;

    invoke-virtual {p0, p2}, Lcom/daaw/wb;->o(Lcom/android/billingclient/api/Purchase;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/daaw/wb;->c:Lcom/daaw/wb$e;

    iget-object p2, p0, Lcom/daaw/wb;->e:Ljava/util/List;

    iget v1, p0, Lcom/daaw/wb;->f:I

    const/4 v2, 0x2

    if-lt v1, v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-interface {p1, p2, v0}, Lcom/daaw/wb$e;->c(Ljava/util/List;Z)V

    goto :goto_2

    :cond_2
    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onPurchasesUpdated() got unknown resultCode: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    :goto_2
    return-void
.end method

.method public c(Lcom/daaw/xb;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/xb;",
            "Ljava/util/List<",
            "Lcom/android/billingclient/api/Purchase;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lcom/daaw/wb;->f:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/daaw/wb;->f:I

    iget-object v0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/wb;->b(Lcom/daaw/xb;Ljava/util/List;)V

    return-void

    :cond_1
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Billing client was null or result code ("

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/daaw/xb;->b()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ") was bad - quitting"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method public k()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/daaw/qb;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    invoke-virtual {v0}, Lcom/daaw/qb;->b()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    :cond_0
    return-void
.end method

.method public final l(Ljava/lang/Runnable;)V
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/wb;->b:Z

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/daaw/wb;->t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    :goto_0
    return-void
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lcom/daaw/wb;->g:I

    return v0
.end method

.method public final o(Lcom/android/billingclient/api/Purchase;)V
    .locals 2

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/daaw/wb;->u(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got a purchase: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "; but signature is bad. Skipping..."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Got a verified purchase: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->c()I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {}, Lcom/daaw/c0;->b()Lcom/daaw/c0$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/daaw/c0$a;->b(Ljava/lang/String;)Lcom/daaw/c0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/c0$a;->a()Lcom/daaw/c0;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    invoke-virtual {v1, v0, p0}, Lcom/daaw/qb;->a(Lcom/daaw/c0;Lcom/daaw/d0;)V

    :cond_1
    iget-object v0, p0, Lcom/daaw/wb;->e:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public p(Lcom/daaw/kz0;Lcom/android/billingclient/api/Purchase;)V
    .locals 1

    new-instance v0, Lcom/daaw/wb$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/wb$a;-><init>(Lcom/daaw/wb;Lcom/daaw/kz0;Lcom/android/billingclient/api/Purchase;)V

    invoke-virtual {p0, v0}, Lcom/daaw/wb;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public r()V
    .locals 1

    new-instance v0, Lcom/daaw/wb$c;

    invoke-direct {v0, p0}, Lcom/daaw/wb$c;-><init>(Lcom/daaw/wb;)V

    invoke-virtual {p0, v0}, Lcom/daaw/wb;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public s(Ljava/util/List;Lcom/daaw/lz0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/daaw/j01$b;",
            ">;",
            "Lcom/daaw/lz0;",
            ")V"
        }
    .end annotation

    new-instance v0, Lcom/daaw/wb$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/daaw/wb$b;-><init>(Lcom/daaw/wb;Ljava/util/List;Lcom/daaw/lz0;)V

    invoke-virtual {p0, v0}, Lcom/daaw/wb;->l(Ljava/lang/Runnable;)V

    return-void
.end method

.method public t(Ljava/lang/Runnable;Ljava/lang/Runnable;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/wb;->a:Lcom/daaw/qb;

    new-instance v1, Lcom/daaw/wb$d;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/wb$d;-><init>(Lcom/daaw/wb;Ljava/lang/Runnable;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1}, Lcom/daaw/qb;->h(Lcom/daaw/sb;)V

    return-void
.end method

.method public final u(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    sget-object v0, Lcom/daaw/wb;->h:Lcom/daaw/nw1;

    const-string v1, "M"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Lcom/daaw/nw1;->a(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :try_start_0
    invoke-static {v0, p1, p2}, Lcom/daaw/ca1;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return p1

    :catch_0
    const/4 p1, 0x0

    return p1
.end method
