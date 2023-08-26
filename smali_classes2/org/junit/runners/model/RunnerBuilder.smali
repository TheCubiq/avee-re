.class public abstract Lorg/junit/runners/model/RunnerBuilder;
.super Ljava/lang/Object;
.source "RunnerBuilder.java"


# instance fields
.field private final parents:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lorg/junit/runners/model/RunnerBuilder;->parents:Ljava/util/Set;

    return-void
.end method

.method private configureRunner(Lorg/junit/runner/Runner;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runner/manipulation/InvalidOrderingException;
        }
    .end annotation

    .line 81
    invoke-virtual {p1}, Lorg/junit/runner/Runner;->getDescription()Lorg/junit/runner/Description;

    move-result-object v0

    .line 82
    const-class v1, Lorg/junit/runner/OrderWith;

    invoke-virtual {v0, v1}, Lorg/junit/runner/Description;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v1

    check-cast v1, Lorg/junit/runner/OrderWith;

    if-eqz v1, :cond_0

    .line 84
    invoke-interface {v1}, Lorg/junit/runner/OrderWith;->value()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Lorg/junit/runner/manipulation/Ordering;->definedBy(Ljava/lang/Class;Lorg/junit/runner/Description;)Lorg/junit/runner/manipulation/Ordering;

    move-result-object v0

    .line 85
    invoke-virtual {v0, p1}, Lorg/junit/runner/manipulation/Ordering;->apply(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private runners([Ljava/lang/Class;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Lorg/junit/runner/Runner;",
            ">;"
        }
    .end annotation

    .line 123
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 124
    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, p1, v2

    .line 125
    invoke-virtual {p0, v3}, Lorg/junit/runners/model/RunnerBuilder;->safeRunnerForClass(Ljava/lang/Class;)Lorg/junit/runner/Runner;

    move-result-object v3

    if-eqz v3, :cond_0

    .line 127
    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method


# virtual methods
.method addParent(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .line 90
    iget-object v0, p0, Lorg/junit/runners/model/RunnerBuilder;->parents:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    .line 91
    :cond_0
    new-instance v0, Lorg/junit/runners/model/InitializationError;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v1, v2

    const-string p1, "class \'%s\' (possibly indirectly) contains itself as a SuiteClass"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lorg/junit/runners/model/InitializationError;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method removeParent(Ljava/lang/Class;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 97
    iget-object v0, p0, Lorg/junit/runners/model/RunnerBuilder;->parents:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public abstract runnerForClass(Ljava/lang/Class;)Lorg/junit/runner/Runner;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/Runner;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation
.end method

.method public runners(Ljava/lang/Class;Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;)",
            "Ljava/util/List<",
            "Lorg/junit/runner/Runner;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Class;

    .line 119
    invoke-interface {p2, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [Ljava/lang/Class;

    invoke-virtual {p0, p1, p2}, Lorg/junit/runners/model/RunnerBuilder;->runners(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public runners(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/util/List<",
            "Lorg/junit/runner/Runner;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runners/model/InitializationError;
        }
    .end annotation

    .line 108
    invoke-virtual {p0, p1}, Lorg/junit/runners/model/RunnerBuilder;->addParent(Ljava/lang/Class;)Ljava/lang/Class;

    .line 111
    :try_start_0
    invoke-direct {p0, p2}, Lorg/junit/runners/model/RunnerBuilder;->runners([Ljava/lang/Class;)Ljava/util/List;

    move-result-object p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 113
    invoke-virtual {p0, p1}, Lorg/junit/runners/model/RunnerBuilder;->removeParent(Ljava/lang/Class;)V

    return-object p2

    :catchall_0
    move-exception p2

    invoke-virtual {p0, p1}, Lorg/junit/runners/model/RunnerBuilder;->removeParent(Ljava/lang/Class;)V

    throw p2
.end method

.method public safeRunnerForClass(Ljava/lang/Class;)Lorg/junit/runner/Runner;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lorg/junit/runner/Runner;"
        }
    .end annotation

    .line 70
    :try_start_0
    invoke-virtual {p0, p1}, Lorg/junit/runners/model/RunnerBuilder;->runnerForClass(Ljava/lang/Class;)Lorg/junit/runner/Runner;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 72
    invoke-direct {p0, v0}, Lorg/junit/runners/model/RunnerBuilder;->configureRunner(Lorg/junit/runner/Runner;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_0
    return-object v0

    :catchall_0
    move-exception v0

    .line 76
    new-instance v1, Lorg/junit/internal/runners/ErrorReportingRunner;

    invoke-direct {v1, p1, v0}, Lorg/junit/internal/runners/ErrorReportingRunner;-><init>(Ljava/lang/Class;Ljava/lang/Throwable;)V

    return-object v1
.end method
