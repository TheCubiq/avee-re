.class public Lorg/junit/internal/ArrayComparisonFailure;
.super Ljava/lang/AssertionError;
.source "ArrayComparisonFailure.java"


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final fCause:Ljava/lang/AssertionError;

.field private final fIndices:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final fMessage:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/AssertionError;I)V
    .locals 1

    .line 34
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 22
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/junit/internal/ArrayComparisonFailure;->fIndices:Ljava/util/List;

    .line 35
    iput-object p1, p0, Lorg/junit/internal/ArrayComparisonFailure;->fMessage:Ljava/lang/String;

    .line 36
    iput-object p2, p0, Lorg/junit/internal/ArrayComparisonFailure;->fCause:Ljava/lang/AssertionError;

    .line 37
    invoke-virtual {p0, p2}, Lorg/junit/internal/ArrayComparisonFailure;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 38
    invoke-virtual {p0, p3}, Lorg/junit/internal/ArrayComparisonFailure;->addDimension(I)V

    return-void
.end method


# virtual methods
.method public addDimension(I)V
    .locals 2

    .line 42
    iget-object v0, p0, Lorg/junit/internal/ArrayComparisonFailure;->fIndices:Ljava/util/List;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    return-void
.end method

.method public declared-synchronized getCause()Ljava/lang/Throwable;
    .locals 1

    monitor-enter p0

    .line 47
    :try_start_0
    invoke-super {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lorg/junit/internal/ArrayComparisonFailure;->fCause:Ljava/lang/AssertionError;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Ljava/lang/AssertionError;->getCause()Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 4

    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    iget-object v1, p0, Lorg/junit/internal/ArrayComparisonFailure;->fMessage:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, "arrays first differed at element "

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    iget-object v1, p0, Lorg/junit/internal/ArrayComparisonFailure;->fIndices:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const-string v3, "["

    .line 58
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, "]"

    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_1
    const-string v1, "; "

    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    invoke-virtual {p0}, Lorg/junit/internal/ArrayComparisonFailure;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 72
    invoke-virtual {p0}, Lorg/junit/internal/ArrayComparisonFailure;->getMessage()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
