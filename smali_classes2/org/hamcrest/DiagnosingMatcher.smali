.class public abstract Lorg/hamcrest/DiagnosingMatcher;
.super Lorg/hamcrest/BaseMatcher;
.source "DiagnosingMatcher.java"


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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 8
    invoke-direct {p0}, Lorg/hamcrest/BaseMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public final describeMismatch(Ljava/lang/Object;Lorg/hamcrest/Description;)V
    .locals 0

    .line 17
    invoke-virtual {p0, p1, p2}, Lorg/hamcrest/DiagnosingMatcher;->matches(Ljava/lang/Object;Lorg/hamcrest/Description;)Z

    return-void
.end method

.method public final matches(Ljava/lang/Object;)Z
    .locals 1

    .line 12
    sget-object v0, Lorg/hamcrest/Description;->NONE:Lorg/hamcrest/Description;

    invoke-virtual {p0, p1, v0}, Lorg/hamcrest/DiagnosingMatcher;->matches(Ljava/lang/Object;Lorg/hamcrest/Description;)Z

    move-result p1

    return p1
.end method

.method protected abstract matches(Ljava/lang/Object;Lorg/hamcrest/Description;)Z
.end method
