.class public final Lcom/daaw/bl1$b;
.super Lcom/daaw/si0;
.source ""

# interfaces
.implements Lcom/daaw/n50;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/bl1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/si0;",
        "Lcom/daaw/n50<",
        "Lcom/daaw/al1<",
        "*>;",
        "Lcom/daaw/nl$b;",
        "Lcom/daaw/al1<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/bl1$b;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/bl1$b;

    invoke-direct {v0}, Lcom/daaw/bl1$b;-><init>()V

    sput-object v0, Lcom/daaw/bl1$b;->q:Lcom/daaw/bl1$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lcom/daaw/si0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/al1;

    check-cast p2, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/bl1$b;->d(Lcom/daaw/al1;Lcom/daaw/nl$b;)Lcom/daaw/al1;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/al1;Lcom/daaw/nl$b;)Lcom/daaw/al1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/al1<",
            "*>;",
            "Lcom/daaw/nl$b;",
            ")",
            "Lcom/daaw/al1<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lcom/daaw/al1;

    if-eqz p1, :cond_1

    check-cast p2, Lcom/daaw/al1;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method
