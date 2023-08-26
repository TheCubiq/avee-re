.class Lorg/junit/runner/JUnitCommandLineParseResult;
.super Ljava/lang/Object;
.source "JUnitCommandLineParseResult.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/junit/runner/JUnitCommandLineParseResult$CommandLineParserError;
    }
.end annotation


# instance fields
.field private final classes:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final filterSpecs:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final parserErrors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>()V
    .locals 1

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->filterSpecs:Ljava/util/List;

    .line 14
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->classes:Ljava/util/List;

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    return-void
.end method

.method private applyFilterSpecs(Lorg/junit/runner/Request;)Lorg/junit/runner/Request;
    .locals 2

    .line 126
    :try_start_0
    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->filterSpecs:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 127
    invoke-static {p1, v1}, Lorg/junit/runner/FilterFactories;->createFilterFromFilterSpec(Lorg/junit/runner/Request;Ljava/lang/String;)Lorg/junit/runner/manipulation/Filter;

    move-result-object v1

    .line 129
    invoke-virtual {p1, v1}, Lorg/junit/runner/Request;->filterWith(Lorg/junit/runner/manipulation/Filter;)Lorg/junit/runner/Request;

    move-result-object p1
    :try_end_0
    .catch Lorg/junit/runner/FilterFactory$FilterNotCreatedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :cond_0
    return-object p1

    :catch_0
    move-exception p1

    .line 133
    invoke-direct {p0, p1}, Lorg/junit/runner/JUnitCommandLineParseResult;->errorReport(Ljava/lang/Throwable;)Lorg/junit/runner/Request;

    move-result-object p1

    return-object p1
.end method

.method private copyArray([Ljava/lang/String;II)[Ljava/lang/String;
    .locals 4

    sub-int v0, p3, p2

    .line 88
    new-array v0, v0, [Ljava/lang/String;

    move v1, p2

    :goto_0
    if-eq v1, p3, :cond_0

    sub-int v2, v1, p2

    .line 90
    aget-object v3, p1, v1

    aput-object v3, v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private errorReport(Ljava/lang/Throwable;)Lorg/junit/runner/Request;
    .locals 1

    .line 106
    const-class v0, Lorg/junit/runner/JUnitCommandLineParseResult;

    invoke-static {v0, p1}, Lorg/junit/runner/Request;->errorReport(Ljava/lang/Class;Ljava/lang/Throwable;)Lorg/junit/runner/Request;

    move-result-object p1

    return-object p1
.end method

.method public static parse([Ljava/lang/String;)Lorg/junit/runner/JUnitCommandLineParseResult;
    .locals 1

    .line 42
    new-instance v0, Lorg/junit/runner/JUnitCommandLineParseResult;

    invoke-direct {v0}, Lorg/junit/runner/JUnitCommandLineParseResult;-><init>()V

    .line 44
    invoke-direct {v0, p0}, Lorg/junit/runner/JUnitCommandLineParseResult;->parseArgs([Ljava/lang/String;)V

    return-object v0
.end method

.method private parseArgs([Ljava/lang/String;)V
    .locals 0

    .line 50
    invoke-virtual {p0, p1}, Lorg/junit/runner/JUnitCommandLineParseResult;->parseOptions([Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lorg/junit/runner/JUnitCommandLineParseResult;->parseParameters([Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public createRequest(Lorg/junit/runner/Computer;)Lorg/junit/runner/Request;
    .locals 2

    .line 115
    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 116
    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->classes:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Ljava/lang/Class;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Class;

    invoke-static {p1, v0}, Lorg/junit/runner/Request;->classes(Lorg/junit/runner/Computer;[Ljava/lang/Class;)Lorg/junit/runner/Request;

    move-result-object p1

    .line 118
    invoke-direct {p0, p1}, Lorg/junit/runner/JUnitCommandLineParseResult;->applyFilterSpecs(Lorg/junit/runner/Request;)Lorg/junit/runner/Request;

    move-result-object p1

    return-object p1

    .line 120
    :cond_0
    new-instance p1, Lorg/junit/runners/model/InitializationError;

    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    invoke-direct {p1, v0}, Lorg/junit/runners/model/InitializationError;-><init>(Ljava/util/List;)V

    invoke-direct {p0, p1}, Lorg/junit/runner/JUnitCommandLineParseResult;->errorReport(Ljava/lang/Throwable;)Lorg/junit/runner/Request;

    move-result-object p1

    return-object p1
.end method

.method public getClasses()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->classes:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getFilterSpecs()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 26
    iget-object v0, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->filterSpecs:Ljava/util/List;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method varargs parseOptions([Ljava/lang/String;)[Ljava/lang/String;
    .locals 7

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 54
    :goto_0
    array-length v2, p1

    if-eq v1, v2, :cond_6

    .line 55
    aget-object v2, p1, v1

    const-string v3, "--"

    .line 57
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    add-int/lit8 v1, v1, 0x1

    .line 58
    array-length v0, p1

    invoke-direct {p0, p1, v1, v0}, Lorg/junit/runner/JUnitCommandLineParseResult;->copyArray([Ljava/lang/String;II)[Ljava/lang/String;

    move-result-object p1

    return-object p1

    .line 59
    :cond_0
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "--filter="

    .line 60
    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "--filter"

    if-nez v3, :cond_2

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    .line 77
    :cond_1
    iget-object v3, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    new-instance v4, Lorg/junit/runner/JUnitCommandLineParseResult$CommandLineParserError;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "JUnit knows nothing about the "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " option"

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2}, Lorg/junit/runner/JUnitCommandLineParseResult$CommandLineParserError;-><init>(Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 62
    :cond_2
    :goto_1
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    add-int/lit8 v1, v1, 0x1

    .line 65
    array-length v3, p1

    if-ge v1, v3, :cond_3

    .line 66
    aget-object v2, p1, v1

    goto :goto_2

    .line 68
    :cond_3
    iget-object p1, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    new-instance v1, Lorg/junit/runner/JUnitCommandLineParseResult$CommandLineParserError;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " value not specified"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Lorg/junit/runner/JUnitCommandLineParseResult$CommandLineParserError;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    const/16 v3, 0x3d

    .line 72
    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v3

    add-int/lit8 v3, v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 75
    :goto_2
    iget-object v3, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->filterSpecs:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 80
    :cond_5
    array-length v0, p1

    invoke-direct {p0, p1, v1, v0}, Lorg/junit/runner/JUnitCommandLineParseResult;->copyArray([Ljava/lang/String;II)[Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_6
    :goto_4
    new-array p1, v0, [Ljava/lang/String;

    return-object p1
.end method

.method parseParameters([Ljava/lang/String;)V
    .locals 8

    .line 96
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 98
    :try_start_0
    iget-object v3, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->classes:Ljava/util/List;

    invoke-static {v2}, Lorg/junit/internal/Classes;->getClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v3

    .line 100
    iget-object v4, p0, Lorg/junit/runner/JUnitCommandLineParseResult;->parserErrors:Ljava/util/List;

    new-instance v5, Ljava/lang/IllegalArgumentException;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Could not find class ["

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-interface {v4, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
