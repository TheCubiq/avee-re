.class public final synthetic Lcom/daaw/v20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/v20;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/v20;

    invoke-direct {v0}, Lcom/daaw/v20;-><init>()V

    sput-object v0, Lcom/daaw/v20;->p:Lcom/daaw/v20;

    return-void
.end method

.method public synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [B

    check-cast p2, [B

    invoke-static {p1, p2}, Lcom/daaw/w20;->a([B[B)I

    move-result p1

    return p1
.end method
