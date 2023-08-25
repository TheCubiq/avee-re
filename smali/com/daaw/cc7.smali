.class public final Lcom/daaw/cc7;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/String;

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

    new-instance v0, Lcom/daaw/bc7;

    invoke-direct {v0}, Lcom/daaw/bc7;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesSivKey"

    sput-object v0, Lcom/daaw/cc7;->a:Ljava/lang/String;

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/cc7;->b:Lcom/daaw/co7;

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/cc7;->c:Lcom/daaw/co7;

    :try_start_0
    new-instance v0, Lcom/daaw/ec7;

    invoke-direct {v0}, Lcom/daaw/ec7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/bc7;

    invoke-direct {v0}, Lcom/daaw/bc7;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method
