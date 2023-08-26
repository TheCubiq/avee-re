.class public abstract Lorg/junit/internal/ComparisonCriteria;
.super Ljava/lang/Object;
.source "ComparisonCriteria.java"


# static fields
.field private static final END_OF_ARRAY_SENTINEL:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "end of array"

    .line 94
    invoke-static {v0}, Lorg/junit/internal/ComparisonCriteria;->objectWithToString(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, Lorg/junit/internal/ComparisonCriteria;->END_OF_ARRAY_SENTINEL:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private arrayEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/internal/ArrayComparisonFailure;
        }
    .end annotation

    if-eq p2, p3, :cond_8

    const/4 v0, 0x1

    new-array v1, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p2, v1, v2

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p3, v0, v2

    .line 33
    invoke-static {v1, v0}, Ljava/util/Arrays;->deepEquals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_3

    :cond_0
    const-string v0, ""

    if-nez p1, :cond_1

    move-object v1, v0

    goto :goto_0

    .line 40
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ": "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    :goto_0
    if-eqz p4, :cond_2

    move-object v0, v1

    :cond_2
    if-nez p2, :cond_3

    .line 46
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "expected array was null"

    invoke-virtual {p4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lorg/junit/Assert;->fail(Ljava/lang/String;)V

    :cond_3
    if-nez p3, :cond_4

    .line 49
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "actual array was null"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-static {p4}, Lorg/junit/Assert;->fail(Ljava/lang/String;)V

    .line 52
    :cond_4
    invoke-static {p3}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p4

    .line 53
    invoke-static {p2}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result v0

    if-eq p4, v0, :cond_5

    .line 55
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "array lengths differed, expected.length="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " actual.length="

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 58
    :cond_5
    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v3

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v3, :cond_7

    .line 61
    invoke-static {p2, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v5

    .line 62
    invoke-static {p3, v4}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v6

    .line 64
    invoke-direct {p0, v5}, Lorg/junit/internal/ComparisonCriteria;->isArray(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-direct {p0, v6}, Lorg/junit/internal/ComparisonCriteria;->isArray(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    .line 66
    :try_start_0
    invoke-direct {p0, p1, v5, v6, v2}, Lorg/junit/internal/ComparisonCriteria;->arrayEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Z)V
    :try_end_0
    .catch Lorg/junit/internal/ArrayComparisonFailure; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p1

    .line 72
    new-instance p2, Lorg/junit/internal/ArrayComparisonFailure;

    invoke-direct {p2, v1, p1, v4}, Lorg/junit/internal/ArrayComparisonFailure;-><init>(Ljava/lang/String;Ljava/lang/AssertionError;I)V

    throw p2

    :catch_1
    move-exception p1

    .line 68
    invoke-virtual {p1, v4}, Lorg/junit/internal/ArrayComparisonFailure;->addDimension(I)V

    .line 69
    throw p1

    .line 76
    :cond_6
    :try_start_1
    invoke-virtual {p0, v5, v6}, Lorg/junit/internal/ComparisonCriteria;->assertElementsEqual(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/AssertionError; {:try_start_1 .. :try_end_1} :catch_2

    :goto_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catch_2
    move-exception p1

    .line 78
    new-instance p2, Lorg/junit/internal/ArrayComparisonFailure;

    invoke-direct {p2, v1, p1, v4}, Lorg/junit/internal/ArrayComparisonFailure;-><init>(Ljava/lang/String;Ljava/lang/AssertionError;I)V

    throw p2

    :cond_7
    if-eq p4, v0, :cond_8

    .line 84
    invoke-direct {p0, p2, v0, v3}, Lorg/junit/internal/ComparisonCriteria;->getToStringableArrayElement(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p1

    .line 85
    invoke-direct {p0, p3, p4, v3}, Lorg/junit/internal/ComparisonCriteria;->getToStringableArrayElement(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p2

    .line 87
    :try_start_2
    invoke-static {p1, p2}, Lorg/junit/Assert;->assertEquals(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/AssertionError; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_3

    :catch_3
    move-exception p1

    .line 89
    new-instance p2, Lorg/junit/internal/ArrayComparisonFailure;

    invoke-direct {p2, v1, p1, v3}, Lorg/junit/internal/ArrayComparisonFailure;-><init>(Ljava/lang/String;Ljava/lang/AssertionError;I)V

    throw p2

    :cond_8
    :goto_3
    return-void
.end method

.method private componentTypeName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 119
    invoke-virtual {p1}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 121
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0, p1}, Lorg/junit/internal/ComparisonCriteria;->componentTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "[]"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 123
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private getToStringableArrayElement(Ljava/lang/Object;II)Ljava/lang/Object;
    .locals 0

    if-ge p3, p2, :cond_1

    .line 98
    invoke-static {p1, p3}, Ljava/lang/reflect/Array;->get(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    .line 99
    invoke-direct {p0, p1}, Lorg/junit/internal/ComparisonCriteria;->isArray(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 100
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-direct {p0, p3}, Lorg/junit/internal/ComparisonCriteria;->componentTypeName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p3, "["

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lorg/junit/internal/ComparisonCriteria;->objectWithToString(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    return-object p1

    .line 105
    :cond_1
    sget-object p1, Lorg/junit/internal/ComparisonCriteria;->END_OF_ARRAY_SENTINEL:Ljava/lang/Object;

    return-object p1
.end method

.method private isArray(Ljava/lang/Object;)Z
    .locals 0

    if-eqz p1, :cond_0

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->isArray()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private static objectWithToString(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 110
    new-instance v0, Lorg/junit/internal/ComparisonCriteria$1;

    invoke-direct {v0, p0}, Lorg/junit/internal/ComparisonCriteria$1;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public arrayEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/junit/internal/ArrayComparisonFailure;
        }
    .end annotation

    const/4 v0, 0x1

    .line 28
    invoke-direct {p0, p1, p2, p3, v0}, Lorg/junit/internal/ComparisonCriteria;->arrayEquals(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Z)V

    return-void
.end method

.method protected abstract assertElementsEqual(Ljava/lang/Object;Ljava/lang/Object;)V
.end method
