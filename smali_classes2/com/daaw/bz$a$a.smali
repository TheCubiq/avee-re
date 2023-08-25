.class public final Lcom/daaw/bz$a$a;
.super Lcom/daaw/si0;
.source ""

# interfaces
.implements Lcom/daaw/z40;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/bz$a;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/daaw/si0;",
        "Lcom/daaw/z40<",
        "Lcom/daaw/nl$b;",
        "Lcom/daaw/bz;",
        ">;"
    }
.end annotation


# static fields
.field public static final q:Lcom/daaw/bz$a$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/bz$a$a;

    invoke-direct {v0}, Lcom/daaw/bz$a$a;-><init>()V

    sput-object v0, Lcom/daaw/bz$a$a;->q:Lcom/daaw/bz$a$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/daaw/si0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/daaw/nl$b;

    invoke-virtual {p0, p1}, Lcom/daaw/bz$a$a;->d(Lcom/daaw/nl$b;)Lcom/daaw/bz;

    move-result-object p1

    return-object p1
.end method

.method public final d(Lcom/daaw/nl$b;)Lcom/daaw/bz;
    .locals 1

    instance-of v0, p1, Lcom/daaw/bz;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/daaw/bz;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method
