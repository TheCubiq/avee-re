.class public Lorg/junit/rules/DisableOnDebug;
.super Ljava/lang/Object;
.source "DisableOnDebug.java"

# interfaces
.implements Lorg/junit/rules/TestRule;


# instance fields
.field private final debugging:Z

.field private final rule:Lorg/junit/rules/TestRule;


# direct methods
.method public constructor <init>(Lorg/junit/rules/TestRule;)V
    .locals 1

    .line 57
    invoke-static {}, Lorg/junit/internal/management/ManagementFactory;->getRuntimeMXBean()Lorg/junit/internal/management/RuntimeMXBean;

    move-result-object v0

    invoke-interface {v0}, Lorg/junit/internal/management/RuntimeMXBean;->getInputArguments()Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lorg/junit/rules/DisableOnDebug;-><init>(Lorg/junit/rules/TestRule;Ljava/util/List;)V

    return-void
.end method

.method constructor <init>(Lorg/junit/rules/TestRule;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/rules/TestRule;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    iput-object p1, p0, Lorg/junit/rules/DisableOnDebug;->rule:Lorg/junit/rules/TestRule;

    .line 70
    invoke-static {p2}, Lorg/junit/rules/DisableOnDebug;->isDebugging(Ljava/util/List;)Z

    move-result p1

    iput-boolean p1, p0, Lorg/junit/rules/DisableOnDebug;->debugging:Z

    return-void
.end method

.method private static isDebugging(Ljava/util/List;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 105
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "-Xdebug"

    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "-agentlib:jdwp"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    :cond_1
    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public apply(Lorg/junit/runners/model/Statement;Lorg/junit/runner/Description;)Lorg/junit/runners/model/Statement;
    .locals 1

    .line 77
    iget-boolean v0, p0, Lorg/junit/rules/DisableOnDebug;->debugging:Z

    if-eqz v0, :cond_0

    return-object p1

    .line 80
    :cond_0
    iget-object v0, p0, Lorg/junit/rules/DisableOnDebug;->rule:Lorg/junit/rules/TestRule;

    invoke-interface {v0, p1, p2}, Lorg/junit/rules/TestRule;->apply(Lorg/junit/runners/model/Statement;Lorg/junit/runner/Description;)Lorg/junit/runners/model/Statement;

    move-result-object p1

    return-object p1
.end method

.method public isDebugging()Z
    .locals 1

    .line 122
    iget-boolean v0, p0, Lorg/junit/rules/DisableOnDebug;->debugging:Z

    return v0
.end method
