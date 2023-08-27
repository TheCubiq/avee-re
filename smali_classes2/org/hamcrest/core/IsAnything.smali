.class public Lorg/hamcrest/core/IsAnything;
.super Lorg/hamcrest/BaseMatcher;
.source "IsAnything.java"


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
.field private final message:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    const-string v0, "ANYTHING"

    .line 19
    invoke-direct {p0, v0}, Lorg/hamcrest/core/IsAnything;-><init>(Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 22
    invoke-direct {p0}, Lorg/hamcrest/BaseMatcher;-><init>()V

    .line 23
    iput-object p1, p0, Lorg/hamcrest/core/IsAnything;->message:Ljava/lang/String;

    return-void
.end method

.method public static anything()Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 41
    new-instance v0, Lorg/hamcrest/core/IsAnything;

    invoke-direct {v0}, Lorg/hamcrest/core/IsAnything;-><init>()V

    return-object v0
.end method

.method public static anything(Ljava/lang/String;)Lorg/hamcrest/Matcher;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lorg/hamcrest/Matcher<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .annotation runtime Lorg/hamcrest/Factory;
    .end annotation

    .line 53
    new-instance v0, Lorg/hamcrest/core/IsAnything;

    invoke-direct {v0, p0}, Lorg/hamcrest/core/IsAnything;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 1

    .line 33
    iget-object v0, p0, Lorg/hamcrest/core/IsAnything;->message:Ljava/lang/String;

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    return-void
.end method

.method public matches(Ljava/lang/Object;)Z
    .locals 0

    const/4 p1, 0x1

    return p1
.end method
