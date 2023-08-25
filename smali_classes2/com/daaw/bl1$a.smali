.class public final Lcom/daaw/bl1$a;
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
        "Ljava/lang/Object;",
        "Lcom/daaw/nl$b;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/bl1$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/bl1$a;

    invoke-direct {v0}, Lcom/daaw/bl1$a;-><init>()V

    sput-object v0, Lcom/daaw/bl1$a;->q:Lcom/daaw/bl1$a;

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

    check-cast p2, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1, p2}, Lcom/daaw/bl1$a;->d(Ljava/lang/Object;Lcom/daaw/nl$b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljava/lang/Object;Lcom/daaw/nl$b;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p2, Lcom/daaw/al1;

    if-eqz v0, :cond_3

    instance-of v0, p1, Ljava/lang/Integer;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x1

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_1
    if-nez p1, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    :goto_2
    return-object p2

    :cond_3
    return-object p1
.end method
