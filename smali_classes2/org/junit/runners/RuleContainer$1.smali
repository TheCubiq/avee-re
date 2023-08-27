.class final Lorg/junit/runners/RuleContainer$1;
.super Ljava/lang/Object;
.source "RuleContainer.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/junit/runners/RuleContainer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lorg/junit/runners/RuleContainer$RuleEntry;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private compareInt(II)I
    .locals 0

    if-ge p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    if-ne p1, p2, :cond_1

    const/4 p1, 0x0

    goto :goto_0

    :cond_1
    const/4 p1, -0x1

    :goto_0
    return p1
.end method


# virtual methods
.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 41
    check-cast p1, Lorg/junit/runners/RuleContainer$RuleEntry;

    check-cast p2, Lorg/junit/runners/RuleContainer$RuleEntry;

    invoke-virtual {p0, p1, p2}, Lorg/junit/runners/RuleContainer$1;->compare(Lorg/junit/runners/RuleContainer$RuleEntry;Lorg/junit/runners/RuleContainer$RuleEntry;)I

    move-result p1

    return p1
.end method

.method public compare(Lorg/junit/runners/RuleContainer$RuleEntry;Lorg/junit/runners/RuleContainer$RuleEntry;)I
    .locals 2

    .line 43
    iget v0, p1, Lorg/junit/runners/RuleContainer$RuleEntry;->order:I

    iget v1, p2, Lorg/junit/runners/RuleContainer$RuleEntry;->order:I

    invoke-direct {p0, v0, v1}, Lorg/junit/runners/RuleContainer$1;->compareInt(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    iget p1, p1, Lorg/junit/runners/RuleContainer$RuleEntry;->type:I

    iget p2, p2, Lorg/junit/runners/RuleContainer$RuleEntry;->type:I

    sub-int v0, p1, p2

    :goto_0
    return v0
.end method
