.class public Lorg/hamcrest/core/IsCollectionContaining;
.super Lorg/hamcrest/TypeSafeDiagnosingMatcher;
.source "IsCollectionContaining.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/hamcrest/TypeSafeDiagnosingMatcher<",
        "Ljava/lang/Iterable<",
        "-TT;>;>;"
    }
.end annotation


# instance fields
.field private final elementMatcher:Lorg/hamcrest/Matcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/hamcrest/Matcher<",
            "-TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lorg/hamcrest/Matcher;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lorg/hamcrest/TypeSafeDiagnosingMatcher;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/hamcrest/core/IsCollectionContaining;->elementMatcher:Lorg/hamcrest/Matcher;

    return-void
.end method

.method public static hasItem(Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Iterable<",
            "-TT;>;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 77
    new-instance v0, Lorg/hamcrest/core/IsCollectionContaining;

    invoke-static {p0}, Lorg/hamcrest/core/IsEqual;->equalTo(Ljava/lang/Object;)Lorg/hamcrest/Matcher;

    move-result-object p0

    invoke-direct {v0, p0}, Lorg/hamcrest/core/IsCollectionContaining;-><init>(Lorg/hamcrest/Matcher;)V

    return-object v0
.end method

.method public static hasItem(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Iterable<",
            "-TT;>;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 59
    new-instance v0, Lorg/hamcrest/core/IsCollectionContaining;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/IsCollectionContaining;-><init>(Lorg/hamcrest/Matcher;)V

    return-object v0
.end method

.method public static varargs hasItems([Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 118
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 119
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 120
    invoke-static {v3}, Lorg/hamcrest/core/IsCollectionContaining;->hasItem(Ljava/lang/Object;)Lorg/hamcrest/Matcher;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 123
    :cond_0
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static varargs hasItems([Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 94
    new-instance v0, Ljava/util/ArrayList;

    array-length v1, p0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 96
    array-length v1, p0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p0, v2

    .line 98
    new-instance v4, Lorg/hamcrest/core/IsCollectionContaining;

    invoke-direct {v4, v3}, Lorg/hamcrest/core/IsCollectionContaining;-><init>(Lorg/hamcrest/Matcher;)V

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 101
    :cond_0
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 1

    const-string v0, "a collection containing "

    .line 39
    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    move-result-object p1

    iget-object v0, p0, Lorg/hamcrest/core/IsCollectionContaining;->elementMatcher:Lorg/hamcrest/Matcher;

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendDescriptionOf(Lorg/hamcrest/SelfDescribing;)Lorg/hamcrest/Description;

    return-void
.end method

.method protected matchesSafely(Ljava/lang/Iterable;Lorg/hamcrest/Description;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "-TT;>;",
            "Lorg/hamcrest/Description;",
            ")Z"
        }
    .end annotation

    .line 24
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    .line 25
    iget-object v4, p0, Lorg/hamcrest/core/IsCollectionContaining;->elementMatcher:Lorg/hamcrest/Matcher;

    invoke-interface {v4, v3}, Lorg/hamcrest/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return v0

    :cond_0
    if-eqz v2, :cond_1

    const-string v2, ", "

    .line 29
    invoke-interface {p2, v2}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    .line 31
    :cond_1
    iget-object v2, p0, Lorg/hamcrest/core/IsCollectionContaining;->elementMatcher:Lorg/hamcrest/Matcher;

    invoke-interface {v2, v3, p2}, Lorg/hamcrest/Matcher;->describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V

    const/4 v2, 0x1

    goto :goto_0

    :cond_2
    return v1
.end method

.method protected bridge synthetic matchesSafely(Ljava/lang/Object;Lorg/hamcrest/Description;)Z
    .locals 0

    .line 14
    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0, p1, p2}, Lorg/hamcrest/core/IsCollectionContaining;->matchesSafely(Ljava/lang/Iterable;Lorg/hamcrest/Description;)Z

    move-result p1

    return p1
.end method
