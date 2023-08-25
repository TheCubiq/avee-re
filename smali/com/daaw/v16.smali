.class public final synthetic Lcom/daaw/v16;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/ey6;


# static fields
.field public static final synthetic a:Lcom/daaw/v16;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/v16;

    invoke-direct {v0}, Lcom/daaw/v16;-><init>()V

    sput-object v0, Lcom/daaw/v16;->a:Lcom/daaw/v16;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Lcom/daaw/m5;

    new-instance v0, Lcom/daaw/z16;

    invoke-virtual {p1}, Lcom/daaw/m5;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/daaw/m5;->b()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/daaw/z16;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method
