.class public final synthetic Lcom/daaw/cx8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# static fields
.field public static final synthetic p:Lcom/daaw/cx8;


# direct methods
.method public static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/daaw/cx8;

    invoke-direct {v0}, Lcom/daaw/cx8;-><init>()V

    sput-object v0, Lcom/daaw/cx8;->p:Lcom/daaw/cx8;

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

    check-cast p1, Lcom/daaw/lx8;

    check-cast p2, Lcom/daaw/lx8;

    iget p1, p1, Lcom/daaw/lx8;->a:I

    iget p2, p2, Lcom/daaw/lx8;->a:I

    sub-int/2addr p1, p2

    return p1
.end method
