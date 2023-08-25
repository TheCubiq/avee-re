.class public Lcom/daaw/rb;
.super Lcom/daaw/qb;
.source ""


# instance fields
.field public volatile a:I

.field public final b:Ljava/lang/String;

.field public final c:Landroid/os/Handler;

.field public volatile d:Lcom/daaw/gk8;

.field public e:Landroid/content/Context;

.field public volatile f:Lcom/daaw/oe5;

.field public volatile g:Lcom/daaw/il2;

.field public h:Z

.field public i:Z

.field public j:I

.field public k:Z

.field public l:Z

.field public m:Z

.field public n:Z

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Landroid/content/Context;ZLcom/daaw/g01;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/is3;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/qb;-><init>()V

    const/4 p5, 0x0

    iput p5, p0, Lcom/daaw/rb;->a:I

    new-instance p6, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p6, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p6, p0, Lcom/daaw/rb;->c:Landroid/os/Handler;

    iput p5, p0, Lcom/daaw/rb;->j:I

    iput-object p4, p0, Lcom/daaw/rb;->b:Ljava/lang/String;

    const/4 p4, 0x0

    invoke-virtual {p0, p1, p3, p2, p4}, Lcom/daaw/rb;->i(Landroid/content/Context;Lcom/daaw/g01;ZLcom/daaw/is3;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/daaw/c33;)V
    .locals 1

    invoke-direct {p0}, Lcom/daaw/qb;-><init>()V

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/rb;->a:I

    new-instance p4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p4, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p4, p0, Lcom/daaw/rb;->c:Landroid/os/Handler;

    iput p1, p0, Lcom/daaw/rb;->j:I

    invoke-static {}, Lcom/daaw/rb;->r()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rb;->b:Ljava/lang/String;

    invoke-virtual {p3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    new-instance p3, Lcom/daaw/gk8;

    const/4 p4, 0x0

    invoke-direct {p3, p1, p4}, Lcom/daaw/gk8;-><init>(Landroid/content/Context;Lcom/daaw/c33;)V

    iput-object p3, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    iput-boolean p2, p0, Lcom/daaw/rb;->t:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZLandroid/content/Context;Lcom/daaw/g01;Lcom/daaw/is3;)V
    .locals 7

    invoke-static {}, Lcom/daaw/rb;->r()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v0, p0

    move-object v1, p3

    move v2, p2

    move-object v3, p4

    invoke-direct/range {v0 .. v6}, Lcom/daaw/rb;-><init>(Landroid/content/Context;ZLcom/daaw/g01;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/is3;)V

    return-void
.end method

.method public static bridge synthetic A(Lcom/daaw/rb;Ljava/lang/String;)Lcom/daaw/n63;
    .locals 13

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Querying owned items, item type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "BillingClient"

    invoke-static {v1, v0}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-boolean v2, p0, Lcom/daaw/rb;->m:Z

    iget-boolean v3, p0, Lcom/daaw/rb;->t:Z

    iget-object v4, p0, Lcom/daaw/rb;->b:Ljava/lang/String;

    invoke-static {v2, v3, v4}, Lcom/daaw/yx2;->f(ZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    const/4 v3, 0x0

    move-object v9, v3

    :cond_0
    :try_start_0
    iget-boolean v4, p0, Lcom/daaw/rb;->m:Z

    if-eqz v4, :cond_1

    iget-object v5, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    const/16 v6, 0x9

    iget-object v4, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    move-object v8, p1

    move-object v10, v2

    invoke-interface/range {v5 .. v10}, Lcom/daaw/oe5;->K2(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4

    goto :goto_0

    :cond_1
    iget-object v4, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    const/4 v5, 0x3

    iget-object v6, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v6, p1, v9}, Lcom/daaw/oe5;->W0(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :goto_0
    const-string v5, "getPurchase()"

    invoke-static {v4, v1, v5}, Lcom/daaw/s73;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/xb;

    move-result-object v5

    sget-object v6, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    if-eq v5, v6, :cond_2

    new-instance p0, Lcom/daaw/n63;

    invoke-direct {p0, v5, v3}, Lcom/daaw/n63;-><init>(Lcom/daaw/xb;Ljava/util/List;)V

    goto/16 :goto_2

    :cond_2
    const-string v5, "INAPP_PURCHASE_ITEM_LIST"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v5

    const-string v6, "INAPP_PURCHASE_DATA_LIST"

    invoke-virtual {v4, v6}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v6

    const-string v7, "INAPP_DATA_SIGNATURE_LIST"

    invoke-virtual {v4, v7}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v7

    const/4 v8, 0x0

    :goto_1
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v9

    if-ge v8, v9, :cond_4

    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "Sku is owned: "

    invoke-virtual {v12, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-static {v1, v11}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_1
    new-instance v11, Lcom/android/billingclient/api/Purchase;

    invoke-direct {v11, v9, v10}, Lcom/android/billingclient/api/Purchase;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v11}, Lcom/android/billingclient/api/Purchase;->d()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_3

    const-string v9, "BUG: empty/null token!"

    invoke-static {v1, v9}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    invoke-interface {v0, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :catch_0
    move-exception p0

    const-string p1, "Got an exception trying to decode the purchase!"

    invoke-static {v1, p1, p0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Lcom/daaw/n63;

    sget-object p1, Lcom/daaw/uz2;->j:Lcom/daaw/xb;

    invoke-direct {p0, p1, v3}, Lcom/daaw/n63;-><init>(Lcom/daaw/xb;Ljava/util/List;)V

    goto :goto_2

    :cond_4
    const-string v5, "INAPP_CONTINUATION_TOKEN"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "Continuation token: "

    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v9}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_0

    new-instance p0, Lcom/daaw/n63;

    sget-object p1, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    invoke-direct {p0, p1, v0}, Lcom/daaw/n63;-><init>(Lcom/daaw/xb;Ljava/util/List;)V

    goto :goto_2

    :catch_1
    move-exception p0

    const-string p1, "Got exception trying to get purchasesm try to reconnect"

    invoke-static {v1, p1, p0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance p0, Lcom/daaw/n63;

    sget-object p1, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    invoke-direct {p0, p1, v3}, Lcom/daaw/n63;-><init>(Lcom/daaw/xb;Ljava/util/List;)V

    :goto_2
    return-object p0
.end method

.method public static bridge synthetic B(Lcom/daaw/rb;)Lcom/daaw/oe5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    return-object p0
.end method

.method public static bridge synthetic E(Lcom/daaw/rb;Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 6

    const-wide/16 v2, 0x7530

    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/rb;->s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic F(Lcom/daaw/rb;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/rb;->a:I

    return-void
.end method

.method public static bridge synthetic G(Lcom/daaw/rb;I)V
    .locals 0

    iput p1, p0, Lcom/daaw/rb;->j:I

    return-void
.end method

.method public static bridge synthetic H(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->n:Z

    return-void
.end method

.method public static bridge synthetic I(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->o:Z

    return-void
.end method

.method public static bridge synthetic J(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->p:Z

    return-void
.end method

.method public static bridge synthetic K(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->q:Z

    return-void
.end method

.method public static bridge synthetic L(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->r:Z

    return-void
.end method

.method public static bridge synthetic M(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->s:Z

    return-void
.end method

.method public static bridge synthetic N(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->k:Z

    return-void
.end method

.method public static bridge synthetic O(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->l:Z

    return-void
.end method

.method public static bridge synthetic j(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->m:Z

    return-void
.end method

.method public static bridge synthetic k(Lcom/daaw/rb;Lcom/daaw/oe5;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    return-void
.end method

.method public static bridge synthetic l(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->i:Z

    return-void
.end method

.method public static bridge synthetic m(Lcom/daaw/rb;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/daaw/rb;->h:Z

    return-void
.end method

.method public static r()Ljava/lang/String;
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    :try_start_0
    const-string v0, "com.android.billingclient.ktx.BuildConfig"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "VERSION_NAME"

    invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const-string v0, "5.0.0"

    return-object v0
.end method

.method public static bridge synthetic u(Lcom/daaw/rb;)I
    .locals 0

    iget p0, p0, Lcom/daaw/rb;->j:I

    return p0
.end method

.method public static bridge synthetic v(Lcom/daaw/rb;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    return-object p0
.end method

.method public static bridge synthetic y(Lcom/daaw/rb;)Landroid/os/Handler;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb;->o()Landroid/os/Handler;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic z(Lcom/daaw/rb;)Lcom/daaw/xb;
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/rb;->q()Lcom/daaw/xb;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic C(Lcom/daaw/c0;Lcom/daaw/d0;)Ljava/lang/Object;
    .locals 7

    const-string v0, "BillingClient"

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    const/16 v3, 0x9

    iget-object v4, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/daaw/c0;->a()Ljava/lang/String;

    move-result-object v5

    iget-object v6, p0, Lcom/daaw/rb;->b:Ljava/lang/String;

    invoke-static {p1, v6}, Lcom/daaw/yx2;->c(Lcom/daaw/c0;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    invoke-interface {v2, v3, v4, v5, p1}, Lcom/daaw/oe5;->Y2(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p1, v0}, Lcom/daaw/yx2;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v2

    invoke-static {p1, v0}, Lcom/daaw/yx2;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    invoke-virtual {v0, p1}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object p1

    :goto_0
    invoke-interface {p2, p1}, Lcom/daaw/d0;->a(Lcom/daaw/xb;)V

    return-object v1

    :catch_0
    move-exception p1

    const-string v2, "Error acknowledge purchase!"

    invoke-static {v0, v2, p1}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object p1, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    goto :goto_0
.end method

.method public final synthetic D(Lcom/daaw/j01;Lcom/daaw/lz0;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    const-string v2, "BillingClient"

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/j01;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/daaw/j01;->b()Lcom/daaw/rt8;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v11

    const/4 v12, 0x0

    const/4 v4, 0x0

    :goto_0
    const/4 v13, 0x4

    const-string v14, "Item is unavailable for purchase."

    const/4 v15, 0x0

    const/16 v16, 0x6

    if-ge v4, v11, :cond_7

    add-int/lit8 v9, v4, 0x14

    if-le v9, v11, :cond_0

    move v5, v11

    goto :goto_1

    :cond_0
    move v5, v9

    :goto_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v10, v4, v5}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v5

    const/4 v7, 0x0

    :goto_2
    if-ge v7, v5, :cond_1

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/daaw/j01$b;

    invoke-virtual {v8}, Lcom/daaw/j01$b;->b()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_1
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    const-string v5, "ITEM_ID_LIST"

    invoke-virtual {v8, v5, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    iget-object v4, v1, Lcom/daaw/rb;->b:Ljava/lang/String;

    const-string v5, "playBillingLibraryVersion"

    invoke-virtual {v8, v5, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v4, v1, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    iget-object v5, v1, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    iget-object v5, v1, Lcom/daaw/rb;->b:Ljava/lang/String;

    const/16 v17, 0x11

    invoke-static {v5, v6, v15}, Lcom/daaw/yx2;->e(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v18

    move/from16 v5, v17

    move-object v6, v7

    move-object v7, v0

    move/from16 v17, v9

    move-object/from16 v9, v18

    invoke-interface/range {v4 .. v9}, Lcom/daaw/oe5;->b0(ILjava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-nez v4, :cond_2

    const-string v0, "queryProductDetailsAsync got empty product details response."

    :goto_3
    invoke-static {v2, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v12, 0x4

    goto/16 :goto_6

    :cond_2
    const-string v5, "DETAILS_LIST"

    invoke-virtual {v4, v5}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_4

    invoke-static {v4, v2}, Lcom/daaw/yx2;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v12

    invoke-static {v4, v2}, Lcom/daaw/yx2;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    if-eqz v12, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_3
    const-string v0, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync."

    invoke-static {v2, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v4

    if-nez v4, :cond_5

    const-string v0, "queryProductDetailsAsync got null response list"

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_4
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v6

    if-ge v5, v6, :cond_6

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    :try_start_1
    new-instance v7, Lcom/daaw/kz0;

    invoke-direct {v7, v6}, Lcom/daaw/kz0;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v8, "Got product details: "

    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :catch_0
    move-exception v0

    const-string v4, "Got a JSON exception trying to decode ProductDetails. \n Exception: "

    invoke-static {v2, v4, v0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v14, "Error trying to decode SkuDetails."

    goto :goto_5

    :cond_6
    move/from16 v4, v17

    goto/16 :goto_0

    :catch_1
    move-exception v0

    const-string v4, "queryProductDetailsAsync got a remote exception (try to reconnect)."

    invoke-static {v2, v4, v0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string v14, "An internal error occurred."

    :goto_5
    const/4 v12, 0x6

    goto :goto_6

    :cond_7
    const-string v14, ""

    :goto_6
    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v12}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    invoke-virtual {v0, v14}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    move-object/from16 v2, p2

    invoke-interface {v2, v0, v3}, Lcom/daaw/lz0;->a(Lcom/daaw/xb;Ljava/util/List;)V

    return-object v15
.end method

.method public final a(Lcom/daaw/c0;Lcom/daaw/d0;)V
    .locals 6

    invoke-virtual {p0}, Lcom/daaw/rb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    :goto_0
    invoke-interface {p2, p1}, Lcom/daaw/d0;->a(Lcom/daaw/xb;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/daaw/c0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid purchase token."

    invoke-static {p1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/uz2;->i:Lcom/daaw/xb;

    goto :goto_0

    :cond_1
    iget-boolean v0, p0, Lcom/daaw/rb;->m:Z

    if-nez v0, :cond_2

    sget-object p1, Lcom/daaw/uz2;->b:Lcom/daaw/xb;

    goto :goto_0

    :cond_2
    new-instance v1, Lcom/daaw/ry8;

    invoke-direct {v1, p0, p1, p2}, Lcom/daaw/ry8;-><init>(Lcom/daaw/rb;Lcom/daaw/c0;Lcom/daaw/d0;)V

    new-instance v4, Lcom/daaw/zz8;

    invoke-direct {v4, p2}, Lcom/daaw/zz8;-><init>(Lcom/daaw/d0;)V

    const-wide/16 v2, 0x7530

    invoke-virtual {p0}, Lcom/daaw/rb;->o()Landroid/os/Handler;

    move-result-object v5

    move-object v0, p0

    invoke-virtual/range {v0 .. v5}, Lcom/daaw/rb;->s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_3

    invoke-virtual {p0}, Lcom/daaw/rb;->q()Lcom/daaw/xb;

    move-result-object p1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final b()V
    .locals 5

    const-string v0, "BillingClient"

    const/4 v1, 0x3

    :try_start_0
    iget-object v2, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    invoke-virtual {v2}, Lcom/daaw/gk8;->d()V

    iget-object v2, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    invoke-virtual {v2}, Lcom/daaw/il2;->c()V

    :cond_0
    iget-object v2, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    iget-object v2, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    if-eqz v2, :cond_1

    const-string v2, "Unbinding from service."

    invoke-static {v0, v2}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    iget-object v4, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    invoke-virtual {v2, v4}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    iput-object v3, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    :cond_1
    iput-object v3, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    iget-object v2, p0, Lcom/daaw/rb;->v:Ljava/util/concurrent/ExecutorService;

    if-eqz v2, :cond_2

    invoke-interface {v2}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    iput-object v3, p0, Lcom/daaw/rb;->v:Ljava/util/concurrent/ExecutorService;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    iput v1, p0, Lcom/daaw/rb;->a:I

    return-void

    :catchall_0
    move-exception v0

    goto :goto_0

    :catch_0
    move-exception v2

    :try_start_1
    const-string v3, "There was an exception while ending connection!"

    invoke-static {v0, v3, v2}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iput v1, p0, Lcom/daaw/rb;->a:I

    return-void

    :goto_0
    iput v1, p0, Lcom/daaw/rb;->a:I

    throw v0
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lcom/daaw/rb;->a:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final d(Landroid/app/Activity;Lcom/daaw/tb;)Lcom/daaw/xb;
    .locals 31

    move-object/from16 v8, p0

    move-object/from16 v0, p1

    const-string v1, "proxyPackageVersion"

    const-string v9, "BUY_INTENT"

    invoke-virtual/range {p0 .. p0}, Lcom/daaw/rb;->c()Z

    move-result v2

    if-nez v2, :cond_0

    :goto_0
    sget-object v0, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    :goto_1
    invoke-virtual {v8, v0}, Lcom/daaw/rb;->p(Lcom/daaw/xb;)Lcom/daaw/xb;

    return-object v0

    :cond_0
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/tb;->f()Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/daaw/tb;->g()Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v4}, Lcom/daaw/wz8;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/android/billingclient/api/SkuDetails;

    invoke-static {v3, v4}, Lcom/daaw/wz8;->a(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/daaw/tb$b;

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v10

    goto :goto_2

    :cond_1
    invoke-virtual {v6}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/kz0;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v10

    :goto_2
    const-string v11, "subs"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    const-string v12, "BillingClient"

    if-eqz v11, :cond_3

    iget-boolean v11, v8, Lcom/daaw/rb;->h:Z

    if-eqz v11, :cond_2

    goto :goto_3

    :cond_2
    const-string v0, "Current client doesn\'t support subscriptions."

    invoke-static {v12, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->o:Lcom/daaw/xb;

    goto :goto_1

    :cond_3
    :goto_3
    invoke-virtual/range {p2 .. p2}, Lcom/daaw/tb;->p()Z

    move-result v11

    if-eqz v11, :cond_5

    iget-boolean v11, v8, Lcom/daaw/rb;->k:Z

    if-eqz v11, :cond_4

    goto :goto_4

    :cond_4
    const-string v0, "Current client doesn\'t support extra params for buy intent."

    invoke-static {v12, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->h:Lcom/daaw/xb;

    goto :goto_1

    :cond_5
    :goto_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v11

    const/4 v13, 0x1

    if-le v11, v13, :cond_7

    iget-boolean v11, v8, Lcom/daaw/rb;->r:Z

    if-eqz v11, :cond_6

    goto :goto_5

    :cond_6
    const-string v0, "Current client doesn\'t support multi-item purchases."

    invoke-static {v12, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->t:Lcom/daaw/xb;

    goto :goto_1

    :cond_7
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_9

    iget-boolean v11, v8, Lcom/daaw/rb;->s:Z

    if-eqz v11, :cond_8

    goto :goto_6

    :cond_8
    const-string v0, "Current client doesn\'t support purchases with ProductDetails."

    invoke-static {v12, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->v:Lcom/daaw/xb;

    goto/16 :goto_1

    :cond_9
    :goto_6
    iget-boolean v11, v8, Lcom/daaw/rb;->k:Z

    if-eqz v11, :cond_23

    iget-boolean v11, v8, Lcom/daaw/rb;->m:Z

    iget-boolean v14, v8, Lcom/daaw/rb;->t:Z

    iget-boolean v15, v8, Lcom/daaw/rb;->u:Z

    iget-object v4, v8, Lcom/daaw/rb;->b:Ljava/lang/String;

    move-object/from16 v13, p2

    invoke-static {v13, v11, v14, v15, v4}, Lcom/daaw/yx2;->d(Lcom/daaw/tb;ZZZLjava/lang/String;)Landroid/os/Bundle;

    move-result-object v11

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    const-string v14, "additionalSkuTypes"

    const-string v15, "additionalSkus"

    const-string v13, "skuDetailsTokens"

    move-object/from16 v17, v9

    const-string v9, "SKU_OFFER_ID_TOKEN_LIST"

    if-nez v4, :cond_13

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v18, v10

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v19, v7

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v20, v1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v21

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    :goto_7
    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->hasNext()Z

    move-result v26

    if-eqz v26, :cond_c

    invoke-interface/range {v21 .. v21}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v26

    check-cast v26, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v27 .. v27}, Ljava/lang/String;->isEmpty()Z

    move-result v27

    if-nez v27, :cond_a

    move-object/from16 v27, v12

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->h()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_a
    move-object/from16 v27, v12

    :goto_8
    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->e()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v28, v6

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->d()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->c()I

    move-result v29

    move-object/from16 v30, v5

    invoke-virtual/range {v26 .. v26}, Lcom/android/billingclient/api/SkuDetails;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v12}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v12

    const/16 v16, 0x1

    xor-int/lit8 v12, v12, 0x1

    or-int v22, v22, v12

    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    or-int v23, v23, v6

    invoke-static/range {v29 .. v29}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v29, :cond_b

    const/4 v6, 0x1

    goto :goto_9

    :cond_b
    const/4 v6, 0x0

    :goto_9
    or-int v24, v24, v6

    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    xor-int/lit8 v6, v6, 0x1

    or-int v25, v25, v6

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v12, v27

    move-object/from16 v6, v28

    move-object/from16 v5, v30

    goto :goto_7

    :cond_c
    move-object/from16 v30, v5

    move-object/from16 v28, v6

    move-object/from16 v27, v12

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_d

    invoke-virtual {v11, v13, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_d
    if-eqz v22, :cond_e

    invoke-virtual {v11, v9, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_e
    if-eqz v23, :cond_f

    const-string v0, "SKU_OFFER_ID_LIST"

    invoke-virtual {v11, v0, v10}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_f
    if-eqz v24, :cond_10

    const-string v0, "SKU_OFFER_TYPE_LIST"

    invoke-virtual {v11, v0, v7}, Landroid/os/Bundle;->putIntegerArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_10
    if-eqz v25, :cond_11

    const-string v0, "SKU_SERIALIZED_DOCID_LIST"

    invoke-virtual {v11, v0, v1}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_11
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_18

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x1

    :goto_a
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_12

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/android/billingclient/api/SkuDetails;

    invoke-virtual {v6}, Lcom/android/billingclient/api/SkuDetails;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_a

    :cond_12
    invoke-virtual {v11, v15, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v11, v14, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    goto/16 :goto_c

    :cond_13
    move-object/from16 v20, v1

    move-object/from16 v30, v5

    move-object/from16 v28, v6

    move-object/from16 v19, v7

    move-object/from16 v18, v10

    move-object/from16 v27, v12

    const/4 v1, 0x1

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v4

    add-int/lit8 v4, v4, -0x1

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    const/4 v6, 0x0

    :goto_b
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v7

    if-ge v6, v7, :cond_16

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/tb$b;

    invoke-virtual {v7}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v10

    invoke-virtual {v10}, Lcom/daaw/kz0;->f()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/String;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_14

    invoke-virtual {v10}, Lcom/daaw/kz0;->f()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_14
    invoke-virtual {v7}, Lcom/daaw/tb$b;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-lez v6, :cond_15

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/tb$b;

    invoke-virtual {v7}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/kz0;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/daaw/tb$b;

    invoke-virtual {v7}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v7

    invoke-virtual {v7}, Lcom/daaw/kz0;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_15
    add-int/lit8 v6, v6, 0x1

    goto :goto_b

    :cond_16
    invoke-virtual {v11, v9, v5}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_17

    invoke-virtual {v11, v13, v4}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_17
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_18

    invoke-virtual {v11, v15, v0}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    invoke-virtual {v11, v14, v2}, Landroid/os/Bundle;->putStringArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_18
    :goto_c
    invoke-virtual {v11, v9}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1a

    iget-boolean v0, v8, Lcom/daaw/rb;->p:Z

    if-eqz v0, :cond_19

    goto :goto_d

    :cond_19
    sget-object v0, Lcom/daaw/uz2;->u:Lcom/daaw/xb;

    goto/16 :goto_1

    :cond_1a
    :goto_d
    const-string v0, "skuPackageName"

    if-eqz v30, :cond_1b

    invoke-virtual/range {v30 .. v30}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1b

    invoke-virtual/range {v30 .. v30}, Lcom/android/billingclient/api/SkuDetails;->f()Ljava/lang/String;

    move-result-object v2

    :goto_e
    invoke-virtual {v11, v0, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v13, 0x1

    goto :goto_f

    :cond_1b
    if-eqz v28, :cond_1c

    invoke-virtual/range {v28 .. v28}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/kz0;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1c

    invoke-virtual/range {v28 .. v28}, Lcom/daaw/tb$b;->b()Lcom/daaw/kz0;

    move-result-object v2

    invoke-virtual {v2}, Lcom/daaw/kz0;->e()Ljava/lang/String;

    move-result-object v2

    goto :goto_e

    :cond_1c
    const/4 v0, 0x0

    const/4 v13, 0x0

    :goto_f
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_1d

    const-string v1, "accountName"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1d
    invoke-virtual/range {p1 .. p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1e

    const-string v0, "Activity\'s intent is null."

    move-object/from16 v9, v27

    invoke-static {v9, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_10

    :cond_1e
    move-object/from16 v9, v27

    const-string v1, "PROXY_PACKAGE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1f

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "proxyPackage"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, v8, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-object/from16 v1, v20

    :try_start_1
    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_10

    :catch_0
    move-object/from16 v1, v20

    :catch_1
    const-string v0, "package not found"

    invoke-virtual {v11, v1, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1f
    :goto_10
    iget-boolean v0, v8, Lcom/daaw/rb;->s:Z

    if-eqz v0, :cond_20

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_20

    const/16 v0, 0x11

    const/16 v3, 0x11

    goto :goto_11

    :cond_20
    iget-boolean v0, v8, Lcom/daaw/rb;->q:Z

    if-eqz v0, :cond_21

    if-eqz v13, :cond_21

    const/16 v0, 0xf

    const/16 v3, 0xf

    goto :goto_11

    :cond_21
    iget-boolean v0, v8, Lcom/daaw/rb;->m:Z

    if-eqz v0, :cond_22

    const/16 v0, 0x9

    const/16 v3, 0x9

    goto :goto_11

    :cond_22
    const/4 v0, 0x6

    const/4 v3, 0x6

    :goto_11
    new-instance v0, Lcom/daaw/c52;

    move-object v1, v0

    move-object/from16 v2, p0

    move-object/from16 v4, v19

    move-object/from16 v5, v18

    move-object/from16 v6, p2

    move-object v7, v11

    invoke-direct/range {v1 .. v7}, Lcom/daaw/c52;-><init>(Lcom/daaw/rb;ILjava/lang/String;Ljava/lang/String;Lcom/daaw/tb;Landroid/os/Bundle;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/daaw/rb;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    move-object v2, v0

    goto :goto_12

    :cond_23
    move-object/from16 v19, v7

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object v9, v12

    new-instance v2, Lcom/daaw/j62;

    invoke-direct {v2, v8, v7, v10}, Lcom/daaw/j62;-><init>(Lcom/daaw/rb;Ljava/lang/String;Ljava/lang/String;)V

    const-wide/16 v3, 0x1388

    const/4 v5, 0x0

    iget-object v6, v8, Lcom/daaw/rb;->c:Landroid/os/Handler;

    move-object/from16 v1, p0

    :goto_12
    invoke-virtual/range {v1 .. v6}, Lcom/daaw/rb;->s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object v0

    const-wide/16 v1, 0x1388

    :try_start_2
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v1, v2, v3}, Ljava/util/concurrent/Future;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Bundle;

    invoke-static {v0, v9}, Lcom/daaw/yx2;->b(Landroid/os/Bundle;Ljava/lang/String;)I

    move-result v1

    invoke-static {v0, v9}, Lcom/daaw/yx2;->h(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v1, :cond_24

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unable to buy item, Error response code: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lcom/daaw/xb;->c()Lcom/daaw/xb$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/daaw/xb$a;->c(I)Lcom/daaw/xb$a;

    invoke-virtual {v0, v2}, Lcom/daaw/xb$a;->b(Ljava/lang/String;)Lcom/daaw/xb$a;

    invoke-virtual {v0}, Lcom/daaw/xb$a;->a()Lcom/daaw/xb;

    move-result-object v0

    invoke-virtual {v8, v0}, Lcom/daaw/rb;->p(Lcom/daaw/xb;)Lcom/daaw/xb;

    return-object v0

    :cond_24
    new-instance v1, Landroid/content/Intent;

    const-class v2, Lcom/android/billingclient/api/ProxyBillingActivity;

    move-object/from16 v3, p1

    invoke-direct {v1, v3, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object/from16 v2, v17

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/app/PendingIntent;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    invoke-virtual {v3, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_2
    .catch Ljava/util/concurrent/TimeoutException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    sget-object v0, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    return-object v0

    :catch_2
    move-exception v0

    const-string v1, "Exception while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :catch_3
    move-exception v0

    goto :goto_13

    :catch_4
    move-exception v0

    :goto_13
    const-string v1, "Time out while launching billing flow. Try to reconnect"

    invoke-static {v9, v1, v0}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lcom/daaw/uz2;->n:Lcom/daaw/xb;

    goto/16 :goto_1
.end method

.method public f(Lcom/daaw/j01;Lcom/daaw/lz0;)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/rb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    invoke-interface {p2, p1, v0}, Lcom/daaw/lz0;->a(Lcom/daaw/xb;Ljava/util/List;)V

    return-void

    :cond_0
    iget-boolean v0, p0, Lcom/daaw/rb;->s:Z

    if-nez v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Querying product details is not supported."

    invoke-static {p1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/uz2;->v:Lcom/daaw/xb;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/daaw/hr8;

    invoke-direct {v2, p0, p1, p2}, Lcom/daaw/hr8;-><init>(Lcom/daaw/rb;Lcom/daaw/j01;Lcom/daaw/lz0;)V

    new-instance v5, Lcom/daaw/ns8;

    invoke-direct {v5, p2}, Lcom/daaw/ns8;-><init>(Lcom/daaw/lz0;)V

    const-wide/16 v3, 0x7530

    invoke-virtual {p0}, Lcom/daaw/rb;->o()Landroid/os/Handler;

    move-result-object v6

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/rb;->s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rb;->q()Lcom/daaw/xb;

    move-result-object p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public g(Lcom/daaw/k01;Lcom/daaw/f01;)V
    .locals 0

    invoke-virtual {p1}, Lcom/daaw/k01;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/daaw/rb;->t(Ljava/lang/String;Lcom/daaw/f01;)V

    return-void
.end method

.method public final h(Lcom/daaw/sb;)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/rb;->c()Z

    move-result v0

    const-string v1, "BillingClient"

    if-eqz v0, :cond_0

    const-string v0, "Service connection is valid. No need to re-initialize."

    invoke-static {v1, v0}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->l:Lcom/daaw/xb;

    invoke-interface {p1, v0}, Lcom/daaw/sb;->a(Lcom/daaw/xb;)V

    return-void

    :cond_0
    iget v0, p0, Lcom/daaw/rb;->a:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    const-string v0, "Client is already in the process of connecting to billing service."

    invoke-static {v1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->d:Lcom/daaw/xb;

    invoke-interface {p1, v0}, Lcom/daaw/sb;->a(Lcom/daaw/xb;)V

    return-void

    :cond_1
    iget v0, p0, Lcom/daaw/rb;->a:I

    const/4 v3, 0x3

    if-ne v0, v3, :cond_2

    const-string v0, "Client was already closed and can\'t be reused. Please create another instance."

    invoke-static {v1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    invoke-interface {p1, v0}, Lcom/daaw/sb;->a(Lcom/daaw/xb;)V

    return-void

    :cond_2
    iput v2, p0, Lcom/daaw/rb;->a:I

    iget-object v0, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    invoke-virtual {v0}, Lcom/daaw/gk8;->e()V

    const-string v0, "Starting in-app billing setup."

    invoke-static {v1, v0}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lcom/daaw/il2;

    const/4 v3, 0x0

    invoke-direct {v0, p0, p1, v3}, Lcom/daaw/il2;-><init>(Lcom/daaw/rb;Lcom/daaw/sb;Lcom/daaw/ek2;)V

    iput-object v0, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    new-instance v0, Landroid/content/Intent;

    const-string v3, "com.android.vending.billing.InAppBillingService.BIND"

    invoke-direct {v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "com.android.vending"

    invoke-virtual {v0, v3}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    iget-object v4, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v0, v5}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_5

    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/pm/ResolveInfo;

    iget-object v4, v4, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v4, :cond_5

    iget-object v6, v4, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v4, v4, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    if-eqz v4, :cond_4

    new-instance v3, Landroid/content/ComponentName;

    invoke-direct {v3, v6, v4}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v4, Landroid/content/Intent;

    invoke-direct {v4, v0}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    invoke-virtual {v4, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/daaw/rb;->b:Ljava/lang/String;

    const-string v3, "playBillingLibraryVersion"

    invoke-virtual {v4, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget-object v0, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    iget-object v3, p0, Lcom/daaw/rb;->g:Lcom/daaw/il2;

    invoke-virtual {v0, v4, v3, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Service was bonded successfully."

    invoke-static {v1, p1}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    const-string v0, "Connection to Billing service is blocked."

    goto :goto_0

    :cond_4
    const-string v0, "The device doesn\'t have valid Play Store."

    :goto_0
    invoke-static {v1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    iput v5, p0, Lcom/daaw/rb;->a:I

    const-string v0, "Billing service unavailable on device."

    invoke-static {v1, v0}, Lcom/daaw/yx2;->k(Ljava/lang/String;Ljava/lang/String;)V

    sget-object v0, Lcom/daaw/uz2;->c:Lcom/daaw/xb;

    invoke-interface {p1, v0}, Lcom/daaw/sb;->a(Lcom/daaw/xb;)V

    return-void
.end method

.method public final i(Landroid/content/Context;Lcom/daaw/g01;ZLcom/daaw/is3;)V
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    new-instance v0, Lcom/daaw/gk8;

    invoke-direct {v0, p1, p2, p4}, Lcom/daaw/gk8;-><init>(Landroid/content/Context;Lcom/daaw/g01;Lcom/daaw/is3;)V

    iput-object v0, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    iput-boolean p3, p0, Lcom/daaw/rb;->t:Z

    if-eqz p4, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-boolean p1, p0, Lcom/daaw/rb;->u:Z

    return-void
.end method

.method public final synthetic n(Lcom/daaw/xb;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    invoke-virtual {v0}, Lcom/daaw/gk8;->c()Lcom/daaw/g01;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    invoke-virtual {v0}, Lcom/daaw/gk8;->c()Lcom/daaw/g01;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Lcom/daaw/g01;->b(Lcom/daaw/xb;Ljava/util/List;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/daaw/rb;->d:Lcom/daaw/gk8;

    invoke-virtual {p1}, Lcom/daaw/gk8;->b()Lcom/daaw/c33;

    const-string p1, "BillingClient"

    const-string v0, "No valid listener is set in BroadcastManager"

    invoke-static {p1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public final o()Landroid/os/Handler;
    .locals 2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/daaw/rb;->c:Landroid/os/Handler;

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    :goto_0
    return-object v0
.end method

.method public final p(Lcom/daaw/xb;)Lcom/daaw/xb;
    .locals 2

    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, Lcom/daaw/rb;->c:Landroid/os/Handler;

    new-instance v1, Lcom/daaw/ra2;

    invoke-direct {v1, p0, p1}, Lcom/daaw/ra2;-><init>(Lcom/daaw/rb;Lcom/daaw/xb;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-object p1
.end method

.method public final q()Lcom/daaw/xb;
    .locals 2

    iget v0, p0, Lcom/daaw/rb;->a:I

    if-eqz v0, :cond_1

    iget v0, p0, Lcom/daaw/rb;->a:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/daaw/uz2;->j:Lcom/daaw/xb;

    goto :goto_1

    :cond_1
    :goto_0
    sget-object v0, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    :goto_1
    return-object v0
.end method

.method public final s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
    .locals 2

    long-to-double p2, p2

    const-wide v0, 0x3fee666666666666L    # 0.95

    invoke-static {p2, p3}, Ljava/lang/Double;->isNaN(D)Z

    mul-double p2, p2, v0

    double-to-long p2, p2

    iget-object v0, p0, Lcom/daaw/rb;->v:Ljava/util/concurrent/ExecutorService;

    if-nez v0, :cond_0

    sget v0, Lcom/daaw/yx2;->a:I

    new-instance v1, Lcom/daaw/qg2;

    invoke-direct {v1, p0}, Lcom/daaw/qg2;-><init>(Lcom/daaw/rb;)V

    invoke-static {v0, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/rb;->v:Ljava/util/concurrent/ExecutorService;

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/daaw/rb;->v:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0, p1}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v0, Lcom/daaw/k92;

    invoke-direct {v0, p1, p4}, Lcom/daaw/k92;-><init>(Ljava/util/concurrent/Future;Ljava/lang/Runnable;)V

    invoke-virtual {p5, v0, p2, p3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-object p1

    :catch_0
    move-exception p1

    const-string p2, "BillingClient"

    const-string p3, "Async task throws exception!"

    invoke-static {p2, p3, p1}, Lcom/daaw/yx2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final t(Ljava/lang/String;Lcom/daaw/f01;)V
    .locals 7

    invoke-virtual {p0}, Lcom/daaw/rb;->c()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object p1, Lcom/daaw/uz2;->m:Lcom/daaw/xb;

    :goto_0
    invoke-static {}, Lcom/daaw/rt8;->r()Lcom/daaw/rt8;

    move-result-object v0

    invoke-interface {p2, p1, v0}, Lcom/daaw/f01;->c(Lcom/daaw/xb;Ljava/util/List;)V

    return-void

    :cond_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "BillingClient"

    const-string v0, "Please provide a valid product type."

    invoke-static {p1, v0}, Lcom/daaw/yx2;->l(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Lcom/daaw/uz2;->g:Lcom/daaw/xb;

    goto :goto_0

    :cond_1
    new-instance v2, Lcom/daaw/dd2;

    invoke-direct {v2, p0, p1, p2}, Lcom/daaw/dd2;-><init>(Lcom/daaw/rb;Ljava/lang/String;Lcom/daaw/f01;)V

    new-instance v5, Lcom/daaw/g72;

    invoke-direct {v5, p2}, Lcom/daaw/g72;-><init>(Lcom/daaw/f01;)V

    const-wide/16 v3, 0x7530

    invoke-virtual {p0}, Lcom/daaw/rb;->o()Landroid/os/Handler;

    move-result-object v6

    move-object v1, p0

    invoke-virtual/range {v1 .. v6}, Lcom/daaw/rb;->s(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lcom/daaw/rb;->q()Lcom/daaw/xb;

    move-result-object p1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final synthetic w(ILjava/lang/String;Ljava/lang/String;Lcom/daaw/tb;Landroid/os/Bundle;)Landroid/os/Bundle;
    .locals 7

    iget-object v0, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    iget-object p4, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {p4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    move-object v6, p5

    invoke-interface/range {v0 .. v6}, Lcom/daaw/oe5;->O1(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic x(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 6

    iget-object v0, p0, Lcom/daaw/rb;->f:Lcom/daaw/oe5;

    iget-object v1, p0, Lcom/daaw/rb;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    const/4 v1, 0x3

    const/4 v5, 0x0

    move-object v3, p1

    move-object v4, p2

    invoke-interface/range {v0 .. v5}, Lcom/daaw/oe5;->a1(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    return-object p1
.end method
