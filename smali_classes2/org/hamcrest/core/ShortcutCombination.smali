.class abstract Lorg/hamcrest/core/ShortcutCombination;
.super Lorg/hamcrest/BaseMatcher;
.source "ShortcutCombination.java"


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

    .line 11
    invoke-direct {p0}, Lorg/hamcrest/BaseMatcher;-><init>()V

    .line 12
    iput-object p1, p0, Lorg/hamcrest/core/ShortcutCombination;->matchers:Ljava/lang/Iterable;

    return-void
.end method


# virtual methods
.method public abstract describeTo(Lorg/hamcrest/Description;)V
.end method

.method public describeTo(Lorg/hamcrest/Description;Ljava/lang/String;)V
    .locals 3

    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    iget-object v0, p0, Lorg/hamcrest/core/ShortcutCombination;->matchers:Ljava/lang/Iterable;

    const-string v1, "("

    const-string v2, ")"

    invoke-interface {p1, v1, p2, v2, v0}, Lorg/hamcrest/Description;->appendList(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Iterable;)Lorg/hamcrest/Description;

    return-void
.end method

.method public abstract matches(Ljava/lang/Object;)Z
.end method

.method protected matches(Ljava/lang/Object;Z)Z
    .locals 2

    .line 22
    iget-object v0, p0, Lorg/hamcrest/core/ShortcutCombination;->matchers:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/hamcrest/Matcher;

    .line 23
    invoke-interface {v1, p1}, Lorg/hamcrest/Matcher;->matches(Ljava/lang/Object;)Z

    move-result v1

    if-ne v1, p2, :cond_0

    return p2

    :cond_1
    xor-int/lit8 p1, p2, 0x1

    return p1
.end method
