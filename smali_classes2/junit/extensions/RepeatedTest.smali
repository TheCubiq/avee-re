.class public Ljunit/extensions/RepeatedTest;
.super Ljunit/extensions/TestDecorator;
.source "RepeatedTest.java"


# instance fields
.field private fTimesRepeat:I


# direct methods
.method public constructor <init>(Ljunit/framework/Test;I)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Ljunit/extensions/TestDecorator;-><init>(Ljunit/framework/Test;)V

    if-ltz p2, :cond_0

    .line 17
    iput p2, p0, Ljunit/extensions/RepeatedTest;->fTimesRepeat:I

    return-void

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Repetition count must be >= 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public countTestCases()I
    .locals 2

    .line 22
    invoke-super {p0}, Ljunit/extensions/TestDecorator;->countTestCases()I

    move-result v0

    iget v1, p0, Ljunit/extensions/RepeatedTest;->fTimesRepeat:I

    mul-int v0, v0, v1

    return v0
.end method

.method public run(Ljunit/framework/TestResult;)V
    .locals 2

    const/4 v0, 0x0

    .line 27
    :goto_0
    iget v1, p0, Ljunit/extensions/RepeatedTest;->fTimesRepeat:I

    if-ge v0, v1, :cond_1

    .line 28
    invoke-virtual {p1}, Ljunit/framework/TestResult;->shouldStop()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    .line 31
    :cond_0
    invoke-super {p0, p1}, Ljunit/extensions/TestDecorator;->run(Ljunit/framework/TestResult;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 37
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljunit/extensions/TestDecorator;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "(repeated)"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
