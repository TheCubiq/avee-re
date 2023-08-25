.class public final Lcom/daaw/vh0;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/pi1;

.field public static final b:Lcom/daaw/pi1;

.field public static final c:Lcom/daaw/pi1;

.field public static final d:Lcom/daaw/pi1;

.field public static final e:Lcom/daaw/pi1;

.field public static final f:Lcom/daaw/kw;

.field public static final g:Lcom/daaw/kw;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "COMPLETING_ALREADY"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/vh0;->a:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "COMPLETING_WAITING_CHILDREN"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/vh0;->b:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "COMPLETING_RETRY"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/vh0;->c:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "TOO_LATE_TO_CANCEL"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/vh0;->d:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "SEALED"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/vh0;->e:Lcom/daaw/pi1;

    new-instance v0, Lcom/daaw/kw;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/kw;-><init>(Z)V

    sput-object v0, Lcom/daaw/vh0;->f:Lcom/daaw/kw;

    new-instance v0, Lcom/daaw/kw;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/daaw/kw;-><init>(Z)V

    sput-object v0, Lcom/daaw/vh0;->g:Lcom/daaw/kw;

    return-void
.end method

.method public static final synthetic a()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/vh0;->a:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final synthetic b()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/vh0;->c:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final synthetic c()Lcom/daaw/kw;
    .locals 1

    sget-object v0, Lcom/daaw/vh0;->g:Lcom/daaw/kw;

    return-object v0
.end method

.method public static final synthetic d()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/vh0;->e:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final synthetic e()Lcom/daaw/pi1;
    .locals 1

    sget-object v0, Lcom/daaw/vh0;->d:Lcom/daaw/pi1;

    return-object v0
.end method

.method public static final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lcom/daaw/qf0;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/daaw/rf0;

    check-cast p0, Lcom/daaw/qf0;

    invoke-direct {v0, p0}, Lcom/daaw/rf0;-><init>(Lcom/daaw/qf0;)V

    move-object p0, v0

    :cond_0
    return-object p0
.end method
