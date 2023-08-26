.class public Lorg/hamcrest/core/StringEndsWith;
.super Lorg/hamcrest/core/SubstringMatcher;
.source "StringEndsWith.java"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 13
    invoke-direct {p0, p1}, Lorg/hamcrest/core/SubstringMatcher;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public static endsWith(Ljava/lang/String;)Lorg/hamcrest/Matcher;
    .locals 1
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

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 38
    new-instance v0, Lorg/hamcrest/core/StringEndsWith;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/StringEndsWith;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected evalSubstringOf(Ljava/lang/String;)Z
    .locals 1

    .line 18
    iget-object v0, p0, Lorg/hamcrest/core/StringEndsWith;->substring:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method protected relationship()Ljava/lang/String;
    .locals 1

    const-string v0, "ending with"

    return-object v0
.end method
