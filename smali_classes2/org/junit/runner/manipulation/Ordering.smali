.class public abstract Lorg/junit/runner/manipulation/Ordering;
.super Ljava/lang/Object;
.source "Ordering.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/runner/manipulation/Ordering$Factory;,
        Lorg/junit/runner/manipulation/Ordering$Context;
    }
.end annotation


# static fields
.field private static final CONSTRUCTOR_ERROR_FORMAT:Ljava/lang/String; = "Ordering class %s should have a public constructor with signature %s(Ordering.Context context)"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static definedBy(Ljava/lang/Class;Lorg/junit/runner/Description;)Lorg/junit/runner/manipulation/Ordering;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lorg/junit/runner/manipulation/Ordering$Factory;",
            ">;",
            "Lorg/junit/runner/Description;",
            ")",
            "Lorg/junit/runner/manipulation/Ordering;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runner/manipulation/InvalidOrderingException;
        }
    .end annotation

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :try_start_0
    new-array v1, v0, [Ljava/lang/Class;

    .line 67
    invoke-virtual {p0, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    new-array v2, v0, [Ljava/lang/Object;

    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/junit/runner/manipulation/Ordering$Factory;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    invoke-static {v1, p1}, Lorg/junit/runner/manipulation/Ordering;->definedBy(Lorg/junit/runner/manipulation/Ordering$Factory;Lorg/junit/runner/Description;)Lorg/junit/runner/manipulation/Ordering;

    move-result-object p0

    return-object p0

    :catch_0
    move-exception p0

    .line 75
    new-instance v0, Lorg/junit/runner/manipulation/InvalidOrderingException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Could not create ordering for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p0}, Lorg/junit/runner/manipulation/InvalidOrderingException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    .line 70
    :catch_1
    new-instance p1, Lorg/junit/runner/manipulation/InvalidOrderingException;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p0}, Lorg/junit/runner/manipulation/Ordering;->getClassName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    const/4 v0, 0x1

    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    aput-object p0, v1, v0

    const-string p0, "Ordering class %s should have a public constructor with signature %s(Ordering.Context context)"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lorg/junit/runner/manipulation/InvalidOrderingException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 62
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "annotatedTestClass cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 59
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "factoryClass cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static definedBy(Lorg/junit/runner/manipulation/Ordering$Factory;Lorg/junit/runner/Description;)Lorg/junit/runner/manipulation/Ordering;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runner/manipulation/InvalidOrderingException;
        }
    .end annotation

    if-eqz p0, :cond_1

    if-eqz p1, :cond_0

    .line 98
    new-instance v0, Lorg/junit/runner/manipulation/Ordering$Context;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lorg/junit/runner/manipulation/Ordering$Context;-><init>(Lorg/junit/runner/Description;Lorg/junit/runner/manipulation/Ordering$1;)V

    invoke-interface {p0, v0}, Lorg/junit/runner/manipulation/Ordering$Factory;->create(Lorg/junit/runner/manipulation/Ordering$Context;)Lorg/junit/runner/manipulation/Ordering;

    move-result-object p0

    return-object p0

    .line 95
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "annotatedTestClass cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 92
    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "factory cannot be null"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static getClassName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 102
    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 104
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static shuffledBy(Ljava/util/Random;)Lorg/junit/runner/manipulation/Ordering;
    .locals 1

    .line 32
    new-instance v0, Lorg/junit/runner/manipulation/Ordering$1;

    invoke-direct {v0, p0}, Lorg/junit/runner/manipulation/Ordering$1;-><init>(Ljava/util/Random;)V

    return-object v0
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/runner/manipulation/InvalidOrderingException;
        }
    .end annotation

    .line 121
    instance-of v0, p1, Lorg/junit/runner/manipulation/Orderable;

    if-eqz v0, :cond_0

    .line 122
    check-cast p1, Lorg/junit/runner/manipulation/Orderable;

    .line 123
    new-instance v0, Lorg/junit/runner/manipulation/Orderer;

    invoke-direct {v0, p0}, Lorg/junit/runner/manipulation/Orderer;-><init>(Lorg/junit/runner/manipulation/Ordering;)V

    invoke-interface {p1, v0}, Lorg/junit/runner/manipulation/Orderable;->order(Lorg/junit/runner/manipulation/Orderer;)V

    :cond_0
    return-void
.end method

.method protected abstract orderItems(Ljava/util/Collection;)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lorg/junit/runner/Description;",
            ">;)",
            "Ljava/util/List<",
            "Lorg/junit/runner/Description;",
            ">;"
        }
    .end annotation
.end method

.method validateOrderingIsCorrect()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
