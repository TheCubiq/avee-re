.class public Lorg/junit/internal/matchers/ThrowableMessageMatcher;
.super Lorg/hamcrest/TypeSafeMatcher;
.source "ThrowableMessageMatcher.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Throwable;",
        ">",
        "Lorg/hamcrest/TypeSafeMatcher<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final matcher:Lorg/hamcrest/Matcher;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/String;",
            ">;"
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
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 13
    invoke-direct {p0}, Lorg/hamcrest/TypeSafeMatcher;-><init>()V

    .line 14
    iput-object p1, p0, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->matcher:Lorg/hamcrest/Matcher;

    return-void
.end method

.method public static hasMessage(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/String;",
            ">;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 35
    new-instance v0, Lorg/junit/internal/matchers/ThrowableMessageMatcher;

    invoke-direct {v0, p0}, Lorg/junit/internal/matchers/ThrowableMessageMatcher;-><init>(Lorg/hamcrest/Matcher;)V

    return-object v0
.end method


# virtual methods
.method protected bridge synthetic describeMismatchSafely(Ljava/lang/Object;Lorg/hamcrest/Description;)V
    .locals 0

    .line 8
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1, p2}, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->describeMismatchSafely(Ljava/lang/Throwable;Lorg/hamcrest/Description;)V

    return-void
.end method

.method protected describeMismatchSafely(Ljava/lang/Throwable;Lorg/hamcrest/Description;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lorg/hamcrest/Description;",
            ")V"
        }
    .end annotation

    const-string v0, "message "

    .line 29
    invoke-interface {p2, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    .line 30
    iget-object v0, p0, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->matcher:Lorg/hamcrest/Matcher;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lorg/hamcrest/Matcher;->describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V

    return-void
.end method

.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 1

    const-string v0, "exception with message "

    .line 18
    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    .line 19
    iget-object v0, p0, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->matcher:Lorg/hamcrest/Matcher;

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendDescriptionOf(Lorg/hamcrest/SelfDescribing;)Lorg/hamcrest/Description;

    return-void
.end method

.method protected bridge synthetic matchesSafely(Ljava/lang/Object;)Z
    .locals 0

    .line 8
    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->matchesSafely(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method protected matchesSafely(Ljava/lang/Throwable;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .line 24
    iget-object v0, p0, Lorg/junit/internal/matchers/ThrowableMessageMatcher;->matcher:Lorg/hamcrest/Matcher;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lorg/hamcrest/Matcher;->matches(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
