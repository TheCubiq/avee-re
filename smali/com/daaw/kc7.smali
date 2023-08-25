.class public final Lcom/daaw/kc7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/daaw/jc7;

    invoke-direct {v0}, Lcom/daaw/jc7;-><init>()V

    new-instance v0, Lcom/daaw/hc7;

    invoke-direct {v0}, Lcom/daaw/hc7;-><init>()V

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/kc7;->a:Lcom/daaw/co7;

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/kc7;->b:Lcom/daaw/co7;

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/kc7;->c:Lcom/daaw/co7;

    :try_start_0
    new-instance v0, Lcom/daaw/mc7;

    invoke-direct {v0}, Lcom/daaw/mc7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    new-instance v0, Lcom/daaw/pc7;

    invoke-direct {v0}, Lcom/daaw/pc7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    invoke-static {}, Lcom/daaw/z97;->a()V

    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/hc7;

    invoke-direct {v0}, Lcom/daaw/hc7;-><init>()V

    new-instance v1, Lcom/daaw/jc7;

    invoke-direct {v1}, Lcom/daaw/jc7;-><init>()V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/daaw/w97;->l(Lcom/daaw/df7;Lcom/daaw/ee7;Z)V

    new-instance v0, Lcom/daaw/id7;

    invoke-direct {v0}, Lcom/daaw/id7;-><init>()V

    new-instance v1, Lcom/daaw/kd7;

    invoke-direct {v1}, Lcom/daaw/kd7;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/daaw/w97;->l(Lcom/daaw/df7;Lcom/daaw/ee7;Z)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
