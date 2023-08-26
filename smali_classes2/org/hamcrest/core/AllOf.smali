.class public Lorg/hamcrest/core/AllOf;
.super Lorg/hamcrest/DiagnosingMatcher;
.source "AllOf.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/hamcrest/DiagnosingMatcher<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final matchers:Ljava/lang/Iterable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;>;)V"
        }
    .end annotation

    .line 20
    invoke-direct {p0}, Lorg/hamcrest/DiagnosingMatcher;-><init>()V

    .line 21
    iput-object p1, p0, Lorg/hamcrest/core/AllOf;->matchers:Ljava/lang/Iterable;

    return-void
.end method

.method public static allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Iterable<",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 49
    new-instance v0, Lorg/hamcrest/core/AllOf;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/AllOf;-><init>(Ljava/lang/Iterable;)V

    return-object v0
.end method

.method public static allOf(Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 71
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 73
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 74
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static allOf(Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 85
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 87
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static allOf(Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x4

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 102
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 104
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 105
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static allOf(Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 116
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 117
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 120
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 122
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static allOf(Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 133
    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 134
    invoke-interface {v0, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 136
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 137
    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 138
    invoke-interface {v0, p4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 139
    invoke-interface {v0, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    invoke-static {v0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static varargs allOf([Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 60
    invoke-static {p0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lorg/hamcrest/core/AllOf;->allOf(Ljava/lang/Iterable;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 4

    .line 38
    iget-object v0, p0, Lorg/hamcrest/core/AllOf;->matchers:Ljava/lang/Iterable;

    const-string v1, "("

    const-string v2, " and "

    const-string v3, ")"

    invoke-interface {p1, v1, v2, v3, v0}, Lorg/hamcrest/Description;->appendList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Lorg/hamcrest/Description;

    return-void
.end method

.method public matches(Ljava/lang/Object;Lorg/hamcrest/Description;)Z
    .locals 3

    .line 26
    iget-object v0, p0, Lorg/hamcrest/core/AllOf;->matchers:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/hamcrest/Matcher;

    .line 27
    invoke-interface {v1, p1}, Lorg/hamcrest/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 28
    invoke-interface {p2, v1}, Lorg/hamcrest/Description;->appendDescriptionOf(Lorg/hamcrest/SelfDescribing;)Lorg/hamcrest/Description;

    move-result-object v0

    const-string v2, " "

    invoke-interface {v0, v2}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    .line 29
    invoke-interface {v1, p1, p2}, Lorg/hamcrest/Matcher;->describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method
