.class final Lorg/junit/experimental/results/ResultMatchers$4;
.super Lorg/hamcrest/TypeSafeMatcher;
.source "ResultMatchers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/junit/experimental/results/ResultMatchers;->hasFailureContaining(Ljava/lang/String;)Lorg/hamcrest/Matcher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lorg/hamcrest/TypeSafeMatcher<",
        "Lorg/junit/experimental/results/PrintableResult;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic val$string:Ljava/lang/String;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 89
    iput-object p1, p0, Lorg/junit/experimental/results/ResultMatchers$4;->val$string:Ljava/lang/String;

    invoke-direct {p0}, Lorg/hamcrest/TypeSafeMatcher;-><init>()V

    return-void
.end method


# virtual methods
.method public describeTo(Lorg/hamcrest/Description;)V
    .locals 2

    .line 96
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "has failure containing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lorg/junit/experimental/results/ResultMatchers$4;->val$string:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Lorg/hamcrest/Description;->appendText(Ljava/lang/String;)Lorg/hamcrest/Description;

    return-void
.end method

.method public bridge synthetic matchesSafely(Ljava/lang/Object;)Z
    .locals 0

    .line 89
    check-cast p1, Lorg/junit/experimental/results/PrintableResult;

    invoke-virtual {p0, p1}, Lorg/junit/experimental/results/ResultMatchers$4;->matchesSafely(Lorg/junit/experimental/results/PrintableResult;)Z

    move-result p1

    return p1
.end method

.method public matchesSafely(Lorg/junit/experimental/results/PrintableResult;)Z
    .locals 1

    .line 92
    invoke-virtual {p1}, Lorg/junit/experimental/results/PrintableResult;->failureCount()I

    move-result v0

    if-lez v0, :cond_0

    invoke-virtual {p1}, Lorg/junit/experimental/results/PrintableResult;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lorg/junit/experimental/results/ResultMatchers$4;->val$string:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
