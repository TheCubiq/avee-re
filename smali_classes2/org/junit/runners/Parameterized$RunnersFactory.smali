.class Lorg/junit/runners/Parameterized$RunnersFactory;
.super Ljava/lang/Object;
.source "Parameterized.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runners/Parameterized;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "RunnersFactory"
.end annotation


# static fields
.field private static final DEFAULT_FACTORY:Lorg/junit/runners/parameterized/ParametersRunnerFactory;


# instance fields
.field private final allParameters:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final parameterCount:I

.field private final parametersMethod:Lorg/junit/runners/model/FrameworkMethod;

.field private final runnerOverride:Lorg/junit/runner/Runner;

.field private final testClass:Lorg/junit/runners/model/TestClass;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 361
    new-instance v0, Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParametersFactory;

    invoke-direct {v0}, Lorg/junit/runners/parameterized/BlockJUnit4ClassRunnerWithParametersFactory;-><init>()V

    sput-object v0, Lorg/junit/runners/Parameterized$RunnersFactory;->DEFAULT_FACTORY:Lorg/junit/runners/parameterized/ParametersRunnerFactory;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Class;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 369
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 370
    new-instance v0, Lorg/junit/runners/model/TestClass;

    invoke-direct {v0, p1}, Lorg/junit/runners/model/TestClass;-><init>(Ljava/lang/Class;)V

    iput-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    .line 371
    invoke-static {v0}, Lorg/junit/runners/Parameterized$RunnersFactory;->getParametersMethod(Lorg/junit/runners/model/TestClass;)Lorg/junit/runners/model/FrameworkMethod;

    move-result-object p1

    iput-object p1, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethod:Lorg/junit/runners/model/FrameworkMethod;

    .line 375
    :try_start_0
    iget-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    invoke-static {v0, p1}, Lorg/junit/runners/Parameterized$RunnersFactory;->allParameters(Lorg/junit/runners/model/TestClass;Lorg/junit/runners/model/FrameworkMethod;)Ljava/util/List;

    move-result-object p1
    :try_end_0
    .catch Lorg/junit/internal/AssumptionViolatedException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 377
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    .line 378
    new-instance v1, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;

    iget-object v2, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    iget-object v3, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethod:Lorg/junit/runners/model/FrameworkMethod;

    invoke-virtual {v3}, Lorg/junit/runners/model/FrameworkMethod;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3, p1}, Lorg/junit/runners/Parameterized$AssumptionViolationRunner;-><init>(Lorg/junit/runners/model/TestClass;Ljava/lang/String;Lorg/junit/internal/AssumptionViolatedException;)V

    move-object p1, v0

    move-object v0, v1

    .line 381
    :goto_0
    iput-object p1, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->allParameters:Ljava/util/List;

    .line 382
    iput-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->runnerOverride:Lorg/junit/runner/Runner;

    .line 383
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object p1, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->allParameters:Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lorg/junit/runners/Parameterized$RunnersFactory;->normalizeParameters(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    array-length v0, p1

    :goto_1
    iput v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parameterCount:I

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Class;Lorg/junit/runners/Parameterized$1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 360
    invoke-direct {p0, p1}, Lorg/junit/runners/Parameterized$RunnersFactory;-><init>(Ljava/lang/Class;)V

    return-void
.end method

.method static synthetic access$100(Lorg/junit/runners/Parameterized$RunnersFactory;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 360
    invoke-direct {p0}, Lorg/junit/runners/Parameterized$RunnersFactory;->createRunners()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method static synthetic access$200(Lorg/junit/runners/Parameterized$RunnersFactory;)I
    .locals 0

    .line 360
    iget p0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parameterCount:I

    return p0
.end method

.method private static allParameters(Lorg/junit/runners/model/TestClass;Lorg/junit/runners/model/FrameworkMethod;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/junit/runners/model/TestClass;",
            "Lorg/junit/runners/model/FrameworkMethod;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 424
    invoke-virtual {p1, v1, v0}, Lorg/junit/runners/model/FrameworkMethod;->invokeExplosively(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 425
    instance-of v1, v0, Ljava/util/List;

    if-eqz v1, :cond_0

    .line 426
    check-cast v0, Ljava/util/List;

    return-object v0

    .line 427
    :cond_0
    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_1

    .line 428
    new-instance p0, Ljava/util/ArrayList;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p0

    .line 429
    :cond_1
    instance-of v1, v0, Ljava/lang/Iterable;

    if-eqz v1, :cond_3

    .line 430
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 431
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 432
    invoke-interface {p0, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object p0

    .line 435
    :cond_3
    instance-of v1, v0, [Ljava/lang/Object;

    if-eqz v1, :cond_4

    .line 436
    check-cast v0, [Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 438
    :cond_4
    invoke-static {p0, p1}, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethodReturnedWrongType(Lorg/junit/runners/model/TestClass;Lorg/junit/runners/model/FrameworkMethod;)Ljava/lang/Exception;

    move-result-object p0

    goto :goto_2

    :goto_1
    throw p0

    :goto_2
    goto :goto_1
.end method

.method private createRunners()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/junit/runner/Runner;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 388
    iget-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->runnerOverride:Lorg/junit/runner/Runner;

    if-eqz v0, :cond_0

    .line 389
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0

    .line 391
    :cond_0
    iget-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethod:Lorg/junit/runners/model/FrameworkMethod;

    const-class v1, Lorg/junit/runners/Parameterized$Parameters;

    invoke-virtual {v0, v1}, Lorg/junit/runners/model/FrameworkMethod;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lorg/junit/runners/Parameterized$Parameters;

    .line 392
    iget-object v1, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->allParameters:Ljava/util/List;

    invoke-interface {v0}, Lorg/junit/runners/Parameterized$Parameters;->name()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lorg/junit/runners/Parameterized$RunnersFactory;->getParametersRunnerFactory()Lorg/junit/runners/parameterized/ParametersRunnerFactory;

    move-result-object v2

    invoke-direct {p0, v1, v0, v2}, Lorg/junit/runners/Parameterized$RunnersFactory;->createRunnersForParameters(Ljava/lang/Iterable;Ljava/lang/String;Lorg/junit/runners/parameterized/ParametersRunnerFactory;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private createRunnersForParameters(Ljava/lang/Iterable;Ljava/lang/String;Lorg/junit/runners/parameterized/ParametersRunnerFactory;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            "Lorg/junit/runners/parameterized/ParametersRunnerFactory;",
            ")",
            "Ljava/util/List<",
            "Lorg/junit/runner/Runner;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 459
    :try_start_0
    invoke-direct {p0, p1, p2}, Lorg/junit/runners/Parameterized$RunnersFactory;->createTestsForParameters(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    .line 461
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 462
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runners/parameterized/TestWithParameters;

    .line 463
    invoke-interface {p3, v0}, Lorg/junit/runners/parameterized/ParametersRunnerFactory;->createRunnerForTestWithParameters(Lorg/junit/runners/parameterized/TestWithParameters;)Lorg/junit/runner/Runner;

    move-result-object v0

    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-object p2

    .line 468
    :catch_0
    iget-object p1, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    iget-object p2, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethod:Lorg/junit/runners/model/FrameworkMethod;

    invoke-static {p1, p2}, Lorg/junit/runners/Parameterized$RunnersFactory;->parametersMethodReturnedWrongType(Lorg/junit/runners/model/TestClass;Lorg/junit/runners/model/FrameworkMethod;)Ljava/lang/Exception;

    move-result-object p1

    goto :goto_2

    :goto_1
    throw p1

    :goto_2
    goto :goto_1
.end method

.method private createTestWithNotNormalizedParameters(Ljava/lang/String;ILjava/lang/Object;)Lorg/junit/runners/parameterized/TestWithParameters;
    .locals 1

    .line 412
    invoke-static {p3}, Lorg/junit/runners/Parameterized$RunnersFactory;->normalizeParameters(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p3

    .line 413
    iget-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    invoke-direct {p0, v0, p1, p2, p3}, Lorg/junit/runners/Parameterized$RunnersFactory;->createTestWithParameters(Lorg/junit/runners/model/TestClass;Ljava/lang/String;I[Ljava/lang/Object;)Lorg/junit/runners/parameterized/TestWithParameters;

    move-result-object p1

    return-object p1
.end method

.method private createTestWithParameters(Lorg/junit/runners/model/TestClass;Ljava/lang/String;I[Ljava/lang/Object;)Lorg/junit/runners/parameterized/TestWithParameters;
    .locals 2

    .line 497
    invoke-static {p3}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object p3

    const-string v0, "\\{index\\}"

    invoke-virtual {p2, v0, p3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 499
    invoke-static {p2, p4}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    .line 500
    new-instance p3, Lorg/junit/runners/parameterized/TestWithParameters;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "]"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p4

    invoke-direct {p3, p2, p1, p4}, Lorg/junit/runners/parameterized/TestWithParameters;-><init>(Ljava/lang/String;Lorg/junit/runners/model/TestClass;Ljava/util/List;)V

    return-object p3
.end method

.method private createTestsForParameters(Ljava/lang/Iterable;Ljava/lang/String;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Lorg/junit/runners/parameterized/TestWithParameters;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 476
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 477
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    .line 478
    invoke-direct {p0, p2, v1, v2}, Lorg/junit/runners/Parameterized$RunnersFactory;->createTestWithNotNormalizedParameters(Ljava/lang/String;ILjava/lang/Object;)Lorg/junit/runners/parameterized/TestWithParameters;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static getParametersMethod(Lorg/junit/runners/model/TestClass;)Lorg/junit/runners/model/FrameworkMethod;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 443
    const-class v0, Lorg/junit/runners/Parameterized$Parameters;

    invoke-virtual {p0, v0}, Lorg/junit/runners/model/TestClass;->getAnnotatedMethods(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    .line 445
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/runners/model/FrameworkMethod;

    .line 446
    invoke-virtual {v1}, Lorg/junit/runners/model/FrameworkMethod;->isStatic()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lorg/junit/runners/model/FrameworkMethod;->isPublic()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    .line 451
    :cond_1
    new-instance v0, Ljava/lang/Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No public static parameters method on class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lorg/junit/runners/model/TestClass;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_0
    throw v0

    :goto_1
    goto :goto_0
.end method

.method private getParametersRunnerFactory()Lorg/junit/runners/parameterized/ParametersRunnerFactory;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/InstantiationException;,
            Ljava/lang/IllegalAccessException;
        }
    .end annotation

    .line 399
    iget-object v0, p0, Lorg/junit/runners/Parameterized$RunnersFactory;->testClass:Lorg/junit/runners/model/TestClass;

    const-class v1, Lorg/junit/runners/Parameterized$UseParametersRunnerFactory;

    invoke-virtual {v0, v1}, Lorg/junit/runners/model/TestClass;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    move-result-object v0

    check-cast v0, Lorg/junit/runners/Parameterized$UseParametersRunnerFactory;

    if-nez v0, :cond_0

    .line 402
    sget-object v0, Lorg/junit/runners/Parameterized$RunnersFactory;->DEFAULT_FACTORY:Lorg/junit/runners/parameterized/ParametersRunnerFactory;

    return-object v0

    .line 404
    :cond_0
    invoke-interface {v0}, Lorg/junit/runners/Parameterized$UseParametersRunnerFactory;->value()Ljava/lang/Class;

    move-result-object v0

    .line 406
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/junit/runners/parameterized/ParametersRunnerFactory;

    return-object v0
.end method

.method private static normalizeParameters(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    .line 417
    instance-of v0, p0, [Ljava/lang/Object;

    if-eqz v0, :cond_0

    check-cast p0, [Ljava/lang/Object;

    check-cast p0, [Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    move-object p0, v0

    :goto_0
    return-object p0
.end method

.method private static parametersMethodReturnedWrongType(Lorg/junit/runners/model/TestClass;Lorg/junit/runners/model/FrameworkMethod;)Ljava/lang/Exception;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 486
    invoke-virtual {p0}, Lorg/junit/runners/model/TestClass;->getName()Ljava/lang/String;

    move-result-object p0

    .line 487
    invoke-virtual {p1}, Lorg/junit/runners/model/FrameworkMethod;->getName()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const-string p0, "{0}.{1}() must return an Iterable of arrays."

    .line 488
    invoke-static {p0, v0}, Ljava/text/MessageFormat;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 491
    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-object p1
.end method
