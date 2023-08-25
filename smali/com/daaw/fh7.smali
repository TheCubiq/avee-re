.class public final Lcom/daaw/fh7;
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
    .locals 2

    new-instance v0, Lcom/daaw/qg7;

    invoke-direct {v0}, Lcom/daaw/qg7;-><init>()V

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/fh7;->a:Lcom/daaw/co7;

    sput-object v0, Lcom/daaw/fh7;->b:Lcom/daaw/co7;

    sput-object v0, Lcom/daaw/fh7;->c:Lcom/daaw/co7;

    :try_start_0
    invoke-static {}, Lcom/daaw/fh7;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 2

    new-instance v0, Lcom/daaw/kh7;

    invoke-direct {v0}, Lcom/daaw/kh7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    new-instance v0, Lcom/daaw/qg7;

    invoke-direct {v0}, Lcom/daaw/qg7;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    invoke-static {}, Lcom/daaw/bh7;->a()V

    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/wf7;

    invoke-direct {v0}, Lcom/daaw/wf7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    invoke-static {}, Lcom/daaw/jg7;->a()V

    return-void
.end method
