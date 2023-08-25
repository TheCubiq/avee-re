.class public final synthetic Lcom/daaw/r16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/r16;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/r16;

    invoke-direct {v0}, Lcom/daaw/r16;-><init>()V

    sput-object v0, Lcom/daaw/r16;->a:Lcom/daaw/r16;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/s16;

    invoke-direct {v0, p1}, Lcom/daaw/s16;-><init>(Ljava/util/ArrayList;)V

    return-object v0
.end method
