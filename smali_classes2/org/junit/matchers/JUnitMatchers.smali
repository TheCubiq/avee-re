.class public Lorg/junit/matchers/JUnitMatchers;
.super Ljava/lang/Object;
.source "JUnitMatchers.java"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static both(Lorg/hamcrest/Matcher;)Lorg/hamcrest/core/CombinableMatcher$CombinableBothMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/core/CombinableMatcher$CombinableBothMatcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 82
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->both(Lorg/hamcrest/Matcher;)Lorg/hamcrest/core/CombinableMatcher$CombinableBothMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static containsString(Ljava/lang/String;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 69
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->containsString(Ljava/lang/String;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static either(Lorg/hamcrest/Matcher;)Lorg/hamcrest/core/CombinableMatcher$CombinableEitherMatcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "-TT;>;)",
            "Lorg/hamcrest/core/CombinableMatcher$CombinableEitherMatcher<",
            "TT;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 95
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->either(Lorg/hamcrest/Matcher;)Lorg/hamcrest/core/CombinableMatcher$CombinableEitherMatcher;

    move-result-object p0

    return-object p0
.end method

.method public static everyItem(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Iterable<",
            "TT;>;>;"
        }
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 60
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->everyItem(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static hasItem(Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 22
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->hasItem(Ljava/lang/Object;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static hasItem(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 31
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->hasItem(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static varargs hasItems([Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 40
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->hasItems([Ljava/lang/Object;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static varargs hasItems([Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
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

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 51
    invoke-static {p0}, Lorg/hamcrest/CoreMatchers;->hasItems([Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static isException(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Exception;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .line 111
    invoke-static {p0}, Lorg/junit/internal/matchers/StacktracePrintingMatcher;->isException(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method

.method public static isThrowable(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Throwable;",
            ">(",
            "Lorg/hamcrest/Matcher<",
            "TT;>;)",
            "Lorg/hamcrest/Matcher<",
            "TT;>;"
        }
    .end annotation

    .line 103
    invoke-static {p0}, Lorg/junit/internal/matchers/StacktracePrintingMatcher;->isThrowable(Lorg/hamcrest/Matcher;)Lorg/hamcrest/Matcher;

    move-result-object p0

    return-object p0
.end method
