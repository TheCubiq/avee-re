.class public final synthetic Lcom/daaw/iu8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/iu8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/iu8;

    invoke-direct {v0}, Lcom/daaw/iu8;-><init>()V

    sput-object v0, Lcom/daaw/iu8;->p:Lcom/daaw/iu8;

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

    check-cast p1, Lcom/daaw/f92;

    check-cast p2, Lcom/daaw/f92;

    iget p2, p2, Lcom/daaw/f92;->h:I

    iget p1, p1, Lcom/daaw/f92;->h:I

    sub-int/2addr p2, p1

    return p2
.end method
