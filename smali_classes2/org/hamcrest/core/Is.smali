.class public Lorg/hamcrest/core/Is;
.super Lorg/hamcrest/BaseMatcher;
.source "Is.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lorg/hamcrest/BaseMatcher<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final matcher:Lorg/hamcrest/Matcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
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
            "TT;>;)V"
        }
    .end annotation

    .line 21
    invoke-direct {p0}, Lorg/hamcrest/BaseMatcher;-><init>()V

    .line 22
    iput-object p1, p0, Lorg/hamcrest/core/Is;->matcher:Lorg/hamcrest/Matcher;

    return-void
.end method

.method public static is(Ljava/lang/Class;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 82
    invoke-static {p0}, Lorg/hamcrest/core/IsInstanceOf;->instanceOf(Ljava/lang/Class;)Lorg/hamcrest/Matcher;

    move-result-object p0

    .line 83
    invoke-static {p0}, Lorg/hamcrest/core/Is;->is(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static is(Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 66
    invoke-static {p0}, Lorg/hamcrest/core/IsEqual;->equalTo(Ljava/lang/Object;)Lorg/hamcrest/Matcher;

    move-result-object p0

    invoke-static {p0}, Lorg/hamcrest/core/Is;->is(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static is(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 52
    new-instance v0, Lorg/hamcrest/core/Is;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/Is;-><init>(Lorg/hamcrest/Matcher;)V

    return-object v0
.end method

.method public static isA(Ljava/lang/Class;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 97
    invoke-static {p0}, Lorg/hamcrest/core/IsInstanceOf;->instanceOf(Ljava/lang/Class;)Lorg/hamcrest/Matcher;

    move-result-object p0

    .line 98
    invoke-static {p0}, Lorg/hamcrest/core/Is;->is(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V
    .locals 1

    .line 37
    iget-object v0, p0, Lorg/hamcrest/core/Is;->matcher:Lorg/hamcrest/Matcher;

    invoke-interface {v0, p1, p2}, Lorg/hamcrest/Matcher;->describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V

    return-void
.end method

.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 1

    const-string v0, "is "

    .line 32
    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    move-result-object p1

    iget-object v0, p0, Lorg/hamcrest/core/Is;->matcher:Lorg/hamcrest/Matcher;

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendDescriptionOf(Lorg/hamcrest/SelfDescribing;)Lorg/hamcrest/Description;

    return-void
.end method

.method public matches(Ljava/lang/Object;)Z
    .locals 1

    .line 27
    iget-object v0, p0, Lorg/hamcrest/core/Is;->matcher:Lorg/hamcrest/Matcher;

    invoke-interface {v0, p1}, Lorg/hamcrest/Matcher;->matches(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
