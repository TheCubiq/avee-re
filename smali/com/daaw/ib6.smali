.class public final synthetic Lcom/daaw/ib6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/ib6;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/ib6;

    invoke-direct {v0}, Lcom/daaw/ib6;-><init>()V

    sput-object v0, Lcom/daaw/ib6;->a:Lcom/daaw/ib6;

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

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Lcom/daaw/lb6;

    invoke-direct {v0, p1}, Lcom/daaw/lb6;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
