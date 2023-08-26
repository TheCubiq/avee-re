.class public Lorg/hamcrest/core/IsSame;
.super Lorg/hamcrest/BaseMatcher;
.source "IsSame.java"


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
.field private final object:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 17
    invoke-direct {p0}, Lorg/hamcrest/BaseMatcher;-><init>()V

    .line 18
    iput-object p1, p0, Lorg/hamcrest/core/IsSame;->object:Ljava/lang/Object;

    return-void
.end method

.method public static sameInstance(Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 1
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

    .line 42
    new-instance v0, Lorg/hamcrest/core/IsSame;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/IsSame;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static theInstance(Ljava/lang/Object;)Lorg/hamcrest/Matcher;
    .locals 1
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

    .line 54
    new-instance v0, Lorg/hamcrest/core/IsSame;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/IsSame;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method


# virtual methods
.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 1

    const-string v0, "sameInstance("

    .line 28
    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    move-result-object p1

    iget-object v0, p0, Lorg/hamcrest/core/IsSame;->object:Ljava/lang/Object;

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendValue(Ljava/lang/Object;)Lorg/hamcrest/Description;

    move-result-object p1

    const-string v0, ")"

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    return-void
.end method

.method public matches(Ljava/lang/Object;)Z
    .locals 1

    .line 23
    iget-object v0, p0, Lorg/hamcrest/core/IsSame;->object:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
