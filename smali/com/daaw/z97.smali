.class public final Lcom/daaw/z97;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lcom/daaw/co7;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/fa7;

    invoke-direct {v0}, Lcom/daaw/fa7;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    sput-object v0, Lcom/daaw/z97;->a:Ljava/lang/String;

    new-instance v0, Lcom/daaw/ra7;

    invoke-direct {v0}, Lcom/daaw/ra7;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    sput-object v0, Lcom/daaw/z97;->b:Ljava/lang/String;

    new-instance v0, Lcom/daaw/ua7;

    invoke-direct {v0}, Lcom/daaw/ua7;-><init>()V

    new-instance v0, Lcom/daaw/oa7;

    invoke-direct {v0}, Lcom/daaw/oa7;-><init>()V

    new-instance v0, Lcom/daaw/ab7;

    invoke-direct {v0}, Lcom/daaw/ab7;-><init>()V

    new-instance v0, Lcom/daaw/eb7;

    invoke-direct {v0}, Lcom/daaw/eb7;-><init>()V

    new-instance v0, Lcom/daaw/xa7;

    invoke-direct {v0}, Lcom/daaw/xa7;-><init>()V

    new-instance v0, Lcom/daaw/hb7;

    invoke-direct {v0}, Lcom/daaw/hb7;-><init>()V

    invoke-static {}, Lcom/daaw/co7;->M()Lcom/daaw/co7;

    move-result-object v0

    sput-object v0, Lcom/daaw/z97;->c:Lcom/daaw/co7;

    sput-object v0, Lcom/daaw/z97;->d:Lcom/daaw/co7;

    sput-object v0, Lcom/daaw/z97;->e:Lcom/daaw/co7;

    :try_start_0
    invoke-static {}, Lcom/daaw/z97;->a()V
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

    new-instance v0, Lcom/daaw/ca7;

    invoke-direct {v0}, Lcom/daaw/ca7;-><init>()V

    invoke-static {v0}, Lcom/daaw/w97;->o(Lcom/daaw/t97;)V

    invoke-static {}, Lcom/daaw/fh7;->a()V

    new-instance v0, Lcom/daaw/fa7;

    invoke-direct {v0}, Lcom/daaw/fa7;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    new-instance v0, Lcom/daaw/ra7;

    invoke-direct {v0}, Lcom/daaw/ra7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    invoke-static {}, Lcom/daaw/yb7;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/daaw/oa7;

    invoke-direct {v0}, Lcom/daaw/oa7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    invoke-static {v1}, Lcom/daaw/ua7;->k(Z)V

    new-instance v0, Lcom/daaw/xa7;

    invoke-direct {v0}, Lcom/daaw/xa7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    new-instance v0, Lcom/daaw/ab7;

    invoke-direct {v0}, Lcom/daaw/ab7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    new-instance v0, Lcom/daaw/eb7;

    invoke-direct {v0}, Lcom/daaw/eb7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    new-instance v0, Lcom/daaw/hb7;

    invoke-direct {v0}, Lcom/daaw/hb7;-><init>()V

    invoke-static {v0, v1}, Lcom/daaw/w97;->n(Lcom/daaw/ee7;Z)V

    return-void
.end method
