.class public final Lcom/daaw/bl1$c;
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
        "Lcom/daaw/fl1;",
        "Lcom/daaw/nl$b;",
        "Lcom/daaw/fl1;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/bl1$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/bl1$c;

    invoke-direct {v0}, Lcom/daaw/bl1$c;-><init>()V

    sput-object v0, Lcom/daaw/bl1$c;->q:Lcom/daaw/bl1$c;

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

    check-cast p1, Lcom/daaw/fl1;

    check-cast p2, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/bl1$c;->d(Lcom/daaw/fl1;Lcom/daaw/nl$b;)Lcom/daaw/fl1;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/fl1;Lcom/daaw/nl$b;)Lcom/daaw/fl1;
    .locals 1

    instance-of v0, p2, Lcom/daaw/al1;

    if-eqz v0, :cond_0

    check-cast p2, Lcom/daaw/al1;

    iget-object v0, p1, Lcom/daaw/fl1;->a:Lcom/daaw/nl;

    invoke-interface {p2, v0}, Lcom/daaw/al1;->n(Lcom/daaw/nl;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/daaw/fl1;->a(Lcom/daaw/al1;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method
