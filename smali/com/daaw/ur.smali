.class public Lcom/daaw/ur;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/q81;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:Lcom/daaw/py1;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:Lcom/daaw/ba;

.field public final d:Lcom/daaw/ly;

.field public final e:Lcom/daaw/ri1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/xn1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lcom/daaw/ur;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/daaw/ba;Lcom/daaw/py1;Lcom/daaw/ly;Lcom/daaw/ri1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ur;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, Lcom/daaw/ur;->c:Lcom/daaw/ba;

    iput-object p3, p0, Lcom/daaw/ur;->a:Lcom/daaw/py1;

    iput-object p4, p0, Lcom/daaw/ur;->d:Lcom/daaw/ly;

    iput-object p5, p0, Lcom/daaw/ur;->e:Lcom/daaw/ri1;

    return-void
.end method

.method public static synthetic b(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/daaw/ur;->e(Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V

    return-void
.end method

.method public static synthetic c(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/by;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/daaw/ur;->d(Lcom/daaw/sn1;Lcom/daaw/by;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(Lcom/daaw/sn1;Lcom/daaw/by;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/daaw/ur;->d:Lcom/daaw/ly;

    invoke-interface {v0, p1, p2}, Lcom/daaw/ly;->v(Lcom/daaw/sn1;Lcom/daaw/by;)Lcom/daaw/iw0;

    iget-object p2, p0, Lcom/daaw/ur;->a:Lcom/daaw/py1;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, Lcom/daaw/py1;->a(Lcom/daaw/sn1;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic e(Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/daaw/ur;->c:Lcom/daaw/ba;

    invoke-virtual {p1}, Lcom/daaw/sn1;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/daaw/ba;->a(Ljava/lang/String;)Lcom/daaw/rn1;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p3, "Transport backend \'%s\' is not registered"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-virtual {p1}, Lcom/daaw/sn1;->b()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v0, v1

    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lcom/daaw/ur;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lcom/daaw/ao1;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-interface {v0, p3}, Lcom/daaw/rn1;->b(Lcom/daaw/by;)Lcom/daaw/by;

    move-result-object p3

    iget-object v0, p0, Lcom/daaw/ur;->e:Lcom/daaw/ri1;

    new-instance v1, Lcom/daaw/rr;

    invoke-direct {v1, p0, p1, p3}, Lcom/daaw/rr;-><init>(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/by;)V

    invoke-interface {v0, v1}, Lcom/daaw/ri1;->q(Lcom/daaw/ri1$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lcom/daaw/ao1;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p3, Lcom/daaw/ur;->f:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error scheduling event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lcom/daaw/ao1;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/sn1;Lcom/daaw/by;Lcom/daaw/ao1;)V
    .locals 2

    iget-object v0, p0, Lcom/daaw/ur;->b:Ljava/util/concurrent/Executor;

    new-instance v1, Lcom/daaw/sr;

    invoke-direct {v1, p0, p1, p3, p2}, Lcom/daaw/sr;-><init>(Lcom/daaw/ur;Lcom/daaw/sn1;Lcom/daaw/ao1;Lcom/daaw/by;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
