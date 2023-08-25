.class public final Lcom/daaw/bl1;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/daaw/pi1;

.field public static final b:Lcom/daaw/n50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/n50<",
            "Ljava/lang/Object;",
            "Lcom/daaw/nl$b;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lcom/daaw/n50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/n50<",
            "Lcom/daaw/al1<",
            "*>;",
            "Lcom/daaw/nl$b;",
            "Lcom/daaw/al1<",
            "*>;>;"
        }
    .end annotation
.end field

.field public static final d:Lcom/daaw/n50;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/n50<",
            "Lcom/daaw/fl1;",
            "Lcom/daaw/nl$b;",
            "Lcom/daaw/fl1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/pi1;

    const-string v1, "NO_THREAD_ELEMENTS"

    invoke-direct {v0, v1}, Lcom/daaw/pi1;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    sget-object v0, Lcom/daaw/bl1$a;->q:Lcom/daaw/bl1$a;

    sput-object v0, Lcom/daaw/bl1;->b:Lcom/daaw/n50;

    sget-object v0, Lcom/daaw/bl1$b;->q:Lcom/daaw/bl1$b;

    sput-object v0, Lcom/daaw/bl1;->c:Lcom/daaw/n50;

    sget-object v0, Lcom/daaw/bl1$c;->q:Lcom/daaw/bl1$c;

    sput-object v0, Lcom/daaw/bl1;->d:Lcom/daaw/n50;

    return-void
.end method

.method public static final a(Lcom/daaw/nl;Ljava/lang/Object;)V
    .locals 2

    sget-object v0, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Lcom/daaw/fl1;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/daaw/fl1;

    invoke-virtual {p1, p0}, Lcom/daaw/fl1;->b(Lcom/daaw/nl;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    sget-object v1, Lcom/daaw/bl1;->c:Lcom/daaw/n50;

    invoke-interface {p0, v0, v1}, Lcom/daaw/nl;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>"

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    check-cast v0, Lcom/daaw/al1;

    invoke-interface {v0, p0, p1}, Lcom/daaw/al1;->u(Lcom/daaw/nl;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public static final b(Lcom/daaw/nl;)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Lcom/daaw/bl1;->b:Lcom/daaw/n50;

    invoke-interface {p0, v0, v1}, Lcom/daaw/nl;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lcom/daaw/ug0;->c(Ljava/lang/Object;)V

    return-object p0
.end method

.method public static final c(Lcom/daaw/nl;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    invoke-static {p0}, Lcom/daaw/bl1;->b(Lcom/daaw/nl;)Ljava/lang/Object;

    move-result-object p1

    :cond_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-ne p1, v0, :cond_1

    sget-object p0, Lcom/daaw/bl1;->a:Lcom/daaw/pi1;

    goto :goto_0

    :cond_1
    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/daaw/fl1;

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-direct {v0, p0, p1}, Lcom/daaw/fl1;-><init>(Lcom/daaw/nl;I)V

    sget-object p1, Lcom/daaw/bl1;->d:Lcom/daaw/n50;

    invoke-interface {p0, v0, p1}, Lcom/daaw/nl;->fold(Ljava/lang/Object;Lcom/daaw/n50;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    check-cast p1, Lcom/daaw/al1;

    invoke-interface {p1, p0}, Lcom/daaw/al1;->n(Lcom/daaw/nl;)Ljava/lang/Object;

    move-result-object p0

    :goto_0
    return-object p0
.end method
